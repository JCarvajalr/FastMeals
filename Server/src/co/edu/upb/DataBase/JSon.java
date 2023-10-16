package co.edu.upb.DataBase;

import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import java.io.*;
import java.util.Iterator;

import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import com.google.gson.*;

public class JSon<T extends Serializable> {

    LinkedList<T> list;
    private final String nombreArchivoJson;
    private final Class<T> inClass;

    public JSon(String nombreArchivoJson, Class inClass) {
        this.nombreArchivoJson = nombreArchivoJson;
        this.list = new LinkedList<>();
        this.inClass = inClass;
    }

    public void cargarJSon() {
        File file = new File(nombreArchivoJson);
        if (file.exists()){
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                StringBuilder jsonText = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    jsonText.append(line);
                }
                bufferedReader.close();
                Gson gson = new Gson();
                JsonArray jsonArray = JsonParser.parseString(jsonText.toString()).getAsJsonArray();

                for (JsonElement jsonElement : jsonArray) {
                    T objeto = gson.fromJson(jsonElement, inClass);
                    list.add(objeto);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarDatosEnJSon() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray jsonArray = new JsonArray();
        Iterator<NodeInterface<T>> iterator = list.iterator();
        T temp;
        while (iterator.hasNext()) {
            temp = iterator.next().getObject();
            jsonArray.add(gson.toJsonTree(temp, inClass));
        }
        try (FileWriter fileWriter = new FileWriter(nombreArchivoJson)) {
            fileWriter.write(gson.toJson(jsonArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<T> getList() {
        return this.list;
    }

    public boolean addObject(T object){
        return list.add(object);
    }



}

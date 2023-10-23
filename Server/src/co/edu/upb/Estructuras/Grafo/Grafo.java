package co.edu.upb.Estructuras.Grafo;

import co.edu.upb.Estructuras.Cola.ColaPrioridad;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.LinkedList;
import co.edu.upb.Estructuras.ListaEnlazadaDoble.Inferface.NodeInterface;
import java.util.Iterator;


public class Grafo {
    private LinkedList<NodoGrafo> grafo;

    public Grafo() {
        this.grafo = new LinkedList<>();
        cargarGrafo();
    }

    public LinkedList<NodoGrafo> getGrafo() {
        return grafo;
    }

    private void cargarGrafo() {
        // Restaurante = 33 (Cañaveral)
        //CREAR LOS NODOS
        NodoGrafo elPrado = new NodoGrafo(0, "El Prado");
        NodoGrafo estadio = new NodoGrafo(1, "Estadio");
        NodoGrafo sanAlonso = new NodoGrafo(2, "San Alonso");
        NodoGrafo sanFrancisco = new NodoGrafo(3, "San Francisco");
        NodoGrafo carrera15 = new NodoGrafo(4, "Carrera 15");
        NodoGrafo girardot = new NodoGrafo(5, "Girardot");
        NodoGrafo carrera9 = new NodoGrafo(6, "Carrera 9");
        NodoGrafo puenteLaNovena = new NodoGrafo(7, "Puente la Novena");
        NodoGrafo laConcordia = new NodoGrafo(8, "La Concordia");
        NodoGrafo nuevoSotomayor = new NodoGrafo(9, "Nuevo Sotomayor");
        NodoGrafo centroDeBucaramanga = new NodoGrafo(10, "Centro de Bucaramanga");
        NodoGrafo carrera27 = new NodoGrafo(11, "Carrera 27");
        NodoGrafo sotomayor = new NodoGrafo(12, "Sotomayor");
        NodoGrafo laAurora = new NodoGrafo(13, "La Aurora");
        NodoGrafo cabeceraDelLlano = new NodoGrafo(14, "Cabecera del Llano");
        NodoGrafo terrazas = new NodoGrafo(15, "Terrazas");
        NodoGrafo carrera33 = new NodoGrafo(16, "Carrera 33");
        NodoGrafo lagosDelCacique = new NodoGrafo(17, "Lagos Del Cacique");
        NodoGrafo altosDelCacique = new NodoGrafo(18, "Altos Del Cacique");
        NodoGrafo cacique = new NodoGrafo(19, "Cacique");
        NodoGrafo diamanteI = new NodoGrafo(20, "Diamante I");
        NodoGrafo puenteProvenza = new NodoGrafo(21, "Puente Provenza");
        NodoGrafo provenza = new NodoGrafo(22, "Provenza");
        NodoGrafo diamanteII = new NodoGrafo(23, "Diamante II");
        NodoGrafo sanLuis = new NodoGrafo(24, "San Luis");
        NodoGrafo laIsla = new NodoGrafo(25, "La Isla");
        NodoGrafo realDeMinas = new NodoGrafo(26, "Real De Minas");
        NodoGrafo mutis = new NodoGrafo(27, "Mutis");
        NodoGrafo laJoya = new NodoGrafo(28, "La Joya");
        NodoGrafo ciudadela = new NodoGrafo(29, "Ciudadela");
        NodoGrafo giron = new NodoGrafo(30, "Giron");
        NodoGrafo lasLlaves = new NodoGrafo(31, "Las Llaves");
        NodoGrafo elBosque = new NodoGrafo(32, "El Bosque");
        NodoGrafo cañaveralRestaurante = new NodoGrafo(33, "Cañaveral Restaurante");
        NodoGrafo plazaSatelite = new NodoGrafo(34, "Plaza Satelite");
        NodoGrafo cumbre = new NodoGrafo(35, "Cumbre");
        NodoGrafo bucarica = new NodoGrafo(36, "Bucarica");
        NodoGrafo lagosDeFloridablanca = new NodoGrafo(37, "Lagos De Floridablanca");
        NodoGrafo clubCampestre = new NodoGrafo(38, "Club Campestre");
        NodoGrafo sanJuanDeGiron = new NodoGrafo(39, "San Juan de Giron");
        NodoGrafo villaDeLosAlpes = new NodoGrafo(40, "Villa de los Alpes");
        NodoGrafo anilloVial = new NodoGrafo(41, "Anillo Vial");
        NodoGrafo calle200 = new NodoGrafo(42, "Calle 200");
        NodoGrafo papiqueropiña = new NodoGrafo(43, "Papiqueropiña");
        NodoGrafo floridablanca = new NodoGrafo(44, "Floridablanca");
        NodoGrafo villabel = new NodoGrafo(45, "Villabel");
        NodoGrafo abadiasCondominio = new NodoGrafo(46, "Abadias Condominio");
        NodoGrafo deLaCuesta = new NodoGrafo(47, "De La Cuesta");
        NodoGrafo paseoDelPuente = new NodoGrafo(48, "Paseo Del Puente");

// AÑADIR CONEXIONES
        elPrado.addConexion(terrazas, 10);
        elPrado.addConexion(cabeceraDelLlano, 8);
        elPrado.addConexion(estadio, 5);

        terrazas.addConexion(elPrado, 9);
        terrazas.addConexion(cabeceraDelLlano, 7);

        cabeceraDelLlano.addConexion(elPrado, 3);
        cabeceraDelLlano.addConexion(estadio, 4);
        cabeceraDelLlano.addConexion(cabeceraDelLlano, 1);

        estadio.addConexion(terrazas, 2);
        estadio.addConexion(sanAlonso, 6);

        sanAlonso.addConexion(laAurora, 8);
        sanAlonso.addConexion(sanFrancisco, 9);

        laAurora.addConexion(cabeceraDelLlano, 4);
        laAurora.addConexion(sotomayor, 5);

        cabeceraDelLlano.addConexion(sotomayor, 10);
        cabeceraDelLlano.addConexion(carrera33, 2);

        sotomayor.addConexion(carrera27, 3);

        carrera27.addConexion(nuevoSotomayor, 7);
        carrera27.addConexion(centroDeBucaramanga, 5);

        sanFrancisco.addConexion(centroDeBucaramanga, 4);
        sanFrancisco.addConexion(carrera15, 6);

        centroDeBucaramanga.addConexion(carrera15, 1);
        centroDeBucaramanga.addConexion(laConcordia, 7);

        nuevoSotomayor.addConexion(laConcordia, 2);

        laConcordia.addConexion(laIsla, 3);
        laConcordia.addConexion(puenteLaNovena, 1);

        carrera15.addConexion(girardot, 9);

        girardot.addConexion(carrera9, 8);

        carrera9.addConexion(puenteLaNovena, 5);

        laIsla.addConexion(realDeMinas, 3);

        puenteLaNovena.addConexion(realDeMinas, 4);
        puenteLaNovena.addConexion(mutis, 2);

        mutis.addConexion(laJoya, 6);

        laJoya.addConexion(realDeMinas, 4);

        realDeMinas.addConexion(ciudadela, 10);

        carrera33.addConexion(cacique, 7);

        cacique.addConexion(lagosDelCacique, 9);
        cacique.addConexion(diamanteI, 10);

        altosDelCacique.addConexion(cacique, 8);
        altosDelCacique.addConexion(diamanteI, 7);

        diamanteI.addConexion(puenteProvenza, 4);

        carrera27.addConexion(puenteProvenza, 1);

        puenteProvenza.addConexion(provenza, 6);

        provenza.addConexion(diamanteII, 2);
        provenza.addConexion(sanLuis, 8);

        sanLuis.addConexion(giron, 3);
        ciudadela.addConexion(giron, 2);

        provenza.addConexion(giron, 1);

        puenteProvenza.addConexion(cañaveralRestaurante, 3);

        cañaveralRestaurante.addConexion(lasLlaves, 6);

        lasLlaves.addConexion(elBosque, 1);

        elBosque.addConexion(clubCampestre, 7);

        cañaveralRestaurante.addConexion(lagosDeFloridablanca, 8);

        elBosque.addConexion(lagosDeFloridablanca, 3);

        lagosDeFloridablanca.addConexion(papiqueropiña, 4);

        cacique.addConexion(plazaSatelite, 5);

        plazaSatelite.addConexion(cumbre, 3);

        cumbre.addConexion(bucarica, 5);

        bucarica.addConexion(villabel, 7);

        cumbre.addConexion(floridablanca, 10);

        villabel.addConexion(floridablanca, 2);
        floridablanca.addConexion(papiqueropiña, 5);

        floridablanca.addConexion(abadiasCondominio, 4);

        abadiasCondominio.addConexion(papiqueropiña, 9);

        papiqueropiña.addConexion(calle200, 4);

        calle200.addConexion(anilloVial, 8);

        anilloVial.addConexion(giron, 1);

        giron.addConexion(sanJuanDeGiron, 3);
        giron.addConexion(villaDeLosAlpes, 6);

        sanJuanDeGiron.addConexion(villaDeLosAlpes, 2);

        papiqueropiña.addConexion(deLaCuesta, 10);
        deLaCuesta.addConexion(paseoDelPuente, 1);


        //AÑADIR LOS NODOS AL GRAFO
        grafo.add(elPrado);
        grafo.add(estadio);
        grafo.add(sanAlonso);
        grafo.add(sanFrancisco);
        grafo.add(carrera15);
        grafo.add(girardot);
        grafo.add(carrera9);
        grafo.add(puenteLaNovena);
        grafo.add(laConcordia);
        grafo.add(nuevoSotomayor);
        grafo.add(centroDeBucaramanga);
        grafo.add(carrera27);
        grafo.add(sotomayor);
        grafo.add(laAurora);
        grafo.add(cabeceraDelLlano);
        grafo.add(terrazas);
        grafo.add(carrera33);
        grafo.add(lagosDelCacique);
        grafo.add(altosDelCacique);
        grafo.add(cacique);
        grafo.add(diamanteI);
        grafo.add(puenteProvenza);
        grafo.add(provenza);
        grafo.add(diamanteII);
        grafo.add(sanLuis);
        grafo.add(laIsla);
        grafo.add(realDeMinas);
        grafo.add(mutis);
        grafo.add(laJoya);
        grafo.add(ciudadela);
        grafo.add(giron);
        grafo.add(lasLlaves);
        grafo.add(elBosque);
        grafo.add(cañaveralRestaurante);
        grafo.add(plazaSatelite);
        grafo.add(cumbre);
        grafo.add(bucarica);
        grafo.add(lagosDeFloridablanca);
        grafo.add(clubCampestre);
        grafo.add(sanJuanDeGiron);
        grafo.add(villaDeLosAlpes);
        grafo.add(anilloVial);
        grafo.add(calle200);
        grafo.add(papiqueropiña);
        grafo.add(floridablanca);
        grafo.add(villabel);
        grafo.add(abadiasCondominio);
        grafo.add(deLaCuesta);
        grafo.add(paseoDelPuente);
    }

    public String calcularRutaMasCorta(int from, int to) {
        try {
            NodoGrafo nodoActual = null;

            Iterator<NodeInterface<NodoGrafo>> iterador = grafo.iterator();

            // Buscar el nodo de inicio
            while (iterador.hasNext()) {
                NodoGrafo nodo = iterador.next().getObject();
                if (nodo.getIndice() == from) {
                    nodoActual = nodo;
                    break;  // Termina la búsqueda si se encuentra el nodo de inicio
                }
            }

            // Comprobar si el nodo de inicio se encontró
            if (nodoActual == null) {
                return "Nodo de inicio no válido";
            }

            // Restablecer el estado de visitado de todos los nodos
            resetearEstadoDeVisita();

            StringBuilder rutaMasCorta = new StringBuilder();
            rutaMasCorta.append(nodoActual.getNombre());

            int distanciaActual = 0;

            ColaPrioridad<NodoGrafo> nodosPendientes = new ColaPrioridad<>(grafo.size());
            nodosPendientes.add(nodoActual, distanciaActual);

            while (nodoActual.getIndice() != to) {  // Buscar hasta llegar al nodo de destino
                int distanciaMinima = Integer.MAX_VALUE;
                NodoGrafo siguienteNodo = null;

                nodoActual.setVisitado(true);

                Iterator<NodeInterface<Arista>> aristas = nodoActual.getConexiones().iterator();

                while (aristas.hasNext()) {
                    Arista arista = aristas.next().getObject();
                    int distancia = distanciaActual + arista.getPeso();

                    if (distancia < distanciaMinima && !arista.getDestino().esVisitado()) {
                        distanciaMinima = distancia;
                        siguienteNodo = arista.getDestino();
                    }
                }

                // Comprobar si se encontró un siguiente nodo válido
                if (siguienteNodo != null) {
                    nodoActual = siguienteNodo;
                    distanciaActual = distanciaMinima;
                    rutaMasCorta.append(" -> ").append(nodoActual.getNombre());
                } else {
                    return "No se encontró una ruta al nodo de destino";
                }
            }

            // Restablecer el estado de visitado para futuras búsquedas
            resetearEstadoDeVisita();

            return rutaMasCorta.toString();
        } catch (Exception e) {
            return "Error al calcular la ruta mas corta: " + e.getMessage();
        }
    }

    public String calcularRutaMasCorta2(String from, String to) {
        try {
            NodoGrafo nodoActual = null;

            Iterator<NodeInterface<NodoGrafo>> iterador = grafo.iterator();

            // Buscar el nodo de inicio
            while (iterador.hasNext()) {
                NodoGrafo nodo = iterador.next().getObject();
                if (nodo.getNombre().equals(from)) {
                    nodoActual = nodo;
                    break;  // Termina la búsqueda si se encuentra el nodo de inicio
                }
            }

            // Comprobar si el nodo de inicio se encontró
            if (nodoActual == null) {
                return "Nodo de inicio no válido";
            }

            // Restablecer el estado de visitado de todos los nodos
            resetearEstadoDeVisita();

            StringBuilder rutaMasCorta = new StringBuilder();
            rutaMasCorta.append(nodoActual.getNombre());

            int distanciaActual = 0;

            //ColaPrioridad<NodoGrafo> nodosPendientes = new ColaPrioridad<>(grafo.size());
            //nodosPendientes.add(nodoActual, distanciaActual);

            while (!nodoActual.getNombre().equals(to)) {  // Buscar hasta llegar al nodo de destino
                int distanciaMinima = Integer.MAX_VALUE;
                NodoGrafo siguienteNodo = null;

                nodoActual.setVisitado(true);

                Iterator<NodeInterface<Arista>> aristas = nodoActual.getConexiones().iterator();

                while (aristas.hasNext()) {
                    Arista arista = aristas.next().getObject();
                    int distancia = distanciaActual + arista.getPeso();

                    if (distancia < distanciaMinima && !arista.getDestino().esVisitado()) {
                        distanciaMinima = distancia;
                        siguienteNodo = arista.getDestino();
                    }
                }

                // Comprobar si se encontró un siguiente nodo válido
                if (siguienteNodo != null) {
                    nodoActual = siguienteNodo;
                    distanciaActual = distanciaMinima;
                    rutaMasCorta.append(" -> ").append(nodoActual.getNombre());
                } else {
                    return "No se encontró una ruta al nodo de destino";
                }
            }

            // Restablecer el estado de visitado para futuras búsquedas
            resetearEstadoDeVisita();

            return rutaMasCorta.toString();
        } catch (Exception e) {
            return "Error al calcular la ruta mas corta: " + e.getMessage();
        }
    }



    // Método para restablecer el estado de visitado en todos los nodos del grafo
    private void resetearEstadoDeVisita() {
        Iterator<NodeInterface<NodoGrafo>> iterador = grafo.iterator();
        while (iterador.hasNext()) {
            NodoGrafo nodo = iterador.next().getObject();
            nodo.setVisitado(false);
        }
    }
}
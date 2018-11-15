package Plantilla;

class AppPlantillas {
    public static void main(String[] args) {
        Fabricante cablesMexico = new Fabricante();
        cablesMexico.leer();    //Se lee un objeto de tipo Fabricante
        /*Se crea a continuación un objeto de tipo Producto, reemplazando el tipo T por un objeto de tipo Fabricante.*/
        Producto<Fabricante> cableTel= new Producto<Fabricante>
                (1050,"Cable telefonico", 100, cablesMexico);
        cableTel.imprime();
        // Enseguida con un proveedor identificado por un entero que reemplaza el tipo T.
        int claProveedor=723;
        Producto<Integer> Caja = new Producto<Integer>
                (2600, "Caja concentradora", 450, claProveedor);
        Caja.imprime();
    }
}
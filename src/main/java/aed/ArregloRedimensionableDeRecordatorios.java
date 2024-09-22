package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] listaRecordatorios;
    
    public ArregloRedimensionableDeRecordatorios() {
        this.listaRecordatorios = new Recordatorio[5];
    }

    public int longitud() {
        int contador = 0;
        for (int i = 0; i < this.listaRecordatorios.length; i++) {
            if (this.listaRecordatorios[i] != null) {
                contador++;
            }
        }
        
        return contador;
    }

    public void agregarAtras(Recordatorio i) {
        if (longitud() == this.listaRecordatorios.length) {
            expandirLista(this.listaRecordatorios);
        }
        this.listaRecordatorios[longitud()] = i;
    }

    private void expandirLista(Recordatorio[] listaRecordatorios) {
        this.listaRecordatorios = new Recordatorio[listaRecordatorios.length*2];
        for (int i = 0; i < listaRecordatorios.length; i++) {
            this.listaRecordatorios[i] = this.listaRecordatorios[i];
        }

    }

    public Recordatorio obtener(int i) {
        //Recordatorio recordatorioDevuelto = new Recordatorio(new String(listaRecordatorios[i].mensaje()), new Fecha(listaRecordatorios[i].fecha()), new Horario(listaRecordatorios[i].horario()));
        //return this.listaRecordatorios[i];
        return new Recordatorio(listaRecordatorios[i]);
       //return recordatorioDevuelto;
    }

    public void quitarAtras() {
        this.listaRecordatorios[longitud()-1] = null;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.listaRecordatorios[indice] = new Recordatorio(valor);
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.listaRecordatorios = new Recordatorio[vector.listaRecordatorios.length*2];
        for (int i = 0; i < vector.listaRecordatorios.length; i++) {
            this.listaRecordatorios[i] = vector.listaRecordatorios[i];
        }
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios listaNueva = new ArregloRedimensionableDeRecordatorios();
        for (int i = 0; i < this.listaRecordatorios.length; i++) {
            listaNueva.listaRecordatorios[i] = this.listaRecordatorios[i];
        }
        return listaNueva;
    }
}

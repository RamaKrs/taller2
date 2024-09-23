package aed;

public class Agenda {
    private ArregloRedimensionableDeRecordatorios lista;
    private Fecha fechaActual;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.lista = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.lista.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String mensajeDevuelto = fechaActual+"\n=====\n"+listarRecordatorios();
        return mensajeDevuelto;
    }

    private String listarRecordatorios() {
        String recordatoriosActuales = "";
        for (int i = 0; i < lista.longitud(); i++) {
            if (lista.obtener(i) != null && lista.obtener(i).fecha().equals(fechaActual)) {
                recordatoriosActuales += lista.obtener(i).toString()+"\n";
            }
        }
        return recordatoriosActuales;
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}

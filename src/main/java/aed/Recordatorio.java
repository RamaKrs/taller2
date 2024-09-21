package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.horario = horario;
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return this.fecha;
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return mensaje()+" @ "+fecha()+" "+horario();
    }

    @Override
    public boolean equals(Object otro) {
        return (otro.getClass() == this.getClass() && ((Recordatorio) otro).mensaje == this.mensaje && ((Recordatorio) otro).fecha == this.fecha && ((Recordatorio) otro).horario == this.horario);
    }

}

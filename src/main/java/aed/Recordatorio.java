package aed;

public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);
        this.horario = new Horario(horario);
    }
    public Recordatorio(Recordatorio recordatorio) {
        this.mensaje = recordatorio.mensaje();
        this.fecha = new Fecha(recordatorio.fecha());
        this.horario = new Horario(recordatorio.horario());
    }

    public Horario horario() {
        return this.horario;
    }

    public Fecha fecha() {
        return new Fecha(fecha);
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

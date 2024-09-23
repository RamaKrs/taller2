package aed;

public class Horario {
    private int hora;
    private int minutos;
    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }
    public Horario(Horario horario) {
        this.hora = horario.hora();
        this.minutos = horario.minutos();
    }

    public int hora() {
        
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        String minutosCorregidos;
        // if (minutos < 10) {
        //     minutosCorregidos = "0"+this.minutos();
        //     return hora+":"+minutosCorregidos;
        // }
        return hora+":"+minutos;
    }

    @Override
    public boolean equals(Object otro) {
        return otro.getClass() == this.getClass() &&
        ((Horario) otro).hora == this.hora &&
        ((Horario) otro).minutos == this.minutos;


    }
}
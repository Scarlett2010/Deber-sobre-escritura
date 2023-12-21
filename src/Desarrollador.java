//Desarrollador
public class Desarrollador extends Empleado{
    private double horas_extra;

    public Desarrollador(String nombre, double salarioBase, double horas_extra) {
        super(nombre, salarioBase);
        this.horas_extra = horas_extra;
    }

    @Override
    public double calcularsalario(){
        return super.calcularsalario() + (horas_extra*getSalarioBase());
    }
}
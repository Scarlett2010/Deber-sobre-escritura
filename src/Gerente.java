//Gerente
public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    @Override
    public double calcularsalario(){
        return super.calcularsalario() + bono;
    }
}

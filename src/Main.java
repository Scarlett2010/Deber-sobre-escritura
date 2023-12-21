class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ana", 850.00);
        Gerente gerente = new Gerente("Alejandro", 800.00, 200.50);
        Desarrollador desarrollador = new Desarrollador("Scarlett", 900.00, 4);

        System.out.println("Sueldo del " +empleado1.getNombre()+": "+ empleado1.calcularsalario());
        System.out.println("Sueldo del " +gerente.getNombre()+": "+ gerente.calcularsalario());
        System.out.println("Sueldo del " +desarrollador.getNombre()+": "+desarrollador.calcularsalario());
    }
}
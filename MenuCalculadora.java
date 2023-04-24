/**
 * La clase MenuCalculadora es la clase principal que se encarga de ejecutar la calculadora y mostrar un menú con las opciones
 * de sumar, restar, multiplicar, dividir e imprimir los resultados de las operaciones realizadas.
 *
 * @version 1.0
 * @since 2022-04-24
 */
public class MenuCalculadora {

    /**
     * El valor de la opción seleccionada en el menú.
     */
    static Integer valorMenu = 6;

    /**
     * Objeto Scanner utilizado para leer la entrada del usuario desde la consola.
     */
    static Scanner teclado = new Scanner(System.in);	

    /**
     * Método principal que crea una instancia de la clase Calculadora y muestra el menú de opciones al usuario.
     *
     * @param args Argumentos pasados al programa (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        while (valorMenu != 0) {
            if (valorMenu == 1) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
                calculadora.setValor1(numero1);
                calculadora.setValor2(numero2);
                calculadora.somar();

                chamarMenu();
            } else if (valorMenu == 2) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
                calculadora.setValor1(numero1);
                calculadora.setValor2(numero2);
                calculadora.subtrair();
                chamarMenu();
            } else if (valorMenu == 3) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
                calculadora.setValor1(numero1);
                calculadora.setValor2(numero2);
                calculadora.multiplicar();
                chamarMenu();
            } else if (valorMenu == 4) {
                Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
                Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
                calculadora.setValor1(numero1);
                calculadora.setValor2(numero2);
                calculadora.dividir();
                chamarMenu();
            } else if (valorMenu == 5) {
                System.err.println(calculadora.getResultados());
                chamarMenu();
            } else if (valorMenu == 0) {
                System.exit(0);
            } else {
                chamarMenu();
            }
        }
    }

    /**
     * Este método muestra el menú de opciones en la consola y espera a que el usuario ingrese una opción.
     * Si la opción ingresada no es válida, se vuelve a mostrar el menú.
     */
    private static void chamarMenu() {
        System.err.println("#########################");
        System.err.println("MENU");
        System.err.println("1:SOMAR");
        System.err.println("2:SUBTRAIR");
        System.err.println("3:MULTIPLICAR");
        System.err.println("4:DIVIDIR");
        System.err.println("5:IMPRIMIR");
        System.err.println("0:SAIR");

        valorMenu = teclado.nextInt();
    }
}

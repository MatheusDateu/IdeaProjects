public class Fluxo {
    public static void main(String[] args){
            System.out.println("Ini do main");
            try {
                metodo1();
            } catch (ArithmeticException | NullPointerException | MyExcept ex) {
                ex.printStackTrace();
                System.out.println("Aexception");
            }
        System.out.println("Fim do main");
    }

    private static void metodo1(){
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MyExcept("Deu muito errado");
    }
}

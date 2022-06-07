public class Numero {
    public static void dividir(int a, int b){
        try{
            System.out.println(a + " / " + b + " = " + a/b);
        }catch (ArithmeticException e){
            System.out.println("Nao e possivel dividir por zero");
        }finally {
            if (a == 0 || b == 0) {
                System.out.println(a + " / " + b + " = " + 0);
            }
        }
    }
}

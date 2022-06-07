public class Quadrado {
    public static double area(double lado){
        if(lado > 0) {
            lado = lado*lado;
            return lado;
        }else{
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }
}

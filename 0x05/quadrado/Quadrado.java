public class Quadrado extends Retangulo{

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(lado < 0){
            throw new java.lang.IllegalArgumentException("Lado deve ser maior igual a 0");
        }else {
            this.lado = lado;
        }
    }

    public double area(){
        return (lado*lado);
    }
    public String toString(){
        return ("[Quadrado] " + String.format("%.2f",lado));
    }

}

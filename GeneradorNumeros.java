
public class GeneradorNumeros {
  
  public static void main(String[] args) {
    
    int[] numeros = new int[10];
    
    for (int i = 0; i < 20; i++) {
      numeros[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
    }
  }
  
  private void imprimir (int[] numeros) {
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + ", ");
    }
  }

}
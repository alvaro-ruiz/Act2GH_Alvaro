
public class GeneradorNumeros {
  
  public static void main(String[] args) {
    
    int[] numeros = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numeros[i] = (int)(Math.random() * (10 - 1 + 1) + 1);
    }
  }
  
}
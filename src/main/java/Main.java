public class Main {
  public static void main(String[] args) {
    int [][] tabliczka = new int [10][10];
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        tabliczka[i][j] = (i + 1) * (j + 1);
      }
    }
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        System.out.printf("%4d", tabliczka[i][j]);
      }
      System.out.println();
    }
  }
}
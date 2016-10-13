class Perceptrons {
  public static void main(String[] args) {
    final int train_N = 1000;
    final int test_N = 200;
    final int nIn = 2;

    double[][] train_X = new double[train_N][nIn];
    int[] train_T = new int[train_N];

    double[][] test_X = new double[test_N][nIn];
    int[] test_T = new int[test_N];
    int[] predicted_T = new int[test_N];

    final int epochs = 2000;
    final double learningRate = 1.0;

    System.out.printf("aa");
  }
}

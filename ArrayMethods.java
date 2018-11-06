public class ArrayMethods{
  public static int rowSum(int [][] ary, int x){
    int c = 0;
    if (x > ary.length){
      return c;
    }
    if (x < 0){
      throw new IndexOutofBoundsException();
    }
    for (int i = 0; i<ary[x].length; i++){
      c+=ary[x][i];
    }
    return c;
  }
  public static int columnSum(int [][] ary, int x){
    int c = 0;
    for (int i = 0; i < ary.length; i++){
      if (x < ary[i].length){
        c+=ary[i][x];
      }
    }
    return c;
  }
  public static int[] allRowSums(int[][] ary){
    int[] Sums = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      Sums[i] = rowSum(ary, i);
    }
    return Sums;
  }
  public static int[] allColSums(int[][] ary){
    int x = 1;
    for (int i = 0; i < ary.length; i++){
      if (ary[i].length > x){
        x = ary[i].length;
      }
    }
    int[] Sums = new int[x];
    for (int i = 0; i < x; i++){
      Sums[i] = columnSum(ary, i);
    }
    return Sums;
  }
  public static boolean isRowMagic(int[][] ary){
    int[] Sums = allRowSums(ary);
    for (int i = 0; i < ary.length; i++){
      if (Sums[i] != Sums[0]){
        return false;
      }
    }
    return true;
  }
  public static boolean isColumnMagic(int[][] ary){
    int[] Sums = allColSums(ary);
    for (int i = 0; i < ary.length; i++){
      if (Sums[i] != Sums[0]){
        return false;
      }
    }
    return true;
  }
}

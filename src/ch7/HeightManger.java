package ch7;

public class HeightManger {
  public static void main(String[] args) {
    int[][] gradeHeight = {{170, 180, 173, 175, 177}, {160, 165, 167, 186}, {158, 177, 187, 176}, {173, 182, 181}, {170, 180, 165, 177, 172}};
    for(int[] heights : gradeHeight) {
      for(int height : heights) {
        System.out.println(height);
      }
    }
  }
}

public class Demo {

	public static void printLoop(int n){
  		for(int i = 1; i <= n; i++) {
    		for(int j = n - i; j >= 0; j--) {
       			System.out.print(i);
    		}
    		System.out.println();
  		}
	}

	public static String arrToString(int[] arr){
  if (arr.length == 0) {
    return "{}";
  }
  String returnStr = "{";
  for (int i = 0; i < arr.length - 1; i++) {
    returnStr += arr[i] + ", ";
  }
  returnStr += arr[arr.length - 1] + "}";
  return returnStr;
	}

	public static String arrayDeepToString(int[][] arr) {
		String returnStr = "{";
		for (int i = 0; i < arr.length - 1; i++) {
			returnStr += arrToString(arr[i]) + ", ";
		}
		returnStr += arrToString(arr[arr.length - 1]) + "}";
		return returnStr;
	}

	public static int[][] create2DArray(int rows, int cols, int maxValue) {
		int[][] arr = new int[rows][];
		for (int i = 0; i < rows; i++) {
			arr[i] = new int[cols];
			for (int j = 0; j < cols; j++)
				arr[i][j] = ( (int) Math.round(Math.random() * maxValue));
		}
		return arr;
	}

	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
		int[][] arr = new int[rows][];
		for (int i = 0; i < rows; i++) {
			int randomCol = (int) Math.round(Math.random() * cols);
			arr[i] = new int[randomCol];
			if (arr[i].length != 0) {
				for (int j = 0; j < randomCol; j++)
					arr[i][j] = ( (int) Math.round(Math.random() * maxValue));
				}
			}
		return arr;
	} 

	public static void main(String[] args) {
		if (args.length > 0) {
			printLoop(Integer.parseInt(args[0]));
		}
		else {
			printLoop(5);
		}
		// int[][] x = {  {  1,  0, 12, -1 },
  //                 {  7, -2,  2,  1, 9, 2},
  //                 { -5, -2,  2, -9 }
  //              		};
		// System.out.println(arrayDeepToString(x).replace("}, ", "},\n "));
		
		// int[][] x = create2DArray(5, 4, 10);
		// System.out.println(arrayDeepToString(x).replace("}, ", "},\n "));

		// int[][] x = create2DArrayRandomized(20,10,100);
		// System.out.println(arrayDeepToString(x).replace("}, ", "},\n "));
	}
}
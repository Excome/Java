package directionsreduction;
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        String arr_last=arr[0]; 
        String arr2[] = new String[arr.length];
        int arr_last_i = 0;
        int arr_n = arr.length;
        int j;
        int sc = 0;
        int arr_n2 = arr_n;
        while (sc < arr_n2) {
            for(int i = 1; i < arr_n; i++) {
                if ((arr[i].contains("NORTH") && arr_last.contains("SOUTH")) 
                        || (arr[i].contains("SOUTH") && arr_last.contains("NORTH"))
                        || (arr[i].contains("WEST") && arr_last.contains("EAST")) 
                        || (arr[i].contains("EAST") && arr_last.contains("WEST"))) {
                    arr_n = arr_n - 2;
                    arr2 = new String[arr_n];
                    for(j = 0 ;j < arr_last_i ;j++){
                        arr2[j] = arr[j];
                    }
                    for(j=arr_last_i; j < arr_n;j++) {
                        arr2[j] = arr[j+2];
                    }
                }
                arr_last = arr[i];
                arr_last_i = i;
            }
            arr = arr2;
            sc++;
        }
        return arr;
    }
}
//1"NORTH", 2"SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"
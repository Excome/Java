package directionsreduction;
public class Dispatcher {
    public static void main(String[] args) {
        String[] arr = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
//       System.out.println(arr.length);
//        String[] arr2 = new String[5];
//        System.out.println(arr2[5]);
        arr = DirReduction.dirReduc(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

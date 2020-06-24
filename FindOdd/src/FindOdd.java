public class FindOdd {
    public static int findIt(int[] intNumbers) {
        int odd = 0;
        int count;
        for (int i = 0; i < intNumbers.length; i++) {
            odd = intNumbers[i];
            count = 0;
            for(int j = 0; j < intNumbers.length; j++) {
                if (odd == intNumbers[j]) {
                    count++;
                }
                if (count % 2 == 0)
                    break;
            }
        }
        return odd;
    }
    public void main() {
        int[] a = {1,1,2,-2,5,2,4,4,-1,-2,5};
        System.out.println(findIt(a));
    }
}

public class Dispetcher {
    public static void main(String[] args) {
     int [] x = {2,5,-15,-60,88,3,-19,32,7};  
     int xMax = x[1];
     int xMin = x[1]; 
     int xMinIndx = 0;
     int xSummChet = 0;
     int xChetKlv = 0;
     for (int i=0;i < x.length; i++) {
          if (x[i] > xMax) {
              xMax = x[i];
          }
          if (x[i] < xMin) {
              xMin = x[i];
              xMinIndx = i;
          }
          if (x[i]%2==0) {
              xSummChet = xSummChet + x[i];
              xChetKlv++;
          }
     }
     System.out.println("Максимальный элемент массива: " + xMax);
     System.out.println("Минимальный элемент массива: " + xMin + ", c индексом : " + xMinIndx);
     System.out.println("Сумма четных элементов массива: " + xSummChet + ", Кол-во: " + xChetKlv);

    }
    
}

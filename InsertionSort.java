//Skriv mer kommentarer
public class InsertionSort {
    private static void sort(double[] list, int start, int end){
        double temp;
        for(int i = start + 1; i <= end; i++){
            for (int j = i; j > 0; j--){
                if(list[j] < list[j - 1]){
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                } else if (list[j] >= list[j - 1]) {
                    break;
                }
            }
        }
    }
    public static void main (String[] args){
        double[] list = {7, 1, 1, 2, 3, 4, 6, 0, 10, 14, 15, 1, 6, 7, 0, -4};
        long start = System.nanoTime();

        sort(list, 0, list.length - 1);

        for (double number : list){
            System.out.println(number);
        }
        long end = System.nanoTime();
        long duration = ( end - start ) / 1000000;
        System.out.println(duration);
    }
}


public class ex1{
    public static void main(String[] args) {
        int[] mas = {11, 34, 3, 5, 36, 11, 7, 3, 2, 1, 2, 36};
        int min = mas[0], max = mas[0], i;
        for (i = 0; i != mas.length; i++)
        {
            if (mas[i] < min)
            {
                min = mas[i];
            }
            if (mas[i] > max)
            {
                max = mas[i];
            }
        }
        System.out.println("max = " + max + " min = " + min);
    }
}
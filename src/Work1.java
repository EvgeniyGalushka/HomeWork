import java.util.Random;

public class Work1 {
    public static void main(String args[]){
        //Минимальное число массива
        int[] array = new int[20];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100); // авто заполнение масива числами от 0 до 99
        //вывод масива на экран
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        int min = array[0];//пусть минимум будет 1-й элемент масива
        for(int i = 0; i < array.length; i++)
        {
            if (min > array[i])
                min = array[i];
        }
        System.out.println("\n минимальное число масива = " + min);

    }
}

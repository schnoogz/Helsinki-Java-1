
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int totalSum = 0;
        for(int number: list){
            totalSum += number;
        }
        return totalSum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double sum = (double)sum(list);
        int totalItems = list.size();
        System.out.println(totalItems);
        return (double)(sum / totalItems);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}

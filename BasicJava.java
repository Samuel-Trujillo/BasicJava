import java.util.ArrayList;
public class BasicJava {
    public Integer countUp(){
        int i;
        for(i = 1; i < 255; i++){
            System.out.println(i);
        } return i;
    } 
    public Integer countOdd(){
        int i;
        for(i = 1; i < 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        } return i;
    }
    public Integer printSum(){
        int i;
        int sum = 0;
        for(i= 0; i < 255; i++){
            sum = i + sum;
            System.out.println("new number: " + i+ " sum: " + sum);
        } return sum;
    }
    public Integer iterateArray(){
        int[] myArray = {1,3,5,7,9};
        for(int i : myArray){
            System.out.println(i);
        } return null;
    }
    public Integer findMax(){
        int maximo = -10;
        int[] myArray = {-3,-5,1,3,5,7,9,4,0,13};
        for(int i : myArray){
            if(maximo < i){
                maximo = i;
            }
        } return maximo;
    }
    public Integer findAvg(){
        int sum = 0;
        int avg;
        int[] myArray = {-3,-5,1,3,5,7,9,4,13};
        int quantity = myArray.length;
        for(int i : myArray){
            sum = sum+i;
        } avg = sum/quantity;
        return avg;
    }
    public ArrayList oddArray(int[] arr){
        ArrayList<Object> offArray = new ArrayList<Object>();
        for(int i = 1; i < 256; i++){
            if(i % 2 != 0){
                offArray.add(i);
            }
        }return offArray;
    }
    public Integer greaterThan(){
        int[] myArray = {-3,-5,1,3,5,7,9,4,13};
        int y = 5;
        int count = 0;
        for(int i : myArray){
            if(y < i){
                count ++;
            } 
        } return count;
    }
    public ArrayList noNeg(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
                myArray.add(arr[i]);
            } else {
                myArray.add(arr[i]);
            }
        } return myArray;
    }
    public ArrayList MinMaxAvg(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        avg = (double) sum / arr.length;
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);
        return myArray;
    }
    public ArrayList shiftVal(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        for(int i = 1; i < arr.length; i++){
            myArray.add(arr[i]);
        } myArray.add(arr[0]);
        return myArray;
    }
}





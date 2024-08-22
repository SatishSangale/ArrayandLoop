package ArrayPractice;

public class PrintArrayReverseOrder {
    public static void main(String[] args){
        int[] arr = {20,55,66,77,25,56,89,99};
        //99 89...20
        //initialazation = arr.length -1
        //condition =
        //increment or decrement
        //for(int i = 0; i < arr.length; i++)
        /*for(int i = 7; i >= 1; i--){
        System.out.println(arr[i]);
        }

         */

        //init i = 0
        //condition i < arr.length
        //incre/dec i++
        //for(){
        //
        // }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);

            }

        }
        }
}

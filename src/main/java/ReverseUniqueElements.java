import java.util.ArrayList;
import java.util.List;

public class ReverseUniqueElements {
    public static void main(String[] args) {

        double[] list = {12,22,12,34,34,345,54,54,2,2,323,1,23};
        reverse_unique_elements(list);
                                                      
    }

    public static void reverse_unique_elements(Object list){
        //here verify if the data type provided is difrerent from int[] type
        if(!(list instanceof int[])) {
            System.out.println("The function is waiting for a list of int " +
                    "and you provide a " +list.getClass()+ " type");
        }
        //here we confrim if the list is empty
        else if (((int[]) list).length==0) {
            System.out.println("The list is empty");
        }
        //in case that the data type provided is int[] it will run this
        else{
            // here capture the data provided and is casted to an int[] type
            int[] listOfNum = ((int[]) list);
            //this variable is to cont the cuantity of time a value is in the list
            int count = 0;
            //here we have a List<Integer> object to save the final result of the list
            List<Integer> results = new ArrayList<>();
            //capture the size of the array
            int sizeOfList = ((int[]) list).length;
            /*now with a for, give the sizeOfList to (i) -1 because the list start counting from zero
            and do the loop while (i) is higher or equals to zero, variable (i) is going to be decreasing in one,
            this because we want to sort the list inverted*/
            for(int i =sizeOfList-1; i>=0; i--){
                //here we set count to 0 each time the loop is runned
                count =0;
                /*here we set another loop to compare each value with the rest of the list
                and if that value is only once in the list count variable is going to increase once and
                depending the times the value is repited in the list*/
                for(int j = 0; j<listOfNum.length; j++){
                    if(listOfNum[i] == listOfNum[j]){
                        count ++;
                    }
                }
                //in case the variable count is equals to one that means the value is unique and
                //then the value is going to be added to the result list
                if(count==1){
                    results.add(listOfNum[i]);
                }
            }
            //here in case that count is equals to sizeOfList that means that al number in the
            //list are equals, in that case we only take one value from any index of the list
            //to be added to the result list
            if (count == sizeOfList){
                results.add(listOfNum[0]);
            }
            //finally in this loop we print the values of the result list in console
            for(Integer result: results){
                System.out.println(result);
            }
        }

    }

}

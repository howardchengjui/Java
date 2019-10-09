import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class PuzzleJava{
    public ArrayList<Integer>returnArrayGreaterthan10(){
        int [] array={3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int sum=0;
        for(int i=0; i < array.length; i++){
            sum += array[i];
            if(array[i]>10){
                myArray.add(array[i]);
            }
        }
        System.out.println(sum);
        System.out.println(myArray);
        return myArray;
    }
    public ArrayList<Object> returnNamesLongerthan5(){
        String [] list={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<Object> shufflelist = new ArrayList<Object>();
        ArrayList<Object> listlongerthan5 = new ArrayList<Object>();
        for(int i=0;i<list.length; i++){
            if(list[i].length() >5){
                listlongerthan5.add(list[i]);
            }
        shufflelist.add(list[i]);
        }
        System.out.println(listlongerthan5);
        Collections.shuffle(shufflelist);
        System.out.println(shufflelist);
        return shufflelist;
    }
    public ArrayList<String> shufflealphabet(){
        String [] list={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
        "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> shufflelist = new ArrayList<String>(Arrays.asList(list));
        Collections.shuffle(shufflelist);
        String first_letter=shufflelist.get(0);
        String last_letter=shufflelist.get(25);
        System.out.println(first_letter);
        System.out.println(last_letter);
        if(first_letter.equals("a")){
            System.out.println("First letter is vowel!");
        }
        else if(first_letter.equals("e")){
            System.out.println("First letter is vowel!");
        }
        else if(first_letter.equals("i")){
            System.out.println("First letter is vowel!");
        }
        else if(first_letter.equals("o")){
            System.out.println("First letter is vowel!");
        }
        else if(first_letter.equals("u")){
            System.out.println("First letter is vowel!");
        }
        return shufflelist;
    }
}

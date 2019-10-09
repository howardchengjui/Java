import java.lang.Math;
public class Pythagorean{
    public String calculateHypotenuse(int legA, int legB){
        double legC = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
        return "length of leg C is " + legC ;
    }
}
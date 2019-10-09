public class Basics{
    public void print1to255(){
        int i=1;
        while(i<255){
            System.out.println(i);
            i++;
        }
    }
    public void printodd1to255(){
        int i=1;
        for(i=1;i<256;i++){
            if(i%2 !=0){
            System.out.println(i);
            }
        }
    }

    public void sum1to255(){
        int sum=0;
        int i=1;
        while(i<255){
            sum += i;
            System.out.println("New number:"+ i + " Sum:" + sum);
            i++;
        }
    }
}
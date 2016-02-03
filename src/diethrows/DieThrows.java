/*Program that emulates 1000 die throws using the random 
number generator
*/
package diethrows;
/**
 * @author Hammy25
 */
//import java.util.Random;
public class DieThrows {
   
    public static void main(String[] args) {
        //keep scores of faces
        int [] scoreArray = new int[6];
        double percentage=0;
        int count, outputCount = 1;
        double num;
        double y = 1.0/6.0;
//        Random randomGen = new Random();
//        System.out.print(y);
        for( count = 1;count <= 1000; count++){
            num = Math.random();
//            System.out.println(num+ "\n");
            if( num<y){
                    scoreArray[0]++;
            }else if(num < y*2){
                    scoreArray[1]++;
            }else if(num<y*3){
                    scoreArray[2]++;
            }
            else if(num<y*4){
                scoreArray[3]++;
            }
            else if(num<y*5){
                scoreArray[4]++;
            }else{scoreArray[5]++;}
        }
        System.out.println("Face \t Frequency\tPercentage\n");
        System.out.println("-----------------------------------\n");
        for(int score : scoreArray){
            percentage = (double) score/10;
            System.out.println(outputCount+" \t "+score+" \t\t"+percentage+"\n");
            outputCount++;
        }    
            System.out.println("-----------------------------------\n");
            System.out.println("Total \t 1000 \t\t100%");
    }
}

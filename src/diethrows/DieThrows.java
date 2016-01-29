/*Program that emulates 1000 die throws using the random 
number generator
*/
package diethrows;
/**
 * @author Hammy25
 */
import java.util.Random;
public class DieThrows {
   
    public static void main(String[] args) {
        //keep scores of faces
        int [] scoreArray = new int[6];
        double percentage=0;
<<<<<<< HEAD
        int num, count, outputCount = 1;
=======
        int num, count, outputCount = 1,frequency=0;
>>>>>>> d557a59ced9454fb9c0f8b04addd5dc59cb7ba9d
        Random randomGen = new Random();
        for( count = 1;count <= 1000; count++){
            num = generateDieFace(randomGen);
            switch(num){
                case 1:
                    scoreArray[0]++;
                    break;
                case 2:
                    scoreArray[1]++;
                    break;
                case 3:
                    scoreArray[2]++;
                    break;
                case 4:
                    scoreArray[3]++;
                    break;
                case 5:
                    scoreArray[4]++;
                    break;
                case 6:
                    scoreArray[5]++;
                    break;
            }
        }
        System.out.println("Face \t Frequency \t Percentage\n");
        for(int score : scoreArray){
<<<<<<< HEAD
            percentage = (double) score/10;
            System.out.println(outputCount+" \t "+score+" \t "+percentage+"%\n");
=======
            frequency = score;
            percentage = (double) frequency/10;
            System.out.println(outputCount+" \t "+frequency+" \t "+percentage+"%\n");
>>>>>>> d557a59ced9454fb9c0f8b04addd5dc59cb7ba9d
            outputCount++;
        }    
            System.out.println("Total \t 1000 \t 100%");
    }
    
    private static int generateDieFace(Random aRandom){
        int start = 1, end = 6;
        int randomNumber;
        //get the number of options we have
        //cast to long to avoid overflow
        long range = (long) end + 1 - (long) start;
        //get a random fraction
        long fraction = (long) (range * aRandom.nextDouble());
        randomNumber = (int) (fraction + start);
        return randomNumber;
    }   
}

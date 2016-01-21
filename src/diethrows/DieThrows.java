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
        //Keep scores of faces
        int scoreOne = 0, scoreTwo = 0, scoreThree = 0, scoreFour = 0, scoreFive = 0, scoreSix = 0;
        double p1=0, p2=0, p3=0, p4=0, p5=0, p6=0,percentage=0;
        int num, count, outputCount = 0,frequency=0;
        Random randomGen = new Random();
        for( count = 1;count <= 1000; count++){
            num = generateDieFace(randomGen);
//            System.out.print(num + "\n");
            switch(num){
                case 1:
                    scoreOne++;
                    break;
                case 2:
                    scoreTwo++;
                    break;
                case 3:
                    scoreThree++;
                    break;
                case 4:
                    scoreFour++;
                    break;
                case 5:
                    scoreFive++;
                    break;
                case 6:
                    scoreSix++;
                    break;
            }
        }
        p1 = (double) scoreOne/10;
        p2 = (double) scoreTwo/10;
        p3 = (double) scoreThree/10;
        p4 = (double) scoreFour/10;
        p5 = (double) scoreFive/10;
        p6 = (double) scoreSix/10;
        System.out.println("Face \t Frequency \t Percentage\n");
        for(outputCount=1; outputCount<=6; outputCount++){
            switch(outputCount){
                case 1:
                    frequency = scoreOne;
                    percentage = p1;
                    break;
                case 2:
                    frequency = scoreTwo;
                    percentage = p2;
                    break;
                case 3:
                    frequency = scoreThree;
                    percentage = p3;
                    break;
                case 4:
                    frequency = scoreFour;
                    percentage = p4;
                    break;
                case 5:
                    frequency = scoreFive;
                    percentage = p5;
                    break;
                case 6:
                    frequency = scoreSix;
                    percentage = p6;
                    break;
            }
            System.out.println(outputCount+" \t "+frequency+" \t "+percentage+"%\n");
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

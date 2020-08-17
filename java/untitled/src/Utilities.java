import java.util.ArrayList;
import java.util.Random;

/**
 * @Author sushanghai
 * @Date 2020/8/17
 */
public class Utilities {
    public static void main(String[] args) {
        // test direct insert
        Utilities utilities = new Utilities();
        ArrayList<Integer> disorderArray = utilities.generateRandomIntByMath(20);
        ArrayList<Integer> sortedArray = utilities.directInsert(disorderArray);
        System.out.println(sortedArray.toString());
    }

    /**
     * Generate a list random value which user Sys.Random
     * @param randomLength
     * @return
     */
    public ArrayList<Integer> generateRandomIntByRandom(int randomLength) {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < randomLength; i++) {
            randomList.add(i, random.nextInt());
        }
        System.out.println(randomList.toString());
        return randomList;
    }

    /**
     * Generate a list random value witch use Math.random()
     * Math.random() ∈ [0, 1)
     * @param randomLength
     * @return
     */
    public ArrayList<Integer> generateRandomIntByMath(int randomLength) {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < randomLength; i++) {
            double randomDouble = Math.random();
            randomList.add(i, (int) (1 + randomDouble * 100));
        }
        System.out.println(randomList.toString());
        return randomList;
    }

    /**
     * Insert a int data to a sorted ArrayList, and return result
     * @param data
     * @param sortedData
     * @return
     */
    public ArrayList<Integer> insertData(int data, ArrayList<Integer> sortedData) {
        int arrayLength = sortedData.size();
        for (int i = 0; i < arrayLength; i++) {
            if (sortedData.get(i) > data) {
                sortedData.add(i, data);
                break;
            }
        }
        if (sortedData.size() == arrayLength) {
            sortedData.add(data);
        }
        System.out.println(sortedData.toString());
        return sortedData;
    }

    /**
     * direct insert algorithm
     * @param disorderData
     * @return
     */
    public ArrayList<Integer> directInsert(ArrayList<Integer> disorderData) {
        ArrayList<Integer> sortedArray = new ArrayList<Integer>(); // initial a ArrayList<Integer>
        Utilities utilities = new Utilities();
        for (int i = 0; i < disorderData.size(); i++) {
            utilities.insertData(disorderData.get(i), sortedArray);
        }
        return sortedArray;
    }

}

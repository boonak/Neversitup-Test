import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Start{
    public static void main(String[] args) {
        String input = "aabb";
        Permutations a = new Permutations();
        List<String> permutations = a.getPermutations(input);
        System.out.println("Permutations: " + permutations);
        
//-------------------------------------------------------------------//
        FindOdd b = new FindOdd();
        
        int[] inputList = {1,2,2,3,3,3,4,4,3,3,3,2,2,1,5,5,5};
        int oddNumber = b.findOdd(inputList);
        System.out.println("The number that shows an odd number of times is: " + oddNumber);
        
//-------------------------------------------------------------------//
        CountSmileys c = new CountSmileys();
        List<String> testList = Arrays.asList();
        int count = c.countSmileys(testList);
        System.out.println("The number of smiley face is: " + count);

    }
}

class Permutations {
    public List<String> getPermutations(String input) {
        List<String> result = new ArrayList<>();

        if (input.length() == 1) {
            result.add(input);
            return result;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String remainChar = input.substring(0, i) + input.substring(i + 1);
            List<String> otherResults = getPermutations(remainChar);
            for (int j = 0; j < otherResults.size(); j++) {
                result.add(currentChar + otherResults.get(j));
            }
        }

        result.sort(null);
        List<String> result_final = new ArrayList<>();

        for (int k = 0; k < result.size(); k++) {
            if (k == result.size() - 1){
                 result_final.add(result.get(k));
            }else{
                if (result.get(k).equals(result.get(k + 1))) { }
                else {
                    result_final.add(result.get(k));
                }
            }   
        }
        return result_final;
    }
}

class FindOdd {
    public int findOdd(int[] input) {
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            int count = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                result = input[i];
                return result;
            }
        }

        return result;
    }
}

class CountSmileys{
    public int countSmileys(List<String> arr) {
        List<String> validEyes = Arrays.asList(":", ";");
        List<String> validNoses = Arrays.asList("-", "~");
        List<String> validMouths = Arrays.asList(")", "D");

        int arrCount = 0;

        for (String str : arr) {
            String faceCheck = "";
            for (int j = 0; j < str.length(); j++) {
                if (validEyes.contains(String.valueOf(str.charAt(j)))) {
                    faceCheck = faceCheck + 'E';
                }
                if (validNoses.contains(String.valueOf(str.charAt(j)))) {
                    faceCheck = faceCheck + 'N';
                }
                if (validMouths.contains(String.valueOf(str.charAt(j)))) {
                    faceCheck = faceCheck + 'M';
                }
            }
            if (faceCheck.equals("ENM") || faceCheck.equals("EM")) {
                arrCount++;
            }
        }

        return arrCount;
    }
}
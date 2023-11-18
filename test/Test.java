
import java.util.Arrays;
import java.util.List;

public class Test{
    public void test1_permutation(){
        Permutations a = new Permutations();
        String input = "a";
        List<String> result = a.getPermutations(input);
        List<String> expected = Arrays.asList("a");
        assert result.equals(expected);
    }
    public void test2_permutation(){
        Permutations a = new Permutations();
        String input = "ab";
        List<String> result = a.getPermutations(input);
        List<String> expected = Arrays.asList("ab", "ba");
        assert result.equals(expected);
    }
    public void test3_permutation(){
            Permutations a = new Permutations();
            String input = "abc";
            List<String> result = a.getPermutations(input);
            List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
            assert result.equals(expected);
        }
    public void test4_permutation(){
        Permutations a = new Permutations();
        String input = "aabb";
        List<String> result = a.getPermutations(input);
        List<String> expected = Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa");
        assert result.equals(expected);
    }
    
    public void test1_findOods(){
        FindOdd a = new FindOdd();
        int[] inputList = {7};
        int result = a.findOdd(inputList);
        int expected = 7;
        assert result == expected;
    }
    
    public void test2_findOods(){
        FindOdd a = new FindOdd();
        int[] inputList = {0};
        int result = a.findOdd(inputList);
        int expected = 0;
        assert result == expected;
    }
    
    public void test3_findOods(){
        FindOdd a = new FindOdd();
        int[] inputList = {1,1,2};
        int result = a.findOdd(inputList);
        int expected = 2;
        assert result == expected;
    }
    
    public void test4_findOods(){
        FindOdd a = new FindOdd();
        int[] inputList = {0,1,0,1,0};
        int result = a.findOdd(inputList);
        int expected = 0;
        assert result == expected;
    }
    
    public void test5_findOods(){
        FindOdd a = new FindOdd();
        int[] inputList = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        int result = a.findOdd(inputList);
        int expected = 4;
        assert result == expected;
    }
    
    public void test1_countSmileys(){
        CountSmileys c = new CountSmileys();
        List<String> inputList = Arrays.asList(":)", ";(", ";}", ":-D");
        int result = c.countSmileys(inputList);
        int expected = 2;
        assert result == expected;
    }
    
    public void test2_countSmileys(){
        CountSmileys c = new CountSmileys();
        List<String> inputList = Arrays.asList(";D", ":-(", ":-)", ";~)");
        int result = c.countSmileys(inputList);
        int expected = 3;
        assert result == expected;
    }
    
    public void test3_countSmileys(){
        CountSmileys c = new CountSmileys();
        List<String> inputList = Arrays.asList(";]", ":[", ";*", ":$", ";-D");
        int result = c.countSmileys(inputList);
        int expected = 1;
        assert result == expected;
    }
    
    public void test4_countSmileys(){
        CountSmileys c = new CountSmileys();
        List<String> inputList = Arrays.asList();
        int result = c.countSmileys(inputList);
        int expected = 0;
        assert result == expected;
    }
}
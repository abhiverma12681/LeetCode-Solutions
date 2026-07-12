
//reverse a string Function
class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}

// reverse vowels of String
class Solution {

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            for (; i < j && !isVowel(arr[i]); i++)
                ;

            for (; i < j && !isVowel(arr[j]); j--)
                ;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}

// giv each element a rank
import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp = arr.clone();

        Arrays.sort(temp);

        for (int i = 0; i < arr.length; i++) {

            int rank = 1;

            for (int j = 0; j < temp.length; j++) {

                if (temp[j] == arr[i]) {
                    arr[i] = rank;
                    break;
                }

                if (temp[j] != temp[j + 1]) {
                    rank++;
                }
            }
        }

        return arr;
    }
}
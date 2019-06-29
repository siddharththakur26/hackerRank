package HackerRank.Implementation;
/*
Complete the designerPdfViewer function in the editor below. It should return an integer representing the size of the highlighted area.

designerPdfViewer has the following parameter(s):

h: an array of integers representing the heights of each letter
word: a string
 */

import java.util.ArrayList;

public class PdfViewer {
    public static void main(String[] args) {
        int [] h={1 ,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5, 5 ,5, 7};
        String word = "zaba";
        int index=0;
        int temp=0;
        ArrayList<Integer> height = new ArrayList<>();
        for (int i=0;i<word.length();i++){
            index = word.charAt(i) - 'a';
            temp = h[index];
            height.add(temp);
        }
        int max = Integer.MIN_VALUE;
        for (int i=0; i<height.size();i++){
            if (max < height.get(i)){
                max = height.get(i);
            }
        }
        //System.out.println(max);
        //System.out.println(height);
        int result = max * word.length();
        System.out.println(result);

    }
}

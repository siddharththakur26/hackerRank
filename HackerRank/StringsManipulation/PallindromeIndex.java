package HackerRank.StringsManipulation;
/*
identify the index that needs to be removed to form a string a pallindrome
 */
public class PallindromeIndex {
    public static void main(String[] args) {
        String s = "fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf";
        int low =0;
        int high =s.length()-1;
        int flag=0;
        while(low<high){
            if (s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }
            else {
                System.out.println(s.substring(low + 1,high+1));
                System.out.println(s.substring(0, high));

                if (ispalindrome(s.substring(low + 1,high+1))) {
                    System.out.println(low);
                    flag++;
                    break;
                }

                if (ispalindrome(s.substring(low, high))) {
                    System.out.println(high);
                    flag++;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println(-1);


    }
    static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i <  j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}

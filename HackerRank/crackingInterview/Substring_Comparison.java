package HackerRank.crackingInterview;


public class Substring_Comparison {

    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        String s = "welcometojava";
        int k = 3;
        System.out.println(s.length());
        String str[] = new String[s.length()];
        for (int i =0 ; i<s.length()-(k-1);i++){
           str[i] = s.substring(i,k+i);
        }
        //System.out.println(Arrays.toString(str));
        int cnt=0;
        String ans[] = new String[0];
        for (int i = 0; i< str.length;i++){
            if (str[i] == null){
              cnt++;
            }
        }
        ans = new String[str.length-cnt];

        System.out.println(ans.length);

        for (int i = 0; i< ans.length;i++){
            if (str[i] != null){
                ans[i] = str[i];
            }
        }
        for (int i = 0 ; i<ans.length;i++){
            for (int j =0; j<ans.length;j++){
                if (ans[i].compareTo(ans[j])<0){
                    String temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }

        smallest = ans[0];
        largest = ans[ans.length-1];
        System.out.println(smallest +" "+largest);
    }
}

/*
   String smallest = "";
        String largest = "";
        String s = "welcometojava";
        int k = 3;

        // int j =10;
       // System.out.println(s.substring(j,k+j));

ArrayList<String> str = new ArrayList<>();
        for (int i = 0 ; i<s.length()-(k-1);i++){
        str.add(s.substring(i,k+i));
        }
        Collections.sort(str);
        smallest = str.get(0);
        largest = str.get(str.size()-1);
        System.out.println(smallest+" "+largest);


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

 */

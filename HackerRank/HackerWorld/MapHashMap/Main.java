package HackerRank.HackerWorld.MapHashMap;

import java.util.*;

/*
Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
You will then be given an unknown number of names to query your phone book for. For each queried,
print the associated entry from your phone book on a new line in the form name=phoneNumber;
 if an entry for  is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.
*/

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String name;
        int pn;
        Map<String,Integer> phone=new HashMap<String,Integer>(n);
        while (n>0){
            name=in.next();
            pn=in.nextInt();
            phone.put(name,pn);
            in.nextLine();
            n--;
        }
        List<String> object=new ArrayList<>();
        String str;
        while(in.hasNextLine()){
        str=in.nextLine();
        object.add(str);
        }

        for (int i=0;i<object.size();i++)
        {
            if (phone.containsKey(object.get(i)))
            {
                int phonenumber=phone.get(object.get(i));
                System.out.println(object.get(i)+"="+phonenumber);

            }
            else
            {
                System.out.println("Not found");
            }
        }


    }

}



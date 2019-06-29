package HackerRank.StringsManipulation;
/*
Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 */

public class CaesarCipher {
    public static void main(String[] args) {
        String s =  "W";
        int k=4;
        System.out.println((int) 'W');
        System.out.println((char)90);
        String result="";
        int rotate = k%26;
        for (int i =0; i<s.length();i++){
            if (Character.isLowerCase(s.charAt(i))){
                //System.out.println(1);
                int index = (int) s.charAt(i);
                int final_index = index + rotate;
                if (final_index > 122){
                    final_index = 97 + (final_index - 122)-1;
                }
                result = result + (char) (final_index);

            }
            else if (Character.isUpperCase(s.charAt(i))){
                int index = (int) s.charAt(i);
                int final_index = index + rotate;
                if (final_index > 90){
                    final_index = 65 + (final_index - 90)-1;
                }
                result = result + (char) (final_index);

            }
            else{
                result = result + s.charAt(i);
            }


        }
        System.out.println(result);


    }
}
/*
  String s ="www.abc.xy";
        //char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        ArrayList<Character> alphabet_caps = new ArrayList<>();
        alphabet_caps.add('A');
        alphabet_caps.add('B');
        alphabet_caps.add('C');
        alphabet_caps.add('D');
        alphabet_caps.add('E');
        alphabet_caps.add('F');
        alphabet_caps.add('G');
        alphabet_caps.add('H');
        alphabet_caps.add('I');
        alphabet_caps.add('J');
        alphabet_caps.add('K');
        alphabet_caps.add('L');
        alphabet_caps.add('M');
        alphabet_caps.add('N');
        alphabet_caps.add('O');
        alphabet_caps.add('P');
        alphabet_caps.add('Q');
        alphabet_caps.add('R');
        alphabet_caps.add('S');
        alphabet_caps.add('T');
        alphabet_caps.add('U');
        alphabet_caps.add('V');
        alphabet_caps.add('W');
        alphabet_caps.add('X');
        alphabet_caps.add('Y');
        alphabet_caps.add('Z');

        System.out.println(alphabet.indexOf('w'));
        /*
        22 + 5 = 27
        27 - 25 = 2
        2-1 = 1


        System.out.println(87%25);
                System.out.println();







                int k =87;
                int final_index = 0;
                String result="";
                for (int i=0; i < s.length();i++){
        if (alphabet.contains(s.charAt(i))) {
        //System.out.println(alphabet.indexOf(s.charAt(i)));
        int index = alphabet.indexOf(s.charAt(i));
        final_index = index + (k%25);
        //System.out.println(final_index);
        if (final_index > 25){
        final_index = (final_index % 25) -0;
        result = result + alphabet.get(final_index);

        }
        else{
        result = result + alphabet.get(final_index);
        }
        }
        else if (alphabet_caps.contains(s.charAt(i))){
        int index = alphabet_caps.indexOf(s.charAt(i));
        final_index = index + k;
        if (final_index > 25){
        final_index = (final_index % 25) -0 ;
        result = result + alphabet_caps.get(final_index);
        }
        else{
        result = result + alphabet_caps.get(final_index);
        }

        }
        else
        {
        result = result + s.charAt(i);
        }

        }
        System.out.println(result);
 */

package HackerRank.StringsManipulation;

import java.util.ArrayList;
/*
check if you can rearange the strings into pallindrome
 */
public class GameofThrons {
    public static void main(String[] args) {
        String s = "vybzezwwbtgywuechyjtqjmrafcumwujuyjazfwbyezwydbgekbuupowvssjpptlncmmhkpipogpuhxysauoqkmndfwuuphhtvvbgllxbtovbmtvoqleaxrdcqzwfhfzcbckophpiyllmggayrhzpaetqgqwnvxrybcmqleajrmxxuyymhzdhdwyjowymtqkwuzohfotwcqvzqtnxsqfyodjfziruadswegdjwyhbpdafwndrfiptnyaoitkkzcidiopgmwhbbhjaumrzwivlixzrrjdqnovvcmdollsmubmppfqnnnywnzpekuwxitukixztkthfuwwlbmyrcynpxevjytghocrwzsrknzrhxnuazsrdsgurkrajkisbklxmgrytspdpcxpdshjkpdcavelhndizoinwbnqtetkiqzmiixtyaxaxblhqqrsebfbcvtxzmhicjwnrtirvfrviecbuvtbxaebvxbxjifntbcnwkerrymceqdzmyclagoydpvoaadtdggzsnqknforvrsjruwranpfcmvemzarhgqzvjliozclsuxjptdriuxlhsrvtrnaadcxmpgcpiojenvtiylrsiezcvxwpkyrncocsuejeusjhnesnpjgznheieczqaqeffixboigjcrsqvkfntlogvsrbussxjycogbpujxflqadokjbgwrotkhxeardjpfzxiqttozhgzkulvxrurinbpmhrdlassbrdslwikdolqlwnkqhbaxerjmjnzlhtnzwhmvpyafjqshgfzngbmntwbclapuvcvulhpafpiqiaaofbdodqdwoeabgpvbutvfcmiieqamsccaehohxtfnxfodwmgqfcyhqgruwuiqwmqcugjtzqjwvzbuliksmkccqvzopjfowvqsccndswaqwbkhjwcxheazbzorithgqxyuzmyukakgduqpqsmzymzznnsyizgazhvatvufxemaacrrweswsrxieqgoropqvmrqjnwgsiismalkg";
        int ch[] = new int[26];
        for (int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a'] = ch[s.charAt(i)-'a'] + 1;
        }
        ArrayList<Integer> count = new ArrayList<>();
        for (int i =0;i<ch.length;i++){
            if (ch[i] != 0)
                count.add(ch[i]);
        }
        System.out.println(count);
        int flag=0;
        for (int i=0;i<count.size();i++){
            if (count.get(i)%2 != 0) {
                flag++;
            }
        }
        if (flag  > 1)
            System.out.println("NO");
        else
            System.out.println("YES");


    }
}

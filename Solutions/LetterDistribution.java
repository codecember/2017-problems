import java.util.*;
/*
* Here is Microsoft Tech Support's (Maheen Hussain, Yaqin al-Amin, Abdullah Ahmad) solution to Letter Distribution
*/
class LetterNode implements Comparable<LetterNode>
{
    public Character c;
    public Integer n;

    public LetterNode(Character c, Integer n)
    {
        this.c = c;
        this.n = n;
    }

    public int compareTo(LetterNode n)
    {
        return n.n - this.n;
    }

    public String toString()
    {
        return c + " " + n;
    }
}

public class LetterDistribution 
{
    public static int searchByKey(ArrayList<LetterNode> arr,char c)
    {
        for(int i = 0; i < arr.size(); i++)
            if (arr.get(i).c == c)
                return i;
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        String paragraph = "";

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<LetterNode> tab = new ArrayList<>();
        char[] gg = letters.toCharArray();
        for (char c : gg)
            tab.add(new LetterNode(c, 0));

        while(key.hasNextLine())
            paragraph += key.nextLine();

        paragraph = paragraph.toUpperCase();
        char[] paragraphLetters = paragraph.toCharArray();
        for(char c : paragraphLetters)
        {
            int idx = searchByKey(tab, c);
            if (idx > -1)
            {
                tab.get(idx).n = tab.get(idx).n+1;
            }
        }

        Collections.sort(tab);

        for(LetterNode lole : tab)
        {
            System.out.print(lole.c + " ");
            for(int i = 0; i < lole.n; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}

package b_Easy;

/*
Write a function that stutters a word as if someone is struggling to read it. The first two letters are repeated twice with an ellipsis ... and space after each, and then the word is pronounced with a question mark ?.

Examples
stutter("incredible") ➞ "in... in... incredible?"
stutter("enthusiastic") ➞ "en... en... enthusiastic?"
stutter("outstanding") ➞ "ou... ou... outstanding?"

Notes
Assume all inputs are in lower case and at least two-character long.
 */
public class E_015_Substring {

    public static void main(String[] args) {

        System.out.println(print("Hello"));
    }

    static String print(String str){

        String add = str.substring(0,2) + "... ";


        return  add + add + str+ "?";

    }
}


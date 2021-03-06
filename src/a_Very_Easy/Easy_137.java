package a_Very_Easy;

/*
Backpack Bill and Wallet Will set off for the annual festival. As they approach the stalls, Bill retorts that he'll be able to bring home more stuff than Will. Taking this as a challenge, Will refutes and a competition spurs into action.

Backpack Bill has an infinite inventory space, but a limited number of coins.
Wallet Will has an infinite number of coins, but a limited inventory space.
Create a function that returns the name of the man who can bring home the most items. The parameters are given as follows:

Bill's amount of money.
Will's amount of inventory space.
The item's price.
The item's size.
Examples
whoWinsTonight(40, 95, 5, 10) ➞ "Will"
// The item costs 5 coins and takes up 10 inventory spaces.
// Bill can only buy a maximum of 8 items (40 coins DIV 5 = 8).
// Will can only bring home a maximum of 9 items. (95 inventory spaces DIV 10 = 9).
// Will is the winner.

whoWinsTonight(20, 20, 5, 10) ➞ "Bill"
whoWinsTonight(10, 2, 20, 1) ➞ "Will"
whoWinsTonight(3, 7, 2, 5) ➞ "Tie"
 */
public class Easy_137 {

    public static void main(String[] args) {

        System.out.println(print(40,95,5,10));
    }

    static String print(int a, int b, int c, int d){

          int bill = a/c;
          int will = b/d;
        System.out.println(will);
        System.out.println(bill);


          return  bill > will? "bill" : will > bill ?" will": "Tie";
    }
}

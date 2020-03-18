/*Jake Riggs*/
package  com.company;
public class Card {
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int DIAMONDS = 0;
    public static final int HEARTS = 1;
    public static final int CLUBS = 2;
    public static final int SPADES = 3;

    public static final String[] RANK_NAMES = {null, "Ace", "2", "3", "4", "5",
            "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUIT_NAMES = {"Diamonds", "Hearts", "Clubs", "Spades"};
  private int rank;
  private int suit;
  private  int value;
    /*Name:Card */
    /*Description:This is supposed to be the constructor for card object.  */
    /*Parameters:int rank int suit and int value are supposed to be the three values required to complete a card  */
    /*Return :N/A */
    public Card(int rank,int suit,int value){
      if(rank<1||rank>13) {
      throw new IllegalArgumentException();
      }
        this.rank=rank;
      if(suit<0||suit>3) {
      throw new IllegalArgumentException();
      }
      this.suit=suit;
      this.value=value;

  }

  /*Name:getRank */
  /*Description:This is supposed to secure the rank.  */
  /*Parameters:Not at all  */
  /*Return int:This is supposed to be the individual int that represents the rank  */
   public int getRank(){
       return rank;
    }
    /*Name:getSuit */
    /*Description:This is supposed to secure the suit.  */
    /*Parameters:Not at all  */
    /*Return int:This is supposed to be the individual int that represents the suit  */
    public int getSuit(){
        return suit;
   }
    /*Name:getValue */
    /*Description:This is supposed to secure the value.  */
    /*Parameters:Not at all  */
    /*Return int:This is supposed to be the individual int that represents the value  */
  public int getValue(){
        return value;
  }
    /*Name:setValue */
    /*Description:This is supposed to set a value if a new one is created.  */
    /*Parameters:This is supposed to be the new value.  */
    /*Return int:None */
    public void setValue(int value) {

            if (value<0){
                throw new IllegalArgumentException();
            }
        this.value = value;
    }
    /*Name:toString */
    /*Description:This is supposed to convert the Card type into a string.  */
    /*Parameters:Not at all  */
    /*Return int:This is supposed to be the string.  */
  public String toString(){
        return "rank "+ rank+"," +" suit "+ suit+","+" value "+ value ;
  }
  public Card(int rk,int st){
      rank=rk;
      suit=st;
      value=rk;
      if (rk==1){
          value=11;
      }
  }

}



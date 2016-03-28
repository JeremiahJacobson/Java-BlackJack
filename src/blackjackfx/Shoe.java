package blackjackfx;

/**
 *
 * @author Expression jjacobson is undefined on line 8, column 14 in
 * Templates/Classes/Class.java.
 */
public class Shoe extends Deck {

    public Shoe()
    {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        Deck deck3 = new Deck();
        Deck deck4 = new Deck();
        Deck deck5 = new Deck();
        Deck deck6 = new Deck();
        Deck deck7 = new Deck();

        for (int i = 0; i <= 51; i++)
        {
            this.push(deck1.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck2.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck3.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck4.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck5.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck6.pop());
        }
        for (int i = 0; i <= 51; i++)
        {
            this.push(deck7.pop());
        }
        this.shuffle();
    }

}

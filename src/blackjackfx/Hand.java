package blackjackfx;

import java.util.ArrayList;

/**
 *
 * @author jjacobson
 * 
 */
public class Hand extends ArrayList<Card> {

    private int handValue = 0;

    public Hand()
    {

    }

    public void setHandValue()
    {
        this.handValue = calculateHandValue(this, handValue);

    }

    public Card getCard(int i)
    {
        return this.get(i);
    }

    public int getHandValue()
    {
        return handValue;
    }

    private int calculateHandValue(Hand hand, int handValue)
    {
        handValue = 0;

        for (Card card : hand)
        {
            handValue = handValue + card.value.rank;
        }
        for (Card card : hand)
        {
            if (card.value == Value.ACE)
            {
                if (handValue > 21)
                {
                    handValue = handValue - 10;
                }
            }
        }
        return handValue;

    }
}

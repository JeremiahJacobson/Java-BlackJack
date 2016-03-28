package blackjackfx;

/**
 *
 * @author jjacobson
 *
 */
import java.util.Random;
import java.util.Stack;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Deck extends Stack<Card> {

    //take in images for cards
    Image twoOfDiamondsImage = new Image("2diamond.png");
    ImageView twoOfDiamondsImageView = new ImageView(twoOfDiamondsImage);

    Image threeOfDiamondsImage = new Image("3diamond.png");
    ImageView threeOfDiamondsImageView = new ImageView(threeOfDiamondsImage);

    Image fourOfDiamondsImage = new Image("4diamond.png");
    ImageView fourOfDiamondsImageView = new ImageView(fourOfDiamondsImage);

    Image fiveOfDiamondsImage = new Image("5diamond.png");
    ImageView fiveOfDiamondsImageView = new ImageView(fiveOfDiamondsImage);

    Image sixOfDiamondsImage = new Image("6diamond.png");
    ImageView sixOfDiamondsImageView = new ImageView(sixOfDiamondsImage);

    Image sevenOfDiamondsImage = new Image("7diamond.png");
    ImageView sevenOfDiamondsImageView = new ImageView(sevenOfDiamondsImage);

    Image eightOfDiamondsImage = new Image("8diamond.png");
    ImageView eightOfDiamondsImageView = new ImageView(eightOfDiamondsImage);

    Image nineOfDiamondsImage = new Image("9diamond.png");
    ImageView nineOfDiamondsImageView = new ImageView(nineOfDiamondsImage);

    Image tenOfDiamondsImage = new Image("10diamond.png");
    ImageView tenOfDiamondsImageView = new ImageView(tenOfDiamondsImage);

    Image jackOfDiamondsImage = new Image("jackDiamond.png");
    ImageView jackOfDiamondsImageView = new ImageView(jackOfDiamondsImage);

    Image queenOfDiamondsImage = new Image("queendiamond.png");
    ImageView queenOfDiamondsImageView = new ImageView(queenOfDiamondsImage);

    Image kingOfDiamondsImage = new Image("kingDiamond.png");
    ImageView kingOfDiamondsImageView = new ImageView(kingOfDiamondsImage);

    Image aceDiamond = new Image("aceDiamond.png");
    ImageView aceOfDiamondsImageView = new ImageView(aceDiamond);

    Image twoOfHeartsImage = new Image("2heart.png");
    ImageView twoOfHeartsImageView = new ImageView(twoOfHeartsImage);

    Image threeOfHeartsImage = new Image("3heart.png");
    ImageView threeOfHeartsImageView = new ImageView(threeOfHeartsImage);

    Image fourOfHeartsImage = new Image("4heart.png");
    ImageView fourOfHeartsImageView = new ImageView(fourOfHeartsImage);

    Image fiveOfHearts = new Image("5heart.png");
    ImageView fiveOfHeartsImageView = new ImageView(fiveOfHearts);

    Image sixOfHearts = new Image("6heart.png");
    ImageView sixOfHeartsImageView = new ImageView(sixOfHearts);

    Image sevenOfHearts = new Image("7heart.png");
    ImageView sevenOfHeartsImageView = new ImageView(sevenOfHearts);

    Image eightOfHearts = new Image("8heart.png");
    ImageView eightOfHeartsImageView = new ImageView(eightOfHearts);

    Image nineOfHearts = new Image("9heart.png");
    ImageView nineOfHeartsImageView = new ImageView(nineOfHearts);

    Image tenOfHearts = new Image("10heart.png");
    ImageView tenOfHeartsImageView = new ImageView(tenOfHearts);

    Image jackOfHearts = new Image("jackHeart.png");
    ImageView jackOfHeartsImageView = new ImageView(jackOfHearts);

    Image queenOfHearts = new Image("queenHeart.png");
    ImageView queenOfHeartsImageView = new ImageView(queenOfHearts);

    Image kingOfHearts = new Image("kingHeart.png");
    ImageView kingOfHeartsImageView = new ImageView(kingOfHearts);

    Image aceOfHearts = new Image("aceHearts.png");
    ImageView aceOfHeartsImageView = new ImageView(aceOfHearts);

    Image twoOfClubs = new Image("2club.png");
    ImageView twoOfClubsImageView = new ImageView(twoOfClubs);

    Image threeOfClubs = new Image("3club.png");
    ImageView threeOfClubsImageView = new ImageView(threeOfClubs);

    Image fourOfClubs = new Image("4club.png");
    ImageView fourOfClubsImageView = new ImageView(fourOfClubs);

    Image fiveOfClubs = new Image("5club.png");
    ImageView fiveOfClubsImageView = new ImageView(fiveOfClubs);

    Image sixOfClubs = new Image("6club.png");
    ImageView sixOfClubsImageView = new ImageView(sixOfClubs);

    Image sevenOfClubs = new Image("7club.png");
    ImageView sevenOfClubsImageView = new ImageView(sevenOfClubs);

    Image eightOfClubs = new Image("8club.png");
    ImageView eightOfClubsImageView = new ImageView(eightOfClubs);

    Image nineOfClubs = new Image("9club.png");
    ImageView nineOfClubsImageView = new ImageView(nineOfClubs);

    Image tenOfClubs = new Image("10club.png");
    ImageView tenOfClubsImageView = new ImageView(tenOfClubs);

    Image jackOfClubs = new Image("jackClub.png");
    ImageView jackOfClubsImageView = new ImageView(jackOfClubs);

    Image queenOfClubs = new Image("queenclub.png");
    ImageView queenOfClubsImageView = new ImageView(queenOfClubs);

    Image kingOfClubs = new Image("kingClub.png");
    ImageView kingOfClubsImageView = new ImageView(kingOfClubs);

    Image aceOfClubs = new Image("aceClub.png");
    ImageView aceOfClubsImageView = new ImageView(aceOfClubs);

    Image twoOfSpades = new Image("2spade.png");
    ImageView twoOfSpadesImageView = new ImageView(twoOfSpades);

    Image threeOfSpades = new Image("3spade.png");
    ImageView threeOfSpadesImageView = new ImageView(threeOfSpades);

    Image fourOfSpades = new Image("4spade.png");
    ImageView fourOfSpadesImageView = new ImageView(fourOfSpades);

    Image fiveOfSpades = new Image("5spade.png");
    ImageView fiveOfSpadesImageView = new ImageView(fiveOfSpades);

    Image sixOfSpades = new Image("6spade.png");
    ImageView sixOfSpadesImageView = new ImageView(sixOfSpades);

    Image sevenOfSpades = new Image("7spade.png");
    ImageView sevenOfSpadesImageView = new ImageView(sevenOfSpades);

    Image eightOfSpades = new Image("8spade.png");
    ImageView eightOfSpadesImageView = new ImageView(eightOfSpades);

    Image nineOfSpades = new Image("9spade.png");
    ImageView nineOfSpadesImageView = new ImageView(nineOfSpades);

    Image tenOfSpades = new Image("10spade.png");
    ImageView tenOfSpadesImageView = new ImageView(tenOfSpades);

    Image jackOfSpades = new Image("jackSpade.png");
    ImageView jackOfSpadesImageView = new ImageView(jackOfSpades);

    Image queenOfSpades = new Image("queenSpade.png");
    ImageView queenOfSpadesImageView = new ImageView(queenOfSpades);

    Image kingOfSpades = new Image("kingSpade.png");
    ImageView kingOfSpadesImageView = new ImageView(kingOfSpades);

    Image aceOfSpades = new Image("aceSpade.png");
    ImageView aceOfSpadesImageView = new ImageView(aceOfSpades);

    public Deck()
    {
        this.push(new Card(Suit.CLUB, Value.ACE, aceOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.TWO, twoOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.THREE, threeOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.FOUR, fourOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.FIVE, fiveOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.SIX, sixOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.SEVEN, sevenOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.EIGHT, eightOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.NINE, nineOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.TEN, tenOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.JACK, jackOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.QUEEN, queenOfClubsImageView));
        this.push(new Card(Suit.CLUB, Value.KING, kingOfClubsImageView));

        this.push(new Card(Suit.HEART, Value.ACE, aceOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.TWO, twoOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.THREE, threeOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.FOUR, fourOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.FIVE, fiveOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.SIX, sixOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.SEVEN, sevenOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.EIGHT, eightOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.NINE, nineOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.TEN, tenOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.JACK, jackOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.QUEEN, queenOfHeartsImageView));
        this.push(new Card(Suit.HEART, Value.KING, kingOfHeartsImageView));

        this.push(new Card(Suit.DIAMOND, Value.ACE, aceOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.TWO, twoOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.THREE, threeOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.FOUR, fourOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.FIVE, fiveOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.SIX, sixOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.SEVEN, sevenOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.EIGHT, eightOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.NINE, nineOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.TEN, tenOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.JACK, jackOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.QUEEN, queenOfDiamondsImageView));
        this.push(new Card(Suit.DIAMOND, Value.KING, kingOfDiamondsImageView));

        this.push(new Card(Suit.SPADE, Value.ACE, aceOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.TWO, twoOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.THREE, threeOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.FOUR, fourOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.FIVE, fiveOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.SIX, sixOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.SEVEN, sevenOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.EIGHT, eightOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.NINE, nineOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.TEN, tenOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.JACK, jackOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.QUEEN, queenOfSpadesImageView));
        this.push(new Card(Suit.SPADE, Value.KING, kingOfSpadesImageView));

    }

    public void shuffle()
    {
        int index;
        Card temp;
        Random random = new Random();

        for (int i = 0; i < this.size(); i++)
        {
            index = random.nextInt(i + 1);
            temp = this.get(index);
            this.set(index, this.get(i));
            this.set(i, temp);

        }
    }

}

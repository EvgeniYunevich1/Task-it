package Lesson7;

public class Main {
    public static void main(String[] args) {
        Card card=new Card();
        CardVisa cardVisa = new CardVisa();
        CardMasterCard cardMasterCard = new CardMasterCard();
        System.out.println(card.BankAccout);
        cardVisa.BankAccout();
        cardVisa.СontactlessBank();
        cardMasterCard.InternationalCard();
        cardMasterCard.BankAccout();
        cardMasterCard.СontactlessBank();
    }
}

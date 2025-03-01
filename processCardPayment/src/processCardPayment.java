public class processCardPayment {
    
    public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
        int cardLength = cardNumber.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

        String blacklistedNumber = "12345678901234";
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
        }

        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardNumber.length() - 4));

        StringBuilder cardNumberToDisplay = new StringBuilder(cardNumber);
        for (int i = 1; i < cardNumber.length() - 4; i++) {
            cardNumberToDisplay.setCharAt(i, '*');
        }
        String cardNumberToDisplay3 = cardNumberToDisplay.toString();

        System.out.println("First digit of the card: " + firstCardDigit);
        System.out.println("Last four digits of the card: " + lastFourDigits);
        System.out.println("Card number to display: " + cardNumberToDisplay3);
    }

    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder specialInfo = new StringBuilder();
        specialInfo.append("Pizza of the day: ").append(pizzaOfTheDay);
        specialInfo.append("\nSide of the day: ").append(sideOfTheDay);
        specialInfo.append("\nSpecial price: ").append(specialPrice);
        System.out.println(specialInfo.toString());
    }

    public static void main(String[] args) {
        processCardPayment soh = new processCardPayment();
        soh.processCardPayment("12345678901234", "12/25", 123);
        soh.specialOfTheDay("Pepperoni Pizza", "Garlic Bread", "$15");
    }
}
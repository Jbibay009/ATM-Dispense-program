public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        
        int amount = 2970;

        int lastTwoDigits = amount % 100;

        if (amount % 10 != 0) {
            System.out.println("Error: Amount should be in multiples of 10s.");
        } else if (lastTwoDigits == 10 || lastTwoDigits == 30 || lastTwoDigits == 60 || lastTwoDigits == 80) {
            System.out.println("Error: This ATM cannot dispense amounts ending in " + lastTwoDigits + 
                               " because it prioritizes 50s over multiple 20s.");
        } else if (amount == 0) {
            System.out.println("Error: Please enter an amount greater than 0.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}

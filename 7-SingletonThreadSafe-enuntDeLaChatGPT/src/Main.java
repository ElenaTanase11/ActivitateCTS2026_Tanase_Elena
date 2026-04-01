//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketValidator validator1 = TicketValidator.getInstance(true, "Validator1", 10);
        TicketValidator validator2 = TicketValidator.getInstance(false, "Validator2", 10);

        System.out.println(validator1 == validator2);

        validator1.activateValidator();
        System.out.println(validator1.getValidatedTickets());
        System.out.println(validator1.getValidatorName());
        System.out.println(validator1.isActive());
        validator1.deactivateValidator();
        System.out.println(validator2.isActive());
    }
}
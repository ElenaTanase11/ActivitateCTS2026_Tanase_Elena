public class TicketValidator implements ITicketValidator{
    private boolean validator;
    private String validatorName;
    private int validatedTickets;

    private static TicketValidator instance = null;

    private TicketValidator(boolean validator, String validatorName, int validatedTickets) {
        this.validator = validator;
        this.validatorName = validatorName;
        this.validatedTickets = validatedTickets;
    }

    public static synchronized TicketValidator getInstance(boolean validator, String validatorName, int validatedTickets){
        if (instance == null) {
            instance = new TicketValidator(validator, validatorName, validatedTickets);
        }
        return instance;
    }

    @Override
    public void activateValidator() {
        validator = true;
        System.out.println("Validator activat");
    }

    @Override
    public void deactivateValidator() {
        validator = false;
        System.out.println("Validator dezactivat");
    }

    @Override
    public String getValidatorName() {
        return validatorName;
    }

    @Override
    public int getValidatedTickets() {
        return validatedTickets;
    }

    @Override
    public boolean isActive() {
        return validator;
    }
}

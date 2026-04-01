public interface ITicketValidator {
    void activateValidator();
    void deactivateValidator();
    String getValidatorName();
    int getValidatedTickets();
    boolean isActive();
}
public class DukeExceptionHandler {
    public static void isBlank(String description) throws BlankStringException {
        if (description.isBlank()) {
            throw new BlankStringException();
        }
    }

    public static void unknownCommand() throws UnknownCommandException {
        throw new UnknownCommandException();
    }
}

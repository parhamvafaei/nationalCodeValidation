import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NationalCodeValidationException extends RuntimeException{
    public NationalCodeValidationException(String message) {
        super(message);
    }
}

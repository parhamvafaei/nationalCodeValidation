import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class NationalCode {

private String nationalCode ;
private Boolean isValid;
private final LocalDateTime createTime = LocalDateTime.now();
}

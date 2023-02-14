import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NationalCode {

private String nationalCode ;
private Boolean isValid;
private final LocalDateTime createTime = LocalDateTime.now();
}

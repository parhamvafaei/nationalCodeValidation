package case_one;

import lombok.*;

import java.time.LocalDateTime;



//use toString to print nationalCode object details
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NationalCode {

private String nationalCode ;
private Boolean isValid;
private final LocalDateTime createTime = LocalDateTime.now();
}

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class HeadMaster {
    private String name;
    private String officeNumber;

    @Getter(AccessLevel.NONE)
    private int age;
}

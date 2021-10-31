import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Professor {
    private String department;
    private String name;

    @Getter(AccessLevel.NONE)
    private int age;
}

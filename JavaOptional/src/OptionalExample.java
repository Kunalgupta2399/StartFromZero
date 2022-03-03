import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        String str = "java is love";
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        System.out.println(optional.orElse("No value in this object"));
      }
}

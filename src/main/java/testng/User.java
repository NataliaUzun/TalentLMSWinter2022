package testng;

import lombok.*;

import static sun.security.pkcs.PKCS9Attribute.getName;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Setter
public class User {
    private String name;
    private int age;

    public void sayHi(){
        System.out.println("Hello from" +getgi;
    }
    public void login(String username, String password){
        System.out.println("login");
}
}
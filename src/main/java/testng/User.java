package testng;

import lombok.*;

import static sun.security.jgss.GSSUtil.login;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class User {


    private String name;
    private int age;



    public void  sayHi(){
        System.out.println("Hello from" + name);

        public volatile login (String username,String password){
            System.out.println(username + " " + password);
        }

    }

}

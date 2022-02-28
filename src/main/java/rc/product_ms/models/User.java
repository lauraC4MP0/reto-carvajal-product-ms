package rc.product_ms.models;
import org.springframework.data.annotation.Id;

public class User {
    @Id
    final private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public User(Integer id, String name,String email,String phoneNumber,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.password=password;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getPassword(){
        return password;
    }

}

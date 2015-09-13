package logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Acer on 12.09.2015.
 */
@Entity
@Table(name="user")
public class User {
    private  Long id;
    private String name;
    private Long age;
public User(){
    name=null;
}
    public User (User u){
        name = u.getName();
    }
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
@Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Column(name="age")
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

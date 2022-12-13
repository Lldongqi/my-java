package com.demo.demo;

import com.demo.code.NumberArray;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer id;

    private String name;

    private Integer age;


    @Override
    public boolean equals(Object obj){
        User user = (User) obj;
        return  user.getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

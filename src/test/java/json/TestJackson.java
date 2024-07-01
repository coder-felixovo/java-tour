package json;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

public class TestJackson {

    @Data
    static class Person {
        private int age;
        private double balance;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setAge(18);
        person.setBalance(100.0);

        JSONObject object = new JSONObject();
        object.put("age", person.getAge());
        object.put("balance", person.getBalance());

        String jsonstr = object.toJSONString();
        System.out.println(jsonstr);

        ObjectMapper mapper = new ObjectMapper();
        Person person2 = mapper.readValue(jsonstr, Person.class);
        System.out.println(person2.getAge());
        System.out.println(person2.getBalance());
    }
}

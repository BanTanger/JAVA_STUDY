package com.bantanger.generic_;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        // 给泛型T指定泛型为User
        DAO<User> objectDAO = new DAO<>();
        objectDAO.save("001",new User(1,10,"jack"));
        objectDAO.save("002",new User(2,16,"mike"));
        objectDAO.save("003",new User(3,34,"smith"));
        objectDAO.save("004",new User(4,29,"king"));

        List<User> list = objectDAO.list();
        System.out.println(list);

        objectDAO.update("003",new User(3,58,"milan"));

        objectDAO.delete("001");

        System.out.println(objectDAO);
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    @Override
    public String toString() {
        return "\n"+"DAO{" +
                "map=" + map +
                '}';
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        // 遍历map，先得到所有的key
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));
        }
        return list;
     }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "\n"+"User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

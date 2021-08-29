package com.company.myCompany.basicJava.bloomerang;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User{
    private int id;
    private String name;
    private ArrayList<String> roles;

    User() {}
    User(int id, String name, ArrayList<String> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getRoles() {
        return this.roles;
    }
}
class Permission{
    private String role;
    private String name;
    private boolean active;
    Permission(){ }
    Permission(String role, String name, boolean active) {
        this.role = role;
        this.name= name;
        this.active = active;
    }
    public String getRole() {
       return this.role;
    }
    public boolean getActive() {
        return this.active;
    }

    public String getName() {
        return this.name;
    }
}
class Authorization{
    private List<User> users;
    private List<Permission> permissions;
    public Authorization(List<User> users, List<Permission> permissions) {
        this.users = users;
        this.permissions = permissions;
    }
    public User getUser(int userId) {
        for (User u : users) {
            if(u.getId() == userId)
                return u;
        }
        return null;
    }
    public Permission getActivePermission(String role){
        for (Permission permission : permissions) {
            if(permission.getActive())
                return permission;
        }
        return null;
    }
    public List<Permission> listPermissions(int userId) {
        ArrayList<Permission> listPermissions = new ArrayList<>();
        User user = getUser(userId);
        user.getRoles().forEach(role -> {
            listPermissions.add(getActivePermission(role));
        });
        return listPermissions;
    }

}
public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "User 1", new ArrayList<>(Arrays.asList("super", "admin", "simple")));
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        u1.getRoles().forEach(role -> {
            System.out.println(role);
        });
        User u2 = new User(2, "User 2", new ArrayList<>(Arrays.asList("rider")));
        System.out.println(u2.getId());
        System.out.println(u2.getName());
        u2.getRoles().forEach(role -> {
           System.out.println(role);
       });

        Permission p = new Permission("rider","Permission 1", true);
        List<Permission> permissions = new ArrayList<>();
        permissions.add(p);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);

        Authorization a = new Authorization(users, permissions);
        List<Permission> l= a.listPermissions(2);
        l.forEach(permission -> {
            System.out.println("Permissions list item "+permission.getName());
        });

//        User u3 = new User(1, "User 1", roles);
//        User u4 = new User(1, "User 1", roles);
//        User u5 = new User(1, "User 1", roles);
//        User u6 = new User(1, "User 1", roles);

    }
}


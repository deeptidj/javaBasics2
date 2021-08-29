package com.company.myCompany.basicJava.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Permission {
    public Permission() {}
    public Permission(String role, String name, boolean active) {
        this.role = role;
        this.name = name;
        this.active = active;
    }
    public String role;
    public String name;
    public boolean active;

}
class User {
    public User() {}
    public User(int id, String name, List<String> roles) {
        this.id = id;
        this.name = name;
        this.roles = roles;
    }
    public int id;
    public String name;
    public List<String> roles;
}
class Authorization {
    public List<Permission> permissions;
    public List<User> users;
    public Authorization(List<Permission> permissions, List<User> users) {
        this.permissions = permissions;
        this.users = users;
    }
    private User getUser(int userId) {
        for (User user : users) {
            if (user.id == userId) {
                return user;
            }
        }
        throw new IllegalArgumentException("User not found");
    }

    public Permission getPermissionOfActiveRolesOnly(String role) {
        for (Permission permission : permissions){
            if (permission.role == role && permission.active) {
                return permission;
            }
        }
            throw  new IllegalArgumentException("Permission not found for role");
    }


    public ArrayList<String> listPermissions(int userId) {
        ArrayList<String> listPermissions = new ArrayList<String>();
        User user = getUser(userId);
        List<String> roles = user.roles;
        for (String role: roles) {
            //find this permission name using the user's role.
            listPermissions.add(getPermissionOfActiveRolesOnly(role).name);
        }
        return listPermissions;
    }

    public boolean checkPermitted(String permissionName, int userId) {
        ArrayList<String> listPermittedPermissions =  listPermissions(userId);
        for (String permissionPermitted : listPermittedPermissions) {
            if (permissionPermitted.equalsIgnoreCase(permissionName)){
                return true;
            }
        }
        return false;
    }
}
class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Anna Administrator", new ArrayList<String>(Arrays.asList("superuser")));
        User user2 = new User(2, "Charles N. Charge", new ArrayList<String>(Arrays.asList("rider","charger")));
        User user3 = new User(7, "Ryder", new ArrayList<String>(Arrays.asList("rider")));
        User user4 = new User(11, "Unregistered Ulysses", new ArrayList<String>(Arrays.asList("")));
        User user5 = new User(18, "Tessa Tester", new ArrayList<String>(Arrays.asList("beta tester")));

        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        Permission permission1 = new Permission("superuser", "lock user account", true);
        Permission permission2 = new Permission("superuser", "unlock user account", true);
        Permission permission3 = new Permission("superuser", "purchase widgets", false);
        Permission permission4 = new Permission("charger", "view pick up locations", true);
        Permission permission5 = new Permission("rider", "view my profile", true);
        Permission permission6 = new Permission("rider", "scooters near me", true);

        ArrayList<Permission> permissions = new ArrayList<Permission>();
        permissions.add(permission1);
        permissions.add(permission2);
        permissions.add(permission3);
        permissions.add(permission4);
        permissions.add(permission5);
        permissions.add(permission6);

        Authorization authorization = new Authorization(permissions,users);

        int userId = 2;
        ArrayList<String> permissionForUser1 = authorization.listPermissions(userId);

        permissionForUser1.forEach(perUser1 -> {
            System.out.println(perUser1.toString());
        });
        System.out.println();
        System.out.println("Does user "+userId+" have perimission to view my profile ? " );
        System.out.println(authorization.checkPermitted("view my profile",userId));


    }

}
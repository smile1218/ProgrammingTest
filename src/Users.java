import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList = new ArrayList<IUser>();
    private String Username;
    private String Password;

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setType(type);
        return null;

    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(!userList.remove(user)){
            throw new RuntimeException();
        }
        else userList.remove(user);
    }



    // Return true if the user is in the list
    public boolean exists(IUser user) {
        return userList.contains(user);
    }

    // Return number of user in the list
    public int count() {
        int c=0;
        for(IUser i:userList){
            c++;
        }
        return c;
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        User user = new User();
        int c=0;
        for(IUser i:userList){
            if(user.getType() == type)c++;
        }
        return c;
    }
}

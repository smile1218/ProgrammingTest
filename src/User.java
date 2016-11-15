
public class User implements IUser {

    private String userName;
    private String password;
    private int type;

    public User(){

    }

    public User( int type ,String name, String password) {
        this.type = type;
       this.userName = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return this.userName;
    }

    @Override
    public String setName(String name) {
        String A = "(^[A-Za-z0-9]{8,}$)";
        if (name == null) {
            throw new RuntimeException("False");
        } else {
            if (name.matches(A)){
            this.userName = name;
        }}
        return null;
    }

    @Override
    public String setPassword(String password) {
        if (isPasswordCorrect(password)) {
            this.password = password;

        }else {
            throw new RuntimeException("False");
        }
        return null;
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        String A = "(^{8,}$)";
            if (password.matches(A) && password != null ){
            return true;}
        else { return false;
        }

    }


    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public int setType(int type){
        if (type == 1 || type == 2)
        this.type = type;
        return type;
    }

}

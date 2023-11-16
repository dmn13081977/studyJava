import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserProfile implements Serializable {
    private static final long serialVersionUID = 26292552485L;

    private String login;
    private String email;
    private transient String password;

    public UserProfile(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        String encryptPassword = encrypt(password);
        oos.writeObject(encryptPassword);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        password = decrypt((String) ois.readObject());
    }

    private String encrypt(String password) {
        StringBuilder sb = new StringBuilder();
        for (char c : password.toCharArray()) {
            int pos = (int) c + 1;
            sb.append((char) pos);
        }
        return sb.toString();
    }

    private String decrypt(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int pos = (int) c - 1;
            sb.append((char) pos);
        }
        return sb.toString();
    }


//    private String encrypt(String string) {
//        StringWriter sw = new StringWriter();
//        string.chars().map(c -> ++c).forEach(sw::write);
//        return sw.toString();
//    }
//
//    private String decrypt(String string) {
//        StringWriter sw = new StringWriter();
//        string.chars().map(c -> --c).forEach(sw::write);
//        return sw.toString();
//    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
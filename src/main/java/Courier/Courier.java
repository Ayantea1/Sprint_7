package Courier;

public class Courier {
    private String login;
    private String password;
  //  private String firstName;

    public Courier() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Courier(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

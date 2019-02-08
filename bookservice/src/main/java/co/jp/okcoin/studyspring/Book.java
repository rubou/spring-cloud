package co.jp.okcoin.studyspring;

public class Book {
    private String name;

    private String auth;

    private String createDate;

    public String getName() {
        return name;
    }

    public String getAuth() {
        return auth;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setName(String argName) {
        this.name = argName;
    }

    public void setAuth(String argAuth) {
        this.auth = argAuth;
    }

    public void setCreateDate(String argCreateDate) {
        this.createDate = argCreateDate;
    }
}

package hqfuture.Domain;

public class User {
    private int userid;
    private String countnum;
    private String password;
    private String sex;
    private String name;
    private String phone;
    private String email;
    private String identity;

    public User() {
    }

    public User(int userid, String countnum, String password, String sex, String name, String phone, String email, String identity) {
        this.userid = userid;
        this.countnum = countnum;
        this.password = password;
        this.sex = sex;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.identity = identity;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getCountnum() {
        return countnum;
    }

    public void setCountnum(String countnum) {
        this.countnum = countnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", countnum='" + countnum + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}

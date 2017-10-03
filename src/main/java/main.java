public class main {
    public static void main(String args[]){
        User user1 = new User();
        UserInfo userInfo1 =new UserInfo();
        user1.setUserInfo(userInfo1);
        user1.setUserName("Ivan");
        user1.getUserInfo().setAge(24);
        user1.getUserInfo().setSex(true);
    }
}

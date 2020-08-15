public class Application {

    public static void main(String[] args){

        User2 user = new User2("Adam", 40.5,178);

        if(user.name != null){
            if (user.age > 30 && user.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            }
            else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}

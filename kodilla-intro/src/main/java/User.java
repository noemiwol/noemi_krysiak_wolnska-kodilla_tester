public class User {
   private int age;
   private String name;

   int getAge(){
       return age;
   }

    String getName(){
       return name;
    }


    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        User[] user = new User[4];
        user[0] = new User("Dax", 35);
        user[1] = new User("Sisko", 42);
        user[2] = new User("Gul Dukat", 67);
        user[3] = new User("Worf", 45);


        for(int i = 0; i < user.length; i++){
            if(user[i].getAge() < averageAge(user)){
                System.out.println(user[i].getName());
            }
        }
    }
    public static double averageAge(User[] user){
        double sumaverageAge = 0.0;

        for (int i =0; i < user.length;i++ ){
            sumaverageAge += user[i].getAge();
        }
        return (user.length == 0) ? 0 : sumaverageAge / user.length;
    }



}







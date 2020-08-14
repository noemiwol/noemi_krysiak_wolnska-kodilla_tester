public class Grades {
    private  int[] grades;
    private  int size;


    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add (int value) {
        if(this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastAdded(){

        return this.grades[this.size];
    }

    public double averageGrade(){
        double sumArrayElements = 0.0;

        for (int i :grades ){
            sumArrayElements += i;
        }
        return (this.size == 0) ? 0 : sumArrayElements / this.size;
    }
}

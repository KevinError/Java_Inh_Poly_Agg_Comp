import aggregation.*;
public class AggregationMain {

    public static void main(String[] args){
        Course course = new Course(
                "Advanced Software Engineering",
                new Instructor("Nima", "Davarpanah", "3-2636"),
                new Textbook("Clean Code", "Robert Cecil Martin", "Pearson Education")
                );
        System.out.println(course);
    }
}

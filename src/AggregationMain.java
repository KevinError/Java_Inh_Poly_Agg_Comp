import aggregation.*;
public class AggregationMain {

    public static void main(String[] args){
//        Course course = new Course(
//                "Advanced Software Engineering",
//                new Instructor("Nima", "Davarpanah", "3-2636"),
//                new Textbook("Clean Code", "Robert Cecil Martin", "Pearson Education")
//                );
        Course course = new Course(
                "Advanced Software Engineering",
                new Instructor[]{
                        new Instructor("Nima", "Davarpanah", "3-2636"),
                        new Instructor("Kevin", "Kim", "4-2636")},
                new Textbook[]{
                        new Textbook("Clean Code", "Robert Cecil Martin", "Pearson Education"),
                        new Textbook("Clean book", "Kevin Kim", "Kevin Education")});
        System.out.println(course);
    }
}

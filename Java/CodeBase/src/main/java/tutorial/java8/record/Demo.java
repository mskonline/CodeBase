package tutorial.java8.record;

public class Demo {

    public static void main(String[] args) {
        DataRecord record = new DataRecord(1);
        System.out.println(record.val());
    }
}

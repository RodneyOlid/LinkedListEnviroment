public class LinkedListTest {
    public static void main(String[] args){
        Mylist<String> SampleList = new Mylist<String>();
        SampleList.insertAtFront("Sample 1");
        SampleList.insertAtFront("Sample 2");
        SampleList.insertAtFront("Sample 3");
        SampleList.insertAtBack("Sample 4");
        SampleList.print();
        System.out.println(SampleList.size());

    }
}

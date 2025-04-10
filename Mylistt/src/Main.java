// Main.java
public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        // Thêm một số phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(5);

        // In danh sách
        list.printList(); // Kết quả: 5 -> 10 -> 20 -> None

        // Xóa một phần tử
        list.delete(10);
        list.printList(); // Kết quả: 5 -> 20 -> None

        // Tìm kiếm một phần tử
        System.out.println(list.search(20)); // Kết quả: true
    }
}
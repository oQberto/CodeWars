import Strings.Likes;

public class Main {
    public static void main(String[] args) {
        System.out.println(Likes.whoLikesIt());
        System.out.println(Likes.whoLikesIt("Peter"));
        System.out.println(Likes.whoLikesIt("Jacob", "Alex"));
        System.out.println(Likes.whoLikesIt("Alex", "Jacob", "Mark"));
        System.out.println(Likes.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
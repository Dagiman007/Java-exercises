public class StringBuilderCapLen{
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hi, What\'s up?");

        System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n",
            buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.println("New capacity = " + buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d\nbuffer = %s\n", buffer.length(), buffer.toString());
    }
}

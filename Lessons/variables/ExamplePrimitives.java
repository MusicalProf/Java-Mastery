package variables;

public class ExamplePrimitives {
    public static void main(String[] args){
        byte b = 34; // 8 bits - 2^8 options = 256: -127 to 127
        short s = 23000; // 16 bits - 2^16 options
        int i = 45000; // 32 bits - 2 ^ 32 options
        long l = 12345678901L; // 64 bits - 2^64 options

        float f = 3.3f; // 32 bits - 2^32 options
        double d = 3.232423482; // 64 bits - 2^64 options

        char c = 'a'; // 16 bits - 2^16 options
        char c1 = 45;

        boolean yes = true; // 1 bit/undefined - 2^1 options = 2
    }
}

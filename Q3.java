public class Q3 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2; // Starting from the first prime number

        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true; // 2 is the only even prime number
        if (num % 2 == 0)
            return false; // Other even numbers are not primes

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

git add Q3.java


git commit -m "Add Java program to print the first 10 prime numbers"

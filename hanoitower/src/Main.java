public class Main {
    static void tower(int n, char from_rod, char to_rod, char helper){
        if (n==1){
            System.out.println("take disk 1 from rod " + from_rod + " to rod "+ to_rod);
            return;

        }
        tower(n-1, from_rod, helper, to_rod);
        System.out.println("take disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        tower(n-1, helper, to_rod,from_rod);
    }
    public static void main(String[] args) {
        int n = 5;
        tower(n, 'a', 'c', 'b');
    }
}

//https://www.digitalocean.com/community/tutorials/tower-of-hanoi
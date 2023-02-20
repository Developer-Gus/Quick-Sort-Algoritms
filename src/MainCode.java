
public class MainCode {
    public static void main(String[] args) {
        int[] vector = new int[10];

        //Here we are making a vector with random integer numbers
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random() * vector.length);
        }
        System.out.println("Disordered");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        quicksort(vector, 0, vector.length - 1);

        System.out.println("Ordered");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
        //QUICK SORT
        static void quicksort(int[] vector, int left, int right){
            if (left < right) {
                int part = particle(vector, left, right);
                quicksort(vector, left, part);
                quicksort(vector, part + 1, right);
            }
        }
        //Now, this is the way that pivot did inside the vector
        static int particle(int[] vector, int left, int right){
            int mid = (int) (left + right) / 2;
            int pivot = vector[mid];
            int i = left - 1;
            int j = right + 1;
            while (true) {
                do {
                    i++;
                } while (vector[i] < pivot);
                do {
                    j--;
                } while (vector[j] > pivot);
                if (i >= j) {
                    return j;
                }
                int aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
            }
        }
    }

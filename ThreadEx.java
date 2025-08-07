class NumberPrinter {
    private int current = 1; // Shared variable to track the current number

    public synchronized void printOdd() {
        while (current <= 10) {
            while (current % 2 == 0) { // Wait if it's not this thread's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (current <= 10) {
                System.out.println("Thread-Odd: " + current);
                current++;
                notify(); 
            }
        }
    }

    public synchronized void printEven() {
        while (current <= 10) {
            while (current % 2 != 0) { // Wait if it's not this thread's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (current <= 10) {
                System.out.println("Thread-Even: " + current);
                current++;

                notify(); // Notify the other thread
            }
        }
    }



    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        // Create threads
        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        // Start threads
        oddThread.start();
        evenThread.start();

        // Wait for threads to finish
        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

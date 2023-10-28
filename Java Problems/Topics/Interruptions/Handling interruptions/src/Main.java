class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (true) {
            counter++;
            if (Thread.interrupted()) {
                System.out.println("It was interrupted");
                return;
            }
        }
    }
}
class NumbersThread extends Thread {
    int a;
    int b;
    public NumbersThread(int from, int to) {
        a = from;
        b = to;
    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) System.out.println(i);
    }
}
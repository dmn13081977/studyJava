class UseThreadLocal {
    public static ThreadLocal<Integer> makeThreadLocal(int counter) {
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> counter + 1);
        return threadLocal;
    }
}
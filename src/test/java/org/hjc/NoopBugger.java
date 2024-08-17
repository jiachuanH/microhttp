package org.hjc;

public final class NoopBugger implements Bugger{

    private static final NoopBugger INSTANCE = new NoopBugger();

    private NoopBugger() {
    }

    @Override
    public void add() {
        System.out.println("hello");
    }

    public static Bugger instance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Bugger bugger = NoopBugger.instance();
        bugger.add();
    }
}

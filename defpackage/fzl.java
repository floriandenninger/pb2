package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzl {
    public static final fzl a = new fzl(0);
    public static final fzl b = new fzl(2);
    public static final fzl c = new fzl(1);
    private final int d;

    private fzl(int i) {
        this.d = i;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final boolean b() {
        return this.d == 2;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL" : "HIDDEN_REVEAL_ON_ANY_PULL_ACTION" : "ALWAYS_SHOWN";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzt {
    public static final fzt a = new fzt(0);
    public static final fzt b = new fzt(2);
    public static final fzt c = new fzt(1);
    public final int d;

    private fzt(int i) {
        this.d = i;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL" : "HIDDEN_REVEAL_ON_ANY_PULL_ACTION" : "ALWAYS_SHOWN";
    }
}

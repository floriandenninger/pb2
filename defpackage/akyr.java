package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyr {
    public static final akyr a = new akyr(true, 0);
    public final boolean b;
    public final int c;

    private akyr() {
        this(true, 0);
    }

    private akyr(boolean z, int i) {
        this.b = z;
        this.c = i;
    }

    public static akyr a(int i) {
        return new akyr(false, i);
    }
}

package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anfa {
    static final anfa a;
    static final anfa b;
    final boolean c;
    final Throwable d;

    static {
        if (anfm.g) {
            b = null;
            a = null;
        } else {
            b = new anfa(false, null);
            a = new anfa(true, null);
        }
    }

    public anfa(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

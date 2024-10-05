package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aej {
    static final aej a;
    static final aej b;
    final boolean c;
    final Throwable d;

    static {
        if (aer.a) {
            b = null;
            a = null;
        } else {
            b = new aej(false, null);
            a = new aej(true, null);
        }
    }

    public aej(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cep {
    static final cep a;
    static final cep b;
    final boolean c;
    final Throwable d;

    static {
        if (cex.a) {
            b = null;
            a = null;
        } else {
            b = new cep(false, null);
            a = new cep(true, null);
        }
    }

    public cep(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

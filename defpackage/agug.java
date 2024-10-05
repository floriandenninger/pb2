package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agug extends RuntimeException {
    public final boolean a;
    public final agnf b;
    public final atqs c;

    private agug(boolean z, String str, Exception exc, agnf agnfVar, atqs atqsVar) {
        super(str, exc);
        this.a = z;
        this.b = agnfVar;
        this.c = atqsVar;
    }

    public static agug a(String str, Exception exc, agnf agnfVar, atqs atqsVar) {
        return new agug(true, str, exc, agnfVar, atqsVar);
    }

    public static agug b(String str, Exception exc, agnf agnfVar, atqs atqsVar) {
        return new agug(false, str, exc, agnfVar, atqsVar);
    }
}

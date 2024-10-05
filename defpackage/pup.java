package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pup {
    private final Object a = new Object();
    private pxn b;

    public final pxn a() {
        pxn pxnVar;
        synchronized (this.a) {
            pxnVar = this.b;
        }
        return pxnVar;
    }

    public final void b(pxn pxnVar) {
        synchronized (this.a) {
            this.b = pxnVar;
        }
    }
}

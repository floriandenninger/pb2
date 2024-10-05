package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class syx {
    private final Object a = new Object();
    private volatile Object b;

    public final Object a(syw sywVar) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = sywVar.a();
                }
            }
        }
        return this.b;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axzz {
    public final axzj a;
    public final axzo b;
    public final int c;
    public final boolean d;

    public axzz(axzj axzjVar, axzo axzoVar, int i, boolean z) {
        axzjVar.getClass();
        this.a = axzjVar;
        axzoVar.getClass();
        this.b = axzoVar;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("transportAttrs", this.a);
        Y.b("callOptions", this.b);
        Y.e("previousAttempts", this.c);
        Y.g("isTransparentRetry", this.d);
        return Y.toString();
    }
}

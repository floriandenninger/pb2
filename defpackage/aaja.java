package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaja {
    private final Class a;
    private final String b;
    private final amrp c = new amrp();
    private final amrp d = new amrp();

    public aaja(Class cls, String str) {
        this.a = cls;
        this.b = str;
    }

    public final aajb a() {
        return new aajb(this.b, this.a, this.c.g(), this.d.g());
    }

    public final void b(aajc aajcVar, aajc... aajcVarArr) {
        this.c.h(aajcVar);
        this.c.i(aajcVarArr);
    }
}

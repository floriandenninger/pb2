package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aifx implements aiga {
    public abstract owi a(Object obj);

    public abstract String c(Object obj);

    public abstract String d(Object obj);

    public abstract boolean e(Object obj, Object obj2);

    @Override // defpackage.aiga
    public final owi h(apxf apxfVar) {
        return a(i(apxfVar));
    }

    public final Object i(apxf apxfVar) {
        apxfVar.getClass();
        amkq.E(apxfVar.pY(b()));
        return apxfVar.pX(b());
    }

    @Override // defpackage.aiga
    public final String j(apxf apxfVar) {
        return c(i(apxfVar));
    }

    @Override // defpackage.aiga
    public final String k(apxf apxfVar) {
        return d(i(apxfVar));
    }

    @Override // defpackage.aiga
    public final boolean l(apxf apxfVar, apxf apxfVar2) {
        return e(i(apxfVar), i(apxfVar2));
    }
}

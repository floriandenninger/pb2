package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhf {
    private apxf a;

    public fhf(apxf apxfVar) {
        apxfVar.getClass();
        this.a = apxfVar;
    }

    public final synchronized apxf a() {
        return this.a;
    }

    public final synchronized String b() {
        apxf apxfVar;
        aiga a;
        apxfVar = this.a;
        a = aigb.a(apxfVar);
        return a != null ? a.j(apxfVar) : "";
    }

    public final synchronized String c() {
        apxf apxfVar;
        aiga a;
        apxfVar = this.a;
        a = aigb.a(apxfVar);
        return a != null ? a.k(apxfVar) : "";
    }

    public final synchronized void d(apxf apxfVar) {
        apxfVar.getClass();
        if (this.a != apxfVar && f(apxfVar)) {
            this.a = apxfVar;
        }
    }

    public final synchronized boolean e() {
        return this.a.pY(atrs.a);
    }

    public final synchronized boolean f(apxf apxfVar) {
        return aigb.d(this.a, apxfVar);
    }
}

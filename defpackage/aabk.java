package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabk {
    final /* synthetic */ aabl a;

    public aabk(aabl aablVar) {
        this.a = aablVar;
    }

    public final void a() {
        aabl aablVar = this.a;
        if (!aablVar.h) {
            aablVar.c.g();
            return;
        }
        aabq aabqVar = aablVar.c;
        aaaa a = aabqVar.a();
        if (a == null) {
            aabqVar.g();
            return;
        }
        if (!aabqVar.p(a)) {
            zga.l("Teaser clicked for a card that is not in the current InfoCardCollection.");
            return;
        }
        arhj e = a.e();
        aabqVar.a.a(e.e);
        aabqVar.c(e.h.I());
        if ((e.b & 64) == 0) {
            aabqVar.m(aabqVar.d.b().indexOf(a), true);
            return;
        }
        aahd aahdVar = aabqVar.w;
        apxf apxfVar = e.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
    }

    public final void b() {
        aabq aabqVar = this.a.c;
        aaaa a = aabqVar.a();
        if (a == null || !aabqVar.p(a)) {
            return;
        }
        aabqVar.a.a(a.e().g);
    }

    public final void c() {
        aabl aablVar = this.a;
        aablVar.h = false;
        aablVar.i();
    }
}

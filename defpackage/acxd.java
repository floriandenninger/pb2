package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxd {
    private final acpl a;
    private final axpg b;

    public acxd(acpl acplVar, axpg axpgVar) {
        this.a = acplVar;
        this.b = axpgVar;
    }

    public final void a(atbh atbhVar) {
        b(atbhVar, null, false);
    }

    public final void b(atbh atbhVar, Integer num, boolean z) {
        atak a = atal.a();
        a.copyOnWrite();
        ((atal) a.instance).i(atbhVar);
        if (num != null) {
            int intValue = num.intValue();
            a.copyOnWrite();
            ((atal) a.instance).h(intValue);
            a.copyOnWrite();
            ((atal) a.instance).g(z);
        }
        adlm g = ((adlt) this.b.get()).g();
        if (g != null) {
            boolean aj = g.aj();
            a.copyOnWrite();
            ((atal) a.instance).j(aj);
        }
        acpl acplVar = this.a;
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dc((atal) a.build());
        acplVar.c((arpp) a2.build());
    }
}

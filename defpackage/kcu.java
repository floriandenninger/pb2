package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcu {
    public fhg a = fhg.NONE;
    public fhg b;
    private final ainy c;

    public kcu(ainy ainyVar) {
        this.c = ainyVar;
    }

    public final void a(fhg fhgVar) {
        if (fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            return;
        }
        boolean z = true;
        this.c.E(fhgVar.b() && !fhgVar.e());
        ainy ainyVar = this.c;
        if (!fhgVar.k() && !fhgVar.e()) {
            z = false;
        }
        aifs aifsVar = ainyVar.f;
        if (aifsVar.g != z) {
            aifsVar.g = z;
            aifsVar.i();
        }
        ainy ainyVar2 = this.c;
        boolean d = fhgVar.d();
        aifs aifsVar2 = ainyVar2.f;
        if (d != aifsVar2.n) {
            aifsVar2.n = d;
            aifsVar2.i();
        }
        ainy ainyVar3 = this.c;
        boolean e = fhgVar.e();
        aifs aifsVar3 = ainyVar3.f;
        if (e != aifsVar3.i) {
            aifsVar3.i = e;
            aifsVar3.i();
        }
    }

    public final void b(fhg fhgVar) {
        fhgVar.getClass();
        this.a = fhgVar;
        fhg fhgVar2 = this.b;
        if (fhgVar2 != null) {
            if (fhgVar != fhgVar2) {
                return;
            } else {
                this.b = null;
            }
        }
        a(fhgVar);
    }
}

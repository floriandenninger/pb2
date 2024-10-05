package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbz {
    private final aahd a;
    private final acqz b;
    private final ajzf c;
    private final slr d;

    public gbz(aahd aahdVar, acqz acqzVar, ajzf ajzfVar, slr slrVar) {
        this.a = aahdVar;
        this.b = acqzVar;
        this.c = ajzfVar;
        this.d = slrVar;
    }

    public final void a(apxi apxiVar) {
        if (this.c.c(apxiVar.g)) {
            int i = apxiVar.b;
            if ((i & 1) != 0) {
                aahd aahdVar = this.a;
                apxf apxfVar = apxiVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            } else if ((i & 2) != 0) {
                aahd aahdVar2 = this.a;
                apxf apxfVar2 = apxiVar.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.a(apxfVar2);
                this.b.mM().u(new acqx(apxiVar.f), null);
            }
            this.c.a(apxiVar.g);
        }
    }

    public final void b() {
        this.d.a();
    }
}

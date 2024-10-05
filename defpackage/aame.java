package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aame {
    public aveh a;
    private aamd b;

    public aame(aveh avehVar) {
        avehVar.getClass();
        this.a = avehVar;
    }

    public final aamd a() {
        if (this.b == null) {
            aved avedVar = this.a.k;
            if (avedVar == null) {
                avedVar = aved.a;
            }
            if ((avedVar.b & 1) != 0) {
                aved avedVar2 = this.a.k;
                if (avedVar2 == null) {
                    avedVar2 = aved.a;
                }
                auov auovVar = avedVar2.c;
                if (auovVar == null) {
                    auovVar = auov.a;
                }
                this.b = new aamd(auovVar);
            }
        }
        return this.b;
    }

    public final void b(aveh avehVar) {
        avehVar.getClass();
        this.a = avehVar;
        this.b = null;
    }
}

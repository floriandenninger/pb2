package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oag implements aheq {
    public oad b;
    public oak c;
    public boolean d = false;
    public final aeb a = new aeb();

    @Override // defpackage.aheq
    public final void kV() {
        if (this.d) {
            oak oakVar = this.c;
            if (oakVar != null) {
                oakVar.b(false);
            }
            oad oadVar = this.b;
            if (oadVar != null) {
                if (oadVar.w) {
                    oadVar.g.removeCallbacks(oadVar.s);
                    oadVar.g.setSelected(false);
                }
                oadVar.f(oadVar.z);
            }
        }
    }

    @Override // defpackage.aheq
    public final void m(atzm atzmVar, boolean z) {
        aqyg aqygVar;
        oak oakVar = this.c;
        if (oakVar != null) {
            oakVar.b(true);
            oad oadVar = this.b;
            if (oadVar != null) {
                if ((atzmVar.b & 2) != 0) {
                    aqygVar = atzmVar.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                oadVar.f(ajcq.b(aqygVar));
                if (oadVar.w) {
                    oadVar.g.removeCallbacks(oadVar.s);
                    oadVar.g.setSelected(false);
                    oadVar.g.postDelayed(oadVar.s, oad.a);
                }
            }
        }
    }

    @Override // defpackage.aheq
    public final void n(long j, long j2) {
        oak oakVar;
        if (!this.d || (oakVar = this.c) == null) {
            return;
        }
        int i = (int) j2;
        int i2 = (int) j;
        oai oaiVar = oakVar.g;
        if (oaiVar != null) {
            oaiVar.c(i, i2);
        }
    }
}

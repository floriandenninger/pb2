package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyd implements nvz {
    public boolean a;
    public amsx b;
    private final aypn c;
    private final aypn d;
    private final aypn e;

    public nyd(gpe gpeVar, ntv ntvVar, nuv nuvVar, nuo nuoVar) {
        final int i = 0;
        aypn h = aypn.sm(gpeVar.a, nuvVar.a, aypn.z(false).j(ntvVar.b.s(niy.u).A(nxb.n).A(nxb.m)), gii.k).n().q(new ayrs(this) { // from class: nyc
            public final /* synthetic */ nyd a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.b = (amsx) obj;
                } else {
                    this.a.a = ((Boolean) obj).booleanValue();
                }
            }
        }).h(ntu.l);
        this.c = h;
        this.d = aypn.e(h, nuvVar.a, nxd.h);
        aypn n = aypn.z(amvs.a).j(oba.d(nuoVar)).n();
        final int i2 = 1;
        aypn h2 = n.q(new ayrs(this) { // from class: nyc
            public final /* synthetic */ nyd a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.b = (amsx) obj;
                } else {
                    this.a.a = ((Boolean) obj).booleanValue();
                }
            }
        }).h(ntu.l);
        this.e = h2;
        h.W();
        h2.W();
    }

    @Override // defpackage.nvz
    public final amsx a() {
        return this.b;
    }

    @Override // defpackage.nvz
    public final aypn b() {
        return this.e;
    }

    @Override // defpackage.nvz
    public final aypn c() {
        return this.d;
    }

    @Override // defpackage.nvz
    public final aypn d() {
        return this.c;
    }

    @Override // defpackage.nvz
    public final boolean e() {
        return this.a;
    }
}

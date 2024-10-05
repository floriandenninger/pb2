package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bmw implements bmr {
    final /* synthetic */ bmy a;
    private final ptg b = new ptg(new byte[4]);

    public bmw(bmy bmyVar) {
        this.a = bmyVar;
    }

    @Override // defpackage.bmr
    public final void a(pth pthVar) {
        if (pthVar.i() == 0 && (pthVar.i() & 128) != 0) {
            pthVar.H(6);
            int a = pthVar.a() / 4;
            for (int i = 0; i < a; i++) {
                pthVar.A(this.b, 4);
                int d = this.b.d(16);
                this.b.l(3);
                if (d == 0) {
                    this.b.l(13);
                } else {
                    int d2 = this.b.d(13);
                    if (this.a.b.get(d2) == null) {
                        bmy bmyVar = this.a;
                        bmyVar.b.put(d2, new bms(new bmx(bmyVar, d2)));
                        this.a.f++;
                    }
                }
            }
            this.a.b.remove(0);
        }
    }

    @Override // defpackage.bmr
    public final void b(ptq ptqVar, bik bikVar, bmz bmzVar) {
    }
}

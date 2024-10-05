package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ihj extends vq {
    final /* synthetic */ ihl b;

    public ihj(ihl ihlVar) {
        this.b = ihlVar;
    }

    @Override // defpackage.vq, defpackage.wg
    public final int a(wd wdVar, int i, int i2) {
        this.b.z = super.a(wdVar, i, i2);
        return this.b.z;
    }

    @Override // defpackage.vq, defpackage.wg
    public final View b(wd wdVar) {
        if (wdVar.aq() > 0 && this.b.r()) {
            int x = this.b.n.x();
            int C = this.b.n.C();
            int i = 0;
            View view = null;
            if (x != -1 && this.b.y >= x) {
                while (true) {
                    if (i >= wdVar.aq()) {
                        break;
                    }
                    View az = wdVar.az(i);
                    iin G = iin.G(az);
                    if (!(G instanceof igk) || ((igk) G).u) {
                        i++;
                    } else {
                        ihl ihlVar = this.b;
                        ihlVar.k.set(ihlVar.y);
                        if (this.b.k.get() > 0) {
                            az.postDelayed(new ihi(this, 1), 1000L);
                        }
                        view = az;
                    }
                }
            } else if (C != -1 && this.b.y <= 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= wdVar.aq()) {
                        break;
                    }
                    View az2 = wdVar.az(i2);
                    iin G2 = iin.G(az2);
                    if ((G2 instanceof igk) && ((igk) G2).u) {
                        ihl ihlVar2 = this.b;
                        ihlVar2.j.set(ihlVar2.y);
                        az2.postDelayed(new ihi(this, i), 1000L);
                        view = az2;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                return view;
            }
        }
        return super.b(wdVar);
    }
}

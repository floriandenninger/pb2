package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahgx implements Runnable {
    public final /* synthetic */ ahhc a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahgx(ahhc ahhcVar, int i) {
        this.b = i;
        this.a = ahhcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ahhc ahhcVar = this.a;
                Handler handler = ahhcVar.s;
                if (handler != null) {
                    handler.obtainMessage(3).sendToTarget();
                }
                ahkw ahkwVar = ahhcVar.t;
                if (ahkwVar != null) {
                    ahos ahosVar = (ahos) ahkwVar;
                    ahosVar.c();
                    ahoq ahoqVar = ahosVar.e;
                    if (ahoqVar != null) {
                        ahoqVar.b(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.a.j();
            return;
        }
        ahhc ahhcVar2 = this.a;
        if (ahhcVar2.m != null) {
            if (ahhcVar2.v) {
                ahhcVar2.c();
            }
            ahki ahkiVar = ahhcVar2.o;
            if (ahkiVar != null) {
                ahkiVar.j(ahhcVar2.v);
            }
            ahkm ahkmVar = ahhcVar2.m;
            boolean z = ahhcVar2.v;
            ahja ahjaVar = ahkmVar.b;
            if (ahjaVar.n != z) {
                ahjaVar.n = z;
                if (ahjaVar.h == aapb.RECTANGULAR_3D || ahjaVar.h == aapb.RECTANGULAR_2D) {
                    ahjaVar.g();
                }
                ahjaVar.h();
            }
            ahkmVar.j = true;
        }
        ahgs ahgsVar = ahhcVar2.j;
        if (ahgsVar != null) {
            ahgsVar.j(ahhcVar2.v);
        }
    }
}

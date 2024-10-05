package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gyn implements Runnable {
    public final /* synthetic */ gys a;
    private final /* synthetic */ int b;

    public /* synthetic */ gyn(gys gysVar, int i) {
        this.b = i;
        this.a = gysVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (this.b == 0) {
            gyq k = this.a.k();
            k.e();
            k.g(true);
            k.d();
            return;
        }
        gys gysVar = this.a;
        if (gysVar.u >= 1.0f) {
            i = gysVar.x;
            gysVar.x = i + 10;
        } else {
            if (gysVar.t > 0.0f) {
                gysVar.x = gysVar.A;
                return;
            }
            int i2 = gysVar.x;
            gysVar.x = i2 + 10;
            i = -i2;
        }
        gzd gzdVar = gysVar.q;
        if (gzdVar != null) {
            gzdVar.aj(i, 0, gysVar.C);
        }
        if (gysVar.y) {
            gysVar.i.removeCallbacks(gysVar.B);
            gysVar.i.postDelayed(gysVar.B, 100L);
        }
    }
}

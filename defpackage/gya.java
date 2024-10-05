package defpackage;

import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gya extends dha {

    @dnt(a = 13)
    public gys a;

    @dnt(a = 3)
    public boolean b;

    @dnt(a = 13)
    public aiee c;

    @dnt(a = 3)
    public long d;

    @dnt(a = 3)
    public long e;

    public gya() {
        super("ClipScrubber");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        aiee aieeVar = this.c;
        long j = this.d;
        long j2 = this.e;
        gys gysVar = this.a;
        boolean z = this.b;
        dgt a = dgu.a(dheVar);
        gyd gydVar = new gyd();
        gyd.c(gydVar, dheVar, new gye());
        gydVar.a.a = gysVar;
        gydVar.d.set(0);
        gydVar.a.b = z;
        gydVar.d.set(1);
        gydVar.I(16.0f);
        a.l(gydVar.n(YogaEdge.BOTTOM, 20.0f));
        dlk a2 = dll.a(dheVar);
        gyb gybVar = new gyb();
        gyb.c(gybVar, dheVar, new gyc());
        gybVar.a.b = aieeVar;
        gybVar.d.set(2);
        gybVar.a.a = z;
        gybVar.d.set(0);
        gybVar.S(100.0f);
        gybVar.I(66.0f);
        gybVar.a.d = j;
        gybVar.d.set(4);
        gybVar.a.e = gysVar;
        gybVar.d.set(1);
        gybVar.a.c = j2;
        gybVar.d.set(3);
        a2.j(gybVar);
        gxt gxtVar = new gxt();
        gxt.c(gxtVar, dheVar, new gxu());
        gxtVar.a.a = gysVar;
        gxtVar.d.set(0);
        gxtVar.a.b = z;
        gxtVar.d.set(1);
        gxtVar.S(100.0f);
        gxtVar.J(100.0f);
        gxtVar.O(YogaPositionType.ABSOLUTE);
        gxtVar.P(YogaEdge.ALL, 10.0f);
        a2.j(gxtVar);
        gxx gxxVar = new gxx();
        gxx.c(gxxVar, dheVar, new gxy());
        gxxVar.a.a = gysVar;
        gxxVar.d.set(0);
        gxxVar.a.b = z;
        gxxVar.d.set(1);
        gxxVar.S(100.0f);
        gxxVar.J(100.0f);
        gxxVar.O(YogaPositionType.ABSOLUTE);
        a2.j(gxxVar);
        a.l(a2);
        gxv gxvVar = new gxv();
        gxv.c(gxvVar, dheVar, new gxw());
        gxvVar.a.a = gysVar;
        gxvVar.d.set(0);
        gxvVar.I(16.0f);
        dgy dgyVar = (gxv) gxvVar.n(YogaEdge.TOP, 20.0f);
        dgyVar.S(100.0f);
        a.l(dgyVar);
        return ((dgt) ((dgt) a.n(YogaEdge.BOTTOM, 12.0f)).n(YogaEdge.TOP, 12.0f)).a;
    }
}

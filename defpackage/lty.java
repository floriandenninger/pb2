package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lty implements ltw, ajjy, yqa {
    private final euc b;
    private final zey c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final shf h;
    private final aadw l;
    final Map a = new HashMap();
    private volatile int i = -1;
    private int j = 0;
    private volatile long k = 0;

    public lty(euc eucVar, zey zeyVar, azrw azrwVar, aadw aadwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, shf shfVar) {
        this.b = eucVar;
        this.c = zeyVar;
        this.d = azrwVar;
        this.l = aadwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.g = azrwVar4;
        this.h = shfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03b9 A[LOOP:2: B:92:0x02f2->B:115:0x03b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04f6 A[Catch: tcw -> 0x0516, NullPointerException -> 0x052f, TryCatch #2 {tcw -> 0x0516, blocks: (B:62:0x044f, B:63:0x0461, B:64:0x0483, B:47:0x04e0, B:49:0x04f6, B:50:0x0501, B:51:0x04fb, B:109:0x038e, B:111:0x0392, B:119:0x03c7, B:121:0x03dc, B:122:0x0403, B:123:0x039b, B:125:0x039f, B:128:0x03a7, B:130:0x03ab, B:143:0x0367, B:151:0x0378, B:175:0x0476, B:176:0x047b, B:180:0x047e, B:159:0x0404, B:160:0x042d, B:164:0x042e, B:165:0x0448, B:167:0x0449, B:172:0x0467, B:173:0x0470, B:44:0x04a6, B:46:0x04ae), top: B:42:0x0248 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04fb A[Catch: tcw -> 0x0516, NullPointerException -> 0x052f, TryCatch #2 {tcw -> 0x0516, blocks: (B:62:0x044f, B:63:0x0461, B:64:0x0483, B:47:0x04e0, B:49:0x04f6, B:50:0x0501, B:51:0x04fb, B:109:0x038e, B:111:0x0392, B:119:0x03c7, B:121:0x03dc, B:122:0x0403, B:123:0x039b, B:125:0x039f, B:128:0x03a7, B:130:0x03ab, B:143:0x0367, B:151:0x0378, B:175:0x0476, B:176:0x047b, B:180:0x047e, B:159:0x0404, B:160:0x042d, B:164:0x042e, B:165:0x0448, B:167:0x0449, B:172:0x0467, B:173:0x0470, B:44:0x04a6, B:46:0x04ae), top: B:42:0x0248 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(android.widget.ImageView r21, defpackage.avgg r22, long r23, boolean r25, defpackage.ltx r26) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lty.h(android.widget.ImageView, avgg, long, boolean, ltx):void");
    }

    @Override // defpackage.ltw
    public final void a() {
        this.c.a(this);
        ((ajjz) this.d.get()).d(this);
    }

    @Override // defpackage.ltw
    public final void b() {
        this.c.b(this);
        ((ajjz) this.d.get()).o(this);
    }

    @Override // defpackage.yqa
    public final void c() {
        this.k = this.h.e();
    }

    @Override // defpackage.ajjy
    public final void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        if (((ltx) this.a.get(imageView)) != null) {
            this.a.remove(imageView);
        }
    }

    @Override // defpackage.ajjy
    public final void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        ltx ltxVar = (ltx) this.a.get(imageView);
        if (ltxVar != null) {
            h(imageView, avggVar, ltxVar.a, false, ltxVar);
            this.a.remove(imageView);
        }
    }

    @Override // defpackage.ajjy
    public final void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        this.j++;
        long e = this.h.e();
        if (this.i == -1) {
            avdj avdjVar = this.l.b().u;
            if (avdjVar == null) {
                avdjVar = avdj.a;
            }
            double d = avdjVar.h;
            Double.isNaN(d);
            this.i = (int) (d * 1.048576d);
        }
        if ((1048575 & e) < this.i) {
            this.a.put(imageView, new ltx(e, this.j));
        }
    }

    @Override // defpackage.ajjy
    public final void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        ltx ltxVar = (ltx) this.a.get(imageView);
        if (ltxVar != null) {
            h(imageView, avggVar, ltxVar.a, true, ltxVar);
            this.a.remove(imageView);
        }
    }
}

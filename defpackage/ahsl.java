package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Vibrator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahsl {
    private final ahsk A;
    private final Context a;
    private final ajjz b;
    private final zaz c;
    private final Handler d;
    private final acra e;
    private ykn f;
    public final acud g;
    public final ahsm h;
    public boolean i;
    public aigf j;
    public ykn k;
    public apfc l;
    public boolean[] m;
    public int n;
    public apez o;
    public List p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean t;
    public final ahsj u;
    public final kgv v;
    private boolean[] w;
    private Vibrator x;
    private boolean y;
    private final ahsh z;

    public ahsl(Context context, kgv kgvVar, ajjz ajjzVar, aahd aahdVar, zaz zazVar, afuh afuhVar, afxf afxfVar, acra acraVar, ahsm ahsmVar) {
        this.a = context;
        kgvVar.getClass();
        this.v = kgvVar;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        zazVar.getClass();
        this.c = zazVar;
        this.d = new Handler(context.getMainLooper());
        this.g = new acud(afuhVar, afxfVar, "iv");
        this.e = acraVar;
        this.n = -1;
        ahsmVar.getClass();
        this.h = ahsmVar;
        this.A = new ahsk(this, 1);
        new ahsk(this, 0);
        this.u = new ahsj(this);
        this.z = new ahsh(this);
    }

    public static final apfc e(PlayerResponseModel playerResponseModel) {
        for (apey apeyVar : playerResponseModel.a.o) {
            if (apeyVar != null && apeyVar.b == 49483894) {
                return (apfc) apeyVar.c;
            }
        }
        return null;
    }

    public static final avgf l(avgg avggVar) {
        return ahbw.I(avggVar, 40);
    }

    public ahsh b() {
        return this.z;
    }

    public final void f(apfc apfcVar, String str) {
        if (this.i) {
            h();
        }
        this.i = true;
        this.l = apfcVar;
        if (apfcVar != null && apfcVar.d.size() != 0) {
            aony aonyVar = apfcVar.d;
            this.p = aonyVar;
            int size = aonyVar.size();
            this.w = new boolean[size];
            this.m = new boolean[size];
        }
        apfc apfcVar2 = this.l;
        if (apfcVar2 != null && (apfcVar2.b & 2) != 0) {
            apfa apfaVar = apfcVar2.c;
            if (apfaVar == null) {
                apfaVar = apfa.a;
            }
            avgg avggVar = apfaVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            avgf l = l(avggVar);
            this.f = d(l, new ahsf(this, l));
        }
        this.g.c("CPN", str);
    }

    public final void g() {
        this.c.j(this.q);
    }

    public final void h() {
        this.i = false;
        ykn yknVar = this.f;
        if (yknVar != null) {
            yknVar.d();
            this.f = null;
        }
        ykn yknVar2 = this.k;
        if (yknVar2 != null) {
            yknVar2.d();
            this.k = null;
        }
        kgv kgvVar = this.v;
        kgvVar.X();
        kgvVar.a = false;
        kgvVar.b = null;
        kgvVar.Z(3);
        this.y = false;
        this.q = false;
        this.r = false;
        this.w = null;
        this.m = null;
        this.n = -1;
        this.o = null;
        this.l = null;
        this.s = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r9 = this;
            apfc r0 = r9.l
            if (r0 == 0) goto L79
            int r0 = r0.b
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L79
            aigf r0 = r9.j
            aigf r2 = defpackage.aigf.FULLSCREEN
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L37
            apfc r0 = r9.l
            apfa r0 = r0.c
            if (r0 != 0) goto L1a
            apfa r0 = defpackage.apfa.a
        L1a:
            long r5 = r0.b
            int r0 = r9.s
            long r7 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L37
            apfc r0 = r9.l
            apfa r0 = r0.c
            if (r0 != 0) goto L2b
            apfa r0 = defpackage.apfa.a
        L2b:
            long r5 = r0.c
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L37
            boolean r0 = r9.t
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            boolean r2 = r9.y
            if (r0 != r2) goto L3d
            return
        L3d:
            r9.y = r0
            if (r0 == 0) goto L72
            kgv r0 = r9.v
            r0.a = r3
            boolean r2 = r0.nt()
            if (r2 == 0) goto L4f
            r0.aa()
            goto L52
        L4f:
            r0.X()
        L52:
            r0.Z(r1)
            apfc r0 = r9.l
            apfa r0 = r0.c
            if (r0 != 0) goto L5d
            apfa r0 = defpackage.apfa.a
        L5d:
            aomf r0 = r0.e
            byte[] r0 = r0.I()
            if (r0 != 0) goto L66
            return
        L66:
            acra r1 = r9.e
            acqx r2 = new acqx
            r2.<init>(r0)
            r0 = 0
            r1.u(r2, r0)
            return
        L72:
            kgv r0 = r9.v
            r0.a = r4
            r0.Z(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsl.i():void");
    }

    public final boolean j() {
        int i;
        boolean[] zArr = this.w;
        return zArr != null && (i = this.n) >= 0 && i < zArr.length && zArr[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r6 = this;
            apez r0 = r6.o
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            auao r0 = r0.g
            if (r0 != 0) goto Lc
            auao r0 = defpackage.auao.b
        Lc:
            aonu r0 = r0.c
            int r0 = r0.size()
            r2 = 1
            if (r0 != 0) goto L16
            return r2
        L16:
            aigf r0 = r6.j
            if (r0 != 0) goto L1b
            return r1
        L1b:
            aign r3 = defpackage.aign.NEW
            int r0 = r0.ordinal()
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L3b
            r3 = 2
            if (r0 == r3) goto L38
            r3 = 3
            if (r0 == r3) goto L35
            r3 = 4
            if (r0 == r3) goto L3e
            java.lang.String r0 = "Unhandled player visibility state."
            defpackage.zga.l(r0)
            r0 = 0
            goto L40
        L35:
            auan r0 = defpackage.auan.BACKGROUND
            goto L40
        L38:
            auan r0 = defpackage.auan.FULLSCREEN
            goto L40
        L3b:
            auan r0 = defpackage.auan.MINI
            goto L40
        L3e:
            auan r0 = defpackage.auan.STANDARD
        L40:
            if (r0 != 0) goto L43
            return r1
        L43:
            apez r3 = r6.o
            auao r3 = r3.g
            if (r3 != 0) goto L4b
            auao r3 = defpackage.auao.b
        L4b:
            aonw r4 = new aonw
            aonu r3 = r3.c
            aonv r5 = defpackage.auao.a
            r4.<init>(r3, r5)
            java.util.Iterator r3 = r4.iterator()
        L58:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()
            auan r4 = (defpackage.auan) r4
            if (r0 != r4) goto L58
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsl.k():boolean");
    }

    public final void m() {
        if (this.q) {
            this.d.removeCallbacks(this.A);
            this.q = false;
            g();
        }
    }

    public final void n(boolean z, int i) {
        if (this.q && this.r == z) {
            return;
        }
        this.q = true;
        this.r = z;
        g();
        if (zev.e(this.a)) {
            if (this.x == null) {
                this.x = (Vibrator) this.a.getSystemService("vibrator");
            }
            if (this.x.hasVibrator()) {
                this.x.vibrate(this.a.getResources().getInteger(R.integer.invideo_accessibility_vibration_duration_ms));
            }
        }
        if (!z || this.m[this.n] || i <= 0) {
            return;
        }
        this.d.removeCallbacks(this.A);
        this.d.postDelayed(this.A, i);
    }

    public final ykn d(avgf avgfVar, ahsg ahsgVar) {
        Uri aj = avgfVar == null ? null : wbs.aj(avgfVar.c);
        if (aj == null) {
            return null;
        }
        ykn c = ykn.c(ahsgVar);
        this.b.l(aj, ykt.c(this.d, c));
        return c;
    }
}

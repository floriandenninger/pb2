package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenc implements Observer, afec, afbu {
    public static final /* synthetic */ int n = 0;
    private static final aeou o = new aeou(afqu.NATIVE_MEDIA_PLAYER);
    private afkm A;
    private FormatStreamModel B;
    private boolean C;
    private final afhs D;
    public final ysy a;
    public final String b;
    public final afdf c;
    final aenb d;
    aena e;
    public final Handler f;
    public boolean g;
    public volatile boolean h;
    public afky i;
    public int j;
    public int k;
    public int l = 0;
    public final AtomicInteger m;
    private final Context p;
    private final aemd q;
    private final aeez r;
    private final afkn s;
    private final afhw t;
    private final afdu u;
    private aeru v;
    private VideoStreamingData w;
    private PlayerConfigModel x;
    private FormatStreamModel y;
    private String z;

    public aenc(Context context, ysy ysyVar, aeez aeezVar, String str, afhs afhsVar, afkn afknVar, aemd aemdVar, afdf afdfVar, adxr adxrVar, afhw afhwVar) {
        this.p = context;
        this.q = aemdVar;
        afki.a(ysyVar);
        this.a = ysyVar;
        afki.a(aeezVar);
        this.r = aeezVar;
        afki.a(str);
        this.b = str;
        afki.a(afhsVar);
        this.D = afhsVar;
        afki.a(afknVar);
        this.s = afknVar;
        this.c = afdfVar;
        this.t = afhwVar;
        this.u = new afdu(adxrVar, afhsVar);
        this.d = new aenb(this);
        this.e = new aena(this, context, afdfVar, aemdVar, afhsVar);
        this.m = new AtomicInteger();
        this.f = new Handler(context.getMainLooper());
        this.v = aeru.c;
        this.e.start();
    }

    public static /* bridge */ /* synthetic */ void L(aenc aencVar, FormatStreamModel formatStreamModel, long j) {
        aencVar.V(formatStreamModel, j, null, null);
    }

    public static afih O(int i, int i2, boolean z, boolean z2, long j, FormatStreamModel formatStreamModel, afhs afhsVar) {
        String S;
        String T;
        boolean z3 = true;
        if (i != 1) {
            if (i == 261) {
                i = 261;
            } else {
                z3 = false;
            }
        }
        boolean J2 = z2 | formatStreamModel.J();
        String str = "fmt.unplayable";
        String str2 = null;
        if (z3) {
            if (i2 != Integer.MIN_VALUE) {
                if (i2 == -1010) {
                    str2 = R(formatStreamModel);
                } else if (i2 != -1007) {
                    switch (i2) {
                        case -1005:
                            S = S(J2, "net.closed");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        case -1004:
                            break;
                        case -1003:
                            S = S(J2, "net.connect");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        case -1002:
                            S = S(J2, "net.dns");
                            T = T(formatStreamModel);
                            str = S;
                            str2 = T;
                            break;
                        default:
                            str = null;
                            break;
                    }
                } else {
                    str2 = R(formatStreamModel);
                    str = "fmt.decode";
                }
                if (afhsVar.V(afhsVar.p.a.a.Y(axzc.i).B()) && str != null && str.startsWith("net.") && formatStreamModel.J()) {
                    StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
                    sb.append("w.");
                    sb.append(str);
                    sb.append(";");
                    sb.append(str2);
                    str2 = sb.toString();
                    str = "staleconfig";
                }
            }
            S = S(J2, "net.timeout");
            T = T(formatStreamModel);
            str = S;
            str2 = T;
            if (afhsVar.V(afhsVar.p.a.a.Y(axzc.i).B())) {
                StringBuilder sb2 = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
                sb2.append("w.");
                sb2.append(str);
                sb2.append(";");
                sb2.append(str2);
                str2 = sb2.toString();
                str = "staleconfig";
            }
        } else if (i == 200) {
            int e = formatStreamModel.e();
            StringBuilder sb3 = new StringBuilder(16);
            sb3.append("itag.");
            sb3.append(e);
            str2 = sb3.toString();
            i = 200;
        } else {
            str = null;
        }
        if (str == null) {
            StringBuilder sb4 = new StringBuilder(27);
            sb4.append("w.");
            sb4.append(i);
            sb4.append(";e.");
            sb4.append(i2);
            str2 = sb4.toString();
            str = "android.fw";
        }
        afih afihVar = new afih(str, j, str2);
        if (!z) {
            afihVar.f();
        }
        return afihVar;
    }

    private final FormatStreamModel P(aeeu aeeuVar, String str) {
        FormatStreamModel[] formatStreamModelArr = aeeuVar.a;
        if (this.D.h.b(str) == avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
            return aeeuVar.c;
        }
        if (aeeuVar.f.d == 0) {
            for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
                if (formatStreamModel.f() <= 360) {
                    return formatStreamModel;
                }
            }
        }
        return formatStreamModelArr[0];
    }

    private final aeeu Q(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aees aeesVar, int i, String str) {
        Set f;
        aeez aeezVar = this.r;
        List list = videoStreamingData.o;
        if (this.D.aK(playerConfigModel.W())) {
            f = aaoq.v();
        } else {
            apdl apdlVar = playerConfigModel.c.j;
            if (apdlVar == null) {
                apdlVar = apdl.a;
            }
            f = aaoq.f(apdlVar.d);
        }
        return aeezVar.c(playerConfigModel, list, aeesVar, f, aeez.b, 2, i, str, aesa.a, afkj.a);
    }

    private static String R(FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            return "";
        }
        int e = formatStreamModel.e();
        StringBuilder sb = new StringBuilder(16);
        sb.append("itag.");
        sb.append(e);
        return sb.toString();
    }

    private static String S(boolean z, String str) {
        return z ? str : "net.unavailable";
    }

    private static String T(FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            return "";
        }
        String valueOf = String.valueOf(formatStreamModel.d.getHost());
        return valueOf.length() != 0 ? "shost.".concat(valueOf) : new String("shost.");
    }

    private final void U(boolean z, boolean z2) {
        if (this.g) {
            if (z2) {
                this.e.h();
            } else {
                this.e.g();
            }
            E(false);
            this.w = null;
            this.z = null;
            if (z && !this.e.p) {
                this.v.v();
            }
            this.g = false;
        }
    }

    public final void V(FormatStreamModel formatStreamModel, long j, Boolean bool, Float f) {
        float f2;
        aena aenaVar = this.e;
        int i = aena.r;
        boolean z = false;
        if (aenaVar.l && formatStreamModel.equals(this.y)) {
            z = true;
        }
        aenaVar.l = z;
        this.y = formatStreamModel;
        this.e.g();
        int i2 = (int) formatStreamModel.c;
        this.j = i2;
        this.v.k(0L, i2);
        afky afkyVar = this.i;
        if (afkyVar != null) {
            afkyVar.k();
        }
        this.v.a().F();
        E(true);
        this.g = true;
        aemw aemwVar = new aemw();
        aemwVar.a = this.z;
        aemwVar.b = formatStreamModel;
        aemwVar.c = this.v;
        aemwVar.d = this.i;
        aemwVar.e = this.x;
        aemwVar.f = j;
        aemwVar.h = bool;
        if (f != null) {
            f2 = f.floatValue();
        } else {
            f2 = this.e.f;
        }
        aemwVar.g = f2;
        aena aenaVar2 = this.e;
        aenaVar2.g = aemwVar.f;
        Handler handler = aenaVar2.d;
        handler.sendMessage(Message.obtain(handler, 1, aemwVar));
    }

    private final void W(aeeu aeeuVar) {
        FormatStreamModel formatStreamModel = aeeuVar.c;
        if (this.B != null && formatStreamModel.e() != this.B.e()) {
            aeru aeruVar = this.v;
            FormatStreamModel formatStreamModel2 = this.y;
            aeruVar.h(new aeqq(formatStreamModel2, formatStreamModel2, formatStreamModel, aeeuVar.d, aeeuVar.e, aeeuVar.f, 10001, -1L, 0, aeqp.a(f(), g(), -1)));
        }
        this.B = formatStreamModel;
    }

    private final void X(aeeu aeeuVar, int i) {
        FormatStreamModel P = P(aeeuVar, this.z);
        this.v.h(new aeqq(P, P, aeeuVar.c, aeeuVar.d, aeeuVar.e, aeeuVar.f, i, -1L, 0, aeqp.a(f(), g(), -1)));
        this.B = aeeuVar.c;
        V(P, g(), null, null);
    }

    public final void A() {
        this.e.quit();
        afky afkyVar = this.i;
        if (afkyVar != null) {
            afkyVar.o();
        }
        aena aenaVar = new aena(this, this.p, this.c, this.q, this.D);
        this.e = aenaVar;
        aenaVar.start();
    }

    @Override // defpackage.afcx
    public final void B(long j, aupb aupbVar) {
        if (this.e.g != j) {
            this.u.d.h(aupbVar);
            this.h = true;
            aena aenaVar = this.e;
            long max = Math.max(0L, Math.min(j, this.j));
            aenaVar.g = max;
            Handler handler = aenaVar.d;
            handler.sendMessage(Message.obtain(handler, 4, Long.valueOf(max)));
        }
    }

    @Override // defpackage.afcx
    public final void C(float f) {
        if (this.C) {
            Handler handler = this.e.d;
            handler.sendMessage(Message.obtain(handler, 10, Float.valueOf(f)));
        }
    }

    @Override // defpackage.afcx
    public final void D(float f) {
        this.e.f(f);
    }

    public final void E(boolean z) {
        afky afkyVar = this.i;
        if (afkyVar != null) {
            if (z) {
                afkyVar.g(1);
            } else {
                afkyVar.rE(1);
            }
        }
    }

    @Override // defpackage.afec
    public final void F(boolean z) {
        this.c.j(afqu.NATIVE_MEDIA_PLAYER);
        U(z, false);
    }

    @Override // defpackage.afcx
    public final boolean G() {
        aena aenaVar = this.e;
        int i = aena.r;
        return aenaVar.o;
    }

    @Override // defpackage.afbu
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return videoStreamingData.t() && !videoStreamingData.F();
    }

    @Override // defpackage.afcx
    public final boolean I() {
        aena aenaVar = this.e;
        int i = aena.r;
        return aenaVar.n;
    }

    @Override // defpackage.afec
    public final boolean J(afeb afebVar) {
        return false;
    }

    @Override // defpackage.afec
    public final afqu K(aerv aervVar) {
        avzr b;
        boolean z = false;
        this.m.set(0);
        this.c.e(afqu.NATIVE_MEDIA_PLAYER);
        this.t.a(aervVar.b);
        this.i = aervVar.b();
        this.w = aervVar.b;
        this.x = aervVar.e;
        this.z = aervVar.d;
        this.v = new aers(aervVar.a());
        this.l = aervVar.k;
        this.v.j(afqu.NATIVE_MEDIA_PLAYER);
        if (Build.VERSION.SDK_INT >= 23 && this.D.o().B) {
            z = true;
        }
        this.C = z;
        this.u.c(aervVar.a, this.w);
        this.s.deleteObserver(this);
        try {
            VideoStreamingData videoStreamingData = this.w;
            PlayerConfigModel playerConfigModel = this.x;
            amsx amsxVar = aeez.a;
            aeeu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
            if (this.D.h.f() && (b = this.D.h.b(this.z)) != null) {
                this.v.z(b);
            }
            aeex aeexVar = Q.f;
            if (aeexVar.e()) {
                this.v.i("sc", new aeqs(Integer.toString(aeexVar.b)));
            }
            int i = Q.g;
            if (i != Integer.MAX_VALUE) {
                this.v.i("lmdu", new aeqs(Integer.toString(i)));
            }
            if (Q.f.d()) {
                this.v.i("pmqs", new aeqs(Q.d()));
            }
            FormatStreamModel P = P(Q, this.z);
            FormatStreamModel formatStreamModel = Q.c;
            this.B = formatStreamModel;
            this.v.h(new aeqq(P, P, formatStreamModel, Q.d, Q.e, Q.f, 1, -1L, 0, aeqp.a(f(), g(), -1)));
            afky afkyVar = this.i;
            if (afkyVar instanceof afkp) {
                this.c.g(aflb.SURFACE, afqu.NATIVE_MEDIA_PLAYER);
                this.i.t(aflb.SURFACE);
            } else if (afkyVar != null) {
                this.c.o(afde.RESET_MEDIA_VIEW_TYPE, afqu.NATIVE_MEDIA_PLAYER);
                this.i.p();
            }
            V(P, aervVar.c.a, Boolean.valueOf(aedn.v(this.l, 2)), Float.valueOf(aervVar.i));
            this.s.addObserver(this);
            return afqu.NATIVE_MEDIA_PLAYER;
        } catch (aeew e) {
            this.v.g(afeu.d(afif.PROGRESSIVE, e, this.w, 0L));
            return null;
        }
    }

    @Override // defpackage.afcx
    public final void M() {
        this.c.c(afqu.NATIVE_MEDIA_PLAYER);
        U(true, true);
    }

    @Override // defpackage.afec
    public final /* synthetic */ void N(boolean z, int i) {
    }

    @Override // defpackage.afcx
    public final float a() {
        return this.e.e;
    }

    @Override // defpackage.afcx
    public final int b() {
        return -1;
    }

    @Override // defpackage.afec
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        int i = true != this.C ? 0 : 2;
        return this.D.D() ? i | 16 : i;
    }

    @Override // defpackage.afec
    public final int d() {
        return -1;
    }

    @Override // defpackage.afcx
    public final int e() {
        return -1;
    }

    @Override // defpackage.afec
    public final long f() {
        return (this.k / 100.0f) * this.j;
    }

    @Override // defpackage.afec
    public final long g() {
        return this.e.g;
    }

    @Override // defpackage.afec
    public final long h() {
        return -1L;
    }

    @Override // defpackage.afec
    public final long i() {
        return this.j;
    }

    @Override // defpackage.afcx
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel k() {
        return this.y;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel l() {
        return this.y;
    }

    @Override // defpackage.afec
    public final aeeu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        return Q(videoStreamingData, playerConfigModel, (z && aeesVar != null && aeesVar.d.b == 0) ? new aees(new aeex(360, 360), aeesVar.e, aeesVar.f, aeesVar.g, aeesVar.h, aeesVar.i, aeesVar.j, aeesVar.k, aeesVar.l) : aeesVar, i, null);
    }

    @Override // defpackage.afcx
    public final aeou n() {
        aeou aeouVar = o;
        aeouVar.b(this.w, false, -1L, false, false, false, false);
        return aeouVar;
    }

    @Override // defpackage.afcx
    public final String o() {
        return this.z;
    }

    @Override // defpackage.afec
    public final void p(afky afkyVar) {
        this.c.b(afqu.NATIVE_MEDIA_PLAYER);
        this.i = afkyVar;
        afkyVar.s(this.d);
        this.c.f(this.d, afqu.NATIVE_MEDIA_PLAYER);
        this.e.e(afkyVar);
        if (this.e.n) {
            afkyVar.n(500);
        }
        E(this.e.n);
    }

    @Override // defpackage.afcx
    public final void q() {
    }

    @Override // defpackage.afcx
    public final void r() {
        afky afkyVar = this.i;
        if (afkyVar != null) {
            afkyVar.k();
        }
    }

    @Override // defpackage.afcx
    public final void s() {
        this.c.d(afqu.NATIVE_MEDIA_PLAYER);
        if (this.i != null) {
            E(false);
            this.i.k();
            this.i.s(null);
            this.i = null;
            this.e.a();
        }
    }

    @Override // defpackage.afec
    public final void t(aaox aaoxVar, aeru aeruVar) {
    }

    public final void u() {
        Object obj = this.s.get();
        if (this.i == null || this.w == null || this.x == null) {
            return;
        }
        afkm afkmVar = (afkm) obj;
        if (afkmVar.equals(this.A)) {
            return;
        }
        this.A = afkmVar;
        try {
            VideoStreamingData videoStreamingData = this.w;
            PlayerConfigModel playerConfigModel = this.x;
            amsx amsxVar = aeez.a;
            aeeu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
            W(Q);
            apdl apdlVar = this.x.c.j;
            if (apdlVar == null) {
                apdlVar = apdl.a;
            }
            if (!apdlVar.j || P(Q, this.z).equals(this.y)) {
                return;
            }
            X(Q, 10001);
        } catch (aeew unused) {
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == this.s) {
            u();
        }
    }

    @Override // defpackage.afcx
    public final void v() {
        this.e.d.sendEmptyMessage(3);
        E(false);
    }

    @Override // defpackage.afcx
    public final void w() {
    }

    @Override // defpackage.afcx
    public final void x() {
        this.e.b();
        E(true);
    }

    @Override // defpackage.afec
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.afcx
    public final void z() {
        VideoStreamingData videoStreamingData;
        if (this.g && (videoStreamingData = this.w) != null) {
            try {
                PlayerConfigModel playerConfigModel = this.x;
                amsx amsxVar = aeez.a;
                aeeu Q = Q(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.z);
                if (P(Q, this.z).equals(this.y)) {
                    W(Q);
                    return;
                }
                X(Q, 2);
            } catch (aeew unused) {
            }
        }
    }
}

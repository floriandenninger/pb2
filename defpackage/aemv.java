package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aemv extends aeeq {
    public static final dsm h = new dsm(0);
    public final afec c;
    public final aemu d;
    public volatile aefq e;
    final aeet f;
    public boolean g;
    private final aems i;
    private final Handler j;
    private final afcv k;
    private final adxr l;
    private final afgx m;
    private final afhs n;

    public aemv(afec afecVar, afcv afcvVar, afhs afhsVar, adxr adxrVar, aeet aeetVar, afgx afgxVar) {
        aems aemsVar = new aems();
        this.i = aemsVar;
        this.j = new Handler(Looper.getMainLooper());
        this.d = new aemu();
        afki.a(afecVar);
        this.c = afecVar;
        afki.a(afcvVar);
        this.k = afcvVar;
        this.l = adxrVar;
        this.n = afhsVar;
        this.f = aeetVar;
        this.m = afgxVar;
        aemsVar.b = afhsVar.o().h;
        afki.f(afhsVar.aa());
        this.e = aefq.a;
    }

    private final boolean H(Runnable runnable) {
        aems aemsVar = this.i;
        yjk.f();
        if (aemsVar.a.get() <= 0) {
            return true;
        }
        afic aficVar = afic.ABR;
        this.j.post(runnable);
        return false;
    }

    public static int e(aeru aeruVar) {
        return System.identityHashCode(aeruVar) % 100;
    }

    public static aeqr j(long j) {
        return new aeqr(j);
    }

    public static aeqr k(long j, long j2, long j3) {
        return new aeqr(j, j2, j3);
    }

    public final void A(final boolean z) {
        if (H(new Runnable() { // from class: aemq
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.A(z);
            }
        })) {
            this.c.N(z, 13);
        }
    }

    public final void B(float f) {
        float y = Float.isNaN(f) ? 1.0f : yjk.y(f, 0.25f, 2.0f);
        if (H(new aemh(this, y, 1))) {
            this.c.C(y);
        }
    }

    public final void C(final int i, final String str) {
        if (H(new Runnable() { // from class: aemi
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.C(i, str);
            }
        })) {
            this.n.h.d(str, avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU);
            this.f.b(i, i, h(), str);
            this.c.z();
        }
    }

    public final void D(final avzr avzrVar, final String str) {
        if (H(new Runnable() { // from class: aemn
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.D(avzrVar, str);
            }
        })) {
            this.n.h.d(str, avzrVar);
            this.f.b(-2, -2, h(), str);
            this.c.z();
        }
    }

    public final void E(float f) {
        float y = yjk.y(f, 0.0f, 1.0f);
        if (H(new aemh(this, y, 0))) {
            this.c.D(y);
        }
    }

    public final void F() {
        if (H(new aemr(this, 7))) {
            afid.a(afic.MLPLAYER, "MedialibPlayer.stopVideo()");
            this.c.F(true);
            this.g = false;
        }
    }

    public final boolean G() {
        yjk.f();
        return this.c.I();
    }

    @Override // defpackage.aeeq
    public final aeeu a(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aees aeesVar) {
        afec afecVar = this.c;
        afki.a(videoStreamingData);
        afki.a(playerConfigModel);
        return afecVar.m(videoStreamingData, playerConfigModel, aeesVar.a(), aeesVar, Integer.MAX_VALUE);
    }

    @Override // defpackage.aeeq
    public final aeeu d(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        afec afecVar = this.c;
        afki.a(videoStreamingData);
        afki.a(playerConfigModel);
        return afecVar.m(videoStreamingData, playerConfigModel, z, aeesVar, i);
    }

    public final long f(FormatStreamModel formatStreamModel, FormatStreamModel formatStreamModel2, long j, boolean z) {
        adxp b = formatStreamModel != null ? this.l.b(formatStreamModel, TimeUnit.MILLISECONDS.toMicros(j)) : null;
        if (z) {
            if (b != null) {
                return TimeUnit.MICROSECONDS.toMillis(b.c);
            }
            return -1L;
        }
        adxp b2 = formatStreamModel2 != null ? this.l.b(formatStreamModel2, TimeUnit.MILLISECONDS.toMicros(j)) : null;
        if (formatStreamModel2 != null && formatStreamModel2.M()) {
            return TimeUnit.MICROSECONDS.toMillis(b2.c);
        }
        if (b == null || b2 == null) {
            return -1L;
        }
        long min = Math.min(b.c, b2.c);
        if (min <= 0) {
            return -1L;
        }
        return TimeUnit.MICROSECONDS.toMillis(min);
    }

    public final FormatStreamModel g() {
        yjk.f();
        return this.c.k();
    }

    public final FormatStreamModel h() {
        yjk.f();
        return this.c.l();
    }

    public final aefq i() {
        yjk.f();
        this.e = aefq.a(this.c.g(), this.c.h(), this.c.i(), this.c.f(), this.c.d(), this.c.o());
        return this.e;
    }

    public final afqu l() {
        return this.d.a;
    }

    public final String m() {
        yjk.f();
        if (this.g) {
            return this.c.o();
        }
        return null;
    }

    public final void n(final afkl afklVar) {
        if (H(new Runnable() { // from class: aemm
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.n(afklVar);
            }
        })) {
            afki.b(afklVar instanceof afky);
            afic aficVar = afic.ABR;
            this.c.p((afky) afklVar);
        }
    }

    public final void o() {
        if (H(new aemr(this, 1))) {
            afic aficVar = afic.ABR;
            this.c.M();
            this.g = false;
        }
    }

    public final void p() {
        if (H(new aemr(this, 0))) {
            afic aficVar = afic.ABR;
            this.c.q();
        }
    }

    public final void q() {
        if (H(new aemr(this, 2))) {
            this.c.r();
        }
    }

    public final void r() {
        if (H(new aemr(this, 3))) {
            afic aficVar = afic.ABR;
            this.c.s();
        }
    }

    public final void s(aaox aaoxVar, aesn aesnVar, afjf afjfVar) {
        afic aficVar = afic.ABR;
        aems aemsVar = new aems();
        afki.a(aesnVar);
        aemt aemtVar = new aemt(this, aemsVar, aesnVar, this.k, this.d, afjfVar);
        afjfVar.G();
        afec afecVar = this.c;
        afki.a(aaoxVar);
        afecVar.t(aaoxVar, aemtVar);
    }

    public final void t(final aesk aeskVar) {
        afki.f(this.n.aa());
        aedn.g(aeskVar, true, -1L);
        if (H(new Runnable() { // from class: aemk
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.t(aeskVar);
            }
        })) {
            aesj aesjVar = (aesj) aeskVar;
            final aemt aemtVar = new aemt(this, this.i, aesjVar.g, this.k, this.d, aesjVar.l);
            VideoStreamingData videoStreamingData = aesjVar.b;
            afic aficVar = afic.MLPLAYER;
            amxk amxkVar = new amxk() { // from class: aemp
                @Override // defpackage.amxk
                public final Object a() {
                    return Integer.valueOf(aemv.e(aeru.this));
                }
            };
            afid.g(amxkVar);
            afid.b(aficVar, "MedialibPlayer.loadVideo(cpn=%s playWhenReady=%s positionMs=%s playerEvents=[%d] videoId=%s mediaView=%s volume=%s)", aesjVar.d, Boolean.valueOf(aedn.h(aeskVar, 2)), Long.valueOf(aesjVar.c.a), amxkVar, "scrubbed", Objects.toString(aesjVar.f), Float.valueOf(aesjVar.i));
            aesa b = aery.b(this.j, this.m.c(aesjVar.d), aemtVar);
            afec afecVar = this.c;
            aerv aervVar = new aerv(aeskVar);
            aervVar.g = aemtVar;
            float f = aesjVar.i;
            if (Float.isNaN(f)) {
                aesjVar.g.g(new afih("invalid.parameter", this.c.g(), String.format(Locale.US, "Volume: %f", Float.valueOf(f))));
            }
            float f2 = 1.0f;
            aervVar.u(Float.valueOf(yjk.y(f, 0.0f, 1.0f)));
            aervVar.a = b;
            float f3 = aesjVar.j;
            if (Float.isNaN(f3)) {
                aesjVar.g.g(new afih("invalid.parameter", this.c.g(), String.format(Locale.US, "Playback rate: %f", Float.valueOf(f3))));
            } else {
                f2 = yjk.y(f3, 0.25f, 2.0f);
            }
            aervVar.t(Float.valueOf(f2));
            aervVar.b = videoStreamingData;
            afecVar.K(aervVar);
            this.g = true;
        }
    }

    public final void u() {
        if (H(new aemr(this, 4))) {
            afic aficVar = afic.ABR;
            this.c.v();
        }
    }

    public final void v() {
        if (H(new aemr(this, 5))) {
            afic aficVar = afic.ABR;
            this.c.w();
        }
    }

    public final void w() {
        if (H(new aemr(this, 6))) {
            afic aficVar = afic.ABR;
            this.c.x();
        }
    }

    public final void x(final aesk aeskVar, final long j) {
        aedn.g(aeskVar, false, j);
        if (H(new Runnable() { // from class: aeml
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.x(aeskVar, j);
            }
        })) {
            aesj aesjVar = (aesj) aeskVar;
            aemt aemtVar = new aemt(this, this.i, aesjVar.g, this.k, this.d, aesjVar.l);
            aesa b = aery.b(this.j, this.m.c(aesjVar.d), aemtVar);
            aerv aervVar = new aerv(aeskVar);
            aervVar.g = aemtVar;
            aervVar.a = b;
            afeb afebVar = new afeb(aervVar, j);
            afic aficVar = afic.ABR;
            e(afebVar.b.a());
            String str = aesjVar.b.c;
            this.c.J(afebVar);
        }
    }

    public final void y(final long j, final aupb aupbVar) {
        if (H(new Runnable() { // from class: aemj
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.y(j, aupbVar);
            }
        })) {
            afic aficVar = afic.ABR;
            this.c.B(j, aupbVar);
        }
    }

    public final void z(final String str) {
        if (H(new Runnable() { // from class: aemo
            @Override // java.lang.Runnable
            public final void run() {
                aemv.this.z(str);
            }
        })) {
            this.f.a(str);
            this.c.z();
        }
    }
}

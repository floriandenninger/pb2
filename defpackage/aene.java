package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aene implements afbu {
    private static final aeou o = new aeou(afqu.NATIVE_MEDIA_PLAYER);
    private static final Set p = Collections.singleton(Integer.valueOf(aand.RAW.bG));
    public final ysy a;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public FormatStreamModel h;
    public PlayerConfigModel i;
    public long j;
    public int k;
    public int l;
    public float m;
    public final afhs n;
    private final Context q;
    private final aeez r;
    private final aemd s;
    private String v;
    private final AtomicReference t = new AtomicReference();
    private final aend u = new aend(this);
    public aeru b = aeru.c;
    private int w = 0;

    public aene(Context context, ysy ysyVar, aeez aeezVar, aemd aemdVar, afhs afhsVar) {
        this.q = context;
        this.a = ysyVar;
        this.r = aeezVar;
        this.s = aemdVar;
        this.n = afhsVar;
    }

    private final aeeu L(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aees aeesVar, int i, String str) {
        return this.r.c(playerConfigModel, videoStreamingData.o, aeesVar, aeez.a, p, 1, i, str, aesa.a, afkj.a);
    }

    private final void O(FormatStreamModel formatStreamModel, long j) {
        this.h = formatStreamModel;
        this.j = j;
        E(true);
        this.g = true;
        int i = (int) formatStreamModel.c;
        this.k = i;
        this.b.k(0L, i);
        try {
            aemg a = this.s.a(formatStreamModel);
            a.k(1 != (this.w & 1) ? 3 : 4);
            a.n(this.u);
            this.b.a().F();
            Uri uri = formatStreamModel.d;
            this.t.set(a);
            if (a == null || uri == null) {
                String valueOf = String.valueOf(a);
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
                sb.append("Media Player null pointer preparing video ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                zga.l(sb.toString());
                this.b.g(new afih("android.fw.npe", 0L, new NullPointerException()));
                return;
            }
            try {
                try {
                    this.b.r();
                    a.l(this.q, uri, null, this.i);
                    a.g();
                    this.b.c(a.a());
                    A(false);
                } catch (IllegalArgumentException e) {
                    zga.n("Media Player error preparing video", e);
                    this.b.g(new afih("android.fw.ise", 0L, e));
                }
            } catch (IOException e2) {
                zga.n("Media Player error preparing video", e2);
                this.b.g(new afih("android.fw.prepare", 0L, e2));
            } catch (IllegalStateException e3) {
                zga.n("Error calling mediaPlayer", e3);
            }
        } catch (InstantiationException e4) {
            zga.b("Factory failed to create a MediaPlayer for the stream");
            this.b.g(new afih("android.fw.create", 0L, e4));
        }
    }

    public final void A(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (z) {
                if (this.g) {
                    this.b.d();
                    return;
                } else {
                    this.b.n();
                    return;
                }
            }
            if (this.g) {
                this.b.q();
                this.b.s(-1L);
            } else {
                this.b.m();
            }
        }
    }

    @Override // defpackage.afcx
    public final void B(long j, aupb aupbVar) {
        if (this.j != j) {
            this.f = true;
            this.j = j;
            aemg aemgVar = (aemg) this.t.get();
            if (this.g) {
                this.b.t(j);
            } else {
                this.b.o(j);
            }
            if (aemgVar == null || !this.c) {
                O(this.h, j);
                return;
            }
            try {
                aemgVar.j(j);
                if (this.d || !this.g) {
                    return;
                }
                u();
            } catch (IllegalStateException e) {
                zga.n("Error calling mediaPlayer", e);
            }
        }
    }

    @Override // defpackage.afcx
    public final void C(float f) {
    }

    @Override // defpackage.afcx
    public final void D(float f) {
        this.m = f;
        aemg aemgVar = (aemg) this.t.get();
        if (aemgVar != null) {
            aemgVar.q(f, f);
        }
    }

    public final void E(boolean z) {
        this.c = false;
        this.d = false;
        this.g = false;
        this.v = null;
        A(false);
        aemg aemgVar = (aemg) this.t.getAndSet(null);
        if (aemgVar != null) {
            this.b.b(aemgVar.a());
            if (z) {
                this.b.v();
            }
            aemgVar.i();
        }
    }

    @Override // defpackage.afec
    public final void F(boolean z) {
        E(z);
    }

    @Override // defpackage.afcx
    public final boolean G() {
        return this.e;
    }

    @Override // defpackage.afbu
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        return videoStreamingData.F();
    }

    @Override // defpackage.afcx
    public final boolean I() {
        return this.t.get() != null && this.d;
    }

    @Override // defpackage.afec
    public final boolean J(afeb afebVar) {
        return false;
    }

    @Override // defpackage.afec
    public final afqu K(aerv aervVar) {
        aeru a = aervVar.a();
        this.b = a;
        a.j(afqu.NATIVE_MEDIA_PLAYER);
        this.i = aervVar.e;
        this.m = aervVar.i;
        try {
            VideoStreamingData videoStreamingData = aervVar.b;
            PlayerConfigModel playerConfigModel = this.i;
            amsx amsxVar = aeez.a;
            aeeu L = L(videoStreamingData, playerConfigModel, null, Integer.MAX_VALUE, this.v);
            int i = L.g;
            if (i != Integer.MAX_VALUE) {
                this.b.i("lmdu", new aeqs(Integer.toString(i)));
            }
            FormatStreamModel formatStreamModel = L.b[0];
            this.b.h(new aeqq(null, formatStreamModel, null, L.d, L.e, L.f, 1, -1L, 0, aeqp.a(f(), g(), -1)));
            this.g = aedn.v(this.w, 2);
            this.w = aervVar.k;
            O(formatStreamModel, aervVar.c.a);
            this.v = aervVar.d;
            return afqu.NATIVE_MEDIA_PLAYER;
        } catch (aeew e) {
            this.b.g(new afih("fmt.noneavailable", 0L, e));
            return afqu.NATIVE_MEDIA_PLAYER;
        }
    }

    @Override // defpackage.afcx
    public final void M() {
        E(true);
    }

    @Override // defpackage.afec
    public final /* synthetic */ void N(boolean z, int i) {
    }

    @Override // defpackage.afcx
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.afcx
    public final int b() {
        return -1;
    }

    @Override // defpackage.afec
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return this.n.D() ? 16 : 0;
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
        return (this.l / 100.0f) * this.k;
    }

    @Override // defpackage.afec
    public final long g() {
        if (((aemg) this.t.get()) != null && this.c) {
            this.j = r0.b();
        }
        return this.j;
    }

    @Override // defpackage.afec
    public final long h() {
        return -1L;
    }

    @Override // defpackage.afec
    public final long i() {
        return this.k;
    }

    @Override // defpackage.afcx
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel k() {
        return this.h;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel l() {
        return null;
    }

    @Override // defpackage.afec
    public final aeeu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        return L(videoStreamingData, playerConfigModel, aeesVar, i, null);
    }

    @Override // defpackage.afcx
    public final aeou n() {
        return o;
    }

    @Override // defpackage.afcx
    public final String o() {
        return this.v;
    }

    @Override // defpackage.afec
    public final void p(afky afkyVar) {
    }

    @Override // defpackage.afcx
    public final void q() {
    }

    @Override // defpackage.afcx
    public final void r() {
    }

    @Override // defpackage.afcx
    public final void s() {
    }

    @Override // defpackage.afec
    public final void t(aaox aaoxVar, aeru aeruVar) {
    }

    public final void u() {
        this.g = true;
        aemg aemgVar = (aemg) this.t.get();
        if (aemgVar != null) {
            try {
                if (this.c) {
                    aemgVar.r();
                    this.d = true;
                    this.b.q();
                    this.b.s(-1L);
                }
            } catch (IllegalStateException e) {
                zga.n("Error calling mediaPlayer", e);
            }
        }
    }

    @Override // defpackage.afcx
    public final void v() {
        aemg aemgVar = (aemg) this.t.get();
        if (aemgVar != null && this.c) {
            try {
                aemgVar.f();
                this.d = false;
                this.g = false;
                this.b.m();
                A(false);
                return;
            } catch (IllegalStateException e) {
                zga.n("Error calling mediaPlayer", e);
                return;
            }
        }
        if (this.g) {
            this.g = false;
            this.b.m();
        }
    }

    @Override // defpackage.afcx
    public final void w() {
    }

    @Override // defpackage.afcx
    public final void x() {
        u();
    }

    @Override // defpackage.afec
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.afcx
    public final void z() {
    }
}

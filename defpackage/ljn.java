package defpackage;

import android.content.Context;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.ConnectivitySlimStatusBarController;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ljn implements SoundPool.OnLoadCompleteListener, lkc, ypd {
    public static final /* synthetic */ int y = 0;
    private final akfz A;
    private final ScheduledExecutorService B;
    private final akfq C;
    private final int D;
    private final int E;
    private final int F;

    /* renamed from: J, reason: collision with root package name */
    private boolean f234J;
    private final aadw K;
    private final akbc L;
    private final axzg M;
    public final aaea a;
    public final ljm b;
    public final lkd c;
    public final ConnectivitySlimStatusBarController d;
    public final Handler e;
    public final ysy f;
    public final aarr g;
    public final acra h;
    public final acsy i;
    public akfo j;
    public final Runnable k;
    SoundPool l;
    final int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean s;
    public boolean t;
    public boolean u;
    AudioRecord v;
    protected akfn w;
    public final agcm x;
    private final Context z;
    private int G = 2;
    private int H = 16;
    private int I = 16000;
    public List r = amru.q();

    public ljn(Context context, aaea aaeaVar, aadw aadwVar, akfq akfqVar, akbc akbcVar, agcm agcmVar, akfz akfzVar, ScheduledExecutorService scheduledExecutorService, ysy ysyVar, aarr aarrVar, ljm ljmVar, lkd lkdVar, ConnectivitySlimStatusBarController connectivitySlimStatusBarController, Handler handler, acra acraVar, acsy acsyVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.z = context;
        this.a = aaeaVar;
        this.K = aadwVar;
        this.C = akfqVar;
        this.L = akbcVar;
        this.x = agcmVar;
        this.A = akfzVar;
        this.B = scheduledExecutorService;
        this.f = ysyVar;
        this.g = aarrVar;
        this.b = ljmVar;
        this.c = lkdVar;
        this.d = connectivitySlimStatusBarController;
        this.e = handler;
        this.h = acraVar;
        this.i = acsyVar;
        this.M = axzgVar;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.l = soundPool;
        soundPool.setOnLoadCompleteListener(this);
        this.m = this.l.load(context, R.raw.open, 0);
        this.D = this.l.load(context, R.raw.success, 0);
        this.E = this.l.load(context, R.raw.no_input, 0);
        this.F = this.l.load(context, R.raw.failure, 0);
        lkdVar.d(this);
        this.o = ysyVar.p();
        this.k = new Runnable() { // from class: lji
            @Override // java.lang.Runnable
            public final void run() {
                ljn ljnVar = ljn.this;
                ljnVar.i();
                ljnVar.d();
            }
        };
    }

    private final String q() {
        String c = akbc.c();
        String a = this.L.a();
        if (c.isEmpty() || a.isEmpty()) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder(c.length() + 1 + String.valueOf(a).length());
        sb.append(c);
        sb.append("-");
        sb.append(a);
        return sb.toString();
    }

    private final void r(int i) {
        SoundPool soundPool = this.l;
        if (soundPool != null && soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f) == 0 && i == this.m) {
            this.f234J = true;
        }
    }

    public final zw a() {
        return new ljj(this);
    }

    public final anhy b() {
        return anaf.V(this.x.k(), 300L, TimeUnit.MILLISECONDS, this.B);
    }

    public final void c() {
        if (!this.c.q() || this.r.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(this.z.getResources().getString(R.string.try_saying_text));
        sb.append(this.c.b());
        sb.append("''");
        int i = 0;
        sb.append((String) this.r.get(0));
        sb.append("''");
        this.c.e(sb);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.r) {
            i++;
            sb2.append("''");
            sb2.append(str);
            sb2.append("''");
            if (i >= this.c.a()) {
                break;
            } else {
                sb2.append("\n\n");
            }
        }
        this.c.c(sb2);
    }

    public final void d() {
        l();
        this.c.k();
    }

    public final void e() {
        this.h.I(3, new acqx(acsb.c(88272)), null);
        this.b.f();
    }

    public final void g(String str, byte[] bArr, String str2) {
        String str3;
        boolean z;
        if (this.w == null) {
            this.w = new ljl(this);
        }
        ljk ljkVar = new ljk(this);
        if (str.isEmpty()) {
            str3 = q();
            z = false;
        } else {
            str3 = str;
            z = true;
        }
        if (this.j == null) {
            akfp a = this.C.a(this.w, ljkVar, this.I, str3, bArr, evr.bl(this.a), this.G, this.H, str2, q());
            a.C = evr.bm(this.a);
            a.w = evr.q(this.a);
            a.c(evr.r(this.a));
            a.y = evr.z(this.a);
            a.s = evr.ac(this.a);
            a.v = evr.ay(this.K) && z;
            a.b(ammv.j(evr.B(this.a)));
            a.A = evr.x(this.a);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.M.d().as(false).V(new lgx(atomicBoolean, 4)));
            a.t = atomicBoolean.get();
            this.j = a.a();
        }
    }

    @Override // defpackage.lkc
    public final void h() {
        if (this.n) {
            this.h.I(3, new acqx(acsb.c(62943)), null);
            r(this.E);
            this.p = true;
            m();
            return;
        }
        n();
    }

    public final void i() {
        if (this.n || !this.c.r()) {
            r(this.F);
        }
    }

    public final void j() {
        r(this.D);
    }

    public final void k() {
        akfo akfoVar = this.j;
        if (akfoVar != null) {
            akfoVar.a();
            this.j = null;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            boolean a = ((yro) obj).a();
            this.o = a;
            ConnectivitySlimStatusBarController connectivitySlimStatusBarController = this.d;
            if (connectivitySlimStatusBarController != null) {
                connectivitySlimStatusBarController.m(!a);
            }
            if (this.o) {
                this.e.removeCallbacks(this.k);
                this.c.g();
                return null;
            }
            if (this.n) {
                this.e.postDelayed(this.k, 3000L);
                return null;
            }
            d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        this.n = false;
        this.t = false;
        this.u = false;
        akfo akfoVar = this.j;
        if (akfoVar != null) {
            akfoVar.c();
        }
    }

    public final void m() {
        l();
        this.c.o(this.o, this.p);
    }

    public final void n() {
        this.n = true;
        this.p = false;
        this.q = false;
        this.c.i();
        akfo akfoVar = this.j;
        if (akfoVar == null || !akfoVar.f()) {
            this.b.h();
        } else {
            r(this.m);
        }
    }

    public final void o() {
        this.n = false;
        this.w = null;
        SoundPool soundPool = this.l;
        if (soundPool != null) {
            soundPool.release();
            this.l = null;
        }
        k();
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        int i3 = this.m;
        if (i == i3 && this.f234J) {
            r(i3);
            this.f234J = false;
        }
    }

    public final boolean p() {
        AudioRecord a = this.A.a();
        this.v = a;
        if (a == null) {
            return false;
        }
        this.G = a.getAudioFormat();
        this.H = this.v.getChannelConfiguration();
        this.I = this.v.getSampleRate();
        return true;
    }
}

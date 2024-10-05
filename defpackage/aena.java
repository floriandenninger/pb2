package defpackage;

import android.content.Context;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aena extends HandlerThread implements Handler.Callback {
    public static final /* synthetic */ int r = 0;
    public final aenc a;
    public final Context b;
    final aemz c;
    public Handler d;
    public volatile float e;
    public volatile float f;
    public volatile long g;
    public volatile boolean h;
    public aeru i;
    public afky j;
    public aemw k;
    public volatile boolean l;
    public volatile boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public final afhs q;
    private final PlaybackParams s;
    private final afdf t;
    private final aemd u;
    private volatile aemg v;
    private PlayerConfigModel w;

    public aena(aenc aencVar, Context context, afdf afdfVar, aemd aemdVar, afhs afhsVar) {
        super("Medialib.AndroidFrameworkPlayer");
        this.e = 1.0f;
        this.f = 1.0f;
        this.a = aencVar;
        this.b = context;
        this.t = afdfVar;
        afki.a(aemdVar);
        this.u = aemdVar;
        this.q = afhsVar;
        this.c = new aemz(this);
        this.s = Build.VERSION.SDK_INT >= 23 ? new PlaybackParams() : null;
    }

    private final void j() {
        this.h = true;
        if (this.v == null) {
            return;
        }
        try {
            if (i()) {
                this.v.r();
                afky afkyVar = this.j;
                if (afkyVar != null) {
                    afkyVar.n(500);
                }
                this.n = true;
                this.d.sendEmptyMessage(11);
                if (!this.p) {
                    this.i.q();
                    this.i.s(-1L);
                }
            }
            this.p = false;
        } catch (IllegalStateException e) {
            zga.d("AndroidFwPlayer: ISE calling start", e);
        }
    }

    private final void k(aemw aemwVar) {
        this.k = aemwVar;
        this.f = aemwVar.g;
        c(this.i);
        Boolean bool = aemwVar.h;
        if (bool != null) {
            this.h = bool.booleanValue();
        }
        try {
            this.v = this.u.a(aemwVar.b);
            aemg aemgVar = this.v;
            aenc aencVar = this.a;
            int i = aenc.n;
            aemgVar.k(1 != (aencVar.l & 1) ? 3 : 4);
            this.v.n(this.c);
            aane n = aemwVar.b.n();
            n.c(aemwVar.a);
            n.e(adyu.N(aemwVar.b, aemwVar.e));
            Uri a = n.a();
            this.i = aemwVar.c;
            this.w = aemwVar.e;
            try {
                if (!this.p) {
                    this.i.r();
                }
                l(aemwVar.d);
                aemg aemgVar2 = this.v;
                Context context = this.b;
                aenc aencVar2 = this.a;
                HashMap hashMap = new HashMap();
                hashMap.put("x-disconnect-at-highwatermark", "1");
                hashMap.put("User-Agent", aencVar2.b);
                aemgVar2.l(context, a, hashMap, this.w);
                this.v.h();
                this.i.c(this.v.a());
                d(true);
            } catch (IOException e) {
                zga.d("AndroidFwPlayer: IOE preparing video", e);
                this.i.g(new afih("android.fw.prepare", 0L, e));
            } catch (IllegalArgumentException e2) {
                zga.d("AndroidFwPlayer: IAE preparing video", e2);
                this.i.g(new afih("android.fw.ise", 0L, e2));
            } catch (IllegalStateException e3) {
                zga.d("AndroidFwPlayer: ISE preparing video", e3);
            }
        } catch (InstantiationException e4) {
            zga.b("AndroidFwPlayer: Factory failed to create a MediaPlayer for the stream");
            this.i.g(new afih("android.fw.create", 0L, e4));
        }
    }

    private final void l(afky afkyVar) {
        if (afkyVar == null) {
            this.j = null;
            return;
        }
        if (this.v == null || this.j == afkyVar || !afkyVar.E()) {
            return;
        }
        SurfaceHolder B = afkyVar.B();
        if (B != null) {
            try {
                this.t.o(afde.SET_SURFACE_HOLDER, afqu.NATIVE_MEDIA_PLAYER);
                this.v.m(B);
            } catch (IllegalArgumentException e) {
                zga.d("AndroidFwPlayer: IAE attaching Surface.", e);
                this.i.g(new afih("player.fatalexception", this.v.b(), e));
                return;
            }
        } else if (afkyVar.E()) {
            Surface A = afkyVar.A();
            this.t.i(A, afqu.NATIVE_MEDIA_PLAYER);
            this.v.p(A);
        }
        this.j = afkyVar;
    }

    private final void m(afjp afjpVar) {
        this.k = null;
        this.m = false;
        this.n = false;
        this.o = false;
        c(this.i);
        this.i = aeru.c;
        this.j = null;
        this.w = null;
        if (afjpVar != null) {
            afjpVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        afjp afjpVar = new afjp();
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(13, afjpVar));
        try {
            afjpVar.get(this.q.k(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            aeru aeruVar = this.i;
            if (aeruVar != null) {
                aeruVar.g(new afih("player.timeout", this.g, e));
            }
            aenc aencVar = this.a;
            int i = aenc.n;
            aencVar.A();
        } catch (Exception e2) {
            afid.c(afic.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.d.sendEmptyMessage(2);
    }

    final void c(aeru aeruVar) {
        if (this.v != null) {
            if (aeruVar != null) {
                aeruVar.b(this.v.a());
            }
            this.v.i();
            this.v = null;
        }
    }

    public final void d(boolean z) {
        if (this.o != z) {
            this.o = z;
            if (z) {
                if (this.h) {
                    this.i.d();
                    return;
                } else {
                    this.i.n();
                    return;
                }
            }
            if (this.h) {
                this.i.q();
                this.i.s(-1L);
            } else {
                this.i.m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(afky afkyVar) {
        Handler handler = this.d;
        handler.sendMessage(Message.obtain(handler, 9, afkyVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(float f) {
        Handler handler = this.d;
        handler.sendMessage(Message.obtain(handler, 12, Float.valueOf(f)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.d.removeMessages(1);
        this.d.sendEmptyMessage(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.d.removeMessages(1);
        afjp afjpVar = new afjp();
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(5, afjpVar));
        try {
            afjpVar.get(this.q.j(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            aeru aeruVar = this.i;
            if (aeruVar != null) {
                aeruVar.g(new afih("player.timeout", this.g, e));
            }
            aenc aencVar = this.a;
            int i = aenc.n;
            aencVar.A();
        } catch (Exception e2) {
            afid.c(afic.FWP, e2, "Exception in AndroidFw.MediaFuture.get.", new Object[0]);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        PlaybackParams playbackParams;
        switch (message.what) {
            case 1:
                k((aemw) message.obj);
                return true;
            case 2:
                j();
                return true;
            case 3:
                if (this.v != null) {
                    if (i()) {
                        try {
                            this.v.f();
                            this.n = false;
                            this.h = false;
                            this.i.m();
                            d(false);
                        } catch (IllegalStateException e) {
                            zga.d("AndroidFwPlayer: ISE calling pause", e);
                        }
                    } else if (this.h) {
                        this.h = false;
                        this.i.m();
                    }
                }
                return true;
            case 4:
                long longValue = ((Long) message.obj).longValue();
                if (this.h) {
                    this.i.t(longValue);
                } else {
                    this.i.o(longValue);
                }
                if (this.v != null && i()) {
                    try {
                        this.v.j(longValue);
                        if (!this.n && this.h) {
                            j();
                            aenc aencVar = this.a;
                            int i = aenc.n;
                            aencVar.E(true);
                        }
                    } catch (IllegalStateException e2) {
                        zga.d("AndroidFwPlayer: ISE calling seek", e2);
                    }
                } else {
                    aemw aemwVar = this.k;
                    if (aemwVar != null) {
                        this.a.V(aemwVar.b, longValue, null, null);
                    }
                }
                return true;
            case 5:
                m((afjp) message.obj);
                return true;
            case 6:
                m(null);
                getLooper().quit();
                this.d.removeCallbacksAndMessages(null);
                return true;
            case 7:
            case 8:
            default:
                return false;
            case 9:
                l((afky) message.obj);
                return true;
            case 10:
                float floatValue = ((Float) message.obj).floatValue();
                if (this.m && this.v != null && (playbackParams = this.s) != null) {
                    playbackParams.setSpeed(floatValue);
                    try {
                        this.v.o(this.s);
                        this.e = floatValue;
                        this.i.p(floatValue);
                    } catch (Exception unused) {
                        afif afifVar = afif.PROGRESSIVE;
                        StringBuilder sb = new StringBuilder(30);
                        sb.append("info.varispeed.");
                        sb.append(floatValue);
                        this.i.g(new afih(afifVar, "player.exception", 0L, sb.toString()));
                    }
                }
                return true;
            case 11:
                if (this.v != null && this.m) {
                    long b = this.v.b();
                    if (b > this.g) {
                        aenc aencVar2 = this.a;
                        int i2 = aenc.n;
                        aencVar2.m.set(0);
                    }
                    this.g = b;
                }
                if (this.n) {
                    this.d.sendEmptyMessageDelayed(11, 250L);
                }
                return true;
            case 12:
                float floatValue2 = ((Float) message.obj).floatValue();
                this.f = floatValue2;
                if (this.m && this.v != null) {
                    this.v.q(floatValue2, floatValue2);
                }
                return true;
            case 13:
                afjp afjpVar = (afjp) message.obj;
                if (this.j != null) {
                    if (this.v != null) {
                        this.t.i(null, afqu.NATIVE_MEDIA_PLAYER);
                        this.v.p(null);
                        this.v.m(null);
                    }
                    this.t.f(null, afqu.NATIVE_MEDIA_PLAYER);
                    this.j = null;
                }
                afjpVar.run();
                return true;
        }
    }

    public final boolean i() {
        return this.m && this.l;
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        if (getLooper() == null) {
            return false;
        }
        this.d.sendEmptyMessage(6);
        return true;
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        this.d = new Handler(getLooper(), this);
    }
}

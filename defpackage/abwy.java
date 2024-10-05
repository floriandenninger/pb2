package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abwy implements abxb, abxd {
    private static final long X = TimeUnit.SECONDS.toMillis(1);
    public static final long a = TimeUnit.SECONDS.toMillis(5);
    public Integer A;
    public Integer B;
    public long C;
    public String D;
    public String E;
    public aqyg F;
    public String G;
    public abww H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f26J;
    public int K;
    public boolean L;
    public boolean R;
    public boolean S;
    public long T;
    public long U;
    public atfw V;
    public final axze W;
    private final boolean Y;
    private final boolean Z;
    private abwl ab;
    public final abtp b;
    public final abwu c;
    public final abwr d;
    public final abwt e;
    public final absm f;
    public final abub g;
    public final shf h;
    public final abxc i;
    public final absq j;
    public final abya k;
    public final abzs l;
    public final akwd m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final Handler s;
    public final Context t;
    public acap v;
    public abwx w;
    public final String x;
    public boolean y;
    public final boolean z;
    private final Runnable aa = new abwb(this, 0);
    public final Runnable u = new abwb(this, 2);
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public final int Q = -1;

    public abwy(Context context, Handler handler, abtp abtpVar, abwu abwuVar, abwr abwrVar, abwt abwtVar, axze axzeVar, absm absmVar, advq advqVar, shf shfVar, absq absqVar, abya abyaVar, abzs abzsVar, abrn abrnVar, akwd akwdVar, abtl abtlVar, String str, boolean z, boolean z2, boolean z3, Integer num, Integer num2, String str2, String str3, long j, long j2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = abtpVar;
        this.c = abwuVar;
        this.d = abwrVar;
        this.e = abwtVar;
        this.W = axzeVar;
        this.f = absmVar;
        Context context2 = (Context) advqVar.a.get();
        context2.getClass();
        aays aaysVar = (aays) advqVar.b.get();
        aaysVar.getClass();
        this.g = new abub(context2, aaysVar, str);
        this.h = shfVar;
        this.i = new abxc(handler, this);
        this.j = absqVar;
        this.k = abyaVar;
        this.l = abzsVar;
        this.s = handler;
        this.t = context;
        this.y = z4;
        this.m = akwdVar;
        this.x = str;
        this.K = -1;
        this.z = z;
        this.A = num;
        this.B = num2;
        this.D = str2;
        this.E = str3;
        this.I = j;
        this.f26J = j2;
        this.n = z5;
        this.o = z6;
        this.Y = z7;
        this.Z = z8;
        this.p = z9;
        this.q = i;
        this.r = z3;
        this.L = z2;
        c();
        if (axzeVar.p()) {
            abrnVar.l(absqVar.m());
        }
        absqVar.h(abtlVar);
    }

    private final void A() {
        abwl abwlVar = this.ab;
        if (abwlVar != null) {
            this.f.b.remove(abwlVar);
            this.ab = null;
        }
        this.f.c();
    }

    private final void B() {
        abtp abtpVar = this.b;
        abtpVar.o = null;
        if (abtpVar.d) {
            abtpVar.b.unregisterReceiver(abtpVar.m);
            abtpVar.b.unregisterReceiver(abtpVar.n);
            abtpVar.c.removeCallbacks(abtpVar.i);
            abtpVar.c.removeCallbacks(abtpVar.l);
            abvt.b().f(assb.class, abtp.class, null);
            abtpVar.d = false;
        } else {
            Log.w("CaptureRsrcMonitor", "Resource monitor already stopped.");
        }
        abub abubVar = this.g;
        abubVar.A = null;
        if (abubVar.v) {
            abubVar.v = false;
            abubVar.e.post(new abtu(abubVar, 0));
            synchronized (abubVar) {
                abubVar.g.removeCallbacksAndMessages(abubVar);
                abubVar.t++;
                abubVar.e.removeCallbacks(abubVar.h);
            }
        }
        A();
    }

    private final boolean C(int i, long j, int i2) {
        if (!this.l.i(i)) {
            return false;
        }
        abzs.b(this.l.g(i, this.z));
        return j >= ((long) i2);
    }

    public final void a() {
        l(0);
    }

    public final void b(boolean z) {
        abvt.b().k(asrx.class);
        this.j.o(new abwa(this, z));
    }

    public final void c() {
        A();
        this.f.c();
        this.N = this.f.a();
        this.P = this.f.a();
        this.O = this.f.a();
        this.M = this.f.a();
        abwl abwlVar = new abwl(this, null);
        this.ab = abwlVar;
        absm absmVar = this.f;
        absmVar.b.put(abwlVar, new absj(absmVar, abwlVar, null));
    }

    public final void d(int i, String str) {
        u(true, true);
        this.c.u(i, this.V, str, this.F, this.L);
    }

    public final void e(final int i) {
        if (this.S && x()) {
            String str = this.D;
            String str2 = this.E;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            MediaFormat g = this.l.g(this.K, this.z);
            if (g == null) {
                zga.b("Could not find any supported encoders");
                h(7);
                return;
            }
            Bundle bundle = new Bundle();
            adyu.cD(bundle);
            bundle.putBoolean("KEY_ENABLE_THROUGHPUT_MEASUREMENT", true);
            final int integer = g.getInteger("bitrate");
            adyu.cS(bundle, 2);
            this.j.q(this.y, this.z, this.A, this.B, g, this.l.f(), this.D, this.E, this.v, bundle, new abso() { // from class: abvv
                @Override // defpackage.abso
                public final void a(int i2) {
                    abwy abwyVar = abwy.this;
                    int i3 = i;
                    int i4 = integer;
                    if (abwyVar.d.d()) {
                        if (i2 == 0) {
                            if (abwyVar.S) {
                                absi b = abwyVar.j.b();
                                if (b == null) {
                                    zga.b("No ABR controller for SpeedTest");
                                    abwyVar.a();
                                    return;
                                }
                                b.d(false);
                                abvu abvuVar = new abvu(abwyVar, i3, b);
                                double d = i4;
                                Double.isNaN(d);
                                b.c(i4 + ((int) (d * 0.5d)), abvuVar);
                                return;
                            }
                            return;
                        }
                        if (i2 == 7 || i2 == 8 || i2 == 11 || i2 == 12) {
                            StringBuilder sb = new StringBuilder(70);
                            sb.append("Communication or timeout error while preparing SpeedTest - ");
                            sb.append(i2);
                            zga.l(sb.toString());
                            abwyVar.l(i3);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(38);
                        sb2.append("Error preparing SpeedTest: ");
                        sb2.append(i2);
                        zga.b(sb2.toString());
                        abwyVar.a();
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        if (r0 == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwy.f():void");
    }

    public final void g(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apxf apxfVar = (apxf) it.next();
                if (apxfVar.pY(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand)) {
                    this.j.c((LogStreamEventsCommandOuterClass$LogStreamEventsCommand) apxfVar.pX(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand));
                    return;
                }
            }
        }
    }

    public final void h(int i) {
        i(i, null, false);
    }

    public final void i(int i, String str, boolean z) {
        if (i != 26 && i != 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Error during live stream: status=");
            sb.append(i);
            sb.append(", attemptStopBroadcast=");
            sb.append(z);
            zga.b(sb.toString());
        }
        if (z) {
            this.k.e(this.x, new abwi(this, i, str));
        } else {
            d(i, str);
        }
    }

    public final void j(final int i, final boolean z, final boolean z2, final int i2) {
        if (this.S) {
            String str = this.D;
            String str2 = this.E;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            Bundle bundle = new Bundle();
            MediaFormat f = this.l.f();
            MediaFormat g = this.l.g(this.K, this.z);
            if (!this.p) {
                if (f == null || g == null) {
                    zga.b("Could not find supported encoders");
                    h(7);
                    return;
                }
                if (z) {
                    adyu.cD(bundle);
                }
                int i3 = 1;
                if (z2) {
                    bundle.putBoolean("extras-key-enable-bitrate-bounce", true);
                }
                amkq.E(i2 >= 0);
                bundle.putInt("extras-key-send-buffer-chunk-count", i2);
                if (this.W.i() != null) {
                    astj i4 = this.W.i();
                    int i5 = this.K;
                    if (i5 == 0 || i5 == 1 || i5 == 2) {
                        int i6 = i4.e;
                        if (i6 > 0) {
                            adyu.cB(bundle, i6 * 1000);
                        }
                    } else {
                        int i7 = i4.d;
                        if (i7 > 0) {
                            adyu.cB(bundle, i7 * 1000);
                        }
                    }
                    int dd = amkq.dd(i4.g);
                    if (dd != 0 && dd != 1) {
                        int dd2 = amkq.dd(i4.g);
                        if (dd2 != 0) {
                            i3 = dd2;
                        }
                        adyu.cS(bundle, i3);
                        bundle.putLong("KEY_SPEED_TEST_BITRATE", this.C);
                    }
                }
                i3 = 3;
                adyu.cS(bundle, i3);
                bundle.putLong("KEY_SPEED_TEST_BITRATE", this.C);
            }
            this.j.q(this.y, this.z, this.A, this.B, g, f, this.D, this.E, this.v, bundle, new abso() { // from class: abvw
                @Override // defpackage.abso
                public final void a(int i8) {
                    final abwy abwyVar = abwy.this;
                    final int i9 = i;
                    final boolean z3 = z;
                    final boolean z4 = z2;
                    final int i10 = i2;
                    if (i8 != 0) {
                        if (i8 != 7) {
                            if (i8 == 8) {
                                if (i9 > 0) {
                                    abwyVar.s.postDelayed(new Runnable() { // from class: abwd
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            abwy abwyVar2 = abwy.this;
                                            int i11 = i9;
                                            boolean z5 = z3;
                                            boolean z6 = z4;
                                            int i12 = i10;
                                            if (abwyVar2.S) {
                                                abwyVar2.j(i11 - 1, z5, z6, i12);
                                            }
                                        }
                                    }, 500L);
                                    return;
                                } else {
                                    abwyVar.i.m();
                                    return;
                                }
                            }
                            if (i8 != 11 && i8 != 12) {
                                StringBuilder sb = new StringBuilder(36);
                                sb.append("Error preparing capture: ");
                                sb.append(i8);
                                zga.b(sb.toString());
                                abwyVar.h(i8);
                                return;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(68);
                        sb2.append("Communication or timeout error while preparing capture - ");
                        sb2.append(i8);
                        zga.l(sb2.toString());
                        abwyVar.i.m();
                        return;
                    }
                    abwyVar.o();
                }
            });
        }
    }

    public final void k(int i) {
        if (this.S) {
            abxc abxcVar = this.i;
            abxcVar.h = true;
            abxcVar.h();
            this.k.h(this.x, new abwk(this, i));
        }
    }

    public final void l(final int i) {
        this.j.f(new abso() { // from class: abwh
            @Override // defpackage.abso
            public final void a(int i2) {
                final abwy abwyVar = abwy.this;
                final int i3 = i;
                if (i3 > 0) {
                    abwyVar.s.postDelayed(new Runnable() { // from class: abwc
                        @Override // java.lang.Runnable
                        public final void run() {
                            abwy abwyVar2 = abwy.this;
                            int i4 = i3;
                            if (abwyVar2.S) {
                                abwyVar2.e(i4 - 1);
                            }
                        }
                    }, 500L);
                } else {
                    abwyVar.c.z();
                    abwyVar.i.b();
                }
            }
        });
    }

    public final void m(abww abwwVar, String str) {
        if (abwwVar == this.H) {
            return;
        }
        this.H = abwwVar;
        abvt.b().i(assb.class);
        this.e.l(abwwVar, str);
    }

    public final void n(boolean z, abwv abwvVar) {
        String str = true != z ? "DISABLED" : "ENABLED";
        if (str.length() != 0) {
            "Setting mic for live capture to ".concat(str);
        }
        if (!this.S || !this.i.k()) {
            this.y = z;
            abwvVar.a(z);
        } else {
            this.j.n(z, new abwf(this, abwvVar));
        }
    }

    public final void o() {
        if (this.S) {
            abwx abwxVar = this.w;
            int i = 1;
            if (abwxVar != null && !this.R) {
                long a2 = ((zok) ((accc) abwxVar).a.h.get()).a();
                if (a2 > 0) {
                    this.R = true;
                    this.s.postDelayed(new abwb(this, 3), a2);
                    return;
                }
            }
            this.j.i(new abwe(this, i), new abwg(this, 2));
        }
    }

    public final void p() {
        boolean z = true;
        this.S = true;
        if (TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.E)) {
            if (this.r) {
                zga.b("Can't start a co-stream without stream url and key");
                return;
            }
            this.i.i(false);
        } else {
            if (!this.p && !x()) {
                return;
            }
            if (this.r) {
                this.i.i(true);
            } else {
                abxc abxcVar = this.i;
                boolean z2 = this.L;
                int a2 = abxcVar.a(abxcVar.a);
                abxcVar.a = a2;
                abxcVar.l = true;
                abxcVar.m = z2;
                if (!abxcVar.h && !z2) {
                    z = false;
                }
                abxcVar.h = z;
                abxcVar.g(a2);
            }
        }
        abws abwsVar = new abws(this);
        abvt.b().f(asrx.class, abws.class, abwsVar);
        abvt.b().f(assb.class, abws.class, abwsVar);
    }

    @Override // defpackage.abxb
    public final void q(boolean z) {
        if (this.d.d()) {
            this.c.y(z);
        }
    }

    @Override // defpackage.abxb
    public final void r() {
        if (this.d.d()) {
            int i = this.W.i().F;
            if (i > 0) {
                this.s.postDelayed(this.aa, i);
            }
            z(null);
            B();
            this.k.e(this.x, new abwn(this));
            abvt.b().f(asrx.class, abws.class, null);
            abvt.b().f(assb.class, abws.class, null);
        }
    }

    public final void s(boolean z) {
        this.S = false;
        this.f26J = this.h.d() - this.I;
        t();
        if (z) {
            u(false, true);
            return;
        }
        this.s.removeCallbacks(this.u);
        abxc abxcVar = this.i;
        if (abxcVar.a == 14) {
            i(26, this.t.getString(R.string.lc_error_generic), this.L);
        } else if (this.L) {
            abxcVar.c(0);
        } else {
            abxcVar.c(26);
        }
    }

    public final void t() {
        this.s.removeCallbacks(this.aa);
    }

    public final void u(boolean z, boolean z2) {
        abwg abwgVar = null;
        if (z2) {
            this.s.removeCallbacksAndMessages(null);
        }
        abvt.b().k(asrx.class);
        B();
        if (z) {
            abwgVar = new abwg(this, 3);
            abxc abxcVar = this.i;
            abxcVar.k = true;
            abxcVar.h();
        }
        this.j.f(abwgVar);
    }

    public final boolean v() {
        absm absmVar = this.f;
        return absmVar != null && absmVar.a.size() > 0;
    }

    public final boolean w() {
        if (!this.S || !this.i.k()) {
            return this.y;
        }
        return this.j.j();
    }

    public final boolean x() {
        if (this.K != -1) {
            return true;
        }
        int i = 2;
        if (!this.l.i(2)) {
            if (this.l.i(3)) {
                i = 3;
            } else if (this.Z && this.l.i(4)) {
                i = 4;
            } else {
                i = (this.Y && this.l.i(5)) ? 5 : -1;
            }
        }
        this.K = i;
        if (i != -1) {
            return true;
        }
        abvt.b().n(15, 1, null);
        abxc abxcVar = this.i;
        abxcVar.g = true;
        abxcVar.d = 3;
        abxcVar.h();
        return false;
    }

    public final void z(abwq abwqVar) {
        if (this.S) {
            this.j.p(new abvy(this, abwqVar, 1));
        } else {
            zga.b("Cannot pause capture stream not active");
        }
    }
}

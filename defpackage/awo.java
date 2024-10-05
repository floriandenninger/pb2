package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.common.decoder.SimpleOutputBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class awo extends ple implements psx {
    public final awa a;
    public final awh b;
    public boolean c;
    private final asw d;
    private auj e;
    private pms f;
    private int g;
    private int h;
    private ast i;
    private asw j;
    private SimpleOutputBuffer k;
    private ayh l;
    private ayh m;
    private int n;
    private boolean o;
    private boolean p;
    private long q;
    private boolean u;
    private boolean v;
    private boolean w;

    public awo() {
        this((Handler) null, (awb) null, new avr[0]);
    }

    private final void t() {
        CryptoConfig cryptoConfig;
        if (this.i != null) {
            return;
        }
        x(this.m);
        ayh ayhVar = this.l;
        if (ayhVar != null) {
            cryptoConfig = ayhVar.b();
            if (cryptoConfig == null && this.l.c() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = pts.a;
            this.i = c(this.f, cryptoConfig);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.a.c(this.i.c(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.e.a++;
        } catch (asu e) {
            prh.j("DecoderAudioRenderer", "Audio codec error", e);
            this.a.a(e);
            throw aj(e, this.f, 4001);
        } catch (OutOfMemoryError e2) {
            throw aj(e2, this.f, 4001);
        }
    }

    private final void u(pmt pmtVar) {
        auk g;
        pms pmsVar = pmtVar.b;
        pse.c(pmsVar);
        y(pmtVar.a);
        pms pmsVar2 = this.f;
        this.f = pmsVar;
        this.g = pmsVar.D;
        this.h = pmsVar.E;
        ast astVar = this.i;
        if (astVar == null) {
            t();
            this.a.g(this.f, null);
            return;
        }
        if (this.m != this.l) {
            g = new auk(astVar.c(), pmsVar2, pmsVar, 0, 128);
        } else {
            g = g(astVar.c(), pmsVar2, pmsVar);
        }
        if (g.d == 0) {
            if (this.o) {
                this.n = 1;
            } else {
                w();
                t();
                this.p = true;
            }
        }
        this.a.g(this.f, g);
    }

    private final void v() {
        this.w = true;
        this.b.i();
    }

    private final void w() {
        this.j = null;
        this.k = null;
        this.n = 0;
        this.o = false;
        ast astVar = this.i;
        if (astVar != null) {
            this.e.b++;
            astVar.f();
            this.a.d(this.i.c());
            this.i = null;
        }
        x(null);
    }

    private final void x(ayh ayhVar) {
        arv.b(this.l, ayhVar);
        this.l = ayhVar;
    }

    private final void y(ayh ayhVar) {
        arv.b(this.m, ayhVar);
        this.m = ayhVar;
    }

    private final void z() {
        long b = this.b.b(r());
        if (b != Long.MIN_VALUE) {
            if (!this.c) {
                b = Math.max(this.q, b);
            }
            this.q = b;
            this.c = false;
        }
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        if (!psz.j(pmsVar.n)) {
            return 0;
        }
        int b = b(pmsVar);
        if (b <= 2) {
            return b;
        }
        int i = pts.a;
        return b | 40;
    }

    protected abstract int b(pms pmsVar);

    protected abstract ast c(pms pmsVar, CryptoConfig cryptoConfig);

    protected abstract pms e(ast astVar);

    @Override // defpackage.psx
    public final long f() {
        if (this.s == 2) {
            z();
        }
        return this.q;
    }

    protected auk g(String str, pms pmsVar, pms pmsVar2) {
        return new auk(str, pmsVar, pmsVar2, 0, 1);
    }

    @Override // defpackage.psx
    public final pnu h() {
        return this.b.c();
    }

    @Override // defpackage.ple, defpackage.poe
    public final psx i() {
        return this;
    }

    @Override // defpackage.ple
    protected final void k() {
        this.f = null;
        this.p = true;
        try {
            y(null);
            w();
            this.b.j();
        } finally {
            this.a.e(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void l(boolean z, boolean z2) {
        auj aujVar = new auj();
        this.e = aujVar;
        this.a.f(aujVar);
        aB();
        this.b.d();
    }

    @Override // defpackage.ple
    protected final void m(long j, boolean z) {
        this.b.e();
        this.q = j;
        this.u = true;
        this.c = true;
        this.v = false;
        this.w = false;
        if (this.i != null) {
            if (this.n != 0) {
                w();
                t();
                return;
            }
            this.j = null;
            SimpleOutputBuffer simpleOutputBuffer = this.k;
            if (simpleOutputBuffer != null) {
                simpleOutputBuffer.release();
                this.k = null;
            }
            this.i.d();
            this.o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ple
    public void n() {
        this.b.h();
    }

    @Override // defpackage.ple
    protected final void o() {
        z();
        this.b.g();
    }

    @Override // defpackage.poe
    public final void p(long j, long j2) {
        if (!this.w) {
            if (this.f == null) {
                pmt al = al();
                this.d.clear();
                int af = af(al, this.d, 2);
                if (af != -5) {
                    if (af == -4) {
                        pse.g(this.d.isEndOfStream());
                        this.v = true;
                        try {
                            v();
                            return;
                        } catch (awg e) {
                            throw aj(e, null, 5002);
                        }
                    }
                    return;
                }
                u(al);
            }
            t();
            if (this.i != null) {
                try {
                    try {
                        int i = pts.a;
                        while (true) {
                            if (this.k == null) {
                                SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) ((ata) this.i).b();
                                this.k = simpleOutputBuffer;
                                if (simpleOutputBuffer == null) {
                                    break;
                                }
                                int i2 = simpleOutputBuffer.skippedOutputBufferCount;
                                if (i2 > 0) {
                                    this.e.f += i2;
                                    this.b.f();
                                }
                            }
                            if (!this.k.isEndOfStream()) {
                                if (this.p) {
                                    pmr b = e(this.i).b();
                                    b.A = this.g;
                                    b.B = this.h;
                                    this.b.v(b.a(), null);
                                    this.p = false;
                                }
                                awh awhVar = this.b;
                                SimpleOutputBuffer simpleOutputBuffer2 = this.k;
                                if (!awhVar.r(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs, 1)) {
                                    break;
                                }
                                this.e.e++;
                                this.k.release();
                                this.k = null;
                            } else if (this.n == 2) {
                                w();
                                t();
                                this.p = true;
                            } else {
                                this.k.release();
                                this.k = null;
                                try {
                                    v();
                                } catch (awg e2) {
                                    throw ak(e2, e2.c, e2.b, 5002);
                                }
                            }
                        }
                        while (true) {
                            ast astVar = this.i;
                            if (astVar == null || this.n == 2 || this.v) {
                                break;
                            }
                            asw aswVar = this.j;
                            if (aswVar == null) {
                                aswVar = ((ata) astVar).a();
                                this.j = aswVar;
                                if (aswVar == null) {
                                    break;
                                }
                            }
                            if (this.n != 1) {
                                pmt al2 = al();
                                int af2 = af(al2, this.j, 0);
                                if (af2 == -5) {
                                    u(al2);
                                } else {
                                    if (af2 != -4) {
                                        break;
                                    }
                                    if (!this.j.isEndOfStream()) {
                                        this.j.c();
                                        asw aswVar2 = this.j;
                                        if (this.u && !aswVar2.isDecodeOnly()) {
                                            if (Math.abs(aswVar2.d - this.q) > 500000) {
                                                this.q = aswVar2.d;
                                            }
                                            this.u = false;
                                        }
                                        ((ata) this.i).e(this.j);
                                        this.o = true;
                                        this.e.c++;
                                        this.j = null;
                                    } else {
                                        this.v = true;
                                        ((ata) this.i).e(this.j);
                                        this.j = null;
                                        break;
                                    }
                                }
                            } else {
                                aswVar.setFlags(4);
                                ((ata) this.i).e(this.j);
                                this.j = null;
                                this.n = 2;
                                break;
                            }
                        }
                        this.e.a();
                        return;
                    } catch (awg e3) {
                        throw ak(e3, e3.c, e3.b, 5002);
                    }
                } catch (asu e4) {
                    prh.j("DecoderAudioRenderer", "Audio codec error", e4);
                    this.a.a(e4);
                    throw aj(e4, this.f, 4003);
                } catch (awc e5) {
                    throw aj(e5, e5.a, 5001);
                } catch (awd e6) {
                    throw ak(e6, e6.c, e6.b, 5001);
                }
            }
            return;
        }
        try {
            this.b.i();
        } catch (awg e7) {
            throw ak(e7, e7.c, e7.b, 5002);
        }
    }

    @Override // defpackage.psx
    public final void q(pnu pnuVar) {
        this.b.o(pnuVar);
    }

    @Override // defpackage.poe
    public final boolean r() {
        return this.w && this.b.t();
    }

    @Override // defpackage.poe
    public boolean s() {
        if (!this.b.s()) {
            if (this.f == null) {
                return false;
            }
            if (!az() && this.k == null) {
                return false;
            }
        }
        return true;
    }

    public awo(Handler handler, awb awbVar, awh awhVar) {
        super(1);
        this.a = new awa(handler, awbVar);
        this.b = awhVar;
        awhVar.n(new awn(this));
        this.d = asw.a();
        this.n = 0;
        this.p = true;
    }

    public awo(Handler handler, awb awbVar, avr... avrVarArr) {
        this(handler, awbVar, new awx(null, avrVarArr));
    }

    @Override // defpackage.ple, defpackage.poc
    public void rk(int i, Object obj) {
        if (i == 2) {
            this.b.q(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.b.k((asd) obj);
        } else if (i == 6) {
            this.b.m((ase) obj);
        } else if (i == 9) {
            this.b.p(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                return;
            }
            this.b.l(((Integer) obj).intValue());
        }
    }
}

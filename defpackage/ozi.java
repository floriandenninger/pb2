package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ozi {
    private long A;
    private float B;
    private byte[] C;
    private int D;
    private int E;
    private ByteBuffer F;
    private boolean G;
    public final ConditionVariable a;
    public int b;
    public int c;
    public long d;
    private final long[] e;
    private final ozd f;
    private AudioTrack g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private boolean r;
    private long s;
    private Method t;
    private long u;
    private long v;
    private int w;
    private int x;
    private long y;
    private long z;

    public ozi() {
        this(null);
    }

    private final long o(long j) {
        return (j * this.h) / 1000000;
    }

    private final long p(long j) {
        return (j * 1000000) / this.h;
    }

    private final long q() {
        return this.l ? this.v : r(this.u);
    }

    private final long r(long j) {
        return j / this.m;
    }

    private final void s() {
        this.p = 0L;
        this.o = 0;
        this.n = 0;
        this.q = 0L;
        this.r = false;
        this.s = 0L;
    }

    private final void t() {
        if (n()) {
            if (pgz.a >= 21) {
                this.g.setVolume(this.B);
                return;
            }
            AudioTrack audioTrack = this.g;
            float f = this.B;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final boolean u() {
        int i;
        return pgz.a < 23 && ((i = this.k) == 5 || i == 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.nio.ByteBuffer r18, int r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozi.a(java.nio.ByteBuffer, int, int, long):int");
    }

    public final int b() {
        return c(0);
    }

    public final int c(int i) {
        this.a.block();
        if (i == 0) {
            this.g = new AudioTrack(this.b, this.h, this.i, this.k, this.c, 1);
        } else {
            this.g = new AudioTrack(this.b, this.h, this.i, this.k, this.c, 1, i);
        }
        int state = this.g.getState();
        if (state == 1) {
            int audioSessionId = this.g.getAudioSessionId();
            this.f.f(this.g, u());
            t();
            return audioSessionId;
        }
        try {
            this.g.release();
        } catch (Exception unused) {
        } finally {
            this.g = null;
        }
        throw new ozg(state, this.h, this.i, this.c);
    }

    public final long d(boolean z) {
        if (!n() || this.x == 0) {
            return Long.MIN_VALUE;
        }
        if (this.g.getPlayState() == 3) {
            long c = this.f.c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.q >= 30000) {
                    long[] jArr = this.e;
                    int i = this.n;
                    jArr[i] = c - nanoTime;
                    this.n = (i + 1) % 10;
                    int i2 = this.o;
                    if (i2 < 10) {
                        this.o = i2 + 1;
                    }
                    this.q = nanoTime;
                    this.p = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.o;
                        if (i3 >= i4) {
                            break;
                        }
                        this.p += this.e[i3] / i4;
                        i3++;
                    }
                }
                if (!u() && nanoTime - this.s >= 500000) {
                    boolean h = this.f.h();
                    this.r = h;
                    if (h) {
                        long e = this.f.e() / 1000;
                        long d = this.f.d();
                        if (e < this.z) {
                            this.r = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(d);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c);
                            Log.w("AudioTrack", sb.toString());
                            this.r = false;
                        } else if (Math.abs(p(d) - c) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(d);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            Log.w("AudioTrack", sb2.toString());
                            this.r = false;
                        }
                    }
                    if (this.t != null && !this.l) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.g, null)).intValue() * 1000) - this.d;
                            this.A = intValue;
                            long max = Math.max(intValue, 0L);
                            this.A = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.A = 0L;
                            }
                        } catch (Exception unused) {
                            this.t = null;
                        }
                    }
                    this.s = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.r) {
            return p(this.f.d() + o(((float) (nanoTime2 - (this.f.e() / 1000))) * this.f.a())) + this.y;
        }
        long c2 = (this.o == 0 ? this.f.c() : nanoTime2 + this.p) + this.y;
        return z ? c2 : c2 - this.A;
    }

    public final void f() {
        if (this.x == 1) {
            this.x = 2;
        }
    }

    public final void g() {
        if (n()) {
            ozd ozdVar = this.f;
            long q = q();
            ozdVar.d = ozdVar.b();
            ozdVar.b = SystemClock.elapsedRealtime() * 1000;
            ozdVar.e = q;
            ozdVar.a.stop();
        }
    }

    public final void h() {
        if (n()) {
            s();
            ozd ozdVar = this.f;
            if (ozdVar.b != -1) {
                return;
            }
            ozdVar.a.pause();
        }
    }

    public final void i() {
        if (n()) {
            this.z = System.nanoTime() / 1000;
            this.g.play();
        }
    }

    public final void j() {
        if (n()) {
            this.u = 0L;
            this.v = 0L;
            this.w = 0;
            this.E = 0;
            this.x = 0;
            this.A = 0L;
            s();
            if (this.g.getPlayState() == 3) {
                this.g.pause();
            }
            AudioTrack audioTrack = this.g;
            this.g = null;
            this.f.f(null, false);
            this.a.close();
            new ozc(this, audioTrack).start();
        }
    }

    public final void k(PlaybackParams playbackParams) {
        this.f.g(playbackParams);
    }

    public final void l(float f) {
        if (this.B != f) {
            this.B = f;
            t();
        }
    }

    public final boolean m() {
        if (n()) {
            if (q() > this.f.b()) {
                return true;
            }
            if (u() && this.g.getPlayState() == 2 && this.g.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.g != null;
    }

    public ozi(byte[] bArr) {
        this.a = new ConditionVariable(true);
        if (pgz.a >= 18) {
            try {
                this.t = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (pgz.a >= 23) {
            this.f = new ozf();
        } else {
            this.f = pgz.a >= 19 ? new oze() : new ozd();
        }
        this.e = new long[10];
        this.b = 3;
        this.B = 1.0f;
        this.x = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.String r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozi.e(java.lang.String, int, int, int, int):void");
    }
}

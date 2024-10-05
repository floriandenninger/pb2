package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxn implements Handler.Callback {
    public final Handler a;
    public final HandlerThread b;
    public final AtomicInteger c;
    public long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    private final Handler i;
    private final oyt j;
    private final List k;
    private final MediaFormat[][] l;
    private final int[] m;
    private final long n;
    private final long o;
    private oyx[] p;
    private oyx q;
    private oxp r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private long x;
    public int d = 0;
    private int w = 0;

    public oxn(Handler handler, boolean z, int[] iArr, int i, int i2) {
        this.i = handler;
        this.t = z;
        this.n = i * 1000;
        this.o = i2 * 1000;
        int length = iArr.length;
        this.m = Arrays.copyOf(iArr, length);
        this.v = 1;
        this.f = -1L;
        this.h = -1L;
        this.j = new oyt();
        this.c = new AtomicInteger();
        this.k = new ArrayList(length);
        this.l = new MediaFormat[length];
        pgy pgyVar = new pgy();
        this.b = pgyVar;
        pgyVar.start();
        this.a = new Handler(pgyVar.getLooper(), this);
    }

    private final void c(oyx oyxVar, int i, boolean z) {
        long j = this.g;
        opn.k(oyxVar.h == 1);
        oyxVar.h = 2;
        oyxVar.pG(i, j, z);
        this.k.add(oyxVar);
        oxp m = oyxVar.m();
        if (m != null) {
            opn.k(this.r == null);
            this.r = m;
            this.q = oyxVar;
        }
    }

    private final void d(oyx oyxVar) {
        n(oyxVar);
        if (oyxVar.h == 2) {
            opn.k(true);
            oyxVar.h = 1;
            oyxVar.q();
            if (oyxVar == this.q) {
                this.r = null;
                this.q = null;
            }
        }
    }

    private final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        boolean z = true;
        while (true) {
            oyx[] oyxVarArr = this.p;
            if (i >= oyxVarArr.length) {
                break;
            }
            oyx oyxVar = oyxVarArr[i];
            if (oyxVar.h == 0) {
                opn.k(oyxVar.h == 0);
                boolean j = oyxVar.j();
                oyxVar.h = j ? 1 : 0;
                if (!j) {
                    oyxVar.f();
                    z = false;
                }
            }
            i++;
        }
        if (z) {
            long j2 = 0;
            int i2 = 0;
            boolean z2 = true;
            boolean z3 = true;
            while (true) {
                oyx[] oyxVarArr2 = this.p;
                if (i2 >= oyxVarArr2.length) {
                    break;
                }
                oyx oyxVar2 = oyxVarArr2[i2];
                int pF = oyxVar2.pF();
                MediaFormat[] mediaFormatArr = new MediaFormat[pF];
                for (int i3 = 0; i3 < pF; i3++) {
                    mediaFormatArr[i3] = oyxVar2.d(i3);
                }
                this.l[i2] = mediaFormatArr;
                if (pF > 0) {
                    if (j2 != -1) {
                        long c = oyxVar2.c();
                        if (c == -1) {
                            j2 = -1;
                        } else if (c != -2) {
                            j2 = Math.max(j2, c);
                        }
                    }
                    int i4 = this.m[i2];
                    if (i4 >= 0 && i4 < pF) {
                        c(oyxVar2, i4, false);
                        z2 = z2 && oyxVar2.h();
                        z3 = z3 && m(oyxVar2);
                    }
                }
                i2++;
            }
            this.f = j2;
            int i5 = 5;
            if (!z2 || (j2 != -1 && j2 > this.g)) {
                i5 = true != z3 ? 3 : 4;
                this.v = i5;
            } else {
                this.v = 5;
            }
            this.i.obtainMessage(1, i5, 0, this.l).sendToTarget();
            if (this.t && this.v == 4) {
                i();
            }
            this.a.sendEmptyMessage(7);
            return;
        }
        g(2, elapsedRealtime, 10L);
    }

    private final void f() {
        this.a.removeMessages(7);
        this.a.removeMessages(2);
        this.u = false;
        this.j.c();
        if (this.p == null) {
            return;
        }
        int i = 0;
        while (true) {
            oyx[] oyxVarArr = this.p;
            if (i < oyxVarArr.length) {
                oyx oyxVar = oyxVarArr[i];
                try {
                    d(oyxVar);
                } catch (RuntimeException e) {
                    Log.e("ExoPlayerImplInternal", "Stop failed.", e);
                } catch (oxh e2) {
                    Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
                }
                try {
                    int i2 = oyxVar.h;
                    opn.k((i2 == 2 || i2 == 3 || i2 == -1) ? false : true);
                    oyxVar.h = -1;
                    oyxVar.L();
                } catch (RuntimeException e3) {
                    Log.e("ExoPlayerImplInternal", "Release failed.", e3);
                } catch (oxh e4) {
                    Log.e("ExoPlayerImplInternal", "Release failed.", e4);
                }
                i++;
            } else {
                this.p = null;
                this.r = null;
                this.q = null;
                this.k.clear();
                return;
            }
        }
    }

    private final void g(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.a.sendEmptyMessage(i);
        } else {
            this.a.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }

    private final void h(int i) {
        if (this.v != i) {
            this.v = i;
            this.i.obtainMessage(2, i, 0).sendToTarget();
        }
    }

    private final void i() {
        this.u = false;
        oyt oytVar = this.j;
        if (!oytVar.a) {
            oytVar.a = true;
            oytVar.c = oyt.d(oytVar.b);
        }
        for (int i = 0; i < this.k.size(); i++) {
            ((oyx) this.k.get(i)).M();
        }
    }

    private final void j() {
        f();
        h(1);
    }

    private final void k() {
        this.j.c();
        for (int i = 0; i < this.k.size(); i++) {
            n((oyx) this.k.get(i));
        }
    }

    private final void l() {
        if (this.r == null || !this.k.contains(this.q) || this.q.h()) {
            this.g = this.j.a();
        } else {
            this.g = this.r.a();
            this.j.b(this.g);
        }
        this.x = SystemClock.elapsedRealtime() * 1000;
    }

    private final boolean m(oyx oyxVar) {
        if (oyxVar.h()) {
            return true;
        }
        if (!oyxVar.i()) {
            return false;
        }
        if (this.v == 4) {
            return true;
        }
        long c = oyxVar.c();
        long b = oyxVar.b();
        long j = this.u ? this.o : this.n;
        if (j <= 0 || b == -1 || b == -3 || b >= this.g + j) {
            return true;
        }
        return (c == -1 || c == -2 || b < c) ? false : true;
    }

    private static final void n(oyx oyxVar) {
        if (oyxVar.h == 3) {
            opn.k(true);
            oyxVar.h = 2;
            oyxVar.w();
        }
    }

    public final synchronized void a(oxi oxiVar, int i, Object obj) {
        if (this.s) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Sent message(");
            sb.append(i);
            sb.append(") after release. Message ignored.");
            Log.w("ExoPlayerImplInternal", sb.toString());
            return;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        this.a.obtainMessage(9, i, 0, Pair.create(oxiVar, obj)).sendToTarget();
        while (this.w <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void b() {
        if (this.s) {
            return;
        }
        this.a.sendEmptyMessage(5);
        while (!this.s) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.b.quit();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d A[Catch: OutOfMemoryError | RuntimeException -> 0x028d, RuntimeException -> 0x028f, oxh -> 0x02ab, TryCatch #6 {oxh -> 0x02ab, blocks: (B:3:0x0006, B:4:0x000c, B:7:0x0010, B:14:0x002a, B:22:0x0037, B:24:0x0039, B:28:0x0043, B:32:0x0046, B:33:0x0047, B:37:0x0053, B:40:0x005b, B:44:0x0066, B:51:0x0076, B:56:0x0084, B:58:0x0088, B:59:0x0093, B:61:0x009d, B:63:0x00a1, B:69:0x00ad, B:71:0x00b2, B:72:0x00b5, B:76:0x00bb, B:78:0x00c9, B:79:0x00d1, B:80:0x00d7, B:82:0x00df, B:84:0x00f2, B:87:0x00fb, B:89:0x0101, B:97:0x0137, B:98:0x0110, B:112:0x0133, B:118:0x013f, B:120:0x0145, B:122:0x014b, B:124:0x0153, B:125:0x017c, B:127:0x0186, B:129:0x018f, B:132:0x018a, B:134:0x019b, B:136:0x01a3, B:137:0x015b, B:140:0x0162, B:142:0x0169, B:145:0x0171, B:147:0x01af, B:152:0x01c0, B:153:0x01c2, B:164:0x0206, B:166:0x0209, B:168:0x020e, B:169:0x0213, B:170:0x0214, B:182:0x0225, B:188:0x0229, B:190:0x022e, B:197:0x0259, B:206:0x0266, B:207:0x0270, B:209:0x0271, B:211:0x0276), top: B:2:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxn.handleMessage(android.os.Message):boolean");
    }
}

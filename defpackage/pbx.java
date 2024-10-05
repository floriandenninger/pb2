package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pbx implements pcn {
    public final pck a;
    public volatile MediaFormat e;
    public final oyp b = new oyp(0);
    public boolean c = true;
    private long f = Long.MIN_VALUE;
    public volatile long d = Long.MIN_VALUE;

    public pbx(pft pftVar) {
        this.a = new pck(pftVar);
    }

    private final boolean i() {
        boolean e = this.a.e(this.b);
        if (this.c) {
            while (e && !this.b.e()) {
                this.a.d();
                e = this.a.e(this.b);
            }
        }
        if (!e) {
            return false;
        }
        long j = this.f;
        return j == Long.MIN_VALUE || this.b.e < j;
    }

    public final int a() {
        return this.a.b.e;
    }

    public final void b() {
        pck pckVar = this.a;
        pci pciVar = pckVar.b;
        pciVar.e = 0;
        pciVar.f = 0;
        pciVar.g = 0;
        pciVar.d = 0;
        pft pftVar = pckVar.i;
        LinkedBlockingDeque linkedBlockingDeque = pckVar.c;
        pftVar.f((anrc[]) linkedBlockingDeque.toArray(new anrc[linkedBlockingDeque.size()]));
        pckVar.c.clear();
        pckVar.f = 0L;
        pckVar.g = 0L;
        pckVar.j = null;
        pckVar.h = pckVar.a;
        this.c = true;
        this.f = Long.MIN_VALUE;
        this.d = Long.MIN_VALUE;
    }

    public final boolean c(oyp oypVar) {
        int i;
        if (!i()) {
            return false;
        }
        pck pckVar = this.a;
        if (pckVar.b.e(oypVar, pckVar.d)) {
            if (oypVar.d()) {
                pcj pcjVar = pckVar.d;
                long j = pcjVar.a;
                pckVar.c(j, pckVar.e.a, 1);
                long j2 = j + 1;
                byte b = pckVar.e.a[0];
                int i2 = b & 128;
                int i3 = b & Byte.MAX_VALUE;
                oxe oxeVar = oypVar.a;
                if (oxeVar.a == null) {
                    oxeVar.a = new byte[16];
                }
                pckVar.c(j2, oxeVar.a, i3);
                long j3 = j2 + i3;
                if (i2 != 0) {
                    pckVar.c(j3, pckVar.e.a, 2);
                    j3 += 2;
                    pckVar.e.z(0);
                    i = pckVar.e.k();
                } else {
                    i = 1;
                }
                oxe oxeVar2 = oypVar.a;
                int[] iArr = oxeVar2.d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = oxeVar2.e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (i2 != 0) {
                    int i4 = i * 6;
                    pgx pgxVar = pckVar.e;
                    if (pgxVar.c < i4) {
                        pgxVar.x(new byte[i4], i4);
                    }
                    pckVar.c(j3, pckVar.e.a, i4);
                    j3 += i4;
                    pckVar.e.z(0);
                    for (int i5 = 0; i5 < i; i5++) {
                        iArr[i5] = pckVar.e.k();
                        iArr2[i5] = pckVar.e.j();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = oypVar.c - ((int) (j3 - pcjVar.a));
                }
                oxe oxeVar3 = oypVar.a;
                byte[] bArr = pcjVar.b;
                oxeVar3.f = i;
                oxeVar3.d = iArr;
                oxeVar3.e = iArr2;
                oxeVar3.b = bArr;
                oxeVar3.c = 1;
                if (pgz.a >= 16) {
                    oxeVar3.g.set(oxeVar3.f, oxeVar3.d, oxeVar3.e, oxeVar3.b, oxeVar3.a, oxeVar3.c);
                }
                long j4 = pcjVar.a;
                int i6 = (int) (j3 - j4);
                pcjVar.a = j4 + i6;
                oypVar.c -= i6;
            }
            oypVar.b(oypVar.c);
            long j5 = pckVar.d.a;
            ByteBuffer byteBuffer = oypVar.b;
            int i7 = oypVar.c;
            while (i7 > 0) {
                pckVar.b(j5);
                int i8 = (int) (j5 - pckVar.f);
                int min = Math.min(i7, pckVar.a - i8);
                byteBuffer.put(((anrc) pckVar.c.peek()).a, i8, min);
                j5 += min;
                i7 -= min;
            }
            pckVar.b(pckVar.b.b());
        }
        this.c = false;
        long j6 = oypVar.e;
        return true;
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        this.e = mediaFormat;
    }

    public final boolean e() {
        return !i();
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
        pck pckVar = this.a;
        while (i > 0) {
            int a = pckVar.a(i);
            pgxVar.u(pckVar.j.a, pckVar.h, a);
            pckVar.h += a;
            pckVar.g += a;
            i -= a;
        }
    }

    @Override // defpackage.pcn
    public void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.d = Math.max(this.d, j);
        pck pckVar = this.a;
        pckVar.b.d(j, i, (pckVar.g - i2) - i3, i2, bArr);
    }

    public final boolean h(long j) {
        pck pckVar = this.a;
        long c = pckVar.b.c(j);
        if (c == -1) {
            return false;
        }
        pckVar.b(c);
        return true;
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        pck pckVar = this.a;
        int a = pbwVar.a(pckVar.j.a, pckVar.h, pckVar.a(i));
        if (a == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        pckVar.h += a;
        pckVar.g += a;
        return a;
    }
}

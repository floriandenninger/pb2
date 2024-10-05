package defpackage;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlj extends AbstractList {
    deg a;
    dfm b;
    SoftReference[] c;
    int[] d;
    long[] e;
    long[] f;
    long[][] g;
    dez h;
    int i = 0;

    public axlj(long j, deg degVar) {
        int i;
        dfc dfcVar = null;
        this.b = null;
        this.c = null;
        int i2 = 0;
        this.a = degVar;
        for (dfm dfmVar : ((det) degVar.j(det.class).get(0)).j(dfm.class)) {
            if (dfmVar.n().a == j) {
                this.b = dfmVar;
            }
        }
        dfm dfmVar2 = this.b;
        if (dfmVar2 == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("This MP4 does not contain track ");
            sb.append(j);
            throw new RuntimeException(sb.toString());
        }
        if (dfmVar2.m() == null || this.b.m().l() == null) {
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("MP4 track ");
            sb2.append(j);
            sb2.append(" is missing SampleTableBox or ChunkOffsetBox");
            throw new IOException(sb2.toString());
        }
        long[] k = this.b.m().l().k();
        this.e = k;
        int length = k.length;
        this.f = new long[length];
        this.c = (SoftReference[]) Array.newInstance((Class<?>) SoftReference.class, length);
        this.g = new long[this.e.length];
        this.h = this.b.m().p();
        dfa m = this.b.m();
        dfc dfcVar2 = m.a;
        if (dfcVar2 == null) {
            Iterator it = m.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                deb debVar = (deb) it.next();
                if (debVar instanceof dfc) {
                    m.a = (dfc) debVar;
                    dfcVar = m.a;
                    break;
                }
            }
        } else {
            dfcVar = dfcVar2;
        }
        List list = dfcVar.a;
        dfb[] dfbVarArr = (dfb[]) list.toArray(new dfb[list.size()]);
        dfb dfbVar = dfbVarArr[0];
        long j2 = dfbVar.a;
        int g = awxt.g(dfbVar.b);
        int size = size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        do {
            i3++;
            if (i3 == j2) {
                if (dfbVarArr.length > i5) {
                    dfb dfbVar2 = dfbVarArr[i5];
                    int g2 = awxt.g(dfbVar2.b);
                    i5++;
                    j2 = dfbVar2.a;
                    i4 = g;
                    g = g2;
                } else {
                    i4 = g;
                    g = -1;
                    j2 = Long.MAX_VALUE;
                }
            }
            this.g[i3 - 1] = new long[i4];
            i6 += i4;
        } while (i6 <= size);
        this.d = new int[i3 + 1];
        dfb dfbVar3 = dfbVarArr[0];
        long j3 = dfbVar3.a;
        int g3 = awxt.g(dfbVar3.b);
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            i = i7 + 1;
            this.d[i7] = i8;
            if (i == j3) {
                if (dfbVarArr.length > i10) {
                    dfb dfbVar4 = dfbVarArr[i10];
                    i9 = g3;
                    i10++;
                    g3 = awxt.g(dfbVar4.b);
                    j3 = dfbVar4.a;
                } else {
                    i9 = g3;
                    g3 = -1;
                    j3 = Long.MAX_VALUE;
                }
            }
            i8 += i9;
            if (i8 > size) {
                break;
            } else {
                i7 = i;
            }
        }
        this.d[i] = Integer.MAX_VALUE;
        long j4 = 0;
        for (int i11 = 1; i11 <= this.h.k(); i11++) {
            if (i11 == this.d[i2]) {
                i2++;
                j4 = 0;
            }
            long[] jArr = this.f;
            int i12 = i2 - 1;
            int i13 = i11 - 1;
            jArr[i12] = jArr[i12] + this.h.l(i13);
            this.g[i12][i11 - this.d[i12]] = j4;
            j4 += this.h.l(i13);
        }
    }

    final synchronized int a(int i) {
        int i2 = i + 1;
        int[] iArr = this.d;
        int i3 = this.i;
        int i4 = iArr[i3];
        if (i2 >= i4 && i2 < iArr[i3 + 1]) {
            return i3;
        }
        if (i2 < i4) {
            this.i = 0;
            while (true) {
                int[] iArr2 = this.d;
                int i5 = this.i;
                int i6 = i5 + 1;
                if (iArr2[i6] > i2) {
                    return i5;
                }
                this.i = i6;
            }
        } else {
            this.i = i3 + 1;
            while (true) {
                int[] iArr3 = this.d;
                int i7 = this.i;
                int i8 = i7 + 1;
                if (iArr3[i8] > i2) {
                    return i7;
                }
                this.i = i8;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        long j;
        ByteBuffer byteBuffer;
        int length;
        long j2;
        if (i >= this.h.k()) {
            throw new IndexOutOfBoundsException();
        }
        int a = a(i);
        int i2 = this.d[a] - 1;
        long j3 = a;
        long j4 = this.e[awxt.g(j3)];
        long[] jArr = this.g[awxt.g(j3)];
        long j5 = jArr[i - i2];
        ByteBuffer[] byteBufferArr = this.c[awxt.g(j3)] != null ? (ByteBuffer[]) this.c[awxt.g(j3)].get() : null;
        if (byteBufferArr == null) {
            ArrayList arrayList = new ArrayList();
            long j6 = 0;
            int i3 = 0;
            while (true) {
                try {
                    length = jArr.length;
                    if (i3 >= length) {
                        break;
                    }
                    if ((jArr[i3] + this.h.l(i3 + i2)) - j6 > 268435456) {
                        j2 = j5;
                        arrayList.add(this.a.h(j4 + j6, jArr[i3] - j6));
                        j6 = jArr[i3];
                    } else {
                        j2 = j5;
                    }
                    i3++;
                    j5 = j2;
                } catch (IOException e) {
                    throw new IndexOutOfBoundsException(e.getMessage());
                }
            }
            j = j5;
            arrayList.add(this.a.h(j4 + j6, (-j6) + jArr[length - 1] + this.h.l((i2 + length) - 1)));
            byteBufferArr = (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
            this.c[awxt.g(j3)] = new SoftReference(byteBufferArr);
        } else {
            j = j5;
        }
        int length2 = byteBufferArr.length;
        long j7 = j;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                byteBuffer = null;
                break;
            }
            ByteBuffer byteBuffer2 = byteBufferArr[i4];
            if (j7 < byteBuffer2.limit()) {
                byteBuffer = byteBuffer2;
                break;
            }
            j7 -= byteBuffer2.limit();
            i4++;
        }
        return new axli(this.h.l(i), byteBuffer, j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return awxt.g(this.b.m().p().k());
    }
}

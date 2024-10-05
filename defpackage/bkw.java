package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkw implements bih, biz {
    public bik a;
    private final pth b;
    private final pth c;
    private final pth d;
    private final pth e;
    private final ArrayDeque f;
    private final List g;
    private int h;
    private int i;
    private long j;
    private int k;
    private pth l;
    private int m;
    private int n;
    private int o;
    private int p;
    private bkv[] q;
    private long[][] r;
    private int s;
    private long t;
    private int u;

    public bkw() {
        this(null);
    }

    private static int i(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int j(bla blaVar, long j) {
        int a = blaVar.a(j);
        return a == -1 ? blaVar.b(j) : a;
    }

    private static long k(bla blaVar, long j, long j2) {
        int j3 = j(blaVar, j);
        return j3 == -1 ? j2 : Math.min(blaVar.b[j3], j2);
    }

    private final void l() {
        this.h = 0;
        this.k = 0;
    }

    private final void m(long j) {
        bkw bkwVar;
        Metadata metadata;
        Metadata metadata2;
        long j2;
        List list;
        int i;
        bkw bkwVar2;
        Metadata metadata3;
        char c;
        int i2;
        bkw bkwVar3 = this;
        while (!bkwVar3.f.isEmpty() && ((bki) bkwVar3.f.peek()).a == j) {
            bki bkiVar = (bki) bkwVar3.f.pop();
            if (bkiVar.d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = bkwVar3.u == 1;
                bir birVar = new bir();
                bkj b = bkiVar.b(1969517665);
                if (b != null) {
                    Pair a = bkp.a(b);
                    Metadata metadata4 = (Metadata) a.first;
                    Metadata metadata5 = (Metadata) a.second;
                    if (metadata4 != null) {
                        birVar.b(metadata4);
                    }
                    metadata = metadata5;
                    metadata2 = metadata4;
                } else {
                    metadata = null;
                    metadata2 = null;
                }
                bki a2 = bkiVar.a(1835365473);
                Metadata b2 = a2 != null ? bkp.b(a2) : null;
                List d = bkp.d(bkiVar, birVar, -9223372036854775807L, null, z, ens.b);
                bik bikVar = bkwVar3.a;
                pse.c(bikVar);
                int size = d.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    bla blaVar = (bla) d.get(i4);
                    if (blaVar.a == 0) {
                        list = d;
                        i = size;
                        bkwVar2 = bkwVar3;
                    } else {
                        pjq pjqVar = blaVar.h;
                        ArrayList arrayList2 = arrayList;
                        long j5 = pjqVar.e;
                        if (j5 == j3) {
                            j5 = blaVar.g;
                        }
                        long max = Math.max(j4, j5);
                        list = d;
                        bkv bkvVar = new bkv(pjqVar, blaVar, bikVar.n(i4, pjqVar.b), null);
                        int i5 = blaVar.d;
                        pmr b3 = pjqVar.f.b();
                        b3.l = i5 + 30;
                        int i6 = pjqVar.b;
                        i = size;
                        if (i6 == 2) {
                            if (j5 > 0 && (i2 = blaVar.a) > 1) {
                                b3.r = i2 / (((float) j5) / 1000000.0f);
                            }
                            i6 = 2;
                        }
                        int i7 = bku.b;
                        if (i6 == 1 && birVar.a()) {
                            b3.A = birVar.a;
                            b3.B = birVar.b;
                        }
                        int i8 = pjqVar.b;
                        Metadata[] metadataArr = new Metadata[2];
                        metadataArr[0] = metadata;
                        bkwVar2 = this;
                        if (bkwVar2.g.isEmpty()) {
                            c = 1;
                            metadata3 = null;
                        } else {
                            metadata3 = new Metadata(bkwVar2.g);
                            c = 1;
                        }
                        metadataArr[c] = metadata3;
                        Metadata metadata6 = new Metadata(new Metadata.Entry[0]);
                        if (i8 == 1) {
                            if (metadata2 != null) {
                                metadata6 = metadata2;
                            }
                        } else if (i8 == 2) {
                            Metadata metadata7 = b2;
                            if (metadata7 != null) {
                                int i9 = 0;
                                while (i9 < metadata7.a()) {
                                    Metadata.Entry b4 = metadata7.b(i9);
                                    if (b4 instanceof MdtaMetadataEntry) {
                                        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) b4;
                                        b2 = metadata7;
                                        if ("com.android.capture.fps".equals(mdtaMetadataEntry.a)) {
                                            metadata6 = new Metadata(mdtaMetadataEntry);
                                            break;
                                        }
                                    } else {
                                        b2 = metadata7;
                                    }
                                    i9++;
                                    metadata7 = b2;
                                }
                            }
                            b2 = metadata7;
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            metadata6 = metadata6.d(metadataArr[i10]);
                        }
                        if (metadata6.a() > 0) {
                            b3.i = metadata6;
                        }
                        bkvVar.b.rp(b3.a());
                        if (pjqVar.b == 2 && i3 == -1) {
                            i3 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(bkvVar);
                        j4 = max;
                    }
                    i4++;
                    bkwVar3 = bkwVar2;
                    d = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                bkwVar = bkwVar3;
                bkwVar.s = i3;
                bkwVar.t = j4;
                bkv[] bkvVarArr = (bkv[]) arrayList.toArray(new bkv[0]);
                bkwVar.q = bkvVarArr;
                int length = bkvVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < bkvVarArr.length; i11++) {
                    jArr[i11] = new long[bkvVarArr[i11].a.a];
                    jArr2[i11] = bkvVarArr[i11].a.e[0];
                }
                int i12 = 0;
                while (i12 < bkvVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < bkvVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j7 = jArr2[i14];
                            if (j7 <= j6) {
                                i13 = i14;
                                j6 = j7;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    bla blaVar2 = bkvVarArr[i13].a;
                    j2 += blaVar2.c[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = blaVar2.e[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                bkwVar.r = jArr;
                bikVar.q();
                bikVar.w(bkwVar);
                bkwVar.f.clear();
                bkwVar.h = 2;
            } else {
                bkwVar = bkwVar3;
                if (!bkwVar.f.isEmpty()) {
                    ((bki) bkwVar.f.peek()).c(bkiVar);
                }
            }
            bkwVar3 = bkwVar;
        }
        if (bkwVar3.h != 2) {
            l();
        }
    }

    @Override // defpackage.biz
    public final long a() {
        return this.t;
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((bkv[]) pse.c(this.q)).length == 0) {
            bja bjaVar = bja.a;
            return new bix(bjaVar, bjaVar);
        }
        int i = this.s;
        if (i != -1) {
            bla blaVar = this.q[i].a;
            int j6 = j(blaVar, j);
            if (j6 == -1) {
                bja bjaVar2 = bja.a;
                return new bix(bjaVar2, bjaVar2);
            }
            long j7 = blaVar.e[j6];
            j2 = blaVar.b[j6];
            if (j7 >= j || j6 >= blaVar.a - 1 || (b = blaVar.b(j)) == -1 || b == j6) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = blaVar.e[b];
                j5 = blaVar.b[b];
            }
            j3 = j5;
            j = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            bkv[] bkvVarArr = this.q;
            if (i2 >= bkvVarArr.length) {
                break;
            }
            if (i2 != this.s) {
                bla blaVar2 = bkvVarArr[i2].a;
                long k = k(blaVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = k(blaVar2, j4, j3);
                }
                j2 = k;
            }
            i2++;
        }
        bja bjaVar3 = new bja(j, j2);
        if (j4 == -9223372036854775807L) {
            return new bix(bjaVar3, bjaVar3);
        }
        return new bix(bjaVar3, new bja(j4, j3));
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bih
    public final void d(bik bikVar) {
        this.a = bikVar;
    }

    @Override // defpackage.bih
    public final void e() {
    }

    @Override // defpackage.bih
    public final void f(long j, long j2) {
        this.f.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            l();
            return;
        }
        bkv[] bkvVarArr = this.q;
        if (bkvVarArr != null) {
            for (bkv bkvVar : bkvVarArr) {
                bla blaVar = bkvVar.a;
                int a = blaVar.a(j2);
                if (a == -1) {
                    a = blaVar.b(j2);
                }
                bkvVar.c = a;
            }
        }
    }

    @Override // defpackage.bih
    public final boolean g(bii biiVar) {
        return bky.a(biiVar, false);
    }

    public bkw(byte[] bArr) {
        this.h = 0;
        new ArrayList();
        this.g = new ArrayList();
        this.e = new pth(16);
        this.f = new ArrayDeque();
        this.b = new pth(ptb.a);
        this.c = new pth(4);
        this.d = new pth();
        this.m = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x034d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0089 A[SYNTHETIC] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.bii r33, defpackage.tfq r34) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkw.h(bii, tfq):int");
    }
}

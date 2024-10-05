package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeif implements aejc {
    private final aeis a;

    public aeif(aeis aeisVar) {
        this.a = aeisVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:6:0x0012, B:7:0x0020, B:73:0x0029, B:9:0x002c, B:11:0x003b, B:13:0x0043, B:15:0x004b, B:22:0x0098, B:26:0x00a0, B:29:0x00a7, B:33:0x00ca, B:35:0x00cc, B:19:0x005e, B:36:0x0064, B:38:0x0068, B:40:0x006e, B:44:0x0076, B:47:0x0079, B:53:0x0082, B:58:0x0088, B:60:0x008e, B:61:0x0095, B:64:0x0097, B:68:0x00cd), top: B:5:0x0012, inners: #0 }] */
    @Override // defpackage.aejc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(byte[] r21, int r22, int r23, java.lang.String r24, int r25, long r26, long r28, java.lang.String r30, long r31) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeif.a(byte[], int, int, java.lang.String, int, long, long, java.lang.String, long):int");
    }

    @Override // defpackage.aejc
    public final ovu b(String str) {
        return this.a.a.a(str);
    }

    @Override // defpackage.aejc
    public final aekg c() {
        return this.a.a.p;
    }

    @Override // defpackage.aejc
    public final String d(String str, int i) {
        afff afffVar;
        aeks aeksVar = this.a.a;
        if (aeksVar.r.get() || (afffVar = (afff) aeksVar.g.get(str)) == null) {
            return null;
        }
        if (afffVar.b.contains(Integer.valueOf(i)) || afffVar.b.isEmpty()) {
            return afffVar.a;
        }
        return null;
    }

    @Override // defpackage.aejc
    public final Set e(String str) {
        return this.a.a.b(str);
    }

    @Override // defpackage.aejc
    public final void f() {
        if (this.a.m()) {
            return;
        }
        aeis aeisVar = this.a;
        aypz aypzVar = aeisVar.k;
        if (aypzVar != null) {
            aypzVar.g(new CancellationException("Onesie request cancelled"));
        }
        aeisVar.n.Z();
        aeisVar.c();
    }

    @Override // defpackage.aejc
    public final void g() {
        if (this.a.m()) {
            return;
        }
        this.a.h();
    }

    @Override // defpackage.aejc
    public final void h(aekh aekhVar) {
        aeks aeksVar = this.a.a;
        amru s = amru.s(aeksVar.k, aeksVar.l);
        int i = ((amvj) s).c;
        for (int i2 = 0; i2 < i; i2++) {
            anaf.Y((anhy) s.get(i2), new aekj(aekhVar), aeksVar.p.h ? aeksVar.m : angq.a);
        }
    }

    @Override // defpackage.aejc
    public final boolean i() {
        return this.a.a.p();
    }

    @Override // defpackage.aejc
    public final boolean j() {
        aeis aeisVar = this.a;
        long j = aeisVar.i.get();
        return j == 0 || j > aeisVar.h.d();
    }

    @Override // defpackage.aejc
    public final int k() {
        return this.a.a.t;
    }

    @Override // defpackage.aejc
    public final boolean l(String str, String str2, long j) {
        ovu a;
        aeks aeksVar = this.a.a;
        if (aeksVar.r.get()) {
            return false;
        }
        int a2 = ozv.a(str2);
        String c = ozv.c(str2);
        long j2 = j / 1000;
        if (j > 0 && (a = aeksVar.a(str)) != null) {
            return j2 <= a.e && aeksVar.o(str, a2, c);
        }
        aelq aelqVar = (aelq) aeksVar.e.get(aekn.a(str, a2, c));
        if (aelqVar == null || !aelqVar.e.h()) {
            return j == 0 && aeksVar.o(str, a2, c);
        }
        aelp aelpVar = (aelp) aelqVar.e.c();
        return j2 >= aelpVar.a && j2 <= aelpVar.b;
    }
}

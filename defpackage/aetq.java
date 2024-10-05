package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetq extends beb implements poc {
    private final afcr d;
    private final afco e;
    private final aezh f;
    private final aelf g;
    private final aetp[] h;
    private final boolean i;
    private List j;
    private long k;
    private boolean l;
    private final long m;

    public aetq(afcr afcrVar, asi asiVar, aezh aezhVar, aelf aelfVar, afhs afhsVar, long j, int... iArr) {
        super(asiVar, iArr);
        this.j = amru.q();
        this.k = -9223372036854775807L;
        this.d = afcrVar;
        this.e = new afco();
        this.f = aezhVar;
        this.g = aelfVar;
        this.m = j;
        int[] iArr2 = this.c;
        aetp[] aetpVarArr = new aetp[iArr2.length];
        for (int i = 0; i < iArr2.length; i++) {
            if (asiVar.a(iArr2[i]) != null) {
                aetpVarArr[i] = new aetp(asiVar.a(iArr2[i]));
            }
        }
        Arrays.sort(aetpVarArr, new uo(20));
        this.h = aetpVarArr;
        this.i = afhsVar.Q();
    }

    private static long k(bdu bduVar) {
        if (bduVar instanceof aewf) {
            return ((aewf) bduVar).g();
        }
        return bduVar.l;
    }

    private static long t(bdu bduVar) {
        if (bduVar instanceof aewf) {
            return ((aewf) bduVar).j();
        }
        return bduVar.k;
    }

    private static pms u(afcp afcpVar) {
        if (!(afcpVar instanceof aetp)) {
            return null;
        }
        aetp aetpVar = (aetp) afcpVar;
        return aetpVar.b != null ? aetpVar.b : aetpVar.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x005d, code lost:
    
        if (k((defpackage.bdu) r20.get(r20.size() - 1)) != ((defpackage.afcq) r15.j.get(r4.size() - 1)).c) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[EDGE_INSN: B:29:0x00d0->B:30:0x00d0 BREAK  A[LOOP:0: B:21:0x00a1->B:27:0x00ba], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(long r16, long r18, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetq.v(long, long, java.util.List):void");
    }

    @Override // defpackage.beb, defpackage.bel
    public final int g(long j, List list) {
        long j2 = 0;
        if (!list.isEmpty()) {
            j2 = Math.max(0L, k((bdu) list.get(list.size() - 1)) - Math.max(j, t((bdu) list.get(0))));
        }
        v(j, j2, list);
        return this.e.a;
    }

    @Override // defpackage.bel
    public final int h() {
        pms u = u(this.e.c);
        if (u != null) {
            return c(u);
        }
        return 0;
    }

    @Override // defpackage.bel
    public final int i() {
        return this.e.b;
    }

    @Override // defpackage.bel
    public final Object j() {
        aezh aezhVar = this.f;
        aenk aenkVar = this.e.d;
        if (aenkVar == null) {
            aenkVar = aenk.a;
        }
        return aezhVar.a(aenkVar);
    }

    @Override // defpackage.bel
    public final void o(long j, long j2, long j3, List list, bdw[] bdwVarArr) {
        v(j, j2, list);
    }

    @Override // defpackage.poc
    public final void rk(int i, Object obj) {
        if (i == 10004) {
            this.d.c();
            return;
        }
        if (obj == null) {
            return;
        }
        if (i == 10001) {
            this.d.g((afkm) obj);
        } else if (i == 10002) {
            this.d.f((aeex) obj);
        } else if (i == 10003) {
            this.d.d(((Float) obj).floatValue());
        }
    }
}

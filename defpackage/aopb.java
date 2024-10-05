package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopb implements aopq {
    private final aooy a;
    private final boolean b;
    private final amkq c;

    private aopb(amkq amkqVar, aooy aooyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = amkqVar;
        this.b = aooyVar instanceof aonh;
        this.a = aooyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopb c(amkq amkqVar, aocz aoczVar, aooy aooyVar) {
        return new aopb(amkqVar, aooyVar, null, null, null, null);
    }

    @Override // defpackage.aopq
    public final int a(Object obj) {
        aoqc cC = amkq.cC(obj);
        int i = cC.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < cC.b; i2++) {
                int i3 = cC.c[i2];
                aomf aomfVar = (aomf) cC.d[i2];
                int ac = aomp.ac(1);
                i += ac + ac + aomp.ad(2, aoqp.a(i3)) + aomp.I(3, aomfVar);
            }
            cC.e = i;
        }
        if (!this.b) {
            return i;
        }
        aomz n = aocz.n(obj);
        int i4 = 0;
        for (int i5 = 0; i5 < n.b.a(); i5++) {
            i4 += n.c(n.b.f(i5));
        }
        Iterator it = n.b.c().iterator();
        while (it.hasNext()) {
            i4 += n.c((Map.Entry) it.next());
        }
        return i + i4;
    }

    @Override // defpackage.aopq
    public final int b(Object obj) {
        int hashCode = amkq.cC(obj).hashCode();
        return this.b ? (hashCode * 53) + aocz.n(obj).hashCode() : hashCode;
    }

    @Override // defpackage.aopq
    public final Object e() {
        return this.a.newBuilderForType().buildPartial();
    }

    @Override // defpackage.aopq
    public final void f(Object obj) {
        amkq.cF(obj);
        aocz.r(obj);
    }

    @Override // defpackage.aopq
    public final void g(Object obj, Object obj2) {
        aopr.V(obj, obj2);
        if (this.b) {
            aopr.T(obj, obj2);
        }
    }

    @Override // defpackage.aopq
    public final void h(Object obj, aopl aoplVar, aomw aomwVar) {
        boolean U;
        amkq amkqVar = this.c;
        Object cE = amkq.cE(obj);
        aomz o = aocz.o(obj);
        while (aoplVar.c() != Integer.MAX_VALUE) {
            try {
                int d = aoplVar.d();
                if (d != aoqp.a) {
                    if (aoqp.b(d) == 2) {
                        aonk d2 = aomwVar.d(this.a, aoqp.a(d));
                        if (d2 != null) {
                            aocz.p(aoplVar, d2, aomwVar, o);
                        } else {
                            U = amkqVar.cz(cE, aoplVar);
                        }
                    } else {
                        U = aoplVar.U();
                    }
                    if (!U) {
                        break;
                    }
                } else {
                    int i = 0;
                    aonk aonkVar = null;
                    aomf aomfVar = null;
                    while (aoplVar.c() != Integer.MAX_VALUE) {
                        int d3 = aoplVar.d();
                        if (d3 == aoqp.c) {
                            i = aoplVar.j();
                            aonkVar = aomwVar.d(this.a, i);
                        } else if (d3 == aoqp.d) {
                            if (aonkVar != null) {
                                aocz.p(aoplVar, aonkVar, aomwVar, o);
                            } else {
                                aomfVar = aoplVar.q();
                            }
                        } else if (!aoplVar.U()) {
                            break;
                        }
                    }
                    if (aoplVar.d() != aoqp.b) {
                        throw aoob.b();
                    }
                    if (aomfVar == null) {
                        continue;
                    } else if (aonkVar != null) {
                        aooy buildPartial = aonkVar.c.newBuilderForType().buildPartial();
                        ByteBuffer wrap = ByteBuffer.wrap(aomfVar.I());
                        if (wrap.hasArray()) {
                            aolu aoluVar = new aolu(wrap);
                            aopi.a.b(buildPartial).h(buildPartial, aoluVar, aomwVar);
                            o.n(aonkVar.d, buildPartial);
                            if (aoluVar.c() != Integer.MAX_VALUE) {
                                throw aoob.b();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        amkq.cA(cE, i, aomfVar);
                    }
                }
            } finally {
                amkq.cD(obj, (aoqc) cE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[EDGE_INSN: B:24:0x00b7->B:25:0x00b7 BREAK  A[LOOP:1: B:10:0x0062->B:18:0x0062], SYNTHETIC] */
    @Override // defpackage.aopq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.aolt r15) {
        /*
            r10 = this;
            r0 = r11
            aonm r0 = (defpackage.aonm) r0
            aoqc r1 = r0.unknownFields
            aoqc r2 = defpackage.aoqc.a
            if (r1 != r2) goto Lf
            aoqc r1 = defpackage.aoqc.c()
            r0.unknownFields = r1
        Lf:
            aonh r11 = (defpackage.aonh) r11
            aomz r11 = r11.d()
            r0 = 0
            r2 = r0
        L17:
            if (r13 >= r14) goto Lc3
            int r4 = defpackage.aocz.M(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.aoqp.a
            r5 = 2
            if (r13 == r3) goto L60
            int r3 = defpackage.aoqp.b(r13)
            if (r3 != r5) goto L5b
            aomw r2 = r15.d
            aooy r3 = r10.a
            int r5 = defpackage.aoqp.a(r13)
            aonk r8 = r2.d(r3, r5)
            if (r8 == 0) goto L50
            aopi r13 = defpackage.aopi.a
            aooy r2 = r8.c
            java.lang.Class r2 = r2.getClass()
            aopq r13 = r13.a(r2)
            int r13 = defpackage.aocz.y(r13, r12, r4, r14, r15)
            aonj r2 = r8.d
            java.lang.Object r3 = r15.c
            r11.n(r2, r3)
            goto L59
        L50:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.aocz.L(r2, r3, r4, r5, r6, r7)
        L59:
            r2 = r8
            goto L17
        L5b:
            int r13 = defpackage.aocz.Q(r13, r12, r4, r14, r15)
            goto L17
        L60:
            r13 = 0
            r3 = r0
        L62:
            if (r4 >= r14) goto Lb7
            int r4 = defpackage.aocz.M(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.aoqp.b(r6)
            int r8 = defpackage.aoqp.a(r6)
            if (r8 == r5) goto L9d
            r9 = 3
            if (r8 == r9) goto L78
            goto Lae
        L78:
            if (r2 == 0) goto L92
            aopi r6 = defpackage.aopi.a
            aooy r7 = r2.c
            java.lang.Class r7 = r7.getClass()
            aopq r6 = r6.a(r7)
            int r4 = defpackage.aocz.y(r6, r12, r4, r14, r15)
            aonj r6 = r2.d
            java.lang.Object r7 = r15.c
            r11.n(r6, r7)
            goto L62
        L92:
            if (r7 != r5) goto Lae
            int r4 = defpackage.aocz.v(r12, r4, r15)
            java.lang.Object r3 = r15.c
            aomf r3 = (defpackage.aomf) r3
            goto L62
        L9d:
            if (r7 != 0) goto Lae
            int r4 = defpackage.aocz.M(r12, r4, r15)
            int r13 = r15.a
            aomw r2 = r15.d
            aooy r6 = r10.a
            aonk r2 = r2.d(r6, r13)
            goto L62
        Lae:
            int r7 = defpackage.aoqp.b
            if (r6 == r7) goto Lb7
            int r4 = defpackage.aocz.Q(r6, r12, r4, r14, r15)
            goto L62
        Lb7:
            if (r3 == 0) goto Lc0
            int r13 = defpackage.aoqp.c(r13, r5)
            r1.f(r13, r3)
        Lc0:
            r13 = r4
            goto L17
        Lc3:
            if (r13 != r14) goto Lc6
            return
        Lc6:
            aoob r11 = defpackage.aoob.g()
            goto Lcc
        Lcb:
            throw r11
        Lcc:
            goto Lcb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopb.i(java.lang.Object, byte[], int, int, aolt):void");
    }

    @Override // defpackage.aopq
    public final boolean j(Object obj, Object obj2) {
        if (!amkq.cC(obj).equals(amkq.cC(obj2))) {
            return false;
        }
        if (this.b) {
            return aocz.n(obj).equals(aocz.n(obj2));
        }
        return true;
    }

    @Override // defpackage.aopq
    public final boolean k(Object obj) {
        return aocz.n(obj).j();
    }

    @Override // defpackage.aopq
    public final void l(Object obj, aomq aomqVar) {
        Iterator e = aocz.n(obj).e();
        while (e.hasNext()) {
            Map.Entry entry = (Map.Entry) e.next();
            aonj aonjVar = (aonj) entry.getKey();
            if (aonjVar.a() == aoqo.MESSAGE && !aonjVar.d && !aonjVar.e) {
                if (!(entry instanceof aooe)) {
                    aomqVar.l(aonjVar.b, entry.getValue());
                } else {
                    aomqVar.l(aonjVar.b, ((aoog) ((aooe) entry).a.getValue()).a());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        aoqc cC = amkq.cC(obj);
        for (int i = 0; i < cC.b; i++) {
            aomqVar.l(aoqp.a(cC.c[i]), cC.d[i]);
        }
    }
}

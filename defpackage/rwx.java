package defpackage;

import java.util.TreeMap;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rwx implements rwz {
    private boolean[] d;
    private rwr b = new rwr(0);
    public rze a = null;
    private rxh c = new rxh(0);
    private rze e = null;
    private rwr f = new rwr(0);
    private rwr g = new rwr(0);
    private rxb h = new rxb(0);

    protected void A(Object obj, Object obj2, Double d, Double d2, int i, rze rzeVar, rze rzeVar2, rze rzeVar3, rze rzeVar4, TreeMap treeMap, rww rwwVar) {
        float a;
        rwwVar.a.d(obj, 0.0f, 0.0f, 1);
        float a2 = rzeVar4.a(Double.valueOf(0.0d));
        if (rzeVar3.n(obj2)) {
            a = rzeVar3.a(obj2);
        } else {
            a = rzeVar.a(obj2);
        }
        rwwVar.b.d(obj2, a, rzeVar.a(obj2), 1);
        rwwVar.c.d(d, a2, rzeVar2.b(d, d2), 1);
        rwwVar.d.d(d2, a2, rzeVar2.a(d2), 1);
        rwwVar.e.a(i, i, 1);
    }

    @Override // defpackage.rwz
    public final void B() {
    }

    @Override // defpackage.rwz
    public final void C() {
        this.h.c();
    }

    protected abstract rww f(sba sbaVar);

    @Override // defpackage.rwz
    public synchronized void g(float f) {
        this.f.g(f);
        this.g.g(f);
        this.c.g(f);
        this.b.g(f);
        rxb rxbVar = this.h;
        if (rxbVar.c != null) {
            int i = 0;
            if (f < 1.0f) {
                int i2 = rxbVar.a;
                while (true) {
                    int[] iArr = rxbVar.b;
                    if (i >= iArr.length) {
                        break;
                    }
                    int[] iArr2 = rxbVar.c;
                    int i3 = rxbVar.d[i];
                    int i4 = iArr[i];
                    int i5 = i3 & 16711680;
                    int i6 = i3 & 65280;
                    int i7 = i3 & PrivateKeyType.INVALID;
                    iArr2[i] = ((((int) (((((i4 >> 24) & PrivateKeyType.INVALID) - r4) * f) + ((i3 >> 24) & PrivateKeyType.INVALID))) << 24) & (-16777216)) | (16711680 & ((int) ((((i4 & 16711680) - i5) * f) + i5))) | (((int) ((((i4 & 65280) - i6) * f) + i6)) & 65280) | (((int) ((((i4 & PrivateKeyType.INVALID) - i7) * f) + i7)) & PrivateKeyType.INVALID);
                    i++;
                }
            } else {
                rxbVar.c = null;
                rxbVar.d = null;
                rxbVar.h = false;
                int i8 = rxbVar.f;
                int i9 = rxbVar.g;
                if (i8 != i9) {
                    int[] iArr3 = new int[i9];
                    int i10 = 0;
                    while (i < rxbVar.f) {
                        if (rxbVar.e[i] != 0) {
                            iArr3[i10] = rxbVar.b[i];
                            i10++;
                        }
                        i++;
                    }
                    rxbVar.f = rxbVar.g;
                    rxbVar.b = iArr3;
                    rxbVar.e = null;
                }
            }
        }
    }

    @Override // defpackage.rwz
    public final float h(int i) {
        return this.c.a(i);
    }

    @Override // defpackage.rwz
    public final float i(int i) {
        return this.g.a(i);
    }

    @Override // defpackage.rwz
    public final float j(int i) {
        return this.f.a(i);
    }

    @Override // defpackage.rwz
    public final int k(int i) {
        rxb rxbVar = this.h;
        sbt.f(i, rxbVar.f);
        int[] iArr = rxbVar.c;
        if (iArr != null) {
            return iArr[i];
        }
        return rxbVar.b[i];
    }

    @Override // defpackage.rwz
    public final int l() {
        return this.c.d;
    }

    @Override // defpackage.rwz
    public final int m(Object obj) {
        Integer num = (Integer) this.c.e.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rww n(sba sbaVar) {
        return new rww(this.c.d + sbaVar.a());
    }

    public final synchronized rxa o() {
        rxi b;
        b = this.b.b();
        return new rxa(b.a, b.c, this.c.b(), this.a, this.f.b(), this.g.b(), this.e);
    }

    public final synchronized rxc p() {
        rxb rxbVar;
        int[] iArr;
        rxbVar = this.h;
        iArr = rxbVar.c;
        if (iArr == null) {
            iArr = rxbVar.b;
        }
        return new rxc(iArr, rxbVar.f);
    }

    public final Double q(int i) {
        return (Double) this.g.c(i);
    }

    @Override // defpackage.rwz
    public final Double r(int i) {
        return (Double) this.f.c(i);
    }

    @Override // defpackage.rwz
    public final Object s(int i) {
        return this.b.c(i);
    }

    @Override // defpackage.rwz
    public final Object t(int i) {
        return this.c.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r10 <= r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r11 <= r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r10 > r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r11 > r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r10 <= r9) goto L29;
     */
    @Override // defpackage.rwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set u(defpackage.ryv r14) {
        /*
            r13 = this;
            rxh r0 = r13.c
            int r1 = r0.d
            java.util.HashSet r1 = defpackage.rwh.q(r1)
            float[] r2 = r0.c
            float[] r3 = r0.b
            java.util.List r4 = r0.a
            r5 = 0
            r6 = 0
        L10:
            int r7 = r0.d
            if (r6 >= r7) goto L74
            r7 = 1
            if (r2 != 0) goto L34
            java.lang.Object r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            java.lang.Object r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L32
            int r8 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r8 > 0) goto L32
            goto L68
        L32:
            r7 = 0
            goto L68
        L34:
            java.lang.Object r8 = r14.a
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            java.lang.Object r9 = r14.b
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r10 = r3[r6]
            r11 = r2[r6]
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L50
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L50:
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 > 0) goto L58
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 <= 0) goto L68
        L58:
            int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r12 >= 0) goto L60
            int r12 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r12 > 0) goto L68
        L60:
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 >= 0) goto L32
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 <= 0) goto L32
        L68:
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.get(r6)
            r1.add(r7)
        L71:
            int r6 = r6 + 1
            goto L10
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwx.u(ryv):java.util.Set");
    }

    public final synchronized void v(rxa rxaVar) {
        this.b = new rwr(new rxi(rxaVar.a, rxaVar.c.b, rxaVar.b));
        this.c = new rxh(rxaVar.c);
        this.a = rxaVar.d;
        this.f = new rwr(rxaVar.e);
        this.g = new rwr(rxaVar.f);
        this.e = rxaVar.g;
    }

    public final synchronized void w(rxc rxcVar) {
        rxb rxbVar = new rxb(rxcVar);
        this.h = rxbVar;
        rxbVar.c();
    }

    @Override // defpackage.rwz
    public final synchronized void x(rze rzeVar, rze rzeVar2, saw sawVar, sba sbaVar) {
        Double d;
        Double d2;
        int i;
        saw sawVar2;
        saw sawVar3;
        Object obj;
        int i2;
        Object obj2;
        saw sawVar4;
        Object obj3;
        saw sawVar5;
        int i3;
        Object obj4;
        rze rzeVar3;
        rww rwwVar;
        TreeMap treeMap;
        rze rzeVar4 = rzeVar;
        rze rzeVar5 = rzeVar2;
        saw sawVar6 = sawVar;
        sba sbaVar2 = sbaVar;
        synchronized (this) {
            rxh rxhVar = this.c;
            this.d = new boolean[rxhVar.d];
            TreeMap w = rwh.w();
            int i4 = rxhVar.d;
            for (int i5 = 0; i5 < i4; i5++) {
                w.put((Comparable) rxhVar.c(i5), Integer.valueOf(i5));
            }
            rww f = f(sbaVar2);
            f.e.c();
            if (this.e == null) {
                this.e = rzeVar5;
            }
            if (this.a == null) {
                this.a = rzeVar4;
            }
            if (rzeVar5 == null) {
                rzeVar5 = this.e;
            }
            rze rzeVar6 = rzeVar5;
            if (rzeVar4 == null) {
                rzeVar4 = this.a;
            }
            saw c = sbaVar2.c(sax.a);
            saw d3 = sbaVar2.d(sax.b, Double.valueOf(0.0d));
            saw c2 = sbaVar2.c(sax.e);
            int i6 = -1;
            Object obj5 = null;
            Object obj6 = null;
            for (Object obj7 : sbaVar2.a) {
                int i7 = i6 + 1;
                Object a = sawVar6.a(obj7, i7, sbaVar2);
                Double d4 = (Double) c.a(obj7, i7, sbaVar2);
                Double d5 = (Double) d3.a(obj7, i7, sbaVar2);
                saw sawVar7 = c2;
                int intValue = ((Integer) c2.a(obj7, i7, sbaVar2)).intValue();
                if (obj5 == null) {
                    sawVar2 = d3;
                    sawVar3 = c;
                    i = intValue;
                    obj = a;
                    d = d5;
                    i2 = i7;
                    d2 = d4;
                    obj2 = obj7;
                    z(a, rzeVar4, rzeVar6, w, f);
                } else {
                    d = d5;
                    d2 = d4;
                    i = intValue;
                    sawVar2 = d3;
                    sawVar3 = c;
                    obj = a;
                    i2 = i7;
                    obj2 = obj7;
                }
                Integer num = (Integer) w.get(sawVar6.a(obj2, i2, sbaVar2));
                if (num != null) {
                    boolean[] zArr = this.d;
                    int intValue2 = num.intValue();
                    int intValue3 = num.intValue();
                    f.a.d(obj2, 0.0f, 0.0f, 2);
                    int i8 = i2;
                    f.b.d(obj, h(intValue3), rzeVar4.a(obj), 2);
                    Double d6 = d;
                    Double d7 = d2;
                    f.c.d(d7, j(intValue3), rzeVar6.b(d7, d6), 2);
                    f.d.d(d6, i(intValue3), rzeVar6.a(d6), 2);
                    f.e.a(k(intValue3), i, 2);
                    zArr[intValue2] = true;
                    sawVar4 = sawVar7;
                    sawVar5 = sawVar2;
                    obj3 = obj;
                    rzeVar3 = rzeVar6;
                    rwwVar = f;
                    treeMap = w;
                    i3 = i8;
                    obj4 = obj2;
                } else {
                    int i9 = i2;
                    Double d8 = d2;
                    sawVar4 = sawVar7;
                    obj3 = obj;
                    sawVar5 = sawVar2;
                    i3 = i9;
                    obj4 = obj2;
                    rzeVar3 = rzeVar6;
                    rwwVar = f;
                    treeMap = w;
                    A(obj2, obj, d8, d, i, rzeVar4, rzeVar6, this.a, this.e, w, rwwVar);
                }
                f = rwwVar;
                c2 = sawVar4;
                rzeVar6 = rzeVar3;
                w = treeMap;
                c = sawVar3;
                obj6 = obj3;
                d3 = sawVar5;
                i6 = i3;
                obj5 = obj4;
                sawVar6 = sawVar;
                sbaVar2 = sbaVar;
            }
            rze rzeVar7 = rzeVar6;
            rww rwwVar2 = f;
            y(obj5, obj6, rzeVar4, rzeVar7, w, rwwVar2);
            this.b = rwwVar2.a;
            this.c = rwwVar2.b;
            this.f = rwwVar2.c;
            this.g = rwwVar2.d;
            this.h = rwwVar2.e;
            this.a = rzeVar4.h();
            this.e = rzeVar7.h();
        }
    }

    protected void y(Object obj, Object obj2, rze rzeVar, rze rzeVar2, TreeMap treeMap, rww rwwVar) {
        for (int i = 0; i < this.c.d; i++) {
            if (!this.d[i]) {
                rwwVar.a.d(s(i), 0.0f, 0.0f, 0);
                float a = rzeVar2.a(Double.valueOf(0.0d));
                Object t = t(i);
                rwwVar.b.d(t, h(i), rzeVar.n(t) ? rzeVar.a(t) : h(i), 0);
                Double r = r(i);
                float j = j(i);
                Double q = q(i);
                float i2 = i(i);
                rwwVar.c.d(r, j, a, 0);
                rwwVar.d.d(q, i2, a, 0);
                rwwVar.e.a(k(i), k(i), 0);
            }
        }
    }

    protected void z(Object obj, rze rzeVar, rze rzeVar2, TreeMap treeMap, rww rwwVar) {
    }
}

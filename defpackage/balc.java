package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balc extends baks {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final balc G = aj(bajn.a);

    private balc(bajf bajfVar, int i) {
        super(bajfVar, i);
    }

    public static balc aj(bajn bajnVar) {
        return ak(bajnVar, 4);
    }

    public static balc ak(bajn bajnVar, int i) {
        balc balcVar;
        if (bajnVar == null) {
            bajnVar = bajn.k();
        }
        ConcurrentHashMap concurrentHashMap = H;
        balc[] balcVarArr = (balc[]) concurrentHashMap.get(bajnVar);
        if (balcVarArr == null) {
            balcVarArr = new balc[7];
            balc[] balcVarArr2 = (balc[]) concurrentHashMap.putIfAbsent(bajnVar, balcVarArr);
            if (balcVarArr2 != null) {
                balcVarArr = balcVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            balc balcVar2 = balcVarArr[i2];
            if (balcVar2 == null) {
                synchronized (balcVarArr) {
                    balcVar2 = balcVarArr[i2];
                    if (balcVar2 == null) {
                        if (bajnVar == bajn.a) {
                            balcVar = new balc(null, i);
                        } else {
                            balcVar = new balc(bali.O(ak(bajn.a, i), bajnVar), i);
                        }
                        balcVarArr[i2] = balcVar;
                        balcVar2 = balcVar;
                    }
                }
            }
            return balcVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private Object readResolve() {
        bajf bajfVar = this.a;
        int i = ((bakp) this).F;
        if (i == 0) {
            i = 4;
        }
        return bajfVar == null ? ak(bajn.a, i) : ak(bajfVar.z(), i);
    }

    @Override // defpackage.bakp, defpackage.bakm
    protected final void N(bakl baklVar) {
        if (this.a == null) {
            baklVar.a = bakp.n;
            baklVar.b = bakp.o;
            baklVar.c = bakp.p;
            baklVar.d = bakp.q;
            baklVar.e = bakp.r;
            baklVar.f = bakp.s;
            baklVar.g = bakp.t;
            baklVar.m = bakp.u;
            baklVar.n = bakp.v;
            baklVar.o = bakp.w;
            baklVar.p = bakp.x;
            baklVar.q = bakp.y;
            baklVar.r = bakp.z;
            baklVar.s = bakp.A;
            baklVar.u = bakp.B;
            baklVar.t = bakp.C;
            baklVar.v = bakp.D;
            baklVar.w = bakp.E;
            baklVar.E = new bakw(this);
            baklVar.F = new balb(baklVar.E, this);
            bajh bajhVar = baklVar.F;
            baklVar.H = new balo(new bals(bajhVar, bajhVar == null ? null : bajhVar.o(), 99), bajj.e);
            balo baloVar = (balo) baklVar.H;
            baklVar.G = new bals(new balw(baloVar, baloVar.g), bajj.f);
            baklVar.I = new baky(this);
            baklVar.x = new bakx(this, baklVar.f);
            baklVar.y = new bakq(this, baklVar.f);
            baklVar.z = new bakr(this, baklVar.f);
            baklVar.D = new bala(this);
            baklVar.B = new bakv(this);
            baklVar.A = new baku(this, baklVar.g);
            baklVar.C = new bals(new balw(baklVar.B, bajj.k), bajj.k);
            baklVar.j = baklVar.E.p();
            baklVar.k = baklVar.H.p();
            baklVar.i = baklVar.D.p();
            baklVar.h = baklVar.B.p();
        }
    }

    @Override // defpackage.bajf
    public final bajf a() {
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (ai(r7) != false) goto L5;
     */
    @Override // defpackage.bakp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long aa(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            int r1 = r1 + r0
            boolean r0 = r6.ai(r7)
            if (r0 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.balc.aa(int):long");
    }

    @Override // defpackage.bakp
    public final boolean ai(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    @Override // defpackage.bajf
    public final bajf b(bajn bajnVar) {
        if (bajnVar == null) {
            bajnVar = bajn.k();
        }
        return bajnVar == z() ? this : aj(bajnVar);
    }
}

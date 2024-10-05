package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bali extends bakm {
    private static final long serialVersionUID = -1079258847191166848L;

    private bali(bajf bajfVar, bajn bajnVar) {
        super(bajfVar, bajnVar);
    }

    public static bali O(bajf bajfVar, bajn bajnVar) {
        if (bajfVar != null) {
            bajf a = bajfVar.a();
            if (a == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            }
            if (bajnVar == null) {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
            return new bali(a, bajnVar);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean P(bajp bajpVar) {
        return bajpVar != null && bajpVar.e() < 43200000;
    }

    private final bajh Q(bajh bajhVar, HashMap hashMap) {
        if (bajhVar == null || !bajhVar.t()) {
            return bajhVar;
        }
        if (hashMap.containsKey(bajhVar)) {
            return (bajh) hashMap.get(bajhVar);
        }
        balg balgVar = new balg(bajhVar, (bajn) this.b, R(bajhVar.p(), hashMap), R(bajhVar.r(), hashMap), R(bajhVar.q(), hashMap));
        hashMap.put(bajhVar, balgVar);
        return balgVar;
    }

    private final bajp R(bajp bajpVar, HashMap hashMap) {
        if (bajpVar == null || !bajpVar.h()) {
            return bajpVar;
        }
        if (hashMap.containsKey(bajpVar)) {
            return (bajp) hashMap.get(bajpVar);
        }
        balh balhVar = new balh(bajpVar, (bajn) this.b);
        hashMap.put(bajpVar, balhVar);
        return balhVar;
    }

    @Override // defpackage.bakm
    protected final void N(bakl baklVar) {
        HashMap hashMap = new HashMap();
        baklVar.l = R(baklVar.l, hashMap);
        baklVar.k = R(baklVar.k, hashMap);
        baklVar.j = R(baklVar.j, hashMap);
        baklVar.i = R(baklVar.i, hashMap);
        baklVar.h = R(baklVar.h, hashMap);
        baklVar.g = R(baklVar.g, hashMap);
        baklVar.f = R(baklVar.f, hashMap);
        baklVar.e = R(baklVar.e, hashMap);
        baklVar.d = R(baklVar.d, hashMap);
        baklVar.c = R(baklVar.c, hashMap);
        baklVar.b = R(baklVar.b, hashMap);
        baklVar.a = R(baklVar.a, hashMap);
        baklVar.E = Q(baklVar.E, hashMap);
        baklVar.F = Q(baklVar.F, hashMap);
        baklVar.G = Q(baklVar.G, hashMap);
        baklVar.H = Q(baklVar.H, hashMap);
        baklVar.I = Q(baklVar.I, hashMap);
        baklVar.x = Q(baklVar.x, hashMap);
        baklVar.y = Q(baklVar.y, hashMap);
        baklVar.z = Q(baklVar.z, hashMap);
        baklVar.D = Q(baklVar.D, hashMap);
        baklVar.A = Q(baklVar.A, hashMap);
        baklVar.B = Q(baklVar.B, hashMap);
        baklVar.C = Q(baklVar.C, hashMap);
        baklVar.m = Q(baklVar.m, hashMap);
        baklVar.n = Q(baklVar.n, hashMap);
        baklVar.o = Q(baklVar.o, hashMap);
        baklVar.p = Q(baklVar.p, hashMap);
        baklVar.q = Q(baklVar.q, hashMap);
        baklVar.r = Q(baklVar.r, hashMap);
        baklVar.s = Q(baklVar.s, hashMap);
        baklVar.u = Q(baklVar.u, hashMap);
        baklVar.t = Q(baklVar.t, hashMap);
        baklVar.v = Q(baklVar.v, hashMap);
        baklVar.w = Q(baklVar.w, hashMap);
    }

    @Override // defpackage.bajf
    public final bajf a() {
        return this.a;
    }

    @Override // defpackage.bajf
    public final bajf b(bajn bajnVar) {
        if (bajnVar == null) {
            bajnVar = bajn.k();
        }
        return bajnVar == this.b ? this : bajnVar == bajn.a ? this.a : new bali(this.a, bajnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bali)) {
            return false;
        }
        bali baliVar = (bali) obj;
        if (this.a.equals(baliVar.a)) {
            if (((bajn) this.b).equals(baliVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((bajn) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = ((bajn) this.b).c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + str.length());
        sb.append("ZonedChronology[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.bakm, defpackage.bajf
    public final bajn z() {
        return (bajn) this.b;
    }
}

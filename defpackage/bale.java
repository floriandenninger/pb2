package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bale extends bakm {
    public static final bale n;
    private static final ConcurrentHashMap o;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        o = concurrentHashMap;
        bale baleVar = new bale(balc.G);
        n = baleVar;
        concurrentHashMap.put(bajn.a, baleVar);
    }

    private bale(bajf bajfVar) {
        super(bajfVar, null);
    }

    public static bale O() {
        return P(bajn.k());
    }

    public static bale P(bajn bajnVar) {
        if (bajnVar == null) {
            bajnVar = bajn.k();
        }
        ConcurrentHashMap concurrentHashMap = o;
        bale baleVar = (bale) concurrentHashMap.get(bajnVar);
        if (baleVar == null) {
            baleVar = new bale(bali.O(n, bajnVar));
            bale baleVar2 = (bale) concurrentHashMap.putIfAbsent(bajnVar, baleVar);
            if (baleVar2 != null) {
                return baleVar2;
            }
        }
        return baleVar;
    }

    private Object writeReplace() {
        return new bald(z());
    }

    @Override // defpackage.bakm
    protected final void N(bakl baklVar) {
        if (this.a.z() == bajn.a) {
            baklVar.H = new balo(balf.a, bajj.e);
            baklVar.G = new balw((balo) baklVar.H, bajj.f);
            baklVar.C = new balw((balo) baklVar.H, bajj.k);
            baklVar.k = baklVar.H.p();
        }
    }

    @Override // defpackage.bajf
    public final bajf a() {
        return n;
    }

    @Override // defpackage.bajf
    public final bajf b(bajn bajnVar) {
        if (bajnVar == null) {
            bajnVar = bajn.k();
        }
        return bajnVar == z() ? this : P(bajnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bale) {
            return z().equals(((bale) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        bajn z = z();
        if (z == null) {
            return "ISOChronology";
        }
        String str = z.c;
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append("ISOChronology[");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}

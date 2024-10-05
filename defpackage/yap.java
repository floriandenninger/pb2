package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yap {
    public final Map a;
    public final Map b;
    public final Map c;

    public yap(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public static boolean i(dha dhaVar) {
        return dhaVar.u() && dha.z(dhaVar);
    }

    public final apyv a(apyv apyvVar) {
        if (this.c.containsKey(apyvVar)) {
            return (apyv) this.c.get(apyvVar);
        }
        apyx apyxVar = apyvVar.E;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b != 62285947) {
            return null;
        }
        apyx apyxVar2 = apyvVar.E;
        if (apyxVar2 == null) {
            apyxVar2 = apyx.a;
        }
        return apyxVar2.b == 62285947 ? (apyv) apyxVar2.c : apyv.a;
    }

    public final void b(apyv apyvVar) {
        this.b.put(apyvVar, true);
    }

    public final void c(apyv apyvVar, apyv apyvVar2) {
        this.c.put(apyvVar, apyvVar2);
    }

    public final void d(apyv apyvVar, boolean z) {
        this.a.put(apyvVar, Boolean.valueOf(z));
    }

    public final boolean e(apyv apyvVar) {
        Boolean bool = (Boolean) this.a.get(apyvVar);
        return bool == null ? apyvVar.N : bool.booleanValue();
    }

    public final boolean f(apyv apyvVar) {
        return this.b.get(apyvVar) == null && apyvVar.G.size() > 0;
    }

    public final int g(String str) {
        Integer num = (Integer) this.a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void h(String str, String str2, int i) {
        this.b.put(str, str2);
        this.c.put(str2, str);
        this.a.put(str, Integer.valueOf(i));
    }

    public yap(byte[] bArr) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = new HashMap();
    }

    public yap() {
        this.a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
    }
}

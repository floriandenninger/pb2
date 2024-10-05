package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eaz {
    public final qxg a;
    public final qxo b;
    public final ebk c;
    public final eao d;
    private final eay e;

    public eaz(qxg qxgVar, qxo qxoVar, ebk ebkVar, eay eayVar, eao eaoVar) {
        this.a = qxgVar;
        this.b = qxoVar;
        this.c = ebkVar;
        this.e = eayVar;
        this.d = eaoVar;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        dvo a = qxo.a(this.b.e, qxn.a);
        hashMap.put("v", this.a.a);
        hashMap.put("gms", Boolean.valueOf(this.a.c));
        hashMap.put("int", a.s);
        hashMap.put("up", Boolean.valueOf(this.e.a));
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}

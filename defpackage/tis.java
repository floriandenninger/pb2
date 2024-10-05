package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tis {
    public final Map a = new HashMap();
    public final tgb b;

    public tis(tgb tgbVar) {
        this.b = tgbVar;
    }

    public static tis d(tgb tgbVar) {
        return new tis(tgbVar);
    }

    public final tgb a(Object obj, tfy tfyVar) {
        amkq.N(this.a.get(obj) == null);
        tgb f = tfyVar.f(this.b.e);
        f.a = new tit(f);
        this.a.put(obj, f);
        this.b.a.d(f);
        return f;
    }

    public final tgb b(Object obj) {
        tgb tgbVar = (tgb) this.a.get(obj);
        tgbVar.getClass();
        return tgbVar;
    }

    @Deprecated
    public final tir c(int i) {
        return new tir(this, awxk.u(i), null, null, null, null, null);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagt {
    private final ArrayList a = new ArrayList();
    private aahd b;

    public final aagx a() {
        return new aagu(amru.o(this.a), this.b);
    }

    public final void b(Map map) {
        ArrayList arrayList = this.a;
        map.getClass();
        arrayList.add(new aagw(map));
    }

    public final void c(Map map) {
        this.a.add(new aagv(map));
    }

    public final void d(aahd aahdVar) {
        amkq.O(this.b == null, "fallbackRouter was already set");
        aahdVar.getClass();
        this.b = aahdVar;
    }
}

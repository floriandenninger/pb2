package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axzh {
    public axzj a;
    public Map b;

    public axzh(axzj axzjVar) {
        this.a = axzjVar;
    }

    public final axzj a() {
        if (this.b != null) {
            axzj axzjVar = this.a;
            axzj axzjVar2 = axzj.a;
            for (Map.Entry entry : axzjVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((axzi) entry.getKey(), entry.getValue());
                }
            }
            this.a = new axzj(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(axzi axziVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(axziVar, obj);
    }
}

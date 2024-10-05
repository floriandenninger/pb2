package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfh {
    public Executor a;
    public vcw b;
    private final vhf d = vhf.a;
    private final HashMap c = new HashMap();

    public final vfg a() {
        return new vfg(this.a, this.b, this.d, this.c);
    }

    public final void b(vhb vhbVar) {
        String b = vhbVar.b();
        amkq.J(!this.c.containsKey(b), "There is already a factory registered for the ID %s", b);
        this.c.put(b, vhbVar);
    }
}

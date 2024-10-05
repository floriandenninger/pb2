package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrg implements adqo {
    private final adqo a;
    private final List b = new ArrayList();
    private volatile adqz c = null;

    static {
        zga.a("MDX.transport");
    }

    public adrg(adqo adqoVar) {
        this.a = adqoVar;
    }

    public final synchronized void a(adrf adrfVar) {
        if (this.c != null) {
            adrfVar.a(this.c);
        } else {
            this.b.add(adrfVar);
        }
    }

    @Override // defpackage.adqo
    public final synchronized void b(adqz adqzVar) {
        if (this.b.isEmpty() || !adgf.MDX_SESSION_STATUS.equals(adqzVar.a)) {
            this.a.b(adqzVar);
            return;
        }
        this.c = adqzVar;
        String.format("Found MdxSessionStatus: %s", adqzVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((adrf) it.next()).a(adqzVar);
        }
    }

    public final synchronized void c() {
        this.c = null;
        this.b.clear();
    }
}

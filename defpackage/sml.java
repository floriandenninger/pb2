package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sml {
    public final axpg b;
    public final ayqi c;
    public final ayqi d;
    public final Map a = new HashMap();
    public final Object e = new Object();

    public sml(axpg axpgVar, ayqi ayqiVar, ayqi ayqiVar2) {
        this.b = axpgVar;
        this.c = ayqiVar;
        this.d = ayqiVar2;
    }

    public final void a(String str) {
        Object obj;
        synchronized (this.e) {
            smk smkVar = (smk) this.a.get(str);
            if (smkVar != null && (obj = smkVar.b) != null) {
                ayrz.c((AtomicReference) obj);
                smkVar.b = null;
            }
        }
    }
}

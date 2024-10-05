package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffz {
    public final acpz a;
    public final Set b = new HashSet();

    public ffz(acpz acpzVar) {
        this.a = acpzVar;
    }

    public final void a(argo argoVar) {
        if (this.b.add(argoVar)) {
            this.a.b(new acpx(argoVar.q, 7), aqxl.FLOW_TYPE_IN_APP_UPDATE);
        }
    }
}

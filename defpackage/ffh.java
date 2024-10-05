package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffh implements aahd {
    public WeakReference a;

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        WeakReference weakReference = this.a;
        aahd aahdVar = weakReference != null ? (aahd) weakReference.get() : null;
        if (aahdVar == null) {
            String valueOf = String.valueOf(apxfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Attempting to route command without a resolver ");
            sb.append(valueOf);
            afsi.b(1, 1, sb.toString());
            return;
        }
        aahdVar.c(apxfVar, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }
}

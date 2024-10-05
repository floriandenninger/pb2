package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acts implements ypb {
    final /* synthetic */ actz a;
    private final actd b;

    public acts(actz actzVar, actd actdVar) {
        this.a = actzVar;
        actdVar.getClass();
        this.b = actdVar;
    }

    @Override // defpackage.ypb
    public final void a(Object obj) {
        Map a = this.b.a(obj);
        if (a == null || a.isEmpty()) {
            return;
        }
        if (!this.a.a.isEmpty()) {
            for (actb actbVar : this.a.a) {
                for (Map.Entry entry : a.entrySet()) {
                    actbVar.g((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (this.a.b.isEmpty()) {
            return;
        }
        for (actb actbVar2 : this.a.b) {
            for (Map.Entry entry2 : a.entrySet()) {
                actbVar2.g((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
    }
}

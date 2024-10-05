package androidx.lifecycle;

import defpackage.aoa;
import defpackage.aod;
import defpackage.aoi;
import defpackage.aok;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements aoi {
    private final aoa a;
    private final aoi b;

    public FullLifecycleObserverAdapter(aoa aoaVar, aoi aoiVar) {
        this.a = aoaVar;
        this.b = aoiVar;
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        switch (aodVar) {
            case ON_CREATE:
                this.a.lg(aokVar);
                break;
            case ON_START:
                this.a.ot(aokVar);
                break;
            case ON_RESUME:
                this.a.nu(aokVar);
                break;
            case ON_PAUSE:
                this.a.lc(aokVar);
                break;
            case ON_STOP:
                this.a.nv(aokVar);
                break;
            case ON_DESTROY:
                this.a.lh(aokVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        aoi aoiVar = this.b;
        if (aoiVar != null) {
            aoiVar.a(aokVar, aodVar);
        }
    }
}

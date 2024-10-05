package androidx.lifecycle;

import defpackage.anv;
import defpackage.anx;
import defpackage.aod;
import defpackage.aoi;
import defpackage.aok;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements aoi {
    private final Object a;
    private final anv b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = anx.a.b(obj.getClass());
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        anv anvVar = this.b;
        Object obj = this.a;
        anv.a((List) anvVar.a.get(aodVar), aokVar, aodVar, obj);
        anv.a((List) anvVar.a.get(aod.ON_ANY), aokVar, aodVar, obj);
    }
}

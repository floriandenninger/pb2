package androidx.lifecycle;

import defpackage.aob;
import defpackage.aod;
import defpackage.aoi;
import defpackage.aok;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements aoi {
    private final aob[] a;

    public CompositeGeneratedAdaptersObserver(aob[] aobVarArr) {
        this.a = aobVarArr;
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        new HashMap();
        for (aob aobVar : this.a) {
            aobVar.a();
        }
        for (aob aobVar2 : this.a) {
            aobVar2.a();
        }
    }
}

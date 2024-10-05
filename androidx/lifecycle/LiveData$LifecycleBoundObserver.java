package androidx.lifecycle;

import defpackage.aod;
import defpackage.aoe;
import defpackage.aoi;
import defpackage.aok;
import defpackage.aos;
import defpackage.aot;
import defpackage.aox;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends aos implements aoi {
    final aok a;
    final /* synthetic */ aot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(aot aotVar, aok aokVar, aox aoxVar) {
        super(aotVar, aoxVar);
        this.b = aotVar;
        this.a = aokVar;
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        aoe a = this.a.getLifecycle().a();
        if (a == aoe.DESTROYED) {
            this.b.k(this.c);
            return;
        }
        aoe aoeVar = null;
        while (aoeVar != a) {
            d(jG());
            aoeVar = a;
            a = this.a.getLifecycle().a();
        }
    }

    @Override // defpackage.aos
    public final void b() {
        this.a.getLifecycle().c(this);
    }

    @Override // defpackage.aos
    public final boolean c(aok aokVar) {
        return this.a == aokVar;
    }

    @Override // defpackage.aos
    public final boolean jG() {
        return this.a.getLifecycle().a().a(aoe.STARTED);
    }
}

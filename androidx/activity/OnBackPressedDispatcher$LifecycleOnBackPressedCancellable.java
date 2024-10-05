package androidx.activity;

import defpackage.aod;
import defpackage.aof;
import defpackage.aoi;
import defpackage.aok;
import defpackage.zo;
import defpackage.zw;
import defpackage.zy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements aoi, zo {
    final /* synthetic */ zy a;
    private final aof b;
    private final zw c;
    private zo d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(zy zyVar, aof aofVar, zw zwVar) {
        this.a = zyVar;
        this.b = aofVar;
        this.c = zwVar;
        aofVar.b(this);
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        if (aodVar == aod.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (aodVar != aod.ON_STOP) {
            if (aodVar == aod.ON_DESTROY) {
                b();
            }
        } else {
            zo zoVar = this.d;
            if (zoVar != null) {
                zoVar.b();
            }
        }
    }

    @Override // defpackage.zo
    public final void b() {
        this.b.c(this);
        this.c.d(this);
        zo zoVar = this.d;
        if (zoVar != null) {
            zoVar.b();
            this.d = null;
        }
    }
}

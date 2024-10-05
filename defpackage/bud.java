package defpackage;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import defpackage.aod;
import defpackage.aok;
import defpackage.buc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bud {
    public final buc a = new buc();
    private final bue b;

    private bud(bue bueVar) {
        this.b = bueVar;
    }

    public static bud a(bue bueVar) {
        return new bud(bueVar);
    }

    public final void b(Bundle bundle) {
        aof lifecycle = this.b.getLifecycle();
        if (lifecycle.a() != aoe.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.b(new Recreator(this.b));
        final buc bucVar = this.a;
        if (bucVar.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            bucVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle.b(new aoi() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // defpackage.aoi
            public final void a(aok aokVar, aod aodVar) {
                buc bucVar2;
                boolean z;
                if (aodVar == aod.ON_START) {
                    bucVar2 = buc.this;
                    z = true;
                } else {
                    if (aodVar != aod.ON_STOP) {
                        return;
                    }
                    bucVar2 = buc.this;
                    z = false;
                }
                bucVar2.d = z;
            }
        });
        bucVar.c = true;
    }

    public final void c(Bundle bundle) {
        buc bucVar = this.a;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = bucVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        aax f = bucVar.a.f();
        while (f.hasNext()) {
            aaw aawVar = (aaw) f.next();
            bundle2.putBundle((String) aawVar.a, ((bub) aawVar.b).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

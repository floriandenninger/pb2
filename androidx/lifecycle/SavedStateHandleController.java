package androidx.lifecycle;

import android.os.Bundle;
import defpackage.aod;
import defpackage.aoe;
import defpackage.aof;
import defpackage.aoi;
import defpackage.aok;
import defpackage.aph;
import defpackage.api;
import defpackage.apm;
import defpackage.buc;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements aoi {
    public final aph a;
    private final String b;
    private boolean c = false;

    public SavedStateHandleController(String str, aph aphVar) {
        this.b = str;
        this.a = aphVar;
    }

    public static SavedStateHandleController b(buc bucVar, aof aofVar, String str, Bundle bundle) {
        aph aphVar;
        Bundle a = bucVar.a(str);
        if (a != null || bundle != null) {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a == null) {
                aphVar = new aph(hashMap);
            } else {
                ArrayList parcelableArrayList = a.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a.getParcelableArrayList("values");
                if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                    }
                    aphVar = new aph(hashMap);
                } else {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
            }
        } else {
            aphVar = new aph();
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, aphVar);
        savedStateHandleController.d(bucVar, aofVar);
        e(bucVar, aofVar);
        return savedStateHandleController;
    }

    public static void c(apm apmVar, buc bucVar, aof aofVar) {
        Object obj;
        synchronized (apmVar.w) {
            obj = apmVar.w.get("androidx.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.d(bucVar, aofVar);
        e(bucVar, aofVar);
    }

    private static void e(final buc bucVar, final aof aofVar) {
        aoe a = aofVar.a();
        if (a == aoe.INITIALIZED || a.a(aoe.STARTED)) {
            bucVar.c(api.class);
        } else {
            aofVar.b(new aoi() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // defpackage.aoi
                public final void a(aok aokVar, aod aodVar) {
                    if (aodVar == aod.ON_START) {
                        aof.this.c(this);
                        bucVar.c(api.class);
                    }
                }
            });
        }
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        if (aodVar == aod.ON_DESTROY) {
            this.c = false;
            aokVar.getLifecycle().c(this);
        }
    }

    final void d(buc bucVar, aof aofVar) {
        if (this.c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.c = true;
        aofVar.b(this);
        bucVar.b(this.b, this.a.e);
    }
}

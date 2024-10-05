package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ant extends app {
    private final buc a;
    private final aof b;
    private final Bundle c;

    public ant(bue bueVar, Bundle bundle) {
        this.a = bueVar.getSavedStateRegistry();
        this.b = bueVar.getLifecycle();
        this.c = bundle;
    }

    @Override // defpackage.app, defpackage.apo
    public final apm a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b(canonicalName, cls);
    }

    @Override // defpackage.app
    public final apm b(String str, Class cls) {
        SavedStateHandleController b = SavedStateHandleController.b(this.a, this.b, str, this.c);
        apm d = d(cls, b.a);
        d.t(b);
        return d;
    }

    @Override // defpackage.apr
    public final void c(apm apmVar) {
        SavedStateHandleController.c(apmVar, this.a, this.b);
    }

    protected abstract apm d(Class cls, aph aphVar);
}

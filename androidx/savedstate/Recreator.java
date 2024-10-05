package androidx.savedstate;

import android.os.Bundle;
import defpackage.aod;
import defpackage.aoi;
import defpackage.aok;
import defpackage.bua;
import defpackage.bue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Recreator implements aoi {
    private final bue a;

    public Recreator(bue bueVar) {
        this.a = bueVar;
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        if (aodVar != aod.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        aokVar.getLifecycle().c(this);
        Bundle a = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(bua.class);
                    try {
                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            ((bua) declaredConstructor.newInstance(new Object[0])).a(this.a);
                        } catch (Exception e) {
                            throw new RuntimeException("Failed to instantiate " + str, e);
                        }
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException("Class " + str + " wasn't found", e3);
                }
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}

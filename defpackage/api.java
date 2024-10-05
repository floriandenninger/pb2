package defpackage;

import androidx.lifecycle.SavedStateHandleController;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class api implements bua {
    api() {
    }

    @Override // defpackage.bua
    public final void a(bue bueVar) {
        if (!(bueVar instanceof apu)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
        apt viewModelStore = ((apu) bueVar).getViewModelStore();
        buc savedStateRegistry = bueVar.getSavedStateRegistry();
        Iterator it = viewModelStore.b().iterator();
        while (it.hasNext()) {
            SavedStateHandleController.c(viewModelStore.a((String) it.next()), savedStateRegistry, bueVar.getLifecycle());
        }
        if (viewModelStore.b().isEmpty()) {
            return;
        }
        savedStateRegistry.c(api.class);
    }
}

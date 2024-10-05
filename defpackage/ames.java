package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ames implements aok, apu, bue, aoc {
    final /* synthetic */ ammv a;

    public ames(ammv ammvVar) {
        this.a = ammvVar;
    }

    public final Context a() {
        return (Context) this.a.c();
    }

    public final dd b() {
        return ((ci) this.a.c()).getSupportFragmentManager();
    }

    @Override // defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ((ci) this.a.c()).getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return ((ci) this.a.c()).getLifecycle();
    }

    @Override // defpackage.bue
    public final buc getSavedStateRegistry() {
        return ((ci) this.a.c()).getSavedStateRegistry();
    }

    @Override // defpackage.apu
    public final apt getViewModelStore() {
        return ((ci) this.a.c()).getViewModelStore();
    }
}

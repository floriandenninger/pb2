package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ch extends co implements apu, zz, aak, bue, df {
    final /* synthetic */ ci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(ci ciVar) {
        super(ciVar, ciVar, new Handler());
        this.a = ciVar;
    }

    @Override // defpackage.co, defpackage.cl
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.co, defpackage.cl
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.co
    public final void c() {
        this.a.supportInvalidateOptionsMenu();
    }

    @Override // defpackage.df
    public final void d(ce ceVar) {
        this.a.onAttachFragment(ceVar);
    }

    @Override // defpackage.aak
    public final aaj getActivityResultRegistry() {
        return this.a.getActivityResultRegistry();
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return this.a.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.bue
    public final buc getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override // defpackage.apu
    public final apt getViewModelStore() {
        return this.a.getViewModelStore();
    }
}

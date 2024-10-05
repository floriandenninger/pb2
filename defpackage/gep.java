package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gep implements anfy {
    public final /* synthetic */ ActiveStateLifecycleController a;
    public final /* synthetic */ get b;
    private final /* synthetic */ int c;

    public /* synthetic */ gep(ActiveStateLifecycleController activeStateLifecycleController, get getVar, int i) {
        this.c = i;
        this.a = activeStateLifecycleController;
        this.b = getVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        if (this.c != 0) {
            ActiveStateLifecycleController activeStateLifecycleController = this.a;
            return anaf.T(new gep(activeStateLifecycleController, this.b, 0), activeStateLifecycleController.a);
        }
        this.a.h(this.b);
        return anhv.a;
    }
}

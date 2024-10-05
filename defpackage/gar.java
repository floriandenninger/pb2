package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gar implements alc {
    public final /* synthetic */ BottomUiContainer a;
    private final /* synthetic */ int b;

    public /* synthetic */ gar(BottomUiContainer bottomUiContainer, int i) {
        this.b = i;
        this.a = bottomUiContainer;
    }

    @Override // defpackage.alc
    public final void a(boolean z) {
        if (this.b != 0) {
            this.a.i = null;
            return;
        }
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.f = null;
        bottomUiContainer.i = null;
        if (z) {
            return;
        }
        bottomUiContainer.n(null, null);
    }
}

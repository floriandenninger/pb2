package defpackage;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggh implements zcc {
    final /* synthetic */ InlinePlayerLayout a;

    public ggh(InlinePlayerLayout inlinePlayerLayout) {
        this.a = inlinePlayerLayout;
    }

    @Override // defpackage.zcc
    public final void rV(zby zbyVar) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.a.e;
        if (inlinePlayerOverlayLayout != null && inlinePlayerOverlayLayout.g()) {
            inlinePlayerOverlayLayout.f();
            inlinePlayerOverlayLayout.invalidate();
        }
        if (this.a.f()) {
            this.a.e();
            this.a.invalidate();
        }
    }
}

package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmp implements View.OnAttachStateChangeListener {
    final /* synthetic */ PipPaidProductBadgeOverlay a;

    public kmp(PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay) {
        this.a = pipPaidProductBadgeOverlay;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = this.a;
        if (pipPaidProductBadgeOverlay.a) {
            return;
        }
        pipPaidProductBadgeOverlay.a = true;
        pipPaidProductBadgeOverlay.i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = this.a;
        if (pipPaidProductBadgeOverlay.a) {
            pipPaidProductBadgeOverlay.a = false;
            pipPaidProductBadgeOverlay.i();
        }
    }
}

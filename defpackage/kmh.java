package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.MiniPlayerErrorOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmh implements View.OnAttachStateChangeListener {
    final /* synthetic */ MiniPlayerErrorOverlay a;

    public kmh(MiniPlayerErrorOverlay miniPlayerErrorOverlay) {
        this.a = miniPlayerErrorOverlay;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
        if (miniPlayerErrorOverlay.a) {
            return;
        }
        miniPlayerErrorOverlay.a = true;
        miniPlayerErrorOverlay.h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        MiniPlayerErrorOverlay miniPlayerErrorOverlay = this.a;
        if (miniPlayerErrorOverlay.a) {
            miniPlayerErrorOverlay.a = false;
            miniPlayerErrorOverlay.h();
        }
    }
}

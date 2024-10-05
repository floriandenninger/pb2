package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kln implements ayrs {
    public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kln(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay, int i) {
        this.b = i;
        this.a = interactiveInlineMutedControlsOverlay;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        Drawable drawable;
        int i = this.b;
        if (i == 0) {
            this.a.p = ((ahds) obj).d();
        } else {
            if (i == 1) {
                InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
                TouchImageView touchImageView = interactiveInlineMutedControlsOverlay.y;
                if (((ahdo) obj).a()) {
                    drawable = interactiveInlineMutedControlsOverlay.d.getResources().getDrawable(R.drawable.yt_outline_volume_off_white_24);
                } else {
                    drawable = interactiveInlineMutedControlsOverlay.d.getResources().getDrawable(R.drawable.yt_outline_volume_on_white_24);
                }
                touchImageView.setImageDrawable(drawable);
                return;
            }
            this.a.q = ((Boolean) obj).booleanValue();
        }
    }
}

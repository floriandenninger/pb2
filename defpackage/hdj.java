package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.GreenScreenMediaThumbnailContainer;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hdj extends ViewOutlineProvider {
    final /* synthetic */ GreenScreenMediaThumbnailContainer a;

    public hdj(GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer) {
        this.a = greenScreenMediaThumbnailContainer;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a.getResources().getDimension(R.dimen.green_screen_media_item_corner_radius));
    }
}

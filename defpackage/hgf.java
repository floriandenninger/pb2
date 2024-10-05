package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgf implements TextureView.SurfaceTextureListener {
    final /* synthetic */ ShortsPlayerView a;

    public hgf(ShortsPlayerView shortsPlayerView) {
        this.a = shortsPlayerView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.f.e(surfaceTexture, i, i2);
        this.a.b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.f.o();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        ShortsPlayerView shortsPlayerView = this.a;
        if (shortsPlayerView.h) {
            zga.l("SPlayerView: Ignoring texture size changes since frames processing has started");
            afsi.b(1, 6, "[ShortsCreation][Android][Edit]Ignoring texture size changes since frames processing has started");
        } else {
            shortsPlayerView.f.f(i, i2);
        }
        this.a.b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

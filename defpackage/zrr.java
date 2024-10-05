package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrr implements TextureView.SurfaceTextureListener {
    final /* synthetic */ zrs a;
    private final String b;

    public zrr(zrs zrsVar, String str) {
        this.a = zrsVar;
        this.b = str;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a.n) {
            return;
        }
        zrs zrsVar = this.a;
        if (zrsVar.c != null) {
            zrsVar.j.g(amru.r(this.b));
        } else if (zrsVar.C()) {
            this.a.A();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.u(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

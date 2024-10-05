package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zts implements TextureView.SurfaceTextureListener {
    private final String a;
    private final Map b;
    private final Map c;
    private final zfi d;

    public zts(String str, Map map, Map map2, zfi zfiVar) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = zfiVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.b) {
            if (this.c.containsKey(this.a)) {
                if (!this.b.containsKey(this.a)) {
                    Map map = this.b;
                    String str = this.a;
                    map.put(str, (ztq) this.c.get(str));
                }
                this.c.remove(this.a);
            }
            this.d.a(this.a);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

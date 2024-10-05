package defpackage;

import android.content.Context;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkw extends afkv {
    public afkw(Context context) {
        super(context);
    }

    @Override // defpackage.afkv, defpackage.afky
    public final aflb C() {
        return aflb.YUV_SURFACE;
    }

    @Override // defpackage.afkv, defpackage.afkr, defpackage.afky
    public final SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afkv, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.getHolder().setFormat(842094169);
        super.surfaceCreated(surfaceHolder);
    }
}

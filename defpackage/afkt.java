package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkt extends afkv implements SurfaceHolder.Callback, afky {
    public afkt(Context context) {
        super(context);
        this.a.setSecure(true);
    }

    @Override // defpackage.afkv, defpackage.afky
    public final aflb C() {
        return aflb.SECURE_SURFACE;
    }

    @Override // defpackage.afkv, defpackage.afkr, defpackage.afky
    public final SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afkv, defpackage.afkr, defpackage.afkl
    public final void l(Bitmap bitmap, ykl yklVar) {
        yklVar.a(bitmap, null);
    }
}

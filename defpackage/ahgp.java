package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahgp extends GLSurfaceView {
    final /* synthetic */ ahgq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgp(ahgq ahgqVar, Context context) {
        super(context);
        this.a = ahgqVar;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e = true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        this.a.k();
        this.a.e = false;
        super.onDetachedFromWindow();
    }
}

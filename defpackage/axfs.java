package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.google.vr.ndk.base.GvrSurfaceView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfs extends GvrSurfaceView {
    private final axfr a;
    private boolean b;
    private boolean c;
    private ArrayList d;
    private final axfv e;

    public axfs(Context context, axfr axfrVar) {
        super(context);
        this.a = axfrVar;
        axfv axfvVar = new axfv();
        this.e = axfvVar;
        setEGLContextFactory(axfvVar);
        setEGLWindowSurfaceFactory(axfvVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.vr.ndk.base.GvrSurfaceView, android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = false;
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                super.queueEvent((Runnable) arrayList.get(i));
            }
            this.d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.vr.ndk.base.GvrSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        axfr axfrVar;
        if (this.b && (axfrVar = this.a) != null) {
            axfrVar.onSurfaceViewDetachedFromWindow();
        }
        super.onDetachedFromWindow();
        this.c = true;
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void onPause() {
        if (this.b) {
            super.onPause();
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void onResume() {
        if (this.b) {
            super.onResume();
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void queueEvent(Runnable runnable) {
        if (!this.b) {
            runnable.run();
        } else {
            if (this.c) {
                if (this.d == null) {
                    this.d = new ArrayList();
                }
                this.d.add(runnable);
                return;
            }
            super.queueEvent(runnable);
        }
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void setEGLContextClientVersion(int i) {
        super.setEGLContextClientVersion(2);
        this.e.e = 2;
    }

    @Override // com.google.vr.ndk.base.GvrSurfaceView
    public final void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        this.b = true;
    }
}

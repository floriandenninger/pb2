package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.google.cardboard.sdk.CardboardView;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahgl implements ahgs {
    private static final String c = "ahgl";
    public final CardboardView a;
    public final ahgk b;
    private boolean d;

    public ahgl(Context context) {
        CardboardView.setUseGvrGlSurfaceView(true);
        final CardboardView cardboardView = new CardboardView(context);
        this.a = cardboardView;
        cardboardView.setOnSettingsButtonClick(new Runnable() { // from class: ahgh
            @Override // java.lang.Runnable
            public final void run() {
                CardboardView.this.onSettingsButtonClick();
            }
        });
        cardboardView.setOnViewDetachedRunnable(new Runnable() { // from class: ahgg
            @Override // java.lang.Runnable
            public final void run() {
                ahgl.this.k();
            }
        });
        this.b = new ahgk();
    }

    @Override // defpackage.ahgs
    public final ViewGroup a() {
        return this.a;
    }

    @Override // defpackage.ahks
    public final void b(Runnable runnable) {
        this.a.queueEvent(runnable);
        zga.m(c, "QE");
    }

    @Override // defpackage.ahgs
    public final GvrViewerParams c() {
        return new GvrViewerParams();
    }

    @Override // defpackage.ahgs
    public final void d() {
        this.a.onPause();
    }

    @Override // defpackage.ahgs
    public final void e() {
        this.a.onResume();
    }

    @Override // defpackage.ahgs
    public final void f(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.ahgs
    public final void g(Runnable runnable) {
        this.a.setOnTriggerEvent(runnable);
    }

    @Override // defpackage.ahgs
    public final void h(Runnable runnable) {
        this.a.setOnBackButtonClick(runnable);
    }

    @Override // defpackage.ahgs
    public final void i(GvrView.StereoRenderer stereoRenderer) {
        this.a.setRenderer(this.b);
        ahgk ahgkVar = this.b;
        ahgkVar.a = stereoRenderer;
        ahgkVar.b = true;
    }

    @Override // defpackage.ahgs
    public final void j(boolean z) {
        this.a.setStereoRenderMode(z);
    }

    @Override // defpackage.ahgs
    public final void k() {
        String str = c;
        boolean isGlViewAttached = this.a.isGlViewAttached();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("S | ");
        sb.append(isGlViewAttached);
        sb.append(" | ");
        sb.append(z);
        zga.m(str, sb.toString());
        yjk.f();
        if (!this.a.isGlViewAttached() || this.d) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.shutdownCalled();
        b(new ahgi(this, countDownLatch));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zga.d("Interrupted during shutdown", e);
        }
        this.d = true;
    }

    @Override // defpackage.ahgs
    public final void l(int i, int i2, int i3, int i4) {
        this.a.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }
}

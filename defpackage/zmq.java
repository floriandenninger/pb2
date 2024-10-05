package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.hardware.Camera;
import android.hardware.display.DisplayManager;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmq extends ce implements Camera.PreviewCallback, SurfaceHolder.Callback, zmm {
    public zmn a;
    private SurfaceView ae;
    private SurfaceHolder af;
    private ObjectAnimator ag;
    private DisplayManager ah;
    private DisplayManager.DisplayListener ai;
    public int b;
    public View c;
    private boolean d;
    private int e;

    public static final int d(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        return rotation == 3 ? 270 : 0;
    }

    private final void n() {
        boolean z = Build.VERSION.SDK_INT < 23 || C().checkSelfPermission("android.permission.CAMERA") == 0;
        this.d = z;
        if (z) {
            int[] i = zmn.i();
            int i2 = i[0];
            if (i2 >= 0) {
                this.e = i2;
            } else {
                i2 = i[1];
                this.e = i2;
            }
            if (i2 >= 0) {
                zmn zmnVar = new zmn();
                this.a = zmnVar;
                zmnVar.i = this;
                zmnVar.b(this.af);
                this.ai = new zmo(this);
                DisplayManager displayManager = (DisplayManager) C().getSystemService("display");
                this.ah = displayManager;
                displayManager.registerDisplayListener(this.ai, null);
            }
        }
    }

    private final void o() {
        if (this.a == null) {
            return;
        }
        CamcorderProfile X = wcy.X(this.e, 20, 6);
        int d = d(C());
        this.b = d;
        this.a.e(d);
        this.a.f(this.e, X.videoFrameWidth, X.videoFrameHeight, X.videoFrameRate);
    }

    @Override // defpackage.ce
    public final void V() {
        DisplayManager.DisplayListener displayListener;
        DisplayManager displayManager = this.ah;
        if (displayManager != null && (displayListener = this.ai) != null) {
            displayManager.unregisterDisplayListener(displayListener);
            this.ai = null;
        }
        super.V();
    }

    @Override // defpackage.ce
    public final void X() {
        a();
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        if (!this.d) {
            n();
        }
        ObjectAnimator objectAnimator = this.ag;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.ag.cancel();
        }
        this.ag = null;
        this.c.setAlpha(1.0f);
        this.c.setVisibility(0);
        super.Z();
        o();
    }

    public final void a() {
        zmn zmnVar = this.a;
        if (zmnVar != null) {
            zmnVar.d();
        }
    }

    @Override // defpackage.zmm
    public final void b() {
    }

    @Override // defpackage.zmm
    public final void c(Camera camera) {
        camera.setOneShotPreviewCallback(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.camera_preview_fragment, viewGroup, false);
        this.c = viewGroup2.findViewById(R.id.camera_preview_cover);
        this.ae = (SurfaceView) viewGroup2.findViewById(R.id.camera_preview_surface_view);
        n();
        this.ae.getHolder().addCallback(this);
        return viewGroup2;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        ObjectAnimator objectAnimator = this.ag;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.ag.cancel();
        }
        this.ag = null;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, (Property<View, Float>) View.ALPHA, this.c.getAlpha(), 0.0f);
        this.ag = ofFloat;
        ofFloat.addListener(new zmp(this));
        this.ag.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.af = surfaceHolder;
        if (this.a == null || surfaceHolder.isCreating()) {
            return;
        }
        a();
        this.a.b(surfaceHolder);
        o();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.af = surfaceHolder;
        zmn zmnVar = this.a;
        if (zmnVar != null) {
            zmnVar.b(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.af = null;
        if (this.a != null) {
            a();
            this.a.b(null);
        }
    }
}

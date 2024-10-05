package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sei extends CameraDevice.StateCallback {
    private final aes a;
    private final SettableFuture b;
    private final SettableFuture c;
    private final Size d;
    private final Executor e;
    private Surface f;

    public sei(aes aesVar, SettableFuture settableFuture, SettableFuture settableFuture2, Size size, Executor executor) {
        this.a = aesVar;
        this.b = settableFuture;
        this.c = settableFuture2;
        this.d = size;
        this.e = executor;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
            this.f = null;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("Creating capture session failed: ");
        sb.append(i);
        RuntimeException runtimeException = new RuntimeException(sb.toString());
        this.a.d(runtimeException);
        this.b.e(runtimeException);
        this.c.e(runtimeException);
        cameraDevice.close();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
            this.f = null;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(this.d.getWidth(), this.d.getHeight());
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = new Surface(surfaceTexture);
        amru r = amru.r(new OutputConfiguration(this.f));
        try {
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            createCaptureRequest.addTarget(this.f);
            CaptureRequest build = createCaptureRequest.build();
            Executor executor = this.e;
            cameraDevice.createCaptureSession(new SessionConfiguration(0, r, executor, new sek(this.c, build, executor)));
            this.b.o(cameraDevice);
            this.a.c(surfaceTexture);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
            ((amxh) ((amxh) ((amxh) sel.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/external/Camera2CameraProvider$CameraCallback", "onOpened", (char) 155, "Camera2CameraProvider.java")).q("Creating capture session failed.");
            this.a.d(e);
            this.b.e(e);
            this.c.e(e);
            surfaceTexture.release();
            this.f.release();
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class accy {
    public static final Comparator a = new uo(14);
    private static final uo s = new uo(15);
    public final TextureView b;
    public final acdo c;
    public final accx d;
    public CaptureRequest.Builder e;
    public boolean f;
    public Size g;
    public CameraDevice h;
    public CameraCaptureSession i;
    public boolean j;
    public acea l;
    private final CameraManager m;
    private final String n;
    private final int o;
    private final boolean p;
    public final Semaphore k = new Semaphore(1);
    private final TextureView.SurfaceTextureListener q = new accs(this);
    private final CameraDevice.StateCallback r = new acct(this);

    public accy(Context context, String str, int i, TextureView textureView) {
        amkq.E(!TextUtils.isEmpty(str));
        amkq.E(i > 0);
        textureView.getClass();
        this.n = str;
        this.o = i;
        this.b = textureView;
        this.m = (CameraManager) context.getSystemService("camera");
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.d = new accx(this);
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i2 = context.getResources().getConfiguration().orientation;
        if (rotation == 0 || rotation == 2) {
            this.p = i2 == 1;
        } else {
            this.p = i2 == 2;
        }
        this.c = new acdo(context, new accr(this));
    }

    public static final boolean j(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key key, int i) {
        int[] iArr;
        if (cameraCharacteristics != null && (iArr = (int[]) cameraCharacteristics.get(key)) != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final CameraCharacteristics a() {
        try {
            return this.m.getCameraCharacteristics(this.n);
        } catch (Exception e) {
            Log.e("CameraPreviewCtrl", "Could not access camera for characteristics", e);
            return null;
        }
    }

    public final void b() {
        this.g = null;
        this.b.setSurfaceTextureListener(null);
        this.c.disable();
        c(true);
        this.j = false;
        this.f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z) {
        try {
            try {
                this.k.acquire();
                CameraCaptureSession cameraCaptureSession = this.i;
                if (cameraCaptureSession != null && z) {
                    try {
                        cameraCaptureSession.abortCaptures();
                    } catch (Exception e) {
                        Log.w("CameraPreviewCtrl", "Failed to abortCaptures", e);
                    }
                    try {
                        this.i.close();
                    } catch (Exception e2) {
                        Log.w("CameraPreviewCtrl", "Failed to close capture session", e2);
                    }
                }
                CameraDevice cameraDevice = this.h;
                if (cameraDevice != null) {
                    cameraDevice.close();
                }
            } finally {
                this.i = null;
                this.h = null;
                amkq.O(this.k.availablePermits() == 0, "Unexpected lock state");
                this.k.release();
            }
        } catch (InterruptedException e3) {
            throw new RuntimeException("Interrupted while trying to lock camera closing.", e3);
        }
    }

    public final void d(int i, int i2) {
        RectF rectF;
        if (this.g == null || !this.b.isAvailable()) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i2;
        RectF rectF2 = new RectF(0.0f, 0.0f, f, f2);
        int height = this.g.getHeight();
        int width = this.g.getWidth();
        if (this.p) {
            rectF = new RectF(0.0f, 0.0f, height, width);
        } else {
            rectF = new RectF(0.0f, 0.0f, width, height);
        }
        float centerX = rectF2.centerX();
        float centerY = rectF2.centerY();
        rectF.offset(centerX - rectF.centerX(), centerY - rectF.centerY());
        matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
        float max = Math.max(f2 / height, f / width);
        matrix.postScale(max, max, centerX, centerY);
        int i3 = this.c.a;
        if (i3 != -1 && i3 != 0) {
            matrix.postRotate(i3, centerX, centerY);
        }
        this.b.setTransform(matrix);
    }

    public final void e(CameraDevice cameraDevice, String str) {
        if (this.k.availablePermits() == 0) {
            this.k.release();
        }
        amkq.O(this.k.availablePermits() == 1, "Unexpected lock state");
        this.h = cameraDevice;
        c(false);
        acea aceaVar = this.l;
        if (aceaVar != null) {
            aceaVar.a(new RuntimeException(str));
        }
    }

    public final void f(int i, int i2) {
        if (TextUtils.isEmpty(this.n)) {
            Log.e("CameraPreviewCtrl", "Could not find a camera");
            return;
        }
        d(i, i2);
        try {
            if (!this.k.tryAcquire(500L, TimeUnit.MILLISECONDS)) {
                RuntimeException runtimeException = new RuntimeException("Time out waiting to lock camera opening.");
                acea aceaVar = this.l;
                if (aceaVar != null) {
                    aceaVar.a(runtimeException);
                    return;
                }
                throw runtimeException;
            }
            if (this.h != null) {
                Log.e("CameraPreviewCtrl", "Camera already opened");
                amkq.O(this.k.availablePermits() == 0, "Unexpected lock state");
                this.k.release();
                return;
            }
            this.m.openCamera(this.n, this.r, (Handler) null);
        } catch (Exception e) {
            Log.e("CameraPreviewCtrl", "Could not open camera", e);
            amkq.O(this.k.availablePermits() == 0, "Unexpected lock state");
            this.k.release();
            acea aceaVar2 = this.l;
            if (aceaVar2 != null) {
                aceaVar2.a(e);
            }
        }
    }

    public final void g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        try {
            this.i.setRepeatingRequest(captureRequest, captureCallback, null);
        } catch (Exception e) {
            Log.e("CameraPreviewCtrl", "Could not enable camera preview capture session", e);
            acea aceaVar = this.l;
            if (aceaVar != null) {
                aceaVar.a(e);
            }
        }
    }

    public final void h() {
        amkq.F(this.f, "Camera preview helper must be initialized");
        if (this.j) {
            return;
        }
        this.j = true;
        accx accxVar = this.d;
        if (accxVar.c != null) {
            accxVar.a();
        }
        accxVar.b = false;
        accxVar.c = Thread.currentThread();
        accxVar.d = accxVar.c.getUncaughtExceptionHandler();
        accxVar.c.setUncaughtExceptionHandler(accxVar.a);
        if (this.b.getSurfaceTextureListener() == null) {
            this.b.setSurfaceTextureListener(this.q);
            if (this.b.isAvailable()) {
                f(this.b.getWidth(), this.b.getHeight());
            }
        }
        d(this.b.getWidth(), this.b.getHeight());
        this.c.enable();
        i();
    }

    public final void i() {
        CaptureRequest.Builder builder;
        if (!this.j || (builder = this.e) == null || this.i == null) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_EFFECT_MODE, 0);
        CaptureRequest build = this.e.build();
        g(build, new accv(this, build));
    }

    public final boolean k(acea aceaVar) {
        if (this.f) {
            b();
        }
        CameraCharacteristics a2 = a();
        Size size = null;
        if (a2 == null) {
            Log.e("CameraPreviewCtrl", "No camera characteristics available to retrieve preview size");
        } else {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                Log.e("CameraPreviewCtrl", "Could not get stream config map from camera");
            } else {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                Size size2 = (outputSizes == null || outputSizes.length == 0) ? null : (Size) Collections.max(Arrays.asList(outputSizes), s);
                Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                if (outputSizes2 == null) {
                    Log.e("CameraPreviewCtrl", "Could not find any surface textures for camera");
                } else {
                    ArrayList arrayList = new ArrayList();
                    int width = size2 == null ? 0 : size2.getWidth();
                    int height = size2 == null ? 0 : size2.getHeight();
                    for (Size size3 : outputSizes2) {
                        int height2 = size3.getHeight();
                        int width2 = size3.getWidth();
                        if (height2 * width == width2 * height && Math.min(width2, height2) >= this.o) {
                            arrayList.add(size3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("CameraPreviewCtrl", "Couldn't find any suitable preview size");
                        size = outputSizes2[0];
                    } else {
                        size = (Size) Collections.min(arrayList, new uo(15));
                    }
                }
            }
        }
        this.g = size;
        if (size == null) {
            Log.e("CameraPreviewCtrl", "Failed to create a preview buffer");
            return false;
        }
        this.l = aceaVar;
        this.f = true;
        return true;
    }

    public final void l() {
        this.l = null;
    }
}

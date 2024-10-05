package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqs implements Runnable, absb {
    public final int a;
    public boolean b;
    public int c;
    public int d;
    public abqo e;
    public int f;
    private final ExecutorService g;
    private final double h;
    private final boolean i;
    private int j;
    private int k;
    private Camera l;
    private SurfaceTexture m;
    private SurfaceTexture n;
    private boolean o;

    public abqs(double d, boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new abqq(0));
        this.a = Camera.getNumberOfCameras();
        this.c = 1;
        this.d = 1;
        this.j = -1;
        this.k = -1;
        this.g = newSingleThreadExecutor;
        this.h = d;
        this.i = z;
    }

    public static void g(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        } else if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("edof")) {
            parameters.setFocusMode("edof");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        }
        String valueOf = String.valueOf(parameters.getFocusMode());
        if (valueOf.length() != 0) {
            "Focus mode: ".concat(valueOf);
        }
    }

    private final synchronized Camera o(int i) {
        Camera camera;
        if (Camera.getNumberOfCameras() != 0) {
            camera = null;
            for (int i2 = 2; camera == null && this.k == i && i2 >= 0; i2--) {
                try {
                    camera = Camera.open(i);
                } catch (RuntimeException e) {
                    if (i2 > 0) {
                        try {
                            wait(500L);
                        } catch (InterruptedException e2) {
                            throw new abqp(e2);
                        }
                    } else {
                        throw new abqp(e);
                    }
                }
            }
            throw new abqp(new Throwable("Interrupted with a camera change"));
        }
        throw new abqr();
        return camera;
    }

    private final void p() {
        Camera camera;
        synchronized (this) {
            camera = this.l;
            this.l = null;
        }
        if (camera != null) {
            if (this.o) {
                camera.stopPreview();
            }
            camera.release();
        }
        this.o = false;
        this.j = -1;
    }

    private static boolean q(Camera.Parameters parameters) {
        List<String> supportedSceneModes;
        return (parameters == null || (supportedSceneModes = parameters.getSupportedSceneModes()) == null || !supportedSceneModes.contains("hdr")) ? false : true;
    }

    public final int a() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(b(), cameraInfo);
            return cameraInfo.facing;
        } catch (Exception e) {
            zga.d("Error obtaining camera info: ", e);
            return -1;
        }
    }

    public final synchronized int b() {
        return this.k;
    }

    final Rect c(float f, float f2, int i, float f3) {
        int i2 = (i - this.f) % 360;
        if (i2 < 0) {
            i2 += 360;
        }
        if (i2 == 90) {
            float f4 = this.c - f2;
            f2 = f;
            f = f4;
        } else if (i2 == 180) {
            f = this.c - f;
            f2 = this.d - f2;
        } else if (i2 == 270) {
            f2 = this.d - f;
            f = f2;
        }
        double d = (f / this.c) * 2000.0f;
        Double.isNaN(d);
        int i3 = (int) (d - 1000.0d);
        double d2 = (f2 / this.d) * 2000.0f;
        Double.isNaN(d2);
        int i4 = (int) (d2 - 1000.0d);
        int i5 = (int) (f3 / 2.0f);
        return new Rect(Math.min(Math.max(-1000, i3 - i5), 1000), Math.min(Math.max(-1000, i4 - i5), 1000), Math.min(Math.max(-1000, i3 + i5), 1000), Math.min(Math.max(-1000, i4 + i5), 1000));
    }

    final Future d(int i) {
        amkq.E(i >= -1);
        amkq.E(i < this.a);
        this.k = i;
        notifyAll();
        return this.g.submit(this);
    }

    public final synchronized void e() {
        d((this.k + 1) % this.a);
    }

    @Override // defpackage.absb
    public final void f() {
        Future d;
        synchronized (this) {
            d = d(-1);
        }
        if (d != null) {
            try {
                d.get(30L, TimeUnit.SECONDS);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                zga.d("CameraVideoSource: ", e);
            }
        }
    }

    public final synchronized void h(int i) {
        d(i);
    }

    @Override // defpackage.absb
    public final synchronized void i(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            this.m = null;
            this.n = null;
        } else if (this.m == null) {
            this.m = surfaceTexture;
            notifyAll();
        } else {
            this.n = surfaceTexture;
            this.g.submit(this);
        }
    }

    public final synchronized void j() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = numberOfCameras - 1;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = 0;
        while (true) {
            if (i2 >= numberOfCameras) {
                break;
            }
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 1) {
                i = i2;
                break;
            }
            i2++;
        }
        d(i);
    }

    public final boolean k(String str) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                return (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) ? false : true;
            } catch (Exception e) {
                zga.n("Error while getting camera parameters.", e);
            }
        }
        return false;
    }

    public final synchronized boolean l(String str) {
        if (this.l == null || !k(str)) {
            return false;
        }
        try {
            Camera.Parameters parameters = this.l.getParameters();
            parameters.setFlashMode(str);
            this.l.setParameters(parameters);
            return true;
        } catch (Exception e) {
            zga.n("Error while setting camera flash light mode", e);
            return false;
        }
    }

    public final synchronized void m(float f, float f2, int i, achy achyVar) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                try {
                    this.l.cancelAutoFocus();
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        parameters.setFocusAreas(amru.r(new Camera.Area(c(f, f2, i, 200.0f), 800)));
                    }
                    if (parameters.getMaxNumMeteringAreas() > 0) {
                        parameters.setMeteringAreas(amru.r(new Camera.Area(c(f, f2, i, 300.0f), 800)));
                    }
                    if (parameters.getMaxNumFocusAreas() > 0 || parameters.getMaxNumMeteringAreas() > 0) {
                        int i2 = (int) f;
                        int i3 = (int) f2;
                        acif acifVar = achyVar.a;
                        Animation loadAnimation = AnimationUtils.loadAnimation(acifVar.qR(), R.anim.focus_inner_circle_anim);
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(acifVar.qR(), R.anim.focus_outer_circle_anim);
                        acifVar.as.setAnimation(loadAnimation);
                        acifVar.at.setAnimation(loadAnimation2);
                        ImageView imageView = acifVar.at;
                        yny.z(imageView, yny.h(yny.r(i2 - (imageView.getWidth() / 2)), yny.v(i3 - (acifVar.at.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
                        ImageView imageView2 = acifVar.as;
                        yny.z(imageView2, yny.h(yny.r(i2 - (imageView2.getWidth() / 2)), yny.v(i3 - (acifVar.as.getHeight() / 2))), ViewGroup.MarginLayoutParams.class);
                        loadAnimation.start();
                        loadAnimation2.start();
                        if (parameters == null || !parameters.getSupportedFocusModes().contains("auto")) {
                            return;
                        }
                        parameters.setFocusMode("auto");
                        this.l.setParameters(parameters);
                        this.l.autoFocus(new Camera.AutoFocusCallback() { // from class: abql
                            @Override // android.hardware.Camera.AutoFocusCallback
                            public final void onAutoFocus(boolean z, Camera camera2) {
                                try {
                                    Camera.Parameters parameters2 = camera2.getParameters();
                                    abqs.g(parameters2);
                                    camera2.setParameters(parameters2);
                                } catch (Exception e) {
                                    zga.d("Error while resetting camera parameters.", e);
                                }
                            }
                        });
                    }
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zga.b(valueOf.length() != 0 ? "Error setting camera parameters ".concat(valueOf) : new String("Error setting camera parameters "));
                }
            } catch (Exception e2) {
                zga.d("Error while getting camera parameters.", e2);
            }
        }
    }

    public final synchronized void n(float f) {
        Camera camera = this.l;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    float f2 = -1.0f;
                    float f3 = f - 1.0f;
                    if (Math.abs(f3) >= 0.001f) {
                        int zoom = parameters.getZoom();
                        int max = Math.max(parameters.getMaxZoom(), 1);
                        float f4 = f3 * max;
                        if (Math.abs(f4) >= 1.0f) {
                            f2 = f4;
                        } else if (f4 > 0.0f) {
                            f2 = 1.0f;
                        }
                        parameters.setZoom(Math.max(0, Math.min(max, Math.round(zoom + f2))));
                        try {
                            this.l.setParameters(parameters);
                        } catch (Exception e) {
                            zga.n("Error while setting camera parameters.", e);
                        }
                    }
                }
            } catch (Exception e2) {
                zga.n("Error while getting camera parameters.", e2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        SurfaceTexture surfaceTexture = this.n;
        if (surfaceTexture != null && surfaceTexture != this.m) {
            Camera camera = this.l;
            if (camera != null && this.o) {
                try {
                    camera.stopPreview();
                    this.l.setPreviewTexture(this.n);
                    this.l.startPreview();
                } catch (IOException unused) {
                }
            }
            this.m = this.n;
            this.n = null;
        }
        if (this.k == this.j) {
            return;
        }
        p();
        int i = this.k;
        if (i != -1) {
            try {
                synchronized (this) {
                    this.l = o(i);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i, cameraInfo);
                    this.b = cameraInfo.canDisableShutterSound;
                    Camera camera2 = this.l;
                    this.f = cameraInfo.orientation;
                    final int i2 = 1;
                    if (cameraInfo.facing == 1) {
                        camera2.setDisplayOrientation((360 - cameraInfo.orientation) % 360);
                    } else {
                        camera2.setDisplayOrientation(cameraInfo.orientation);
                    }
                    final int i3 = 0;
                    z = cameraInfo.facing == 1;
                    Camera.Parameters parameters = this.l.getParameters();
                    final int i4 = (int) (this.h * 1000.0d);
                    List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    long j = parameters.getPreferredPreviewSizeForVideo() != null ? parameters.getPreferredPreviewSizeForVideo().width * parameters.getPreferredPreviewSizeForVideo().height : -1L;
                    Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                    while (it.hasNext()) {
                        Camera.Size next = it.next();
                        if (j > 0) {
                            if (next.width * next.height > j) {
                                it.remove();
                            }
                        }
                    }
                    Camera.Size size = (Camera.Size) Collections.min(supportedPreviewSizes, new Comparator() { // from class: abqm
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            if (i2 == 0) {
                                int i5 = i4;
                                Camera.Size size2 = (Camera.Size) obj;
                                Camera.Size size3 = (Camera.Size) obj2;
                                int abs = Math.abs(i5 - ((size2.width * 1000) / size2.height));
                                int abs2 = Math.abs(i5 - ((size3.width * 1000) / size3.height));
                                return abs != abs2 ? abs - abs2 : (size3.width * size3.height) - (size2.width * size2.height);
                            }
                            int i6 = i4;
                            Camera.Size size4 = (Camera.Size) obj;
                            Camera.Size size5 = (Camera.Size) obj2;
                            int abs3 = Math.abs(i6 - ((size4.width * 1000) / size4.height));
                            int abs4 = Math.abs(i6 - ((size5.width * 1000) / size5.height));
                            return abs3 != abs4 ? abs3 - abs4 : (size5.width * size5.height) - (size4.width * size4.height);
                        }
                    });
                    int i5 = size.width;
                    int i6 = size.height;
                    parameters.setPreviewSize(size.width, size.height);
                    double d = size.width;
                    double d2 = size.height;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    final int i7 = (int) ((d / d2) * 1000.0d);
                    Camera.Size size2 = (Camera.Size) Collections.min(parameters.getSupportedPictureSizes(), new Comparator() { // from class: abqm
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            if (i3 == 0) {
                                int i52 = i7;
                                Camera.Size size22 = (Camera.Size) obj;
                                Camera.Size size3 = (Camera.Size) obj2;
                                int abs = Math.abs(i52 - ((size22.width * 1000) / size22.height));
                                int abs2 = Math.abs(i52 - ((size3.width * 1000) / size3.height));
                                return abs != abs2 ? abs - abs2 : (size3.width * size3.height) - (size22.width * size22.height);
                            }
                            int i62 = i7;
                            Camera.Size size4 = (Camera.Size) obj;
                            Camera.Size size5 = (Camera.Size) obj2;
                            int abs3 = Math.abs(i62 - ((size4.width * 1000) / size4.height));
                            int abs4 = Math.abs(i62 - ((size5.width * 1000) / size5.height));
                            return abs3 != abs4 ? abs3 - abs4 : (size5.width * size5.height) - (size4.width * size4.height);
                        }
                    });
                    Camera.Size pictureSize = parameters.getPictureSize();
                    if (pictureSize != null && !pictureSize.equals(size2)) {
                        parameters.setPictureSize(size2.width, size2.height);
                        int i8 = size2.width;
                        int i9 = size2.height;
                    }
                    this.c = size.width;
                    this.d = size.height;
                    int[] iArr = {30000, 30000};
                    int i10 = Integer.MAX_VALUE;
                    for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
                        int abs = Math.abs(iArr2[0]) + Math.abs(iArr2[1] - 30000);
                        int i11 = abs < i10 ? abs : i10;
                        if (abs < i10) {
                            iArr = iArr2;
                        }
                        i10 = i11;
                    }
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    g(parameters);
                    parameters.setRecordingHint(true);
                    if (this.i && q(parameters)) {
                        parameters.setSceneMode("hdr");
                    }
                    this.l.setParameters(parameters);
                    int i12 = cameraInfo.facing == 1 ? 2 : 3;
                    boolean q = q(parameters);
                    abvt b = abvt.b();
                    abvs a = b.a(asru.class);
                    if (a.e && b.c) {
                        asrs asrsVar = (asrs) abvt.e(asru.class, b.d(a));
                        if (asrsVar == null) {
                            zga.b("Could not create camera metric");
                        } else {
                            aone createBuilder = asrt.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asrt asrtVar = (asrt) createBuilder.instance;
                            asrtVar.c = i12 - 1;
                            asrtVar.b |= 1;
                            createBuilder.copyOnWrite();
                            asrt asrtVar2 = (asrt) createBuilder.instance;
                            asrtVar2.b = 2 | asrtVar2.b;
                            asrtVar2.d = q;
                            asrt asrtVar3 = (asrt) createBuilder.build();
                            asrsVar.copyOnWrite();
                            asru asruVar = (asru) asrsVar.instance;
                            asru asruVar2 = asru.a;
                            asrtVar3.getClass();
                            aony aonyVar = asruVar.f;
                            if (!aonyVar.c()) {
                                asruVar.f = aonm.mutableCopy(aonyVar);
                            }
                            asruVar.f.add(asrtVar3);
                            b.h(asrsVar);
                        }
                    }
                    while (this.m == null && i == this.k) {
                        try {
                            wait();
                        } catch (InterruptedException unused2) {
                            zga.l("CameraVideoSource: Interrupted while waiting for SurfaceTexture");
                        }
                    }
                    if (i == this.k) {
                        SurfaceTexture surfaceTexture2 = this.m;
                        if (surfaceTexture2 == null) {
                            throw new IllegalStateException("Camera currentSurfaceTexture is null");
                        }
                        this.l.setPreviewTexture(surfaceTexture2);
                    } else {
                        throw new abqn();
                    }
                }
                this.l.startPreview();
                this.o = true;
                this.j = i;
                abqo abqoVar = this.e;
                if (abqoVar != null) {
                    abqoVar.a(z);
                }
            } catch (Exception e) {
                zga.d("Error initializing camera preview", e);
                p();
            }
        }
    }
}

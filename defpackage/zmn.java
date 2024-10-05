package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zmn {
    public static final int[] a = {100, 250, 500, 1000, 3000};
    public Camera b;
    public int c;
    public int d;
    public SurfaceTexture e;
    public SurfaceHolder f;
    public int h;
    public zmm i;
    private int k;
    private AsyncTask m;
    private int l = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    public int g = 0;
    private final Object n = new Object();
    public final Object j = new Object();

    public static int[] i() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < numberOfCameras && (i < 0 || i2 < 0); i3++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i3, cameraInfo);
                if (i < 0 && cameraInfo.facing == 1) {
                    i = i3;
                } else if (i2 < 0 && cameraInfo.facing == 0) {
                    i2 = i3;
                }
            } catch (RuntimeException unused) {
            }
        }
        return new int[]{i2, i};
    }

    public final Camera a() {
        k();
        return this.b;
    }

    public final void b(SurfaceHolder surfaceHolder) {
        synchronized (this.j) {
            this.f = surfaceHolder;
            this.e = null;
            Camera camera = this.b;
            if (camera != null) {
                try {
                    camera.setPreviewDisplay(surfaceHolder);
                } catch (IOException e) {
                    zga.d("Error setting preview display.", e);
                    h(4);
                    this.b.release();
                    this.b = null;
                }
            }
        }
    }

    public final void c(SurfaceTexture surfaceTexture) {
        synchronized (this.j) {
            this.e = surfaceTexture;
            this.f = null;
            Camera camera = this.b;
            if (camera != null) {
                try {
                    camera.setPreviewTexture(surfaceTexture);
                } catch (IOException e) {
                    zga.d("Error setting preview texture.", e);
                    h(4);
                    this.b.release();
                    this.b = null;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.n) {
            int i = this.h;
            if (i == 3) {
                while (this.h == 3) {
                    try {
                        this.n.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            }
            if (i == 0) {
                return;
            }
            h(3);
            AsyncTask asyncTask = this.m;
            if (asyncTask != null) {
                asyncTask.cancel(false);
            }
            k();
            synchronized (this.j) {
                Camera camera = this.b;
                if (camera != null) {
                    camera.release();
                    this.b = null;
                }
                this.l = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            h(0);
            zmm zmmVar = this.i;
            if (zmmVar != null) {
                zmmVar.b();
            }
        }
    }

    public final void e(int i) {
        synchronized (this.j) {
            this.k = i;
            g();
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5;
        synchronized (this.n) {
            while (true) {
                i5 = this.h;
                if (i5 != 3) {
                    break;
                } else {
                    try {
                        this.n.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            amkq.Q(this.h == 0, "Camera not stopped. State: %s", Integer.toString(i5));
            h(1);
        }
        amkq.O(this.b == null, "Camera already exists.");
        amkq.O(this.m == null, "Camera task already exists.");
        this.g = i;
        zml zmlVar = new zml(this, i, i2, i3, i4);
        this.m = zmlVar;
        zmlVar.execute(new Void[0]);
    }

    public final void g() {
        int i;
        synchronized (this.j) {
            if (this.b != null && this.k != this.l) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(this.g, cameraInfo);
                this.c = cameraInfo.orientation;
                int i2 = this.k;
                if (cameraInfo.facing == 1) {
                    i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
                } else {
                    i = ((cameraInfo.orientation - i2) + 360) % 360;
                }
                this.d = i;
                this.b.setDisplayOrientation(i);
                this.l = this.k;
            }
        }
    }

    public final void h(int i) {
        synchronized (this.n) {
            this.h = i;
            this.n.notifyAll();
        }
    }

    public final Camera.Parameters j(Camera camera) {
        try {
            return camera.getParameters();
        } catch (Exception e) {
            zga.n("Error while getting camera parameters.", e);
            return null;
        }
    }

    private final void k() {
        while (this.m != null) {
            synchronized (this.n) {
                if (this.h == 2) {
                    this.m = null;
                    return;
                }
            }
            try {
                this.m.get();
                this.m = null;
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                this.m = null;
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.youtube.R;
import defpackage.aezk;
import defpackage.agcm;
import defpackage.amkq;
import defpackage.anfq;
import defpackage.angq;
import defpackage.anhy;
import defpackage.axyz;
import defpackage.fnz;
import defpackage.heg;
import defpackage.hkt;
import defpackage.hrv;
import defpackage.lra;
import defpackage.vlu;
import defpackage.vtu;
import defpackage.vum;
import defpackage.vwb;
import defpackage.wcy;
import defpackage.xes;
import defpackage.yml;
import defpackage.ynm;
import defpackage.yny;
import defpackage.zga;
import defpackage.zmi;
import defpackage.zmm;
import defpackage.zmn;
import defpackage.zmt;
import defpackage.zmu;
import defpackage.zmv;
import defpackage.znc;
import defpackage.znd;
import defpackage.zne;
import defpackage.znf;
import defpackage.zng;
import defpackage.znh;
import defpackage.zny;
import defpackage.zog;
import defpackage.zpk;
import defpackage.zpw;
import defpackage.zrs;
import defpackage.zsc;
import defpackage.zsq;
import defpackage.ztd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CameraView extends zny implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener, znh, zsc, zmm, zmu {
    public static final /* synthetic */ int B = 0;
    public heg A;
    private GLSurfaceView C;
    private boolean D;
    private zsq E;
    private int F;
    private int G;
    private int H;
    private int I;

    /* renamed from: J */
    private int f174J;
    private int K;
    private znf L;
    private final Context M;
    private anhy N;
    private int O;
    public View a;
    public vtu b;
    public SurfaceTexture c;
    public int d;
    public boolean e;
    public boolean f;
    public zmv g;
    public final Object h;
    public final Object i;
    public zrs j;
    public int k;
    public int l;
    public znd m;
    public zmt n;
    public volatile boolean o;
    public final Object p;
    public final Set q;
    public boolean r;
    public boolean s;
    public zmu t;
    public boolean u;
    public boolean v;
    public hrv w;
    public zmn x;
    public heg y;
    public agcm z;

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.h = new Object();
        this.i = new Object();
        this.k = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.K = 30;
        this.l = 5000000;
        this.p = new Object();
        this.q = Collections.newSetFromMap(new WeakHashMap());
        this.r = false;
        this.O = 6;
        this.M = context;
        inflate(context, R.layout.camera_view, this);
        this.N = anfq.h(this.z.a.a(), yml.f, angq.a);
    }

    static final boolean N(Camera camera, String str) {
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            return (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) ? false : true;
        } catch (Exception e) {
            zga.n("Error while getting camera parameters.", e);
            return false;
        }
    }

    public static final Rect O(RectF rectF) {
        Rect rect = new Rect();
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
        return rect;
    }

    public static final RectF P(Rect rect) {
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    private static Rect U(float f, float f2, float f3, int i, int i2) {
        double d = (f / i) * 2000.0f;
        Double.isNaN(d);
        int i3 = (int) (d - 1000.0d);
        double d2 = (f2 / i2) * 2000.0f;
        Double.isNaN(d2);
        int i4 = (int) (d2 - 1000.0d);
        int round = Math.round(f3 * 200.0f) / 2;
        return new Rect(Math.min(Math.max(-1000, i3 - round), 1000), Math.min(Math.max(-1000, i4 - round), 1000), Math.min(Math.max(-1000, i3 + round), 1000), Math.min(Math.max(-1000, i4 + round), 1000));
    }

    private final void V(String str) {
        if (this.f) {
            zga.c("PresetFilterDebug", str);
        }
    }

    private final void W() {
        ynm.m(this.z.a.b(new fnz(this.F == this.G ? 0 : 1, 5), angq.a), lra.q);
    }

    private final void X() {
        this.j.getClass();
        CamcorderProfile h = h(true);
        int i = h.videoFrameWidth;
        int i2 = h.videoFrameHeight;
        int i3 = (this.x.d + 90) % 180;
        int i4 = i3 == 0 ? i : i2;
        if (i3 == 0) {
            i = i2;
        }
        this.j.e(this.c, i, i4);
        V("CameraView::videoEffectPipelineDrishti.setPrimaryTargetAvailable");
    }

    private final void Y() {
        CamcorderProfile X = wcy.X(this.F, 20, this.O);
        if (X == null) {
            zga.b("Failed to determine camera profile.");
        } else {
            this.x.f(this.F, X.videoFrameWidth, X.videoFrameHeight, Math.min(X.videoFrameRate, this.K));
        }
    }

    public static int f(float f, int i, int i2) {
        return Math.min(i, Math.max(0, ((int) (i * f)) + i2));
    }

    public static /* synthetic */ void l(Throwable th) {
        zga.d("Error calling setCameraFacing() in ProtoDataStore", th);
    }

    public final void A(vwb vwbVar, int i, long j, long j2, zmu zmuVar) {
        this.I = 0;
        this.f174J = 0;
        if (!H()) {
            zga.b("Camera is not ready for recording.");
            return;
        }
        if (this.x.a() != null) {
            CamcorderProfile h = h(false);
            if (h == null) {
                zga.b("No camcorder profile. Did you forget to call prepareRecord?");
                return;
            }
            this.k = -1;
            r(false);
            this.t = zmuVar;
            zmv zmvVar = this.g;
            zmvVar.N = this.A;
            zmvVar.f281J = this.n;
            int i2 = this.x.c;
            int i3 = h.videoFrameWidth;
            int i4 = h.videoFrameHeight;
            float min = Math.min(h.videoFrameRate, this.K);
            int g = g();
            zmvVar.m = i2;
            zmvVar.n = i;
            zmvVar.o = i3;
            zmvVar.p = i4;
            zmvVar.q = min;
            amkq.N(j == 0 || j > 0);
            amkq.N(j2 == 0 || j2 > 0);
            if (j != 0 && j2 != 0) {
                amkq.N(j <= j2);
            }
            zmvVar.y = j;
            zmvVar.z = j2;
            zmvVar.f = vwbVar;
            zmvVar.K = this;
            zmvVar.I = g;
            zmvVar.C = ((float) TimeUnit.SECONDS.toNanos(1L)) / min;
            zmvVar.G = null;
            zmvVar.w = true;
            zmvVar.v = false;
            zmvVar.E = 0;
            zmvVar.F = 0;
            if (zmvVar.M) {
                zmvVar.h(0);
            }
            zmvVar.s = new Thread(zmvVar, "editRecordVideo");
            zmvVar.s.start();
            m();
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                ((zng) it.next()).mn();
            }
            return;
        }
        zga.b("Camera not active.");
    }

    public final void B() {
        synchronized (this.h) {
            zmv zmvVar = this.g;
            if (zmvVar != null) {
                if (zmvVar.w) {
                    C(0);
                }
                zmv zmvVar2 = this.g;
                synchronized (zmvVar2) {
                    if (zmvVar2.w) {
                        zmvVar2.L = 1;
                        zmvVar2.f();
                        zmvVar2.j(6);
                    } else if (zmvVar2.a > 0) {
                        zmvVar2.j(6);
                    }
                }
                zmi zmiVar = zmvVar2.e;
                if (zmiVar != null) {
                    zmiVar.d();
                    zmvVar2.e.b();
                    zmvVar2.e = null;
                }
                this.g = null;
            }
        }
        synchronized (this.p) {
            this.o = true;
        }
        this.x.a();
        final zrs zrsVar = this.j;
        this.C.queueEvent(new Runnable() { // from class: zna
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                zrs zrsVar2 = zrsVar;
                if (!cameraView.v) {
                    cameraView.E();
                }
                cameraView.x.d();
                cameraView.x.c(null);
                if (cameraView.v) {
                    synchronized (cameraView.i) {
                        if (zrsVar2 == cameraView.j) {
                            cameraView.E();
                        } else {
                            zga.l("VideoEffectPipeline tearDown completed before stop");
                        }
                    }
                }
                vtu vtuVar = cameraView.b;
                if (vtuVar != null) {
                    vtuVar.b();
                    cameraView.b = null;
                }
                SurfaceTexture surfaceTexture = cameraView.c;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, new int[]{cameraView.d}, 0);
                }
                synchronized (cameraView.p) {
                    cameraView.o = false;
                    cameraView.p.notifyAll();
                }
            }
        });
        final boolean[] zArr = new boolean[1];
        this.C.onPause();
        this.C.queueEvent(new Runnable() { // from class: znb
            @Override // java.lang.Runnable
            public final void run() {
                boolean[] zArr2 = zArr;
                int i = CameraView.B;
                synchronized (zArr2) {
                    zArr2[0] = true;
                    zArr2.notify();
                }
            }
        });
        int[] iArr = {100, 250, 500, 1000, 3000};
        synchronized (zArr) {
            for (int i = 0; i < 5; i++) {
                if (zArr[0]) {
                    break;
                }
                zArr.wait(iArr[i]);
            }
        }
    }

    public final void C(int i) {
        if (I()) {
            this.g.e(i);
        } else {
            zga.l("stopRecord called but camera is not recording.");
        }
    }

    @Override // defpackage.znh
    public final void D(int i) {
        if (i != 1) {
            i = 0;
        }
        amkq.H(true, "cameraDirection must be one of @CameraDirection values; was %s.", i);
        if (J()) {
            if (i == 0 && this.F == this.G) {
                return;
            }
            if (i == 1 && this.F == this.H) {
                return;
            }
            this.x.d();
            int i2 = this.x.g;
            int i3 = this.G;
            if (i2 == i3) {
                i3 = this.H;
            }
            this.F = i3;
            W();
            Y();
            znf znfVar = this.L;
            if (znfVar != null) {
                hkt hktVar = (hkt) znfVar;
                hktVar.k = 1 == i;
                if (i != 0) {
                    hktVar.i = false;
                    hktVar.g.L(false);
                }
                hktVar.b();
            }
        }
    }

    public final void E() {
        zrs zrsVar = this.j;
        if (zrsVar != null) {
            zrsVar.h();
            this.j.i();
            this.j = null;
        }
    }

    @Override // defpackage.znh
    public final boolean F() {
        return this.e;
    }

    @Override // defpackage.znh
    public final boolean G() {
        Camera a = this.x.a();
        if (a == null) {
            return false;
        }
        return N(a, "torch") || this.F == this.H;
    }

    public final boolean H() {
        zmv zmvVar = this.g;
        return (zmvVar == null || zmvVar.w) ? false : true;
    }

    @Override // defpackage.znh
    public final boolean I() {
        zmv zmvVar = this.g;
        return zmvVar != null && zmvVar.w;
    }

    @Override // defpackage.znh
    public final boolean J() {
        if (this.G < 0 || this.H < 0) {
            return false;
        }
        zmv zmvVar = this.g;
        return zmvVar == null || !zmvVar.w;
    }

    public final boolean K(Camera camera, String str) {
        if (camera != null && (N(camera, str) || this.F != this.G)) {
            if (!N(camera, str) && this.F == this.H) {
                return "torch".equals(str) || "off".equals(str);
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode(str);
                camera.setParameters(parameters);
                return true;
            } catch (Exception e) {
                zga.n("Error while setting camera flash light mode", e);
            }
        }
        return false;
    }

    public final boolean M() {
        if (this.x.a() == null) {
            return false;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.F, cameraInfo);
        return !cameraInfo.canDisableShutterSound;
    }

    public final void Q() {
        this.D = true;
    }

    public final aezk R() {
        Camera a = this.x.a();
        if (a == null) {
            return null;
        }
        Camera.Size previewSize = a.getParameters().getPreviewSize();
        aezk aezkVar = new aezk();
        aezkVar.a = previewSize.height;
        aezkVar.b = previewSize.width;
        return aezkVar;
    }

    @Override // defpackage.zsc
    public final void a(SurfaceTexture surfaceTexture, int i) {
        V("CameraView::onPipelineSourceSurfaceCreated");
        this.x.c(surfaceTexture);
    }

    @Override // defpackage.zmu
    public final void aO(final zog zogVar, final int i) {
        post(new Runnable() { // from class: zmz
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                zog zogVar2 = zogVar;
                int i2 = i;
                cameraView.a.setVisibility(8);
                for (zng zngVar : cameraView.q) {
                    zngVar.d();
                    zngVar.mr();
                }
                if (cameraView.u) {
                    cameraView.r(true);
                }
                zmu zmuVar = cameraView.t;
                if (zmuVar != null) {
                    zmuVar.aO(zogVar2, i2);
                }
            }
        });
    }

    @Override // defpackage.zmm
    public final void b() {
        post(new Runnable() { // from class: zmw
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = CameraView.this.q.iterator();
                while (it.hasNext()) {
                    ((zng) it.next()).a();
                }
            }
        });
    }

    @Override // defpackage.zmm
    public final void c(final Camera camera) {
        if (this.j != null) {
            X();
        }
        post(new Runnable() { // from class: zmx
            @Override // java.lang.Runnable
            public final void run() {
                CameraView cameraView = CameraView.this;
                Camera camera2 = camera;
                if (cameraView.e) {
                    cameraView.K(camera2, "torch");
                }
                Iterator it = cameraView.q.iterator();
                while (it.hasNext()) {
                    ((zng) it.next()).b();
                }
            }
        });
    }

    @Override // defpackage.znh
    public final int g() {
        return this.F == this.H ? 1 : 0;
    }

    @Override // defpackage.znh
    public final void i(zng zngVar) {
        this.q.add(zngVar);
    }

    public final void j(float f) {
        Camera.Parameters j;
        Camera a = this.x.a();
        if (a == null || (j = this.x.j(a)) == null || !j.isZoomSupported()) {
            return;
        }
        float f2 = -1.0f;
        float f3 = f - 1.0f;
        if (Math.abs(f3) >= 0.001f) {
            int zoom = j.getZoom();
            int maxZoom = j.getMaxZoom();
            float f4 = f3 * maxZoom;
            if (Math.abs(f4) >= 1.0f) {
                f2 = f4;
            } else if (f4 > 0.0f) {
                f2 = 1.0f;
            }
            v(a, j, Math.max(0, Math.min(maxZoom, Math.round(zoom + f2))), maxZoom, true);
        }
    }

    public final void k(float f, float f2, zne zneVar) {
        List<String> supportedFocusModes;
        Camera a = this.x.a();
        if (a == null) {
            return;
        }
        try {
            Camera.Parameters parameters = a.getParameters();
            String focusMode = parameters.getFocusMode();
            int i = this.x.d;
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, this.F == this.H ? -1.0f : 1.0f);
            matrix.postRotate(360 - i);
            try {
                a.cancelAutoFocus();
                if (parameters.getMaxNumFocusAreas() > 0) {
                    ArrayList arrayList = new ArrayList();
                    RectF P = P(U(f, f2, 1.0f, this.C.getWidth(), this.C.getHeight()));
                    matrix.mapRect(P);
                    arrayList.add(new Camera.Area(O(P), 800));
                    parameters.setFocusAreas(arrayList);
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    RectF P2 = P(U(f, f2, 1.5f, this.C.getWidth(), this.C.getHeight()));
                    matrix.mapRect(P2);
                    arrayList2.add(new Camera.Area(O(P2), 800));
                    parameters.setMeteringAreas(arrayList2);
                }
                boolean z = false;
                if (parameters != null && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                    z = true;
                }
                if (z) {
                    parameters.setFocusMode("auto");
                }
                a.setParameters(parameters);
                if ((parameters.getMaxNumFocusAreas() > 0 || parameters.getMaxNumMeteringAreas() > 0) && zneVar != null) {
                    zneVar.a((int) f, (int) f2);
                }
                if (z) {
                    a.autoFocus(new znc(focusMode));
                }
            } catch (RuntimeException unused) {
                zga.b("error setting camera parameters");
            }
        } catch (RuntimeException unused2) {
        }
    }

    public final void m() {
        Camera a = this.x.a();
        if (a != null && this.e && this.F == this.H && !N(a, "torch")) {
            this.a.setVisibility(0);
            Iterator it = this.q.iterator();
            while (it.hasNext()) {
                ((zng) it.next()).ms();
            }
        }
    }

    @Override // defpackage.znh
    public final void n(zng zngVar) {
        this.q.remove(zngVar);
    }

    public final void o(float f) {
        Camera.Parameters j;
        Camera a = this.x.a();
        if (a == null || (j = this.x.j(a)) == null || !j.isZoomSupported()) {
            return;
        }
        int maxZoom = j.getMaxZoom();
        v(a, j, f(f, maxZoom, 0), maxZoom, false);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int[] iArr;
        int[] iArr2;
        int i;
        int i2;
        int i3;
        zmv zmvVar = this.g;
        if (zmvVar != null && zmvVar.w) {
            synchronized (zmvVar.j) {
                while (zmvVar.i) {
                    try {
                        zmvVar.j.wait();
                    } catch (InterruptedException unused) {
                        zga.b("TextureLock waiting interrupted.");
                    }
                }
            }
        }
        this.c.updateTexImage();
        final zmv zmvVar2 = this.g;
        if (zmvVar2 != null && zmvVar2.w) {
            final SurfaceTexture surfaceTexture = this.c;
            final int i4 = this.d;
            synchronized (zmvVar2) {
                if (zmvVar2.m() && surfaceTexture.getTimestamp() > 0) {
                    zmvVar2.i = true;
                    zmvVar2.E++;
                    zmvVar2.t.post(new Runnable() { // from class: zms
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5;
                            int i6;
                            MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator;
                            zmv zmvVar3 = zmv.this;
                            SurfaceTexture surfaceTexture2 = surfaceTexture;
                            int i7 = i4;
                            zmvVar3.b.b(0L);
                            long timestamp = surfaceTexture2.getTimestamp();
                            long j = zmvVar3.x;
                            if (j < 0) {
                                zmvVar3.x = timestamp;
                                zmvVar3.B = 0L;
                                j = timestamp;
                            }
                            long j2 = zmvVar3.B;
                            float f = zmvVar3.r;
                            long j3 = ((float) (j2 - j)) / f;
                            long j4 = ((float) (zmvVar3.A - j)) / f;
                            long abs = Math.abs((j4 - j3) - zmvVar3.C);
                            long abs2 = Math.abs(((((float) (timestamp - j)) / f) - j3) - zmvVar3.C);
                            if (j4 == 0 || (zmvVar3.A >= zmvVar3.x && abs < abs2)) {
                                zmvVar3.d();
                            }
                            float[] fArr = new float[16];
                            surfaceTexture2.getTransformMatrix(fArr);
                            float f2 = (fArr[0] * fArr[5]) - (fArr[1] * fArr[4]);
                            boolean z = !zmvVar3.H && f2 > 0.0f;
                            if (f2 > 0.0f) {
                                amkq.N(zmvVar3.l >= 0);
                                i5 = zmvVar3.l;
                            } else {
                                amkq.N(zmvVar3.k >= 0);
                                i5 = zmvVar3.k;
                            }
                            if (z) {
                                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
                                android.opengl.Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
                            }
                            if (f2 > 0.0f) {
                                i6 = ((zmvVar3.n - i5) + 360) % 360;
                                if (z) {
                                    i6 = (i6 + 180) % 360;
                                }
                            } else {
                                i6 = (zmvVar3.n + i5) % 360;
                            }
                            int i8 = i6 == 180 ? 270 : 90;
                            float[] fArr2 = new float[16];
                            android.opengl.Matrix.setIdentityM(fArr2, 0);
                            android.opengl.Matrix.setRotateM(fArr2, 0, i8, 0.0f, 0.0f, 1.0f);
                            zmvVar3.h.a(i7, fArr2, fArr);
                            zmvVar3.A = surfaceTexture2.getTimestamp();
                            long c = zmvVar3.c();
                            heg hegVar = zmvVar3.N;
                            if (hegVar != null && (multiSegmentCameraProgressIndicator = hegVar.a.aA) != null && c >= 0) {
                                multiSegmentCameraProgressIndicator.d((int) c);
                            }
                            if (zmvVar3.a == 3 && c >= zmvVar3.y) {
                                zmvVar3.h(4);
                            }
                            if (zmvVar3.v || zmvVar3.l(c)) {
                                zmvVar3.e(0);
                            }
                            zmvVar3.g();
                        }
                    });
                }
            }
            this.I++;
        }
        float[] fArr = new float[16];
        this.c.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        try {
            this.b.a(this.d, fArr2, fArr);
        } catch (RuntimeException e) {
            zga.d("Error render texture ", e);
        }
        if (this.m != null) {
            int i5 = this.d;
            int[] iArr3 = new int[4];
            GLES20.glGetIntegerv(2978, iArr3, 0);
            Camera.Size previewSize = this.x.a().getParameters().getPreviewSize();
            int i6 = previewSize.height;
            int i7 = previewSize.width;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i6 * i7 * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            int[] iArr4 = new int[1];
            int[] iArr5 = new int[1];
            try {
                vlu.d("glGenFramebuffers");
                GLES20.glGenTextures(1, iArr5, 0);
                i3 = iArr5[0];
                GLES20.glActiveTexture(33984);
                vlu.d("glActiveTexture");
                GLES20.glBindTexture(3553, i3);
                vlu.d("glBindTexture");
                iArr2 = iArr4;
            } catch (Throwable th) {
                th = th;
                iArr = iArr5;
                iArr2 = iArr4;
            }
            try {
                GLES20.glTexImage2D(3553, 0, 6408, i6, i7, 0, 6408, 5121, null);
                vlu.d("glTexImage2D");
                GLES20.glGenFramebuffers(1, iArr2, 0);
                GLES20.glBindFramebuffer(36160, iArr2[0]);
                vlu.d("glBindFramebuffer");
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                vlu.d("glFramebufferTexture2D");
                int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                if (glCheckFramebufferStatus != 36053) {
                    iArr = iArr5;
                    i = 36160;
                    i2 = 3553;
                    try {
                        String valueOf = String.valueOf(this);
                        int glGetError = GLES20.glGetError();
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
                        sb.append(valueOf);
                        sb.append(": Failed to set up render buffer with status ");
                        sb.append(glCheckFramebufferStatus);
                        sb.append(" and error ");
                        sb.append(glGetError);
                        throw new RuntimeException(sb.toString());
                    } catch (Throwable th2) {
                        th = th2;
                        GLES20.glBindFramebuffer(i, 0);
                        vlu.e("glBindFramebuffer");
                        GLES20.glDeleteFramebuffers(1, iArr2, 0);
                        vlu.e("glDeleteFramebuffers");
                        GLES20.glBindTexture(i2, 0);
                        vlu.e("glBindTexture");
                        GLES20.glDeleteTextures(1, iArr, 0);
                        vlu.e("glDeleteTextures");
                        GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                        throw th;
                    }
                }
                GLES20.glViewport(0, 0, i6, i7);
                this.b.a(i5, fArr2, fArr);
                i = 36160;
                try {
                    GLES20.glReadPixels(0, 0, i6, i7, 6408, 5121, allocateDirect);
                    vlu.d("glReadPixels");
                    GLES20.glBindFramebuffer(36160, 0);
                    vlu.e("glBindFramebuffer");
                    GLES20.glDeleteFramebuffers(1, iArr2, 0);
                    vlu.e("glDeleteFramebuffers");
                    GLES20.glBindTexture(3553, 0);
                    vlu.e("glBindTexture");
                    GLES20.glDeleteTextures(1, iArr5, 0);
                    vlu.e("glDeleteTextures");
                    GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                    Bitmap createBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f, -1.0f);
                    final Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                    final znd zndVar = this.m;
                    this.m = null;
                    post(new Runnable() { // from class: zmy
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraView cameraView = CameraView.this;
                            znd zndVar2 = zndVar;
                            Bitmap bitmap = createBitmap2;
                            Iterator it = cameraView.q.iterator();
                            while (it.hasNext()) {
                                ((zng) it.next()).mr();
                            }
                            ((htl) zndVar2).aJ(bitmap, false);
                            bitmap.recycle();
                        }
                    });
                } catch (Throwable th3) {
                    th = th3;
                    iArr = iArr5;
                    i2 = 3553;
                    GLES20.glBindFramebuffer(i, 0);
                    vlu.e("glBindFramebuffer");
                    GLES20.glDeleteFramebuffers(1, iArr2, 0);
                    vlu.e("glDeleteFramebuffers");
                    GLES20.glBindTexture(i2, 0);
                    vlu.e("glBindTexture");
                    GLES20.glDeleteTextures(1, iArr, 0);
                    vlu.e("glDeleteTextures");
                    GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                iArr = iArr5;
                i = 36160;
                i2 = 3553;
                GLES20.glBindFramebuffer(i, 0);
                vlu.e("glBindFramebuffer");
                GLES20.glDeleteFramebuffers(1, iArr2, 0);
                vlu.e("glDeleteFramebuffers");
                GLES20.glBindTexture(i2, 0);
                vlu.e("glBindTexture");
                GLES20.glDeleteTextures(1, iArr, 0);
                vlu.e("glDeleteTextures");
                GLES20.glViewport(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int[] i = zmn.i();
        amkq.N(i[0] >= 0 || i[1] >= 0);
        int i2 = i[0];
        this.G = i2;
        int i3 = i[1];
        this.H = i3;
        this.F = i3;
        if (i2 >= 0 && ((Integer) ynm.g(this.N, 500L, TimeUnit.MILLISECONDS, Integer.valueOf(this.H))).intValue() == 0) {
            this.F = this.G;
        }
        this.x.i = this;
        GLSurfaceView gLSurfaceView = (GLSurfaceView) findViewById(R.id.camera_preview);
        this.C = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.C.setRenderer(this);
        this.C.setRenderMode(0);
        V("CameraView::surfaceView set Renderer");
        this.a = findViewById(R.id.camera_front_flash_torch_scrim);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.C.requestRender();
        zmv zmvVar = this.g;
        if (zmvVar == null || !zmvVar.w) {
            return;
        }
        this.f174J++;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.e = savedState.a;
        this.K = savedState.b;
        this.l = savedState.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.e;
        savedState.b = this.K;
        savedState.c = this.l;
        return savedState;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i;
        int i2;
        int i3;
        V("CameraView::on surfaceView SurfaceCreated");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        vlu.d("Couldn't generate textures.");
        GLES20.glBindTexture(36197, iArr[0]);
        vlu.d("Couldn't bind texture.");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        vlu.d("Couldn't set texture parameters.");
        int i4 = iArr[0];
        this.d = i4;
        this.c = new SurfaceTexture(i4);
        V("CameraView::created pipeline output surfaceTexture");
        this.c.setOnFrameAvailableListener(this);
        this.b = new vtu();
        if (this.G >= 0) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.G, cameraInfo);
            i = cameraInfo.orientation;
        } else {
            i = -1;
        }
        if (this.H >= 0) {
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(this.H, cameraInfo2);
            i2 = cameraInfo2.orientation;
        } else {
            i2 = -1;
        }
        CamcorderProfile h = h(true);
        if (h != null) {
            i3 = h.audioChannels;
        } else {
            zga.b("Couldn't find camcorder profile to prepare audio. Falling back to mono.");
            i3 = 1;
        }
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        String valueOf = String.valueOf(eglGetCurrentContext);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("EGLContext: CameraView::createCameraRecorder with EGLContext  ");
        sb.append(valueOf);
        V(sb.toString());
        zmv zmvVar = new zmv(eglGetCurrentContext, vum.a, this.r, i, i2, this.l, i3, this.M, this.s, ((Boolean) this.w.b.a.a.Y(axyz.d).B().aB()).booleanValue());
        synchronized (this.h) {
            this.g = zmvVar;
        }
        if (this.D) {
            if (!this.v) {
                E();
            }
            synchronized (this.i) {
                if (this.v) {
                    E();
                }
                Context context = getContext();
                EGLContext eglGetCurrentContext2 = EGL14.eglGetCurrentContext();
                String valueOf2 = String.valueOf(eglGetCurrentContext2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 73);
                sb2.append("EGLContext:CameraView::createVideoEffectPipelineDrishti with EGLContext  ");
                sb2.append(valueOf2);
                V(sb2.toString());
                zrs zrsVar = new zrs(context, this, eglGetCurrentContext2);
                this.j = zrsVar;
                boolean z = this.f;
                zrsVar.r = z;
                zpw zpwVar = zrsVar.i;
                if (zpwVar != null) {
                    zpwVar.H = z;
                    zpk zpkVar = zpwVar.c;
                    if (zpkVar != null) {
                        zpkVar.g = z;
                    }
                }
                zrsVar.E();
                zsq zsqVar = this.E;
                if (zsqVar != null) {
                    this.j.y(zsqVar);
                }
                this.j.j();
                V("CameraView::created and started videoEffectPipelineDrishti");
            }
            try {
                if (this.x.a() != null) {
                    X();
                    return;
                }
                return;
            } catch (RuntimeException unused) {
                zga.l("Error getting camera from the cameraManager");
                return;
            }
        }
        this.x.c(this.c);
    }

    @Override // defpackage.znh
    public final void p(znf znfVar) {
        this.L = znfVar;
    }

    public final void q(int i) {
        this.x.e(i);
    }

    public final void r(boolean z) {
        zrs zrsVar = this.j;
        if (zrsVar != null) {
            zrsVar.x(z);
        }
        zsq zsqVar = this.E;
        if (zsqVar != null) {
            ztd ztdVar = (ztd) zsqVar;
            ztdVar.d = z;
            ztdVar.h.b(z);
            ztdVar.q();
        }
    }

    public final void s(zsq zsqVar) {
        synchronized (this.i) {
            this.E = zsqVar;
            zrs zrsVar = this.j;
            if (zrsVar != null) {
                zrsVar.y(zsqVar);
            }
        }
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.C.setOnTouchListener(onTouchListener);
    }

    public final void t(int i, int i2) {
        yny.B(this.C, i, i2);
        yny.B(this.a, i, i2);
    }

    public final void u(int i) {
        amkq.N(this.x.a() == null);
        this.O = i;
    }

    public final void v(Camera camera, Camera.Parameters parameters, int i, int i2, boolean z) {
        parameters.setZoom(i);
        try {
            camera.setParameters(parameters);
            heg hegVar = this.y;
            if (hegVar != null) {
                float f = i / i2;
                ShortsZoomSlider shortsZoomSlider = hegVar.a.aG;
                if (shortsZoomSlider != null) {
                    boolean z2 = !z;
                    shortsZoomSlider.setProgress(Math.min(1000, (int) (f * 1000.0f)));
                    if (z2) {
                        shortsZoomSlider.b(0.3f);
                    }
                }
            }
        } catch (Exception e) {
            zga.n("Error while setting camera parameters.", e);
        }
    }

    public final void w() {
        x(g());
    }

    public final void x(int i) {
        if (i != 1) {
            i = 0;
        }
        amkq.H(true, "cameraDirection must be one of @CameraDirection values; was %s.", i);
        synchronized (this.p) {
            while (this.o) {
                try {
                    this.p.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.F = i == 1 ? this.H : this.G;
        W();
        Y();
        this.C.onResume();
    }

    public final void y() {
        synchronized (this.h) {
            zmv zmvVar = this.g;
            if (zmvVar == null) {
                zga.b("Recorder has not been initialized.");
                return;
            }
            synchronized (zmvVar) {
                if (zmvVar.a == 2) {
                    zmvVar.i();
                }
            }
        }
    }

    public final void z(vwb vwbVar, int i, zmu zmuVar) {
        A(vwbVar, i, 0L, 0L, zmuVar);
    }

    @Override // defpackage.znh
    public final boolean L(boolean z) {
        if (z == this.e) {
            return true;
        }
        if (z) {
            if (K(this.x.a(), "torch")) {
                this.e = true;
                return true;
            }
        } else if (K(this.x.a(), "off")) {
            this.e = false;
            return true;
        }
        return false;
    }

    public final CamcorderProfile h(boolean z) {
        int i;
        if (!z || (i = this.G) < 0 || this.H < 0) {
            return wcy.X(this.F, 20, this.O);
        }
        CamcorderProfile X = wcy.X(i, 20, this.O);
        CamcorderProfile X2 = wcy.X(this.H, 20, this.O);
        if (X == null) {
            return X2;
        }
        if (X2 == null) {
            return X;
        }
        return (X.videoFrameRate < 20 || X2.videoFrameRate >= 20) ? ((X2.videoFrameRate < 20 || X.videoFrameRate >= 20) && X.videoFrameWidth * X.videoFrameHeight >= X2.videoFrameWidth * X2.videoFrameHeight) ? X : X2 : X;
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new xes(14);
        boolean a;
        int b;
        int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}

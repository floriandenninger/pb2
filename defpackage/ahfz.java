package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.os.Vibrator;
import com.google.vr.sdk.base.Eye;
import com.google.vr.sdk.base.FieldOfView;
import com.google.vr.sdk.base.GvrView;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.HeadTransform;
import com.google.vr.sdk.base.Viewport;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.microedition.khronos.egl.EGLConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfz implements GvrView.StereoRenderer, ahks {
    public static final GvrViewerParams a = new GvrViewerParams();
    public final ahir b;
    public ahkw e;
    public ahfy f;
    public ahhi g;
    public ahhm h;
    public boolean i;
    boolean j;
    public volatile boolean k;
    public int l;
    private final ahic m;
    private final float[] n;
    private boolean s;
    private ahkp t;
    private float u;
    private final float[] o = new float[16];
    private final float[] p = new float[16];
    private final float[] q = new float[16];
    public final Queue c = new ConcurrentLinkedQueue();
    private final float[] r = new float[3];
    public azrw d = umy.o;
    private int v = 16;
    private int w = 9;

    public ahfz(Context context) {
        float[] fArr = new float[16];
        this.n = fArr;
        context.getClass();
        this.m = new ahic(context);
        this.b = new ahir(amlo.a, (Vibrator) context.getSystemService("vibrator"), context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0);
        Matrix.setLookAtM(fArr, 0, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    private final void e() {
        while (!this.c.isEmpty()) {
            ((Runnable) this.c.remove()).run();
        }
    }

    private final void f(ahkr ahkrVar) {
        ahkw ahkwVar = this.e;
        if (ahkwVar != null) {
            ((ahhc) ahkwVar).i(ahkrVar);
        }
    }

    private final void g() {
        if (ahkt.i(this.u, this.b.a())) {
            return;
        }
        this.u = this.b.a();
        float tan = (float) Math.tan(r0 / 2.0f);
        int i = this.v;
        int i2 = this.w;
        float f = i > i2 ? tan : (i * tan) / i2;
        if (i >= i2) {
            tan = (tan * i2) / i;
        }
        Matrix.frustumM(this.o, 0, (-f) * 0.1f, f * 0.1f, (-tan) * 0.1f, tan * 0.1f, 0.1f, 20000.0f);
        this.t = new ahkp(f, tan, f, tan);
    }

    public final void a() {
        this.m.b();
    }

    @Override // defpackage.ahks
    public final void b(Runnable runnable) {
        throw null;
    }

    public final void c(boolean z) {
        this.s = z;
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r5 = this;
            int r0 = r5.l
            r1 = 0
            r2 = 1
            r3 = 3
            if (r0 == r3) goto L11
            boolean r3 = r5.j
            if (r3 == 0) goto Lf
            r3 = 2
            if (r0 != r3) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            boolean r3 = r5.s
            if (r3 != 0) goto L19
            if (r0 != 0) goto L24
            r0 = 0
        L19:
            ahic r3 = r5.m
            boolean r4 = r3.c
            if (r4 == 0) goto L22
            r3.b()
        L22:
            if (r0 == 0) goto L6f
        L24:
            boolean r0 = r5.s
            if (r0 != 0) goto L6f
            ahic r0 = r5.m
            boolean r3 = r0.c
            if (r3 != 0) goto L6f
            r3 = -1
            r0.k = r3
            r3 = 0
            r0.e = r3
            r0.f = r3
            r0.g = r3
            r0.h = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.i = r1
            java.lang.Object r1 = r0.n
            monitor-enter(r1)
            com.google.vr.sdk.base.sensors.internal.GyroscopeBiasEstimator r3 = r0.o     // Catch: java.lang.Throwable -> L6c
            r3.reset()     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            android.hardware.SensorEventListener r1 = r0.b
            if (r1 != 0) goto L53
            ahia r1 = new ahia
            r1.<init>(r0)
            r0.b = r1
        L53:
            java.lang.Thread r1 = new java.lang.Thread
            ahib r3 = new ahib
            r3.<init>(r0)
            java.lang.String r4 = "glOrientationSensor"
            r1.<init>(r3, r4)
            r0.a(r2)
            r0.c = r2
            r1.start()
            ahic r0 = r5.m
            r0.j = r2
            return
        L6c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfz.d():void");
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onDrawEye(Eye eye) {
        float[] fArr;
        ahkp ahkpVar;
        eye.getClass();
        if (this.g != null) {
            Matrix.multiplyMM(this.q, 0, eye.getEyeView(), 0, this.n, 0);
            if (eye.getType() != 0) {
                fArr = eye.getPerspective(0.1f, 20000.0f);
                FieldOfView fov = eye.getFov();
                ahkpVar = new ahkp(fov.getLeft(), fov.getTop(), fov.getRight(), fov.getBottom());
            } else {
                fArr = this.o;
                ahkpVar = this.t;
            }
            try {
                this.g.qC(new ahko(this.s ? this.q : this.p, fArr, ahkpVar, eye, (GvrViewerParams) this.d.get()));
            } catch (ahkr e) {
                f(e);
            }
        }
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onFinishFrame(Viewport viewport) {
        viewport.getClass();
        try {
            ahkt.f();
        } catch (ahkr e) {
            f(e);
        }
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onNewFrame(HeadTransform headTransform) {
        e();
        headTransform.getClass();
        if (this.g == null && this.h == null) {
            return;
        }
        g();
        if (this.s) {
            headTransform.getHeadView(this.p, 0);
        } else if (this.j || this.l != 2) {
            ahic ahicVar = this.m;
            float[] fArr = this.r;
            fArr[0] = anaf.al(ahicVar.e, -1.5707964f, 1.5707964f);
            fArr[1] = ahicVar.f;
            fArr[2] = ahicVar.j ? ahicVar.g : 0.0f;
            if (this.i) {
                this.i = false;
                ahir ahirVar = this.b;
                float[] fArr2 = this.r;
                float f = fArr2[0];
                float f2 = fArr2[1];
                float al = anaf.al(f, -1.5707964f, 1.5707964f);
                ahirVar.t = -al;
                ahirVar.u = -f2;
                ahirVar.v = al;
                ahirVar.w = f2;
            }
            ahir ahirVar2 = this.b;
            float[] fArr3 = this.r;
            float f3 = fArr3[0];
            float f4 = fArr3[1];
            float f5 = fArr3[2];
            int i = this.l;
            long a2 = ahirVar2.a.a();
            boolean z = (ahirVar2.k || ((float) (a2 - ahirVar2.A)) * 1.0E-9f >= 10.0f || (ahkt.k(ahirVar2.y) && ahkt.k(ahirVar2.z))) ? false : true;
            if (z) {
                float exp = ((1.0f - ((float) Math.exp(r13 * (-3.8f)))) / 3.8f) - ((1.0f - ((float) Math.exp((((float) (ahirVar2.B - ahirVar2.A)) * 1.0E-9f) * (-3.8f)))) / 3.8f);
                ahirVar2.t += ahirVar2.y * exp;
                ahirVar2.u += ahirVar2.z * exp;
                ahirVar2.B = a2;
            }
            float a3 = ((float) (ahirVar2.a.a() - ahirVar2.s)) * 1.0E-9f;
            float al2 = (ahkt.k(2.0f) || a3 >= 2.0f) ? 0.0f : anaf.al(1.0f - (a3 / 2.0f), 0.0f, 1.0f);
            float f6 = ahirVar2.t;
            float f7 = ahirVar2.v;
            ahirVar2.t = f6 + ((f7 - f3) * al2);
            if (!z && al2 == 0.0f) {
                float min = Math.min(Math.abs(f3 - f7), (float) Math.toRadians(1.0d)) * 0.1f;
                if (Math.abs(ahirVar2.t) < min) {
                    ahirVar2.t = 0.0f;
                } else {
                    float f8 = ahirVar2.t;
                    ahirVar2.t = f8 - (Math.signum(f8) * min);
                }
            }
            ahirVar2.v = f3;
            ahirVar2.w = f4;
            ahirVar2.x = f5;
            if (i == 2) {
                float f9 = ahirVar2.u + f4;
                if (f9 > 0.62831855f) {
                    ahirVar2.u = 0.62831855f - f4;
                    if (ahirVar2.z > 0.0f) {
                        ahirVar2.z = 0.0f;
                    }
                } else if (f9 < -0.62831855f) {
                    ahirVar2.u = (-0.62831855f) - f4;
                    if (ahirVar2.z < 0.0f) {
                        ahirVar2.z = 0.0f;
                    }
                }
                ahirVar2.b(0.9424779f);
            } else {
                ahirVar2.b(1.5707964f);
            }
            if (!ahirVar2.c && !ahirVar2.k) {
                float f10 = ahirVar2.e;
                if ((f10 > 2.26894f || f10 < 0.78538996f) && a2 > ahirVar2.o) {
                    if (ahirVar2.j) {
                        ahirVar2.r = true;
                        ahirVar2.f(ahirVar2.q);
                        ahirVar2.j = false;
                    }
                    float f11 = ((float) (a2 - ahirVar2.o)) * 1.0E-9f;
                    float f12 = ahirVar2.e;
                    if (f12 > 2.26894f) {
                        f12 = Math.max(f12 - ((f11 / 0.1f) * 0.087249994f), 2.26893f);
                        ahirVar2.e = f12;
                    }
                    if (f12 < 0.78538996f) {
                        ahirVar2.e = Math.min(f12 + ((f11 / 0.1f) * 0.087249994f), 0.7854f);
                    }
                    ahirVar2.o = a2;
                }
            }
            ahir ahirVar3 = this.b;
            float f13 = ahirVar3.v;
            float f14 = ahirVar3.t;
            float f15 = ahirVar3.w;
            float f16 = ahirVar3.u;
            float f17 = ahirVar3.x;
            double cos = Math.cos(f13);
            Matrix.setIdentityM(this.p, 0);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f17 * ((float) cos)), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f13 + f14), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.p, 0, (float) Math.toDegrees(f15 + f16), 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(this.p, 0);
        }
        if (Double.isNaN(this.p[0])) {
            zga.b("New frame error: head view has NaN value");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ahhm ahhmVar = this.h;
        if (ahhmVar != null) {
            float[] fArr4 = this.p;
            if (uptimeMillis >= ahhmVar.g + 1000) {
                ahhmVar.g = uptimeMillis;
                float[][] fArr5 = ahhmVar.b;
                int i2 = ahhmVar.f;
                ahhmVar.f = i2 + 1;
                ahkt.m(fArr5[i2 % 10], fArr4);
                if (ahhmVar.f >= 10) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        float[] fArr6 = ahhmVar.c;
                        float[] fArr7 = ahhmVar.b[0];
                        fArr6[i3] = fArr7[i3];
                        ahhmVar.d[i3] = fArr7[i3];
                    }
                    for (int i4 = 1; i4 < 10; i4++) {
                        for (int i5 = 0; i5 < 3; i5++) {
                            float[] fArr8 = ahhmVar.b[i4];
                            float f18 = fArr8[i5];
                            float[] fArr9 = ahhmVar.c;
                            if (f18 < fArr9[i5]) {
                                fArr9[i5] = f18;
                            }
                            float f19 = fArr8[i5];
                            float[] fArr10 = ahhmVar.d;
                            if (f19 > fArr10[i5]) {
                                fArr10[i5] = f19;
                            }
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 < 3) {
                            if (ahhmVar.d[i6] - ahhmVar.c[i6] <= ahhm.a) {
                                i6++;
                            } else if (!ahhmVar.h) {
                                ahhmVar.h = true;
                                ahhmVar.e.a(true);
                            }
                        } else if (ahhmVar.h) {
                            ahhmVar.h = false;
                            ahhmVar.e.a(false);
                        }
                    }
                }
            }
        }
        ahhi ahhiVar = this.g;
        if (ahhiVar != null) {
            ahjq ahjqVar = new ahjq(this.p, uptimeMillis, null);
            if (ahhiVar.d) {
                ahhiVar.d = false;
                ahhiVar.p(ahjqVar);
            }
            ahhiVar.qD(ahhiVar.r(ahjqVar), ahjqVar);
            ahhiVar.q(ahjqVar);
        }
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onRendererShutdown() {
        ahhi ahhiVar = this.g;
        if (ahhiVar != null) {
            ahhiVar.i();
            this.g = null;
        }
        this.m.b();
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onSurfaceChanged(int i, int i2) {
        this.v = i;
        this.w = i2;
        try {
            ahfy ahfyVar = this.f;
            if (ahfyVar != null) {
                ((ahhc) ahfyVar).h.a();
            }
        } catch (ahkr e) {
            f(e);
        }
        this.u = -1.0f;
        g();
    }

    @Override // com.google.vr.sdk.base.GvrView.StereoRenderer
    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.k = true;
        try {
            ahfy ahfyVar = this.f;
            if (ahfyVar != null) {
                ((ahhc) ahfyVar).k.getClass();
                try {
                    ((ahhc) ahfyVar).h.a();
                    ((ahhc) ahfyVar).m = new ahkm(((ahhc) ahfyVar).s, ((ahhc) ahfyVar).g, ((ahhc) ahfyVar).j, ((ahhc) ahfyVar).w / ((ahhc) ahfyVar).x, ((ahhc) ahfyVar).e, ((ahhc) ahfyVar).a());
                    ((ahhc) ahfyVar).n = ((ahhc) ahfyVar).m.b;
                    ((ahhc) ahfyVar).n.m(((ahhc) ahfyVar).h.c(), ((ahhc) ahfyVar).h.d(), ((ahhc) ahfyVar).h.a, ((ahhc) ahfyVar).B);
                    if (((ahhc) ahfyVar).v) {
                        ((ahhc) ahfyVar).c();
                    }
                    ((ahhc) ahfyVar).k.c(((ahhc) ahfyVar).v);
                    ahfz ahfzVar = ((ahhc) ahfyVar).k;
                    ahfzVar.h = ((ahhc) ahfyVar).l;
                    ahkm ahkmVar = ((ahhc) ahfyVar).m;
                    ahkmVar.getClass();
                    ahfzVar.g = ahkmVar;
                    ((ahhc) ahfyVar).o(((ahhc) ahfyVar).y, ((ahhc) ahfyVar).z);
                    if (((ahhc) ahfyVar).u) {
                        ((ahhc) ahfyVar).m();
                    }
                    ((ahhc) ahfyVar).m.m(((ahhc) ahfyVar).C);
                    ((ahhc) ahfyVar).m.b.j(((ahhc) ahfyVar).r);
                } catch (ahkr e) {
                    ((ahhc) ahfyVar).i(e);
                }
            }
        } catch (ahkr e2) {
            f(e2);
        }
        e();
    }
}

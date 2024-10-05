package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Display;
import android.view.WindowManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abse implements SurfaceTexture.OnFrameAvailableListener, abrr, zsc, zpu, zpv {
    static final FloatBuffer a = l(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    static final FloatBuffer c = l(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private boolean A;
    private volatile boolean B;
    private int C;
    private SurfaceTexture D;
    private int E;
    private final abvr F;
    public final abre d;
    public int e;
    public boolean f;
    public int g;
    public final EGLContext h;
    public boolean i;
    public arz j;
    public zrs k;
    public boolean m;
    public abrz n;
    private final absb o;
    private final absg p;
    private final absg q;
    private boolean r;
    private final float[] u;
    private SurfaceTexture w;
    private int x;
    private absf y;
    private absf z;
    private final float[] s = new float[16];
    private final float[] t = new float[16];
    private final float[] v = new float[16];
    public final Object l = new Object();

    public abse(absb absbVar, absg absgVar, absg absgVar2, abre abreVar, int i, EGLContext eGLContext) {
        float[] fArr = new float[16];
        this.u = fArr;
        absc abscVar = new absc(this);
        this.F = abscVar;
        this.o = absbVar;
        this.p = absgVar;
        this.q = absgVar2;
        this.d = abreVar;
        this.h = eGLContext;
        Matrix.setIdentityM(fArr, 0);
        g(i);
        abvt.b().f(asrx.class, abse.class, abscVar);
    }

    public static void i(Point point, boolean z) {
        float f;
        float f2;
        float f3 = point.x / point.y;
        if (z || !o(f3, 1.7777778f)) {
            if (z && o(f3, 0.5625f)) {
                return;
            }
            if ((z || (point.x > point.y && f3 > 1.7777778f)) && (!z || point.x >= point.y || f3 >= 0.5625f)) {
                if (z) {
                    f = point.y / 1.7777778f;
                } else {
                    f = point.y * 1.7777778f;
                }
                int i = (int) (f + 0.5f);
                if (i > point.x) {
                    int i2 = point.x;
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("New width is greater than original width: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                point.set(i, point.y);
                return;
            }
            if (!z) {
                f2 = point.x / 1.7777778f;
            } else {
                f2 = point.x * 1.7777778f;
            }
            int i3 = (int) (f2 + 0.5f);
            if (i3 > point.y) {
                int i4 = point.y;
                StringBuilder sb2 = new StringBuilder(68);
                sb2.append("New height is greater than original height: ");
                sb2.append(i3);
                sb2.append(", ");
                sb2.append(i4);
                throw new IllegalStateException(sb2.toString());
            }
            point.set(point.x, i3);
        }
    }

    static final absf k(absg absgVar) {
        return new absf(absgVar);
    }

    private static FloatBuffer l(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        return asFloatBuffer;
    }

    private final void m(SurfaceTexture surfaceTexture, int i, int i2, float f) {
        float b = b() / (i / i2);
        surfaceTexture.getTransformMatrix(this.s);
        p(this.e, 1.0f, 1.0f);
        Matrix.translateM(this.t, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(this.t, 0, f * Math.min(1.0f, 1.0f / b), Math.min(1.0f, b), 1.0f);
        Matrix.translateM(this.t, 0, -0.5f, -0.5f, 0.0f);
    }

    private final void n(int i, Set set, int i2, int i3, absf absfVar, FloatBuffer floatBuffer, boolean z) {
        absfVar.a(i3, i2);
        absf.g(i3, i2);
        absfVar.f("u_MVPMatrix", this.u);
        absfVar.f("u_TextureMatrix", this.t);
        absfVar.e("u_Grayscale", true != set.contains(abrq.a) ? 0.0f : 1.0f);
        absfVar.e("u_Darken", true != z ? 0.0f : 0.65f);
        absfVar.c("a_Position", a);
        absfVar.c("a_TextureCoord", floatBuffer);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glGetError();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(3089);
        GLES20.glScissor(0, 0, i, 1);
        GLES20.glClear(16384);
        GLES20.glDisable(3089);
        absfVar.b("a_Position");
        absfVar.b("a_TextureCoord");
        absf.h();
    }

    private static boolean o(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }

    private final void p(int i, float f, float f2) {
        Matrix.setIdentityM(this.v, 0);
        Matrix.translateM(this.v, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(this.v, 0, i, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.v, 0, -0.5f, -0.5f, 0.0f);
        Matrix.setIdentityM(this.u, 0);
        Matrix.translateM(this.u, 0, 0.0f, 0.0f, 0.0f);
        Matrix.scaleM(this.u, 0, f, f2, 1.0f);
        Matrix.multiplyMM(this.t, 0, this.s, 0, this.v, 0);
    }

    @Override // defpackage.zsc
    public final void a(SurfaceTexture surfaceTexture, int i) {
        this.E = i;
        this.D = surfaceTexture;
        this.o.i(surfaceTexture);
    }

    public final float b() {
        float f;
        float f2;
        abqs abqsVar = (abqs) this.o;
        int i = abqsVar.c;
        int i2 = abqsVar.d;
        if ((this.e + abqsVar.f) % 180 == 0) {
            f = i;
            f2 = i2;
        } else {
            f = i2;
            f2 = i;
        }
        return f / f2;
    }

    public final void c() {
        zrs zrsVar = this.k;
        if (zrsVar != null) {
            zrsVar.g(b());
        }
    }

    public final synchronized void d() {
        zrs zrsVar = this.k;
        if (zrsVar != null) {
            zrsVar.h();
        }
        abrz abrzVar = this.n;
        if (abrzVar != null) {
            abrzVar.d();
        }
    }

    public final synchronized void e() {
        if (this.w != null) {
            this.o.i(null);
            this.o.f();
            this.w.release();
            this.w = null;
        }
        int i = this.x;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.x = 0;
        }
        absf absfVar = this.y;
        if (absfVar != null) {
            absfVar.d();
            this.y = null;
        }
        absf absfVar2 = this.z;
        if (absfVar2 != null) {
            absfVar2.d();
            this.z = null;
        }
        zrs zrsVar = this.k;
        if (zrsVar != null) {
            zrsVar.i();
            this.k = null;
        }
        arz arzVar = this.j;
        if (arzVar != null) {
            arzVar.d();
            this.j = null;
        }
        synchronized (this.l) {
            this.m = true;
            this.l.notify();
        }
        abrz abrzVar = this.n;
        if (abrzVar != null) {
            abrzVar.h();
        }
        abvt.b().f(asrx.class, abse.class, null);
    }

    public final synchronized void f() {
        if (this.k != null && !this.B) {
            this.k.j();
        }
        abrz abrzVar = this.n;
        if (abrzVar != null) {
            abrzVar.f();
        }
    }

    public final synchronized void g(int i) {
        this.e = i;
        zrs zrsVar = this.k;
        if (zrsVar != null) {
            zrsVar.z(i);
            this.k.g(b());
        }
    }

    public final void j(Context context, zvk zvkVar, ztl ztlVar, boolean z, String str) {
        this.r = z;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        this.n = new abrz(zvkVar);
        new absd(this, context, str, point, z, ztlVar, zvkVar).execute(new Void[0]);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.g++;
        this.A = true;
        this.f = false;
        this.i = false;
        this.d.a();
    }

    @Override // defpackage.abrr
    public final synchronized void qQ(boolean z, int i, int i2, Set set) {
        float f;
        float f2;
        SurfaceTexture surfaceTexture;
        if (z) {
            if (this.x == 0) {
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(36197, iArr[0]);
                GLES20.glTexParameterf(36197, 10241, 9729.0f);
                GLES20.glTexParameterf(36197, 10240, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                adyu.cW("glTexParameter");
                int i3 = iArr[0];
                this.x = i3;
                amkq.N(i3 != 0);
                SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.x);
                this.w = surfaceTexture2;
                surfaceTexture2.setOnFrameAvailableListener(this);
                this.o.i(this.w);
                synchronized (this.l) {
                    this.j = arz.b();
                    this.l.notify();
                }
                this.C = this.j.a;
                this.y = k(this.p);
                this.z = k(this.q);
                this.f = true;
            }
            if (this.A && !this.B && !this.i) {
                this.w.updateTexImage();
                this.A = false;
            }
        } else if (this.x == 0) {
            return;
        }
        if (this.f) {
            return;
        }
        float f3 = i >= 0 ? 1.0f : -1.0f;
        int abs = Math.abs(i);
        if (this.i) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            float f4 = abs;
            float f5 = i2;
            float f6 = f4 / f5;
            if (this.B) {
                float f7 = this.r ? 0.5625f / f6 : 1.7777778f / f6;
                Matrix.setIdentityM(this.s, 0);
                p(0, 1.0f, 1.0f);
                f2 = Math.min(1.0f, 1.0f / f7);
                f = Math.min(1.0f, f7);
            } else {
                boolean z2 = this.r;
                float f8 = z2 ? 0.5625f / f6 : f6 / 1.7777778f;
                float f9 = true != z2 ? f8 : 1.0f;
                if (true != z2) {
                    f8 = 1.0f;
                }
                Matrix.setIdentityM(this.s, 0);
                p(0, f8, f9);
                f = 1.0f;
                f2 = 1.0f;
            }
            Matrix.translateM(this.t, 0, 0.5f, 0.5f, 0.0f);
            Matrix.scaleM(this.t, 0, f2 * f3, f, 1.0f);
            Matrix.translateM(this.t, 0, -0.5f, -0.5f, 0.0f);
            n(abs, set, this.C, 3553, this.z, c, false);
            if (!this.B && !this.r && f6 + 0.01f < 1.7777778f) {
                SurfaceTexture surfaceTexture3 = this.D;
                if (surfaceTexture3 != null) {
                    m(surfaceTexture3, abs, i2, f3);
                    Point point = new Point(abs, i2);
                    i(point, this.r);
                    int i4 = (i2 - point.y) / 2;
                    float f10 = i4 / f5;
                    GLES20.glViewport(0, 0, abs, i4);
                    n(abs, set, this.E, 36197, this.y, l(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, f10, 1.0f, f10}), true);
                    GLES20.glViewport(0, i2 - i4, abs, i4);
                    float f11 = 1.0f - f10;
                    n(abs, set, this.E, 36197, this.y, l(new float[]{0.0f, f11, 1.0f, f11, 0.0f, 1.0f, 1.0f, 1.0f}), true);
                    return;
                }
            } else if (!this.B && this.r && f6 - 0.01f > 0.5625f && (surfaceTexture = this.D) != null) {
                m(surfaceTexture, abs, i2, f3);
                Point point2 = new Point(abs, i2);
                i(point2, this.r);
                int i5 = (abs - point2.x) / 2;
                float f12 = i5 / f4;
                GLES20.glViewport(0, 0, i5, i2);
                n(abs, set, this.E, 36197, this.y, l(new float[]{0.0f, 0.0f, f12, 0.0f, 0.0f, 1.0f, f12, 1.0f}), true);
                GLES20.glViewport(abs - i5, 0, i5, i2);
                float f13 = 1.0f - f12;
                n(abs, set, this.E, 36197, this.y, l(new float[]{f13, 0.0f, 1.0f, 0.0f, f13, 1.0f, 1.0f, 1.0f}), true);
                return;
            }
            return;
        }
        m(this.w, abs, i2, f3);
        n(abs, set, this.x, 36197, this.y, c, false);
    }

    public final void h(boolean z) {
        boolean z2;
        synchronized (this) {
            this.B = z;
            z2 = true;
            if (!z) {
                this.A = true;
            }
            zrs zrsVar = this.k;
            if (zrsVar == null) {
                z2 = false;
            } else if (z) {
                zrsVar.h();
            } else {
                zrsVar.j();
            }
            abrz abrzVar = this.n;
            if (abrzVar != null) {
                if (!z) {
                    abrzVar.f();
                } else {
                    abrzVar.d();
                }
            }
        }
        if (z2) {
            this.d.a();
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afkr extends afla implements afky, afhb {
    private final Runnable a;
    private final Runnable b;
    private final Point c;
    protected final Handler d;
    public int e;
    public int f;
    public afkx g;
    private final afhc i;
    private int j;
    private int k;
    private Window l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;

    public afkr(Context context) {
        super(context);
        afhc afhcVar;
        Point point = new Point();
        this.c = point;
        this.o = -1.0f;
        ammv n = yjj.n(context);
        if (n.h()) {
            Window window = ((Activity) n.c()).getWindow();
            this.l = window;
            if (window != null) {
                this.m = window.getAttributes().screenBrightness == 1.0f;
            }
        }
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (point.y > point.x) {
                int i = point.y;
                point.y = point.x;
                point.x = i;
            }
        }
        this.a = new afkq(this, 2);
        this.b = new afkq(this, 1);
        if (afhl.a != null) {
            afhcVar = afhl.a;
        } else {
            afhl.a = new afhl(context.getApplicationContext());
            afhcVar = afhl.a;
        }
        this.i = afhcVar;
        this.d = new Handler(context.getMainLooper());
    }

    public SurfaceHolder B() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(View view, int i, int i2) {
        int i3 = this.e;
        int i4 = (i - i3) / 2;
        int i5 = this.f;
        int i6 = (i2 - i5) / 2;
        view.layout(i4, i6, i3 + i4, i5 + i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void H();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void I();

    public final void J(int i, int i2, int i3, int i4) {
        if ((this.n || this.m) && this.l != null) {
            if (i != 0 || i2 != 0 || ((i3 < this.c.x && i4 < this.c.y) || !this.n || K())) {
                if (this.m) {
                    WindowManager.LayoutParams attributes = this.l.getAttributes();
                    attributes.screenBrightness = -1.0f;
                    this.o = -1.0f;
                    this.l.setAttributes(attributes);
                    this.m = false;
                    afic aficVar = afic.ABR;
                    return;
                }
                return;
            }
            float f = ((afhl) this.i).f;
            float f2 = this.p;
            if (f2 > 1.0f) {
                float f3 = this.o;
                if (f3 == 1.0f) {
                    double d = f;
                    double d2 = f2;
                    Double.isNaN(d2);
                    if (d < d2 * 0.5d) {
                        this.o = -1.0f;
                    }
                }
                if (f3 != -1.0f || f <= f2) {
                    return;
                } else {
                    this.o = 1.0f;
                }
            } else if (this.o == 1.0f) {
                return;
            }
            afic aficVar2 = afic.ABR;
            WindowManager.LayoutParams attributes2 = this.l.getAttributes();
            attributes2.screenBrightness = this.o;
            this.l.setAttributes(attributes2);
            this.m = true;
        }
    }

    protected boolean K() {
        return false;
    }

    protected boolean L() {
        return true;
    }

    @Override // defpackage.afkl
    public final int c() {
        return this.k;
    }

    @Override // defpackage.afhb
    public final void d() {
        this.d.post(new afkq(this, 0));
    }

    @Override // defpackage.afkl
    public final int e() {
        return this.j;
    }

    @Override // defpackage.afky
    public /* synthetic */ SurfaceControl f() {
        return null;
    }

    @Override // defpackage.afky
    public final View h() {
        return this;
    }

    public /* synthetic */ bgv i() {
        return null;
    }

    public /* synthetic */ pkd j() {
        return null;
    }

    @Override // defpackage.afky
    public final void k() {
        M(this.a, this.b, 0);
    }

    @Override // defpackage.afkl
    public void l(Bitmap bitmap, ykl yklVar) {
        yklVar.a(bitmap, null);
    }

    @Override // defpackage.afky
    public final /* synthetic */ void m(Object obj) {
    }

    @Override // defpackage.afky
    public final void n(int i) {
        M(this.b, this.a, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (L()) {
            int defaultSize = getDefaultSize(this.j, i);
            int defaultSize2 = getDefaultSize(this.k, i2);
            int i4 = this.j;
            if (i4 > 0 && (i3 = this.k) > 0) {
                int i5 = i4 * defaultSize2;
                int i6 = defaultSize * i3;
                float f = (i5 / i6) - 1.0f;
                if (f > 0.01f) {
                    defaultSize2 = i6 / i4;
                } else if (f < -0.01f) {
                    defaultSize = i5 / i3;
                }
            }
            this.e = resolveSize(defaultSize, i);
            this.f = resolveSize(defaultSize2, i2);
        } else {
            this.f = View.MeasureSpec.getSize(i2);
            this.e = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(this.e, this.f);
    }

    @Override // defpackage.afky
    public final void p() {
    }

    @Override // defpackage.afky
    public /* synthetic */ void q() {
    }

    @Override // defpackage.afky
    public /* synthetic */ void r(boolean z, byte[] bArr, long j, long j2) {
    }

    @Override // defpackage.afkl
    public final int rF() {
        return this.f;
    }

    @Override // defpackage.afkl
    public final int rG() {
        return this.e;
    }

    @Override // defpackage.afky
    public final void s(afkx afkxVar) {
        this.g = afkxVar;
    }

    @Override // defpackage.afky
    public final void t(aflb aflbVar) {
        if (aflbVar != C()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.afky
    public void u(afld afldVar) {
    }

    @Override // defpackage.afkl
    public void v(int i, int i2) {
        if (this.j == i && this.k == i2) {
            return;
        }
        this.j = i;
        this.k = i2;
        requestLayout();
    }

    @Override // defpackage.afky
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.afkl
    @Deprecated
    public final boolean x() {
        return C() == aflb.GL_GVR || C() == aflb.GL_VPX;
    }

    @Override // defpackage.afky
    public void y(boolean z, float f, float f2, int i) {
        Handler handler;
        this.n = z;
        this.p = f2;
        Window window = this.l;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.o = attributes.screenBrightness;
            this.m = attributes.screenBrightness == 1.0f;
        }
        J(getLeft(), getTop(), getRight(), getBottom());
        if (z) {
            afhl afhlVar = (afhl) this.i;
            afhlVar.a();
            afhlVar.c.add(this);
            if (afhlVar.h != null || afhlVar.e == null) {
                return;
            }
            afhlVar.h = new Thread(new afhk(afhlVar, 1), "mediaViewambientBrightnessSensor");
            afhlVar.h.start();
            return;
        }
        afhl afhlVar2 = (afhl) this.i;
        if (afhlVar2.c.isEmpty()) {
            afhlVar2.c.remove(this);
        } else {
            afhlVar2.a();
        }
        if (afhlVar2.h == null || !afhlVar2.c.isEmpty() || (handler = afhlVar2.g) == null) {
            return;
        }
        handler.post(new afhk(afhlVar2, 0));
        afhlVar2.g = null;
        afhlVar2.h = null;
    }

    @Override // defpackage.afky
    public final /* synthetic */ void z() {
    }
}

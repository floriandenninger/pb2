package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afkv extends afkr implements SurfaceHolder.Callback {
    protected SurfaceView a;
    private final View b;
    private volatile boolean c;
    private int i;
    private adyu j;

    public afkv(Context context) {
        super(context);
        F();
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // defpackage.afky
    public final Surface A() {
        return this.a.getHolder().getSurface();
    }

    @Override // defpackage.afkr, defpackage.afky
    public final SurfaceHolder B() {
        return this.a.getHolder();
    }

    public aflb C() {
        return aflb.SURFACE;
    }

    @Override // defpackage.afkl
    public final void D() {
        Surface surface = this.a.getHolder().getSurface();
        if (surface != null) {
            surface.release();
        }
    }

    @Override // defpackage.afkl
    public final boolean E() {
        return this.c;
    }

    public final void F() {
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.a = surfaceView;
        surfaceView.getHolder().addCallback(this);
        addView(this.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void H() {
        this.b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afkr
    public final void I() {
        this.b.setVisibility(8);
    }

    @Override // defpackage.afkr, defpackage.afky
    public SurfaceControl f() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.a.getSurfaceControl();
        }
        return null;
    }

    @Override // defpackage.afkr, defpackage.afkl
    public void l(final Bitmap bitmap, final ykl yklVar) {
        if (Build.VERSION.SDK_INT >= 24 && this.j == null) {
            this.j = new adyu();
        }
        adyu adyuVar = this.j;
        Surface A = A();
        if (adyuVar == null || A == null || !A.isValid() || !bitmap.isMutable()) {
            super.l(bitmap, yklVar);
        } else {
            PixelCopy.request(A, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: afks
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    ykl yklVar2 = ykl.this;
                    Bitmap bitmap2 = bitmap;
                    if (i == 0) {
                        yklVar2.b(bitmap2, bitmap2);
                    } else {
                        yklVar2.a(bitmap2, null);
                    }
                }
            }, this.d);
        }
    }

    @Override // defpackage.afky
    public final void o() {
        this.c = false;
        post(new Runnable() { // from class: afku
            @Override // java.lang.Runnable
            public final void run() {
                afkv afkvVar = afkv.this;
                afkvVar.a.getHolder().removeCallback(afkvVar);
                afkvVar.surfaceDestroyed(afkvVar.a.getHolder());
                afkvVar.removeView(afkvVar.a);
                afkvVar.F();
            }
        });
    }

    @Override // defpackage.afkr, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        G(this.a, i5, i6);
        if (this.b.getVisibility() != 8) {
            G(this.b, i5, i6);
        }
    }

    @Override // defpackage.afkr, defpackage.afky
    public final void q() {
        if (this.i == 842094169) {
            o();
            this.i = 0;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.a.setVisibility(i);
        this.b.setVisibility(i);
        super.setVisibility(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        afkx afkxVar = this.g;
        if (afkxVar != null) {
            afkxVar.b();
        }
        this.i = i;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.c = true;
        afkx afkxVar = this.g;
        if (afkxVar != null) {
            afkxVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.c = false;
        afkx afkxVar = this.g;
        if (afkxVar != null) {
            afkxVar.d();
        }
        k();
    }

    @Override // defpackage.afkr, defpackage.afkl
    public final void v(int i, int i2) {
        if (afky.h) {
            this.a.getHolder().setFixedSize(i, i2);
        }
        super.v(i, i2);
    }
}

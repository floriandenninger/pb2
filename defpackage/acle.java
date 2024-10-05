package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acle implements SurfaceHolder.Callback, abre {
    public final boolean a;
    public final boolean b;
    public final Activity c;
    public final abrn d;
    public final abrv e;
    public final abqs f;
    public abru g;
    public abqv h;
    public abrd i;
    public abqt j;
    public abqk k;
    public abrs l;
    public abse m;
    public boolean o;
    public volatile boolean p;
    public final Object q = new Object();
    public CameraStreamViewManager$CameraModelData n = new CameraStreamViewManager$CameraModelData();

    public acle(boolean z, boolean z2, SurfaceView surfaceView, final Activity activity, final abrn abrnVar, abqs abqsVar) {
        this.a = z;
        this.b = z2;
        this.c = activity;
        abrnVar.getClass();
        this.d = abrnVar;
        this.f = abqsVar;
        this.e = new abrv(surfaceView, this);
        surfaceView.getHolder().addCallback(this);
        abrnVar.c(new abrk() { // from class: ackv
            @Override // defpackage.abrk
            public final void a() {
                acle acleVar = acle.this;
                Activity activity2 = activity;
                abrn abrnVar2 = abrnVar;
                synchronized (acleVar.q) {
                    if (acleVar.p) {
                        return;
                    }
                    acleVar.m = new abse(acleVar.f, adyu.cU(activity2, R.raw.external_texture_frag), adyu.cU(activity2, R.raw.sampler2d_texture_frag), acleVar, acleVar.n.c, abrnVar2.a().b);
                    abrnVar2.i(acleVar.m);
                }
            }
        });
    }

    @Override // defpackage.abre
    public final void a() {
        abqk abqkVar;
        abrn abrnVar = this.d;
        if (abrnVar.b.a) {
            abrnVar.g();
        }
        if (this.a || (abqkVar = this.k) == null || !abqkVar.c) {
            return;
        }
        Handler handler = abqkVar.b;
        if (handler != null) {
            handler.post(abqkVar.d);
        } else {
            abqkVar.d.run();
        }
    }

    public final int b() {
        return this.f.a;
    }

    public final void c() {
        yjk.f();
        this.f.e();
        this.n.a = this.f.b();
        this.n.b = this.f.a();
    }

    public final void d(CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData) {
        int i;
        yjk.f();
        if (cameraStreamViewManager$CameraModelData != null) {
            if (!cameraStreamViewManager$CameraModelData.d && (i = this.n.c) != cameraStreamViewManager$CameraModelData.c) {
                this.n = cameraStreamViewManager$CameraModelData;
                cameraStreamViewManager$CameraModelData.c = i;
            } else {
                this.n = cameraStreamViewManager$CameraModelData;
            }
            this.f.h(this.n.a);
            abse abseVar = this.m;
            if (abseVar != null) {
                abseVar.g(this.n.c);
            } else {
                this.d.a.post(new aclb(this, 1, null));
            }
        } else {
            this.f.j();
            this.n.a = this.f.b();
            this.n.b = this.f.a();
        }
        abse abseVar2 = this.m;
        if (abseVar2 != null) {
            abseVar2.f();
        }
        a();
    }

    public final void e(boolean z) {
        yjk.f();
        amkq.O(this.e != null, "camera is not started yet");
        this.e.b(z);
    }

    public final void f(int i) {
        int i2 = (360 - (i * 90)) % 360;
        yjk.f();
        CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = this.n;
        if (!cameraStreamViewManager$CameraModelData.d || cameraStreamViewManager$CameraModelData.c % 180 == i2 % 180) {
            cameraStreamViewManager$CameraModelData.c = i2;
            abse abseVar = this.m;
            if (abseVar != null) {
                abseVar.g(i2);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.d.a.post(new acla(this, surfaceHolder, i2, i3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.d.a.post(new aclb(this, 0));
    }
}

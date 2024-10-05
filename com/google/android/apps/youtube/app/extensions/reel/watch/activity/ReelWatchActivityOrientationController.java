package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.app.Activity;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivityOrientationController;
import defpackage.any;
import defpackage.aok;
import defpackage.axze;
import defpackage.ayqi;
import defpackage.gjo;
import defpackage.gjp;
import defpackage.sus;
import defpackage.yqw;
import defpackage.zas;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchActivityOrientationController implements gjo, any {
    public final Activity a;
    public final zas b;
    public final axze c;
    public final ayqi d;
    private final gjp e;
    private final sus f;

    public ReelWatchActivityOrientationController(Activity activity, yqw yqwVar, zas zasVar, gjp gjpVar, axze axzeVar, ayqi ayqiVar, sus susVar) {
        this.a = activity;
        this.b = zasVar;
        this.e = gjpVar;
        this.c = axzeVar;
        this.d = ayqiVar;
        this.f = susVar;
        gjpVar.a = this;
        zasVar.a(gjpVar);
        yqwVar.h(new Callable() { // from class: ief
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ReelWatchActivityOrientationController reelWatchActivityOrientationController = ReelWatchActivityOrientationController.this;
                return aypy.m(reelWatchActivityOrientationController.c.a(), whu.A(reelWatchActivityOrientationController.a.getWindow().getDecorView(), reelWatchActivityOrientationController.d).B(), epc.f).ax(new ayrs() { // from class: iee
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ReelWatchActivityOrientationController reelWatchActivityOrientationController2 = ReelWatchActivityOrientationController.this;
                        ieg iegVar = (ieg) obj;
                        if (iegVar.a) {
                            reelWatchActivityOrientationController2.b.enable();
                            DisplayMetrics displayMetrics = reelWatchActivityOrientationController2.a.getResources().getDisplayMetrics();
                            int width = iegVar.b.width();
                            int height = iegVar.b.height();
                            boolean z = true;
                            if (height <= width && width >= yjk.K(displayMetrics, 640) && height >= yjk.K(displayMetrics, 525)) {
                                z = false;
                            }
                            reelWatchActivityOrientationController2.i(z);
                            return;
                        }
                        reelWatchActivityOrientationController2.b.disable();
                        reelWatchActivityOrientationController2.h();
                    }
                });
            }
        });
    }

    private final void j() {
        this.f.a(this.a.getResources().getConfiguration(), this.a);
    }

    @Override // defpackage.gjo
    public final void g(int i) {
        i(i == 1);
    }

    public final void h() {
        this.e.d(3);
        j();
    }

    public final void i(boolean z) {
        if (z) {
            h();
        } else {
            this.e.d(0);
            j();
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}

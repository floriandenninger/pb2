package com.google.android.apps.youtube.app.ui.inappreviews;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.youtube.app.ui.inappreviews.InAppReviewController;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import defpackage.aaea;
import defpackage.aioc;
import defpackage.alpk;
import defpackage.alpl;
import defpackage.alpm;
import defpackage.alpo;
import defpackage.alsa;
import defpackage.alsc;
import defpackage.alsf;
import defpackage.alta;
import defpackage.any;
import defpackage.aok;
import defpackage.aswb;
import defpackage.axpg;
import defpackage.axzb;
import defpackage.axzg;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.aysa;
import defpackage.fjv;
import defpackage.llq;
import defpackage.mgh;
import defpackage.mgl;
import defpackage.obq;
import defpackage.obr;
import defpackage.shf;
import defpackage.ynm;
import defpackage.ywr;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InAppReviewController implements any, obq {
    public final Activity a;
    public final alpl c;
    private final aaea d;
    private final obr e;
    private final aioc f;
    private final axpg g;
    private final shf h;
    private final aok i;
    private final axzg k;
    public long b = 0;
    private ayqx j = aysa.INSTANCE;

    public InAppReviewController(Activity activity, aaea aaeaVar, obr obrVar, alpl alplVar, aioc aiocVar, axpg axpgVar, shf shfVar, aok aokVar, axzg axzgVar, byte[] bArr) {
        this.c = alplVar;
        this.a = activity;
        this.d = aaeaVar;
        this.e = obrVar;
        this.f = aiocVar;
        this.g = axpgVar;
        this.h = shfVar;
        this.i = aokVar;
        this.k = axzgVar;
    }

    private final long g() {
        return ((mgl) ((ywr) this.g.get()).c()).c;
    }

    private final void h(long j) {
        ynm.n(this.i, ((ywr) this.g.get()).b(new fjv(j, 5)), llq.p, ynm.b);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.j = this.f.G().d.X(new ayrs() { // from class: mgk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                InAppReviewController.this.b = ((aheg) obj).e();
            }
        });
        this.e.a(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.j.qc();
        this.e.b(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.obq
    public final void o(int i) {
        ApplicationInfo applicationInfo;
        alsc alscVar;
        long c = this.h.c();
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo("com.android.vending", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            zga.c("Package not found", "com.android.vending");
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            aswb aswbVar = this.d.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.aU) {
                if (!this.e.c() || this.b <= 60000 || c - g() < ((Long) this.k.a.a.Y(axzb.t).B().aB()).longValue() || !applicationInfo.enabled) {
                    if (c < g()) {
                        h(c);
                        return;
                    }
                    return;
                }
                h(c);
                alpo alpoVar = this.c.a;
                if (alpoVar.a == null) {
                    alpo.c.k("Play Store app is either not installed or not the official version", new Object[0]);
                    alscVar = alta.r(new alpk());
                } else {
                    alsf alsfVar = new alsf();
                    alpoVar.a.b(new alpm(alpoVar, alsfVar, alsfVar), alsfVar);
                    alscVar = alsfVar.a;
                }
                alscVar.e(new alsa() { // from class: mgi
                    @Override // defpackage.alsa
                    public final void a(Object obj) {
                        alsc alscVar2;
                        InAppReviewController inAppReviewController = InAppReviewController.this;
                        ReviewInfo reviewInfo = (ReviewInfo) obj;
                        alpl alplVar = inAppReviewController.c;
                        Activity activity = inAppReviewController.a;
                        if (reviewInfo.b()) {
                            alscVar2 = alta.s(null);
                        } else {
                            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                            intent.putExtra("confirmation_intent", reviewInfo.a());
                            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                            final alsf alsfVar2 = new alsf();
                            intent.putExtra("result_receiver", new ResultReceiver(alplVar.b) { // from class: com.google.android.play.core.review.ReviewManagerImpl$1
                                @Override // android.os.ResultReceiver
                                public final void onReceiveResult(int i2, Bundle bundle) {
                                    alsfVar2.b(null);
                                }
                            });
                            activity.startActivity(intent);
                            alscVar2 = alsfVar2.a;
                        }
                        alscVar2.e(new alsa() { // from class: mgj
                            @Override // defpackage.alsa
                            public final void a(Object obj2) {
                                zga.g("Successfully launched review flow");
                            }
                        });
                        alscVar2.d(mgh.b);
                    }
                });
                alscVar.d(mgh.a);
            }
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}

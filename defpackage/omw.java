package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class omw implements fzi {
    public final fyl a;
    public final ColorDrawable b;
    public final int c;
    public final int d;
    private final Activity e;
    private final omv f;

    public omw(Activity activity, oeu oeuVar, miv mivVar, aypn aypnVar) {
        int Q = wbs.Q(activity, R.attr.ytBrandBackgroundSolid);
        this.c = Q;
        this.d = aih.d(activity, R.color.yt_black_pure);
        ColorDrawable colorDrawable = new ColorDrawable(Q);
        this.b = colorDrawable;
        final fyl fylVar = new fyl(colorDrawable, 0, 0);
        this.a = fylVar;
        fylVar.c(48);
        this.e = activity;
        omv omvVar = new omv();
        omvVar.b(fzh.BASE, 1.0f);
        omvVar.c(fzh.BASE, wbs.Q(activity, R.attr.ytGeneralBackgroundA));
        omvVar.b(fzh.PLAYER, 0.0f);
        omvVar.c(fzh.PLAYER, aih.d(activity, R.color.yt_black_pure));
        this.f = omvVar;
        mivVar.a().ax(new ayrs() { // from class: omt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                omw omwVar = omw.this;
                if (((Boolean) obj).booleanValue()) {
                    omwVar.a(fzh.PLAYER, 1.0f);
                } else {
                    omwVar.a(fzh.PLAYER, 0.0f);
                }
            }
        });
        oeuVar.a(new omu(this, 1));
        oeuVar.a(new omu(this, 0));
        activity.getWindow().setStatusBarColor(0);
        aypnVar.A(ohs.e).X(new ayrs() { // from class: oms
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                fyl.this.d(((Integer) obj).intValue());
            }
        });
    }

    private final void c(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = this.e.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(whu.R(i) > 0.8d ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        this.a.b(i);
    }

    @Override // defpackage.fzi
    public final void a(fzh fzhVar, float f) {
        this.f.b(fzhVar, f);
        c(this.f.a());
    }

    @Override // defpackage.fzi
    public final void b(fzh fzhVar, int i) {
        this.f.c(fzhVar, i);
        c(this.f.a());
    }
}

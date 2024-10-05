package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kfy implements ahna {
    public final kem a;
    public final acra b;
    public ahmz c;

    public kfy(Activity activity, acra acraVar) {
        acraVar.getClass();
        this.b = acraVar;
        kem kemVar = new kem(activity.getString(R.string.vr_overflow_menu_item), new kfx(this));
        this.a = kemVar;
        kemVar.e = whu.y(activity, R.drawable.yt_outline_vr_black_24, R.attr.ytTextPrimary);
        kemVar.g(false);
        acraVar.D(new acqx(acsb.c(47948)));
    }

    @Override // defpackage.ahna
    public final void a(boolean z) {
        this.a.g(z);
        this.b.D(new acqx(acsb.c(47948)));
    }
}

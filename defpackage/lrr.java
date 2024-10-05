package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrr implements ypd {
    public final Activity a;
    public boolean b = false;
    private final zaw c;

    public lrr(Activity activity, zaw zawVar) {
        this.a = activity;
        this.c = zawVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afth.class};
        }
        if (i == 0) {
            afth afthVar = (afth) obj;
            if (this.b) {
                return null;
            }
            this.c.a(afthVar.b());
            AlertDialog show = new AlertDialog.Builder(this.a).setMessage(R.string.common_error_authenticating).setPositiveButton(R.string.account_switcher_sign_in, new lrp(this, afthVar.a())).show();
            this.b = true;
            show.setOnDismissListener(new lrq(this));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

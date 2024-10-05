package defpackage;

import android.app.Activity;
import android.app.AlertDialog;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aila implements ailf {
    public final Activity a;
    public final aiky b;
    protected String c;
    protected String d;
    protected atyt e;
    public AlertDialog f;

    public aila(Activity activity, aiky aikyVar) {
        this.a = activity;
        this.b = aikyVar;
    }

    @Override // defpackage.ailf
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.ailf
    public final void b() {
        AlertDialog alertDialog;
        if (!this.a.isFinishing() && !this.a.isDestroyed() && (alertDialog = this.f) != null && alertDialog.isShowing()) {
            this.f.cancel();
        }
        this.f = null;
    }
}

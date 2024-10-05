package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class co extends cl {
    public final Activity b;
    public final Context c;
    public final Handler d;
    final dd e = new dd();

    public co(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.cl
    public View a(int i) {
        throw null;
    }

    @Override // defpackage.cl
    public boolean b() {
        throw null;
    }

    public void c() {
    }

    public final void e(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        aig.b(this.c, intent, bundle);
    }
}

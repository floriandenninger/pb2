package defpackage;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikx implements aiky {
    public final WeakReference a;
    public final Executor b;
    public final afsy c;
    public Dialog d;
    public AgeVerificationDialog$CustomWebView e;
    public ykn f;
    public final wcf g;
    public ailc h;

    public aikx(Activity activity, Executor executor, afsy afsyVar, wcf wcfVar) {
        this.a = new WeakReference(activity);
        executor.getClass();
        this.b = executor;
        afsyVar.getClass();
        this.c = afsyVar;
        wcfVar.getClass();
        this.g = wcfVar;
    }

    public final void a() {
        ykn yknVar = this.f;
        if (yknVar != null) {
            yknVar.d();
        }
        this.d.dismiss();
        this.e.loadUrl("about:blank");
    }

    public final void b() {
        a();
        this.h.b();
    }

    public final void c() {
        a();
        ailc ailcVar = this.h;
        aile.a(ailcVar.b, ailcVar.c.i(ailcVar.a));
    }
}

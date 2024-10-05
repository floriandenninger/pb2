package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdw implements Application.ActivityLifecycleCallbacks {
    public final tey a;
    public final tei b;
    public final tdq c;
    private final rwh d = new rwh();

    public tdw(tdq tdqVar, View view, tez tezVar, baof baofVar, byte[] bArr) {
        tey teyVar = new tey(tezVar, baofVar, null);
        this.a = teyVar;
        teyVar.d(view);
        tet tetVar = new tet(tdqVar);
        if (baofVar.a && tetVar.d == null) {
            tetVar.d = new tes(tetVar.c.a(), tetVar.a);
            tes tesVar = tetVar.d;
            if (!tesVar.b) {
                tesVar.a.registerContentObserver(Settings.System.CONTENT_URI, true, tesVar);
                tesVar.c = tesVar.a();
                tesVar.b = true;
            }
        }
        this.b = tetVar;
        this.c = tdqVar;
        Application a = tdqVar.a();
        if (a == null || !baofVar.a) {
            return;
        }
        tfd a2 = tezVar.a();
        if (a2 != null) {
            teyVar.a = a2.d;
        }
        a.registerActivityLifecycleCallbacks(this);
    }

    public final tdt a(tfa tfaVar) {
        tfa tfaVar2 = tfa.START;
        int ordinal = tfaVar.ordinal();
        if (ordinal == 10) {
            this.b.a(this.a, tfaVar);
            this.a.r();
        } else if (ordinal == 16) {
            this.b.a(this.a, tfaVar);
            this.a.n = true;
        } else if (ordinal == 17) {
            this.b.a(this.a, tfaVar);
            this.a.n = false;
        } else {
            switch (ordinal) {
                case 0:
                    tey teyVar = this.a;
                    teyVar.l = false;
                    teyVar.b = System.currentTimeMillis();
                    this.b.a(this.a, tfaVar);
                    this.a.o(tfa.START);
                    break;
                case 1:
                case 2:
                case 3:
                    this.b.a(this.a, tfaVar);
                    this.a.o(tfaVar);
                    break;
                case 4:
                    this.b.a(this.a, tfaVar);
                    this.a.o(tfa.COMPLETE);
                    break;
                case 5:
                    this.b.a(this.a, tfaVar);
                    this.a.l = false;
                    break;
                case 6:
                case 7:
                case 8:
                    this.b.a(this.a, tfaVar);
                    this.a.l = true;
                    break;
                default:
                    this.b.a(this.a, tfaVar);
                    break;
            }
        }
        tdt i = this.a.i(tfaVar);
        if (!tfaVar.t) {
            this.a.n(tfaVar);
        }
        if (tfaVar.a() && tfaVar != tfa.COMPLETE) {
            this.a.p(tfaVar.u + 1);
        }
        return i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View a = this.a.a();
        if (a == null || rwh.R(a) != activity) {
            return;
        }
        this.a.a = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        View a = this.a.a();
        if (a == null || rwh.R(a) != activity) {
            return;
        }
        this.a.a = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public tdw(tez tezVar, baof baofVar, byte[] bArr) {
        tey teyVar = new tey(tezVar, baofVar, null);
        this.a = teyVar;
        this.b = new tfb(teyVar);
        this.c = null;
    }
}

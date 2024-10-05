package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alog implements alof {
    private final alop a;
    private final aloe b;
    private final Context c;

    public alog(alop alopVar, aloe aloeVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = alopVar;
        this.b = aloeVar;
        this.c = context;
    }

    @Override // defpackage.alof
    public final alsc a() {
        alop alopVar = this.a;
        String packageName = this.c.getPackageName();
        if (alopVar.a == null) {
            return alop.c();
        }
        alsf alsfVar = new alsf();
        alopVar.a.b(new alol(alopVar, alsfVar, packageName, alsfVar), alsfVar);
        return alsfVar.a;
    }

    @Override // defpackage.alof
    public final synchronized void b(aloz alozVar) {
        this.b.b(alozVar);
    }

    @Override // defpackage.alof
    public final synchronized void c(aloz alozVar) {
        this.b.c(alozVar);
    }

    @Override // defpackage.alof
    public final void d() {
        alop alopVar = this.a;
        String packageName = this.c.getPackageName();
        if (alopVar.a == null) {
            alop.c();
        } else {
            alsf alsfVar = new alsf();
            alopVar.a.b(new alom(alopVar, alsfVar, alsfVar, packageName), alsfVar);
        }
    }

    @Override // defpackage.alof
    public final void e(alod alodVar, int i, Activity activity) {
        alok a = alok.a(i);
        if (alodVar == null || alodVar.a(a) == null || alodVar.c) {
            return;
        }
        alodVar.c = true;
        activity.startIntentSenderForResult(alodVar.a(a).getIntentSender(), 2400, null, 0, 0, 0, null);
    }
}

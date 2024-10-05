package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eqa {
    public final azrw a;
    public final eox b;
    public final Executor d;
    public final aadw e;
    public final azrh c = azrh.aN(false);
    private final azrh f = azrh.aN(epz.NOT_SUPPORTED);

    public eqa(Context context, azrw azrwVar, aadw aadwVar, final eni eniVar, Executor executor, final ayqi ayqiVar) {
        this.a = azrwVar;
        this.e = aadwVar;
        this.d = executor;
        this.b = new eox(context, this);
        if (evr.az(aadwVar)) {
            executor.execute(new Runnable() { // from class: epy
                @Override // java.lang.Runnable
                public final void run() {
                    eqa.this.c(eniVar, ayqiVar);
                }
            });
        } else {
            azrwVar.get();
            c(eniVar, ayqiVar);
        }
    }

    public final aypy a() {
        return this.f.U().B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        epz epzVar;
        int i = -1;
        try {
            Bundle call = ((aloh) this.a.get()).a.getContentResolver().call(vzo.a, "get_wind_down_state", (String) null, (Bundle) null);
            if (call != null) {
                i = call.getInt("state", -1);
            }
        } catch (Throwable th) {
            Log.w("WindDownApi", "Unexpected error calling Digital Wellbeing", th);
        }
        azrh azrhVar = this.f;
        if (i == 1) {
            epzVar = epz.IN_BEDTIME;
        } else if (i == 0) {
            epzVar = epz.NOT_IN_BEDTIME;
        } else if (i == -2) {
            epzVar = epz.NO_ACCESS;
        } else {
            epzVar = epz.NOT_SUPPORTED;
        }
        azrhVar.c(epzVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(eni eniVar, ayqi ayqiVar) {
        if (!evr.az(this.e) || evr.aA(this.e)) {
            eniVar.b().B(ayqiVar).R(new ayrm() { // from class: epw
                @Override // defpackage.ayrm
                public final void a() {
                    eqa eqaVar = eqa.this;
                    if (evr.aA(eqaVar.e)) {
                        eox eoxVar = eqaVar.b;
                        if (!eoxVar.b) {
                            eoxVar.b = true;
                            eoxVar.a.registerReceiver(eoxVar, new IntentFilter("com.google.android.apps.wellbeing.action.ACTION_WIND_DOWN_STATE_CHANGED"));
                        }
                        eqaVar.b();
                    }
                }
            });
        }
    }
}

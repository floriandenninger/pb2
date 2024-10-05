package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protos.youtube.api.innertube.LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadp implements aaha {
    private final aado a;

    public aadp(aado aadoVar) {
        this.a = aadoVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand logFirebaseEventCommandOuterClass$LogFirebaseEventCommand = (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand) apxfVar.pX(LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.logFirebaseEventCommand);
        aado aadoVar = this.a;
        String str = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand.b;
        aony<askp> aonyVar = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand.c;
        Bundle bundle = new Bundle();
        for (askp askpVar : aonyVar) {
            if ((askpVar.b & 1) != 0) {
                int i = askpVar.c;
                if (i == 2) {
                    bundle.putString(askpVar.e, (String) askpVar.d);
                } else if (i == 4) {
                    bundle.putInt(askpVar.e, ((Integer) askpVar.d).intValue());
                } else if (i == 6) {
                    bundle.putDouble(askpVar.e, ((Double) askpVar.d).doubleValue());
                } else if (i == 5) {
                    bundle.putBoolean(askpVar.e, ((Boolean) askpVar.d).booleanValue());
                }
            }
        }
        if (aadoVar.b && aadoVar.c) {
            ((FirebaseAnalytics) aadoVar.a.get()).a.e(null, str, bundle, false);
        }
    }
}

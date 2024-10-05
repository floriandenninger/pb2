package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqr {
    public final acra a;

    public jqr(acra acraVar) {
        this.a = acraVar;
    }

    public static apxf c(acra acraVar, apxf apxfVar, int i) {
        if (acraVar == null || acraVar.c() == null) {
            return apxfVar;
        }
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = i;
        InteractionLoggingScreen c = acraVar.c();
        if (c != null) {
            String str = c.a;
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            str.getClass();
            atmcVar2.b |= 1;
            atmcVar2.c = str;
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        aongVar.copyOnWrite();
        apxf apxfVar2 = (apxf) aongVar.instance;
        apxfVar2.b &= -2;
        apxfVar2.c = apxf.a.c;
        return (apxf) aongVar.build();
    }

    public static boolean d(View view, boolean z) {
        if (view.getVisibility() == 0) {
            if (z) {
                z = true;
            }
        }
        return view.getVisibility() != 0 && z;
    }

    public final hfq a(acsc acscVar) {
        return new hfq(this, acscVar, null);
    }

    public final hfr b(acsc acscVar) {
        return new hfr(this, acscVar, null);
    }
}

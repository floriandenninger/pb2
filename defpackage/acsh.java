package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsh {
    public Bundle a = null;

    public static Bundle a(acra acraVar) {
        InteractionLoggingScreen c;
        if (acraVar == null || (c = acraVar.c()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("tracking_interaction_parent_csn", c.a);
        c.c();
        bundle.putInt("tracking_interaction_parent_ve", c.c().a);
        return bundle;
    }

    public static Bundle b(apxf apxfVar) {
        Bundle bundle = null;
        if (apxfVar != null && apxfVar.pY(atmb.b)) {
            atmc atmcVar = (atmc) apxfVar.pX(atmb.b);
            if ((atmcVar.b & 1) != 0) {
                bundle = new Bundle();
                bundle.putString("tracking_interaction_parent_csn", atmcVar.c);
                int i = atmcVar.d;
                if (i > 0) {
                    bundle.putInt("tracking_interaction_parent_ve", i);
                }
                if ((apxfVar.b & 1) != 0) {
                    bundle.putByteArray("tracking_interaction_click_tracking_params", apxfVar.c.I());
                }
            }
        }
        return bundle;
    }

    public static apxf c(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("tracking_interaction_parent_csn")) {
            return null;
        }
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = atmc.a.createBuilder();
        String string = bundle.getString("tracking_interaction_parent_csn");
        if (string != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar = (atmc) createBuilder.instance;
            atmcVar.b |= 1;
            atmcVar.c = string;
        }
        if (bundle.containsKey("tracking_interaction_parent_ve")) {
            int i = bundle.getInt("tracking_interaction_parent_ve");
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b |= 2;
            atmcVar2.d = i;
        }
        if (bundle.containsKey("tracking_interaction_click_tracking_params")) {
            byte[] byteArray = bundle.getByteArray("tracking_interaction_click_tracking_params");
            if (byteArray == null) {
                aongVar.copyOnWrite();
                apxf apxfVar = (apxf) aongVar.instance;
                apxfVar.b &= -2;
                apxfVar.c = apxf.a.c;
            } else {
                aomf x = aomf.x(byteArray);
                aongVar.copyOnWrite();
                apxf apxfVar2 = (apxf) aongVar.instance;
                apxfVar2.b |= 1;
                apxfVar2.c = x;
            }
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        return (apxf) aongVar.build();
    }
}

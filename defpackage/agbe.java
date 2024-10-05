package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbe implements agbr {
    private final Context a;
    private final int b;
    private final agaf c;

    public agbe(Context context, int i, agaf agafVar) {
        this.a = context;
        this.b = i;
        this.c = agafVar;
    }

    @Override // defpackage.agbr
    public final void a(apeo apeoVar, acra acraVar, agbs agbsVar, dy dyVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        apek apekVar = apeoVar.e;
        if (apekVar == null) {
            apekVar = apek.a;
        }
        dyVar.g(true);
        aqyg aqygVar6 = null;
        if ((apekVar.b & 8) != 0) {
            aqygVar = apekVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        dyVar.k(ajcq.b(aqygVar));
        if ((apekVar.b & 16) != 0) {
            aqygVar2 = apekVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        dyVar.j(ajcq.b(aqygVar2));
        if ((apekVar.b & 64) != 0) {
            aqygVar3 = apekVar.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        dyVar.i(ajcq.b(aqygVar3));
        if ((apekVar.b & 32) != 0) {
            aqygVar4 = apekVar.h;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        dyVar.t(ajcq.b(aqygVar4));
        dyVar.r(this.b);
        dyVar.z = aih.d(this.a, R.color.small_icon_background);
        dx dxVar = new dx();
        if ((apekVar.b & 16) != 0) {
            aqygVar5 = apekVar.g;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        dxVar.c(ajcq.b(aqygVar5));
        if ((apekVar.b & 8) != 0 && (aqygVar6 = apekVar.f) == null) {
            aqygVar6 = aqyg.a;
        }
        dxVar.d(ajcq.b(aqygVar6));
        dyVar.s(dxVar);
        apek apekVar2 = apeoVar.e;
        if (apekVar2 == null) {
            apekVar2 = apek.a;
        }
        int i = true != apekVar2.o ? 0 : 4;
        if (apekVar2.n && this.c.c("com.google.android.libraries.youtube.notification.pref.notification_sound_enabled", true)) {
            i |= 1;
        }
        if (apekVar2.p && apeoVar.n.size() == 0) {
            i |= 2;
        }
        dyVar.l(i);
        int i2 = apekVar.e;
        dyVar.k = i2;
        if (i2 == -1) {
            dyVar.w = true;
        }
        if ((apekVar.b & 32768) != 0) {
            dyVar.x = apekVar.r;
        }
        if (apeoVar.n.size() > 0) {
            Object[] array = apeoVar.n.toArray();
            int length = array.length;
            long[] jArr = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = array[i3];
                obj.getClass();
                jArr[i3] = ((Number) obj).longValue();
            }
            dyVar.v(jArr);
        }
        if ((apeoVar.b & 32768) != 0) {
            Bundle bundle = new Bundle();
            asuh asuhVar = apeoVar.u;
            if (asuhVar == null) {
                asuhVar = asuh.b;
            }
            if (asuhVar != null) {
                bundle.putByteArray("logging_directive", asuhVar.toByteArray());
            }
            InteractionLoggingScreen interactionLoggingScreen = ((acqq) acraVar).g;
            if (interactionLoggingScreen != null) {
                bundle.putBundle("interaction_screen_bundle_extra", aear.P(interactionLoggingScreen));
            }
            dyVar.y = bundle;
        }
    }
}

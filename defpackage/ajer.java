package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajer implements slw {
    private final acpl a;

    public ajer(acpl acplVar) {
        this.a = acplVar;
    }

    @Override // defpackage.slw
    public final void a(int i, aomf aomfVar, boolean z, float f, int i2, swu swuVar) {
        auej auejVar;
        sxs sxsVar = swuVar.f;
        if (sxsVar instanceof ajgg) {
            acra acraVar = ((ajgg) sxsVar).a;
            if (!z) {
                int i3 = i - 1;
                if (i3 == 1) {
                    acraVar.u(new acqx(aomfVar), null);
                    return;
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    acraVar.q(new acqx(aomfVar), null);
                    return;
                }
            }
            InteractionLoggingScreen c = acraVar.c();
            if (c == null) {
                return;
            }
            int i4 = i - 1;
            if (i4 == 1) {
                auejVar = auej.POST_IMPRESSION_EVENT_TYPE_ENTER;
            } else if (i4 == 2) {
                auejVar = auej.POST_IMPRESSION_EVENT_TYPE_LEAVE;
            } else {
                auejVar = auej.POST_IMPRESSION_EVENT_TYPE_UNKNOWN;
            }
            if (auejVar != auej.POST_IMPRESSION_EVENT_TYPE_UNKNOWN) {
                arpn a = arpp.a();
                auek a2 = auel.a();
                String str = c.a;
                a2.copyOnWrite();
                ((auel) a2.instance).h(str);
                aone createBuilder = awav.a.createBuilder();
                createBuilder.copyOnWrite();
                awav awavVar = (awav) createBuilder.instance;
                aomfVar.getClass();
                awavVar.b = 1 | awavVar.b;
                awavVar.c = aomfVar;
                awav awavVar2 = (awav) createBuilder.build();
                a2.copyOnWrite();
                ((auel) a2.instance).k(awavVar2);
                a2.copyOnWrite();
                ((auel) a2.instance).j(auejVar);
                a2.copyOnWrite();
                ((auel) a2.instance).l(f);
                a2.copyOnWrite();
                ((auel) a2.instance).i(i2);
                auel auelVar = (auel) a2.build();
                a.copyOnWrite();
                ((arpp) a.instance).dz(auelVar);
                this.a.c((arpp) a.build());
            }
        }
    }
}

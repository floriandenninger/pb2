package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajen implements aaha {
    private final sww a;

    public ajen(sww swwVar) {
        this.a = swwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        acra acraVar;
        swu swuVar;
        sws a = swu.a();
        if (map != null && map.containsKey("com.google.android.libraries.elements.interfaces.command_event_data") && (swuVar = (swu) map.get("com.google.android.libraries.elements.interfaces.command_event_data")) != null) {
            a = swuVar.b();
        }
        ajgb a2 = ajgc.a();
        if (map != null && (acraVar = (acra) map.get("com.google.android.libraries.youtube.logging.interaction_logger")) != null) {
            a2.c = acraVar;
            a.d = a2.a();
        }
        a2.d = apxfVar;
        a.d = a2.a();
        this.a.b((awnw) apxfVar.pX(aqrk.a), a.a()).Q();
    }
}

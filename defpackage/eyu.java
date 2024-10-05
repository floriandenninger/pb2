package defpackage;

import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyu implements aaha {
    public final aahd a;
    public final zaw b;
    private final abab c;
    private final /* synthetic */ int d;

    public eyu(abab ababVar, aahd aahdVar, zaw zawVar, int i, byte[] bArr) {
        this.d = i;
        ababVar.getClass();
        this.c = ababVar;
        aahdVar.getClass();
        this.a = aahdVar;
        zawVar.getClass();
        this.b = zawVar;
    }

    public eyu(abab ababVar, aahd aahdVar, zaw zawVar, int i) {
        this.d = i;
        ababVar.getClass();
        this.c = ababVar;
        aahdVar.getClass();
        this.a = aahdVar;
        zawVar.getClass();
        this.b = zawVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.d == 0) {
            abab ababVar = this.c;
            abaf abafVar = new abaf(ababVar.f, ababVar.a.c(), ((RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint) apxfVar.pX(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)).b, null, null, null);
            abafVar.l(apxfVar.c);
            abab ababVar2 = this.c;
            ababVar2.h.e(abafVar, new eyt(this));
            return;
        }
        abab ababVar3 = this.c;
        aazw aazwVar = new aazw(ababVar3.f, ababVar3.a.c(), ((AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint) apxfVar.pX(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint)).b, null, null, null);
        aazwVar.l(apxfVar.c);
        abab ababVar4 = this.c;
        ababVar4.g.e(aazwVar, new ewf(this, null));
    }
}

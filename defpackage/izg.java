package defpackage;

import com.google.protos.youtube.api.innertube.ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izg implements aaha {
    private final afzp a;

    public izg(afzp afzpVar) {
        this.a = afzpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        long j = ((ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction) apxfVar.pX(ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.clearNotificationsUnreadCountAction)).b;
        afzp afzpVar = this.a;
        afzm a = afzn.a();
        a.c(false);
        a.d(0);
        a.b((int) j);
        a.a = "FEnotifications_inbox";
        afzpVar.e(a.a());
    }
}

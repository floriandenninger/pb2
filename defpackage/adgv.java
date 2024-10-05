package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgv {
    public static final String a = zga.a("MDX.LivingRoomNotificationLogger");
    private final acpl b;

    static {
        acrb acrbVar = acrb.SEARCH_TOPIC_RESULT;
    }

    public adgv(acpl acplVar) {
        this.b = acplVar;
    }

    public final void a(atbf atbfVar) {
        atae a2 = ataf.a();
        atbg atbgVar = atbg.MDX_NOTIFICATION_GEL_TYPE_CONTENT_RECOMMENDATION_MULTI_SCREEN;
        a2.copyOnWrite();
        ataf.c((ataf) a2.instance, atbgVar);
        a2.copyOnWrite();
        ataf.d((ataf) a2.instance, atbfVar);
        ataf atafVar = (ataf) a2.build();
        arpn a3 = arpp.a();
        a3.copyOnWrite();
        ((arpp) a3.instance).cZ(atafVar);
        this.b.c((arpp) a3.build());
    }

    public final void b(atcd atcdVar, String str, atbf atbfVar) {
        if (atcdVar != null) {
            str = String.format(Locale.US, "%s: videoId=%s", str, atcdVar.d);
        }
        zga.h(a, str);
        a(atbfVar);
    }

    public final void c() {
        zga.h(a, "LR Notification revoked because the user signed out.");
        a(atbf.MDX_NOTIFICATION_GEL_ACTION_REVOKED_SIGNED_OUT);
    }
}

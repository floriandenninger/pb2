package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agap {
    private final Notification a;
    private final agbs b;

    public agap(Notification notification, agbs agbsVar) {
        this.a = notification;
        this.b = agbsVar;
    }

    public final void a(Context context, boolean z) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        try {
            agbs agbsVar = this.b;
            notificationManager.notify(agbsVar.a, agbsVar.b, this.a);
        } catch (RuntimeException e) {
            afsi.b(1, 7, e.getMessage());
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = true != z ? "posted" : "updated";
        agbs agbsVar2 = this.b;
        objArr[1] = agbsVar2.a;
        objArr[2] = Integer.valueOf(agbsVar2.b);
        String.format(locale, "%s notification with %s:%s", objArr);
    }
}

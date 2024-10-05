package defpackage;

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dz extends ea {
    private final ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea
    public final String a() {
        return "android.support.v4.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.ea
    public final void b(dt dtVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((eb) dtVar).b).setBigContentTitle(this.c);
        if (this.e) {
            bigContentTitle.setSummaryText(this.d);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine((CharSequence) arrayList.get(i));
        }
    }

    public final void c(CharSequence charSequence) {
        if (charSequence != null) {
            this.a.add(dy.d(charSequence));
        }
    }
}

package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dx extends ea {
    private CharSequence a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea
    public final String a() {
        return "android.support.v4.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.ea
    public final void b(dt dtVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((eb) dtVar).b).setBigContentTitle(this.c).bigText(this.a);
        if (this.e) {
            bigText.setSummaryText(this.d);
        }
    }

    public final void c(CharSequence charSequence) {
        this.a = dy.d(charSequence);
    }

    public final void d(CharSequence charSequence) {
        this.c = dy.d(charSequence);
    }
}

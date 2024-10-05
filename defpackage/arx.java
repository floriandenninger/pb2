package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class arx extends ea {
    public int[] a = null;
    public MediaSessionCompat$Token f;

    @Override // defpackage.ea
    public void b(dt dtVar) {
        Notification.Builder builder = ((eb) dtVar).b;
        Notification.MediaStyle a = aru.a();
        aru.b(a, this.a, this.f);
        aru.d(builder, a);
    }

    public int c(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RemoteViews d() {
        int min = Math.min(this.b.b.size(), 5);
        RemoteViews g = g(c(min), false);
        g.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                g.addView(R.id.media_actions, e((dv) this.b.b.get(i)));
            }
        }
        g.setViewVisibility(R.id.cancel_action, 8);
        return g;
    }

    public final RemoteViews e(dv dvVar) {
        PendingIntent pendingIntent = dvVar.g;
        RemoteViews remoteViews = new RemoteViews(this.b.a.getPackageName(), R.layout.notification_media_action);
        remoteViews.setImageViewResource(R.id.action0, dvVar.e);
        if (pendingIntent != null) {
            remoteViews.setOnClickPendingIntent(R.id.action0, dvVar.g);
        }
        art.a(remoteViews, R.id.action0, dvVar.f);
        return remoteViews;
    }

    @Override // defpackage.ea
    public RemoteViews h() {
        return null;
    }

    @Override // defpackage.ea
    public RemoteViews i() {
        return null;
    }
}

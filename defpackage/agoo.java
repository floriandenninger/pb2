package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agoo {
    public final NotificationManager a;
    public final Set b = new HashSet();
    private final Context c;

    public agoo(Context context) {
        this.c = context;
        this.a = (NotificationManager) context.getSystemService("notification");
        try {
            whl.v(context, "OfflineNotifications", context.getString(R.string.offline_notification_channel));
        } catch (Resources.NotFoundException unused) {
        }
    }

    public final dy a() {
        dy dyVar = new dy(this.c);
        whl.w(dyVar, "OfflineNotifications");
        return dyVar;
    }

    public final Set b() {
        Set set;
        synchronized (this.b) {
            set = this.b;
        }
        return set;
    }

    public final void c() {
        synchronized (this.b) {
            for (Pair pair : b()) {
                this.a.cancel((String) pair.first, ((Integer) pair.second).intValue());
            }
            this.b.clear();
        }
    }

    public final void d(String str, int i, Notification notification) {
        synchronized (this.b) {
            this.b.add(new Pair(zhq.h(str), Integer.valueOf(i)));
        }
        this.a.notify(str, i, notification);
    }
}

package defpackage;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arw extends arx {
    @Override // defpackage.arx, defpackage.ea
    public final void b(dt dtVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Notification.Builder builder = ((eb) dtVar).b;
            Notification.DecoratedMediaCustomViewStyle a = arv.a();
            aru.b(a, this.a, this.f);
            aru.d(builder, a);
            return;
        }
        super.b(dtVar);
    }

    @Override // defpackage.arx
    public final int c(int i) {
        return i <= 3 ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_custom;
    }

    @Override // defpackage.arx, defpackage.ea
    public final RemoteViews h() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        dy dyVar = this.b;
        RemoteViews remoteViews = dyVar.D;
        if (remoteViews == null) {
            remoteViews = dyVar.C;
        }
        if (remoteViews == null) {
            return null;
        }
        RemoteViews d = d();
        f(d, remoteViews);
        k(d);
        return d;
    }

    @Override // defpackage.arx, defpackage.ea
    public final RemoteViews i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        dy dyVar = this.b;
        RemoteViews remoteViews = dyVar.C;
        if (remoteViews == null && dyVar.D == null) {
            return null;
        }
        RemoteViews g = g(remoteViews != null ? R.layout.notification_template_media_custom : R.layout.notification_template_media, true);
        int size = this.b.b.size();
        int[] iArr = this.a;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        g.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                if (i >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                }
                g.addView(R.id.media_actions, super.e((dv) this.b.b.get(this.a[i])));
            }
        }
        g.setViewVisibility(R.id.end_padder, 0);
        g.setViewVisibility(R.id.cancel_action, 8);
        if (remoteViews != null) {
            f(g, this.b.C);
        }
        k(g);
        return g;
    }

    @Override // defpackage.ea
    public final RemoteViews j() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.b.C) == null) {
            return null;
        }
        RemoteViews d = d();
        f(d, remoteViews);
        k(d);
        return d;
    }

    private final void k(RemoteViews remoteViews) {
        dy dyVar = this.b;
        int i = dyVar.z;
        if (i == 0) {
            i = dyVar.a.getResources().getColor(R.color.notification_material_background_media_default_color);
        }
        remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", i);
    }
}

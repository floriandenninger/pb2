package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eb implements dt {
    public final Context a;
    public final Notification.Builder b;
    private final dy c;
    private RemoteViews d;
    private RemoteViews e;
    private final Bundle f;
    private int g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0430  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eb(defpackage.dy r19) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb.<init>(dy):void");
    }

    private static final void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        RemoteViews j;
        RemoteViews h;
        ea eaVar = this.c.n;
        if (eaVar != null) {
            eaVar.b(this);
        }
        RemoteViews i = eaVar != null ? eaVar.i() : null;
        if (Build.VERSION.SDK_INT >= 26) {
            build = this.b.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            build = this.b.build();
            if (this.g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.g == 2) {
                    b(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    b(build);
                }
            }
        } else {
            this.b.setExtras(this.f);
            build = this.b.build();
            RemoteViews remoteViews = this.d;
            if (remoteViews != null) {
                build.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.e;
            if (remoteViews2 != null) {
                build.bigContentView = remoteViews2;
            }
            if (this.g != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.g == 2) {
                    b(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.g == 1) {
                    b(build);
                }
            }
        }
        if (i != null) {
            build.contentView = i;
        } else {
            RemoteViews remoteViews3 = this.c.C;
            if (remoteViews3 != null) {
                build.contentView = remoteViews3;
            }
        }
        if (eaVar != null && (h = eaVar.h()) != null) {
            build.bigContentView = h;
        }
        if (eaVar != null && (j = this.c.n.j()) != null) {
            build.headsUpContentView = j;
        }
        if (eaVar != null && (bundle = build.extras) != null) {
            if (eaVar.e) {
                bundle.putCharSequence("android.summaryText", eaVar.d);
            }
            CharSequence charSequence = eaVar.c;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String a = eaVar.a();
            if (a != null) {
                bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", a);
            }
        }
        return build;
    }
}

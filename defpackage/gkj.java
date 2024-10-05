package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gkj {
    public final String a;
    public final Runnable b;
    private final Context c;
    private final int d;
    private final int e;
    private final int f;
    private RemoteAction g;

    public gkj(Context context, int i, int i2, int i3, String str, Runnable runnable) {
        this.c = context;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.a = str;
        this.b = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RemoteAction a() {
        if (this.g == null) {
            Icon createWithResource = Icon.createWithResource(this.c, this.d);
            String string = this.c.getString(this.e);
            String string2 = this.c.getString(this.f);
            Context context = this.c;
            RemoteAction remoteAction = new RemoteAction(createWithResource, string, string2, PendingIntent.getBroadcast(context, 0, new Intent(this.a).setPackage(context.getPackageName()), yny.M() | 134217728));
            this.g = remoteAction;
            if (this.b == null) {
                remoteAction.setEnabled(false);
            }
        }
        return this.g;
    }
}

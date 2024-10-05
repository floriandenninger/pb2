package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;
import com.google.vr.ndk.base.DaydreamApi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmt {
    public final BroadcastReceiver a = new nms(this);
    public final Context b;
    protected DaydreamApi c;
    public boolean d;
    private final Intent e;

    public nmt(Context context) {
        context.getClass();
        this.b = context;
        this.e = new Intent(context, (Class<?>) LaunchYouTubeVrActivity.class);
    }

    public final void a() {
        DaydreamApi daydreamApi = this.c;
        if (daydreamApi != null) {
            daydreamApi.unregisterDaydreamIntent();
            this.c.close();
            this.c = null;
        }
    }

    public final void b() {
        if (this.d && c()) {
            if (!ahow.e(this.b, 2)) {
                a();
                return;
            }
            if (this.c == null) {
                this.c = DaydreamApi.create(this.b);
            }
            if (this.c != null) {
                this.c.registerDaydreamIntent(PendingIntent.getActivity(this.b, 0, this.e, yny.M() | 134217728));
            }
        }
    }

    public final boolean c() {
        return DaydreamApi.isDaydreamReadyPlatform(this.b);
    }
}

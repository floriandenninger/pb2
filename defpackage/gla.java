package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gla {
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    public final Context a;
    public Runnable b;
    public NotificationManager c;
    private final azrw e;
    private final Handler f;

    public gla(Context context, azrw azrwVar, Handler handler) {
        this.a = context;
        this.e = azrwVar;
        this.f = handler;
    }

    public final void a(aixh aixhVar, String str, int i) {
        PendingIntent b;
        PlayerResponseModel c;
        PlayerResponseModel c2;
        if (gle.d(aixhVar) && ((gkx) this.e.get()).b() == 3) {
            Resources resources = this.a.getResources();
            String string = resources.getString(R.string.disabled_pip_video_notification);
            dy dyVar = new dy(this.a);
            dx dxVar = new dx();
            dxVar.c(string);
            dyVar.s(dxVar);
            dyVar.r(R.drawable.quantum_ic_video_youtube_white_24);
            dyVar.z = wbs.W(this.a, R.attr.ytStaticBrandRed).orElse(resources.getColor(R.color.yt_youtube_red));
            dyVar.o(false);
            dyVar.g(true);
            dyVar.x = "status";
            dyVar.A = 1;
            dyVar.k = 0;
            if (aixhVar != null && (c2 = aixhVar.c()) != null) {
                dyVar.k(c2.x());
            }
            Context context = this.a;
            Intent intent = null;
            if (aixhVar != null && (c = aixhVar.c()) != null) {
                aifz d2 = PlaybackStartDescriptor.d();
                String y = c.y();
                if (str == null) {
                    str = "";
                }
                d2.a = aigp.f(y, str, i, (float) TimeUnit.MILLISECONDS.toSeconds(aixhVar.b()));
                WatchDescriptor watchDescriptor = new WatchDescriptor(d2.a());
                watchDescriptor.h();
                intent = fav.e(context).putExtra("watch", watchDescriptor).putExtra("playback_start_flag", 3);
            }
            if (intent != null && (b = uzj.b(this.a, intent, yny.M() | 134217728)) != null) {
                dyVar.g = b;
            }
            whl.y(dyVar);
            NotificationManager notificationManager = this.c;
            if (notificationManager != null) {
                notificationManager.notify(1008, dyVar.b());
            }
            Runnable runnable = this.b;
            if (runnable != null) {
                this.f.removeCallbacks(runnable);
                this.f.postDelayed(this.b, d);
            }
        }
    }

    public final void b() {
        NotificationManager notificationManager = this.c;
        if (notificationManager != null) {
            notificationManager.cancel(1008);
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
    }
}

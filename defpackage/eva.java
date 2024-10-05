package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eva {
    public final Context a;
    public final Resources b;
    public final ajjz c;
    public final NotificationManager d;
    public final ml e;
    public final afsy f;
    public final wjt g;
    public final wju h;
    public int i;
    public String j;
    public volatile String k;
    public dy l;
    public boolean m;
    private final aaea n;
    private dy o;

    public eva(Context context, ajjz ajjzVar, aaea aaeaVar, ml mlVar, afsy afsyVar, wjt wjtVar, wju wjuVar) {
        this.a = context;
        ajjzVar.getClass();
        this.c = ajjzVar;
        this.n = aaeaVar;
        this.e = mlVar;
        this.f = afsyVar;
        this.g = wjtVar;
        this.h = wjuVar;
        this.b = context.getResources();
        this.d = (NotificationManager) context.getSystemService("notification");
        this.m = false;
    }

    public final void a() {
        this.d.cancel(1005);
        this.m = false;
    }

    public final void b(AccountId accountId) {
        a();
        this.m = true;
        if (this.o == null) {
            dy dyVar = new dy(this.a);
            this.o = dyVar;
            whl.x(dyVar, this.a);
            Intent className = new Intent().setClassName(this.a, fav.f("honeycomb.Shell$HomeActivity"));
            Intent putExtra = fav.c(this.a).putExtra(":android:no_headers", true).putExtra("background_settings", true);
            if (accountId != null) {
                alxb.a(putExtra, accountId);
            }
            String string = this.b.getString(R.string.background_settings_notification_message, evr.C(this.n, this.a));
            dx dxVar = new dx();
            dxVar.c(string);
            dy dyVar2 = this.o;
            dyVar2.k(this.b.getString(R.string.pref_background_options_title));
            dyVar2.j(string);
            dyVar2.u(this.b.getString(R.string.background_settings_is_on_title));
            dyVar2.i(null);
            dyVar2.r(R.drawable.quantum_ic_video_youtube_white_24);
            dyVar2.o(false);
            dyVar2.g(true);
            dyVar2.s(dxVar);
            dyVar2.z = this.b.getColor(R.color.yt_youtube_red);
            dyVar2.g = PendingIntent.getActivity(this.a, 1, className, yny.M() | 134217728);
            dyVar2.e(R.drawable.ic_notification_settings, this.b.getString(R.string.background_settings_notification_action_button), PendingIntent.getActivity(this.a, 2, putExtra, 134217728 | yny.M()));
            dyVar2.A = 1;
        }
        this.o.w(System.currentTimeMillis());
        this.d.notify(1005, this.o.b());
    }
}

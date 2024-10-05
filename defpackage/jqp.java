package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqp extends agol {
    public final Resources a;
    public final agzr b;
    public agfo c;
    private final Context d;
    private final azrw e;
    private final agoo f;
    private final azrw g;
    private final jqq h;
    private final ysy i;
    private final HashMap j;
    private final jqr k;
    private final ajm l;
    private final IntentFilter m;

    public jqp(Context context, shf shfVar, agoo agooVar, azrw azrwVar, agom agomVar, azrw azrwVar2, jqq jqqVar, ysy ysyVar, jqr jqrVar, azrw azrwVar3, agzr agzrVar) {
        super(shfVar, azrwVar, agomVar, agzrVar);
        this.d = context;
        this.e = azrwVar2;
        this.h = jqqVar;
        this.i = ysyVar;
        this.a = context.getResources();
        this.b = agzrVar;
        this.j = new HashMap();
        this.f = agooVar;
        this.g = azrwVar;
        this.k = jqrVar;
        IntentFilter intentFilter = new IntentFilter();
        this.m = intentFilter;
        intentFilter.addAction("com.google.android.youtube.action.offline_notification_cancel_transfer");
        context.registerReceiver(new jqn(this, azrwVar3), intentFilter);
        this.l = ajm.a();
    }

    private final dy E(String str, boolean z, boolean z2) {
        String G = z ? G(str, z2) : str;
        if (this.j.containsKey(G)) {
            return (dy) this.j.get(G);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.d.getApplicationContext(), G.hashCode(), new Intent("com.google.android.youtube.action.offline_notification_cancel_transfer").putExtra(true != z ? "video_id" : "playlist_id", str).putExtra("is_sync", z2), yny.M() | 134217728);
        dy a = this.f.a();
        a.z = wbs.W(this.d, R.attr.ytStaticBrandRed).orElse(this.a.getColor(R.color.yt_youtube_red));
        a.A = 1;
        a.e(R.drawable.ic_cancel, this.a.getString(R.string.notification_cancel_transfer), broadcast);
        this.j.put(G, a);
        return a;
    }

    private final dy F() {
        dy a = this.f.a();
        a.w(System.currentTimeMillis());
        a.z = wbs.W(this.d, R.attr.ytStaticBrandRed).orElse(this.a.getColor(R.color.yt_youtube_red));
        a.A = 1;
        return a;
    }

    private static String G(String str, boolean z) {
        return z ? "sync:".concat(str) : str;
    }

    private final void H(dy dyVar, agnh agnhVar, int i) {
        String string;
        int i2;
        if (agnhVar.g) {
            string = this.d.getString(R.string.notification_playlist_error);
            i2 = R.drawable.ic_notification_error_small;
        } else {
            string = this.d.getString(i);
            i2 = R.drawable.ic_notification_offline_complete;
        }
        agng agngVar = agnhVar.a;
        String str = agngVar.a;
        dyVar.k(agngVar.b);
        dyVar.j(string);
        dyVar.i(null);
        dyVar.r(i2);
        dyVar.q(0, 0, false);
        dyVar.o(false);
        dyVar.g(true);
        dyVar.g = PendingIntent.getActivity(this.d, str.hashCode(), this.h.a(str), yny.M() | 1073741824);
    }

    private final void I(agnv agnvVar) {
        String string;
        int i;
        String m = agnvVar.m();
        if (agnvVar.u()) {
            string = agnvVar.l(agnvVar.i(), this.d);
            i = R.drawable.ic_notification_error_small;
        } else {
            string = this.d.getString(R.string.notification_video_download_completed);
            i = R.drawable.ic_notification_offline_complete;
        }
        dy F = F();
        F.j(string);
        F.k(agnvVar.o(this.d));
        F.i(null);
        F.r(i);
        F.q(0, 0, false);
        F.o(false);
        F.g(true);
        F.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), yny.M() | 1073741824);
        J(F, m, 1, agnvVar.g());
    }

    private final void J(dy dyVar, String str, int i, Uri uri) {
        if (!this.b.b()) {
            f(dyVar.b(), str, i);
        }
        if (uri == null) {
            f(dyVar.b(), str, i);
        }
        if (uri == null) {
            return;
        }
        ((ajjz) this.e.get()).l(uri, new jqo(this, dyVar, str, i));
    }

    public static String b(long j) {
        if (j < 1048576) {
            Locale locale = Locale.getDefault();
            double d = j;
            Double.isNaN(d);
            return String.format(locale, "%.1f", Double.valueOf(d / 1048576.0d));
        }
        return Long.toString(yjj.A(j));
    }

    @Override // defpackage.agon
    public final Notification a() {
        jqr jqrVar = this.k;
        jqrVar.a.d(acsb.b(28631), null, null);
        jqrVar.a.n(new acqx(acsb.c(113353)));
        dy F = F();
        F.k(this.d.getString(R.string.offline_fallback_notification));
        F.r(R.drawable.ic_notification_offline_progress);
        F.q(0, 0, false);
        F.o(false);
        F.g(false);
        return F.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agol
    public final synchronized void c(String str) {
        super.c(str);
        this.j.remove(G(str, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agol
    public final synchronized void d(String str) {
        super.d(str);
        this.j.remove(G(str, true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agol
    public final synchronized void e(String str) {
        super.e(str);
        this.j.remove(str);
    }

    public final void f(Notification notification, String str, int i) {
        if (i == 0) {
            y(str, notification);
            return;
        }
        if (i == 1) {
            x(str, notification);
            return;
        }
        if (i == 2) {
            t(str, notification);
            return;
        }
        if (i == 3) {
            s(str, notification);
            return;
        }
        if (i == 7) {
            v(str, notification);
        } else if (i == 8) {
            u(str, notification);
        } else {
            if (i != 9) {
                return;
            }
            w(str, notification);
        }
    }

    @Override // defpackage.agon
    public final void g(String str) {
        if (this.j.containsKey(str)) {
            ((dy) this.j.get(str)).w(System.currentTimeMillis());
        }
    }

    @Override // defpackage.agol
    protected final void h(agnh agnhVar) {
        dy F = F();
        H(F, agnhVar, R.string.notification_playlist_completed);
        agng agngVar = agnhVar.a;
        J(F, agngVar.a, 3, agngVar.a());
    }

    @Override // defpackage.agol
    protected final void i(agnh agnhVar) {
        String quantityString;
        boolean z;
        boolean z2;
        String d = agnhVar.d();
        dy E = E(d, true, false);
        String d2 = agnhVar.d();
        int c = agnhVar.c();
        int a = agnhVar.a();
        int i = agnhVar.e;
        if (!this.i.o()) {
            quantityString = this.d.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        } else {
            quantityString = this.a.getQuantityString(R.plurals.notification_playlist_progress_size, c, Integer.valueOf(a), Integer.valueOf(c));
            z = true;
            z2 = false;
        }
        E.k(agnhVar.a.b);
        E.i(this.d.getString(R.string.percent, Integer.valueOf(i)));
        E.j(quantityString);
        E.r(R.drawable.ic_notification_offline_progress);
        E.q(100, i, false);
        E.o(z);
        E.g(z2);
        E.p();
        E.g = PendingIntent.getActivity(this.d, 0, this.h.a(d2), yny.M() | 134217728);
        J(E, d, 2, agnhVar.a.a());
    }

    @Override // defpackage.agol
    protected final void j(agnh agnhVar) {
        dy F = F();
        H(F, agnhVar, R.string.notification_playlist_sync_completed);
        agng agngVar = agnhVar.a;
        J(F, agngVar.a, 8, agngVar.a());
    }

    @Override // defpackage.agol
    protected final void k(agnh agnhVar) {
        String quantityString;
        boolean z;
        boolean z2;
        String d = agnhVar.d();
        dy E = E(d, true, true);
        String d2 = agnhVar.d();
        int c = agnhVar.c();
        int a = agnhVar.a();
        int i = agnhVar.f;
        int i2 = agnhVar.b;
        if (!this.i.o()) {
            quantityString = this.d.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        } else {
            int i3 = c - i2;
            quantityString = this.a.getQuantityString(R.plurals.notification_playlist_progress_size, i3, Integer.valueOf(a - i2), Integer.valueOf(i3));
            z = true;
            z2 = false;
        }
        String valueOf = String.valueOf(this.d.getString(R.string.offline_sync_notification));
        String valueOf2 = String.valueOf(quantityString);
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        E.k(agnhVar.a.b);
        E.i(this.d.getString(R.string.percent, Integer.valueOf(i)));
        E.j(concat);
        E.r(R.drawable.ic_notification_offline_progress);
        E.q(100, i, false);
        E.o(z);
        E.g(z2);
        E.g = PendingIntent.getActivity(this.d, 0, this.h.a(d2), yny.M() | 134217728);
        J(E, d, 7, agnhVar.a.a());
    }

    @Override // defpackage.agol
    protected final void l(agnv agnvVar) {
        I(agnvVar);
    }

    @Override // defpackage.agol
    protected final void m(agnv agnvVar) {
        I(agnvVar);
    }

    @Override // defpackage.agol
    protected final void o(agnv agnvVar, boolean z) {
        if (z) {
            dy F = F();
            F.k(this.d.getString(R.string.offline_renew_title));
            F.j(this.d.getString(R.string.offline_renew));
            F.r(R.drawable.ic_notification_offline_progress);
            F.o(true);
            F.g(false);
            F.g = PendingIntent.getActivity(this.d, agnvVar.m().hashCode(), this.h.b(), yny.M() | 134217728);
            f(F.b(), "14", 9);
        }
    }

    @Override // defpackage.agol
    protected final void p(agnv agnvVar) {
        boolean contains = ((agof) this.g.get()).a().k().f(agnvVar.m()).contains(jvd.a);
        if (!contains || Build.VERSION.SDK_INT >= 28) {
            dy F = F();
            F.k(this.d.getString(true != contains ? R.string.offline_thumbnail_updating_notification : R.string.notification_download_recs_refreshing));
            F.r(R.drawable.ic_notification_offline_progress);
            F.q(0, 0, false);
            F.o(true);
            F.g(false);
            F.g = PendingIntent.getActivity(this.d, agnvVar.m().hashCode(), this.h.b(), yny.M() | 134217728);
            D(F.b());
            if (contains) {
                jqr jqrVar = this.k;
                jqrVar.a.d(acsb.b(28631), null, null);
                jqrVar.a.n(new acqx(acsb.c(113352)));
            } else {
                jqr jqrVar2 = this.k;
                jqrVar2.a.d(acsb.b(28631), null, null);
                jqrVar2.a.n(new acqx(acsb.c(113354)));
            }
        }
    }

    @Override // defpackage.agon
    public final void q(agfo agfoVar) {
        this.c = agfoVar;
    }

    @Override // defpackage.agol
    protected final void n(agnv agnvVar) {
        boolean z;
        String m = agnvVar.m();
        long e = agnvVar.e();
        long d = agnvVar.d();
        int i = d <= 0 ? 0 : (int) ((100 * e) / d);
        boolean z2 = true;
        String string = this.d.getString(R.string.percent, Integer.valueOf(i));
        String string2 = this.d.getString(R.string.notification_progress_size, this.l.b(b(e)), this.l.b(b(d)));
        dy E = E(m, false, false);
        E.i(string);
        E.j(string2);
        E.q(100, i, false);
        dy E2 = E(m, false, false);
        agnq i2 = agnvVar.i();
        if (!this.i.o()) {
            E2.j(this.d.getString(R.string.offline_waiting_for_network));
        } else if (i2 == agnq.TRANSFER_PENDING_WIFI) {
            E2.j(this.d.getString(R.string.offline_waiting_for_wifi));
        } else if (i2 == agnq.TRANSFER_PENDING_TOOTHFAIRY) {
            E2.j(this.d.getString(R.string.offline_waiting_for_discount));
        } else {
            z = false;
            E2.k(agnvVar.o(this.d));
            E2.r(R.drawable.ic_notification_offline_progress);
            E2.o(z2);
            E2.g(z);
            E2.p();
            E2.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), yny.M() | 134217728);
            J(E2, m, 0, agnvVar.g());
        }
        z = true;
        z2 = false;
        E2.k(agnvVar.o(this.d));
        E2.r(R.drawable.ic_notification_offline_progress);
        E2.o(z2);
        E2.g(z);
        E2.p();
        E2.g = PendingIntent.getActivity(this.d, m.hashCode(), this.h.b(), yny.M() | 134217728);
        J(E2, m, 0, agnvVar.g());
    }
}

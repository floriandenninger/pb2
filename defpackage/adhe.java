package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adhe implements ykl {
    final /* synthetic */ Resources a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ acvd d;
    final /* synthetic */ adhf e;
    final /* synthetic */ adhm f;

    public adhe(adhf adhfVar, Resources resources, String str, String str2, acvd acvdVar, adhm adhmVar) {
        this.e = adhfVar;
        this.a = resources;
        this.b = str;
        this.c = str2;
        this.d = acvdVar;
        this.f = adhmVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = adhq.a;
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Error downloading ");
        sb.append(valueOf);
        zga.f(str, sb.toString(), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        adhc adhcVar = this.e.e;
        adhcVar.b.d(acsb.b(38696), null, null);
        adhcVar.b.n(new acqx(acsb.c(41738)));
        adhcVar.b.n(new acqx(acsb.c(41740)));
        adhcVar.b.n(new acqx(acsb.c(41739)));
        InteractionLoggingScreen interactionLoggingScreen = ((acqq) adhcVar.b).g;
        String string = this.a.getString(R.string.continue_watching_on_tv_title, this.b);
        String string2 = this.a.getString(R.string.continue_watching_on_tv_text, this.c);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.a, R.drawable.ic_yt_cast_disconnected);
        dy dyVar = new dy(this.e.a);
        dyVar.A = 1;
        dyVar.z = wbs.W(this.e.a, R.attr.ytStaticBrandRed).orElse(aih.d(this.e.a, R.color.yt_youtube_red));
        dyVar.r(this.e.b);
        dyVar.k(string);
        dyVar.j(string2);
        dyVar.g(true);
        dyVar.n(decodeResource);
        Context context = this.e.a;
        acvd acvdVar = this.d;
        Intent className = new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.background.MdxBackgroundPlaybackBroadcastReceiver");
        className.putExtra("com.google.android.libraries.youtube.mdx.background.route_id", acvdVar.a);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.device_name", acvdVar.b);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_id", acvdVar.d.e);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.video_id", acvdVar.d.b);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", acvdVar.d.c);
        className.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", acvdVar.d.f);
        int i = acvdVar.e;
        int i2 = i - 1;
        if (i != 0) {
            className.putExtra("com.google.android.libraries.youtube.mdx.background.session_type", i2);
            className.putExtra("com.google.android.libraries.youtube.mdx.background.timeout", acvdVar.c);
            if (interactionLoggingScreen != null) {
                className.putExtra("com.google.android.libraries.youtube.mdx.background.ve_screen", interactionLoggingScreen);
                className.putExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 41738);
            }
            className.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            dyVar.g = PendingIntent.getBroadcast(context, 3, className, yny.M() | 134217728);
            Context context2 = this.e.a;
            Intent className2 = new Intent().setClassName(context2, "com.google.android.libraries.youtube.mdx.notification.continueontv.ContinueWatchingOnTvNotificationBroadcastReceiver");
            className2.setAction("com.google.android.libraries.youtube.mdx.notification.action.DISMISS");
            className2.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            dyVar.m(PendingIntent.getBroadcast(context2, 2, className2, yny.M() | 134217728));
            String string3 = this.a.getString(R.string.turn_off_notification);
            Context context3 = this.e.a;
            Intent className3 = new Intent().setClassName(context3, "com.google.android.libraries.youtube.mdx.notification.continueontv.ContinueWatchingOnTvNotificationBroadcastReceiver");
            className3.setAction("com.google.android.libraries.youtube.mdx.notification.action.NO_THANKS");
            className3.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
            dyVar.f(new du(0, string3, PendingIntent.getBroadcast(context3, 1, className3, yny.M() | 134217728)).a());
            dw dwVar = new dw();
            dwVar.d(string);
            dwVar.e(string2);
            dwVar.c(decodeResource);
            dwVar.a = bitmap;
            dyVar.s(dwVar);
            whl.y(dyVar);
            this.e.d.f("continue-watching", 6, dyVar.b());
            final adhm adhmVar = this.f;
            acvd acvdVar2 = this.d;
            adhq adhqVar = adhmVar.a;
            ynm.k(((vgz) adhqVar.f.a.get()).b(new wgt(adhqVar.d.c(), acvdVar2.a, 2), angq.a), angq.a, adha.e, new ynl() { // from class: adhl
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj3) {
                    adhm.this.a.rb();
                }
            });
            return;
        }
        throw null;
    }
}

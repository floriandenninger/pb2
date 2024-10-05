package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvg implements acvh {
    public static final String a = zga.a("MDX.backgroudPlaybackPresenter");
    public acvd b;
    public final acve c;
    public acuq d;
    private final eg e;
    private final Context f;
    private final int g;
    private boolean h;
    private final BroadcastReceiver i = new acvf(this);

    public acvg(eg egVar, Context context, int i, acve acveVar) {
        this.e = egVar;
        this.f = context;
        this.g = i;
        this.c = acveVar;
    }

    private static Intent g(String str, InteractionLoggingScreen interactionLoggingScreen) {
        Intent intent = new Intent(str);
        if (interactionLoggingScreen != null) {
            intent.putExtra("INTERACTION_SCREEN", interactionLoggingScreen);
        }
        return intent;
    }

    private final dy h(boolean z, InteractionLoggingScreen interactionLoggingScreen) {
        dy dyVar = new dy(this.f);
        dyVar.r(this.g);
        dyVar.z = wbs.W(this.f, R.attr.ytStaticBrandRed).orElse(aih.d(this.f, R.color.yt_youtube_red));
        dyVar.q(0, 0, z);
        dyVar.w = true;
        dyVar.g(true);
        dyVar.k = 0;
        dyVar.m(PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED", interactionLoggingScreen), yny.M() | 134217728));
        whl.y(dyVar);
        return dyVar;
    }

    private final void i() {
        if (this.h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL");
        intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED");
        this.f.registerReceiver(this.i, intentFilter);
        this.h = true;
    }

    @Override // defpackage.acvh
    public final void a() {
        this.d = null;
        this.e.c(6);
        e();
    }

    @Override // defpackage.acvh
    public final void b(acvd acvdVar) {
        i();
        this.b = acvdVar;
        acve acveVar = this.c;
        acveVar.g.d(acve.b, null, null);
        acveVar.g.n(new acqx(acve.e));
        acveVar.g.n(new acqx(acve.f));
        InteractionLoggingScreen interactionLoggingScreen = ((acqq) acveVar.g).g;
        dy h = h(false, interactionLoggingScreen);
        h.k(this.f.getResources().getString(R.string.mdx_background_playback_error_title, acvdVar.b));
        h.j(this.f.getResources().getString(R.string.mdx_background_playback_error_text));
        h.g = PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY", interactionLoggingScreen), yny.M() | 134217728);
        h.f(new du(0, this.f.getResources().getString(R.string.mdx_background_playback_error_help), PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP", interactionLoggingScreen), 134217728 | yny.M())).a());
        this.e.e(6, h.b());
    }

    @Override // defpackage.acvh
    public final void c(acvd acvdVar) {
        i();
        this.b = null;
        acve acveVar = this.c;
        acveVar.g.d(acve.b, null, null);
        acveVar.g.n(new acqx(acve.c));
        acveVar.g.n(new acqx(acve.d));
        InteractionLoggingScreen interactionLoggingScreen = ((acqq) acveVar.g).g;
        dy h = h(true, interactionLoggingScreen);
        h.k(this.f.getString(R.string.mdx_background_playback_connecting, acvdVar.b));
        h.k = 1;
        h.f(new du(0, this.f.getResources().getString(R.string.mdx_background_playback_cancel), PendingIntent.getBroadcast(this.f, 0, g("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL", interactionLoggingScreen), yny.M() | 134217728)).a());
        this.e.e(6, h.b());
    }

    @Override // defpackage.acvh
    public final void d() {
        i();
        this.b = null;
        this.e.e(6, h(false, null).b());
    }

    public final void e() {
        if (this.h) {
            this.f.unregisterReceiver(this.i);
            this.h = false;
        }
    }

    @Override // defpackage.acvh
    public final void f(acuq acuqVar) {
        acuqVar.getClass();
        this.d = acuqVar;
    }
}

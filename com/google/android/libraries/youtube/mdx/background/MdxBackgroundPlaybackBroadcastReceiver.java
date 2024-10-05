package com.google.android.libraries.youtube.mdx.background;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acux;
import defpackage.acva;
import defpackage.acvc;
import defpackage.acvd;
import defpackage.adld;
import defpackage.adle;
import defpackage.amkq;
import defpackage.ammx;
import defpackage.zga;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxBackgroundPlaybackBroadcastReceiver extends acux {
    private static final String c = zga.a("MDX.MdxBackgroundPlaybackBroadcastReceiver");
    public acva a;
    public acra b;

    @Override // defpackage.acux, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        String stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.route_id");
        String stringExtra2 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.device_name");
        String stringExtra3 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.playlist_id");
        String stringExtra4 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.video_id");
        int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.session_type", -1);
        if (ammx.e(stringExtra) || ammx.e(stringExtra2) || ((ammx.e(stringExtra3) && ammx.e(stringExtra4)) || intExtra == -1)) {
            zga.m(c, "playback request not valid, ignoring");
            return;
        }
        int intExtra2 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.timeout", -1);
        acvc a = acvd.a();
        a.c(stringExtra);
        a.e(amkq.cS(intExtra));
        a.b(stringExtra2);
        adld c2 = adle.c();
        c2.d(zhq.h(stringExtra3));
        c2.f(zhq.h(stringExtra4));
        c2.b(intent.getLongExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", 0L));
        c2.e(intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", 0));
        a.a = c2.a();
        if (intExtra2 >= 0) {
            a.d(intExtra2);
        }
        zga.h(c, "starting background playback");
        this.a.e(a.a());
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.background.ve_screen");
        int intExtra3 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 0);
        if (interactionLoggingScreen == null || intExtra3 == 0) {
            return;
        }
        this.b.B(interactionLoggingScreen);
        this.b.I(3, new acqx(acsb.c(intExtra3)), null);
    }
}

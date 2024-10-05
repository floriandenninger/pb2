package com.google.android.libraries.youtube.mdx.notification.continueontv;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import defpackage.acqq;
import defpackage.acqx;
import defpackage.acsb;
import defpackage.aczu;
import defpackage.adha;
import defpackage.adhc;
import defpackage.adhd;
import defpackage.adhr;
import defpackage.ajoy;
import defpackage.angq;
import defpackage.vgz;
import defpackage.ynm;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ContinueWatchingOnTvNotificationBroadcastReceiver extends adhr {
    private static final String d = zga.a("MDX.ContinueWatchingBroadcastReceiver");
    public adhd a;
    public adhc b;
    public ajoy c;

    @Override // defpackage.adhr, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        c(context);
        InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen) intent.getParcelableExtra("INTERACTION_SCREEN");
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1644207426) {
            if (action.equals("com.google.android.libraries.youtube.mdx.notification.action.NO_THANKS")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 531238881) {
            if (hashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.libraries.youtube.mdx.notification.action.DISMISS")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            ynm.m(((vgz) this.c.a.get()).b(aczu.j, angq.a), adha.a);
            this.a.e();
            adhc adhcVar = this.b;
            if (interactionLoggingScreen == null && ((acqq) adhcVar.b).g == null) {
                zga.m(adhc.a, "Interaction logging screen is not set");
            }
            adhcVar.b.B(interactionLoggingScreen);
            adhcVar.b.I(3, new acqx(acsb.c(41740)), null);
            return;
        }
        if (c != 1) {
            if (c == 2) {
                ynm.m(this.c.r(), adha.c);
                return;
            }
            String str = d;
            String valueOf = String.valueOf(action);
            zga.m(str, valueOf.length() != 0 ? "Invalid action:".concat(valueOf) : new String("Invalid action:"));
            return;
        }
        adhc adhcVar2 = this.b;
        if (interactionLoggingScreen == null && ((acqq) adhcVar2.b).g == null) {
            zga.m(adhc.a, "Interaction logging screen is not set");
        }
        adhcVar2.b.B(interactionLoggingScreen);
        adhcVar2.b.I(3, new acqx(acsb.c(41739)), null);
    }
}

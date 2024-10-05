package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.acsb;
import defpackage.adxr;
import defpackage.ahuk;
import defpackage.ahvc;
import defpackage.ahvm;
import defpackage.ainy;
import defpackage.alta;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.rql;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends ahvm {
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h a;
    public final i b;
    public final aahd c;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b d;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b e;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c f;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b g;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b h;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b i;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b j;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b k;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b l;
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f m;
    public final aaea n;
    public apmg o;
    public apxf p;
    public final rql q;

    public j(ainy ainyVar, ahuk ahukVar, ahvc ahvcVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b bVar2, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service.b bVar3, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar4, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar5, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b bVar6, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b bVar7, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service.b bVar8, adxr adxrVar, ScheduledExecutorService scheduledExecutorService, Executor executor, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar, aahd aahdVar, rql rqlVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f fVar, aaea aaeaVar, byte[] bArr) {
        super(ainyVar, ahukVar, ahvcVar, adxrVar, scheduledExecutorService, executor);
        this.a = hVar;
        this.c = aahdVar;
        this.b = new i(this);
        this.q = rqlVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = cVar;
        this.g = bVar3;
        this.h = bVar4;
        this.i = bVar5;
        this.j = bVar6;
        this.k = bVar7;
        this.l = bVar8;
        this.m = fVar;
        this.n = aaeaVar;
        final int i = 1;
        rqlVar.a(R.id.api_watch_in_youtube_button, new Runnable(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.g
            public final /* synthetic */ j a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    j jVar = this.a;
                    apxf apxfVar = jVar.p;
                    if (apxfVar == null) {
                        alta.B("Title deeplink not available.", new Object[0]);
                        return;
                    } else {
                        jVar.m.i(acsb.c(23851));
                        aahc.a(jVar.c, apxfVar);
                        return;
                    }
                }
                j jVar2 = this.a;
                apmg apmgVar = jVar2.o;
                if (apmgVar == null) {
                    alta.B("Watch in YouTube button renderer not available.", new Object[0]);
                    return;
                }
                jVar2.m.j(apmgVar.t.I());
                aahd aahdVar2 = jVar2.c;
                apxf apxfVar2 = apmgVar.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahc.a(aahdVar2, apxfVar2);
            }
        });
        final int i2 = 0;
        rqlVar.a(R.id.player_video_title_view, new Runnable(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.g
            public final /* synthetic */ j a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    j jVar = this.a;
                    apxf apxfVar = jVar.p;
                    if (apxfVar == null) {
                        alta.B("Title deeplink not available.", new Object[0]);
                        return;
                    } else {
                        jVar.m.i(acsb.c(23851));
                        aahc.a(jVar.c, apxfVar);
                        return;
                    }
                }
                j jVar2 = this.a;
                apmg apmgVar = jVar2.o;
                if (apmgVar == null) {
                    alta.B("Watch in YouTube button renderer not available.", new Object[0]);
                    return;
                }
                jVar2.m.j(apmgVar.t.I());
                aahd aahdVar2 = jVar2.c;
                apxf apxfVar2 = apmgVar.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahc.a(aahdVar2, apxfVar2);
            }
        });
    }
}

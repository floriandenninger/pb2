package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service;

import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.AutoValue_SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import defpackage.aahd;
import defpackage.aazx;
import defpackage.abab;
import defpackage.afsi;
import defpackage.afsy;
import defpackage.ajcq;
import defpackage.aots;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.arfr;
import defpackage.arfs;
import defpackage.aulq;
import defpackage.avaa;
import defpackage.avab;
import defpackage.avac;
import defpackage.yjk;
import defpackage.ysy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements d {
    public final aahd a;
    public avaa b = avaa.a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b c = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b.U;
    private final ysy d;
    private final afsy e;
    private final abab f;
    private boolean g;

    public b(aahd aahdVar, ysy ysyVar, afsy afsyVar, abab ababVar) {
        this.a = aahdVar;
        this.d = ysyVar;
        this.e = afsyVar;
        this.f = ababVar;
    }

    public static SubscriptionNotificationButtonData a(avab avabVar) {
        apmg apmgVar;
        avac avacVar = avabVar.e;
        if (avacVar == null) {
            avacVar = avac.a;
        }
        if (avacVar.b == 65153809) {
            apmgVar = (apmg) avacVar.c;
        } else {
            apmgVar = apmg.a;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a e = SubscriptionNotificationButtonData.e();
        e.c(avabVar.c);
        arfs arfsVar = apmgVar.g;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        e.b(f(b));
        aots aotsVar = apmgVar.r;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        e.a = aotsVar.c;
        e.d(apmgVar.t);
        return e.a();
    }

    private static int f(arfr arfrVar) {
        arfr arfrVar2 = arfr.UNKNOWN;
        int ordinal = arfrVar.ordinal();
        if (ordinal == 251) {
            return 1;
        }
        if (ordinal != 257) {
            return ordinal != 258 ? 0 : 3;
        }
        return 2;
    }

    public final avab b(int i) {
        for (avab avabVar : this.b.c) {
            if (avabVar.c == i) {
                return avabVar;
            }
        }
        afsi.b(2, 4, "SubscriptionNotificationToggleState not found for given id.");
        return avab.a;
    }

    public final void c() {
        yjk.f();
        this.c.w(SubscriptionNotificationButtonData.a);
        this.b = avaa.a;
    }

    public final void d(avaa avaaVar) {
        yjk.f();
        avaaVar.getClass();
        this.b = avaaVar;
        if ((avaaVar.b & 1) == 0 || avaaVar.c.size() == 0) {
            c();
            return;
        }
        this.c.w(a(b(avaaVar.d)));
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (avab avabVar : this.b.c) {
            if ((avabVar.b & 16) != 0) {
                aulq aulqVar = avabVar.f;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
                aqyg aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                String obj = ajcq.b(aqygVar).toString();
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.b g = SubscriptionNotificationMenuItem.g();
                g.d(avabVar.c);
                g.c(apmgVar.h);
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                g.b(f(b));
                g.a = obj;
                g.b = obj;
                g.e(apmgVar.t);
                SubscriptionNotificationMenuItem a = g.a();
                if (!((AutoValue_SubscriptionNotificationMenuItem) a).a) {
                    arrayList.add(a);
                }
            }
        }
        bVar.x(new SubscriptionNotificationMenuData(arrayList));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d
    public final void h(SubscriptionNotificationMenuItem subscriptionNotificationMenuItem) {
        yjk.f();
        if (this.g) {
            return;
        }
        if (!this.e.t()) {
            afsi.b(2, 4, "Subscription notification button click but no user signed in.");
            return;
        }
        avab b = b(subscriptionNotificationMenuItem.b());
        aulq aulqVar = b.f;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apxf apxfVar = ((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer)).n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aazx a = this.f.a();
        a.a = ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) apxfVar.pX(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint)).b;
        a.m(apxfVar.c.I());
        this.g = true;
        if (this.d.p()) {
            this.c.w(a(b));
        }
        this.f.b(a, new a(this));
    }
}

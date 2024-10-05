package com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.service;

import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import defpackage.aahd;
import defpackage.abda;
import defpackage.abdd;
import defpackage.abdf;
import defpackage.afsy;
import defpackage.ajcq;
import defpackage.aomf;
import defpackage.aone;
import defpackage.aong;
import defpackage.aonk;
import defpackage.apde;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.auzh;
import defpackage.auzj;
import defpackage.avaa;
import defpackage.yjk;
import defpackage.ysy;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a {
    public final aahd a;
    public int c;
    private final ysy d;
    private final afsy e;
    private final abdd f;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b h;
    private String i;
    private String j;
    private boolean l;
    public auzj b = auzj.a;
    private c g = c.U;
    private aomf k = aomf.b;

    public b(aahd aahdVar, ysy ysyVar, afsy afsyVar, abdd abddVar) {
        this.a = aahdVar;
        this.d = ysyVar;
        this.e = afsyVar;
        this.f = abddVar;
    }

    public final int a() {
        yjk.f();
        return this.c;
    }

    public final void b(auzj auzjVar, c cVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b bVar2) {
        avaa avaaVar;
        yjk.f();
        auzjVar.getClass();
        this.b = auzjVar;
        cVar.getClass();
        this.g = cVar;
        this.h = bVar;
        int i = this.b.b;
        if ((i & 4) != 0 && (i & 8) != 0 && (i & 4096) != 0 && (i & 1024) != 0) {
            aqyg aqygVar = auzjVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            this.i = ajcq.b(aqygVar).toString();
            aqyg aqygVar2 = auzjVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            this.j = ajcq.b(aqygVar2).toString();
            this.k = auzjVar.D;
            if (auzjVar.n) {
                this.c = !auzjVar.l ? 2 : 3;
            } else {
                this.c = 1;
            }
            c(a());
            if (bVar == null || bVar2 == null) {
                return;
            }
            auzh auzhVar = auzjVar.p;
            if (auzhVar == null) {
                auzhVar = auzh.a;
            }
            if (auzhVar.b == 136076983) {
                avaaVar = (avaa) auzhVar.c;
            } else {
                avaaVar = avaa.a;
            }
            yjk.f();
            bVar.c = bVar2;
            bVar.d(avaaVar);
            return;
        }
        this.c = 0;
        c(a());
    }

    public final void c(int i) {
        String str;
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e = SubscribeButtonData.e();
        e.e(i);
        e.f(this.k);
        if (i == 0 || i == 1) {
            str = null;
        } else {
            if (i != 2) {
                String str2 = this.j;
                e.a = str2;
                e.b = str2;
                this.g.u(e.d());
            }
            str = this.i;
        }
        e.a = str;
        e.b = str;
        this.g.u(e.d());
    }

    public final void d(avaa avaaVar) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar = this.h;
        if (bVar != null) {
            bVar.d(avaaVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a
    public final void g() {
        yjk.f();
        if (a() == 1 || a() == 0 || this.l) {
            return;
        }
        if (!this.e.t()) {
            aahd aahdVar = this.a;
            String builder = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("channel").appendPath(this.b.f).toString();
            aong aongVar = (aong) apxf.a.createBuilder();
            aonk aonkVar = AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
            aone createBuilder = apde.a.createBuilder();
            createBuilder.copyOnWrite();
            apde.b((apde) createBuilder.instance);
            createBuilder.copyOnWrite();
            apde apdeVar = (apde) createBuilder.instance;
            builder.getClass();
            apdeVar.b |= 4;
            apdeVar.e = builder;
            createBuilder.copyOnWrite();
            apde.a((apde) createBuilder.instance);
            aongVar.e(aonkVar, (apde) createBuilder.build());
            aahdVar.a((apxf) aongVar.build());
            return;
        }
        if (a() == 2) {
            apxf apxfVar = apxf.a;
            SubscribeEndpointOuterClass$SubscribeEndpoint subscribeEndpointOuterClass$SubscribeEndpoint = SubscribeEndpointOuterClass$SubscribeEndpoint.a;
            for (apxf apxfVar2 : this.b.x) {
                if (apxfVar2.pY(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint)) {
                    subscribeEndpointOuterClass$SubscribeEndpoint = (SubscribeEndpointOuterClass$SubscribeEndpoint) apxfVar2.pX(SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint);
                    apxfVar = apxfVar2;
                }
            }
            abda a = this.f.a();
            a.l(apxfVar.c);
            Iterator it = subscribeEndpointOuterClass$SubscribeEndpoint.b.iterator();
            while (it.hasNext()) {
                a.d((String) it.next());
            }
            a.b = subscribeEndpointOuterClass$SubscribeEndpoint.d;
            this.l = true;
            if (this.d.p()) {
                c(3);
            }
            this.f.e(a, new a(this, 1));
            return;
        }
        if (a() == 3) {
            apxf apxfVar3 = apxf.a;
            UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint = UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a;
            for (apxf apxfVar4 : this.b.x) {
                if (apxfVar4.pY(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint)) {
                    unsubscribeEndpointOuterClass$UnsubscribeEndpoint = (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint) apxfVar4.pX(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
                    apxfVar3 = apxfVar4;
                }
            }
            abdf b = this.f.b();
            b.l(apxfVar3.c);
            Iterator it2 = unsubscribeEndpointOuterClass$UnsubscribeEndpoint.c.iterator();
            while (it2.hasNext()) {
                b.d((String) it2.next());
            }
            b.b = unsubscribeEndpointOuterClass$UnsubscribeEndpoint.e;
            this.l = true;
            if (this.d.p()) {
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.service.b bVar = this.h;
                if (bVar != null) {
                    bVar.c();
                }
                c(2);
            }
            this.f.f(b, new a(this, 0));
        }
    }
}

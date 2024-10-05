package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PermissionsWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.PlayabilityStatusWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import defpackage.anaf;
import defpackage.apxf;
import defpackage.aqrz;
import defpackage.aryi;
import defpackage.azrh;
import defpackage.ecq;
import defpackage.ecr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class s extends ecq implements t {
    private final av a;

    public s(av avVar) {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
        this.a = avVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final String a(String str) {
        return this.a.d(str);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void f(PermissionsWrapper permissionsWrapper) {
        av avVar = this.a;
        boolean z = ((aqrz) permissionsWrapper.a).b;
        if (z && !avVar.a.isEmpty()) {
            for (au auVar : avVar.a) {
                avVar.k(auVar.b(), auVar.a());
            }
        }
        avVar.d.post(new am(avVar, z, 0));
        avVar.a.clear();
        avVar.t = true != z ? 3 : 2;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void g(CommandWrapper commandWrapper) {
        av avVar = this.a;
        apxf apxfVar = (apxf) commandWrapper.a;
        if (avVar.n()) {
            return;
        }
        avVar.g.a(apxfVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void h(final Bitmap bitmap) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.af
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.n(bitmap);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void i(boolean z) {
        av avVar = this.a;
        avVar.s = z;
        avVar.d.post(new am(avVar, z, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void j(PlayabilityStatusWrapper playabilityStatusWrapper) {
        av avVar = this.a;
        aryi aryiVar = (aryi) playabilityStatusWrapper.a;
        int bG = anaf.bG(aryiVar.c);
        if (bG == 0) {
            bG = 1;
        }
        if (bG == 1 || bG == 7) {
            avVar.b.a();
            avVar.d.post(new ap(avVar, 2));
        } else {
            ((com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.j) avVar.b).b(aryiVar, false, Optional.empty());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void k(boolean z) {
        av avVar = this.a;
        avVar.d.post(new am(avVar, z, 3));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void l(final SubscribeButtonData subscribeButtonData) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ai
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.u(subscribeButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void m(final SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.aj
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.w(subscriptionNotificationButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void n(final SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ak
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.x(subscriptionNotificationMenuData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void o(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar;
        av avVar = this.a;
        if (avVar.s || (dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) avVar.m.aO()) == null) {
            return;
        }
        azrh azrhVar = avVar.m;
        com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
        a.b = charSequence;
        azrhVar.c(a.a());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void p(int i) {
        av avVar = this.a;
        avVar.d.post(new aq(avVar, i, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void q(Bitmap bitmap) {
        av avVar = this.a;
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) avVar.m.aO();
        if (dVar != null) {
            azrh azrhVar = avVar.m;
            com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
            a.c = bitmap;
            azrhVar.c(a.a());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void r(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.model.d dVar;
        av avVar = this.a;
        if (avVar.s || (dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) avVar.m.aO()) == null) {
            return;
        }
        azrh azrhVar = avVar.m;
        com.google.android.apps.youtube.embeddedplayer.service.model.c a = dVar.a();
        a.a = charSequence;
        azrhVar.c(a.a());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void s(final VideoDetails videoDetails) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.ah
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.C(videoDetails);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final void t(final WatchLaterButtonData watchLaterButtonData) {
        final av avVar = this.a;
        avVar.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.jar.client.al
            @Override // java.lang.Runnable
            public final void run() {
                av avVar2 = av.this;
                avVar2.c.h.E(watchLaterButtonData);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.jar.client.t
    public final boolean u() {
        Optional a = this.a.c.h.a();
        if (a.isPresent()) {
            return ((View) a.get()).isAttachedToWindow();
        }
        return false;
    }

    public s() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                q((Bitmap) ecr.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                r(ecr.b(parcel));
                parcel2.writeNoException();
                return true;
            case 3:
                o(ecr.b(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                i(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                s((VideoDetails) ecr.a(parcel, VideoDetails.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                h((Bitmap) ecr.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                l((SubscribeButtonData) ecr.a(parcel, SubscribeButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                m((SubscriptionNotificationButtonData) ecr.a(parcel, SubscriptionNotificationButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                n((SubscriptionNotificationMenuData) ecr.a(parcel, SubscriptionNotificationMenuData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                p(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 11:
                t((WatchLaterButtonData) ecr.a(parcel, WatchLaterButtonData.CREATOR));
                parcel2.writeNoException();
                return true;
            case 12:
                k(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 13:
                j((PlayabilityStatusWrapper) ecr.a(parcel, PlayabilityStatusWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 15:
                boolean u = u();
                parcel2.writeNoException();
                ecr.e(parcel2, u);
                return true;
            case 16:
                f((PermissionsWrapper) ecr.a(parcel, PermissionsWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                g((CommandWrapper) ecr.a(parcel, CommandWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

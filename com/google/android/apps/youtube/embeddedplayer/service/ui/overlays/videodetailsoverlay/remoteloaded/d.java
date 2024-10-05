package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.remoteloaded.SubscribeButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.SubscriptionNotificationButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.m;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import defpackage.aomf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.d, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, g {
    public int a;
    public int b;
    public final FrameLayout c;
    public final SubscribeButton d;
    public a e;
    public b f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a g;
    private final CircularImageView j;
    private final TextView k;
    private final TextView l;
    private final Set m;
    private final TextView o;
    private final TextView p;
    private final Set q;
    private final SubscriptionNotificationButton s;
    private final View t;
    private final Animation u;
    private final Animation v;
    private final c w;
    private aomf n = aomf.b;
    private aomf r = aomf.b;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b h = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;

    private d(Context context, FrameLayout frameLayout) {
        this.c = frameLayout;
        LayoutInflater.from(context).inflate(R.layout.video_details_view, frameLayout);
        this.j = (CircularImageView) frameLayout.findViewById(R.id.channel_thumbnail);
        TextView textView = (TextView) frameLayout.findViewById(R.id.collapsed_title);
        this.k = textView;
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.collapsed_subtitle);
        this.l = textView2;
        HashSet hashSet = new HashSet();
        this.m = hashSet;
        hashSet.add(textView);
        hashSet.add(textView2);
        View findViewById = frameLayout.findViewById(R.id.expanded_top_bar);
        this.t = findViewById;
        TextView textView3 = (TextView) frameLayout.findViewById(R.id.expanded_title);
        this.o = textView3;
        TextView textView4 = (TextView) frameLayout.findViewById(R.id.expanded_subtitle);
        this.p = textView4;
        HashSet hashSet2 = new HashSet();
        this.q = hashSet2;
        hashSet2.add(findViewById);
        hashSet2.add(textView3);
        hashSet2.add(textView4);
        this.d = (SubscribeButton) frameLayout.findViewById(R.id.subscribe_button);
        SubscriptionNotificationButton subscriptionNotificationButton = (SubscriptionNotificationButton) frameLayout.findViewById(R.id.subscription_notification_button);
        this.s = subscriptionNotificationButton;
        subscriptionNotificationButton.a = new m(context);
        int integer = context.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.u = loadAnimation;
        long j = integer;
        loadAnimation.setDuration(j);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.v = loadAnimation2;
        loadAnimation2.setDuration(j);
        this.w = new c(this);
        this.a = 1;
        this.b = 1;
    }

    public static d a(Context context, FrameLayout frameLayout) {
        d dVar = new d(context, frameLayout);
        dVar.j.setOnClickListener(dVar);
        dVar.k.setOnClickListener(dVar);
        dVar.l.setOnClickListener(dVar);
        dVar.d.setOnClickListener(dVar);
        dVar.d.f = dVar;
        dVar.s.c = dVar;
        return dVar;
    }

    private final void n() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    private final void o() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
        SubscribeButton subscribeButton = this.d;
        int i = subscribeButton.e;
        if (i == 0 || i == 1) {
            subscribeButton.setVisibility(8);
        } else if (i == 2 || i == 3) {
            subscribeButton.setVisibility(0);
            this.h.c(this.d.d.I());
        } else {
            throw new AssertionError("Subscribe button in invalid state.");
        }
        SubscriptionNotificationButton subscriptionNotificationButton = this.s;
        if (subscriptionNotificationButton.e.equals(SubscriptionNotificationButtonData.a) || subscriptionNotificationButton.f.equals(SubscriptionNotificationMenuData.a)) {
            this.s.setVisibility(8);
            return;
        }
        int i2 = this.d.e;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.s.setVisibility(8);
        } else {
            if (i2 == 3) {
                this.s.setVisibility(0);
                this.h.c(this.s.e.c().I());
                return;
            }
            throw new AssertionError("Subscribe button in invalid state.");
        }
    }

    private static final void p(View view, Animation animation) {
        if (view.getVisibility() == 0) {
            view.startAnimation(animation);
        }
    }

    public final void b() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        this.d.setVisibility(8);
        this.s.setVisibility(8);
    }

    public final void c() {
        if (this.b == 3) {
            o();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.g
    public final void d() {
        c();
    }

    public final void e() {
        m(1);
        f(null);
        h(null);
        g(null);
        j(null);
        i(null);
    }

    public final void f(Bitmap bitmap) {
        this.j.setImageBitmap(bitmap);
    }

    public final void g(CharSequence charSequence) {
        this.l.setText(charSequence);
    }

    public final void h(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.p.setText(charSequence);
    }

    public final void j(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    public final void k(VideoDetails videoDetails) {
        if (videoDetails == null) {
            return;
        }
        if (videoDetails.equals(VideoDetails.a)) {
            e();
            return;
        }
        h(videoDetails.a().c());
        g(videoDetails.a().b());
        this.n = videoDetails.a().a();
        j(videoDetails.b().c());
        i(videoDetails.b().b());
        this.r = videoDetails.b().a();
        m(2);
    }

    public final void l() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
    }

    final void m(int i) {
        int i2 = this.b;
        if (i2 != i) {
            this.a = i2;
            this.b = i;
            if (i == 2) {
                this.h.c(this.n.I());
                this.j.setVisibility(0);
                if (i2 == 3) {
                    this.v.setAnimationListener(this.w);
                    Iterator it = this.q.iterator();
                    while (it.hasNext()) {
                        p((View) it.next(), this.v);
                    }
                    p(this.d, this.v);
                    p(this.s, this.v);
                    return;
                }
                b();
                l();
            } else if (i != 3) {
                this.j.setVisibility(8);
                n();
                b();
            } else {
                this.h.c(this.r.I());
                this.j.setVisibility(0);
                n();
                o();
                this.u.setAnimationListener(this.w);
                Iterator it2 = this.q.iterator();
                while (it2.hasNext()) {
                    p((View) it2.next(), this.u);
                }
                p(this.d, this.u);
                p(this.s, this.u);
            }
            a aVar = this.e;
            if (aVar != null) {
                aVar.K(this.b);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar;
        if (view == null) {
            return;
        }
        if (view == this.j) {
            int i = this.b;
            if (i == 3) {
                m(2);
                return;
            } else {
                if (i == 2) {
                    m(3);
                    return;
                }
                return;
            }
        }
        if (view == this.k || view == this.l) {
            b bVar = this.f;
            if (bVar != null) {
                bVar.i();
                this.h.a(this.n.I());
                return;
            }
            return;
        }
        if (view != this.d || (aVar = this.g) == null) {
            return;
        }
        aVar.g();
        this.h.a(this.d.d.I());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.g = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        SubscribeButton subscribeButton = this.d;
        subscribeButton.e = subscribeButtonData.a();
        subscribeButton.b = subscribeButtonData.d();
        subscribeButton.c = subscribeButtonData.c();
        subscribeButton.d = subscribeButtonData.b();
        subscribeButton.a();
        com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.d dVar = subscribeButton.f;
        if (dVar != null) {
            ((d) dVar).c();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.s.b = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        SubscriptionNotificationButton subscriptionNotificationButton = this.s;
        subscriptionNotificationButton.e = subscriptionNotificationButtonData;
        subscriptionNotificationButton.setContentDescription(subscriptionNotificationButtonData.d());
        int a = subscriptionNotificationButtonData.a();
        subscriptionNotificationButton.setImageDrawable(a != 1 ? a != 2 ? a != 3 ? null : subscriptionNotificationButton.getResources().getDrawable(R.drawable.quantum_gm_ic_notifications_active_white_24) : subscriptionNotificationButton.getResources().getDrawable(R.drawable.quantum_gm_ic_notifications_white_24) : subscriptionNotificationButton.getResources().getDrawable(R.drawable.quantum_gm_ic_notifications_off_white_24));
        subscriptionNotificationButton.c.d();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        SubscriptionNotificationButton subscriptionNotificationButton = this.s;
        subscriptionNotificationButton.f = subscriptionNotificationMenuData;
        subscriptionNotificationButton.setOnClickListener(subscriptionNotificationButton);
        subscriptionNotificationButton.c.d();
    }
}

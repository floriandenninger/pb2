package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.jar.q;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.remoteloaded.SubscribeButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import defpackage.acrb;
import defpackage.aivi;
import defpackage.ammx;
import defpackage.wbs;
import defpackage.whu;
import defpackage.yjk;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i extends aivi implements View.OnClickListener, e, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b {
    public final Context b;
    public View c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d g;
    public WatchLaterButton h;
    public YouTubeButton i;
    public ImageView j;
    public n k;
    public final h l;
    private com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b q;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a r;
    private final q s;
    private boolean t;
    private boolean u;

    public i(Context context, h hVar, q qVar) {
        super(context);
        this.q = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.b = context;
        this.l = hVar;
        this.s = qVar;
    }

    private static void j(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence == null ? "" : charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    private final void k() {
        if (this.u) {
            this.h.setVisibility(0);
            this.q.c(this.h.a.I());
        }
    }

    private final void l(Drawable drawable) {
        this.i.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.g.f = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        if (this.t) {
            this.g.k(videoDetails);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.r = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        if (this.t) {
            this.h.a(watchLaterButtonData);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final Optional a() {
        return Optional.of(this);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void b() {
        this.q = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        c(com.google.android.apps.youtube.embeddedplayer.service.model.d.a);
        if (this.t) {
            this.g.e();
        }
        e(false);
        f(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void c(com.google.android.apps.youtube.embeddedplayer.service.model.d dVar) {
        if (!this.t) {
            j(this.d, dVar.b);
            j(this.e, dVar.c);
        }
        this.j.setImageBitmap(dVar.d);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void d(com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b bVar) {
        this.q = bVar;
        this.g.h = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void e(boolean z) {
        this.i.setVisibility(true != z ? 8 : 0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.e
    public final void f(int i) {
        this.k.a(i);
        if (this.t) {
            SubscribeButton subscribeButton = this.g.d;
            subscribeButton.a = i;
            subscribeButton.a();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        if (this.t) {
            this.g.f(bitmap);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence charSequence;
        com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar;
        if (view == null || this.l == null) {
            return;
        }
        if (view == this.h && (aVar = this.r) != null) {
            aVar.j();
            this.q.a(this.h.a.I());
        }
        if (view == this.i) {
            h hVar = this.l;
            Context context = getContext();
            av avVar = (av) hVar;
            String str = avVar.q.b;
            if (avVar.n() || ammx.e(str)) {
                return;
            }
            IEmbedFragmentService iEmbedFragmentService = avVar.h;
            if (iEmbedFragmentService != null) {
                try {
                    iEmbedFragmentService.e(acrb.PLAYER_SHARE_BUTTON.Jk);
                } catch (RemoteException unused) {
                }
            }
            Uri ah = wbs.ah(str);
            com.google.android.apps.youtube.embeddedplayer.service.model.d dVar = (com.google.android.apps.youtube.embeddedplayer.service.model.d) avVar.m.aO();
            String str2 = "";
            if (dVar != null && (charSequence = dVar.b) != null) {
                str2 = charSequence.toString();
            }
            wbs.aH(context, str2, ah);
        }
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        this.s.a = 1 == (motionEvent.getFlags() & 1);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.g.g = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        if (this.t) {
            this.g.u(subscribeButtonData);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.g.v(dVar);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        if (this.t) {
            this.g.w(subscriptionNotificationButtonData);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        if (this.t) {
            this.g.x(subscriptionNotificationMenuData);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b
    public final void L(int i) {
        if (i == 0 || i == 1) {
            this.u = false;
        } else if (i == 2) {
            this.u = true;
        } else {
            throw new AssertionError("Watch later button in invalid state.");
        }
        k();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a
    public final void K(int i) {
        if (i != 1) {
            if (i == 2) {
                whu.I(this.h, this.u);
                this.i.setVisibility(0);
            } else {
                if (i == 3) {
                    this.h.setVisibility(8);
                    this.i.setVisibility(8);
                    return;
                }
                throw new AssertionError("VideoDetailsView in invalid state");
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        this.t = z;
        if (!z) {
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            l(getResources().getDrawable(R.drawable.player_share));
            this.i.setText((CharSequence) null);
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.c.getLayoutParams().height = yjk.K(displayMetrics, 56);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            this.i.setLayoutParams(layoutParams);
            int K = yjk.K(displayMetrics, 14);
            this.i.setPaddingRelative(K, K, K, K);
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        l(getResources().getDrawable(R.drawable.share_button_icon));
        this.i.setText(this.b.getResources().getString(R.string.share));
        this.f.setVisibility(0);
        k();
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        this.c.getLayoutParams().height = yjk.K(displayMetrics2, 70);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams2.setMargins(yjk.K(displayMetrics2, 5), yjk.K(displayMetrics2, 18), yjk.K(displayMetrics2, 10), 0);
        this.i.setLayoutParams(layoutParams2);
        this.i.setPaddingRelative(0, 0, 0, 0);
    }
}

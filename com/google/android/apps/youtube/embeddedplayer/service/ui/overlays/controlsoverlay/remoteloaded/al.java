package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import defpackage.ahbx;
import defpackage.ahvb;
import defpackage.ahvc;
import defpackage.ahvo;
import defpackage.ahvu;
import defpackage.ahxd;
import defpackage.ahxe;
import defpackage.ahxs;
import defpackage.ahxt;
import defpackage.ahyt;
import defpackage.ahyu;
import defpackage.aivc;
import defpackage.aivf;
import defpackage.atyq;
import defpackage.whu;
import defpackage.yjk;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class al extends aivc implements View.OnClickListener, Animation.AnimationListener, Handler.Callback, ahvc, aivf, ahxt, ahyu, ahxe, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h {
    public MinimalTimeBar a;
    public ProgressBar b;
    public ahvu c;
    public TouchImageView d;
    public TouchImageView e;
    public TouchImageView f;
    public TextView g;
    public Animation h;
    public Animation i;
    public Handler j;
    private final ar k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ControlsOverlayStyle p;
    private ControlsState q;

    public al(Context context, com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar) {
        super(context);
        this.k = new ar(new com.google.android.apps.youtube.embeddedplayer.service.jar.q(kVar));
        this.q = ControlsState.b();
    }

    private final void C(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.h);
        } else if (this.p.o) {
            nf();
        }
    }

    private final void D(boolean z) {
        this.h.setDuration(true != z ? 500L : 100L);
        C(this.d);
        C(this.e);
        C(this.f);
    }

    private final void E(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.i);
        }
    }

    private final void F() {
        boolean z;
        this.j.removeMessages(2);
        this.c.a(this.q);
        whu.I(this.g, this.q.i());
        ProgressBar progressBar = this.b;
        if (!ControlsOverlayStyle.d(this.p)) {
            ControlsState controlsState = this.q;
            if (controlsState.b || controlsState.a == ahvo.NEW) {
                z = true;
                whu.I(progressBar, z);
                whu.I(this.a, !this.n);
                if (!this.n || this.o || this.q.i()) {
                    whu.I(this.d, false);
                    whu.I(this.e, false);
                    whu.I(this.f, false);
                }
                TouchImageView touchImageView = this.d;
                int i = 4;
                if (this.q.k() && this.p.t) {
                    i = 0;
                }
                touchImageView.setVisibility(i);
                boolean z2 = this.p.u && (this.l || this.m) && this.q.a != ahvo.NEW;
                whu.I(this.e, z2);
                whu.I(this.f, z2);
                this.e.setEnabled(this.l);
                this.f.setEnabled(this.m);
                return;
            }
        }
        z = false;
        whu.I(progressBar, z);
        whu.I(this.a, !this.n);
        if (!this.n) {
        }
        whu.I(this.d, false);
        whu.I(this.e, false);
        whu.I(this.f, false);
    }

    protected final void A() {
        this.j.removeMessages(1);
        this.e.clearAnimation();
        this.f.clearAnimation();
        this.d.clearAnimation();
    }

    public final void B(boolean z) {
        this.n = z;
        if (z) {
            nf();
        } else if (this.q.a == ahvo.PAUSED || this.q.a == ahvo.ENDED) {
            pA();
        } else {
            F();
        }
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        this.m = z;
        F();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        this.k.a = ahvbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            D(false);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        F();
        return true;
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        this.p = controlsOverlayStyle;
        this.a.a(controlsOverlayStyle);
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        this.k.b = ahxsVar;
    }

    @Override // defpackage.aivc, defpackage.aivf
    public final View ld() {
        return this;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        if (this.q.equals(controlsState)) {
            if ((this.q.a == ahvo.PLAYING || this.q.b) && !this.j.hasMessages(1)) {
                this.j.sendEmptyMessageDelayed(1, 2500L);
                return;
            }
            return;
        }
        this.q = controlsState;
        pA();
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        this.l = z;
        F();
    }

    @Override // defpackage.ahvc
    public final void nf() {
        A();
        this.o = true;
        F();
        ar arVar = this.k;
        if (arVar != null) {
            arVar.d();
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        this.q = ControlsState.b();
        this.l = false;
        this.m = false;
        k(ControlsOverlayStyle.a);
        ns();
        F();
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        String string;
        String str2;
        this.q = z ? ControlsState.g() : ControlsState.h();
        if (yjk.W(getContext())) {
            string = getContext().getString(R.string.tap_to_retry);
        } else {
            string = getContext().getString(R.string.click_to_retry);
        }
        TextView textView = this.g;
        String valueOf = String.valueOf(str);
        if (z) {
            String valueOf2 = String.valueOf(string);
            str2 = valueOf2.length() != 0 ? "\n\n".concat(valueOf2) : new String("\n\n");
        } else {
            str2 = "";
        }
        String valueOf3 = String.valueOf(str2);
        textView.setText(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
        pA();
    }

    @Override // defpackage.ahvc
    public final void ns() {
        this.a.b(0L, 0L, 0L);
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.h) {
            nf();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.k != null) {
            if (view == this.e) {
                nf();
                this.k.a();
                return;
            }
            if (view == this.f) {
                nf();
                this.k.b();
                return;
            }
            if (view == this.d) {
                if (this.q.a == ahvo.ENDED) {
                    this.k.n();
                } else if (this.q.a == ahvo.PLAYING) {
                    this.k.e();
                } else if (this.q.a == ahvo.PAUSED) {
                    this.k.f();
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        this.k.g(1 == (motionEvent.getFlags() & 1));
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ar arVar;
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            if (this.q.a != ahvo.RECOVERABLE_ERROR || (arVar = this.k) == null) {
                if (this.o) {
                    if (!this.p.o) {
                        pA();
                        E(this.d);
                        E(this.e);
                        E(this.f);
                    }
                } else {
                    A();
                    D(true);
                }
            } else {
                arVar.o();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.ahvc
    public final void pA() {
        A();
        this.o = false;
        F();
        ar arVar = this.k;
        if (arVar != null) {
            arVar.v();
        }
        if ((this.q.a != ahvo.PLAYING && !this.q.b) || this.o || this.j.hasMessages(1)) {
            return;
        }
        this.j.sendEmptyMessageDelayed(1, 2500L);
    }

    @Override // defpackage.ahvc
    public final void pB() {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pt(boolean z) {
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.k.d = ahxdVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pv(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
        this.k.f = gVar;
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        this.a.b(j, j3, j4);
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.k.c = ahytVar;
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void y() {
        ahbx.c(this);
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void z(atyq atyqVar, boolean z) {
        ahbx.d(this, atyqVar, z);
    }
}

package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.acpl;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acra;
import defpackage.acsb;
import defpackage.ahtp;
import defpackage.ahux;
import defpackage.ahvb;
import defpackage.ahvo;
import defpackage.aidb;
import defpackage.aiee;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.aivo;
import defpackage.ajut;
import defpackage.akaw;
import defpackage.aok;
import defpackage.axzg;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.azrw;
import defpackage.bxj;
import defpackage.fhg;
import defpackage.fmt;
import defpackage.gfq;
import defpackage.gof;
import defpackage.kfe;
import defpackage.kfq;
import defpackage.kiz;
import defpackage.kkw;
import defpackage.kkx;
import defpackage.kky;
import defpackage.kla;
import defpackage.klg;
import defpackage.klh;
import defpackage.kll;
import defpackage.kln;
import defpackage.klo;
import defpackage.ksx;
import defpackage.mhu;
import defpackage.wbs;
import defpackage.yzr;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InteractiveInlineMutedControlsOverlay extends InlineMutedControlsOverlay implements aioa {
    TouchImageView A;
    View B;
    TouchImageView C;
    View D;
    TouchImageView E;
    ViewGroup F;
    public kkx G;
    private final azrw I;

    /* renamed from: J, reason: collision with root package name */
    private fmt f158J;
    private final SubtitleButtonController K;
    private final aiee L;
    private final ahtp M;
    private final aidb N;
    private final kiz O;
    private final klo P;
    private final ViewGroup Q;
    private final ajut R;
    private kla S;
    private Runnable T;
    private boolean U;
    private final aioc V;
    private final ayqw W;
    private kkw X;
    private final aadw Y;
    private final axzg Z;
    public final Context d;
    public final InlinePlaybackController e;
    public final acqz f;
    public klh g;
    public final aaea h;
    public final mhu i;
    public Runnable j;
    public bxj k;
    public TransitionDrawable l;
    public final aivo m;
    public final acpl n;
    public final InlineMutedScrimOverlayRedirectController o;
    public String p;
    public boolean q;
    public FrameLayout r;
    ProgressBar s;
    ViewGroup t;
    ViewGroup u;
    ImageView v;
    TextView w;
    LinearLayout x;
    public TouchImageView y;
    View z;
    public static final acqx a = new acqx(acsb.c(133103));
    public static final acqx b = new acqx(acsb.c(117524));
    public static final acqx c = new acqx(acsb.c(117525));
    private static final acqx H = new acqx(acsb.c(117526));

    public InteractiveInlineMutedControlsOverlay(Context context, azrw azrwVar, InlinePlaybackController inlinePlaybackController, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, aaea aaeaVar, aadw aadwVar, SubtitleButtonController subtitleButtonController, acqz acqzVar, aiee aieeVar, ahtp ahtpVar, aidb aidbVar, kiz kizVar, aivo aivoVar, ViewGroup viewGroup, ViewGroup viewGroup2, aioc aiocVar, mhu mhuVar, acpl acplVar, InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController, axzg axzgVar, ajut ajutVar, byte[] bArr) {
        super(context);
        kkx a2 = kkx.a().a();
        this.G = a2;
        this.X = a2.b();
        this.d = context;
        this.I = azrwVar;
        this.e = inlinePlaybackController;
        this.K = subtitleButtonController;
        this.f = acqzVar;
        this.L = aieeVar;
        this.M = ahtpVar;
        this.N = aidbVar;
        this.O = kizVar;
        this.Y = aadwVar;
        this.h = aaeaVar;
        this.m = aivoVar;
        this.P = new klo(this);
        this.Q = viewGroup;
        this.F = viewGroup2;
        this.V = aiocVar;
        this.i = mhuVar;
        this.W = new ayqw();
        this.n = acplVar;
        this.o = inlineMutedScrimOverlayRedirectController;
        this.Z = axzgVar;
        this.R = ajutVar;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void D() {
        if (!B()) {
            this.r.removeCallbacks(this.j);
            this.v.setVisibility(8);
            this.v.animate().cancel();
            this.v.setAlpha(0.0f);
            bxj bxjVar = this.k;
            if (bxjVar != null) {
                bxjVar.stop();
                return;
            }
            return;
        }
        if (this.q) {
            return;
        }
        this.v.setAlpha(0.0f);
        this.v.setVisibility(0);
        if (!this.U) {
            bxj a2 = bxj.a(this.r.getContext(), R.drawable.audio_indicator_24dp_animation);
            this.k = a2;
            this.v.setImageDrawable(a2);
            this.j = new kll(this, 0);
            this.U = true;
        }
        this.k.start();
        this.r.postDelayed(this.j, 2140L);
        this.v.animate().alpha(0.8f).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay.E():void");
    }

    private final void F() {
        if (this.S.a.b) {
            this.E.setImageDrawable(null);
        } else {
            this.E.setImageDrawable(this.d.getResources().getDrawable(true != B() ? R.drawable.yt_fill_play_arrow_white_24 : R.drawable.yt_fill_pause_white_24));
        }
    }

    private final boolean G() {
        return ((Boolean) this.G.d().b(kfq.h).e(false)).booleanValue();
    }

    public final void A() {
        this.l.resetTransition();
        this.x.removeCallbacks(this.T);
        this.x.postDelayed(this.T, 2000L);
    }

    public final boolean B() {
        kkx kkxVar = this.G;
        return kkxVar.a == 3 && kkxVar.b.a == ahvo.PLAYING && !this.G.b.b;
    }

    public final boolean C() {
        return ((Boolean) this.G.c().b(kfq.g).e(false)).booleanValue();
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.r = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_muted_controls_overlay, this.r);
        final int i = 0;
        this.r.findViewById(R.id.top_ui_controls_stub).setVisibility(0);
        this.s = (ProgressBar) this.r.findViewById(R.id.player_loading_view);
        this.t = (ViewGroup) this.r.findViewById(R.id.user_triggered_inline_loading_view_container);
        this.u = (ViewGroup) this.r.findViewById(R.id.autoplay_loading_view_container);
        this.v = (ImageView) this.r.findViewById(R.id.audio_indicator);
        this.w = (TextView) this.r.findViewById(R.id.countdown_badge);
        this.x = (LinearLayout) this.r.findViewById(R.id.top_ui_controls);
        this.y = (TouchImageView) this.r.findViewById(R.id.audio_toggle);
        this.z = this.r.findViewById(R.id.audio_caption_divider);
        this.A = (TouchImageView) this.r.findViewById(R.id.caption_toggle);
        this.B = this.r.findViewById(R.id.caption_fullscreen_divider);
        this.C = (TouchImageView) this.r.findViewById(R.id.fullscreen_button);
        this.D = this.r.findViewById(R.id.controls_user_triggered_divider);
        this.E = (TouchImageView) this.r.findViewById(R.id.user_triggered_inline_button);
        ((ViewGroup) this.r.findViewById(R.id.subtitle)).addView((View) this.I.get());
        fmt fmtVar = ((InlineTimeBarWrapper) ((ViewStub) this.Q.findViewById(R.id.inline_playback_time_bar_stub)).inflate()).a;
        this.f158J = fmtVar;
        final int i2 = 1;
        fmtVar.u = true;
        this.r.addView(this.F, 1);
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.x.getBackground();
        this.l = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        this.T = new kll(this, 1);
        ksx ksxVar = new ksx((ViewStub) this.r.findViewById(R.id.scrubbed_preview_extended), this.r, this.f158J, this.L, this.M, this.N, this.O, this.Y, this.R);
        klg klgVar = new klg(new yzr(this.w, 0L, 8));
        klh klhVar = new klh(this.f158J, klgVar);
        this.g = klhVar;
        klhVar.h(this.P);
        klh klhVar2 = this.g;
        klhVar2.d = ksxVar;
        kla klaVar = new kla(context, klhVar2, klgVar, this.s, this.w);
        this.S = klaVar;
        klaVar.c(this.G);
        int orElse = wbs.W(context, R.attr.ytOverlayButtonSecondary).orElse(0);
        TouchImageView touchImageView = this.y;
        akaw.d(touchImageView, orElse, -1, touchImageView.getBackground());
        TouchImageView touchImageView2 = this.A;
        akaw.d(touchImageView2, orElse, -1, touchImageView2.getBackground());
        TouchImageView touchImageView3 = this.C;
        akaw.d(touchImageView3, orElse, -1, touchImageView3.getBackground());
        this.y.setOnClickListener(new View.OnClickListener(this) { // from class: klm
            public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhv mhvVar;
                int i3 = i2;
                if (i3 == 0) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
                    interactiveInlineMutedControlsOverlay.f.mM().I(3, InteractiveInlineMutedControlsOverlay.b, null);
                    HashMap hashMap = new HashMap();
                    hashMap.put("force_fullscreen", Boolean.valueOf(interactiveInlineMutedControlsOverlay.C()));
                    hashMap.put("OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", Boolean.valueOf(((Boolean) interactiveInlineMutedControlsOverlay.G.c().b(kfq.f).e(false)).booleanValue()));
                    interactiveInlineMutedControlsOverlay.e.q(hashMap);
                    return;
                }
                if (i3 == 1) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay2 = this.a;
                    interactiveInlineMutedControlsOverlay2.f.mM().I(3, InteractiveInlineMutedControlsOverlay.c, null);
                    InlinePlaybackController inlinePlaybackController = interactiveInlineMutedControlsOverlay2.e;
                    if (inlinePlaybackController.a.g().d() && (mhvVar = inlinePlaybackController.f) != null && mhvVar.d() && inlinePlaybackController.b.t()) {
                        mhv mhvVar2 = inlinePlaybackController.f;
                        if (mhvVar2.d) {
                            if (mhvVar2.c) {
                                mhvVar2.b.s();
                                mhvVar2.d = false;
                            }
                        } else if (mhvVar2.c) {
                            mhvVar2.b.m();
                            mhvVar2.d = true;
                        }
                    }
                    gof gofVar = interactiveInlineMutedControlsOverlay2.G.c;
                    String f = gofVar != null ? gofVar.f() : "";
                    if (interactiveInlineMutedControlsOverlay2.e.u()) {
                        interactiveInlineMutedControlsOverlay2.i.c = f;
                    } else {
                        interactiveInlineMutedControlsOverlay2.i.b = f;
                    }
                    interactiveInlineMutedControlsOverlay2.A();
                    return;
                }
                InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay3 = this.a;
                boolean z = !interactiveInlineMutedControlsOverlay3.B();
                acra mM = interactiveInlineMutedControlsOverlay3.f.mM();
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = asio.a.createBuilder();
                createBuilder2.copyOnWrite();
                asio asioVar = (asio) createBuilder2.instance;
                asioVar.b |= 2;
                asioVar.d = z;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                asio asioVar2 = (asio) createBuilder2.build();
                asioVar2.getClass();
                ashtVar.H = asioVar2;
                ashtVar.c |= 134217728;
                mM.I(3, InteractiveInlineMutedControlsOverlay.a, (asht) createBuilder.build());
                interactiveInlineMutedControlsOverlay3.e.s(z);
                if (z) {
                    interactiveInlineMutedControlsOverlay3.A();
                } else {
                    interactiveInlineMutedControlsOverlay3.l.resetTransition();
                }
            }
        });
        this.K.t(this.A);
        final int i3 = 2;
        this.K.u(new kll(this, 2));
        this.C.setOnClickListener(new View.OnClickListener(this) { // from class: klm
            public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhv mhvVar;
                int i32 = i;
                if (i32 == 0) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
                    interactiveInlineMutedControlsOverlay.f.mM().I(3, InteractiveInlineMutedControlsOverlay.b, null);
                    HashMap hashMap = new HashMap();
                    hashMap.put("force_fullscreen", Boolean.valueOf(interactiveInlineMutedControlsOverlay.C()));
                    hashMap.put("OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", Boolean.valueOf(((Boolean) interactiveInlineMutedControlsOverlay.G.c().b(kfq.f).e(false)).booleanValue()));
                    interactiveInlineMutedControlsOverlay.e.q(hashMap);
                    return;
                }
                if (i32 == 1) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay2 = this.a;
                    interactiveInlineMutedControlsOverlay2.f.mM().I(3, InteractiveInlineMutedControlsOverlay.c, null);
                    InlinePlaybackController inlinePlaybackController = interactiveInlineMutedControlsOverlay2.e;
                    if (inlinePlaybackController.a.g().d() && (mhvVar = inlinePlaybackController.f) != null && mhvVar.d() && inlinePlaybackController.b.t()) {
                        mhv mhvVar2 = inlinePlaybackController.f;
                        if (mhvVar2.d) {
                            if (mhvVar2.c) {
                                mhvVar2.b.s();
                                mhvVar2.d = false;
                            }
                        } else if (mhvVar2.c) {
                            mhvVar2.b.m();
                            mhvVar2.d = true;
                        }
                    }
                    gof gofVar = interactiveInlineMutedControlsOverlay2.G.c;
                    String f = gofVar != null ? gofVar.f() : "";
                    if (interactiveInlineMutedControlsOverlay2.e.u()) {
                        interactiveInlineMutedControlsOverlay2.i.c = f;
                    } else {
                        interactiveInlineMutedControlsOverlay2.i.b = f;
                    }
                    interactiveInlineMutedControlsOverlay2.A();
                    return;
                }
                InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay3 = this.a;
                boolean z = !interactiveInlineMutedControlsOverlay3.B();
                acra mM = interactiveInlineMutedControlsOverlay3.f.mM();
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = asio.a.createBuilder();
                createBuilder2.copyOnWrite();
                asio asioVar = (asio) createBuilder2.instance;
                asioVar.b |= 2;
                asioVar.d = z;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                asio asioVar2 = (asio) createBuilder2.build();
                asioVar2.getClass();
                ashtVar.H = asioVar2;
                ashtVar.c |= 134217728;
                mM.I(3, InteractiveInlineMutedControlsOverlay.a, (asht) createBuilder.build());
                interactiveInlineMutedControlsOverlay3.e.s(z);
                if (z) {
                    interactiveInlineMutedControlsOverlay3.A();
                } else {
                    interactiveInlineMutedControlsOverlay3.l.resetTransition();
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) { // from class: klm
            public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhv mhvVar;
                int i32 = i3;
                if (i32 == 0) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
                    interactiveInlineMutedControlsOverlay.f.mM().I(3, InteractiveInlineMutedControlsOverlay.b, null);
                    HashMap hashMap = new HashMap();
                    hashMap.put("force_fullscreen", Boolean.valueOf(interactiveInlineMutedControlsOverlay.C()));
                    hashMap.put("OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", Boolean.valueOf(((Boolean) interactiveInlineMutedControlsOverlay.G.c().b(kfq.f).e(false)).booleanValue()));
                    interactiveInlineMutedControlsOverlay.e.q(hashMap);
                    return;
                }
                if (i32 == 1) {
                    InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay2 = this.a;
                    interactiveInlineMutedControlsOverlay2.f.mM().I(3, InteractiveInlineMutedControlsOverlay.c, null);
                    InlinePlaybackController inlinePlaybackController = interactiveInlineMutedControlsOverlay2.e;
                    if (inlinePlaybackController.a.g().d() && (mhvVar = inlinePlaybackController.f) != null && mhvVar.d() && inlinePlaybackController.b.t()) {
                        mhv mhvVar2 = inlinePlaybackController.f;
                        if (mhvVar2.d) {
                            if (mhvVar2.c) {
                                mhvVar2.b.s();
                                mhvVar2.d = false;
                            }
                        } else if (mhvVar2.c) {
                            mhvVar2.b.m();
                            mhvVar2.d = true;
                        }
                    }
                    gof gofVar = interactiveInlineMutedControlsOverlay2.G.c;
                    String f = gofVar != null ? gofVar.f() : "";
                    if (interactiveInlineMutedControlsOverlay2.e.u()) {
                        interactiveInlineMutedControlsOverlay2.i.c = f;
                    } else {
                        interactiveInlineMutedControlsOverlay2.i.b = f;
                    }
                    interactiveInlineMutedControlsOverlay2.A();
                    return;
                }
                InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay3 = this.a;
                boolean z = !interactiveInlineMutedControlsOverlay3.B();
                acra mM = interactiveInlineMutedControlsOverlay3.f.mM();
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = asio.a.createBuilder();
                createBuilder2.copyOnWrite();
                asio asioVar = (asio) createBuilder2.instance;
                asioVar.b |= 2;
                asioVar.d = z;
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                asio asioVar2 = (asio) createBuilder2.build();
                asioVar2.getClass();
                ashtVar.H = asioVar2;
                ashtVar.c |= 134217728;
                mM.I(3, InteractiveInlineMutedControlsOverlay.a, (asht) createBuilder.build());
                interactiveInlineMutedControlsOverlay3.e.s(z);
                if (z) {
                    interactiveInlineMutedControlsOverlay3.A();
                } else {
                    interactiveInlineMutedControlsOverlay3.l.resetTransition();
                }
            }
        });
        this.W.g(kI(this.V));
        this.W.d(this.Z.a().ax(new kln(this, 2)));
        return this.r;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        Drawable drawable;
        kkx a2 = this.X.a();
        this.G = a2;
        this.X = a2.b();
        if (ab(1)) {
            this.S.c(this.G);
            F();
            E();
            D();
        }
        if (ab(2)) {
            kkx kkxVar = this.G;
            int i = kkxVar.a;
            if (i == 2) {
                this.S.d(kkxVar.c.d(), this.G.c.g());
            } else if (i == 0) {
                this.S.a();
                this.o.g();
                this.F.setVisibility(8);
                this.l.resetTransition();
            } else if (i == 3) {
                A();
            }
            this.S.c(this.G);
            D();
            F();
            E();
        }
        if (ab(4)) {
            kky kkyVar = this.G.e;
            this.S.f(kkyVar.a, kkyVar.b, kkyVar.c, kkyVar.d);
        }
        if (ab(8)) {
            this.S.e(this.G.f);
        }
        ProgressBar progressBar = this.s;
        ViewGroup viewGroup = G() ? this.t : this.u;
        ViewParent parent = progressBar.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(progressBar);
            viewGroup.addView(progressBar);
        }
        TouchImageView touchImageView = this.y;
        if (this.e.u()) {
            drawable = context.getResources().getDrawable(R.drawable.yt_outline_volume_off_white_24);
        } else {
            drawable = context.getResources().getDrawable(R.drawable.yt_outline_volume_on_white_24);
        }
        touchImageView.setImageDrawable(drawable);
        gof gofVar = this.G.c;
        if (gofVar == null || gofVar.b() == null) {
            return;
        }
        acra mM = this.f.mM();
        acqx acqxVar = new acqx(this.G.c.b().c);
        mM.F(a, acqxVar);
        mM.F(b, acqxVar);
        mM.F(c, acqxVar);
        mM.F(H, acqxVar);
        F();
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        this.X.f = controlsOverlayStyle;
        Z(8);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.t().d.X(new kln(this, 1)), aiocVar.G().c.G().Y(new kln(this, 0), kfe.i)};
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        return kU;
    }

    @Override // com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay, defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.W.qc();
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        kkw kkwVar = this.X;
        kkwVar.b = gfqVar.b;
        kkwVar.b(i2);
        Z(2);
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fhgVar.c();
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (this.X.a().d != fhgVar) {
            this.X.c = fhgVar;
            if (fhgVar.c()) {
                aa();
            } else {
                X();
            }
            Y();
        }
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        klh klhVar;
        this.X.a = controlsState;
        Z(1);
        if (controlsState.a != ahvo.ENDED || (klhVar = this.g) == null) {
            return;
        }
        klhVar.nT();
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void nf() {
    }

    @Override // defpackage.ahvc
    public final void ng() {
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        ControlsState g = z ? ControlsState.g() : ControlsState.h();
        kkw kkwVar = this.X;
        kkwVar.d = str;
        kkwVar.a = g;
        Z(1);
    }

    @Override // defpackage.ahvc
    public final void ns() {
        if (np()) {
            this.S.b();
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.X.a().d.c();
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.r.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.r.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ahvc
    public final void pA() {
    }

    @Override // defpackage.ahvc
    public final void pB() {
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        if (np() && this.G.b.a == ahvo.PLAYING) {
            this.X.e = kky.a(j, j2, j3, j4);
            Z(4);
        }
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
    }
}

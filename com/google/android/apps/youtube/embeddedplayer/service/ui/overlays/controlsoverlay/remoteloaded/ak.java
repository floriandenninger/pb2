package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import defpackage.acrb;
import defpackage.ahbx;
import defpackage.ahus;
import defpackage.ahux;
import defpackage.ahvb;
import defpackage.ahvc;
import defpackage.ahvo;
import defpackage.ahvu;
import defpackage.ahxd;
import defpackage.ahxe;
import defpackage.ahxs;
import defpackage.ahxt;
import defpackage.ahyg;
import defpackage.ahyq;
import defpackage.ahyt;
import defpackage.ahyu;
import defpackage.aicf;
import defpackage.aicj;
import defpackage.aick;
import defpackage.aii;
import defpackage.aivf;
import defpackage.ajct;
import defpackage.alta;
import defpackage.amkq;
import defpackage.amru;
import defpackage.amvj;
import defpackage.aone;
import defpackage.aong;
import defpackage.aqyg;
import defpackage.aryi;
import defpackage.atyq;
import defpackage.aypy;
import defpackage.ayqj;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azre;
import defpackage.jm;
import defpackage.jw;
import defpackage.nvp;
import defpackage.oba;
import defpackage.opn;
import defpackage.oqu;
import defpackage.tjr;
import defpackage.whu;
import defpackage.yjk;
import defpackage.yny;
import defpackage.zdd;
import defpackage.zde;
import defpackage.zdh;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ak extends ahus implements ahvc, aivf, ahxt, ahyu, ahxe, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b {
    public Animation A;
    public Animation B;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d C;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b D;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b E;
    public aq F;
    public Context G;
    public ControlsState H;
    public ControlsOverlayStyle I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f166J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c T;
    private final ag V;
    private final View.OnClickListener W;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a X;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d Y;
    private final zdd Z;
    private SubscriptionNotificationButtonData aA;
    private SubscriptionNotificationMenuData aB;
    private WatchLaterButtonData aC;
    private CharSequence aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private final ayqx aM;
    private oba aO;
    private final aicj aa;
    private View ab;
    private ViewGroup ac;
    private Drawable ad;
    private Drawable ae;
    private View af;
    private Drawable ag;
    private View ah;
    private LinearLayout ai;
    private TextView aj;
    private FrameLayout ak;
    private ahyq al;
    private Animation am;
    private int an;
    private int ao;
    private Animation ap;
    private Animation aq;
    private Animation ar;
    private Handler as;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e at;
    private ahvu au;
    private int av;
    private String aw;
    private Bitmap ax;
    private VideoDetails ay;
    private SubscribeButtonData az;
    public final ar b;
    public final zde c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d e;
    public final zdh f;
    public FrameLayout g;
    TimeBar h;
    public final ahyg i;
    public TouchImageView j;
    public TouchImageView k;
    TextView l;
    public WatchLaterButton m;
    public YouTubeButton n;
    public TouchImageView o;
    public TouchImageView p;
    public TouchImageView q;
    public TouchImageView r;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d s;
    public RelativeLayout t;
    public ProgressBar u;
    public TextView v;
    public aick w;
    public boolean x;
    public TouchImageView y;
    public TouchImageView z;
    private static final oba aN = new oba();
    public static final amru a = amru.u(Integer.valueOf(R.id.player_share_button), Integer.valueOf(R.id.related_videos_screen_button), Integer.valueOf(R.id.api_watch_in_youtube_button), Integer.valueOf(R.id.player_video_title_view));

    private ak(Context context, com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e eVar) {
        super(context);
        this.e = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.g;
        this.D = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.az = SubscribeButtonData.a;
        this.aA = SubscriptionNotificationButtonData.a;
        this.aB = SubscriptionNotificationMenuData.a;
        this.aC = WatchLaterButtonData.a;
        this.aG = true;
        this.N = true;
        this.R = 0;
        this.G = context;
        this.at = eVar;
        this.I = ControlsOverlayStyle.a;
        this.H = ControlsState.b();
        this.i = new ahyg();
        this.b = new ar(new com.google.android.apps.youtube.embeddedplayer.service.jar.q(kVar));
        this.V = new ag(this);
        this.W = new ad(this);
        aj ajVar = new aj(this);
        this.f = ajVar;
        ai aiVar = new ai(this);
        this.Z = aiVar;
        zde zdeVar = new zde(ViewConfiguration.get(this.G));
        this.c = zdeVar;
        zdeVar.b = aiVar;
        zdeVar.c = ajVar;
        this.aa = new ah(this);
        this.aM = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ai(azre.c()).ab(ayqr.a()).ax(new ab(this, 2));
    }

    public static ak F(Context context, final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e eVar, aypy aypyVar, ayqj ayqjVar, aypy aypyVar2) {
        final ak akVar = new ak(context, kVar, eVar);
        akVar.as = new Handler(new Handler.Callback() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.y
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ak akVar2 = ak.this;
                if (message.what == 1) {
                    akVar2.Q(false);
                } else if (message.what == 2) {
                    akVar2.V();
                } else if (message.what == 3) {
                    whu.I(akVar2.u, true);
                } else if (message.what == 4) {
                    whu.I(akVar2.u, false);
                } else {
                    if (message.what != 5) {
                        return false;
                    }
                    akVar2.pA();
                    return true;
                }
                return true;
            }
        });
        Context context2 = akVar.G;
        ac acVar = new ac(akVar);
        Animation loadAnimation = AnimationUtils.loadAnimation(context2, R.anim.fade_out);
        akVar.A = loadAnimation;
        loadAnimation.setAnimationListener(acVar);
        akVar.am = AnimationUtils.loadAnimation(context2, R.anim.fade_in);
        akVar.aq = AnimationUtils.loadAnimation(context2, R.anim.bottom_translate_out);
        akVar.ar = AnimationUtils.loadAnimation(context2, R.anim.top_translate_out);
        akVar.an = context2.getResources().getInteger(R.integer.fade_duration_fast);
        akVar.ao = context2.getResources().getInteger(R.integer.fade_duration_slow);
        akVar.am.setDuration(akVar.an);
        akVar.ap = AnimationUtils.loadAnimation(context2, R.anim.fade_in);
        akVar.B = AnimationUtils.loadAnimation(context2, R.anim.fade_out);
        long integer = context2.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        akVar.ap.setDuration(integer);
        akVar.B.setDuration(integer);
        akVar.B.setAnimationListener(acVar);
        aypyVar.B().ax(new ab(akVar, 1));
        ayqjVar.W(new oqu(14), oqu.o);
        aypyVar2.ax(new ab(akVar, 0));
        DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.x
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar2 = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k.this;
                amru amruVar = ak.a;
                kVar2.e();
            }
        };
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.v
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ak akVar2 = ak.this;
                kVar.d();
                akVar2.J();
            }
        };
        akVar.E = new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b(akVar.G, onShowListener, onDismissListener, new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.d(akVar.G, onShowListener, onDismissListener), new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.f(akVar.G, onShowListener, onDismissListener), new opn(), null, null);
        af afVar = new af(akVar);
        akVar.E.l(afVar);
        akVar.E.pz(afVar);
        return akVar;
    }

    private final void ac() {
        this.as.removeMessages(3);
        this.as.sendEmptyMessage(4);
    }

    private final void ad() {
        aq aqVar = this.F;
        if (aqVar != null) {
            aqVar.b();
        }
    }

    private final void ae(Drawable drawable) {
        this.n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
    }

    private final void af(aryi aryiVar, boolean z) {
        Optional of = z ? Optional.of(new aa(this.b)) : Optional.empty();
        com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c cVar = this.T;
        cVar.getClass();
        cVar.b(aryiVar, z, of);
    }

    private final void ah() {
        if (this.P) {
            this.n.setOnClickListener(this.W);
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            this.n.setPadding(yjk.K(displayMetrics, 5), yjk.K(displayMetrics, 18), yjk.K(displayMetrics, 5), yjk.K(displayMetrics, 10));
            ae(this.g.getResources().getDrawable(R.drawable.share_button_icon));
            this.n.setText(this.G.getResources().getString(R.string.share));
            return;
        }
        this.at.b(this.n);
        DisplayMetrics displayMetrics2 = this.g.getResources().getDisplayMetrics();
        this.n.setPadding(yjk.K(displayMetrics2, 6), yjk.K(displayMetrics2, 14), yjk.K(displayMetrics2, 6), yjk.K(displayMetrics2, 14));
        ae(this.g.getResources().getDrawable(R.drawable.player_share));
        this.n.setText((CharSequence) null);
    }

    private final void ai() {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        if (this.P) {
            this.ah.getLayoutParams().height = yjk.K(displayMetrics, 70);
        } else {
            this.ah.getLayoutParams().height = yjk.K(displayMetrics, 56);
        }
    }

    private static final void aj() {
        alta.B("Error screen presenter should be present", new Object[0]);
    }

    public final int A() {
        if (np()) {
            return this.h.a;
        }
        return 0;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.b.e = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        if (this.P) {
            this.ay = videoDetails;
            if (np()) {
                this.s.k(videoDetails);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.d = aVar;
        this.E.p = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        if (this.P) {
            this.aC = watchLaterButtonData;
            if (np()) {
                this.m.a(watchLaterButtonData);
            }
            this.E.q = watchLaterButtonData;
        }
    }

    public final ahyq G() {
        if (np() && this.al == null) {
            this.al = new ahyq((TextView) this.g.findViewById(R.id.player_learn_more_button));
        }
        return this.al;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H() {
        if (np()) {
            this.as.removeMessages(1);
            this.at.a(nvp.g);
            this.h.clearAnimation();
            this.ac.clearAnimation();
            this.l.clearAnimation();
            this.ah.clearAnimation();
            this.af.clearAnimation();
            if (this.P) {
                this.s.c.clearAnimation();
                this.m.clearAnimation();
                this.n.clearAnimation();
            } else {
                this.aj.clearAnimation();
            }
            this.q.clearAnimation();
            this.r.clearAnimation();
            this.z.clearAnimation();
            this.y.clearAnimation();
            this.p.clearAnimation();
            this.o.clearAnimation();
        }
    }

    public final void I(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.C;
        if (dVar != null) {
            try {
                dVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void J() {
        if ((this.H.a == ahvo.PLAYING || this.H.b) && T() && !this.as.hasMessages(1)) {
            this.as.sendEmptyMessageDelayed(1, 2500L);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a
    public final void K(int i) {
        this.aJ = i == 3;
        V();
        J();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b
    public final void L(int i) {
        if (i == 0 || i == 1) {
            this.aI = false;
        } else {
            this.aI = true;
        }
    }

    public final void M(int i) {
        this.av = i;
        if (np()) {
            if (i == 0) {
                this.aO = null;
                this.af.setBackground(this.ag);
            } else {
                this.aO = aN;
                this.af.setBackgroundColor(i);
            }
        }
    }

    public final void N(String str) {
        if (this.P) {
            return;
        }
        this.aw = str;
        if (np()) {
            this.aj.setText(str);
        }
    }

    public final void O() {
        pA();
        this.at.a(new w(this, 1));
        if (!this.I.v) {
            R(this.h);
        }
        R(this.ah);
        R(this.af);
        R(this.ac);
        R(this.l);
        if (this.P) {
            R(this.s.c);
            if (!this.aJ) {
                if (this.aI) {
                    R(this.m);
                }
                R(this.n);
                R(this.o);
            }
        } else {
            R(this.aj);
            R(this.o);
        }
        R(this.p);
        R(this.q);
        R(this.r);
        R(this.z);
        R(this.y);
    }

    public final void P(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.A);
        } else if (this.I.o && T()) {
            nf();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q(boolean z) {
        this.A.setDuration(z ? this.an : this.ao);
        this.ar.setDuration(z ? this.an : this.ao);
        this.aq.setDuration(z ? this.an : this.ao);
        this.at.a(new w(this, 0));
        if (!this.I.v) {
            P(this.h);
        }
        P(this.o);
        P(this.ah);
        P(this.af);
        P(this.ac);
        P(this.l);
        if (this.P) {
            P(this.s.c);
            P(this.m);
            P(this.n);
        } else {
            P(this.aj);
        }
        P(this.p);
        P(this.q);
        P(this.r);
        P(this.z);
        P(this.y);
    }

    public final void R(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.am);
        }
    }

    public final void S(boolean z) {
        jm.u(this.l, z ? this.ad : this.ae, null, null);
    }

    public final boolean T() {
        return (this.f166J || this.aH) ? false : true;
    }

    public final boolean U(MotionEvent motionEvent) {
        if (!this.N || ControlsOverlayStyle.a(this.I) || this.H.i() || this.H.a == ahvo.ENDED) {
            return false;
        }
        if (aicf.b((int) motionEvent.getX(), this.g.getWidth(), false) != 2) {
            return true;
        }
        ahyg ahygVar = this.i;
        return ahygVar.c > ahygVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean V() {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak.V():boolean");
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        Resources resources = context.getResources();
        ae aeVar = new ae(this, context);
        this.g = aeVar;
        aeVar.setClipToPadding(false);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.S) {
            try {
                from.inflate(R.layout.embed_controls_overlay, this.g);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Unable to inflate LazyEmbedsControlsOverlay: ");
                sb.append(valueOf);
                alta.B(sb.toString(), new Object[0]);
                return this.g;
            }
        } else {
            from.inflate(R.layout.embed_controls_overlay, this.g);
        }
        if (!this.aM.e()) {
            ayrz.c((AtomicReference) this.aM);
        }
        this.aK = true;
        this.t = (RelativeLayout) this.g.findViewById(R.id.controls_layout);
        TimeBar timeBar = (TimeBar) this.g.findViewById(R.id.time_bar);
        this.h = timeBar;
        timeBar.kR(this.V);
        this.h.y(this.i);
        this.h.setEnabled(this.aE);
        ViewGroup viewGroup = (ViewGroup) this.g.findViewById(R.id.bottom_end_container);
        this.ac = viewGroup;
        this.ab = viewGroup.findViewById(R.id.api_watch_in_youtube_button);
        TouchImageView touchImageView = (TouchImageView) this.ac.findViewById(R.id.fullscreen_button);
        this.j = touchImageView;
        touchImageView.setOnClickListener(this.W);
        TouchImageView touchImageView2 = (TouchImageView) this.ac.findViewById(R.id.hide_controls_button);
        this.k = touchImageView2;
        touchImageView2.setOnClickListener(this.W);
        TextView textView = (TextView) this.g.findViewById(R.id.live_label);
        this.l = textView;
        textView.setTypeface(ajct.ROBOTO_LIGHT.a(context));
        this.l.setOnClickListener(this.W);
        this.ad = aii.a(context, R.drawable.player_live_dot);
        this.ae = aii.a(context, R.drawable.player_notlive_dot);
        S(true);
        View findViewById = this.g.findViewById(R.id.bottom_bar_background);
        this.af = findViewById;
        this.ag = findViewById.getBackground();
        this.ah = this.g.findViewById(R.id.top_bar_background);
        this.ai = (LinearLayout) this.g.findViewById(R.id.time_bar_container);
        this.u = (ProgressBar) this.g.findViewById(R.id.player_loading_view);
        this.u.setIndeterminateDrawable(new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.player_loading_view_thickness), resources.getDimensionPixelSize(R.dimen.player_loading_view_inset), new int[]{resources.getColor(R.color.player_loading_view_color)}));
        TextView textView2 = (TextView) this.g.findViewById(R.id.player_error_view);
        this.v = textView2;
        jw.au(textView2);
        this.g.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.z
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ak akVar = ak.this;
                int i9 = i3 - i;
                int i10 = (int) (i9 * 0.16666667f);
                akVar.v.setPadding(i10, 10, i10, 10);
                int P = yjk.P(akVar.g.getResources().getDisplayMetrics(), i9);
                akVar.N = akVar.g != null && (P <= 0 || P >= 300);
                if (akVar.P) {
                    boolean z = P > 450;
                    akVar.Q = z;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = akVar.E;
                    boolean z2 = !z;
                    bVar.r = z2;
                    bVar.o = z2;
                }
            }
        });
        TouchImageView touchImageView3 = (TouchImageView) this.g.findViewById(R.id.player_control_play_pause_replay_button);
        this.p = touchImageView3;
        touchImageView3.setOnClickListener(this.W);
        this.au = new ahvu(this.p, context);
        TouchImageView touchImageView4 = (TouchImageView) this.g.findViewById(R.id.player_control_previous_button);
        this.r = touchImageView4;
        touchImageView4.setOnClickListener(this.W);
        TouchImageView touchImageView5 = (TouchImageView) this.g.findViewById(R.id.player_control_next_button);
        this.q = touchImageView5;
        touchImageView5.setOnClickListener(this.W);
        TouchImageView touchImageView6 = (TouchImageView) this.g.findViewById(R.id.player_control_seekback_button);
        this.y = touchImageView6;
        touchImageView6.setOnClickListener(this.W);
        TouchImageView touchImageView7 = (TouchImageView) this.g.findViewById(R.id.player_control_seekforward_button);
        this.z = touchImageView7;
        touchImageView7.setOnClickListener(this.W);
        this.aj = (TextView) this.g.findViewById(R.id.player_video_title_view);
        FrameLayout frameLayout = (FrameLayout) this.g.findViewById(R.id.player_video_details_holder);
        this.ak = frameLayout;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d.a(context, frameLayout);
        this.s = a2;
        a2.h = this.D;
        a2.f = this.b;
        a2.e = this;
        a2.g = this.X;
        a2.v(this.Y);
        WatchLaterButton watchLaterButton = (WatchLaterButton) this.g.findViewById(R.id.player_watch_later_button);
        this.m = watchLaterButton;
        watchLaterButton.setOnClickListener(this.W);
        this.m.b = this;
        this.n = (YouTubeButton) this.g.findViewById(R.id.player_share_button);
        TouchImageView touchImageView8 = (TouchImageView) this.g.findViewById(R.id.player_overflow_button);
        this.o = touchImageView8;
        touchImageView8.setOnClickListener(this.W);
        ai();
        ah();
        ag();
        if (this.P) {
            this.s.k(this.ay);
            this.s.f(this.ax);
            this.s.u(this.az);
            this.s.w(this.aA);
            this.s.x(this.aB);
            this.m.a(this.aC);
        } else {
            this.aj.setText(this.aw);
        }
        ((TextView) this.g.findViewById(R.id.related_videos_screen_button)).setMaxWidth((int) (((resources.getDisplayMetrics().density * 200.0f) + 0.5f) - (resources.getDimension(R.dimen.related_videos_button_left_padding) + resources.getDimension(R.dimen.related_videos_button_right_padding))));
        final aq aqVar = new aq(this.G, this.as, this.b);
        aqVar.b = new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.am
            @Override // java.lang.Runnable
            public final void run() {
                aq.this.b();
            }
        };
        this.F = aqVar;
        aick aickVar = new aick(this.g, null, this.aa, this.F.d);
        this.w = aickVar;
        aickVar.c(this.x);
        aq aqVar2 = this.F;
        aick aickVar2 = this.w;
        aqVar2.f = aickVar2;
        aickVar2.d(new an(aqVar2));
        amru amruVar = a;
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            View findViewById2 = this.g.findViewById(((Integer) amruVar.get(i2)).intValue());
            if (findViewById2 != null) {
                this.at.b(findViewById2);
            }
        }
        M(this.av);
        nJ(this.aD);
        k(this.I);
        nf();
        ac();
        return this.g;
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        this.L = z;
        if (np()) {
            V();
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        if (ab(1)) {
            nI(this.H);
        }
        if (ab(4)) {
            nK(this.aH);
        }
        if (ab(8)) {
            pA();
        }
        if (ab(16)) {
            r(this.aL);
        }
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
        this.E.n = z;
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        ar arVar = this.b;
        arVar.a = ahvbVar;
        this.E.e = arVar;
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        this.aE = z;
        if (np()) {
            this.h.setEnabled(z);
        }
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
        this.E.j(subtitleTrack);
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        this.I = controlsOverlayStyle;
        if (this.aO == null || amkq.b(controlsOverlayStyle.n, ControlsOverlayStyle.i.n)) {
            ahyg ahygVar = this.i;
            int i = controlsOverlayStyle.q;
            ahygVar.h = i;
            ahygVar.f = -855638017;
            ahygVar.e = 872415231;
            ahygVar.j = i;
            ahygVar.k = controlsOverlayStyle.r;
        } else {
            ahyg ahygVar2 = this.i;
            ahygVar2.h = -1;
            ahygVar2.f = -1996488705;
            ahygVar2.e = -2013265920;
            ahygVar2.j = -1;
        }
        ahyg ahygVar3 = this.i;
        ahygVar3.l = controlsOverlayStyle.w;
        ahygVar3.m = controlsOverlayStyle.s;
        ahygVar3.n = controlsOverlayStyle.x;
        ahygVar3.m(controlsOverlayStyle.z);
        if (np()) {
            this.h.y(this.i);
            ArrayDeque arrayDeque = new ArrayDeque();
            if (amkq.b(controlsOverlayStyle.n, ControlsOverlayStyle.i.n)) {
                arrayDeque.add(yny.i(11));
                arrayDeque.add(yny.n(-2));
            } else {
                arrayDeque.add(yny.t(11));
                arrayDeque.add(yny.j(0, this.ac.getId()));
                arrayDeque.add(yny.n(this.ac.getHeight() > 0 ? Math.max(this.ai.getLayoutParams().height, this.ac.getHeight()) : -2));
            }
            yny.z(this.ai, yny.E(arrayDeque), RelativeLayout.LayoutParams.class);
            V();
            J();
        }
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        return kU;
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        this.b.b = ahxsVar;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
        this.E.m = z;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        if (this.P) {
            this.ax = bitmap;
            if (np()) {
                this.s.f(bitmap);
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        if (!this.H.equals(controlsState)) {
            this.H = controlsState;
        }
        if (this.aK) {
            if (np()) {
                V();
                if (controlsState.a == ahvo.ENDED) {
                    pA();
                    if (this.h.kK() != 0) {
                        ahyg ahygVar = this.i;
                        ahygVar.b = 0L;
                        this.h.y(ahygVar);
                    }
                } else if (controlsState.a == ahvo.PAUSED && !this.aG) {
                    if (this.as.hasMessages(5)) {
                        this.as.removeMessages(5);
                    }
                    this.as.sendEmptyMessageDelayed(5, 500L);
                }
                J();
            } else {
                Z(1);
            }
            if (controlsState.i()) {
                ad();
            }
        }
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
        this.aD = charSequence;
        if (np()) {
            this.l.setText(charSequence);
        }
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
        if (this.aH != z) {
            this.aH = z;
            if (np()) {
                whu.I(this.k, this.aH);
                if (this.aH) {
                    O();
                    return;
                } else {
                    V();
                    return;
                }
            }
            Z(4);
        }
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        this.K = z;
        if (np()) {
            V();
        }
    }

    @Override // defpackage.ahvc
    public final void nf() {
        if (np()) {
            H();
            this.as.removeMessages(5);
            this.f166J = true;
            V();
            this.b.d();
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        if (np()) {
            if (this.P) {
                this.s.e();
            } else {
                this.aj.setText("");
            }
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c cVar = this.T;
        if (cVar != null) {
            cVar.a();
        }
        k(ControlsOverlayStyle.a);
        ad();
        nf();
        this.aG = true;
    }

    @Override // defpackage.ahus, defpackage.ahuu
    public final boolean np() {
        return this.aK && super.np();
    }

    @Override // defpackage.ahvc
    public final void ns() {
        this.i.l();
        if (np()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.aH || this.R == 1;
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
        this.E.o(videoQualityArr, i, z);
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (np()) {
            return this.g.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (np()) {
            return this.g.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        this.P = z;
        if (np()) {
            ai();
            ah();
            ag();
        }
    }

    @Override // defpackage.ahvc
    public final void pA() {
        if (np()) {
            H();
            this.as.removeMessages(5);
            this.f166J = false;
            if (V()) {
                this.b.v();
            }
            J();
            if (this.P) {
                return;
            }
            I(acrb.PLAYER_OVERFLOW_BUTTON.Jk);
            return;
        }
        Z(8);
    }

    @Override // defpackage.ahvc
    public final void pB() {
        whu.K(this.G, R.string.no_subtitles, 0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pt(boolean z) {
        this.aG = z;
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.b.d = ahxdVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pv(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
        this.b.f = gVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
    public final void pw(com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d dVar) {
        this.e = dVar;
        this.E.s = dVar;
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
        this.i.r = map;
        if (np()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        this.i.n(j, j2, j3, j4);
        if (np()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.b.c = ahytVar;
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
        this.E.q(list);
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
        if (!np()) {
            this.aL = z;
            Z(16);
            return;
        }
        this.j.setSelected(z);
        this.j.setContentDescription(this.G.getText(true != z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen));
        if (this.H.a == ahvo.PLAYING) {
            H();
            Q(true);
        }
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
        this.aF = z;
        if (np()) {
            V();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.X = aVar;
        if (np()) {
            this.s.g = aVar;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        if (this.P) {
            this.az = subscribeButtonData;
            if (np()) {
                this.s.u(subscribeButtonData);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.Y = dVar;
        if (np()) {
            this.s.v(dVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        if (this.P) {
            this.aA = subscriptionNotificationButtonData;
            if (np()) {
                this.s.w(subscriptionNotificationButtonData);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void x(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        if (this.P) {
            this.aB = subscriptionNotificationMenuData;
            if (np()) {
                this.s.x(subscriptionNotificationMenuData);
            }
        }
    }

    @Override // defpackage.ahvc
    public final /* synthetic */ void y() {
        ahbx.c(this);
    }

    @Override // defpackage.ahvc
    public final void z(atyq atyqVar, boolean z) {
        if (this.T == null) {
            aj();
        } else {
            af(oba.z(atyqVar), z);
        }
    }

    private final void ag() {
        if (!this.P) {
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            this.o.setPadding(yjk.K(displayMetrics, 6), yjk.K(displayMetrics, 14), yjk.K(displayMetrics, 8), yjk.K(displayMetrics, 14));
            return;
        }
        DisplayMetrics displayMetrics2 = this.g.getResources().getDisplayMetrics();
        this.o.setPadding(yjk.K(displayMetrics2, 6), yjk.K(displayMetrics2, 20), yjk.K(displayMetrics2, 8), yjk.K(displayMetrics2, 14));
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        if (this.T == null) {
            aj();
            return;
        }
        aone createBuilder = atyq.a.createBuilder();
        aong aongVar = (aong) aqyg.a.createBuilder();
        aongVar.copyOnWrite();
        aqyg aqygVar = (aqyg) aongVar.instance;
        str.getClass();
        aqygVar.b |= 1;
        aqygVar.d = str;
        createBuilder.copyOnWrite();
        atyq atyqVar = (atyq) createBuilder.instance;
        aqyg aqygVar2 = (aqyg) aongVar.build();
        aqygVar2.getClass();
        atyqVar.c = aqygVar2;
        atyqVar.b |= 1;
        af(oba.z((atyq) createBuilder.build()), z);
    }
}

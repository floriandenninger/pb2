package com.google.android.apps.youtube.app.player.overlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.ahbl;
import defpackage.ahdv;
import defpackage.ahev;
import defpackage.ahew;
import defpackage.ahfk;
import defpackage.ahqy;
import defpackage.ahtp;
import defpackage.ahuh;
import defpackage.ahuk;
import defpackage.ahut;
import defpackage.ahuu;
import defpackage.ahvb;
import defpackage.ahvc;
import defpackage.ahvo;
import defpackage.ahwi;
import defpackage.ahyg;
import defpackage.aibz;
import defpackage.aica;
import defpackage.aicf;
import defpackage.aicj;
import defpackage.aick;
import defpackage.aicz;
import defpackage.aida;
import defpackage.aidc;
import defpackage.aiee;
import defpackage.aigk;
import defpackage.aigv;
import defpackage.ainl;
import defpackage.aioc;
import defpackage.aivh;
import defpackage.ajck;
import defpackage.ajcq;
import defpackage.ajut;
import defpackage.ajyw;
import defpackage.amkq;
import defpackage.ammv;
import defpackage.anij;
import defpackage.any;
import defpackage.aok;
import defpackage.aqrt;
import defpackage.aqyg;
import defpackage.asvu;
import defpackage.atyj;
import defpackage.atyq;
import defpackage.axpg;
import defpackage.axzg;
import defpackage.aypn;
import defpackage.ayqd;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.azrh;
import defpackage.azrs;
import defpackage.evr;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.fkc;
import defpackage.fll;
import defpackage.fnd;
import defpackage.fnp;
import defpackage.gfw;
import defpackage.jg;
import defpackage.jw;
import defpackage.jzf;
import defpackage.kfe;
import defpackage.kgm;
import defpackage.khv;
import defpackage.khy;
import defpackage.khz;
import defpackage.kia;
import defpackage.kih;
import defpackage.kin;
import defpackage.kio;
import defpackage.kip;
import defpackage.kiw;
import defpackage.kiz;
import defpackage.kjc;
import defpackage.kjj;
import defpackage.kjp;
import defpackage.kjw;
import defpackage.kko;
import defpackage.kli;
import defpackage.klq;
import defpackage.klr;
import defpackage.klu;
import defpackage.kly;
import defpackage.kme;
import defpackage.kmf;
import defpackage.kmt;
import defpackage.kmz;
import defpackage.kng;
import defpackage.knk;
import defpackage.knm;
import defpackage.knq;
import defpackage.kns;
import defpackage.koa;
import defpackage.kob;
import defpackage.koc;
import defpackage.kow;
import defpackage.kpa;
import defpackage.kpf;
import defpackage.kpj;
import defpackage.kpt;
import defpackage.kpy;
import defpackage.ksf;
import defpackage.ksg;
import defpackage.ksx;
import defpackage.kuu;
import defpackage.kuw;
import defpackage.kux;
import defpackage.kva;
import defpackage.nyk;
import defpackage.nzc;
import defpackage.odi;
import defpackage.oha;
import defpackage.oja;
import defpackage.ojb;
import defpackage.whu;
import defpackage.yjk;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.yzr;
import defpackage.zch;
import defpackage.zdd;
import defpackage.zde;
import defpackage.zdf;
import defpackage.zdg;
import defpackage.zdh;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeControlsOverlay implements Handler.Callback, ahvc, any, fll, ahuu, fnp, zdh, zdd, ahew, ahev, aidc, ahwi, kia, aicj, kuw, ksf, khz, ypd {
    public ahuh A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final Runnable F;
    public aida G;
    public final aaea H;
    public final acra I;

    /* renamed from: J, reason: collision with root package name */
    public final kns f159J;
    public final knm K;
    public final kly O;
    public final boolean P;
    public final kli Q;
    public final aadw R;
    public final axzg S;
    private final kob T;
    private final koc U;
    private final kmf V;
    private final kjw W;
    private final kjp X;
    private final ahuk Y;
    private final ajck Z;
    public final kih a;
    private final ainl aA;
    private final nyk aB;
    private final zdf aC;
    private final kuu aD;
    private final kux aE;
    private final kow aF;
    private final aiee aG;
    private final ahtp aH;
    private final kiz aJ;
    private final kjc aK;
    private final knq aL;
    private final axpg aM;
    private final axpg aN;
    private final axpg aO;
    private final ajut aQ;
    private final aigv aR;
    private final SuggestedActionsMainController aa;
    private final kko ab;
    private final odi ac;
    private kjj ad;
    private ahut ae;
    private final kng af;
    private knk ag;
    private final kpj ah;
    private final int ai;
    private final int aj;
    private Animation al;
    private Animation am;
    private boolean an;
    private boolean ao;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    private final oja aw;
    private final Context ax;
    private final ypa ay;
    private final aioc az;
    public final aica b;
    public final ahfk c;
    public final khv d;
    public final kip e;
    public kmt f;
    public ahvb g;
    public final aicz h;
    public final kgm i;
    public final ksg j;
    public View k;
    public FrameLayout l;
    public View m;
    public final kpt n;
    public final kpy o;
    public TextView p;
    public final klq q;
    public final fnd r;
    public ahqy s;
    public long u;
    public long v;
    public long w;
    public long x;
    public int t = 0;
    public ControlsState y = ControlsState.b();
    public ControlsOverlayStyle z = ControlsOverlayStyle.a;
    private fhg ap = fhg.NONE;
    private boolean aq = true;
    private final Handler ak = new Handler(this);
    public final Set N = new HashSet();
    public final azrh L = azrh.e();
    private final azrh aP = azrh.e();
    public final azrh M = azrh.e();
    private final ayqw aI = new ayqw();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0363 A[LOOP:0: B:19:0x0361->B:20:0x0363, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YouTubeControlsOverlay(android.content.Context r19, defpackage.zdf r20, defpackage.aicz r21, defpackage.kmf r22, defpackage.acra r23, defpackage.oja r24, defpackage.ahtp r25, defpackage.aica r26, defpackage.ahfk r27, defpackage.kob r28, defpackage.ajyw r29, defpackage.ogx r30, com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController r31, defpackage.kuu r32, defpackage.aigv r33, defpackage.kux r34, defpackage.koc r35, defpackage.ksg r36, final defpackage.kng r37, defpackage.ypa r38, defpackage.aioc r39, defpackage.aadw r40, defpackage.aaea r41, defpackage.kow r42, defpackage.aiee r43, defpackage.ahuk r44, defpackage.ajck r45, defpackage.kly r46, defpackage.nyk r47, android.view.View[] r48, defpackage.odi r49, defpackage.kip r50, defpackage.kih r51, defpackage.ainl r52, defpackage.kiz r53, defpackage.kjc r54, defpackage.knq r55, defpackage.kns r56, defpackage.knm r57, defpackage.nrp r58, defpackage.ogx r59, final defpackage.kkl r60, defpackage.axzg r61, defpackage.axpg r62, defpackage.axpg r63, defpackage.axpg r64, defpackage.ajut r65, defpackage.kli r66, byte[] r67, byte[] r68, byte[] r69, byte[] r70, byte[] r71, byte[] r72) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay.<init>(android.content.Context, zdf, aicz, kmf, acra, oja, ahtp, aica, ahfk, kob, ajyw, ogx, com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController, kuu, aigv, kux, koc, ksg, kng, ypa, aioc, aadw, aaea, kow, aiee, ahuk, ajck, kly, nyk, android.view.View[], odi, kip, kih, ainl, kiz, kjc, knq, kns, knm, nrp, ogx, kkl, axzg, axpg, axpg, axpg, ajut, kli, byte[], byte[], byte[], byte[], byte[], byte[]):void");
    }

    private static void Z(zdf zdfVar, zdg... zdgVarArr) {
        for (zdg zdgVar : zdgVarArr) {
            zdfVar.a(zdgVar);
        }
    }

    private final void aa() {
        gfw.a();
        C();
        if (this.t == 0) {
            return;
        }
        this.t = 0;
        V();
        ahvb ahvbVar = this.g;
        if (ahvbVar != null) {
            ahvbVar.d();
        }
    }

    private final void ab() {
        if (this.l != null) {
            return;
        }
        this.l = (FrameLayout) LayoutInflater.from(this.ax).inflate(R.layout.youtube_controls_overlay, (ViewGroup) null);
        if (evr.E(this.H)) {
            this.l.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kpb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    YouTubeControlsOverlay youTubeControlsOverlay = YouTubeControlsOverlay.this;
                    int i9 = i3 - i;
                    int i10 = i4 - i2;
                    if (evr.E(youTubeControlsOverlay.H) && youTubeControlsOverlay.B && i9 >= i10) {
                        int i11 = (i9 - ((int) (i10 * 1.7777778f))) / 2;
                        Rect rect = (Rect) youTubeControlsOverlay.L.aO();
                        youTubeControlsOverlay.L.c(new Rect(i11, rect == null ? 0 : rect.top, i11, rect != null ? rect.bottom : 0));
                    }
                }
            });
        }
        this.l.setClipToPadding(false);
        this.l.setFocusableInTouchMode(true);
        aick aickVar = new aick(this.l, (ViewStub) this.l.findViewById(R.id.quick_seek_overlay_stub), this, this.b.b);
        aica aicaVar = this.b;
        aicaVar.i = aickVar;
        aickVar.d(new aibz(aicaVar));
        aqrt aqrtVar = this.H.a().v;
        if (aqrtVar == null) {
            aqrtVar = aqrt.a;
        }
        aickVar.c(aqrtVar.f);
        this.aD.k(new kva(this.ax, (ViewStub) this.l.findViewById(R.id.video_zoom_overlay_stub)), this.aE);
        this.aE.e(this);
        this.l.setTag(R.id.player_overlay_tap_listener, this);
        final knq knqVar = this.aL;
        FrameLayout frameLayout = this.l;
        if (!knqVar.g.h()) {
            knqVar.g = ammv.j(new yzr(((ViewStub) frameLayout.findViewById(R.id.easy_seek_overlay_stub)).inflate()));
            ((yzr) knqVar.g.c()).d = frameLayout.getResources().getInteger(R.integer.fade_duration_fast);
            ((yzr) knqVar.g.c()).h(new zch() { // from class: kno
                @Override // defpackage.zch
                public final void nE(int i, yzr yzrVar) {
                    knq.this.b.f(i != 0);
                }
            });
            knqVar.e.D(new acqx(acsb.c(119372)));
        }
        final kiz kizVar = this.aJ;
        FrameLayout frameLayout2 = this.l;
        if (!kizVar.q.h()) {
            View findViewById = frameLayout2.findViewById(R.id.easy_seek_edu_container);
            if (findViewById == null) {
                kizVar.q = ammv.j(new yzr(((ViewStub) frameLayout2.findViewById(R.id.easy_seek_overlay_stub)).inflate()));
            } else {
                kizVar.q = ammv.j(new yzr(findViewById));
            }
            ((yzr) kizVar.q.c()).d = frameLayout2.getResources().getInteger(R.integer.fade_duration_fast);
            ((yzr) kizVar.q.c()).h(new zch() { // from class: kix
                @Override // defpackage.zch
                public final void nE(int i, yzr yzrVar) {
                    kiz.this.j.f(i != 0);
                }
            });
            kizVar.k.D(new acqx(acsb.c(119372)));
            kizVar.k.n(new acqx(acsb.c(124587)));
        }
        Z(this.aC, this.aE, this.i, this.ac);
        this.aC.b(this.aK);
        zdf zdfVar = new zdf();
        zde zdeVar = new zde(ViewConfiguration.get(this.ax));
        zdeVar.c = this;
        zdeVar.b = this;
        Z(zdfVar, this.aK, zdeVar, this.aE, this.i, this.ac);
        ImageView imageView = (ImageView) this.l.findViewById(R.id.scrim_overlay);
        zdfVar.c(imageView);
        knk knkVar = new knk(imageView);
        this.ag = knkVar;
        this.a.a(knkVar);
        if (this.aF.i) {
            this.aF.f((ViewStub) this.l.findViewById(R.id.watch_while_timebar_overlay_stub), jzf.c);
        }
        this.a.a(new klr(this.l, this.R));
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            this.l.addView((View) it.next());
        }
        this.N.clear();
        this.h.bringToFront();
        this.C = true;
        ahut ahutVar = this.ae;
        if (ahutVar != null) {
            ahutVar.d(this, this.l);
        }
    }

    private final void ac(float f) {
        if (f >= 0.0f || !this.h.c.g() || this.t == 1 || this.z.o) {
            return;
        }
        R();
    }

    private final void ad(boolean z, boolean z2) {
        if (this.h.getParent() == null) {
            return;
        }
        if (!this.D && !z && this.h.c.d()) {
            this.h.e(0);
        }
        if (!z2) {
            whu.I(this.h, z);
            return;
        }
        if (z) {
            if (this.am == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.ax, R.anim.fade_in);
                this.am = loadAnimation;
                loadAnimation.setDuration(this.ai);
            }
            this.h.startAnimation(this.am);
            return;
        }
        if (this.h.getVisibility() == 0) {
            if (this.al == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.ax, R.anim.fade_out);
                this.al = loadAnimation2;
                loadAnimation2.setDuration(this.ai);
            }
            this.h.startAnimation(this.al);
        }
    }

    private final void ae(boolean z) {
        this.aP.c(Boolean.valueOf(z));
    }

    private final void af(boolean z) {
        if (this.t == 0) {
            return;
        }
        this.t = 2;
        int i = z ? this.ai : this.aj;
        koc kocVar = this.U;
        koc.d(kocVar.c.a, i);
        koc.d(kocVar.c.f, i);
        koc.d(kocVar.c.e, i);
        koc.d(kocVar.c.b, i);
        koc.d(kocVar.c.d, i);
        koc.d(kocVar.c.g, i);
        koc.b(kocVar.a, i);
        koc.b(kocVar.b, i);
        kmt kmtVar = this.f;
        if (kmtVar != null) {
            kmtVar.l.d = i;
        }
        kmf kmfVar = this.V;
        kmf.c(kmfVar.n, i);
        kmf.c(kmfVar.m, i);
        kmf.c(kmfVar.o, i);
        kmf.c(kmfVar.p, i);
        kmf.c(kmfVar.q, i);
        khv khvVar = this.d;
        yzr yzrVar = khvVar.m;
        if (yzrVar != null) {
            khvVar.j = i;
            long j = i;
            yzrVar.d = j;
            SuggestedActionsMainController suggestedActionsMainController = khvVar.e;
            yzr yzrVar2 = suggestedActionsMainController.o;
            if (yzrVar2 != null) {
                suggestedActionsMainController.k = i;
                yzrVar2.d = j;
                suggestedActionsMainController.f.d.d = i;
            }
        }
        yzr yzrVar3 = this.W.h;
        if (yzrVar3 != null) {
            yzrVar3.d = i;
        }
        this.n.e.A(i);
        kiw kiwVar = this.o.l;
        if (kiwVar != null) {
            long j2 = i;
            kiwVar.j.d = j2;
            kiwVar.k.d = j2;
            kiwVar.l.d = j2;
            kiwVar.m.d = j2;
            kiwVar.n.d = j2;
        }
        Animation animation = this.al;
        if (animation != null) {
            animation.setDuration(i);
        }
        knk knkVar = this.ag;
        if (knkVar != null) {
            knkVar.a.d = i;
        }
        long j3 = i;
        this.e.c = j3;
        this.a.b(true);
        ad(false, true);
        this.ak.removeMessages(2);
        this.ak.sendEmptyMessageDelayed(2, j3);
    }

    private final void ag(boolean z) {
        if (z) {
            E();
        }
        View view = this.k;
        if (view == null) {
            return;
        }
        whu.I(view, z);
    }

    private final boolean ah(MotionEvent motionEvent) {
        if (this.ar || ControlsOverlayStyle.a(this.z) || ControlsOverlayStyle.c(this.z) || this.y.i() || this.y.a == ahvo.ENDED) {
            return false;
        }
        return (aicf.b((int) motionEvent.getX(), this.l.getWidth(), false) != 2 || this.w > this.v) && !this.j.i();
    }

    private final boolean ai() {
        if (!aj()) {
            return false;
        }
        if (this.t != 1) {
            R();
        } else {
            C();
        }
        return true;
    }

    private final boolean aj() {
        if (!this.ao) {
            if (evr.aO(this.R)) {
                return this.A.a;
            }
            if (!this.an) {
                return false;
            }
        }
        return true;
    }

    public final int A() {
        return this.ax.getResources().getDimensionPixelSize(R.dimen.controls_overlay_bottom_ui_size);
    }

    @Override // defpackage.aivf
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ViewGroup ld() {
        ab();
        return this.l;
    }

    public final void C() {
        this.ak.removeMessages(1);
        this.ak.removeMessages(2);
        this.h.clearAnimation();
    }

    public final void D(ahdv ahdvVar) {
        if (ahdvVar.c() == aigk.VIDEO_WATCH_LOADED) {
            this.I.n(new acqx(acsb.c(54319)));
            this.I.n(new acqx(acsb.c(54318)));
            if (this.l != null && aj()) {
                this.l.getRootView().clearFocus();
                this.l.requestFocus();
            }
            kpy kpyVar = this.o;
            WatchNextResponseModel a = ahdvVar.a();
            if (a != null) {
                kpyVar.i.c(a);
            }
        }
        PlayerResponseModel b = ahdvVar.b();
        if (b != null) {
            PlayerConfigModel c = b.c();
            atyj atyjVar = c.c.m;
            if (atyjVar == null) {
                atyjVar = atyj.a;
            }
            ae(atyjVar.b);
            if (evr.bj(this.R)) {
                return;
            }
            VideoStreamingData videoStreamingData = b.c;
            boolean z = true;
            boolean z2 = videoStreamingData != null && videoStreamingData.H();
            kly klyVar = this.O;
            if (!c.am() || (!c.aE() && !z2)) {
                z = false;
            }
            klyVar.d(klu.m, Boolean.valueOf(z));
        }
    }

    public final void E() {
        ab();
        if (this.k != null) {
            return;
        }
        View inflate = ((ViewStub) this.l.findViewById(R.id.controls_layout_stub)).inflate();
        this.k = inflate;
        final klq klqVar = this.q;
        TextView textView = (TextView) inflate.findViewById(R.id.player_learn_more_button);
        textView.getClass();
        klqVar.d = textView;
        final int i = 2;
        klqVar.a.ax(new ayrs() { // from class: klp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    klqVar.d.setText((CharSequence) obj);
                } else if (i2 == 1) {
                    klqVar.d.setOnClickListener((View.OnClickListener) obj);
                } else {
                    klqVar.d.setVisibility(((Integer) obj).intValue());
                }
            }
        });
        final int i2 = 0;
        klqVar.b.ax(new ayrs() { // from class: klp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    klqVar.d.setText((CharSequence) obj);
                } else if (i22 == 1) {
                    klqVar.d.setOnClickListener((View.OnClickListener) obj);
                } else {
                    klqVar.d.setVisibility(((Integer) obj).intValue());
                }
            }
        });
        final int i3 = 1;
        klqVar.c.ax(new ayrs() { // from class: klp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    klqVar.d.setText((CharSequence) obj);
                } else if (i22 == 1) {
                    klqVar.d.setOnClickListener((View.OnClickListener) obj);
                } else {
                    klqVar.d.setVisibility(((Integer) obj).intValue());
                }
            }
        });
        final kip kipVar = this.e;
        TextView textView2 = (TextView) this.k.findViewById(R.id.temp_toast);
        TextView textView3 = (TextView) this.k.findViewById(R.id.persistent_toast);
        kpf kpfVar = new kpf(this);
        kio kioVar = new kio(jg.o(0.05f, 0.0f, 0.0f, 1.0f));
        kipVar.d = new yzr(textView2, 500L, kioVar, 8);
        kipVar.e = new yzr(textView3, 500L, kioVar, 8);
        kipVar.f = kpfVar;
        kipVar.d.h(new zch() { // from class: kil
            @Override // defpackage.zch
            public final void nE(int i4, yzr yzrVar) {
                if (i3 != 0) {
                    kip kipVar2 = kipVar;
                    if (i4 == 0 && kipVar2.a == null) {
                        ((TextView) kipVar2.d.b).setText((CharSequence) null);
                        return;
                    }
                    return;
                }
                kip kipVar3 = kipVar;
                if (i4 == 0 && kipVar3.b == null) {
                    ((TextView) kipVar3.e.b).setText((CharSequence) null);
                }
            }
        });
        kipVar.e.h(new zch() { // from class: kil
            @Override // defpackage.zch
            public final void nE(int i4, yzr yzrVar) {
                if (i2 != 0) {
                    kip kipVar2 = kipVar;
                    if (i4 == 0 && kipVar2.a == null) {
                        ((TextView) kipVar2.d.b).setText((CharSequence) null);
                        return;
                    }
                    return;
                }
                kip kipVar3 = kipVar;
                if (i4 == 0 && kipVar3.b == null) {
                    ((TextView) kipVar3.e.b).setText((CharSequence) null);
                }
            }
        });
        ((TextView) kipVar.d.b).addOnAttachStateChangeListener(new kin(kipVar));
        fnd fndVar = kipVar.a;
        if (fndVar != null) {
            ((TextView) kipVar.d.b).setText(fndVar.a);
        }
        fnd fndVar2 = kipVar.b;
        if (fndVar2 != null) {
            ((TextView) kipVar.e.b).setText(fndVar2.a);
        }
        kpfVar.a(kipVar.a != null);
        kipVar.e(false);
        this.a.a(this.e);
        kmt kmtVar = new kmt((ImageView) this.l.findViewById(R.id.player_control_play_pause_replay_button), this.R, new axpg() { // from class: kpg
            @Override // defpackage.axpg
            public final Object get() {
                return YouTubeControlsOverlay.this.S;
            }
        }, this.aM, this.aN, this.aO);
        this.f = kmtVar;
        kmtVar.g = this.g;
        this.a.a(kmtVar);
        final kob kobVar = this.T;
        FrameLayout frameLayout = this.l;
        int i4 = this.ai;
        kobVar.l = new koa(frameLayout, i4);
        kobVar.j.ax(new ayrs() { // from class: knz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                arfr b;
                kob kobVar2 = kob.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                koa koaVar = kobVar2.l;
                if (koaVar == null) {
                    return;
                }
                apmp apmpVar = kobVar2.m;
                if (apmpVar != null) {
                    int i5 = apmpVar.b;
                    if ((i5 & 2048) != 0 && (i5 & 32) != 0) {
                        TouchImageView touchImageView = (TouchImageView) koaVar.d.b;
                        ggs ggsVar = kobVar2.b;
                        if (booleanValue) {
                            arfs arfsVar = apmpVar.m;
                            if (arfsVar == null) {
                                arfsVar = arfs.a;
                            }
                            b = arfr.b(arfsVar.c);
                            if (b == null) {
                                b = arfr.UNKNOWN;
                            }
                        } else {
                            arfs arfsVar2 = apmpVar.g;
                            if (arfsVar2 == null) {
                                arfsVar2 = arfs.a;
                            }
                            b = arfr.b(arfsVar2.c);
                            if (b == null) {
                                b = arfr.UNKNOWN;
                            }
                        }
                        touchImageView.setImageResource(ggsVar.a(b));
                        ((TouchImageView) kobVar2.l.d.b).setContentDescription(booleanValue ? kobVar2.m.o : kobVar2.m.i);
                        return;
                    }
                }
                kobVar2.a.g = false;
            }
        });
        ajyw ajywVar = kobVar.p;
        ImageView imageView = (ImageView) kobVar.l.e.b;
        fgq fgqVar = (fgq) ajywVar.b.get();
        fgqVar.getClass();
        ayqd ayqdVar = (ayqd) ajywVar.c.get();
        ayqdVar.getClass();
        acra acraVar = (acra) ajywVar.a.get();
        acraVar.getClass();
        kobVar.n = new khy(fgqVar, ayqdVar, acraVar, imageView);
        kobVar.a.c = kobVar.l;
        final kmz kmzVar = kobVar.h;
        FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(kmzVar.a).inflate(R.layout.player_heading_view_container, (ViewGroup) frameLayout.findViewById(R.id.player_video_heading));
        kmzVar.g = (TextView) frameLayout2.findViewById(R.id.player_video_title_view);
        kmzVar.f = kmzVar.b.a();
        int i5 = 8;
        kmzVar.f.setVisibility(8);
        frameLayout2.addView(kmzVar.f);
        kmzVar.e.ax(new ayrs() { // from class: kmw
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kmz kmzVar2 = kmz.this;
                if (obj instanceof aqrf) {
                    kmx kmxVar = (kmx) kmzVar2.i;
                    kmxVar.a.f.setVisibility(0);
                    kmxVar.a.g.setVisibility(8);
                    kmz kmzVar3 = kmxVar.a;
                    ajdw ajdwVar = kmzVar3.b;
                    ajok ajokVar = kmzVar3.d;
                    ajdwVar.oB(ajokVar, ajds.a((aqrf) obj));
                    return;
                }
                if (obj instanceof CharSequence) {
                    kmx kmxVar2 = (kmx) kmzVar2.h;
                    kmxVar2.a.g.setVisibility(0);
                    kmxVar2.a.f.setVisibility(8);
                    kmxVar2.a.g.setText((CharSequence) obj);
                }
            }
        });
        kobVar.e.h((ViewStub) frameLayout.findViewById(R.id.autonav_preview_stub), i4);
        kobVar.f.h((ViewStub) frameLayout.findViewById(R.id.autonav_toggle), i4);
        frameLayout.addOnLayoutChangeListener(kobVar);
        Iterator it = kobVar.k.iterator();
        while (it.hasNext()) {
            kobVar.b((View) it.next());
        }
        kobVar.k.clear();
        kobVar.g.t(kobVar.i);
        final khy khyVar = kobVar.n;
        khyVar.a(khyVar.a.g().b());
        khyVar.a.i(khyVar);
        khyVar.d.setOnClickListener(new View.OnClickListener() { // from class: khx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                khy khyVar2 = khy.this;
                khyVar2.c.I(3, new acqx(acsb.c(35988)), null);
                khyVar2.b.c(nni.a);
            }
        });
        ((TouchImageView) kobVar.l.f.b).setOnClickListener(new View.OnClickListener() { // from class: knx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i3 == 0) {
                    kob kobVar2 = kobVar;
                    kobVar2.c.c(new abja(kobVar2.o == 2));
                } else {
                    kobVar.d.g();
                }
            }
        });
        ((TouchImageView) kobVar.l.d.b).setOnClickListener(new View.OnClickListener() { // from class: knx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    kob kobVar2 = kobVar;
                    kobVar2.c.c(new abja(kobVar2.o == 2));
                } else {
                    kobVar.d.g();
                }
            }
        });
        kobVar.g.u(anij.a);
        this.a.a(this.U);
        final kmf kmfVar = this.V;
        FrameLayout frameLayout3 = this.l;
        kmfVar.f = this;
        long integer = frameLayout3.getResources().getInteger(R.integer.fade_duration_fast);
        kmfVar.n = new yzr(frameLayout3.findViewById(R.id.player_control_previous_button), integer, 8);
        kmfVar.m = new yzr(frameLayout3.findViewById(R.id.player_control_next_button), integer, 8);
        kmfVar.o = new yzr(frameLayout3.findViewById(R.id.player_control_rewind_button), integer, 8);
        kmfVar.p = new yzr(frameLayout3.findViewById(R.id.player_control_fast_forward_button), integer, 8);
        kmfVar.q = new yzr((ImageView) frameLayout3.findViewById(R.id.player_control_play_pause_replay_button), integer, 8);
        Resources resources = frameLayout3.getResources();
        kmfVar.g = resources.getDimensionPixelSize(R.dimen.overlay_midui_default_margin);
        kmfVar.h = resources.getDimensionPixelSize(R.dimen.overlay_midui_fullscreen_margin);
        kmfVar.i = resources.getDimensionPixelSize(R.dimen.overlay_midui_accessibility_margin);
        kmfVar.j = resources.getDimensionPixelSize(R.dimen.overlay_midui_accessibility_fullscreen_margin);
        jw.M(kmfVar.m.b, new kme(kmfVar));
        kmfVar.m.b.setOnClickListener(new View.OnClickListener() { // from class: kmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i3;
                if (i6 == 0) {
                    kly klyVar = kmfVar.a;
                    klyVar.d.nf();
                    klyVar.e.b();
                } else if (i6 == 1) {
                    kly klyVar2 = kmfVar.a;
                    klyVar2.d.nf();
                    klyVar2.e.a();
                } else if (i6 != 2) {
                    kmfVar.a(false);
                } else {
                    kmfVar.a(true);
                }
            }
        });
        kmfVar.n.b.setOnClickListener(new View.OnClickListener() { // from class: kmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i2;
                if (i6 == 0) {
                    kly klyVar = kmfVar.a;
                    klyVar.d.nf();
                    klyVar.e.b();
                } else if (i6 == 1) {
                    kly klyVar2 = kmfVar.a;
                    klyVar2.d.nf();
                    klyVar2.e.a();
                } else if (i6 != 2) {
                    kmfVar.a(false);
                } else {
                    kmfVar.a(true);
                }
            }
        });
        kmfVar.p.b.setOnClickListener(new View.OnClickListener() { // from class: kmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                if (i6 == 0) {
                    kly klyVar = kmfVar.a;
                    klyVar.d.nf();
                    klyVar.e.b();
                } else if (i6 == 1) {
                    kly klyVar2 = kmfVar.a;
                    klyVar2.d.nf();
                    klyVar2.e.a();
                } else if (i6 != 2) {
                    kmfVar.a(false);
                } else {
                    kmfVar.a(true);
                }
            }
        });
        final int i6 = 3;
        kmfVar.o.b.setOnClickListener(new View.OnClickListener() { // from class: kmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                if (i62 == 0) {
                    kly klyVar = kmfVar.a;
                    klyVar.d.nf();
                    klyVar.e.b();
                } else if (i62 == 1) {
                    kly klyVar2 = kmfVar.a;
                    klyVar2.d.nf();
                    klyVar2.e.a();
                } else if (i62 != 2) {
                    kmfVar.a(false);
                } else {
                    kmfVar.a(true);
                }
            }
        });
        kmfVar.d.c();
        kmfVar.d.d(kmfVar.a.c.ax(new ayrs() { // from class: kmd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x00c4  */
            @Override // defpackage.ayrs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 470
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kmd.a(java.lang.Object):void");
            }
        }));
        this.a.a(this.O);
        ksx ksxVar = new ksx((ViewStub) this.l.findViewById(R.id.scrubbed_preview_extended), this.k, this.aF, this.aG, this.aH, this.h.c, this.aJ, this.R, this.aQ);
        this.n.d = ksxVar;
        kpy kpyVar = this.o;
        azrs azrsVar = ksxVar.a;
        kpyVar.m = ammv.j(azrsVar);
        kiw kiwVar = kpyVar.l;
        if (kiwVar != null) {
            kiwVar.i(azrsVar);
        }
        final kjw kjwVar = this.W;
        azrs azrsVar2 = ksxVar.a;
        kjwVar.a.c();
        kjwVar.a.d(azrsVar2.ax(new ayrs() { // from class: kjr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kjw kjwVar2 = kjw.this;
                Rect rect = (Rect) obj;
                yzr yzrVar = kjwVar2.h;
                if (yzrVar == null || !kjwVar2.d) {
                    return;
                }
                View view = yzrVar.b;
                view.getGlobalVisibleRect(kjwVar2.b);
                kjwVar2.b.offset(view.getPaddingRight(), 0);
                boolean z = kjwVar2.c;
                boolean intersect = kjwVar2.b.intersect(rect);
                kjwVar2.c = intersect;
                if (z != intersect) {
                    kjwVar2.a();
                }
            }
        }));
        kjj kjjVar = new kjj(this.l);
        this.ad = kjjVar;
        this.a.a(kjjVar);
        this.aP.B().ax(new kpa(this, i5));
        this.L.B().ax(new kpa(this, i3));
    }

    public final void F() {
        if (this.t != 0) {
            if ((this.y.a != ahvo.PLAYING && !this.y.b) || !X() || this.ak.hasMessages(1) || this.j.i() || this.E || this.aL.j) {
                return;
            }
            Handler handler = this.ak;
            ahuh ahuhVar = this.A;
            handler.sendEmptyMessageDelayed(1, ahuhVar.a ? ahuhVar.d : 2000L);
        }
    }

    @Override // defpackage.ahev
    public final void G(boolean z) {
        this.as = z;
    }

    @Override // defpackage.ahwi
    public final void H(boolean z) {
        this.a.e.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ahwi
    public final void I(boolean z) {
        this.au = z;
        this.a.f.c(Boolean.valueOf(z));
    }

    @Override // defpackage.aicj
    public final void J() {
        if (this.at) {
            return;
        }
        this.at = true;
        this.a.e(true);
        ahqy ahqyVar = this.s;
        if (ahqyVar != null) {
            ahqyVar.g(true);
        }
    }

    @Override // defpackage.aicj
    public final void K() {
        if (this.at) {
            this.at = false;
            this.a.e(false);
            ahqy ahqyVar = this.s;
            if (ahqyVar != null) {
                ahqyVar.g(false);
            }
        }
    }

    @Override // defpackage.aidc
    public final void L(float f) {
        ac(f);
    }

    @Override // defpackage.aidc
    public final void M(float f) {
        ac(f);
    }

    @Override // defpackage.aidc
    public final void N(float f) {
        ac(f);
    }

    protected final void O(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ControlsState g = z ? ControlsState.g() : ControlsState.h();
        this.y = g;
        this.a.c(g);
        V();
        kjj kjjVar = this.ad;
        Context context = this.ax;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (!TextUtils.isEmpty(charSequence2)) {
            spannableStringBuilder.append((CharSequence) "\n\n").append(charSequence2);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            if (yjk.W(context)) {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.tap_to_retry));
            } else {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.click_to_retry));
            }
        }
        kjjVar.a.setText(spannableStringBuilder);
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
    }

    public final void P(boolean z) {
        gfw.a();
        if (this.y.i()) {
            return;
        }
        if ((mY(this.ap) || aj()) && !this.ar) {
            C();
            if (this.t == 1) {
                return;
            }
            this.t = 1;
            W(z);
            if (this.y.a == ahvo.PLAYING || this.y.a == ahvo.PAUSED) {
                this.n.nO();
            }
            ahvb ahvbVar = this.g;
            if (ahvbVar != null) {
                ahvbVar.v();
            }
            F();
        }
    }

    public final void Q() {
        pA();
        C();
    }

    public final void R() {
        if (this.y.i() || this.t == 1) {
            return;
        }
        P(true);
        if (this.aq) {
            ad(true, true);
        }
    }

    public final void S() {
        af(true);
    }

    public final void T() {
        if (this.j.i()) {
            return;
        }
        if (this.t != 1) {
            if (this.z.o) {
                return;
            }
            R();
        } else if (X()) {
            C();
            S();
        }
    }

    public final void U() {
        kpt kptVar = this.n;
        boolean z = true;
        if (!this.an && !this.ao) {
            z = false;
        }
        if (kptVar.g != z) {
            kptVar.g = z;
            kptVar.nO();
        }
        if (ai()) {
            return;
        }
        V();
        F();
    }

    public final void V() {
        W(false);
    }

    public final void W(boolean z) {
        boolean z2 = true;
        if ((this.z.o && X()) || this.t == 0 || this.y.i()) {
            this.a.b(z);
            ad(false, false);
            ViewGroup viewGroup = this.aa.h;
            if ((viewGroup == null || viewGroup.getChildCount() <= 0) && !this.W.b() && ((!this.z.v || !this.y.j()) && !this.y.i())) {
                z2 = false;
            }
            ag(z2);
            this.t = 0;
            return;
        }
        this.a.a.c(Pair.create(true, Boolean.valueOf(z)));
        ad(true, false);
        ag(true);
        this.t = 1;
    }

    public final boolean X() {
        if (evr.aO(this.R)) {
            ahuh ahuhVar = this.A;
            if (ahuhVar.a && !ahuhVar.c) {
                return false;
            }
        } else if (this.an) {
            return false;
        }
        return !this.ao;
    }

    public final boolean Y(boolean z) {
        if (z) {
            ab();
        }
        return !this.C;
    }

    @Override // defpackage.ahew
    public final void a(boolean z) {
        if (this.ar == z) {
            return;
        }
        this.ar = z;
        if (z) {
            aa();
        } else if (this.as || aj()) {
            pA();
        }
        this.a.b.c(Boolean.valueOf(z));
    }

    @Override // defpackage.zdh
    public final void b(MotionEvent motionEvent) {
        DefaultWatchPanelViewController defaultWatchPanelViewController;
        nzc nzcVar;
        ahvb ahvbVar;
        if (this.ar || this.aJ.u) {
            return;
        }
        if (this.y.a != ahvo.RECOVERABLE_ERROR || (ahvbVar = this.g) == null) {
            if (!this.b.e || !ah(motionEvent)) {
                T();
                ojb ojbVar = this.aw.a;
                if (ojbVar == null || (nzcVar = (defaultWatchPanelViewController = (DefaultWatchPanelViewController) ojbVar).i) == null) {
                    return;
                }
                nzcVar.g(0, true);
                oha ohaVar = defaultWatchPanelViewController.u;
                if (ohaVar != null) {
                    ValueAnimator valueAnimator = ohaVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ohaVar.f = null;
                    }
                    ohaVar.e = 0;
                    ohaVar.b.setTranslationY(0.0f);
                    return;
                }
                return;
            }
            this.c.a();
            this.b.a(motionEvent, this.l, false);
            return;
        }
        ahvbVar.o();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.kuw
    public final void f() {
        C();
        S();
        ahqy ahqyVar = this.s;
        if (ahqyVar != null) {
            ahqyVar.h(true);
        }
        this.l.getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // defpackage.ksf
    public final void g(int i, boolean z) {
        if (Y(this.j.i())) {
            return;
        }
        this.a.c.c(Boolean.valueOf(this.j.i()));
        if (this.j.i()) {
            if (this.j.a().getParent() == null) {
                this.l.addView(this.j.a());
                this.h.bringToFront();
            }
        } else if (!z && this.av != this.j.i()) {
            F();
        }
        this.av = this.j.i();
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        this.g = ahvbVar;
        kmt kmtVar = this.f;
        if (kmtVar != null) {
            kmtVar.g = ahvbVar;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            af(false);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        aa();
        return true;
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        kpt kptVar = this.n;
        ahyg ahygVar = kptVar.b;
        if (ahygVar.m == z) {
            return;
        }
        ahygVar.m = z;
        if (!z) {
            kptVar.nU();
        }
        kptVar.a.y(kptVar.b);
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        if (amkq.b(this.z, controlsOverlayStyle)) {
            return;
        }
        this.z = controlsOverlayStyle;
        this.a.g(controlsOverlayStyle);
        V();
        F();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            D((ahdv) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.khz
    public final void m() {
        int i = this.t;
        if (i == 0) {
            return;
        }
        if (i == 2) {
            if (this.z.o) {
                return;
            }
            R();
        } else if (X()) {
            C();
            F();
        }
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar) && !fhgVar.l();
    }

    @Override // defpackage.ahuu
    public final void mZ(ahut ahutVar) {
        this.ae = ahutVar;
    }

    @Override // defpackage.zdd
    public final void nG(MotionEvent motionEvent, boolean z) {
        if (ah(motionEvent)) {
            this.c.a();
            this.b.a(motionEvent, this.l, z);
        }
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        kiw kiwVar;
        if (this.ap == fhgVar) {
            return;
        }
        this.ap = fhgVar;
        if (mY(fhgVar)) {
            ab();
        }
        this.B = fhgVar.b();
        this.a.d(fhgVar);
        this.Y.b();
        if (fhgVar != fhg.NONE || (kiwVar = this.o.l) == null) {
            return;
        }
        kiwVar.f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        if (r0.a.equals(r4.y.a) != false) goto L39;
     */
    @Override // defpackage.ahvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nI(com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r5) {
        /*
            r4 = this;
            fnd r0 = r4.r
            r0.getClass()
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r0 = r4.y
            r1 = 0
            if (r0 == 0) goto L13
            if (r5 == 0) goto L13
            ahvo r2 = r5.a
            ahvo r0 = r0.a
            if (r2 != r0) goto L13
            r1 = 1
        L13:
            if (r5 == 0) goto L25
            if (r1 == 0) goto L18
            goto L25
        L18:
            ahvo r0 = r5.a
            ahvo r1 = defpackage.ahvo.PLAYING
            if (r0 != r1) goto L25
            kip r0 = r4.e
            fnd r1 = r4.r
            r0.a(r1)
        L25:
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r0 = r4.y
            r4.y = r5
            aigv r1 = r4.aR
            boolean r1 = r1.h()
            defpackage.gfw.c()
            kih r2 = r4.a
            r2.c(r5)
            r4.V()
            ahvo r2 = r5.a
            ahvo r3 = defpackage.ahvo.NEW
            if (r2 != r3) goto L52
            r4.ai()
            kpt r2 = r4.n
            r2.nU()
            if (r1 == 0) goto L52
            r4.ng()
            kpt r2 = r4.n
            r2.g()
        L52:
            ahvo r2 = r5.a
            ahvo r3 = defpackage.ahvo.ENDED
            if (r2 != r3) goto L5d
            kpt r2 = r4.n
            r2.nT()
        L5d:
            ahvo r2 = r5.a
            ahvo r3 = defpackage.ahvo.ENDED
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            ainl r2 = r4.aA
            aims r3 = defpackage.aims.c
            boolean r2 = r2.j(r3)
            if (r2 != 0) goto L75
            boolean r2 = r4.au
            if (r2 == 0) goto L9d
        L75:
            ahvo r2 = r5.a
            ahvo r3 = defpackage.ahvo.PAUSED
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La0
            if (r1 != 0) goto La0
            aadw r1 = r4.R
            apwy r1 = r1.b()
            asvu r1 = r1.e
            if (r1 != 0) goto L8d
            asvu r1 = defpackage.asvu.a
        L8d:
            boolean r1 = r1.bB
            if (r1 == 0) goto L9d
            ahvo r0 = r0.a
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r1 = r4.y
            ahvo r1 = r1.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La0
        L9d:
            r4.pA()
        La0:
            ahvo r0 = r5.a
            ahvo r1 = defpackage.ahvo.PLAYING
            if (r0 == r1) goto Lad
            boolean r5 = r5.b
            if (r5 != 0) goto Lad
            r4.C()
        Lad:
            r4.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay.nI(com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState):void");
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
        this.M.c(charSequence);
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
        if (this.an == z) {
            return;
        }
        this.an = z;
        this.a.d.c(Boolean.valueOf(z));
        U();
    }

    @Override // defpackage.zdd
    public final boolean nL(MotionEvent motionEvent, boolean z) {
        if (this.b.e) {
            return false;
        }
        asvu asvuVar = this.R.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return aicf.b((int) motionEvent.getX(), this.l.getWidth(), z && asvuVar.be) != 0;
    }

    @Override // defpackage.ahvc
    public final void nf() {
        if (X()) {
            aa();
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        ns();
        k(ControlsOverlayStyle.a);
        ae(false);
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        O(str, null, z);
    }

    @Override // defpackage.ahuu
    public final boolean np() {
        return this.C;
    }

    @Override // defpackage.ahvc
    public final void ns() {
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
        this.x = 0L;
        this.n.g();
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        Object obj;
        if (!evr.au(this.R)) {
            this.ay.m(this);
        }
        this.aI.c();
        kmt kmtVar = this.f;
        if (kmtVar == null || (obj = kmtVar.k) == null) {
            return;
        }
        ayrz.c((AtomicReference) obj);
        kmtVar.k = null;
    }

    @Override // defpackage.kia
    public final void o(boolean z) {
        if (this.ao == z) {
            return;
        }
        this.ao = z;
        kko kkoVar = this.ab;
        kkoVar.c = z;
        kkoVar.u();
        U();
    }

    @Override // defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = i != 0 && (!keyEvent.isSystem() || ahbl.b(i));
        if (z) {
            pA();
        }
        if (this.g == null || this.y.a != ahvo.RECOVERABLE_ERROR || !z || i == 20 || i == 21 || i == 22 || i == 19) {
            return this.C && this.l.onKeyDown(i, keyEvent);
        }
        this.g.o();
        return true;
    }

    @Override // defpackage.ahvc
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.C && this.l.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (evr.au(this.R)) {
            this.aI.d(this.az.ao().G().E(ayqr.a()).Y(new kpa(this, 4), kfe.q));
        } else {
            this.ay.g(this);
        }
        if (evr.aO(this.R)) {
            this.aI.d(this.Y.a().E(ayqr.a()).Y(new kpa(this, 6), kfe.q));
        }
        ayqw ayqwVar = this.aI;
        aypn aypnVar = this.aB.a;
        final kih kihVar = this.a;
        kihVar.getClass();
        ayqwVar.d(aypnVar.X(new ayrs() { // from class: kph
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kih.this.g.c((zcp) obj);
            }
        }));
        this.aI.d(this.az.ab().Y(new kpa(this, 5), kfe.q));
        this.aI.d(this.az.G().c.G().E(ayqr.a()).Y(new kpa(this, 3), kfe.q));
        this.aI.d(this.az.G().f.G().E(ayqr.a()).Y(new kpa(this, 7), kfe.q));
    }

    @Override // defpackage.ahvc
    public final void pA() {
        P(false);
    }

    @Override // defpackage.ahvc
    public final void pB() {
        whu.K(this.ax, R.string.no_subtitles, 0);
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
        kpt kptVar = this.n;
        fhg fhgVar = kptVar.k;
        if (fhgVar == null || !fhgVar.f() || kptVar.k.d()) {
            return;
        }
        ahyg ahygVar = kptVar.b;
        ahygVar.r = map;
        kptVar.a.y(ahygVar);
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        this.u = j3;
        this.v = j2;
        this.w = j;
        this.x = j4;
        this.n.j(j, j2, j3, j4);
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
        this.X.a.c(Boolean.valueOf(z));
        if (this.y.a == ahvo.PLAYING && this.t != 0 && X()) {
            C();
            S();
        }
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
    }

    @Override // defpackage.kuw
    public final void t(boolean z) {
        ahqy ahqyVar = this.s;
        if (ahqyVar != null) {
            ahqyVar.h(false);
        }
    }

    @Override // defpackage.kuw
    public final void u(float f) {
    }

    @Override // defpackage.ahvc
    public final void y() {
        if (this.an) {
            return;
        }
        aa();
    }

    @Override // defpackage.ahvc
    public final void z(atyq atyqVar, boolean z) {
        aqyg aqygVar = atyqVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned c = ajcq.c(aqygVar, this.Z);
        aqyg aqygVar2 = atyqVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        O(c, ajcq.c(aqygVar2, this.Z), z);
    }
}

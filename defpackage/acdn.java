package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdn {
    public acdp A;
    public accq B;
    public acda C;
    public byte[] D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f27J;
    public boolean K;
    public boolean L;
    public boolean M;
    public Dialog N;
    private final WindowManager O;
    private final ViewGroup P;
    private final ViewGroup Q;
    private final Drawable R;
    private final String S;
    private final Drawable T;
    private final String U;
    private final Drawable V;
    private final String W;
    private final Drawable X;
    private final String Y;
    private final Drawable Z;
    public final WindowManager.LayoutParams a;
    private final String aa;
    private final Drawable ab;
    private final String ac;
    private final Drawable ad;
    private final String ae;
    private final Drawable af;
    private final String ag;
    private final ViewGroup ah;
    private final ViewGroup ai;
    private final Animator aj;
    private final Animator ak;
    private final ajut al;
    private Animator am;
    private Animator an;
    private boolean ao;
    private long ap;
    public final ViewGroup b;
    public final View c;
    public final StreamStatusView d;
    public final ImageButton e;
    public final Context f;
    public final ViewGroup g;
    public final ImageView h;
    public final String i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final ViewGroup m;
    public final ImageView n;
    public final acra o;
    public final ViewGroup p;
    public final YouTubeTextView q;
    public final ImageView r;
    public final SeekBar s;
    public final Animator t;
    public final Runnable u = new acdd(this, 0);
    public final Handler v = new Handler(Looper.getMainLooper());
    public Animator w;
    public Animator x;
    public acdk y;
    public accz z;

    public acdn(Context context, ajut ajutVar, acra acraVar) {
        this.f = context;
        this.o = acraVar;
        this.al = ajutVar;
        LayoutInflater from = LayoutInflater.from(context);
        this.O = (WindowManager) context.getSystemService("window");
        ViewGroup viewGroup = (ViewGroup) from.inflate(R.layout.status_bar_window, (ViewGroup) null);
        this.b = viewGroup;
        viewGroup.setOnTouchListener(new acdl(this));
        viewGroup.setOnClickListener(new acdc(this, 1));
        this.p = (ViewGroup) viewGroup.findViewById(R.id.status_container);
        this.q = (YouTubeTextView) viewGroup.findViewById(R.id.status_bar_state_text);
        this.P = (ViewGroup) viewGroup.findViewById(R.id.header_and_controls_container);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.stream_header);
        this.Q = viewGroup2;
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.close_stream_button);
        this.e = imageButton;
        viewGroup2.setOnClickListener(new acdc(this, 0));
        arfr arfrVar = arfr.CLOSE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {-16842910};
        int[] iArr2 = new int[0];
        int a = ajutVar.a(arfrVar);
        if (a != 0) {
            Drawable a2 = aii.a(context, a);
            a2.setAlpha(context.getResources().getInteger(R.integer.lc_close_icon_inactive_alpha));
            stateListDrawable.addState(iArr, a2);
            Drawable a3 = aii.a(context, a);
            a3.setAlpha(context.getResources().getInteger(R.integer.lc_close_icon_active_alpha));
            stateListDrawable.addState(iArr2, a3);
        }
        imageButton.setImageDrawable(stateListDrawable);
        this.c = viewGroup.findViewById(R.id.offline_view);
        this.d = (StreamStatusView) viewGroup.findViewById(R.id.stream_status);
        this.ai = (ViewGroup) viewGroup.findViewById(R.id.controls_and_settings);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.controls_container);
        this.g = viewGroup3;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.settings_container);
        this.ah = viewGroup4;
        Resources resources = context.getResources();
        this.R = aii.a(context, R.drawable.quantum_ic_mic_white_24);
        this.S = resources.getString(R.string.screencast_mic_off_button_description);
        this.T = aii.a(context, R.drawable.quantum_ic_mic_off_white_24);
        this.U = resources.getString(R.string.screencast_mic_on_button_description);
        this.h = (ImageView) viewGroup.findViewById(R.id.mic_button);
        this.V = aii.a(context, R.drawable.quantum_ic_videocam_white_24);
        this.W = resources.getString(R.string.screencast_cam_off_button_description);
        this.X = aii.a(context, R.drawable.quantum_ic_videocam_off_white_24);
        this.Y = resources.getString(R.string.screencast_cam_on_button_description);
        this.i = resources.getString(R.string.screencast_cam_disabled_button_description);
        this.j = (ImageView) viewGroup.findViewById(R.id.cam_button);
        this.Z = aii.a(context, R.drawable.quantum_ic_chat_white_24);
        this.aa = resources.getString(R.string.screencast_chat_off_button_description);
        this.ab = aii.a(context, R.drawable.ic_chat_off_white_24dp);
        this.ac = resources.getString(R.string.screencast_chat_on_button_description);
        this.k = (ImageView) viewGroup.findViewById(R.id.chat_button);
        this.m = (ViewGroup) viewGroup.findViewById(R.id.go_live_button);
        this.ad = aii.a(context, R.drawable.quantum_ic_pause_white_24);
        this.ae = resources.getString(R.string.screencast_pause_button_description);
        this.af = aii.a(context, R.drawable.quantum_ic_play_arrow_white_24);
        this.ag = resources.getString(R.string.screencast_resume_button_description);
        this.l = (ImageView) viewGroup.findViewById(R.id.pause_resume_button);
        this.n = (ImageView) viewGroup.findViewById(R.id.settings_button);
        this.r = (ImageView) viewGroup.findViewById(R.id.back_button);
        this.s = (SeekBar) viewGroup.findViewById(R.id.self_View_size_slider);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new acdf(this));
        this.aj = ofFloat;
        this.t = u(viewGroup3, viewGroup4);
        this.ak = u(viewGroup4, viewGroup3);
        WindowManager.LayoutParams ct = adyu.ct();
        this.a = ct;
        ct.width = -1;
    }

    private final Animator u(View view, View view2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new acdj(this, view, view2));
        return animatorSet;
    }

    private final Animator v(int i) {
        this.b.setTranslationY(i);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "translationY", 0.0f);
        ofFloat.setDuration(300L).addListener(new acdg(this));
        return ofFloat;
    }

    private final boolean w() {
        return (this.a.gravity & 48) == 48;
    }

    public final void a() {
        if (this.b.getParent() == null) {
            this.O.addView(this.b, this.a);
        } else {
            this.O.updateViewLayout(this.b, this.a);
        }
    }

    public final void b() {
        if (this.ao) {
            return;
        }
        this.ao = true;
        Animator animator = this.am;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.an;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.aj;
        if (animator3 != null) {
            animator3.cancel();
        }
        Animator animator4 = this.t;
        if (animator4 != null) {
            animator4.cancel();
        }
        Animator animator5 = this.ak;
        if (animator5 != null) {
            animator5.cancel();
        }
        Animator animator6 = this.w;
        if (animator6 != null) {
            animator6.cancel();
        }
        Animator animator7 = this.x;
        if (animator7 != null) {
            animator7.cancel();
        }
        this.ao = false;
    }

    public final void c() {
        if (t()) {
            if (s()) {
                b();
            }
            this.aj.start();
        }
    }

    public final void d() {
        this.l.setVisibility(8);
    }

    public final void e(boolean z) {
        if (z) {
            if (s()) {
                b();
                return;
            } else {
                this.ak.start();
                return;
            }
        }
        this.ah.setVisibility(8);
        this.g.setVisibility(0);
        this.b.requestLayout();
    }

    public final void f(boolean z) {
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.p, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.addListener(new acdi(this));
            this.x = ofFloat;
            ofFloat.start();
            return;
        }
        this.p.setVisibility(4);
        this.q.setText("");
        this.v.removeCallbacks(this.u);
    }

    public final void g(acrb acrbVar) {
        if (acrbVar == null) {
            return;
        }
        this.o.n(new acqx(acrbVar));
    }

    public final void h() {
        if (t()) {
            if (this.I || zev.e(this.f) || SystemClock.elapsedRealtime() - this.ap < 10000) {
                this.v.postDelayed(new acdd(this, 1), 1000L);
            } else {
                c();
            }
        }
    }

    public final void i() {
        b();
        d();
        k();
        this.E = false;
        e(false);
    }

    public final void j() {
        this.ap = SystemClock.elapsedRealtime();
    }

    public final void k() {
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        this.d.a();
    }

    public final void l(boolean z) {
        this.j.setEnabled(true);
        this.j.setImageTintList(aih.f(this.f, android.R.color.white));
        this.j.setImageDrawable(z ? this.V : this.X);
        this.j.setContentDescription(z ? this.W : this.Y);
        this.G = z;
    }

    public final void m(float f) {
        accq accqVar = this.B;
        if (accqVar != null) {
            acei aceiVar = ((acdy) accqVar).b;
            amkq.E(f >= 0.0f);
            int i = aceiVar.i;
            aceiVar.h((int) Math.floor(i + ((aceiVar.h - i) * f)));
        }
    }

    public final void n(boolean z) {
        this.k.setImageDrawable(z ? this.Z : this.ab);
        this.k.setContentDescription(z ? this.aa : this.ac);
        this.H = z;
    }

    public final void o(int i) {
        if (this.a.gravity != i) {
            if (s()) {
                b();
            }
            this.a.gravity = i;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.P.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(yny.t(3));
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(yny.t(3));
            if (w()) {
                layoutParams.addRule(3, R.id.pad_view_top);
                arrayDeque2.add(yny.j(3, R.id.stream_header));
                layoutParams2.addRule(3, R.id.header_and_controls_container);
            } else {
                layoutParams2.addRule(3, R.id.pad_view_top);
                layoutParams.addRule(3, R.id.status_container);
                arrayDeque.add(yny.j(3, R.id.controls_and_settings));
            }
            yny.z(this.Q, yny.E(arrayDeque), RelativeLayout.LayoutParams.class);
            yny.z(this.ai, yny.E(arrayDeque2), RelativeLayout.LayoutParams.class);
            if (t()) {
                this.O.updateViewLayout(this.b, this.a);
                this.b.measure(0, 0);
            }
        }
    }

    public final void p(boolean z) {
        this.h.setImageDrawable(z ? this.R : this.T);
        this.h.setContentDescription(z ? this.S : this.U);
        this.F = z;
    }

    public final void q(boolean z) {
        this.l.setImageDrawable(z ? this.af : this.ad);
        this.l.setContentDescription(z ? this.ag : this.ae);
        this.I = z;
    }

    public final void r() {
        if (t()) {
            return;
        }
        this.b.setVisibility(0);
        a();
        this.b.measure(0, 0);
        if (s()) {
            b();
            return;
        }
        if (!w()) {
            Animator v = v(this.P.getHeight());
            this.an = v;
            v.start();
        } else {
            Animator v2 = v(-this.P.getHeight());
            this.am = v2;
            v2.start();
        }
        if (this.E) {
            j();
            this.v.postDelayed(new acdd(this, 4), 10000L);
            if (this.Q.isShown()) {
                return;
            }
            this.Q.setVisibility(0);
        }
    }

    public final boolean s() {
        return this.f27J || this.K || this.L || this.M;
    }

    public final boolean t() {
        return this.b.getParent() != null && this.b.getVisibility() == 0;
    }
}

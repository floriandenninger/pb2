package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.q;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import defpackage.ahbl;
import defpackage.ahbx;
import defpackage.ahvb;
import defpackage.ahvc;
import defpackage.ahvo;
import defpackage.ahxd;
import defpackage.ahxe;
import defpackage.ahxr;
import defpackage.ahxs;
import defpackage.ahxt;
import defpackage.ahyt;
import defpackage.ahyu;
import defpackage.aii;
import defpackage.aive;
import defpackage.aivf;
import defpackage.atyq;
import defpackage.whu;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends aive implements View.OnClickListener, Animation.AnimationListener, Handler.Callback, ahvc, aivf, ahxt, ahyu, ahxe, h {
    public final ar a;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b;
    public final MinimalTimeBar c;
    public final ProgressBar d;
    public final ImageButton e;
    public final ImageButton f;
    public final ImageButton g;
    public final ImageView h;
    public final TextView i;
    public Handler j;
    public final Animation k;
    public boolean l;
    private final ahxr m;
    private ControlsOverlayStyle n;
    private ControlsState o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public b(Context context, k kVar) {
        super(context);
        this.a = new ar(new q(kVar));
        a aVar = new a(this);
        a aVar2 = new a(this);
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar3 = new com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a(context);
        Context context2 = aVar3.getContext();
        float f = aVar3.getResources().getDisplayMetrics().density;
        aVar3.a = (int) ((50.0f * f) + 0.5f);
        aVar3.b = (int) ((45.0f * f) + 0.5f);
        aVar3.c = (int) ((f * 7.0f) + 0.5f);
        aVar3.d = c.a(context2, aVar);
        aVar3.addView(aVar3.d);
        aVar3.e = new View(context2);
        aVar3.e.setBackgroundResource(R.drawable.api_player_bar);
        aVar3.addView(aVar3.e);
        f fVar = new f(context2, aVar2);
        Context context3 = fVar.getContext();
        DisplayMetrics displayMetrics = fVar.getResources().getDisplayMetrics();
        float f2 = displayMetrics.density;
        fVar.c = (int) ((230.0f * f2) + 0.5f);
        fVar.e = (int) ((5.0f * f2) + 0.5f);
        fVar.f = (int) ((12.0f * f2) + 0.5f);
        fVar.d = (int) ((f2 * 8.0f) + 0.5f);
        fVar.a = new e(context3);
        fVar.b = new StateListDrawable();
        fVar.b.addState(View.PRESSED_ENABLED_STATE_SET, aii.a(context3, R.drawable.api_scrubber_selected));
        fVar.b.addState(View.ENABLED_STATE_SET, aii.a(context3, R.drawable.api_scrubber));
        fVar.b.setState(View.ENABLED_STATE_SET);
        fVar.g = new Rect();
        fVar.k = new Paint();
        fVar.k.setTextSize(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        fVar.k.setColor(-1);
        fVar.k.setAntiAlias(true);
        fVar.k.getTextBounds("00:00", 0, 5, fVar.g);
        fVar.h = new Rect();
        fVar.i = new Rect();
        fVar.j = new Rect();
        fVar.l = new Paint();
        fVar.l.setColor(Color.parseColor("#B2FFFF00"));
        fVar.a(ControlsOverlayStyle.a);
        fVar.b(0L, 0L, 0L);
        aVar3.f = fVar;
        aVar3.addView(aVar3.f);
        aVar3.j = new TextView(context2);
        aVar3.j.setBackgroundResource(R.drawable.api_ic_live);
        aVar3.j.setText("LIVE");
        aVar3.j.setTextSize(16.0f);
        aVar3.j.setTextColor(-1);
        aVar3.j.setGravity(16);
        aVar3.addView(aVar3.j);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, aii.a(context2, R.drawable.api_ic_options_selected));
        stateListDrawable.addState(View.ENABLED_STATE_SET, aii.a(context2, R.drawable.api_ic_options));
        aVar3.g = new ImageButton(context2);
        aVar3.g.setBackground(null);
        aVar3.g.setImageDrawable(stateListDrawable);
        ImageButton imageButton = aVar3.g;
        int i = aVar3.c;
        imageButton.setPadding(i, i, i, i);
        aVar3.g.setOnClickListener(aVar3);
        aVar3.g.setContentDescription(context2.getText(R.string.accessibility_show_options_menu));
        aVar3.addView(aVar3.g);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(View.PRESSED_ENABLED_SELECTED_STATE_SET, aii.a(context2, R.drawable.api_ic_small_screen_selected));
        stateListDrawable2.addState(View.ENABLED_SELECTED_STATE_SET, aii.a(context2, R.drawable.api_ic_small_screen));
        stateListDrawable2.addState(View.PRESSED_ENABLED_STATE_SET, aii.a(context2, R.drawable.api_ic_full_screen_selected));
        stateListDrawable2.addState(View.ENABLED_STATE_SET, aii.a(context2, R.drawable.api_ic_full_screen));
        aVar3.h = new ImageButton(context2);
        aVar3.h.setBackground(null);
        aVar3.h.setImageDrawable(stateListDrawable2);
        ImageButton imageButton2 = aVar3.g;
        int i2 = aVar3.c;
        imageButton2.setPadding(i2, i2, i2, i2);
        aVar3.h.setOnClickListener(aVar3);
        aVar3.h.setContentDescription(context2.getText(R.string.accessibility_enter_fullscreen));
        aVar3.addView(aVar3.h);
        this.b = aVar3;
        this.c = new MinimalTimeBar(context);
        this.o = ControlsState.b();
        ProgressBar progressBar = new ProgressBar(context);
        this.d = progressBar;
        progressBar.setIndeterminate(true);
        ImageButton imageButton3 = new ImageButton(context);
        this.e = imageButton3;
        imageButton3.setBackgroundResource(R.drawable.api_btn_play);
        imageButton3.setContentDescription(context.getText(R.string.accessibility_play));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setBackgroundResource(R.drawable.api_btn_unavailable);
        TextView textView = new TextView(context);
        this.i = textView;
        textView.setGravity(17);
        textView.setBackgroundResource(R.drawable.api_player_bar);
        textView.setTextColor(-1);
        textView.setMinimumHeight(aVar3.a);
        ImageButton imageButton4 = new ImageButton(context);
        this.f = imageButton4;
        imageButton4.setBackgroundResource(R.drawable.api_btn_next);
        imageButton4.setContentDescription(context.getText(R.string.accessibility_next));
        ImageButton imageButton5 = new ImageButton(context);
        this.g = imageButton5;
        imageButton5.setBackgroundResource(R.drawable.api_btn_prev);
        imageButton5.setContentDescription(context.getText(R.string.accessibility_previous));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.k = alphaAnimation;
        alphaAnimation.setInterpolator(new LinearInterpolator());
        this.m = new ahxr(context);
    }

    private static void F(View view, int i, int i2) {
        int measuredWidth = i - (view.getMeasuredWidth() / 2);
        int measuredHeight = i2 - (view.getMeasuredHeight() / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    private final void G(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.k);
        }
    }

    private final void H(boolean z) {
        this.v = true;
        this.k.setDuration(true != z ? 500L : 100L);
        if (!this.r) {
            G(this.b);
        }
        G(this.e);
        G(this.f);
        G(this.g);
    }

    private static final void I(View view, boolean z) {
        view.setVisibility(true != z ? 8 : 0);
    }

    public final void A() {
        this.v = false;
        this.j.removeMessages(1);
        this.k.setAnimationListener(null);
        if (!this.r) {
            this.b.clearAnimation();
        }
        this.f.clearAnimation();
        this.g.clearAnimation();
        this.e.clearAnimation();
        this.k.setAnimationListener(this);
    }

    public final void B() {
        if ((this.o.a != ahvo.PLAYING && !this.o.b) || this.u || this.j.hasMessages(1)) {
            return;
        }
        this.j.sendEmptyMessageDelayed(1, 2500L);
    }

    public final void C(boolean z) {
        this.t = z;
        if (z) {
            nf();
            E();
        } else if (this.o.a == ahvo.PAUSED || this.o.a == ahvo.ENDED) {
            pA();
        } else {
            E();
        }
    }

    public final void D(boolean z) {
        this.r = z;
        E();
    }

    public final void E() {
        boolean z;
        if (this.o.a == ahvo.PAUSED) {
            this.e.setBackgroundResource(R.drawable.api_btn_play);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_play));
        } else if (this.o.a == ahvo.PLAYING) {
            this.e.setBackgroundResource(R.drawable.api_btn_pause);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_pause));
        } else {
            this.e.setBackgroundResource(R.drawable.api_btn_replay);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_replay));
        }
        boolean z2 = this.l && this.b.getTop() < this.e.getBottom();
        if (this.u || this.o.i() || this.o.a == ahvo.NEW) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                I(childAt, (childAt == this.d && this.o.b) || ((childAt == this.h || childAt == this.i) && this.o.i()) || (childAt == this.c && this.r));
            }
            if (!this.r || this.t) {
                ControlsState controlsState = this.o;
                if (!controlsState.b && !controlsState.i()) {
                    z = false;
                    I(this, z);
                }
            }
            z = true;
            I(this, z);
        } else {
            I(this.h, this.o.i() && !z2);
            I(this.i, this.o.i() && !z2);
            I(this.d, this.o.b && !z2);
            I(this.e, (this.o.i() || this.o.b || !this.n.t || z2) ? false : true);
            I(this.b, !this.r);
            I(this.c, this.n.p && this.r);
            setVisibility(0);
        }
        boolean z3 = (this.u || this.o.b || !this.n.u || z2) ? false : true;
        I(this.f, z3 && this.p);
        I(this.g, z3 && this.q);
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        this.q = z;
        E();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
        this.b.d.b.setSelected(z);
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
        this.b.d.b.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.ahvc
    public final void h(ahvb ahvbVar) {
        ar arVar = this.a;
        arVar.a = ahvbVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar = this.b;
        aVar.i = arVar;
        c cVar = aVar.d;
        arVar.getClass();
        cVar.h = arVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        H(false);
        return true;
    }

    @Override // defpackage.ahvc
    public final void i(boolean z) {
        this.b.f.setEnabled(z);
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahvc
    public final void k(ControlsOverlayStyle controlsOverlayStyle) {
        this.n = controlsOverlayStyle;
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar = this.b;
        if (controlsOverlayStyle == ControlsOverlayStyle.k) {
            aVar.f.setVisibility(8);
            aVar.j.setVisibility(0);
        } else {
            aVar.f.a(controlsOverlayStyle);
            aVar.f.setVisibility(0);
            aVar.j.setVisibility(8);
        }
        this.c.a(controlsOverlayStyle);
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        this.a.b = ahxsVar;
    }

    @Override // defpackage.ahyu
    public final void m(boolean z) {
        this.b.d.a.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.ahvc
    public final void nI(ControlsState controlsState) {
        if (!this.o.equals(controlsState)) {
            this.o = controlsState;
            pA();
        } else {
            B();
        }
    }

    @Override // defpackage.ahvc
    public final void nJ(CharSequence charSequence) {
    }

    @Override // defpackage.ahvc
    public final void nK(boolean z) {
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        this.p = z;
        E();
    }

    @Override // defpackage.ahvc
    public final void nf() {
        A();
        if (this.u) {
            return;
        }
        this.u = true;
        this.b.d.setVisibility(4);
        E();
        setFocusable(true);
        requestFocus();
        ar arVar = this.a;
        if (arVar != null) {
            arVar.d();
        }
    }

    @Override // defpackage.ahvc
    public final void ng() {
        this.m.a();
        k(ControlsOverlayStyle.a);
    }

    @Override // defpackage.ahvc
    public final void nh(String str, boolean z) {
        this.o = z ? ControlsState.g() : ControlsState.h();
        this.h.setImageResource(true != z ? R.drawable.api_btn_unavailable : R.drawable.api_btn_replay);
        this.i.setText(str);
        E();
        pA();
    }

    @Override // defpackage.ahvc
    public final void ns() {
        this.b.c(0L, 0L, 0L);
        this.c.b(0L, 0L, 0L);
    }

    @Override // defpackage.ahyu
    public final void o(VideoQuality[] videoQualityArr, int i, boolean z) {
        c cVar = this.b.d;
        cVar.f = videoQualityArr;
        cVar.g = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.v = false;
        nf();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a != null) {
            if (view == this.f) {
                nf();
                this.a.a();
                return;
            }
            if (view == this.g) {
                nf();
                this.a.b();
                return;
            }
            if (view == this.e) {
                if (this.o.a == ahvo.ENDED) {
                    this.a.n();
                } else if (this.o.a == ahvo.PLAYING) {
                    this.a.e();
                } else if (this.o.a == ahvo.PAUSED) {
                    this.a.f();
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        this.a.g(1 == (motionEvent.getFlags() & 1));
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahvc
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!keyEvent.isSystem() || ahbl.b(i)) {
            pA();
            if (this.o.a == ahvo.RECOVERABLE_ERROR) {
                this.a.o();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingBottom = i5 - getPaddingBottom();
        int i6 = (i3 - i) / 2;
        int i7 = i5 / 2;
        View view = this.r ? this.c : this.b;
        view.layout(paddingLeft, paddingBottom - view.getMeasuredHeight(), view.getMeasuredWidth() + paddingLeft, paddingBottom);
        F(this.e, i6, i7);
        F(this.h, i6, i7);
        F(this.d, i6, i7);
        F(this.g, this.e.getLeft() - (this.g.getMeasuredWidth() / 2), i7);
        F(this.f, this.e.getRight() + (this.f.getMeasuredWidth() / 2), i7);
        TextView textView = this.i;
        textView.layout(paddingLeft, paddingBottom - textView.getMeasuredHeight(), this.i.getMeasuredWidth() + paddingLeft, paddingBottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        setMeasuredDimension(defaultSize, getDefaultSize(0, i2));
        int i3 = (defaultSize * 10) / 100;
        TextView textView = this.i;
        textView.setPadding(i3, textView.getPaddingTop(), i3, this.i.getPaddingBottom());
        measureChild(this.d, i, i2);
        measureChild(this.e, i, i2);
        measureChild(this.h, i, i2);
        measureChild(this.i, i, i2);
        measureChild(this.f, i, i2);
        measureChild(this.g, i, i2);
        measureChild(this.r ? this.c : this.b, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r7 <= r4.getBottom()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r6.v != false) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L13
            r7 = 3
            if (r0 == r7) goto Lf
            goto L85
        Lf:
            r6.s = r1
            goto L85
        L13:
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r7 = r6.o
            ahvo r7 = r7.a
            ahvo r0 = defpackage.ahvo.RECOVERABLE_ERROR
            if (r7 != r0) goto L21
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ar r7 = r6.a
            r7.o()
            goto L2c
        L21:
            boolean r7 = r6.u
            if (r7 != 0) goto L2c
            boolean r7 = r6.s
            if (r7 != 0) goto L2c
            r6.H(r2)
        L2c:
            r6.s = r1
            goto L85
        L2f:
            boolean r0 = r6.u
            if (r0 != 0) goto L7f
            float r0 = r7.getX()
            float r7 = r7.getY()
            boolean r3 = r6.r
            if (r3 == 0) goto L42
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar r4 = r6.c
            goto L44
        L42:
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r4 = r6.b
        L44:
            if (r3 != 0) goto L56
            boolean r3 = r6.l
            if (r3 != 0) goto L56
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r3 = r6.b
            int r3 = r3.getBottom()
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r5 = r6.b
            int r5 = r5.a
            int r3 = r3 - r5
            goto L5a
        L56:
            int r3 = r4.getTop()
        L5a:
            int r5 = r4.getLeft()
            float r5 = (float) r5
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L7b
            int r5 = r4.getRight()
            float r5 = (float) r5
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L7b
            float r0 = (float) r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L7b
            int r0 = r4.getBottom()
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L7b
            goto L7f
        L7b:
            boolean r7 = r6.v
            if (r7 == 0) goto L80
        L7f:
            r1 = 1
        L80:
            r6.s = r1
            r6.pA()
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.ahvc
    public final void pA() {
        ar arVar;
        if (this.t) {
            return;
        }
        boolean z = this.u;
        A();
        this.u = false;
        E();
        setFocusable(false);
        if (z && (arVar = this.a) != null) {
            arVar.v();
        }
        B();
    }

    @Override // defpackage.ahvc
    public final void pB() {
        whu.L(getContext(), getContext().getText(R.string.no_subtitles), 0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pt(boolean z) {
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.a.d = ahxdVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pv(g gVar) {
        this.a.f = gVar;
    }

    @Override // defpackage.ahvc
    public final void px(Map map) {
        this.b.f.m = map;
    }

    @Override // defpackage.ahvc
    public final void py(long j, long j2, long j3, long j4) {
        this.b.c(j, j3, j4);
        this.c.b(j, j3, j4);
    }

    @Override // defpackage.ahyu
    public final void pz(ahyt ahytVar) {
        this.a.c = ahytVar;
    }

    @Override // defpackage.ahxt
    public final void q(List list) {
        this.m.b(list, this.a);
    }

    @Override // defpackage.ahvc
    public final void r(boolean z) {
        this.b.b(z);
    }

    @Override // defpackage.ahvc
    public final void s(boolean z) {
        this.b.h.setVisibility(true != z ? 0 : 8);
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

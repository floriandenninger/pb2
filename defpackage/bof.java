package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bof extends mi {
    public static final /* synthetic */ int X = 0;
    static final int b = (int) TimeUnit.SECONDS.toMillis(30);
    public final int A;
    Map B;
    hd C;
    final boa D;
    PlaybackStateCompat E;
    MediaDescriptionCompat F;
    bnz G;
    Bitmap H;
    Uri I;

    /* renamed from: J, reason: collision with root package name */
    boolean f153J;
    Bitmap K;
    int L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    int R;
    public int S;
    public int T;
    public Interpolator U;
    final AccessibilityManager V;
    final Runnable W;
    private final bob Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private Button ac;
    private Button ad;
    private ImageButton ae;
    private ImageButton af;
    private MediaRouteExpandCollapseButton ag;
    private FrameLayout ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private final boolean al;
    private View am;
    private final Interpolator an;
    private final Interpolator ao;
    final bpw c;
    final bpv d;
    final Context e;
    public View f;
    public FrameLayout g;
    public LinearLayout h;
    FrameLayout i;
    public ImageView j;
    final boolean k;
    public LinearLayout l;
    public RelativeLayout m;
    LinearLayout n;
    OverlayListView o;
    boe p;
    public List q;
    Set r;
    public Set s;
    Set t;
    SeekBar u;
    bod v;
    bpv w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bof(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            android.content.Context r3 = defpackage.ji.y(r3, r4, r0)
            int r4 = defpackage.ji.t(r3)
            r2.<init>(r3, r4)
            r2.al = r0
            bnt r4 = new bnt
            r4.<init>(r2)
            r2.W = r4
            android.content.Context r4 = r2.getContext()
            r2.e = r4
            boa r0 = new boa
            r0.<init>(r2)
            r2.D = r0
            bpw r0 = defpackage.bpw.b(r4)
            r2.c = r0
            boolean r0 = defpackage.bpw.d()
            r2.k = r0
            bob r0 = new bob
            r0.<init>(r2)
            r2.Y = r0
            bpv r0 = defpackage.bpw.j()
            r2.d = r0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = defpackage.bpw.h()
            r2.B(r0)
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131167670(0x7f0709b6, float:1.794962E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r2.A = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            r2.V = r4
            r4 = 2131558408(0x7f0d0008, float:1.874213E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r3, r4)
            r2.an = r4
            r4 = 2131558407(0x7f0d0007, float:1.8742129E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r4)
            r2.ao = r3
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof.<init>(android.content.Context, int):void");
    }

    private final void B(MediaSessionCompat$Token mediaSessionCompat$Token) {
        hd hdVar = this.C;
        if (hdVar != null) {
            hdVar.e(this.D);
            this.C = null;
        }
        if (mediaSessionCompat$Token != null && this.aa) {
            hd hdVar2 = new hd(this.e, mediaSessionCompat$Token);
            this.C = hdVar2;
            boa boaVar = this.D;
            if (boaVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (hdVar2.c.putIfAbsent(boaVar, true) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
            } else {
                Handler handler = new Handler();
                boaVar.e(handler);
                gz gzVar = hdVar2.a;
                hb hbVar = (hb) gzVar;
                hbVar.a.registerCallback(boaVar.a, handler);
                synchronized (hbVar.b) {
                    if (((hb) gzVar).e.a() != null) {
                        ha haVar = new ha(boaVar);
                        ((hb) gzVar).d.put(boaVar, haVar);
                        boaVar.c = haVar;
                        try {
                            ((hb) gzVar).e.a().b(haVar);
                            boaVar.d(13, null, null);
                        } catch (RemoteException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    } else {
                        boaVar.c = null;
                        ((hb) gzVar).c.add(boaVar);
                    }
                }
            }
            MediaMetadataCompat a = this.C.a();
            this.F = a != null ? a.b() : null;
            this.E = this.C.c();
            p();
            o(false);
        }
    }

    public static int g(View view) {
        return view.getLayoutParams().height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    public View A() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(int i, int i2) {
        return i >= i2 ? (int) (((this.ab * i2) / i) + 0.5f) : (int) (((this.ab * 9.0f) / 16.0f) + 0.5f);
    }

    public final int h(boolean z) {
        if (!z && this.n.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.l.getPaddingTop() + this.l.getPaddingBottom();
        if (z) {
            paddingTop += this.m.getMeasuredHeight();
        }
        if (this.n.getVisibility() == 0) {
            paddingTop += this.n.getMeasuredHeight();
        }
        return (z && this.n.getVisibility() == 0) ? paddingTop + this.am.getMeasuredHeight() : paddingTop;
    }

    public final void i(View view, int i) {
        bnw bnwVar = new bnw(g(view), i, view);
        bnwVar.setDuration(this.R);
        bnwVar.setInterpolator(this.U);
        view.startAnimation(bnwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.U = this.O ? this.an : this.ao;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nb(boolean z) {
        Set set;
        int firstVisiblePosition = this.o.getFirstVisiblePosition();
        for (int i = 0; i < this.o.getChildCount(); i++) {
            View childAt = this.o.getChildAt(i);
            bpv bpvVar = (bpv) this.p.getItem(firstVisiblePosition + i);
            if (!z || (set = this.r) == null || !set.contains(bpvVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (boj bojVar : this.o.a) {
            bojVar.k = true;
            bojVar.l = true;
            bnr bnrVar = bojVar.m;
            if (bnrVar != null) {
                bnrVar.a();
            }
        }
        if (z) {
            return;
        }
        nd(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nc() {
        this.f153J = false;
        this.K = null;
        this.L = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nd(boolean z) {
        this.r = null;
        this.s = null;
        this.P = false;
        if (this.Q) {
            this.Q = false;
            r(z);
        }
        this.o.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof.o(boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = true;
        this.c.q(bph.a, this.Y, 2);
        B(bpw.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mi, defpackage.ng, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        bnu bnuVar = new bnu(this, 3);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.g = frameLayout;
        frameLayout.setOnClickListener(new bnu(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.h = linearLayout;
        linearLayout.setOnClickListener(new ipu(1));
        Context context = this.e;
        int w = ji.w(context, 0, R.attr.colorPrimary);
        if (fm.a(w, ji.w(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            w = ji.w(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.ac = button;
        button.setText(R.string.mr_controller_disconnect);
        this.ac.setTextColor(w);
        this.ac.setOnClickListener(bnuVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.ad = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.ad.setTextColor(w);
        this.ad.setOnClickListener(bnuVar);
        this.ak = (TextView) findViewById(R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_close);
        this.af = imageButton;
        imageButton.setOnClickListener(bnuVar);
        this.ah = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.i = (FrameLayout) findViewById(R.id.mr_default_control);
        bnu bnuVar2 = new bnu(this, 0);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.j = imageView;
        imageView.setOnClickListener(bnuVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(bnuVar2);
        this.l = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.am = findViewById(R.id.mr_control_divider);
        this.m = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ai = (TextView) findViewById(R.id.mr_control_title);
        this.aj = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ae = imageButton2;
        imageButton2.setOnClickListener(bnuVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.n = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.u = seekBar;
        seekBar.setTag(this.d);
        bod bodVar = new bod(this);
        this.v = bodVar;
        this.u.setOnSeekBarChangeListener(bodVar);
        this.o = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.q = new ArrayList();
        boe boeVar = new boe(this, this.o.getContext(), this.q);
        this.p = boeVar;
        this.o.setAdapter((ListAdapter) boeVar);
        this.t = new HashSet();
        Context context2 = this.e;
        LinearLayout linearLayout3 = this.l;
        OverlayListView overlayListView = this.o;
        boolean v = v();
        int w2 = ji.w(context2, 0, R.attr.colorPrimary);
        int w3 = ji.w(context2, 0, R.attr.colorPrimaryDark);
        if (v && ji.u(context2, 0) == -570425344) {
            w3 = w2;
            w2 = -1;
        }
        linearLayout3.setBackgroundColor(w2);
        overlayListView.setBackgroundColor(w3);
        linearLayout3.setTag(Integer.valueOf(w2));
        overlayListView.setTag(Integer.valueOf(w3));
        ji.z(this.e, (MediaRouteVolumeSlider) this.u, this.l);
        HashMap hashMap = new HashMap();
        this.B = hashMap;
        hashMap.put(this.d, this.u);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.ag = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f = new bnu(this, 2);
        m();
        this.R = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.S = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.T = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View A = A();
        this.f = A;
        if (A != null) {
            this.ah.addView(A);
            this.ah.setVisibility(0);
        }
        this.Z = true;
        q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.r(this.Y);
        B(null);
        this.aa = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.mi, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        int i = jh.i(this.e);
        getWindow().setLayout(i, -2);
        View decorView = getWindow().getDecorView();
        this.ab = (i - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.e.getResources();
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.H = null;
        this.I = null;
        p();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(boolean z) {
        this.i.requestLayout();
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new bnv(this, z));
    }

    public final void s(boolean z) {
        int i = 0;
        this.am.setVisibility((this.n.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.l;
        if (this.n.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final boolean t() {
        return this.f == null && !(this.F == null && this.E == null);
    }

    public final boolean v() {
        return this.d.k() && this.d.d().size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return (this.E.e & 514) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        return (this.E.e & 516) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y() {
        return (this.E.e & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean z(bpv bpvVar) {
        return this.al && bpvVar.a() == 1;
    }

    @Override // defpackage.mi, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            if (this.k || !this.O) {
                this.d.f(i == 25 ? -1 : 1);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        if (this.f == null) {
            MediaDescriptionCompat mediaDescriptionCompat = this.F;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.c;
            Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.d : null;
            bnz bnzVar = this.G;
            Bitmap bitmap2 = bnzVar == null ? this.H : bnzVar.a;
            Uri uri2 = bnzVar == null ? this.I : bnzVar.b;
            if (bitmap2 == bitmap) {
                if (bitmap2 != null) {
                    return;
                }
                if (uri2 != null && uri2.equals(uri)) {
                    return;
                }
                if (uri2 == null && uri == null) {
                    return;
                }
            }
            if (!v() || this.k) {
                bnz bnzVar2 = this.G;
                if (bnzVar2 != null) {
                    bnzVar2.cancel(true);
                }
                bnz bnzVar3 = new bnz(this);
                this.G = bnzVar3;
                bnzVar3.execute(new Void[0]);
            }
        }
    }
}

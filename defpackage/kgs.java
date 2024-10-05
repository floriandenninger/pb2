package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgs implements aabm, ahuu {
    private static final Interpolator e = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
    public final azrw a;
    public View b;
    public boolean c;
    public aabk d;
    private final Context f;
    private final Resources g;
    private final ajjz h;
    private final azrw i;
    private final Handler j;
    private final int k;
    private Animation l;
    private Animation m;
    private Runnable n;
    private Vibrator o;
    private ahut p;
    private TextView q;
    private ImageView r;
    private boolean s;

    public kgs(Context context, Handler handler, ajjz ajjzVar, azrw azrwVar, azrw azrwVar2) {
        this.f = context;
        Resources resources = context.getResources();
        resources.getClass();
        this.g = resources;
        handler.getClass();
        this.j = handler;
        ajjzVar.getClass();
        this.h = ajjzVar;
        azrwVar.getClass();
        this.a = azrwVar;
        this.i = azrwVar2;
        this.k = resources.getInteger(R.integer.info_card_accessibility_teaser_vibrate_duration_ms);
    }

    @Override // defpackage.aabm
    public final Boolean a(arhj arhjVar, long j, long j2) {
        ImageView imageView;
        if (!this.s || ((nsv) this.i.get()).A()) {
            return false;
        }
        g();
        TextView textView = this.q;
        if (textView != null) {
            aqyg aqygVar = arhjVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        if ((arhjVar.b & 128) != 0 && (imageView = this.r) != null) {
            ajjz ajjzVar = this.h;
            avgg avggVar = arhjVar.j;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
            Animation animation = this.l;
            if (animation != null) {
                this.b.startAnimation(animation);
            }
        }
        Runnable runnable = this.n;
        if (runnable != null) {
            this.j.removeCallbacks(runnable);
            this.j.postDelayed(runnable, j);
        }
        if (zev.e(this.f)) {
            if (this.o == null) {
                Object systemService = this.f.getSystemService("vibrator");
                systemService.getClass();
                this.o = (Vibrator) systemService;
            }
            this.o.vibrate(this.k);
        }
        return true;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aabm
    public final void d() {
    }

    @Override // defpackage.aabm
    public final void e() {
    }

    @Override // defpackage.aabm
    public final void f(boolean z) {
        if (!np() || this.m == null) {
            return;
        }
        Runnable runnable = this.n;
        if (runnable != null) {
            this.j.removeCallbacks(runnable);
        }
        Animation animation = this.m;
        if (animation != null) {
            if (z) {
                animation.setDuration(360L);
            } else {
                animation.setDuration(0L);
            }
            View view = this.b;
            if (view != null) {
                view.startAnimation(this.m);
            }
        }
    }

    final void g() {
        if (np()) {
            return;
        }
        View inflate = LayoutInflater.from(this.f).inflate(R.layout.watch_info_cards_teaser_overlay, new FrameLayout(this.f));
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.watch_info_card_teaser_content);
        findViewById.getClass();
        View findViewById2 = this.b.findViewById(R.id.watch_info_card_teaser_content_wrapper);
        findViewById2.getClass();
        TextView textView = (TextView) findViewById.findViewById(R.id.watch_info_card_teaser_message);
        textView.getClass();
        this.q = textView;
        View findViewById3 = this.b.findViewById(R.id.watch_info_card_close_icon);
        findViewById3.getClass();
        ImageView imageView = (ImageView) this.b.findViewById(R.id.watch_info_card_teaser_icon);
        imageView.getClass();
        this.r = imageView;
        this.b.setVisibility(8);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: kgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kgs kgsVar = kgs.this;
                if (!kgsVar.c) {
                    aabk aabkVar = kgsVar.d;
                    if (aabkVar != null) {
                        aabkVar.a();
                    }
                    kgsVar.f(true);
                }
                kgsVar.c = false;
            }
        });
        findViewById2.setOnTouchListener(new aluq(findViewById, new kgq(this)));
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f, R.anim.fade_in);
        this.l = loadAnimation;
        Interpolator interpolator = e;
        loadAnimation.setInterpolator(interpolator);
        this.l.setDuration(360L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f, R.anim.fade_out);
        this.m = loadAnimation2;
        loadAnimation2.setInterpolator(interpolator);
        this.m.setAnimationListener(new kgr(this));
        final acqx acqxVar = new acqx(acsb.c(123225));
        ((acra) this.a.get()).D(acqxVar);
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: kgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kgs kgsVar = kgs.this;
                acsa acsaVar = acqxVar;
                kgsVar.f(true);
                ((acra) kgsVar.a.get()).I(3, acsaVar, null);
            }
        });
        this.n = new Runnable() { // from class: kgp
            @Override // java.lang.Runnable
            public final void run() {
                kgs.this.f(true);
            }
        };
        ahut ahutVar = this.p;
        if (ahutVar != null) {
            ahutVar.d(this, this.b);
        }
    }

    @Override // defpackage.aabm
    public final void h() {
        Runnable runnable = this.n;
        if (runnable != null) {
            this.j.removeCallbacks(runnable);
        }
        this.s = false;
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.aabm
    public final void i(boolean z) {
        this.s = true;
    }

    @Override // defpackage.aabm
    public final void k() {
    }

    @Override // defpackage.aivf
    public final View ld() {
        g();
        View view = this.b;
        return view != null ? view : new View(this.f);
    }

    @Override // defpackage.aabm
    public final void m(aabk aabkVar) {
        this.d = aabkVar;
    }

    @Override // defpackage.ahuu
    public final void mZ(ahut ahutVar) {
        this.p = ahutVar;
    }

    @Override // defpackage.ahuu
    public final boolean np() {
        return this.b != null;
    }
}

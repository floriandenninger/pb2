package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aaaq extends aivc implements Animation.AnimationListener, aabi {
    private boolean a;
    public final View b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public final View e;
    public aabq f;
    public aabk g;
    private final aabh h;
    private final aabm i;
    private final Animation j;
    private final Animation k;
    private Animation l;
    private Animation m;
    private Animation n;
    private Animation o;
    private Animation p;
    private Animation q;
    private Runnable r;
    private int s;
    private final lo t;

    public aaaq(Context context, aabm aabmVar) {
        super(context);
        this.s = -1;
        Resources resources = context.getResources();
        this.i = aabmVar;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.j = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.k = loadAnimation2;
        long integer = resources.getInteger(R.integer.fade_duration_fast);
        loadAnimation.setDuration(integer);
        loadAnimation2.setDuration(integer);
        loadAnimation2.setAnimationListener(this);
        LayoutInflater.from(context).inflate(R.layout.info_card_drawer_overlay, this);
        this.b = findViewById(R.id.info_cards_drawer);
        findViewById(R.id.info_cards_drawer_close).setOnClickListener(new View.OnClickListener() { // from class: aaan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aabk aabkVar = aaaq.this.g;
                if (aabkVar != null) {
                    aabl aablVar = aabkVar.a;
                    aablVar.i = false;
                    aablVar.c.r();
                    aabkVar.a.c.d();
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.info_cards);
        this.c = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.d = linearLayoutManager;
        recyclerView.aB(new aaao(context));
        recyclerView.af(linearLayoutManager);
        aabh aabhVar = new aabh(context, true);
        this.h = aabhVar;
        recyclerView.ac(aabhVar);
        aaap aaapVar = new aaap(this);
        this.t = aaapVar;
        this.e = findViewById(R.id.info_cards_drawer_separator);
        recyclerView.aD(aaapVar);
        g();
    }

    private final void n(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt);
            }
        }
    }

    private final void o() {
        int e = jw.e(this);
        if (e == this.s) {
            return;
        }
        this.s = e;
        if (e == 0) {
            if (this.n == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_in);
                this.n = loadAnimation;
                loadAnimation.setAnimationListener(this);
            }
            if (this.o == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_right_translate_out);
                this.o = loadAnimation2;
                loadAnimation2.setAnimationListener(this);
            }
            this.p = this.n;
            this.q = this.o;
            return;
        }
        if (this.l == null) {
            Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_in);
            this.l = loadAnimation3;
            loadAnimation3.setAnimationListener(this);
        }
        if (this.m == null) {
            Animation loadAnimation4 = AnimationUtils.loadAnimation(getContext(), R.anim.infocards_left_translate_out);
            this.m = loadAnimation4;
            loadAnimation4.setAnimationListener(this);
        }
        this.p = this.l;
        this.q = this.m;
    }

    private final boolean p() {
        boolean z = this.b.getVisibility() == 0 && !this.a;
        setVisibility(true != z ? 8 : 0);
        return z;
    }

    @Override // defpackage.aabi
    public final Boolean a(arhj arhjVar, long j, long j2) {
        aabm aabmVar = this.i;
        if (aabmVar != null) {
            return aabmVar.a(arhjVar, j, j2);
        }
        return false;
    }

    @Override // defpackage.aivf
    public ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aabi
    public final void d(boolean z) {
        aabm aabmVar = this.i;
        if (aabmVar != null) {
            aabmVar.f(z);
        }
    }

    @Override // defpackage.aabi
    public final void e(boolean z) {
        o();
        if (this.b.getVisibility() == 0) {
            if (!z || !isShown()) {
                this.b.setVisibility(8);
            } else {
                this.b.startAnimation(this.q);
            }
        }
    }

    @Override // defpackage.aabi
    public final void f(boolean z) {
        aabm aabmVar = this.i;
        if (aabmVar != null) {
            if (z) {
                aabmVar.e();
            } else {
                aabmVar.d();
            }
        }
    }

    @Override // defpackage.aabi
    public final void g() {
        this.b.setVisibility(8);
        aabm aabmVar = this.i;
        if (aabmVar != null) {
            aabmVar.k();
            this.i.h();
        }
    }

    @Override // defpackage.aabi
    public final void h(int i) {
        if (this.b.isShown()) {
            if (zev.e(getContext())) {
                return;
            }
            aabg.b(this.d.S(i));
            this.c.ak(i);
            return;
        }
        this.c.aa(i);
    }

    @Override // defpackage.aabi
    public final void i(InfoCardCollection infoCardCollection, aabn aabnVar, aabq aabqVar) {
        this.f = aabqVar;
        this.h.w(infoCardCollection.b(), aabnVar, aabqVar);
        this.i.i(true);
        CharSequence a = infoCardCollection.a();
        if (a != null) {
            ((TextView) findViewById(R.id.info_cards_drawer_header)).setText(a);
            this.b.setContentDescription(a);
        }
    }

    @Override // defpackage.aabi
    public final void j(Runnable runnable) {
        this.r = runnable;
    }

    @Override // defpackage.aabi
    public final void k(boolean z) {
        if (z != this.a) {
            return;
        }
        boolean z2 = !z;
        this.a = z2;
        if (!z2 || getVisibility() != 0) {
            if (this.a || !p()) {
                return;
            }
            startAnimation(this.j);
            return;
        }
        startAnimation(this.k);
    }

    @Override // defpackage.aabi
    public final void l() {
        o();
        this.b.setVisibility(0);
        this.b.startAnimation(this.p);
        p();
    }

    @Override // defpackage.aabi
    public final void m(aabk aabkVar) {
        this.g = aabkVar;
        aabm aabmVar = this.i;
        if (aabmVar != null) {
            aabmVar.m(aabkVar);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.k) {
            setVisibility(8);
            n(this);
        }
        if (animation == this.p) {
            zev.d(this.b);
            View findFocus = this.c.findFocus();
            if (findFocus == null) {
                findFocus = this.c.getChildAt(0);
            }
            if (findFocus != null) {
                zev.d(findFocus);
            }
        }
        if (animation == this.q) {
            this.b.setVisibility(8);
            Runnable runnable = this.r;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

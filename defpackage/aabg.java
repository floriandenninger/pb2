package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabg implements aabr {
    public final Context b;
    public final Animation c;
    public final Animation d;
    public View e;
    public aabq f;
    public boolean g;
    public RecyclerView h;
    public LinearLayoutManager i;
    private final aabn k;
    private final Animation l;
    private final ViewStub m;
    private aabh n;
    private TextView o;
    private final oij p;
    private final lo q;
    private static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public aabg(Context context, oij oijVar, ViewStub viewStub, aabn aabnVar) {
        this.b = context;
        this.m = viewStub;
        this.p = oijVar;
        this.k = aabnVar;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, com.google.android.youtube.R.anim.top_translate_in);
        this.c = loadAnimation;
        loadAnimation.setAnimationListener(new aaba(this, 1));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, com.google.android.youtube.R.anim.top_translate_out);
        this.l = loadAnimation2;
        loadAnimation2.setAnimationListener(new aaba(this, 0));
        this.d = AnimationUtils.loadAnimation(context, com.google.android.youtube.R.anim.top_translate_out);
        this.q = new aabb(this);
    }

    public static void b(View view) {
        Drawable foreground;
        if (!(view instanceof CardView) || (foreground = ((CardView) view).getForeground()) == null) {
            return;
        }
        foreground.setState(j);
        view.postDelayed(new aabf(foreground), 250L);
    }

    @Override // defpackage.aabr
    public final void a(boolean z) {
        if (!this.g) {
            if (!this.l.hasStarted() || this.l.hasEnded()) {
                return;
            }
            this.l.cancel();
            return;
        }
        this.g = false;
        if (!z || !((View) this.e.getParent()).isShown()) {
            this.e.setVisibility(8);
        } else {
            this.e.startAnimation(this.l);
        }
        this.p.a.getWindow().getDecorView().sendAccessibilityEvent(32);
    }

    @Override // defpackage.aabr
    public final void c(InfoCardCollection infoCardCollection, int i, boolean z) {
        if (!this.g) {
            this.g = true;
            if (this.e == null) {
                View inflate = this.m.inflate();
                this.e = inflate;
                inflate.findViewById(com.google.android.youtube.R.id.close).setOnClickListener(new aabd(this));
                this.h = (RecyclerView) this.e.findViewById(com.google.android.youtube.R.id.info_cards);
                this.i = new LinearLayoutManager();
                this.h.aB(new aabe(this));
                this.h.af(this.i);
                aabh aabhVar = new aabh(this.b, false);
                this.n = aabhVar;
                this.h.ac(aabhVar);
                this.h.aD(this.q);
            }
            this.n.w(infoCardCollection.b(), this.k, this.f);
            CharSequence a2 = infoCardCollection.a();
            if (a2 != null) {
                TextView textView = (TextView) this.e.findViewById(com.google.android.youtube.R.id.info_card_drawer_title);
                this.o = textView;
                textView.setText(a2);
                this.e.setContentDescription(a2);
            }
            TextView textView2 = (TextView) this.e.findViewById(com.google.android.youtube.R.id.ad_badge);
            argt argtVar = infoCardCollection.a.g;
            if (argtVar == null) {
                argtVar = argt.a;
            }
            if ((argtVar.b & 1) == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            if (!z || !((View) this.e.getParent()).isShown()) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(4);
                this.e.post(new Runnable() { // from class: aaaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aabg aabgVar = aabg.this;
                        aabgVar.e.setVisibility(0);
                        aabgVar.e.startAnimation(aabgVar.c);
                    }
                });
            }
            this.h.aa(i);
            zev.d((View) this.h.getParent());
            View childAt = this.h.getChildAt(Math.max(0, i) - this.i.J());
            if (childAt != null) {
                zev.d(childAt);
                return;
            }
            return;
        }
        this.h.ak(i);
    }
}

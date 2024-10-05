package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krq extends aivc implements xig, fnp {
    public TextView A;
    public View B;
    public TextView C;
    public fhg D;
    public int E;
    public xih F;
    public int G;
    public final ajyw H;
    public final Context a;
    public final ajjz b;
    public final int c;
    public ImageView d;
    public ImageView e;
    public TextView f;
    public View g;
    public TextView h;
    public View i;
    public TextView j;
    public TextView k;
    public TextView l;
    public View m;
    public ViewGroup n;
    public int o;
    public int p;
    public CharSequence q;
    public TimeBar r;
    public ahyg s;
    public View t;
    public fqw u;
    public aowm v;
    public mfe w;
    public View x;
    public float y;
    public View z;

    public krq(Context context, ajjz ajjzVar, int i, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context);
        this.G = 1;
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.c = i;
        this.H = ajywVar;
    }

    public static final void i(TextView textView) {
        if (textView != null) {
            textView.setVisibility(true != TextUtils.isEmpty(textView.getText()) ? 0 : 8);
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void d(aozc aozcVar) {
        avjv avjvVar;
        avjw avjwVar;
        if (this.x != null && (aozcVar.b & 2) != 0) {
            aoze aozeVar = aozcVar.d;
            if (aozeVar == null) {
                aozeVar = aoze.a;
            }
            if (aozeVar.b == 1) {
                aoze aozeVar2 = aozcVar.d;
                if (aozeVar2 == null) {
                    aozeVar2 = aoze.a;
                }
                if (aozeVar2.b == 1) {
                    avjwVar = (avjw) aozeVar2.c;
                } else {
                    avjwVar = avjw.a;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setStartOffset(avjwVar.c);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(avjwVar.b);
                TranslateAnimation translateAnimation = new TranslateAnimation((this.n.getWidth() / 2) * avjwVar.d, 0.0f, (this.n.getHeight() / 2) * avjwVar.e, 0.0f);
                translateAnimation.setStartOffset(avjwVar.c);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration(avjwVar.b);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                this.x.startAnimation(animationSet);
            }
        }
        aozd aozdVar = aozcVar.c;
        if (aozdVar == null) {
            aozdVar = aozd.a;
        }
        if (aozdVar.b == 1) {
            aozd aozdVar2 = aozcVar.c;
            if (aozdVar2 == null) {
                aozdVar2 = aozd.a;
            }
            if (aozdVar2.b == 1) {
                avjvVar = (avjv) aozdVar2.c;
            } else {
                avjvVar = avjv.a;
            }
            int width = this.n.getWidth();
            int height = this.n.getHeight();
            float max = Math.max(width, height + height) / 2;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.n, Math.round(r1.getWidth() * avjvVar.c), Math.round(this.n.getHeight() * avjvVar.d), 0.01f * max, max + max);
            createCircularReveal.setDuration(avjvVar.b);
            createCircularReveal.start();
        }
    }

    @Override // defpackage.xig
    public final void e() {
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.f.setClickable(false);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.A.setVisibility(8);
            this.s.l();
            this.r.y(this.s);
            this.d.setClickable(false);
            this.z.setClickable(false);
            this.t.setBackgroundColor(this.E);
        }
        fqw fqwVar = this.u;
        if (fqwVar != null) {
            fqwVar.d();
        }
        mfe mfeVar = this.w;
        if (mfeVar != null) {
            mfeVar.a();
        }
        this.o = 0;
        this.p = 0;
        this.q = null;
        setVisibility(8);
    }

    @Override // defpackage.xig
    public final void f(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xig
    public final void h(long j, long j2) {
        if (this.n == null) {
            return;
        }
        long j3 = (int) j2;
        this.s.n((int) (j2 - j), 0L, j3, j3);
        this.r.y(this.s);
        this.k.setText(this.n.getResources().getString(R.string.ad_normal, " · ", zhq.i((int) Math.ceil(((float) j) / 1000.0f))));
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar);
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        this.D = fhgVar;
        if (fhgVar.l()) {
            if (this.n == null) {
                return;
            }
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.l.setVisibility(8);
            this.A.setVisibility(8);
            this.m.setVisibility(8);
            this.t.setClickable(false);
            if (this.v != null) {
                this.u.d();
            }
            mfe mfeVar = this.w;
            if (mfeVar != null) {
                mfeVar.a();
                return;
            }
            return;
        }
        if (this.n != null) {
            i(this.f);
            i(this.l);
            i(this.A);
            whu.I(this.m, true);
            this.t.setClickable(true);
            aowm aowmVar = this.v;
            if (aowmVar == null || this.w == null) {
                this.g.setVisibility(0);
                i(this.h);
            } else {
                this.u.a(aowmVar, null);
            }
            mfe mfeVar2 = this.w;
            if (mfeVar2 != null) {
                mfeVar2.b(this.y, this.G);
            }
        }
    }
}

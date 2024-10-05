package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsCameraFeatureDescriptionView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkt implements View.OnClickListener, hko, znf {
    public final EditorButtonView a;
    public final EditorButtonView b;
    public final EditorButtonView c;
    public final EditorButtonView d;
    public final EditorButtonView e;
    public final ci f;
    public final znh g;
    boolean h;
    public boolean i;
    boolean j;
    public boolean k;
    boolean l;
    private final ShortsCameraFeatureDescriptionView m;
    private final hkq n;
    private final Drawable o;
    private final Drawable p;
    private final Drawable q;
    private final Drawable r;
    private final Drawable s;
    private final Drawable t;
    private final jqr u;

    public hkt(EditorButtonView editorButtonView, EditorButtonView editorButtonView2, EditorButtonView editorButtonView3, EditorButtonView editorButtonView4, EditorButtonView editorButtonView5, ShortsCameraFeatureDescriptionView shortsCameraFeatureDescriptionView, znh znhVar, Context context, ci ciVar, hkq hkqVar, jqr jqrVar, byte[] bArr) {
        this.a = editorButtonView;
        this.b = editorButtonView2;
        this.c = editorButtonView3;
        this.d = editorButtonView4;
        this.e = editorButtonView5;
        this.m = shortsCameraFeatureDescriptionView;
        this.g = znhVar;
        this.u = jqrVar;
        this.n = hkqVar;
        this.f = ciVar;
        editorButtonView.setOnClickListener(this);
        editorButtonView2.setOnClickListener(this);
        editorButtonView3.setOnClickListener(this);
        editorButtonView4.setOnClickListener(this);
        editorButtonView5.setOnClickListener(this);
        hkqVar.h = this;
        hkqVar.c();
        if (hkqVar.i) {
            a(hkqVar.b);
        }
        this.o = nz.b(context, R.drawable.ic_retouch_on);
        this.p = nz.b(context, R.drawable.ic_retouch_off);
        this.s = nz.b(context, R.drawable.yt_fill_flash_on_white_24);
        this.t = nz.b(context, R.drawable.yt_outline_flash_off_white_24);
        this.q = nz.b(context, R.drawable.ic_relight_on);
        this.r = nz.b(context, R.drawable.ic_relight_off);
    }

    private final void d(int i) {
        jqr jqrVar = this.u;
        if (jqrVar == null) {
            return;
        }
        jqrVar.a(acsb.c(i)).b();
    }

    private final void e() {
        Drawable drawable;
        Drawable drawable2 = this.o;
        if (drawable2 == null || (drawable = this.p) == null) {
            return;
        }
        EditorButtonView editorButtonView = this.a;
        if (true != this.j) {
            drawable2 = drawable;
        }
        editorButtonView.b(drawable2);
    }

    @Override // defpackage.hko
    public final void a(float f) {
        this.j = f == 1.0f;
        e();
    }

    public final void b() {
        Drawable drawable;
        if (this.k) {
            this.f.runOnUiThread(new hkr(this, 1));
            return;
        }
        if (!this.i || (drawable = this.s) == null) {
            Drawable drawable2 = this.t;
            if (drawable2 != null) {
                this.e.b(drawable2);
                this.f.runOnUiThread(new hkr(this, 0));
                return;
            }
            return;
        }
        this.d.b(drawable);
        this.f.runOnUiThread(new hkr(this, 3));
    }

    public final void c() {
        Drawable drawable;
        if (!this.l) {
            this.f.runOnUiThread(new hkr(this, 5));
            return;
        }
        if (!this.h || (drawable = this.q) == null) {
            Drawable drawable2 = this.r;
            if (drawable2 != null) {
                this.c.b(drawable2);
                this.f.runOnUiThread(new hkr(this, 2));
                return;
            }
            return;
        }
        this.b.b(drawable);
        this.f.runOnUiThread(new hkr(this, 4));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.a) {
            if (view == this.b || view == this.c) {
                boolean z = this.h;
                this.h = !z;
                hkq hkqVar = this.n;
                hkqVar.c = true == z ? 0.0f : 1.0f;
                hkqVar.g();
                c();
                d(126353);
                return;
            }
            if (view == this.d || view == this.e) {
                boolean z2 = !this.i;
                this.i = z2;
                this.g.L(z2);
                b();
                d(133550);
                return;
            }
            return;
        }
        boolean z3 = this.j;
        this.j = !z3;
        ShortsCameraFeatureDescriptionView shortsCameraFeatureDescriptionView = this.m;
        String str = true != z3 ? "Retouch on" : "Retouch off";
        AnimationSet animationSet = shortsCameraFeatureDescriptionView.b;
        if (animationSet != null) {
            animationSet.cancel();
        }
        shortsCameraFeatureDescriptionView.a.setText(str);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(1000L);
        alphaAnimation2.setDuration(500L);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setAnimationListener(new hdu(shortsCameraFeatureDescriptionView));
        shortsCameraFeatureDescriptionView.startAnimation(animationSet2);
        shortsCameraFeatureDescriptionView.b = animationSet2;
        final hkq hkqVar2 = this.n;
        hkqVar2.b = true != this.j ? 0.0f : 1.0f;
        hkqVar2.h();
        vgz vgzVar = hkqVar2.j;
        if (vgzVar != null) {
            vgzVar.b(new amml() { // from class: hkn
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    hkq hkqVar3 = hkq.this;
                    aone builder = ((idr) obj).toBuilder();
                    float f = hkqVar3.b;
                    builder.copyOnWrite();
                    ((idr) builder.instance).q = f;
                    return (idr) builder.build();
                }
            }, angq.a);
        }
        e();
        d(126352);
    }
}

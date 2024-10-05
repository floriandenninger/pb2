package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swk extends dch {
    private final dlo c;
    private final szn d;
    private final syd e;
    private final syj f;
    private boolean g;
    private final ajzi h;
    private final aoam i;
    private final aoam j;
    private final aoam k;

    public swk(dlo dloVar, ImageView imageView, aoam aoamVar, ajzi ajziVar, aoam aoamVar2, aoam aoamVar3, szn sznVar, syd sydVar, syj syjVar) {
        super(imageView);
        this.g = false;
        this.c = dloVar;
        this.i = aoamVar;
        this.h = ajziVar;
        this.j = aoamVar2;
        this.k = aoamVar3;
        this.d = sznVar;
        this.e = sydVar;
        this.f = syjVar;
    }

    private final void p() {
        this.g = true;
        ajzi ajziVar = this.h;
        if (ajziVar != null) {
            View view = this.a;
            aoam aoamVar = this.i;
            dlo dloVar = this.c;
            ajju a = ajjv.a();
            a.d = ajkb.a();
            ajjv a2 = a.a();
            aone createBuilder = avgf.a.createBuilder();
            int i = dloVar.a;
            createBuilder.copyOnWrite();
            avgf avgfVar = (avgf) createBuilder.instance;
            avgfVar.b |= 2;
            avgfVar.d = i;
            int i2 = dloVar.b;
            createBuilder.copyOnWrite();
            avgf avgfVar2 = (avgf) createBuilder.instance;
            avgfVar2.b |= 4;
            avgfVar2.e = i2;
            axov ad = rwh.ad(aoamVar, dloVar.a, dloVar.b);
            if (ad != null && ad.m() != null) {
                String m = ad.m();
                createBuilder.copyOnWrite();
                avgf avgfVar3 = (avgf) createBuilder.instance;
                m.getClass();
                avgfVar3.b = 1 | avgfVar3.b;
                avgfVar3.c = m;
            }
            aong aongVar = (aong) avgg.a.createBuilder();
            aongVar.cB(createBuilder);
            ajziVar.a.f((ImageView) view, a2, (avgg) aongVar.build());
        }
    }

    private static void q(AnimatedImageDrawable animatedImageDrawable) {
        animatedImageDrawable.setRepeatCount(-1);
        animatedImageDrawable.start();
    }

    private final Drawable r(Drawable drawable, aoam aoamVar) {
        syj syjVar;
        if (drawable instanceof BitmapDrawable) {
            aoam aC = aoamVar.aC();
            int Y = aoamVar.Y();
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            ImageView.ScaleType o = sgf.o(Y);
            if (o == ImageView.ScaleType.CENTER_INSIDE) {
                o = ImageView.ScaleType.FIT_CENTER;
            }
            Drawable drawable2 = null;
            if (aC != null && (syjVar = this.f) != null) {
                drawable2 = syjVar.a(aC, bitmap, o);
            }
            drawable = drawable2 == null ? new slo(bitmap, o, this.e) : drawable2;
        } else if (drawable instanceof FrameSequenceDrawable) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
            if (aoamVar.aC() != null && aoamVar.aC().T() == 154604025) {
                frameSequenceDrawable.setCornerRadius((int) rwh.ae(axoj.aJ(aoamVar.aC().V()).aI(), ((ImageView) this.a).getContext().getResources().getDisplayMetrics()));
            }
        }
        if (!(drawable instanceof slo)) {
            ((ImageView) this.a).setScaleType(sgf.o(aoamVar.Y()));
        }
        drawable.setAutoMirrored(aoamVar.ad());
        sgf.r(drawable, aoamVar);
        return drawable;
    }

    @Override // defpackage.dch, defpackage.dcb, defpackage.dcl
    public final void a(Drawable drawable) {
        aoam aoamVar;
        if (!this.g) {
            p();
        }
        ajzi ajziVar = this.h;
        if (ajziVar != null) {
            ajziVar.a.d((ImageView) this.a, null, null);
        }
        if (drawable != null && (aoamVar = this.k) != null) {
            drawable = r(drawable, aoamVar);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                q((AnimatedImageDrawable) drawable);
            }
        }
        super.a(drawable);
    }

    @Override // defpackage.dch, defpackage.dcl
    public final /* bridge */ /* synthetic */ void b(Object obj, dcs dcsVar) {
        Drawable drawable = (Drawable) obj;
        if (!this.g) {
            p();
        }
        ajzi ajziVar = this.h;
        if (ajziVar != null) {
            ajziVar.a.g((ImageView) this.a, null, null);
        }
        aoam aoamVar = this.i;
        if (aoamVar != null) {
            drawable = r(drawable, aoamVar);
        }
        super.b(drawable, dcsVar);
        szn sznVar = this.d;
        if (sznVar == null || !(drawable instanceof FrameSequenceDrawable)) {
            return;
        }
        sznVar.b((FrameSequenceDrawable) drawable);
        this.d.c();
    }

    @Override // defpackage.dco, defpackage.dcl
    public final void e(dck dckVar) {
        dlo dloVar = this.c;
        dckVar.g(dloVar.a, dloVar.b);
    }

    @Override // defpackage.dch, defpackage.dcb, defpackage.dcl
    public final void f(Drawable drawable) {
        aoam aoamVar;
        p();
        if (drawable != null && (aoamVar = this.j) != null) {
            drawable = r(drawable, aoamVar);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                q((AnimatedImageDrawable) drawable);
            }
        }
        super.f(drawable);
    }

    @Override // defpackage.dch
    protected final /* bridge */ /* synthetic */ void i(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.dch, defpackage.dcb, defpackage.dcl
    public final void jZ(Drawable drawable) {
        aoam aoamVar;
        ajzi ajziVar = this.h;
        if (ajziVar != null) {
            ajziVar.a.e((ImageView) this.a, null, null);
        }
        if (drawable != null && (aoamVar = this.j) != null) {
            drawable = r(drawable, aoamVar);
        }
        super.jZ(drawable);
    }
}

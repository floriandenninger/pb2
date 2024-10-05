package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hza implements View.OnTouchListener, icp {
    public final ajjz b;
    public final ajjv c;
    public final Activity d;
    public ViewGroup e;
    public hyz f;
    public axdk g;
    public View h;
    public View i;
    public View j;
    public View.OnLayoutChangeListener k;
    private final ajjx n;
    private final hxf o;
    private final hxf p;
    private final List q;
    private boolean r;
    private AnimatorSet s;
    public static final zpa l = new zpa();
    private static final amrz m = amrz.l(axbx.COMMENT_NORMAL, Integer.valueOf(R.style.NormalDynamicSticker), axbx.COMMENT_LIGHT, Integer.valueOf(R.style.LightDynamicSticker));
    public static final axbx a = axbx.COMMENT_NORMAL;

    public hza(Activity activity, ajjz ajjzVar, hyz hyzVar) {
        hyw hywVar = new hyw(this);
        this.n = hywVar;
        ajju a2 = ajjv.a();
        a2.c = hywVar;
        a2.b(R.drawable.product_logo_avatar_anonymous_color_24);
        this.c = a2.a();
        hyx hyxVar = new hyx(this, 1);
        this.o = hyxVar;
        hyx hyxVar2 = new hyx(this, 0);
        this.p = hyxVar2;
        this.q = Arrays.asList(hyxVar, hyxVar2);
        this.d = activity;
        this.b = ajjzVar;
        this.f = hyzVar;
    }

    private static Rect f(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    private final void g(boolean z) {
        this.s = gfw.y(this.q, z, this.s, true != z ? 70L : 150L);
    }

    @Override // defpackage.icp
    public final void a(axcg axcgVar) {
    }

    public final axdj c(zsb zsbVar) {
        axbv axbvVar;
        axbv axbvVar2;
        axdi i = this.g.i();
        if (i.c == 4) {
            axbvVar = (axbv) i.d;
        } else {
            axbvVar = axbv.a;
        }
        axbp axbpVar = axbvVar.c;
        if (axbpVar == null) {
            axbpVar = axbp.a;
        }
        aone builder = axbpVar.toBuilder();
        String str = zsbVar.c;
        builder.copyOnWrite();
        axbp axbpVar2 = (axbp) builder.instance;
        str.getClass();
        axbpVar2.b = 1;
        axbpVar2.c = str;
        axdi i2 = this.g.i();
        if (i2.c == 4) {
            axbvVar2 = (axbv) i2.d;
        } else {
            axbvVar2 = axbv.a;
        }
        aone builder2 = axbvVar2.toBuilder();
        builder2.copyOnWrite();
        axbv axbvVar3 = (axbv) builder2.instance;
        axbp axbpVar3 = (axbp) builder.build();
        axbpVar3.getClass();
        axbvVar3.c = axbpVar3;
        axbvVar3.b |= 1;
        aone builder3 = this.g.i().toBuilder();
        builder3.copyOnWrite();
        axdi axdiVar = (axdi) builder3.instance;
        axbv axbvVar4 = (axbv) builder2.build();
        axbvVar4.getClass();
        axdiVar.d = axbvVar4;
        axdiVar.c = 4;
        axdj axdjVar = (axdj) this.g.toBuilder();
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder3.build());
        return axdjVar;
    }

    public final void d(axbx axbxVar) {
        axbv axbvVar;
        axdi i = this.g.i();
        if (i.c == 4) {
            axbvVar = (axbv) i.d;
        } else {
            axbvVar = axbv.a;
        }
        axdj axdjVar = (axdj) this.g.toBuilder();
        aone builder = this.g.i().toBuilder();
        aone builder2 = axbvVar.toBuilder();
        axbu axbuVar = axbvVar.g;
        if (axbuVar == null) {
            axbuVar = axbu.b;
        }
        aone builder3 = axbuVar.toBuilder();
        builder3.copyOnWrite();
        axbu axbuVar2 = (axbu) builder3.instance;
        axbuVar2.d = axbxVar.d;
        axbuVar2.c |= 1;
        builder2.copyOnWrite();
        axbv axbvVar2 = (axbv) builder2.instance;
        axbu axbuVar3 = (axbu) builder3.build();
        axbuVar3.getClass();
        axbvVar2.g = axbuVar3;
        axbvVar2.b |= 16;
        builder.copyOnWrite();
        axdi axdiVar = (axdi) builder.instance;
        axbv axbvVar3 = (axbv) builder2.build();
        axbvVar3.getClass();
        axdiVar.d = axbvVar3;
        axdiVar.c = 4;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder.build());
        this.g = (axdk) axdjVar.build();
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, ((Integer) m.get(axbxVar)).intValue())).inflate(R.layout.comment_sticker, (ViewGroup) null, false);
        this.h = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.author);
        TextView textView2 = (TextView) this.h.findViewById(R.id.comment);
        textView2.setText(axbvVar.d);
        textView.setText(axbvVar.e);
        textView.setAccessibilityTraversalAfter(R.id.reel_camera_close);
        textView2.setAccessibilityTraversalAfter(R.id.author);
    }

    public final void e() {
        this.e.setVisibility(0);
        Rect f = f(this.e);
        float height = r2.height() / Math.min(f.width(), f.height());
        float exactCenterY = f(this.h).exactCenterY();
        float exactCenterY2 = f.exactCenterY();
        int height2 = f.height();
        Matrix matrix = new Matrix();
        matrix.setTranslate(0.0f, (exactCenterY - exactCenterY2) / height2);
        matrix.preScale(height, height, 0.5f, 0.5f);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aone createBuilder = aorq.a.createBuilder();
        createBuilder.copyOnWrite();
        aorq.a((aorq) createBuilder.instance);
        createBuilder.copyOnWrite();
        aorq.b((aorq) createBuilder.instance);
        createBuilder.copyOnWrite();
        aorq aorqVar = (aorq) createBuilder.instance;
        aorqVar.f = 1;
        aorqVar.b |= 4;
        for (int i = 0; i < 9; i++) {
            createBuilder.W(fArr[i]);
        }
        final aorq aorqVar2 = (aorq) createBuilder.build();
        final ViewGroup viewGroup = (ViewGroup) this.h.getParent();
        final ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        int width = this.h.getWidth();
        int height3 = this.h.getHeight();
        viewGroup.removeView(this.h);
        yny.A(this.h, new zhb(width, height3, 1), yny.y(width, height3), ViewGroup.LayoutParams.class);
        final Bitmap A = wcy.A(this.d, this.h);
        wcy.C(this.d, A, new zpx() { // from class: hyv
            @Override // defpackage.zpx
            public final void a(zsb zsbVar) {
                hza hzaVar = hza.this;
                Bitmap bitmap = A;
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                ViewGroup viewGroup2 = viewGroup;
                aorq aorqVar3 = aorqVar2;
                if (hzaVar.d.isFinishing() || hzaVar.d.isDestroyed()) {
                    return;
                }
                bitmap.recycle();
                hzaVar.h.setLayoutParams(layoutParams2);
                viewGroup2.addView(hzaVar.h);
                axdj c = hzaVar.c(zsbVar);
                c.copyOnWrite();
                ((axdk) c.instance).E(aorqVar3);
                wcy.I(c, zsbVar);
                hzaVar.f.a((axdk) c.build());
            }
        });
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
        axbv axbvVar;
        this.g = axdkVar;
        axdi i = axdkVar.i();
        if (i.c == 4) {
            axbvVar = (axbv) i.d;
        } else {
            axbvVar = axbv.a;
        }
        axbu axbuVar = axbvVar.g;
        if (axbuVar == null) {
            axbuVar = axbu.b;
        }
        aonw aonwVar = new aonw(axbuVar.e, axbu.a);
        axbu axbuVar2 = axbvVar.g;
        if (axbuVar2 == null) {
            axbuVar2 = axbu.b;
        }
        axbx b = axbx.b(axbuVar2.d);
        if (b == null) {
            b = axbx.COMMENT_STYLE_UNSPECIFIED;
        }
        d((axbx) iam.a(aonwVar, b));
        yny.B(this.h, this.g.c(), this.g.a());
        zpx zpxVar = new zpx() { // from class: hyu
            @Override // defpackage.zpx
            public final void a(zsb zsbVar) {
                hza hzaVar = hza.this;
                if (hzaVar.d.isFinishing() || hzaVar.d.isDestroyed()) {
                    return;
                }
                axdj c = hzaVar.c(zsbVar);
                wcy.I(c, zsbVar);
                hzaVar.f.a((axdk) c.build());
            }
        };
        Uri aj = wbs.aj(axbvVar.f);
        ImageView imageView = (ImageView) this.h.findViewById(R.id.author_avatar);
        imageView.setImageDrawable(this.d.getResources().getDrawable(R.drawable.product_logo_avatar_anonymous_color_24));
        this.b.l(aj, new hyy(this, imageView, zpxVar));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.h) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.r) {
                    g(false);
                    this.r = false;
                    this.h.performClick();
                }
                return true;
            }
            if (action != 2) {
                return false;
            }
        }
        if (!this.r) {
            g(true);
            this.r = true;
        }
        return true;
    }
}

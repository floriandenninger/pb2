package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktz implements ajom {
    public final aahd a;
    public final Runnable b;
    public final Context c;
    public final kuh d;
    public final ywr e;
    public acra f;
    public int h;
    public khz j;
    public final aadw k;
    private final ajut l;
    private final ajjz m;
    private View n = null;
    public avaz g = null;
    public ayqx i = null;

    public ktz(Context context, aahd aahdVar, ajut ajutVar, ajjz ajjzVar, aadw aadwVar, kuh kuhVar, ywr ywrVar, Runnable runnable) {
        this.c = context;
        this.a = aahdVar;
        this.l = ajutVar;
        this.m = ajjzVar;
        this.k = aadwVar;
        this.b = runnable;
        this.d = kuhVar;
        this.e = ywrVar;
    }

    private final void h() {
        if (this.n != null) {
            return;
        }
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.suggested_action, (ViewGroup) null);
        this.n = inflate;
        this.d.e = inflate;
        asvu asvuVar = this.k.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.ba) {
            View view = this.n;
            view.getClass();
            final TextView textView = (TextView) view.findViewById(R.id.action_text);
            wbs.Y(this.c, R.attr.ytTextAppearanceBody1b).ifPresent(new IntConsumer() { // from class: ktx
                @Override // j$.util.function.IntConsumer
                public final void accept(int i) {
                    ktz ktzVar = ktz.this;
                    TextView textView2 = textView;
                    jm.s(textView2, i);
                    textView2.setTextColor(wbs.Q(ktzVar.c, R.attr.ytOverlayTextPrimary));
                }

                @Override // j$.util.function.IntConsumer
                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer.CC.$default$andThen(this, intConsumer);
                }
            });
            textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_text_to_dismiss_padding_end), textView.getPaddingBottom());
            jj.h((ImageView) view.findViewById(R.id.action_dismiss), wbs.S(this.c, R.attr.ytOverlayTextSecondary));
            ImageView imageView = (ImageView) view.findViewById(R.id.action_image);
            imageView.setPaddingRelative(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_new_icon_padding_start), imageView.getPaddingTop(), imageView.getPaddingEnd(), imageView.getPaddingBottom());
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        h();
        View view = this.n;
        view.getClass();
        return view;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final aomf d() {
        avaz avazVar = (avaz) a().getTag();
        if (avazVar != null) {
            return avazVar.h;
        }
        return null;
    }

    @Override // defpackage.ajom
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, final avaz avazVar) {
        zhh h;
        int aY;
        this.g = avazVar;
        h();
        this.f = ajokVar.a;
        aqyg aqygVar = avazVar.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        final View view = this.n;
        view.getClass();
        ((TextView) view.findViewById(R.id.action_text)).setText(b);
        ImageView imageView = (ImageView) view.findViewById(R.id.action_image);
        int i = avazVar.c;
        if (i == 2) {
            ajut ajutVar = this.l;
            arfr b2 = arfr.b(((arfs) avazVar.d).c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b2);
            if (a != 0) {
                imageView.setImageDrawable(aii.a(this.c, a));
            } else {
                imageView.setImageDrawable(null);
            }
        } else if (i != 13) {
            imageView.setImageDrawable(null);
        } else {
            this.m.h(imageView, (avgg) avazVar.d);
        }
        View findViewById = view.findViewById(R.id.touch_area_action);
        final apxf apxfVar = avazVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ktt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                aomf d;
                int aX;
                int aX2;
                ktz ktzVar = ktz.this;
                ktzVar.a.c(apxfVar, null);
                avaz avazVar2 = ktzVar.g;
                if (avazVar2 != null && (((aX = aobq.aX(avazVar2.j)) == 0 || aX != 2) && (aX2 = aobq.aX(ktzVar.g.j)) != 0 && aX2 != 1)) {
                    ktzVar.b.run();
                }
                khz khzVar = ktzVar.j;
                if (khzVar != null) {
                    khzVar.m();
                }
                acra acraVar = ktzVar.f;
                if (acraVar == null || (d = ktzVar.d()) == null) {
                    return;
                }
                acraVar.I(3, new acqx(d), null);
            }
        });
        jw.M(findViewById, new kty(b));
        final ImageView imageView2 = (ImageView) view.findViewById(R.id.action_dismiss);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ktu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ktz ktzVar = ktz.this;
                avbb avbbVar = avazVar.g;
                if (avbbVar == null) {
                    avbbVar = avbb.a;
                }
                if (avbbVar.pY(avay.b)) {
                    ynm.m(ktzVar.e.b(kfq.m), jun.p);
                }
                ktzVar.b.run();
                acra acraVar = ktzVar.f;
                if (acraVar == null) {
                    return;
                }
                acraVar.I(3, new acqx(acsb.c(87958)), null);
            }
        });
        view.post(new Runnable() { // from class: ktw
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = imageView2;
                View view3 = view;
                Rect rect = new Rect();
                view2.getHitRect(rect);
                int i2 = -view2.getContext().getResources().getDimensionPixelSize(R.dimen.suggested_action_dismiss_touch_delegate);
                rect.inset(i2, i2);
                view3.setTouchDelegate(new TouchDelegate(rect, view2));
            }
        });
        view.setTag(avazVar);
        if ((avazVar.b & 256) == 0 || (aY = aobq.aY(avazVar.i)) == 0 || aY != 3) {
            h = yny.h(yny.m(81), yny.x(-2), yny.n(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_height)), yny.r(0));
        } else {
            h = yny.h(yny.m(8388691), yny.x(-2), yny.n(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_height)), yny.r(this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_left_aligned_start_margin)));
        }
        yny.z(view, h, FrameLayout.LayoutParams.class);
        g(avazVar);
        acra acraVar = this.f;
        if (acraVar == null) {
            return;
        }
        acraVar.D(new acqx(acsb.c(87958)));
    }

    public final void g(avaz avazVar) {
        int dimensionPixelSize;
        int aY;
        if (avazVar == null) {
            return;
        }
        if ((avazVar.b & 256) == 0 || (aY = aobq.aY(avazVar.i)) == 0 || aY != 3) {
            dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_center_aligned_default_bottom_margin);
        } else {
            dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.suggested_action_left_aligned_default_bottom_margin);
        }
        asvu asvuVar = this.k.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (!asvuVar.bd) {
            View view = this.n;
            view.getClass();
            yny.z(view, yny.k(dimensionPixelSize), FrameLayout.LayoutParams.class);
            return;
        }
        kuh kuhVar = this.d;
        int i = dimensionPixelSize + this.h;
        if (kuhVar.a && kuhVar.f != i) {
            kuhVar.f = i;
            ValueAnimator valueAnimator = kuhVar.c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                kuhVar.b(i);
            } else {
                kuhVar.c.cancel();
                kuhVar.c.start();
            }
        }
    }
}

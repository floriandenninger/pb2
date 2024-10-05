package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjo implements zfk {
    public final View a;
    public final Optional b;
    public final ayqx c;
    public final /* synthetic */ PivotBar d;
    private final mju e;
    private final CharSequence f;
    private final Optional g;
    private final mjt h;

    public mjo(PivotBar pivotBar, int i, ViewGroup viewGroup, Drawable drawable, final CharSequence charSequence, Map map, Optional optional) {
        this.d = pivotBar;
        View inflate = LayoutInflater.from(pivotBar.getContext()).inflate(i, viewGroup, false);
        this.a = inflate;
        final mju mjuVar = new mju(pivotBar, (ImageView) inflate.findViewById(R.id.image), drawable);
        this.e = mjuVar;
        this.f = charSequence;
        this.g = Optional.ofNullable((TextView) inflate.findViewById(R.id.text)).map(new Function() { // from class: mjn
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                mjo mjoVar = mjo.this;
                CharSequence charSequence2 = charSequence;
                return new mjv(mjoVar.d, (TextView) obj, charSequence2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        });
        this.b = optional;
        View findViewById = inflate.findViewById(R.id.progress_indicator_stub);
        if (optional.isPresent() && findViewById != null) {
            View a = ((mjh) optional.get()).a();
            ViewGroup viewGroup2 = (ViewGroup) findViewById.getParent();
            viewGroup2.addView(a, viewGroup2.indexOfChild(findViewById), findViewById.getLayoutParams());
            viewGroup2.removeView(findViewById);
        }
        final mjt mjtVar = new mjt(pivotBar, zce.b((ViewStub) inflate.findViewById(R.id.new_content_dot), View.class), zce.b((ViewStub) inflate.findViewById(R.id.new_content_count), TextView.class), map);
        this.h = mjtVar;
        aypy o = aypy.o(aypy.W(charSequence), mjtVar.a.Y(new ayrv() { // from class: mjs
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                final mjt mjtVar2 = mjt.this;
                return ((Optional) obj).map(new Function() { // from class: mjp
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        mjt mjtVar3 = mjt.this;
                        Integer num = (Integer) obj2;
                        if (num.intValue() > 0) {
                            return mjtVar3.a(num.intValue());
                        }
                        return mjtVar3.b();
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                });
            }
        }), ((aypn) optional.map(jyr.t).orElse(aypn.z(Optional.empty()))).U(), new ayrt() { // from class: mjl
            @Override // defpackage.ayrt
            public final Object a(Object obj, Object obj2, Object obj3) {
                return mjo.this.a((CharSequence) obj, (Optional) obj2, (Optional) obj3);
            }
        });
        inflate.getClass();
        this.c = new ayqw(o.ax(new mbg(inflate, 3)), ((aypn) optional.map(jyr.u).orElse(aypn.z(false))).A(luw.q).X(new ayrs() { // from class: mjk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                mju.this.a.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
            }
        }), aynu.e(new ayrm() { // from class: mjj
            @Override // defpackage.ayrm
            public final void a() {
                mjt.this.b.qc();
            }
        }), (ayqx) optional.map(jyr.s).orElse(aynu.d()));
    }

    public final CharSequence a(CharSequence charSequence, Optional optional, Optional optional2) {
        Object[] array = ((List) aypy.X(optional, optional2).L(khf.o).Y(luw.r).ah(charSequence).av().X()).toArray();
        int length = array.length;
        if (length == 1) {
            return charSequence;
        }
        try {
            return this.d.a.getString(length == 2 ? R.string.tab_name_with_extra_info : R.string.tab_name_with_two_extra_infos, array);
        } catch (MissingFormatArgumentException unused) {
            return charSequence;
        }
    }

    public final void b(boolean z, int i) {
        this.h.a.c(z ? Optional.of(Integer.valueOf(i)) : Optional.empty());
    }

    public final void c(final TypedArray typedArray) {
        mjt mjtVar = this.h;
        if (mjtVar.c.c() && mjtVar.c.a().getBackground() != null) {
            int[] iArr = mkd.a;
            int i = typedArray.hasValue(3) ? typedArray.getInt(3, 0) : -1;
            String b = gng.LIGHT.b();
            String b2 = gng.DARK.b();
            if (i == -1 || !mjtVar.e.containsKey(b) || !mjtVar.e.containsKey(b2)) {
                if (typedArray.hasValue(2)) {
                    mjtVar.c.a().setBackground(typedArray.getDrawable(2));
                }
            } else {
                if (i != 0) {
                    b = b2;
                }
                int intValue = ((Integer) mjtVar.e.get(b)).intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(intValue);
                gradientDrawable.setStroke(mjtVar.f.getResources().getDimensionPixelSize(R.dimen.new_content_badge_stroke_width), typedArray.getColor(4, 0));
                mjtVar.c.a().setBackground(gradientDrawable);
            }
        }
        if (mjtVar.d.c()) {
            int[] iArr2 = mkd.a;
            if (typedArray.hasValue(1)) {
                ((TextView) mjtVar.d.a()).setBackground(typedArray.getDrawable(1));
            }
        }
        mju mjuVar = this.e;
        int[] iArr3 = mkd.a;
        if (typedArray.hasValue(8) && typedArray.hasValue(9)) {
            ImageView imageView = mjuVar.a;
            PivotBar pivotBar = mjuVar.c;
            imageView.setImageDrawable(pivotBar.b.c(mjuVar.b, pivotBar.a(typedArray.getColor(8, 0), typedArray.getColor(9, 0))));
        }
        this.g.ifPresent(new Consumer() { // from class: mjm
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                TypedArray typedArray2 = typedArray;
                mjv mjvVar = (mjv) obj;
                int[] iArr4 = mkd.a;
                if (typedArray2.hasValue(8) && typedArray2.hasValue(7)) {
                    mjvVar.a.setTextColor(mjvVar.b.a(typedArray2.getColor(8, 0), typedArray2.getColor(7, 0)));
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        if (typedArray.hasValue(9)) {
            Drawable background = this.a.getBackground();
            if (background instanceof RippleDrawable) {
                RippleDrawable rippleDrawable = (RippleDrawable) background.mutate();
                int color = typedArray.getColor(9, 0);
                rippleDrawable.setColor(this.d.b.a(color, color, color, color, color, color).withAlpha(66));
                this.a.setBackground(rippleDrawable);
            }
        }
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }
}

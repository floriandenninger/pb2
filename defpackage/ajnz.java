package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnz implements ajom {
    public final View a;
    public final DisplayMetrics b;
    private final int c;
    private final int d;

    public ajnz(Context context) {
        View view = new View(context);
        this.a = view;
        view.setImportantForAccessibility(2);
        this.b = context.getResources().getDisplayMetrics();
        this.c = wbs.W(context, R.attr.ytSeparator).orElse(0);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.default_line_separator_height);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(ajny ajnyVar) {
        final int i = 2;
        int intValue = ((Integer) ajnyVar.a.b(new amml(this) { // from class: ajnx
            public final /* synthetic */ ajnz a;

            {
                this.a = this;
            }

            @Override // defpackage.amml
            public final Object apply(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                if (i2 == 1) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                return Integer.valueOf(yjk.K(this.a.b, ((Integer) obj).intValue()));
            }
        }).e(Integer.valueOf(this.d))).intValue();
        final int i2 = 1;
        final int i3 = 0;
        int intValue2 = ((Integer) ajnyVar.b.b(new amml(this) { // from class: ajnx
            public final /* synthetic */ ajnz a;

            {
                this.a = this;
            }

            @Override // defpackage.amml
            public final Object apply(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                if (i22 == 1) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                return Integer.valueOf(yjk.K(this.a.b, ((Integer) obj).intValue()));
            }
        }).e(0)).intValue();
        int intValue3 = ((Integer) ajnyVar.c.b(new amml(this) { // from class: ajnx
            public final /* synthetic */ ajnz a;

            {
                this.a = this;
            }

            @Override // defpackage.amml
            public final Object apply(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                if (i22 == 1) {
                    return Integer.valueOf((int) yjk.I(this.a.b, ((Float) obj).floatValue()));
                }
                return Integer.valueOf(yjk.K(this.a.b, ((Integer) obj).intValue()));
            }
        }).e(0)).intValue();
        this.a.setMinimumHeight(intValue + intValue2 + intValue3);
        this.a.setBackground(new InsetDrawable((Drawable) new ColorDrawable(this.c), this.a.getPaddingLeft(), intValue2, this.a.getPaddingRight(), intValue3));
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((ajny) obj);
    }
}

package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almy implements alnx {
    final /* synthetic */ alnf a;

    public almy(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // defpackage.alnx
    public final void a(TextInputLayout textInputLayout) {
        AutoCompleteTextView a = alnf.a(textInputLayout.a);
        alnf alnfVar = this.a;
        int i = alnfVar.k.j;
        if (i == 2) {
            a.setDropDownBackgroundDrawable(alnfVar.h);
        } else if (i == 1) {
            a.setDropDownBackgroundDrawable(alnfVar.g);
        }
        alnf alnfVar2 = this.a;
        if (!alnf.h(a)) {
            TextInputLayout textInputLayout2 = alnfVar2.k;
            int i2 = textInputLayout2.j;
            if (i2 == 1 || i2 == 2) {
                alkg alkgVar = textInputLayout2.i;
                int j = alkd.j(a, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (i2 == 2) {
                    int j2 = alkd.j(a, R.attr.colorSurface);
                    alkg alkgVar2 = new alkg(alkgVar.i());
                    int s = akwg.s(j, j2, 0.1f);
                    alkgVar2.l(new ColorStateList(iArr, new int[]{s, 0}));
                    alkgVar2.setTint(j2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{s, j2});
                    alkg alkgVar3 = new alkg(alkgVar.i());
                    alkgVar3.setTint(-1);
                    jw.O(a, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, alkgVar2, alkgVar3), alkgVar}));
                } else {
                    int i3 = alnfVar2.k.k;
                    jw.O(a, new RippleDrawable(new ColorStateList(iArr, new int[]{akwg.s(j, i3, 0.1f), i3}), alkgVar, alkgVar));
                }
            } else {
                throw new IllegalStateException();
            }
        }
        alnf alnfVar3 = this.a;
        a.setOnTouchListener(new alnc(alnfVar3, a));
        a.setOnFocusChangeListener(alnfVar3.b);
        a.setOnDismissListener(new alnd(alnfVar3));
        a.setThreshold(0);
        a.removeTextChangedListener(this.a.a);
        a.addTextChangedListener(this.a.a);
        textInputLayout.m(true);
        textInputLayout.x(null);
        if (!alnf.h(a)) {
            jw.V(this.a.m, 2);
        }
        textInputLayout.N(this.a.c);
        textInputLayout.u(true);
    }
}

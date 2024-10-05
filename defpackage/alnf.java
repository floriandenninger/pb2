package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnf extends alng {
    public final TextWatcher a;
    public final View.OnFocusChangeListener b;
    public final alnw c;
    public boolean d;
    public boolean e;
    public long f;
    public StateListDrawable g;
    public alkg h;
    public AccessibilityManager i;
    public ValueAnimator j;
    private final alnx o;
    private final alny p;
    private ValueAnimator q;

    public alnf(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.a = new almv(this);
        this.b = new almw(this);
        this.c = new almx(this, this.k);
        this.o = new almy(this);
        this.p = new alna(this);
        this.d = false;
        this.e = false;
        this.f = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView a(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView) editText;
    }

    public static boolean h(EditText editText) {
        return editText.getKeyListener() != null;
    }

    private final ValueAnimator j(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(aleq.a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new almu(this));
        return ofFloat;
    }

    private final alkg k(float f, float f2, float f3, int i) {
        alkk a = alkl.a();
        a.d(f);
        a.e(f);
        a.b(f2);
        a.c(f2);
        alkl a2 = a.a();
        alkg h = alkg.h(this.l, f3);
        h.c(a2);
        alkf alkfVar = h.a;
        if (alkfVar.i == null) {
            alkfVar.i = new Rect();
        }
        h.a.i.set(0, i, 0, i);
        h.invalidateSelf();
        return h;
    }

    @Override // defpackage.alng
    public final void b() {
        float dimensionPixelOffset = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.l.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        alkg k = k(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        alkg k2 = k(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.h = k;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.g = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, k);
        this.g.addState(new int[0], k2);
        int i = this.n;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        this.k.o(i);
        TextInputLayout textInputLayout = this.k;
        textInputLayout.n(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.k.r(new alnb(this));
        this.k.e(this.o);
        this.k.f(this.p);
        this.j = j(67, 0.0f, 1.0f);
        ValueAnimator j = j(50, 1.0f, 0.0f);
        this.q = j;
        j.addListener(new alne(this));
        this.i = (AccessibilityManager) this.l.getSystemService("accessibility");
    }

    public final void d(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.j.cancel();
            this.q.start();
        }
    }

    public final void e(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (g()) {
            this.d = false;
        }
        if (this.d) {
            this.d = false;
            return;
        }
        d(!this.e);
        if (this.e) {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        } else {
            autoCompleteTextView.dismissDropDown();
        }
    }

    @Override // defpackage.alng
    public final boolean f(int i) {
        return i != 0;
    }

    public final boolean g() {
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    @Override // defpackage.alng
    public final boolean i() {
        return true;
    }
}

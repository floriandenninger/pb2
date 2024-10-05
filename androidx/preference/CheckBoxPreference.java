package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.brl;
import defpackage.bsx;
import defpackage.bsy;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final brl c;

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public void qn(bsx bsxVar) {
        super.qn(bsxVar);
        ad(bsxVar.E(R.id.checkbox));
        ac(bsxVar);
    }

    @Override // androidx.preference.Preference
    public final void qo(View view) {
        D();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(R.id.checkbox));
            ab(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gl.q(context, com.google.android.youtube.R.attr.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new brl(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.b, i, i2);
        o(gl.w(obtainStyledAttributes, 5, 0));
        l(gl.w(obtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = gl.x(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }
}

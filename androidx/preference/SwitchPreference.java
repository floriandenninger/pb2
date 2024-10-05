package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import defpackage.bsx;
import defpackage.bsy;
import defpackage.btb;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final btb c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreference(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        ad(bsxVar.E(R.id.switch_widget));
        ac(bsxVar);
    }

    @Override // androidx.preference.Preference
    public final void qo(View view) {
        D();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(R.id.switch_widget));
            ab(view.findViewById(R.id.summary));
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gl.q(context, com.google.android.youtube.R.attr.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new btb(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.l, i, i2);
        o(gl.w(obtainStyledAttributes, 7, 0));
        l(gl.w(obtainStyledAttributes, 6, 1));
        this.d = gl.w(obtainStyledAttributes, 9, 3);
        d();
        this.e = gl.w(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = gl.x(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
}

package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.youtube.R;
import defpackage.bsx;
import defpackage.bsy;
import defpackage.btc;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final btc c;
    private CharSequence d;
    private CharSequence e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.c = new btc(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bsy.m, R.attr.switchPreferenceCompatStyle, 0);
        o(gl.w(obtainStyledAttributes, 7, 0));
        l(gl.w(obtainStyledAttributes, 6, 1));
        this.d = gl.w(obtainStyledAttributes, 9, 3);
        d();
        this.e = gl.w(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = gl.x(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ad(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.c = this.d;
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.d = this.e;
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        ad(bsxVar.E(R.id.switchWidget));
        ac(bsxVar);
    }

    @Override // androidx.preference.Preference
    public final void qo(View view) {
        D();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            ad(view.findViewById(R.id.switchWidget));
            ab(view.findViewById(android.R.id.summary));
        }
    }
}

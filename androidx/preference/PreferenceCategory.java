package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bsx;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gl.q(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), null);
    }

    @Override // androidx.preference.Preference
    public final boolean T() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.T();
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        if (Build.VERSION.SDK_INT >= 28) {
            bsxVar.a.setAccessibilityHeading(true);
        }
    }
}

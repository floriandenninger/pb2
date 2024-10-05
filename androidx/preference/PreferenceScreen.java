package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bss;
import defpackage.gl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, gl.q(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ad() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        bss bssVar;
        if (this.t != null || this.u != null || k() == 0 || (bssVar = this.k.e) == null) {
            return;
        }
        bssVar.aI();
    }
}

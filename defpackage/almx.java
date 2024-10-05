package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almx extends alnw {
    final /* synthetic */ alnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almx(alnf alnfVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.b = alnfVar;
    }

    @Override // defpackage.alnw, defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        if (!alnf.h(this.b.k.a)) {
            ksVar.r(Spinner.class.getName());
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            Bundle a = ksVar.a();
            if (a != null && (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                z = true;
            }
        } else {
            z = ksVar.b.isShowingHintText();
        }
        if (z) {
            ksVar.A(null);
        }
    }

    @Override // defpackage.ic
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        AutoCompleteTextView a = alnf.a(this.b.k.a);
        if (accessibilityEvent.getEventType() == 1 && this.b.i.isTouchExplorationEnabled() && !alnf.h(this.b.k.a)) {
            this.b.e(a);
        }
    }
}

package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zah extends ic {
    @Override // defpackage.ic
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.r(Button.class.getName());
    }
}

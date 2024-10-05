package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhu extends ic {
    final /* synthetic */ CheckableImageButton b;

    public alhu(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // defpackage.ic
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.p(this.b.b);
        ksVar.q(this.b.a);
    }
}

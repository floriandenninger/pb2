package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzs extends ic {
    final /* synthetic */ AccessibilityLayerLayout b;

    public yzs(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.b = accessibilityLayerLayout;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        this.b.a();
        super.d(view, ksVar);
    }

    @Override // defpackage.ic
    public final boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean z = false;
        if (!this.b.d(view)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height) {
            z = true;
        }
        accessibilityEvent.setFullScreen(z);
        return super.i(viewGroup, view, accessibilityEvent);
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzu implements ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ AccessibilityLayerLayout a;

    public yzu(AccessibilityLayerLayout accessibilityLayerLayout) {
        this.a = accessibilityLayerLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        AccessibilityLayerLayout accessibilityLayerLayout = this.a;
        if (accessibilityLayerLayout.c == null) {
            accessibilityLayerLayout.c = accessibilityLayerLayout.findViewById(accessibilityLayerLayout.a);
        }
        AccessibilityLayerLayout accessibilityLayerLayout2 = this.a;
        if (accessibilityLayerLayout2.d == null) {
            accessibilityLayerLayout2.d = accessibilityLayerLayout2.findViewById(accessibilityLayerLayout2.b);
        }
        this.a.a();
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        AccessibilityLayerLayout accessibilityLayerLayout = this.a;
        View view3 = accessibilityLayerLayout.c;
        if (view3 != null && accessibilityLayerLayout.indexOfChild(view3) == -1) {
            this.a.c = null;
        }
        AccessibilityLayerLayout accessibilityLayerLayout2 = this.a;
        View view4 = accessibilityLayerLayout2.d;
        if (view4 != null && accessibilityLayerLayout2.indexOfChild(view4) == -1) {
            this.a.d = null;
        }
        this.a.a();
    }
}

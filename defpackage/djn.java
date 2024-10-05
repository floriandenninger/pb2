package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djn extends byi {
    public final WeakReference a;
    public final WeakReference b;

    public djn(ComponentTree componentTree, ViewPager viewPager) {
        this.a = new WeakReference(componentTree);
        this.b = new WeakReference(viewPager);
    }

    @Override // defpackage.byi, defpackage.byg
    public final void b(int i, float f, int i2) {
        ComponentTree componentTree = (ComponentTree) this.a.get();
        if (componentTree != null) {
            componentTree.l();
        }
    }
}

package defpackage;

import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djo {
    public final List a = new ArrayList(2);
    private final ComponentTree b;

    public djo(ComponentTree componentTree) {
        this.b = componentTree;
    }

    public final void a(dkp dkpVar) {
        if (this.b.j) {
            for (ViewParent parent = dkpVar.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewPager) {
                    ViewPager viewPager = (ViewPager) parent;
                    djn djnVar = new djn(this.b, viewPager);
                    try {
                        viewPager.e(djnVar);
                    } catch (ConcurrentModificationException unused) {
                        jw.H(viewPager, new djm(viewPager, djnVar, 1));
                    }
                    this.a.add(djnVar);
                }
            }
        }
    }
}

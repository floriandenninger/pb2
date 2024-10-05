package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssw implements sxr, sxl {
    private final String a;
    private final syd b;
    private final AtomicReference c;
    private final List d;
    private final List e = new ArrayList();

    public ssw(AtomicReference atomicReference, List list, String str, syd sydVar) {
        this.c = atomicReference;
        this.d = list;
        this.a = str;
        this.b = sydVar;
    }

    @Override // defpackage.sxl
    public final void a(View view) {
        c();
        view.setTag(333384171, null);
    }

    @Override // defpackage.sxr
    public final /* synthetic */ void b(View view, View view2) {
        rwh.ai(this, view);
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            try {
                ((syt) it.next()).a();
            } catch (RuntimeException unused) {
                this.b.b(28, "Error in cancelling intersection subscription.");
            }
        }
        this.e.clear();
    }

    @Override // defpackage.sxr
    public final void d(View view) {
        syu syuVar = (syu) this.c.get();
        if (syuVar == null) {
            this.b.b(28, "ScrollStrategyScrollListener is unavailable");
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            this.e.add(syuVar.a(this.a, (IntersectionObserver) it.next()));
        }
        view.setTag(333384171, this.a);
    }
}

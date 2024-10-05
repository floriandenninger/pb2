package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxm {
    public boolean a;
    public final List b;

    public rxm(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(faq faqVar) {
        this.b.add(faqVar);
    }

    public final void b(faq faqVar) {
        this.b.remove(faqVar);
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((faq) it.next()).a(z);
        }
    }

    public rxm() {
        this.b = rwh.x();
    }
}

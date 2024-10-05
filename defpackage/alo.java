package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alo implements Runnable {
    private final List a;
    private final int b;

    public alo(Collection collection, int i) {
        gn.h(collection, "initCallbacks cannot be null");
        this.a = new ArrayList(collection);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int size = this.a.size();
        int i = 0;
        if (this.b != 1) {
            while (i < size) {
                ((gp) this.a.get(i)).i();
                i++;
            }
        } else {
            while (i < size) {
                ((gp) this.a.get(i)).h();
                i++;
            }
        }
    }
}

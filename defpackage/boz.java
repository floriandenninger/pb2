package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class boz extends bpc {
    public final Object j = new Object();
    Executor k;
    bou l;
    Collection m;
    bpk n;

    public final void k(bou bouVar, Collection collection) {
        if (bouVar != null) {
            synchronized (this.j) {
                Executor executor = this.k;
                if (executor != null) {
                    executor.execute(new bow(this, this.n, bouVar, collection, 0));
                } else {
                    this.l = bouVar;
                    this.m = new ArrayList(collection);
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }
}

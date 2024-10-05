package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxb extends amqq implements Set {
    final Collection a;

    public amxb(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.amqq
    protected final Collection b() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return amkq.at(this, obj);
    }

    @Override // defpackage.amqq, defpackage.amqt
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return amkq.ak(this);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwm extends amwn {
    private static final long serialVersionUID = 0;

    public amwm(Collection collection, Object obj) {
        super(collection, obj);
    }

    @Override // defpackage.amwn, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amwl(this, super.iterator());
    }
}

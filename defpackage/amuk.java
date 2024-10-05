package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amuk extends AbstractMap {
    public abstract Iterator a();

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        amkq.bc(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new amuj(this);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface amuw extends Collection {
    int a(Object obj);

    int c(Object obj, int i);

    @Override // java.util.Collection, defpackage.amuw
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    void f(Object obj, int i);

    boolean h(Object obj, int i);

    Set i();

    Set j();

    @Override // java.util.Collection, defpackage.amuw
    boolean remove(Object obj);

    @Override // java.util.Collection, defpackage.amuw
    int size();
}

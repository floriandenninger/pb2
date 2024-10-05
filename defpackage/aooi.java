package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aooi extends aolr implements RandomAccess, aooj {
    private static final aooi b;
    private final List c;

    static {
        aooi aooiVar = new aooi(10);
        b = aooiVar;
        aooiVar.b();
    }

    public aooi() {
        this(10);
    }

    private static String j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof aomf) {
            return ((aomf) obj).E();
        }
        return aonz.f((byte[]) obj);
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        sb();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        sb();
        if (collection instanceof aooj) {
            collection = ((aooj) collection).h();
        }
        boolean addAll = this.c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        sb();
        this.c.clear();
        this.modCount++;
    }

    @Override // defpackage.aooj
    public final aooj d() {
        return this.a ? new aoqf(this) : this;
    }

    @Override // defpackage.aony
    public final /* bridge */ /* synthetic */ aony e(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new aooi(arrayList);
    }

    @Override // defpackage.aooj
    public final Object f(int i) {
        return this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof aomf) {
            aomf aomfVar = (aomf) obj;
            String E = aomfVar.E();
            if (aomfVar.q()) {
                this.c.set(i, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String f = aonz.f(bArr);
        if (aonz.g(bArr)) {
            this.c.set(i, f);
        }
        return f;
    }

    @Override // defpackage.aooj
    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // defpackage.aooj
    public final void i(aomf aomfVar) {
        sb();
        this.c.add(aomfVar);
        this.modCount++;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        sb();
        Object remove = this.c.remove(i);
        this.modCount++;
        return j(remove);
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        sb();
        return j(this.c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public aooi(int i) {
        this(new ArrayList(i));
    }

    private aooi(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // defpackage.aolr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}

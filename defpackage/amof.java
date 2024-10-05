package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amof extends amov implements amtt {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: protected */
    public amof(Map map) {
        super(map);
    }

    @Override // defpackage.amov
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.amov
    public final /* synthetic */ Collection b() {
        return Collections.emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amov
    public final Collection c(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // defpackage.amov
    public final Collection d(Object obj, Collection collection) {
        return j(obj, (List) collection, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection] */
    @Override // defpackage.amtt
    public final List e(Object obj) {
        Collection collection = (Collection) ((amov) this).a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return d(obj, collection);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.util.Collection] */
    @Override // defpackage.amtt
    public final List f(Object obj) {
        Collection collection = (Collection) ((amov) this).a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection a = a();
        a.addAll(collection);
        ((amov) this).b -= collection.size();
        collection.clear();
        return c(a);
    }
}

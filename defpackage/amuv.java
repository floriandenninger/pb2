package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amuv extends amof {
    private static final long serialVersionUID = 0;
    transient amnv c;

    public amuv(Map map, amnv amnvVar) {
        super(map);
        this.c = amnvVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (amnv) objectInputStream.readObject();
        n((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(((amov) this).a);
    }

    @Override // defpackage.amof, defpackage.amov
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.c.get();
    }

    @Override // defpackage.amov, defpackage.ampc
    public final Map k() {
        Map map = ((amov) this).a;
        if (map instanceof NavigableMap) {
            return new amom(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amop(this, (SortedMap) map);
        }
        return new amoi(this, map);
    }

    @Override // defpackage.amov, defpackage.ampc
    public final Set l() {
        Map map = ((amov) this).a;
        if (map instanceof NavigableMap) {
            return new amon(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amoq(this, (SortedMap) map);
        }
        return new amol(this, map);
    }
}

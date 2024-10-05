package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aba implements Iterable {
    public aaw b;
    public aaw c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaw a(Object obj) {
        aaw aawVar = this.b;
        while (aawVar != null && !aawVar.a.equals(obj)) {
            aawVar = aawVar.c;
        }
        return aawVar;
    }

    public Object b(Object obj, Object obj2) {
        aaw a = a(obj);
        if (a != null) {
            return a.b;
        }
        e(obj, obj2);
        return null;
    }

    public Object c(Object obj) {
        aaw a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((aaz) it.next()).jF(a);
            }
        }
        aaw aawVar = a.d;
        aaw aawVar2 = a.c;
        if (aawVar != null) {
            aawVar.c = aawVar2;
        } else {
            this.b = aawVar2;
        }
        aaw aawVar3 = a.c;
        if (aawVar3 != null) {
            aawVar3.d = aawVar;
        } else {
            this.c = aawVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aaw e(Object obj, Object obj2) {
        aaw aawVar = new aaw(obj, obj2);
        this.e++;
        aaw aawVar2 = this.c;
        if (aawVar2 == null) {
            this.b = aawVar;
        } else {
            aawVar2.c = aawVar;
            aawVar.d = aawVar2;
        }
        this.c = aawVar;
        return aawVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aba)) {
            return false;
        }
        aba abaVar = (aba) obj;
        if (this.e != abaVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abaVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((aay) it).next();
            Map.Entry next2 = ((aay) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final aax f() {
        aax aaxVar = new aax(this);
        this.d.put(aaxVar, false);
        return aaxVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((aay) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        aau aauVar = new aau(this.b, this.c);
        this.d.put(aauVar, false);
        return aauVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((aay) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

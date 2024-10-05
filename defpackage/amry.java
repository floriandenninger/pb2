package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class amry implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public amry(amrz amrzVar) {
        Object[] objArr = new Object[amrzVar.size()];
        Object[] objArr2 = new Object[amrzVar.size()];
        amxd listIterator = amrzVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public amrw a(int i) {
        return new amrw(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof amsx)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.b;
            amrw a = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                a.g(objArr[i], objArr2[i]);
            }
            return a.c();
        }
        amsx amsxVar = (amsx) obj;
        amrl amrlVar = (amrl) this.b;
        amrw a2 = a(amsxVar.size());
        amxd listIterator = amsxVar.listIterator();
        amxd listIterator2 = amrlVar.listIterator();
        while (listIterator.hasNext()) {
            a2.g(listIterator.next(), listIterator2.next());
        }
        return a2.c();
    }
}

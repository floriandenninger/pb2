package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amrw {
    Object[] a;
    int b;

    public amrw() {
        this(4);
    }

    private final void a(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, amrk.f(length, i2));
        }
    }

    public amrz b() {
        return c();
    }

    public amrz c() {
        return amvo.a(this.b, this.a);
    }

    public void e(Map.Entry entry) {
        g(entry.getKey(), entry.getValue());
    }

    public final void f(amrw amrwVar) {
        amrwVar.getClass();
        a(this.b + amrwVar.b);
        Object[] objArr = amrwVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = amrwVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += amrwVar.b;
    }

    public final void g(Object obj, Object obj2) {
        a(this.b + 1);
        amkq.r(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e((Map.Entry) it.next());
        }
    }

    public final void i(Map map) {
        h(map.entrySet());
    }

    public amrw(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}

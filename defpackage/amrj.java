package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class amrj extends amrk {
    Object[] a;
    int b;
    boolean c;

    public amrj(int i) {
        amkq.t(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, f(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object[] objArr, int i) {
        amkq.aC(objArr, i);
        g(this.b + i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(Object obj) {
        obj.getClass();
        g(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.amrk
    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d(Object... objArr) {
        a(objArr, objArr.length);
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(this.b + collection.size());
            if (collection instanceof amrl) {
                this.b = ((amrl) collection).b(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}

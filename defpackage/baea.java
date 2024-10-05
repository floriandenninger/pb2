package defpackage;

import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baea implements Iterable {
    public final List a = new ArrayList();
    public int b;
    public boolean c;
    private int d;

    public baea() {
        Process.myTid();
    }

    public final Object a(int i) {
        return this.a.get(i);
    }

    public final boolean b() {
        return this.d == 0;
    }

    public final boolean c(Object obj) {
        int indexOf;
        if (obj == null || (indexOf = this.a.indexOf(obj)) == -1) {
            return false;
        }
        if (this.b == 0) {
            this.a.remove(indexOf);
        } else {
            this.c = true;
            this.a.set(indexOf, null);
        }
        this.d--;
        return true;
    }

    public final void d(Object obj) {
        if (obj == null || this.a.contains(obj)) {
            return;
        }
        this.a.add(obj);
        this.d++;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new badz(this);
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cto {
    final Object a;
    public List b;
    cto c;
    cto d;

    cto() {
        this(null);
    }

    public cto(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object b() {
        int a = a();
        if (a > 0) {
            return this.b.remove(a - 1);
        }
        return null;
    }
}

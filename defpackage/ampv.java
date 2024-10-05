package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ampv extends ampa {
    final /* synthetic */ ampx a;
    private final Object b;
    private int c;

    public ampv(ampx ampxVar, int i) {
        this.a = ampxVar;
        this.b = ampxVar.g(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !amkq.b(this.b, this.a.g(this.c))) {
            this.c = this.a.d(this.b);
        }
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        Map l = this.a.l();
        if (l != null) {
            return l.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.j(i);
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        Object j = this.a.j(i);
        this.a.p(this.c, obj);
        return j;
    }
}

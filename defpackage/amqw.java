package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amqw extends ampa {
    final amre a;
    final Object b;
    int c;

    public amqw(amre amreVar, int i) {
        this.a = amreVar;
        this.b = amreVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            amre amreVar = this.a;
            if (i <= amreVar.c && amkq.b(this.b, amreVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.l(this.b, obj);
            return null;
        }
        Object obj2 = this.a.a[i];
        if (amkq.b(obj2, obj)) {
            return obj;
        }
        this.a.m(this.c, obj);
        return obj2;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amqv extends ampa {
    final Object a;
    int b;
    final /* synthetic */ amre c;

    public amqv(amre amreVar, int i) {
        this.c = amreVar;
        this.a = amreVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            amre amreVar = this.c;
            if (i <= amreVar.c && amkq.b(amreVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.c(this.a);
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object obj2 = this.c.b[i];
        if (amkq.b(obj2, obj)) {
            return obj;
        }
        this.c.n(this.b, obj);
        return obj2;
    }
}

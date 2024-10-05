package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anva implements anwy {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile anwy c;

    public anva(anwy anwyVar) {
        this.c = anwyVar;
    }

    @Override // defpackage.anwy
    public final Object a() {
        Object obj = this.b;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.c.a();
                    this.b = obj;
                    this.c = null;
                }
            }
        }
        return obj;
    }
}

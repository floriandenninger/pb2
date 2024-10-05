package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azzy {
    private final azvm a;

    public azzy(byte[] bArr) {
        this.a = azth.o(azzj.a);
    }

    public abstract Object a(Object obj);

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        Object obj2 = this.a.a;
        if (obj2 == azzj.a) {
            obj2 = a(obj);
            boolean z = azwq.a;
            Object obj3 = this.a.a;
            if (obj3 != azzj.a) {
                obj2 = obj3;
            } else if (!this.a.c(azzj.a, obj2)) {
                obj2 = this.a.a;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public final String toString() {
        return azth.g(this) + '@' + azth.h(this);
    }

    public azzy() {
    }
}

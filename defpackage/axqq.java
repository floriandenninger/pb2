package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axqq implements azrw, axpg {
    private static final Object a = new Object();
    private volatile azrw b;
    private volatile Object c = a;

    private axqq(azrw azrwVar) {
        this.b = azrwVar;
    }

    public static axpg a(azrw azrwVar) {
        if (azrwVar instanceof axpg) {
            return (axpg) azrwVar;
        }
        azrwVar.getClass();
        return new axqq(azrwVar);
    }

    public static azrw b(azrw azrwVar) {
        azrwVar.getClass();
        return azrwVar instanceof axqq ? azrwVar : new axqq(azrwVar);
    }

    @Override // defpackage.azrw
    public final Object get() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.get();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnx implements amnv {
    volatile amnv a;
    volatile boolean b;
    Object c;

    public amnx(amnv amnvVar) {
        amnvVar.getClass();
        this.a = amnvVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    amnv amnvVar = this.a;
                    amnvVar.getClass();
                    Object obj = amnvVar.get();
                    this.c = obj;
                    this.b = true;
                    this.a = null;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}

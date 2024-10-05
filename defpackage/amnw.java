package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnw implements Serializable, amnv {
    private static final long serialVersionUID = 0;
    final amnv a;
    volatile transient boolean b;
    transient Object c;

    public amnw(amnv amnvVar) {
        amnvVar.getClass();
        this.a = amnvVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object obj = this.a.get();
                    this.c = obj;
                    this.b = true;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}

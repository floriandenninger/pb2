package defpackage;

import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ammv implements Serializable {
    private static final long serialVersionUID = 0;

    public static ammv i(Object obj) {
        return obj == null ? amlr.a : new amna(obj);
    }

    public static ammv j(Object obj) {
        obj.getClass();
        return new amna(obj);
    }

    public abstract ammv a(ammv ammvVar);

    public abstract ammv b(amml ammlVar);

    public abstract Object c();

    public abstract Object d(amnv amnvVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract Set g();

    public abstract boolean h();

    public abstract int hashCode();
}

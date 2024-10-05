package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amqi implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public amqi(Comparable comparable) {
        this.b = comparable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amqi f(Comparable comparable) {
        return new amqh(comparable);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(amqi amqiVar) {
        if (amqiVar == amqg.a) {
            return 1;
        }
        if (amqiVar == amqe.a) {
            return -1;
        }
        int b = amvf.b(this.b, amqiVar.b);
        return b != 0 ? b : anaf.an(this instanceof amqf, amqiVar instanceof amqf);
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof amqi) {
            try {
                if (compareTo((amqi) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}

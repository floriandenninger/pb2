package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammm implements Serializable, amml {
    private static final long serialVersionUID = 0;
    private final Object a = null;

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.amml
    public final boolean equals(Object obj) {
        if (!(obj instanceof ammm)) {
            return false;
        }
        Object obj2 = ((ammm) obj).a;
        return amkq.b(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("null".length() + 20);
        sb.append("Functions.constant(");
        sb.append("null");
        sb.append(")");
        return sb.toString();
    }
}

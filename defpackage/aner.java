package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aner extends ammk implements Serializable {
    public static final aner a = new aner();
    private static final long serialVersionUID = 1;

    private aner() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ammk
    protected final /* synthetic */ Object a(Object obj) {
        return ((Integer) obj).toString();
    }

    @Override // defpackage.ammk
    protected final /* synthetic */ Object b(Object obj) {
        return Integer.decode((String) obj);
    }

    public final String toString() {
        return "Ints.stringConverter()";
    }
}

package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsw implements Serializable, azsv {
    public static final azsw a = new azsw();
    private static final long serialVersionUID = 0;

    private azsw() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.azsv
    public final Object fold(Object obj, azty aztyVar) {
        return obj;
    }

    @Override // defpackage.azsv
    public final azss get(azst azstVar) {
        azstVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.azsv
    public final azsv minusKey(azst azstVar) {
        azstVar.getClass();
        return this;
    }

    @Override // defpackage.azsv
    public final azsv plus(azsv azsvVar) {
        azsvVar.getClass();
        return azsvVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

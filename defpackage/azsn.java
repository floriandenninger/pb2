package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azsn implements Serializable {
    private static final long serialVersionUID = 0;
    private final azsv[] a;

    public azsn(azsv[] azsvVarArr) {
        azsvVarArr.getClass();
        this.a = azsvVarArr;
    }

    private final Object readResolve() {
        azsv[] azsvVarArr = this.a;
        azsv azsvVar = azsw.a;
        for (azsv azsvVar2 : azsvVarArr) {
            azsvVar = azsvVar.plus(azsvVar2);
        }
        return azsvVar;
    }
}

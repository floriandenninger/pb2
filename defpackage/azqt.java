package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azqt {
    public abstract int a();

    public final boolean c(banw[] banwVarArr) {
        int a = a();
        int length = banwVarArr.length;
        if (length == a) {
            return true;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("parallelism = ");
        sb.append(a);
        sb.append(", subscribers = ");
        sb.append(length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        for (banw banwVar : banwVarArr) {
            azpy.f(illegalArgumentException, banwVar);
        }
        return false;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unp {
    public final int a;
    public final int b;
    public final boolean c;

    public unp() {
    }

    public unp(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof unp) {
            unp unpVar = (unp) obj;
            if (this.a == unpVar.a && this.b == unpVar.b && this.c == unpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("null".length() + 162);
        sb.append("PrimesThreadsConfigurations{primesExecutorService=");
        sb.append("null");
        sb.append(", primesMetricExecutorPriority=");
        sb.append(i);
        sb.append(", primesMetricExecutorPoolSize=");
        sb.append(i2);
        sb.append(", enableDeferredTasks=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

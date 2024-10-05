package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class syp {
    public final int a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public syp() {
    }

    public syp(int i, float f, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static syo a() {
        syo syoVar = new syo();
        syoVar.a = -1;
        syoVar.b(4.0f);
        syoVar.b = false;
        syoVar.c = false;
        syoVar.c(false);
        return syoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof syp) {
            syp sypVar = (syp) obj;
            if (this.a == sypVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(sypVar.b) && this.c == sypVar.c && this.d == sypVar.d && this.e == sypVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        StringBuilder sb = new StringBuilder("null".length() + 180);
        sb.append("RecyclerConfig{initRangeSize=");
        sb.append(i);
        sb.append(", rangeRatio=");
        sb.append(f);
        sb.append(", computeRangeOnSyncLayout=");
        sb.append(z);
        sb.append(", recyclerViewItemPrefetch=");
        sb.append(z2);
        sb.append(", layoutHandlerFactory=");
        sb.append("null");
        sb.append(", useLegacyVisible=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}

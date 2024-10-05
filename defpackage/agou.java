package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agou {
    public static final agou a;
    public static final agou b;
    public static final agou c;
    private static final amru g = amru.q();
    public final boolean d;
    public final amru e;
    public final int f;

    static {
        agot a2 = a();
        a2.a = 2;
        a = a2.a();
        agot a3 = a();
        a3.a = 3;
        a3.c(true);
        b = a3.a();
        agot a4 = a();
        a4.a = 3;
        c = a4.a();
    }

    public agou() {
    }

    public agou(int i, boolean z, amru amruVar) {
        this.f = i;
        this.d = z;
        this.e = amruVar;
    }

    public static agot a() {
        agot agotVar = new agot();
        agotVar.c(false);
        agotVar.b(g);
        return agotVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agou)) {
            return false;
        }
        agou agouVar = (agou) obj;
        int i = this.f;
        int i2 = agouVar.f;
        if (i != 0) {
            return i == i2 && this.d == agouVar.d && amkq.aV(this.e, agouVar.e);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return ((((i ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.f;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(num.length() + 87 + String.valueOf(valueOf).length());
        sb.append("EntityControllerResult{orchestrationActionResult=");
        sb.append(num);
        sb.append(", retryable=");
        sb.append(z);
        sb.append(", additionalActions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

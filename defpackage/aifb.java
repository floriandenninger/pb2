package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class aifb {
    private final int a = 15;
    private final int b;
    private final String c;

    public aifb(int i, int i2, String str) {
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aifb)) {
            return false;
        }
        aifb aifbVar = (aifb) obj;
        return this.a == aifbVar.a && this.b == aifbVar.b && amkq.b(this.c, aifbVar.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }
}

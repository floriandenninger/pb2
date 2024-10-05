package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axi {
    public final String a;
    public final String b;
    public final int c = 1;
    public final int d = 1;

    public axi(String str) {
        this.a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axi)) {
            return false;
        }
        axi axiVar = (axi) obj;
        int i = axiVar.c;
        int i2 = axiVar.d;
        return amkq.b(this.a, axiVar.a) && amkq.b(this.b, axiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, 1, 1});
    }
}

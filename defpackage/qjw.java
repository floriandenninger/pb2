package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjw {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjw)) {
            return false;
        }
        qjw qjwVar = (qjw) obj;
        int i = qjwVar.a;
        if (this.b != qjwVar.b) {
            return false;
        }
        int i2 = qjwVar.c;
        int i3 = qjwVar.d;
        int i4 = qjwVar.e;
        boolean z = qjwVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.b), 0, 0, 0, false});
    }
}

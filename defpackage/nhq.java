package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhq {
    private final String a;
    private final String b;

    public nhq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhq) {
            nhq nhqVar = (nhq) obj;
            if (amkq.b(this.a, nhqVar.a) && amkq.b(this.b, nhqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

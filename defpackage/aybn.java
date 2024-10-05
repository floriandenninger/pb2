package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybn {
    public final axzo a;
    public final aycd b;
    public final aych c;

    public aybn() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aybn aybnVar = (aybn) obj;
            if (amkq.b(this.a, aybnVar.a) && amkq.b(this.b, aybnVar.b) && amkq.b(this.c, aybnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }

    public aybn(aych aychVar, aycd aycdVar, axzo axzoVar) {
        aychVar.getClass();
        this.c = aychVar;
        this.b = aycdVar;
        axzoVar.getClass();
        this.a = axzoVar;
    }
}

package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjw {
    public final Context a;
    public final ammv b;
    public final boolean c;
    private final ammv d;

    public sjw() {
    }

    public sjw(Context context, ammv ammvVar, ammv ammvVar2, boolean z) {
        this.a = context;
        this.d = ammvVar;
        this.b = ammvVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sjw) {
            sjw sjwVar = (sjw) obj;
            if (this.a.equals(sjwVar.a) && this.d.equals(sjwVar.d) && this.b.equals(sjwVar.b) && this.c == sjwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
        boolean z = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CollectionBasisContext{context=");
        sb.append(valueOf);
        sb.append(", accountNames=");
        sb.append(valueOf2);
        sb.append(", stacktrace=");
        sb.append(valueOf3);
        sb.append(", googlerOverridesCheckbox=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

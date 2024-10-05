package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uvq {
    public final Context a;
    public final amnv b;

    public uvq(Context context, amnv amnvVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = amnvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uvq) {
            uvq uvqVar = (uvq) obj;
            if (this.a.equals(uvqVar.a)) {
                amnv amnvVar = this.b;
                amnv amnvVar2 = uvqVar.b;
                if (amnvVar != null ? amnvVar.equals(amnvVar2) : amnvVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        amnv amnvVar = this.b;
        return hashCode ^ (amnvVar == null ? 0 : amnvVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public uvq() {
    }
}

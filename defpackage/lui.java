package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lui {
    public final Object a;
    public final int b;
    public final boolean c;

    public lui(Object obj, int i, boolean z) {
        if (obj == null) {
            throw new NullPointerException("Null eventTag");
        }
        this.a = obj;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lui) {
            lui luiVar = (lui) obj;
            if (this.a.equals(luiVar.a) && this.b == luiVar.b && this.c == luiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("HiddenItem{eventTag=");
        sb.append(valueOf);
        sb.append(", undoIndex=");
        sb.append(i);
        sb.append(", separatorRemoved=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public lui() {
    }
}

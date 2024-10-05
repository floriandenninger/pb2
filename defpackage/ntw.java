package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntw {
    public final String a;
    public final int b;

    public ntw() {
    }

    public ntw(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntw) {
            ntw ntwVar = (ntw) obj;
            if (this.a.equals(ntwVar.a) && this.b == ntwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("ScrollToItemData{panelId=");
        sb.append(str);
        sb.append(", itemIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xki {
    public static final xki a = a(null, null);
    public final aami b;
    private final String c;

    public xki() {
    }

    public xki(String str, aami aamiVar) {
        this.c = str;
        this.b = aamiVar;
    }

    public static xki a(String str, aami aamiVar) {
        return new xki(str, aamiVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xki) {
            xki xkiVar = (xki) obj;
            String str = this.c;
            if (str != null ? str.equals(xkiVar.c) : xkiVar.c == null) {
                aami aamiVar = this.b;
                aami aamiVar2 = xkiVar.b;
                if (aamiVar != null ? aamiVar.equals(aamiVar2) : aamiVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(valueOf).length());
        sb.append("AdOverlayContentMetadata{title=");
        sb.append(str);
        sb.append(", videoThumbnailDetails=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        aami aamiVar = this.b;
        return hashCode ^ (aamiVar != null ? aamiVar.hashCode() : 0);
    }
}

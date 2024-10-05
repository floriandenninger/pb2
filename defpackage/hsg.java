package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsg {
    public final amru a;
    public final ammv b;

    public hsg() {
    }

    public hsg(amru amruVar, ammv ammvVar) {
        this.a = amruVar;
        this.b = ammvVar;
    }

    public static hsf a() {
        hsf hsfVar = new hsf(null);
        hsfVar.a = amlr.a;
        return hsfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsg) {
            hsg hsgVar = (hsg) obj;
            if (amkq.aV(this.a, hsgVar.a) && this.b.equals(hsgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("CarouselThumbnailRecyclerViewData{thumbnailList=");
        sb.append(valueOf);
        sb.append(", selectedIndex=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

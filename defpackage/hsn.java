package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsn {
    public final ammv a;
    public final azrw b;
    public final boolean c;

    public hsn() {
    }

    public hsn(ammv ammvVar, azrw azrwVar, boolean z) {
        this.a = ammvVar;
        this.b = azrwVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hsn) {
            hsn hsnVar = (hsn) obj;
            if (this.a.equals(hsnVar.a) && this.b.equals(hsnVar.b) && this.c == hsnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87 + String.valueOf(valueOf2).length());
        sb.append("CarouselThumbnailViewData{videoDurationMs=");
        sb.append(valueOf);
        sb.append(", thumbnailBitmapProvider=");
        sb.append(valueOf2);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

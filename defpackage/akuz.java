package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akuz {
    public final Uri a;
    public final ammv b;
    public final ammv c;

    public akuz() {
    }

    public akuz(Uri uri, ammv ammvVar, ammv ammvVar2) {
        this.a = uri;
        this.b = ammvVar;
        this.c = ammvVar2;
    }

    public static akuy a(Uri uri) {
        uri.getClass();
        akuy akuyVar = new akuy(null);
        akuyVar.a = uri;
        akuyVar.b = amlr.a;
        akuyVar.c = amlr.a;
        return akuyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akuz) {
            akuz akuzVar = (akuz) obj;
            if (this.a.equals(akuzVar.a) && this.b.equals(akuzVar.b) && this.c.equals(akuzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PendingMedia{uri=");
        sb.append(valueOf);
        sb.append(", presetFrontendId=");
        sb.append(valueOf2);
        sb.append(", presetThumbnailFilePath=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

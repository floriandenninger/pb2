package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzi {
    public final String a;
    public final Bitmap b;
    public final byte[] c;
    public final Uri d;

    public akzi() {
    }

    public akzi(String str, Bitmap bitmap, byte[] bArr, Uri uri) {
        this.a = str;
        this.b = bitmap;
        this.c = bArr;
        this.d = uri;
    }

    public static akzh a(String str) {
        akzh akzhVar = new akzh();
        if (str == null) {
            throw new NullPointerException("Null frontendId");
        }
        akzhVar.a = str;
        akzhVar.b = null;
        akzhVar.c = null;
        akzhVar.d = null;
        return akzhVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akzi) {
            akzi akziVar = (akzi) obj;
            if (this.a.equals(akziVar.a) && ((bitmap = this.b) != null ? bitmap.equals(akziVar.b) : akziVar.b == null)) {
                if (Arrays.equals(this.c, akziVar instanceof akzi ? akziVar.c : akziVar.c)) {
                    Uri uri = this.d;
                    Uri uri2 = akziVar.d;
                    if (uri != null ? uri.equals(uri2) : uri2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        int hashCode2 = (((hashCode ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003;
        Uri uri = this.d;
        return hashCode2 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + String.valueOf(arrays).length() + String.valueOf(valueOf2).length());
        sb.append("UploadNotificationModel{frontendId=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(valueOf);
        sb.append(", notificationEndpointData=");
        sb.append(arrays);
        sb.append(", sourceVideoUri=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

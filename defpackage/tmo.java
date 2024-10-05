package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmo {
    public final Uri a;
    public final String b;
    public final tmm c;
    public final int d;
    public final amru e;
    private final ammv f;

    public tmo() {
    }

    public tmo(Uri uri, String str, tmm tmmVar, int i, amru amruVar, ammv ammvVar) {
        this.a = uri;
        this.b = str;
        this.c = tmmVar;
        this.d = i;
        this.e = amruVar;
        this.f = ammvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmo) {
            tmo tmoVar = (tmo) obj;
            if (this.a.equals(tmoVar.a) && this.b.equals(tmoVar.b) && this.c.equals(tmoVar.c) && this.d == tmoVar.d && amkq.aV(this.e, tmoVar.e) && this.f.equals(tmoVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DownloadRequest{fileUri=");
        sb.append(valueOf);
        sb.append(", urlToDownload=");
        sb.append(str);
        sb.append(", downloadConstraints=");
        sb.append(valueOf2);
        sb.append(", trafficTag=");
        sb.append(i);
        sb.append(", extraHttpHeaders=");
        sb.append(valueOf3);
        sb.append(", inlineDownloadParamsOptional=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

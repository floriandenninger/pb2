package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xeq {
    public final Uri a;
    public final afve b;
    public final boolean c;
    public final long d;
    public final amru e;

    public xeq(Uri uri, afve afveVar, boolean z, long j, amru amruVar) {
        if (uri == null) {
            throw new NullPointerException("Null getUri");
        }
        this.a = uri;
        this.b = afveVar;
        this.c = z;
        this.d = j;
        if (amruVar != null) {
            this.e = amruVar;
            return;
        }
        throw new NullPointerException("Null substitutedMacros");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xeq) {
            xeq xeqVar = (xeq) obj;
            if (this.a.equals(xeqVar.a) && this.b.equals(xeqVar.b) && this.c == xeqVar.c && this.d == xeqVar.d && amkq.aV(this.e, xeqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.d;
        return ((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 139 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FulfilledPing{getUri=");
        sb.append(valueOf);
        sb.append(", getHeaderRestrictor=");
        sb.append(valueOf2);
        sb.append(", getDelayedSendAllowed=");
        sb.append(z);
        sb.append(", getExpirationTimeMillis=");
        sb.append(j);
        sb.append(", substitutedMacros=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public xeq() {
    }
}

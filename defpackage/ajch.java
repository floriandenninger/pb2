package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajch implements ajce {
    public final String a;
    public final ajcd b;
    public final Object c;
    private final byte[] d;
    private final boolean e;

    public ajch(String str, byte[] bArr, ajcd ajcdVar, Object obj, boolean z) {
        this.a = str;
        this.d = bArr;
        this.b = ajcdVar;
        this.c = obj;
        this.e = z;
    }

    @Override // defpackage.ajce
    public final ajcd a() {
        return this.b;
    }

    @Override // defpackage.ajce
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ajce
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.ajce
    public final byte[] d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajch) {
            ajch ajchVar = (ajch) obj;
            if (TextUtils.equals(this.a, ajchVar.a) && Arrays.equals(this.d, ajchVar.d) && this.b.equals(ajchVar.b) && this.c.equals(ajchVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str != null ? str.hashCode() ^ 1000003 : 1000003) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.d);
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 112 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ContinuationWrapper{continuationToken=");
        sb.append(str);
        sb.append(", requestTrackingParams=");
        sb.append(arrays);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", continuation=");
        sb.append(valueOf2);
        sb.append(", showSpinnerOnReload=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

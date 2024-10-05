package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adoa {
    public final ScreenId a;
    public final adfs b;

    public adoa() {
    }

    public adoa(ScreenId screenId, adfs adfsVar) {
        this.a = screenId;
        this.b = adfsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adoa) {
            adoa adoaVar = (adoa) obj;
            if (this.a.equals(adoaVar.a) && this.b.equals(adoaVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("LocalStorageCloudScreenInfo{screenId=");
        sb.append(valueOf);
        sb.append(", loungeDeviceId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

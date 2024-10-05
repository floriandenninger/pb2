package defpackage;

import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.youtube.mdx.model.ScreenId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfu extends adfz {
    public final CastDevice a;

    public adfu() {
    }

    public adfu(CastDevice castDevice) {
        this.a = castDevice;
    }

    public static adfu a(CastDevice castDevice) {
        return new adfu(castDevice);
    }

    @Override // defpackage.adgb
    public final ScreenId b() {
        return null;
    }

    @Override // defpackage.adgb
    public final String c() {
        return this.a.d;
    }

    @Override // defpackage.adgb
    public final String d() {
        String valueOf = String.valueOf(this.a.e);
        return valueOf.length() != 0 ? "Cast:".concat(valueOf) : new String("Cast:");
    }

    @Override // defpackage.adgb
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfu) {
            return this.a.equals(((adfu) obj).a);
        }
        return false;
    }

    @Override // defpackage.adfz
    public final adgn f() {
        return new adgn(this.a.b());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("MdxCastScreen{castDevice=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

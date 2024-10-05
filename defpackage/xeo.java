package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xeo {
    public static final xeo a = b("", null, false);
    public final xfu b;
    public final xck c;

    public xeo() {
    }

    public xeo(xfu xfuVar, xck xckVar) {
        this.b = xfuVar;
        this.c = xckVar;
    }

    public static xeo a(String str, PlayerResponseModel playerResponseModel) {
        return new xeo(c(str, playerResponseModel, false), xck.a());
    }

    public static xeo b(String str, PlayerResponseModel playerResponseModel, boolean z) {
        return new xeo(c(str, playerResponseModel, z), xck.a());
    }

    public static xfu c(String str, PlayerResponseModel playerResponseModel, boolean z) {
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        boolean z2 = false;
        boolean z3 = playerResponseModel != null && playerResponseModel.C();
        if (playerResponseModel != null && playerResponseModel.B()) {
            z2 = true;
        }
        return new xfu(true != TextUtils.isEmpty(str) ? str : "", z3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xeo) {
            xeo xeoVar = (xeo) obj;
            if (this.b.equals(xeoVar.b) && this.c.equals(xeoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("ExternalContextModel{organicPlaybackContext=");
        sb.append(valueOf);
        sb.append(", adVideoPlaybackContext=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

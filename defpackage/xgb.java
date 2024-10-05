package defpackage;

import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgb {
    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint a;
    public final anhy b;
    public final xga c;
    public ViewGroup d;
    public boolean e;

    public xgb(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        this.a = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        final xga xgaVar = new xga();
        this.c = xgaVar;
        this.b = aci.c(new aeu() { // from class: xfz
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                xga.this.a = aesVar;
                return "ReelsObjectBinder.";
            }
        });
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xgb) {
            return Objects.equals(this.a, ((xgb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        String str = this.a.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("ReelAdMetadata[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}

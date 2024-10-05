package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxn {
    public final BrowseResponseModel a;
    private final apxf b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public hxn() {
    }

    public hxn(apxf apxfVar, BrowseResponseModel browseResponseModel, boolean z, boolean z2, boolean z3) {
        this.b = apxfVar;
        this.a = browseResponseModel;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static iuy a() {
        return new iuy();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxn) {
            hxn hxnVar = (hxn) obj;
            if (this.b.equals(hxnVar.b) && this.a.equals(hxnVar.a) && this.c == hxnVar.c && this.d == hxnVar.d && this.e == hxnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 130 + String.valueOf(valueOf2).length());
        sb.append("BrowseResponseWrapper{endpoint=");
        sb.append(valueOf);
        sb.append(", browseResponseModel=");
        sb.append(valueOf2);
        sb.append(", isLoggingEnabled=");
        sb.append(z);
        sb.append(", isNewResponseNeeded=");
        sb.append(z2);
        sb.append(", isLoadingResponse=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}

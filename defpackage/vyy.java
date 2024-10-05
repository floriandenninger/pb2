package defpackage;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyy {
    public final Context a;
    public final String b;
    public final bbr c;
    public final RectF d;
    public final hfu e;
    public final hft f;
    public final hfu g;

    public vyy() {
    }

    public vyy(Context context, String str, bbr bbrVar, RectF rectF, hfu hfuVar, hfu hfuVar2, hft hftVar, byte[] bArr) {
        this.a = context;
        this.b = str;
        this.c = bbrVar;
        this.d = rectF;
        this.e = hfuVar;
        this.g = hfuVar2;
        this.f = hftVar;
    }

    public final boolean equals(Object obj) {
        RectF rectF;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyy) {
            vyy vyyVar = (vyy) obj;
            if (this.a.equals(vyyVar.a) && this.b.equals(vyyVar.b) && this.c.equals(vyyVar.c) && ((rectF = this.d) != null ? rectF.equals(vyyVar.d) : vyyVar.d == null) && this.e.equals(vyyVar.e) && this.g.equals(vyyVar.g)) {
                hft hftVar = this.f;
                hft hftVar2 = vyyVar.f;
                if (hftVar != null ? hftVar.equals(hftVar2) : hftVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        RectF rectF = this.d;
        int hashCode2 = (((((hashCode ^ (rectF == null ? 0 : rectF.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        hft hftVar = this.f;
        return hashCode2 ^ (hftVar != null ? hftVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 116 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Factory{context=");
        sb.append(valueOf);
        sb.append(", outputPath=");
        sb.append(str);
        sb.append(", mediaSource=");
        sb.append(valueOf2);
        sb.append(", cropRect=");
        sb.append(valueOf3);
        sb.append(", successListener=");
        sb.append(valueOf4);
        sb.append(", errorListener=");
        sb.append(valueOf5);
        sb.append(", encodingProgressListener=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vff {
    public final Uri a;
    public final aooy b;
    public final vep c;
    public final amru d;
    public final vgn e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vff() {
    }

    public vff(Uri uri, aooy aooyVar, vep vepVar, amru amruVar, vgn vgnVar, boolean z, boolean z2, boolean z3) {
        this.a = uri;
        this.b = aooyVar;
        this.c = vepVar;
        this.d = amruVar;
        this.e = vgnVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static vfe a() {
        vfe vfeVar = new vfe();
        vfeVar.h(vge.a);
        vfeVar.d(vhc.a);
        vfeVar.a = false;
        vfeVar.c();
        vfeVar.g(true);
        return vfeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vff) {
            vff vffVar = (vff) obj;
            if (this.a.equals(vffVar.a) && this.b.equals(vffVar.b) && this.c.equals(vffVar.c) && amkq.aV(this.d, vffVar.d) && this.e.equals(vffVar.e) && this.f == vffVar.f && this.g == vffVar.g && this.h == vffVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(valueOf);
        sb.append(", schema=");
        sb.append(valueOf2);
        sb.append(", handler=");
        sb.append(valueOf3);
        sb.append(", migrations=");
        sb.append(valueOf4);
        sb.append(", variantConfig=");
        sb.append(valueOf5);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", updateSequencingBugFix=");
        sb.append(z2);
        sb.append(", enableTracing=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}

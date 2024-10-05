package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfw extends adgb {
    public adft a;
    public Optional b = Optional.empty();
    public String c;
    public final adgg d;
    public final String e;
    public final ScreenId f;
    public final adfs g;
    public final adgn h;
    public final adgn i;

    public adfw(adgg adggVar, adgn adgnVar, String str, ScreenId screenId, adfs adfsVar, adgn adgnVar2) {
        this.d = adggVar;
        this.h = adgnVar;
        this.e = str;
        this.f = screenId;
        this.g = adfsVar;
        this.i = adgnVar2;
    }

    public static adfv f() {
        return new adfv();
    }

    @Override // defpackage.adgb
    public final ScreenId b() {
        return this.f;
    }

    @Override // defpackage.adgb
    public final String c() {
        return this.e;
    }

    @Override // defpackage.adgb
    public final String d() {
        return "cloudPairedDevice";
    }

    @Override // defpackage.adgb
    public final int e() {
        return 4;
    }

    public final boolean equals(Object obj) {
        adgn adgnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfw) {
            adfw adfwVar = (adfw) obj;
            if (this.d.equals(adfwVar.d) && ((adgnVar = this.h) != null ? adgnVar.equals(adfwVar.h) : adfwVar.h == null) && this.e.equals(adfwVar.e) && this.f.equals(adfwVar.f) && this.g.equals(adfwVar.g)) {
                adgn adgnVar2 = this.i;
                adgn adgnVar3 = adfwVar.i;
                if (adgnVar2 != null ? adgnVar2.equals(adgnVar3) : adgnVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final adfv g() {
        adfv adfvVar = new adfv(this);
        adfvVar.a = this.a;
        if (this.b.isPresent()) {
            adfvVar.d((adgm) this.b.get());
        }
        return adfvVar;
    }

    @Override // defpackage.adgb
    public final String h() {
        return this.g.c;
    }

    public final boolean i() {
        return this.a != null;
    }

    @Override // defpackage.adgb
    public final boolean j(adgb adgbVar) {
        if (adgbVar instanceof adfw) {
            return this.g.equals(((adfw) adgbVar).g);
        }
        return false;
    }

    @Override // defpackage.adgb
    public final Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putString("screen", this.g.c);
        bundle.putInt("mdx_session_type", 3);
        return bundle;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.h);
        String str = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 90 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("MdxCloudScreen{pairingInfo=");
        sb.append(valueOf);
        sb.append(", pairingCode=");
        sb.append(valueOf2);
        sb.append(", name=");
        sb.append(str);
        sb.append(", screenId=");
        sb.append(valueOf3);
        sb.append(", loungeDeviceId=");
        sb.append(valueOf4);
        sb.append(", clientName=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public adfw() {
    }

    public final int hashCode() {
        int i = (this.d.b ^ 1000003) * 1000003;
        adgn adgnVar = this.h;
        int hashCode = (((((((i ^ (adgnVar == null ? 0 : adgnVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        adgn adgnVar2 = this.i;
        return hashCode ^ (adgnVar2 != null ? adgnVar2.hashCode() : 0);
    }
}

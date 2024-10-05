package defpackage;

import com.google.cardboard.sdk.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfc {
    public final String a;
    public final aooy b;
    public final amfa c;
    public final amru d;
    public final vep e;
    public final boolean f;
    public final anib g;

    public amfc() {
    }

    public amfc(String str, aooy aooyVar, amfa amfaVar, amru amruVar, vep vepVar, boolean z, anib anibVar) {
        this.a = str;
        this.b = aooyVar;
        this.c = amfaVar;
        this.d = amruVar;
        this.e = vepVar;
        this.f = z;
        this.g = anibVar;
    }

    public static amfb a() {
        amfb amfbVar = new amfb();
        amfbVar.b = new amfa(null);
        amfbVar.d = vhc.a;
        amfbVar.e = false;
        return amfbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amfc) {
            amfc amfcVar = (amfc) obj;
            if (this.a.equals(amfcVar.a) && this.b.equals(amfcVar.b) && this.c.equals(amfcVar.c) && amkq.aV(this.d, amfcVar.d) && this.e.equals(amfcVar.e) && this.f == amfcVar.f) {
                anib anibVar = this.g;
                anib anibVar2 = amfcVar.g;
                if (anibVar != null ? anibVar.equals(anibVar2) : anibVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        anib anibVar = this.g;
        return (hashCode ^ (anibVar == null ? 0 : anibVar.hashCode())) * 1000003;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        boolean z = this.f;
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMinor + length2 + length3 + length4 + length5 + length6 + "null".length());
        sb.append("ProtoDataStoreConfig{name=");
        sb.append(str);
        sb.append(", schema=");
        sb.append(valueOf);
        sb.append(", storage=");
        sb.append(valueOf2);
        sb.append(", migrations=");
        sb.append(valueOf3);
        sb.append(", handler=");
        sb.append(valueOf4);
        sb.append(", updateSequencingBugFix=");
        sb.append(z);
        sb.append(", ioExecutor=");
        sb.append(valueOf5);
        sb.append(", lamsConfig=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uix {
    public final uiz a;
    public final uiz b;
    public final amru c;
    private final tyo d;

    public uix() {
    }

    public uix(uiz uizVar, uiz uizVar2, tyo tyoVar, amru amruVar, byte[] bArr) {
        this.a = uizVar;
        this.b = uizVar2;
        this.d = tyoVar;
        this.c = amruVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uix) {
            uix uixVar = (uix) obj;
            if (this.a.equals(uixVar.a) && this.b.equals(uixVar.b) && this.d.equals(uixVar.d)) {
                amru amruVar = this.c;
                amru amruVar2 = uixVar.c;
                if (amruVar != null ? amkq.aV(amruVar, amruVar2) : amruVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        amru amruVar = this.c;
        return hashCode ^ (amruVar == null ? 0 : amruVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ImageModelLoader{imageRetriever=");
        sb.append(valueOf);
        sb.append(", secondaryImageRetriever=");
        sb.append(valueOf2);
        sb.append(", defaultImageRetriever=");
        sb.append(valueOf3);
        sb.append(", postProcessors=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

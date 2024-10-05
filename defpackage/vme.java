package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vme extends apm {
    public final vmm a;
    public final vms b;
    public final vna c;
    public final vmq d;
    public final vmu e;
    public final vml f;
    private final ammv g;
    private final vnc h;
    private final vlu i;

    public vme(ammv ammvVar, vlu vluVar, vnc vncVar, vmm vmmVar, vms vmsVar, vna vnaVar, vmq vmqVar, vmu vmuVar, vml vmlVar, byte[] bArr, byte[] bArr2) {
        this();
        this.g = ammvVar;
        this.i = vluVar;
        this.h = vncVar;
        this.a = vmmVar;
        this.b = vmsVar;
        this.c = vnaVar;
        this.d = vmqVar;
        this.e = vmuVar;
        this.f = vmlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vme) {
            vme vmeVar = (vme) obj;
            if (this.g.equals(vmeVar.g) && this.i.equals(vmeVar.i) && this.h.equals(vmeVar.h) && this.a.equals(vmeVar.a) && this.b.equals(vmeVar.b) && this.c.equals(vmeVar.c) && this.d.equals(vmeVar.d) && this.e.equals(vmeVar.e) && this.f.equals(vmeVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.i.hashCode() ^ 2097800333) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.i);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.a);
        String valueOf5 = String.valueOf(this.b);
        String valueOf6 = String.valueOf(this.c);
        String valueOf7 = String.valueOf(this.d);
        String valueOf8 = String.valueOf(this.e);
        String valueOf9 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 241 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("ModelProvider{artCollectionsRepository=");
        sb.append(valueOf);
        sb.append(", profileStateRepository=");
        sb.append(valueOf2);
        sb.append(", mdiPhotoRepository=");
        sb.append(valueOf3);
        sb.append(", clusterPhotosRepository=");
        sb.append(valueOf4);
        sb.append(", meClusterPhotosRepository=");
        sb.append(valueOf5);
        sb.append(", suggestedPhotosRepository=");
        sb.append(valueOf6);
        sb.append(", clustersRepository=");
        sb.append(valueOf7);
        sb.append(", pastProfilePhotosRepository=");
        sb.append(valueOf8);
        sb.append(", devicePhotosFetcher=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }

    public vme() {
    }
}

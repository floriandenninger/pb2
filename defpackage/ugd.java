package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugd {
    public final ued a;
    public final ufh b;
    public final Class c;
    public final boolean d;
    public final uje e;
    public final tyo f;

    public ugd() {
    }

    public ugd(ued uedVar, tyo tyoVar, ufh ufhVar, Class cls, boolean z, uje ujeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = uedVar;
        this.f = tyoVar;
        this.b = ufhVar;
        this.c = cls;
        this.d = z;
        this.e = ujeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugd) {
            ugd ugdVar = (ugd) obj;
            if (this.a.equals(ugdVar.a) && this.f.equals(ugdVar.f) && this.b.equals(ugdVar.b) && this.c.equals(ugdVar.c) && this.d == ugdVar.d && this.e.equals(ugdVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 132 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AccountManagementSpec{avatarImageLoader=");
        sb.append(valueOf);
        sb.append(", accountConverter=");
        sb.append(valueOf2);
        sb.append(", accountsModel=");
        sb.append(valueOf3);
        sb.append(", accountClass=");
        sb.append(valueOf4);
        sb.append(", allowRings=");
        sb.append(z);
        sb.append(", oneGoogleEventLogger=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}

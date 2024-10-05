package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctf implements cqi {
    private static final ddj b = new ddj(50);
    private final ctk c;
    private final cqi d;
    private final cqi e;
    private final int f;
    private final int g;
    private final Class h;
    private final cqn i;
    private final cqr j;

    public ctf(ctk ctkVar, cqi cqiVar, cqi cqiVar2, int i, int i2, cqr cqrVar, Class cls, cqn cqnVar) {
        this.c = ctkVar;
        this.d = cqiVar;
        this.e = cqiVar2;
        this.f = i;
        this.g = i2;
        this.j = cqrVar;
        this.h = cls;
        this.i = cqnVar;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        cqr cqrVar = this.j;
        if (cqrVar != null) {
            cqrVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        ddj ddjVar = b;
        byte[] bArr2 = (byte[]) ddjVar.f(this.h);
        if (bArr2 == null) {
            bArr2 = this.h.getName().getBytes(a);
            ddjVar.g(this.h, bArr2);
        }
        messageDigest.update(bArr2);
        this.c.c(bArr);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof ctf) {
            ctf ctfVar = (ctf) obj;
            if (this.g == ctfVar.g && this.f == ctfVar.f && ddn.m(this.j, ctfVar.j) && this.h.equals(ctfVar.h) && this.d.equals(ctfVar.d) && this.e.equals(ctfVar.e) && this.i.equals(ctfVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        cqr cqrVar = this.j;
        if (cqrVar != null) {
            hashCode = (hashCode * 31) + cqrVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        int i2 = this.g;
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.j);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(valueOf);
        sb.append(", signature=");
        sb.append(valueOf2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", decodedResourceClass=");
        sb.append(valueOf3);
        sb.append(", transformation='");
        sb.append(valueOf4);
        sb.append("', options=");
        sb.append(valueOf5);
        sb.append('}');
        return sb.toString();
    }
}

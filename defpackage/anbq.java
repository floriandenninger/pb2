package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbq extends anaf {
    final Charset a;
    final /* synthetic */ anaf b;

    public anbq(anaf anafVar, Charset charset, byte[] bArr, byte[] bArr2) {
        this.b = anafVar;
        charset.getClass();
        this.a = charset;
    }

    @Override // defpackage.anaf
    public final String g() {
        return new String(this.b.h(), this.a);
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(".asCharSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}

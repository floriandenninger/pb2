package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aomd extends aomc {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public aomd(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.aomf
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.aomf
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.aomf
    public int d() {
        return this.a.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.aomf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aomf) || d() != ((aomf) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (obj instanceof aomd) {
            aomd aomdVar = (aomd) obj;
            int i = this.c;
            int i2 = aomdVar.c;
            if (i == 0 || i2 == 0 || i == i2) {
                return g(aomdVar, 0, d());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // defpackage.aomc
    public final boolean g(aomf aomfVar, int i, int i2) {
        if (i2 > aomfVar.d()) {
            int d = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > aomfVar.d()) {
            int d2 = aomfVar.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (aomfVar instanceof aomd) {
            aomd aomdVar = (aomd) aomfVar;
            byte[] bArr = this.a;
            byte[] bArr2 = aomdVar.a;
            int c = c() + i2;
            int c2 = c();
            int c3 = aomdVar.c() + i;
            while (c2 < c) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        }
        return aomfVar.k(i, i3).equals(k(0, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final int i(int i, int i2, int i3) {
        return aonz.d(i, this.a, c() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final int j(int i, int i2, int i3) {
        int c = c() + i2;
        byte[] bArr = this.a;
        amkq amkqVar = aoqm.a;
        return amkq.cq(i, bArr, c, i3 + c);
    }

    @Override // defpackage.aomf
    public final aomf k(int i, int i2) {
        int r = r(i, i2, d());
        return r == 0 ? aomf.b : new aoma(this.a, c() + i, r);
    }

    @Override // defpackage.aomf
    public final aomk l() {
        return aomk.Q(this.a, c(), d());
    }

    @Override // defpackage.aomf
    public final InputStream m() {
        return new ByteArrayInputStream(this.a, c(), d());
    }

    @Override // defpackage.aomf
    protected final String n(Charset charset) {
        return new String(this.a, c(), d(), charset);
    }

    @Override // defpackage.aomf
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.a, c(), d()).asReadOnlyBuffer();
    }

    @Override // defpackage.aomf
    public final void p(aolx aolxVar) {
        aolxVar.a(this.a, c(), d());
    }

    @Override // defpackage.aomf
    public final boolean q() {
        int c = c();
        return aoqm.h(this.a, c, d() + c);
    }
}

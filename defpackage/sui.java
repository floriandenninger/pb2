package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sui {
    private static final sui b = new sui(syc.a);
    public final byte[] a;

    public sui(byte[] bArr) {
        this.a = bArr;
    }

    public static sui a(syv syvVar) {
        try {
            aomk N = aomk.N(syvVar.e());
            if (N.E()) {
                return b;
            }
            N.n();
            return new sui(N.H());
        } catch (IOException e) {
            throw new syf("Error reading extension from model", e);
        }
    }

    public final syv b(int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aomp aj = aomp.aj(byteArrayOutputStream);
            aj.m(i, this.a);
            aj.i();
            return syv.b(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new syf("Error adding extension to model", e);
        }
    }
}

package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aymf {
    public static final aymb a = new aymd(new byte[0], 0, 0);

    public static aymb a(ByteBuffer byteBuffer) {
        return new ayme(byteBuffer);
    }

    public static String b(aymb aymbVar, Charset charset) {
        charset.getClass();
        int f = aymbVar.f();
        byte[] bArr = new byte[f];
        aymbVar.k(bArr, 0, f);
        return new String(bArr, charset);
    }

    public static InputStream c(aymb aymbVar) {
        return new aymc(aymbVar);
    }
}

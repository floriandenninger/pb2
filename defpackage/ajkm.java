package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkm implements cqp {
    private final ctk a;

    public ajkm(ctk ctkVar) {
        this.a = ctkVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = (byte[]) this.a.a(65536, byte[].class);
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                ((ctt) this.a).c(bArr);
                return new czc(byteArrayOutputStream.toByteArray());
            }
        }
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return true;
    }
}

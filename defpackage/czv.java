package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czv implements cqp {
    private final List a;
    private final cqp b;
    private final ctk c;

    public czv(List list, cqp cqpVar, ctk ctkVar) {
        this.a = list;
        this.b = cqpVar;
        this.c = ctkVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, cqnVar);
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return !((Boolean) cqnVar.b(czu.b)).booleanValue() && gm.z(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}

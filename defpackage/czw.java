package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czw implements czz {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.czz
    public final ctd a(ctd ctdVar, cqn cqnVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) ctdVar.c()).compress(this.a, 100, byteArrayOutputStream);
        ctdVar.e();
        return new czc(byteArrayOutputStream.toByteArray());
    }
}

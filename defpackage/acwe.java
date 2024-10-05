package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acwe extends acwc {
    private final acvu c;

    public acwe(acvu acvuVar) {
        this.c = acvuVar;
    }

    @Override // defpackage.acwc, defpackage.adtu
    public final void i(ysq ysqVar) {
        super.i(ysqVar);
        yso ysoVar = ysqVar.d;
        if (ysoVar == null) {
            zga.c(acwg.a, "Hanging get's response body is null");
            return;
        }
        try {
            InputStream b = ysoVar.b();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    int read = b.read(bArr);
                    if (read > 0) {
                        try {
                            this.c.b(new String(bArr, 0, read, "UTF-8").toCharArray());
                        } catch (UnsupportedEncodingException unused) {
                            throw new IllegalStateException("This application needs UTF-8 support in order to run");
                        }
                    } else {
                        String str = acwg.a;
                        return;
                    }
                } catch (IOException e) {
                    this.b = e;
                    return;
                }
            }
        } catch (IOException e2) {
            this.b = e2;
        }
    }
}

package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agra implements afvq {
    private final zjl a;
    private final ajun b;

    public agra(zjl zjlVar) {
        zjlVar.getClass();
        this.a = zjlVar;
        this.b = ahbx.w();
    }

    private static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.afvq
    public final /* bridge */ /* synthetic */ void c(Object obj, ykl yklVar) {
        BufferedInputStream bufferedInputStream;
        Exception e;
        aism aismVar = (aism) obj;
        yjk.e();
        aismVar.getClass();
        String e2 = aismVar.a.e();
        e2.getClass();
        File file = new File(e2);
        if (file.exists()) {
            BufferedInputStream bufferedInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 4096);
                try {
                    try {
                        yklVar.b(aismVar, (aiua) ((afts) this.a.b(bufferedInputStream, this.b)).a());
                        a(bufferedInputStream);
                    } catch (Exception e3) {
                        e = e3;
                        yklVar.a(aismVar, e);
                        a(bufferedInputStream);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    a(bufferedInputStream2);
                    throw th;
                }
            } catch (Exception e4) {
                bufferedInputStream = null;
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                a(bufferedInputStream2);
                throw th;
            }
        } else {
            yklVar.a(aismVar, new IOException());
        }
    }
}

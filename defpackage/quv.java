package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class quv implements quu {
    private final Context a;

    public quv(Context context) {
        this.a = context;
    }

    @Override // defpackage.quu
    public final boolean a(File file) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "com.google.ccc.abuse.droidguard";
        try {
            X509Certificate[][] i = acg.i(file.getAbsolutePath());
            Signature[] signatureArr = new Signature[i.length];
            for (int i2 = 0; i2 < i.length; i2++) {
                signatureArr[i2] = new Signature(i[i2][0].getEncoded());
            }
            packageInfo.signatures = signatureArr;
            return qnn.b(this.a).e(packageInfo).b;
        } catch (cmx e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}

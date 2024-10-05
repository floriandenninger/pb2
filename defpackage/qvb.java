package defpackage;

import android.util.Log;
import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qvb {
    public static final ajun a = new ajun((byte[]) null, (byte[]) null, (char[]) null);

    public static final boolean a(File file, quu quuVar) {
        try {
            return quuVar.a(file);
        } catch (GeneralSecurityException e) {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 37);
            sb.append("APK at ");
            sb.append(absolutePath);
            sb.append(" failed signature verification");
            Log.e("DG", sb.toString(), e);
            return false;
        }
    }
}

package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ztw extends AsyncTask {
    final /* synthetic */ byte[] a;
    final /* synthetic */ ztx b;

    public ztw(ztx ztxVar, byte[] bArr) {
        this.b = ztxVar;
        this.a = bArr;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        synchronized (this.b.c.d) {
            ztx ztxVar = this.b;
            final ztz ztzVar = ztxVar.c;
            final String str = ztxVar.a;
            final String str2 = ztxVar.b;
            byte[] bArr = this.a;
            yjk.e();
            ztzVar.g();
            if (ztzVar.g) {
                zuf zufVar = ztzVar.h;
                if (zufVar != null) {
                    zufVar.a(ztz.c(str2), bArr, new zue() { // from class: ztu
                        @Override // defpackage.zue
                        public final void a(boolean z) {
                            ztz ztzVar2 = ztz.this;
                            String str3 = str;
                            String str4 = str2;
                            if (!z) {
                                zga.b("Error writing data to disk cache.");
                                return;
                            }
                            synchronized (ztzVar2.d) {
                                if (!ztzVar2.e.contains(str3)) {
                                    ztzVar2.h(str4, str3);
                                }
                            }
                        }
                    });
                } else {
                    zga.b("Error save downloaded asserts, cache wrapper is null.");
                }
            } else {
                try {
                    File file = new File(ztzVar.a, str);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    ztzVar.h(str2, str);
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Asset saved to file: ".concat(valueOf);
                    }
                } catch (IOException | SecurityException e) {
                    String valueOf2 = String.valueOf(str);
                    zga.d(valueOf2.length() != 0 ? "Error writing asset to file: ".concat(valueOf2) : new String("Error writing asset to file: "), e);
                }
            }
        }
        return null;
    }
}

package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsr implements vcv {
    private final Uri a;

    public tsr(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.vcv
    public final /* bridge */ /* synthetic */ Object a(vcu vcuVar) {
        vcw vcwVar = vcuVar.a;
        try {
            veg b = veg.b();
            b.a = true;
            ZipInputStream zipInputStream = new ZipInputStream(b.a(vcuVar));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (name.contains("..")) {
                            for (File file = new File(name); file != null; file = file.getParentFile()) {
                                if (file.getName().equals("..")) {
                                    String valueOf = String.valueOf(name);
                                    throw new ZipException(valueOf.length() != 0 ? "Illegal name: ".concat(valueOf) : new String("Illegal name: "));
                                }
                            }
                        }
                        Uri build = this.a.buildUpon().appendPath(name).build();
                        if (nextEntry.isDirectory()) {
                            vcwVar.d(build);
                        } else {
                            OutputStream outputStream = (OutputStream) vcwVar.c(build, veh.b());
                            try {
                                anbt.g(zipInputStream, outputStream);
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } else {
                        zipInputStream.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            vcwVar.j(this.a);
            throw e;
        }
    }
}

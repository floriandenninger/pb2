package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zom {
    public File a;
    private final long b;
    private final shf c;

    public zom(Context context, int i, String str, long j, shf shfVar) {
        File externalFilesDir = i != 1 ? context.getExternalFilesDir(null) : context.getFilesDir();
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir, str);
            try {
                this.a = (file.exists() || file.mkdirs()) ? file : null;
            } catch (SecurityException e) {
                zga.d("Error creating cache dir", e);
            }
        }
        this.b = TimeUnit.SECONDS.toMillis(j);
        this.c = shfVar;
    }

    public static void c(File file, List list) {
        if (file == null) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        c(file2, list);
                    } else {
                        list.add(file2);
                    }
                }
            }
        } catch (SecurityException e) {
            zga.d("Exception in listing directory files", e);
        }
    }

    public final void a(Set set) {
        yjk.e();
        if (this.a == null) {
            return;
        }
        long c = this.c.c();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                File file = new File(this.a, (String) it.next());
                try {
                    if (file.exists() && !file.setLastModified(c)) {
                        String valueOf = String.valueOf(file.getPath());
                        zga.b(valueOf.length() != 0 ? "Unable to update timestamp for ".concat(valueOf) : new String("Unable to update timestamp for "));
                    }
                } catch (SecurityException e) {
                    zga.d("Exception in modifying file's last modified timestamp", e);
                }
            }
        }
        File file2 = this.a;
        ArrayList<File> arrayList = new ArrayList();
        c(file2, arrayList);
        for (File file3 : arrayList) {
            try {
                if (c - file3.lastModified() > this.b) {
                    file3.delete();
                }
            } catch (SecurityException e2) {
                zga.d("Exception in examining/deleting existing file", e2);
            }
        }
    }

    public final boolean b(String str, byte[] bArr) {
        yjk.e();
        File file = this.a;
        if (file == null) {
            return false;
        }
        try {
            File file2 = new File(file, str);
            File parentFile = file2.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (IOException | SecurityException e) {
            zga.d("Error saving file", e);
            return false;
        }
    }
}

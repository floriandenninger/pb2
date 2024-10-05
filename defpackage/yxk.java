package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxk implements yxn {
    protected final Context a;
    private final StorageManager c;
    private final Object d = new Object();
    Map b = null;

    public yxk(Context context) {
        this.a = context;
        this.c = (StorageManager) context.getSystemService("storage");
    }

    private static boolean m(File file) {
        return Environment.getStorageState(file).equals("mounted");
    }

    private static final String n(String str, int i) {
        return "id:" + str + ";t:" + i;
    }

    private static final String o(File file) {
        String n = n(UUID.randomUUID().toString(), 2);
        anby a = anby.a();
        try {
            try {
                FileWriter fileWriter = new FileWriter(file);
                a.c(fileWriter);
                fileWriter.write(n);
                try {
                    a.close();
                } catch (Exception unused) {
                }
                return n;
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e) {
            zga.d("Error writing sdcard id", e);
            try {
                a.close();
                return null;
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    @Override // defpackage.yxn
    public final long a() {
        if (!j()) {
            return 0L;
        }
        StatFs statFs = new StatFs(c().getAbsolutePath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // defpackage.yxn
    public final File b(String str) {
        for (File file : f()) {
            if (e(file).equals(str)) {
                return file;
            }
        }
        return null;
    }

    @Override // defpackage.yxn
    public final File c() {
        List f = f();
        if (f.isEmpty()) {
            return null;
        }
        return (File) f.get(0);
    }

    @Override // defpackage.yxn
    public final String d() {
        return n("0000-0000", 1);
    }

    @Override // defpackage.yxn
    public final String e(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public final List f() {
        if (l()) {
            try {
                ArrayList arrayList = new ArrayList();
                File[] externalFilesDirs = this.a.getExternalFilesDirs(null);
                for (int i = 1; i < externalFilesDirs.length; i++) {
                    File file = externalFilesDirs[i];
                    if (file != null) {
                        arrayList.add(file);
                    }
                }
                return amru.o(arrayList);
            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
                return amru.q();
            }
        }
        return amru.q();
    }

    @Override // defpackage.yxn
    public final Map g() {
        BufferedReader bufferedReader;
        synchronized (this.d) {
            Map map = this.b;
            if (map != null) {
                return amrz.j(map);
            }
            this.b = new HashMap();
            List<File> f = f();
            Map h = h();
            for (File file : f) {
                if (Boolean.TRUE.equals(h.get(e(file)))) {
                    File file2 = new File(file, "sdcard");
                    StringBuilder sb = new StringBuilder();
                    anby a = anby.a();
                    try {
                        try {
                            bufferedReader = new BufferedReader(new FileReader(file2));
                            a.c(bufferedReader);
                        } catch (Throwable th) {
                            try {
                                a.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused2) {
                    } catch (IOException e) {
                        zga.d("Error getting sdcard id from sdcard file", e);
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        }
                        try {
                            break;
                        } catch (Exception unused3) {
                            String sb2 = sb.toString();
                            if (TextUtils.isEmpty(sb2)) {
                                if (Build.VERSION.SDK_INT < 24) {
                                    sb2 = o(file2);
                                } else {
                                    StorageVolume storageVolume = this.c.getStorageVolume(file2);
                                    if (storageVolume != null) {
                                        String uuid = storageVolume.getUuid();
                                        if (!TextUtils.isEmpty(uuid)) {
                                            sb2 = n(uuid, 3);
                                        }
                                    }
                                    if (TextUtils.isEmpty(sb2)) {
                                        sb2 = o(file2);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(sb2)) {
                                this.b.put(e(file), sb2);
                            }
                        }
                    }
                    a.close();
                }
            }
            return amrz.j(this.b);
        }
    }

    @Override // defpackage.yxn
    public final Map h() {
        HashMap hashMap = new HashMap();
        for (File file : f()) {
            if (file != null) {
                hashMap.put(e(file), Boolean.valueOf(m(file)));
            }
        }
        return amrz.j(hashMap);
    }

    @Override // defpackage.yxn
    public final void i() {
        synchronized (this.d) {
            this.b = null;
        }
    }

    @Override // defpackage.yxn
    public final boolean j() {
        File c = c();
        return c != null && m(c);
    }

    @Override // defpackage.yxn
    public final boolean k(String str) {
        Boolean bool = (Boolean) h().get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.yxn
    public final boolean l() {
        return this.a.getExternalFilesDirs(null).length > 1;
    }
}

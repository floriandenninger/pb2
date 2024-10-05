package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import defpackage.ayeq;
import defpackage.baec;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    private static String[] a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        baec b = baec.b();
        try {
            File[] externalFilesDirs = ayeq.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            b.close();
            return a(arrayList);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getDownloadsDirectory() {
        baec a = baec.a();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
                String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
                a.close();
                return str;
            }
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            a.close();
            return path;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(ayeq.a)) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                arrayList.add(new File(((StorageManager) ayeq.a.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str)).getDirectory().getAbsolutePath(), Environment.DIRECTORY_DOWNLOADS));
            }
        }
        return a(arrayList);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = ayeq.a.getApplicationInfo();
        return ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}

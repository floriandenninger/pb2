package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ute {
    private static final amxj a = amxj.l("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageStats a(Context context) {
        UUID uuid;
        uqq.i();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            ((amxh) ((amxh) a.f()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", 30, "PackageStatsCaptureO.java")).q("StorageManager is not available");
            return null;
        }
        try {
            try {
                StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
                String packageName = context.getPackageName();
                PackageStats packageStats = new PackageStats(packageName);
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if (storageVolume.getState().equals("mounted")) {
                        String uuid2 = storageVolume.getUuid();
                        try {
                            ((amxh) ((amxh) a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 65, "PackageStatsCaptureO.java")).s("UUID for %s", uuid2);
                            uuid = uuid2 == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid2);
                        } catch (IllegalArgumentException e) {
                            ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getUuid", 70, "PackageStatsCaptureO.java")).s("Invalid UUID format: '%s'", uuid2);
                            uuid = null;
                        }
                        if (uuid != null) {
                            try {
                                StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage(uuid, packageName, Process.myUserHandle());
                                if (StorageManager.UUID_DEFAULT.equals(uuid)) {
                                    packageStats.codeSize += queryStatsForPackage.getAppBytes();
                                    packageStats.dataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                                    packageStats.cacheSize += queryStatsForPackage.getCacheBytes();
                                } else {
                                    packageStats.externalCodeSize += queryStatsForPackage.getAppBytes();
                                    packageStats.externalDataSize += queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes();
                                    packageStats.externalCacheSize += queryStatsForPackage.getCacheBytes();
                                }
                            } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e2) {
                                ((amxh) ((amxh) ((amxh) a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '0', "PackageStatsCaptureO.java")).q("queryStatsForPackage() call failed");
                            }
                        }
                    }
                }
                return packageStats;
            } catch (Error e3) {
                e = e3;
                ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '7', "PackageStatsCaptureO.java")).q("StorageStatsManager is not available");
                return null;
            }
        } catch (RuntimeException e4) {
            e = e4;
            ((amxh) ((amxh) ((amxh) a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO", "getPackageStats", '7', "PackageStatsCaptureO.java")).q("StorageStatsManager is not available");
            return null;
        }
    }
}

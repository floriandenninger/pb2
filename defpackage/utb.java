package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utb {
    private static volatile ammv a;

    public static ammv a() {
        ammv ammvVar;
        ammv ammvVar2;
        ammv j;
        FileInputStream fileInputStream;
        int i;
        int i2;
        ammv ammvVar3 = a;
        if (ammvVar3 != null) {
            return ammvVar3;
        }
        long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        if (sysconf > 0) {
            ammvVar = ammv.j(Long.valueOf(sysconf));
        } else {
            ammvVar = amlr.a;
        }
        if (ammvVar.h()) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            try {
                try {
                    fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                } catch (IOException unused) {
                    amlr amlrVar = amlr.a;
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    ammvVar2 = amlrVar;
                }
                try {
                    int read = fileInputStream.read(bArr);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= read) {
                            i3 = 0;
                            break;
                        }
                        if (bArr[i3] == 40) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == 0 || (i = i3 + 16) >= read) {
                        ammvVar2 = amlr.a;
                    } else {
                        while (true) {
                            i2 = 1;
                            if (i <= i3) {
                                break;
                            }
                            if (bArr[i] == 41) {
                                i3 = i;
                                z = true;
                                break;
                            }
                            i--;
                        }
                        if (z) {
                            long j2 = 0;
                            while (true) {
                                if (i3 >= read) {
                                    break;
                                }
                                byte b = bArr[i3];
                                if (b == 32) {
                                    int i4 = i2 + 1;
                                    if (i2 != 21) {
                                        i2 = i4;
                                        i3++;
                                    } else if (j2 > 0) {
                                        ammvVar2 = ammv.j(Long.valueOf(j2));
                                    }
                                } else {
                                    if (i2 == 21) {
                                        if (j2 > 922337203685477580L) {
                                            break;
                                        }
                                        long j3 = j2 * 10;
                                        if (b < 48 || b > 57) {
                                            break;
                                        }
                                        j2 = j3 + (b - 48);
                                    } else {
                                        continue;
                                    }
                                    i3++;
                                }
                            }
                            ammvVar2 = amlr.a;
                        } else {
                            ammvVar2 = amlr.a;
                        }
                    }
                    j = !ammvVar2.h() ? amlr.a : ammv.j(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) ammvVar2.c()).longValue()) / ((Long) ammvVar.c()).longValue()));
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            }
        } else {
            j = amlr.a;
        }
        a = j;
        return j;
    }
}

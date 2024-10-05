package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uqw {
    public static volatile int a;
    private static volatile int b;

    private uqw() {
    }

    public static int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return 0;
        }
        if (b == 0) {
            synchronized (uqw.class) {
                if (b == 0) {
                    b = Math.round(((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return b;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static final ammv c(Context context) {
        ammv ammvVar;
        ammv ammvVar2;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            Context a2 = slf.a(context);
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                StrictMode.allowThreadDiskWrites();
                try {
                    File file = new File(a2.getDir("phenotype_hermetic", 0), "overrides.txt");
                    ammvVar = file.exists() ? ammv.j(file) : amlr.a;
                } catch (RuntimeException e) {
                    Log.e("HermeticFileOverrides", "no data dir", e);
                    ammvVar = amlr.a;
                }
                if (ammvVar.h()) {
                    File file2 = (File) ammvVar.c();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                        try {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                } else {
                                    String e2 = e(split[0]);
                                    String decode = Uri.decode(e(split[1]));
                                    String str3 = (String) hashMap2.get(split[2]);
                                    if (str3 == null) {
                                        String e3 = e(split[2]);
                                        str3 = Uri.decode(e3);
                                        if (str3.length() < 1024 || str3 == e3) {
                                            hashMap2.put(e3, str3);
                                        }
                                    }
                                    if (!hashMap.containsKey(e2)) {
                                        hashMap.put(e2, new HashMap());
                                    }
                                    ((Map) hashMap.get(e2)).put(decode, str3);
                                }
                            }
                            String.valueOf(String.valueOf(file2)).length();
                            ajun ajunVar = new ajun(hashMap, (char[]) null);
                            bufferedReader.close();
                            ammvVar2 = ammv.j(ajunVar);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        throw new RuntimeException(e4);
                    }
                } else {
                    ammvVar2 = amlr.a;
                }
                return ammvVar2;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return amlr.a;
    }

    public static Object d(uva uvaVar) {
        try {
            return uvaVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return uvaVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    private static final String e(String str) {
        return new String(str);
    }
}

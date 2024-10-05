package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogj {
    private static final amxj a = amxj.l("com/google/mediapipe/framework/AssetCache");
    private static aogj b;
    private int c;
    private final aogk d;
    private final Context e;

    private aogj(Context context) {
        this.e = context;
        aogk aogkVar = new aogk(context);
        this.d = aogkVar;
        try {
            this.c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            ((amxh) ((amxh) a.e()).i("com/google/mediapipe/framework/AssetCache", "<init>", 178, "AssetCache.java")).r("Current app version code: %d", this.c);
            int i = this.c;
            SQLiteDatabase writableDatabase = aogkVar.getWritableDatabase();
            String[] strArr = {Integer.toString(i)};
            aogk.b(writableDatabase, "version != ?", strArr);
            writableDatabase.delete("AssetVersion", "version != ?", strArr);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't get app version code.", e);
        }
    }

    public static synchronized aogj a() {
        aogj aogjVar;
        synchronized (aogj.class) {
            aogjVar = b;
        }
        return aogjVar;
    }

    public static synchronized void c(Context context) {
        synchronized (aogj.class) {
            if (b == null) {
                b = new aogj(context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aogj.b(java.lang.String):java.lang.String");
    }

    public final synchronized void d() {
        String[] strArr;
        try {
            strArr = this.e.getAssets().list("kazoo");
        } catch (IOException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 96, "AssetCache.java")).s("Unable to get files in assets path: %s", "kazoo");
            strArr = null;
        }
        if (strArr == null || (strArr.length) == 0) {
            ((amxh) ((amxh) a.g()).i("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 99, "AssetCache.java")).q("No files to load");
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty("kazoo")) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
                sb.append("kazoo/");
                sb.append(str);
                str = sb.toString();
            }
            b(str);
        }
    }
}

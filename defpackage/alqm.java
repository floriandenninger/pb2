package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqm {
    private static final ammr c = new ammr("SplitInstallInfoProvider", (char[]) null);
    private final Context a;
    private final String b;

    public alqm(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    private final Bundle d() {
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.b, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            c.m("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        for (String str : b()) {
            if (!str.startsWith("config.") && !str.contains(".config.")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set b() {
        String string;
        HashSet hashSet = new HashSet();
        Bundle d = d();
        if (d != null && (string = d.getString("com.android.dynamic.apk.fused.modules")) != null && !string.isEmpty()) {
            Collections.addAll(hashSet, string.split(",", -1));
            hashSet.remove("");
            hashSet.remove("base");
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            c.m("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            Arrays.toString(strArr);
            Collections.addAll(hashSet, strArr);
        }
        alqj alqjVar = (alqj) alqk.a.get();
        if (alqjVar != null) {
            hashSet.addAll(alqjVar.a());
        }
        return hashSet;
    }

    public final amsj c() {
        Bundle d = d();
        if (d == null) {
            c.m("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = d.getInt("com.android.vending.splits");
        if (i == 0) {
            c.m("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            amsj w = alkd.w(this.a.getResources().getXml(i), new amsj((byte[]) null));
            if (w == null) {
                c.m("Can't parse languages metadata.", new Object[0]);
            }
            return w;
        } catch (Resources.NotFoundException unused) {
            c.m("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}

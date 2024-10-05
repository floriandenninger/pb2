package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvp {
    public static final pvp a = new pvp();

    protected pvp() {
    }

    public final AdRequestParcel a(Context context, pxq pxqVar) {
        String str;
        int i;
        int i2;
        String str2;
        Date date = pxqVar.a;
        long time = date != null ? date.getTime() : -1L;
        int i3 = pxqVar.c;
        Set set = pxqVar.d;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        pun punVar = pxt.a().a;
        pvy.c();
        String h = qbg.h(context);
        boolean z = pxqVar.i.contains(h) || new ArrayList(punVar.b).contains(h);
        Location location = pxqVar.e;
        Bundle bundle = pxqVar.f.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            pvy.c();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                i2 = i + 1;
                if (i2 >= stackTrace.length) {
                    str2 = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (qbg.b.equalsIgnoreCase(className) || qbg.c.equalsIgnoreCase(className) || qbg.d.equalsIgnoreCase(className) || qbg.e.equalsIgnoreCase(className) || qbg.f.equalsIgnoreCase(className) || qbg.g.equalsIgnoreCase(className))) ? 0 : i2;
            }
            str2 = stackTrace[i2].getClassName();
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    int i4 = 2;
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                            break;
                        }
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i4 = i5;
                    }
                    packageName = sb.toString();
                }
                if (str2 != null && !str2.contains(packageName)) {
                    str = str2;
                    boolean z2 = pxqVar.l;
                    pun punVar2 = pxt.a().a;
                    return new AdRequestParcel(8, time, bundle, i3, unmodifiableList, z, Math.max(pxqVar.h, -1), false, null, null, location, null, pxqVar.f, pxqVar.j, Collections.unmodifiableList(new ArrayList(pxqVar.k)), null, str, z2, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), bea.o), new ArrayList(pxqVar.b), 60000, null);
                }
            }
        }
        str = null;
        boolean z22 = pxqVar.l;
        pun punVar22 = pxt.a().a;
        return new AdRequestParcel(8, time, bundle, i3, unmodifiableList, z, Math.max(pxqVar.h, -1), false, null, null, location, null, pxqVar.f, pxqVar.j, Collections.unmodifiableList(new ArrayList(pxqVar.k)), null, str, z22, null, Math.max(-1, -1), (String) Collections.max(Arrays.asList(null, ""), bea.o), new ArrayList(pxqVar.b), 60000, null);
    }
}

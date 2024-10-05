package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akml {
    public final Drawable a;
    public final CharSequence b;
    public final byte[] c;
    public final apxf d;
    public String e;

    public akml(PackageManager packageManager, ResolveInfo resolveInfo, apxf apxfVar, byte[] bArr) {
        packageManager.getClass();
        resolveInfo.getClass();
        apxfVar.getClass();
        this.e = resolveInfo.activityInfo.name;
        this.a = resolveInfo.loadIcon(packageManager);
        this.b = resolveInfo.loadLabel(packageManager);
        this.c = bArr;
        String str = this.e;
        aong aongVar = (aong) apxf.a.createBuilder();
        aone createBuilder = apcn.a.createBuilder();
        if (resolveInfo.activityInfo.applicationInfo.packageName != null) {
            String str2 = resolveInfo.activityInfo.applicationInfo.packageName;
            createBuilder.copyOnWrite();
            apcn apcnVar = (apcn) createBuilder.instance;
            str2.getClass();
            apcnVar.b |= 1;
            apcnVar.c = str2;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            apcn apcnVar2 = (apcn) createBuilder.instance;
            apcnVar2.b |= 2;
            apcnVar2.d = str;
        }
        aongVar.e(AndroidApplicationEndpointOuterClass.androidAppEndpoint, (apcn) createBuilder.build());
        aongVar.mergeFrom((aonm) apxfVar);
        this.d = (apxf) aongVar.build();
    }

    public static String a(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(AndroidApplicationEndpointOuterClass.androidAppEndpoint)) {
            return null;
        }
        return ((apcn) apxfVar.pX(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).c;
    }
}

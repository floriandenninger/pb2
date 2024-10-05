package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.GoogleMapsNavigationEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtz implements aaha, ykj {
    private final Context a;
    private final aahd b;
    private final ykz c;

    public gtz(ykz ykzVar, aahd aahdVar, Context context) {
        this.c = ykzVar;
        aahdVar.getClass();
        this.b = aahdVar;
        this.a = context;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint)) {
            arcb arcbVar = (arcb) apxfVar.pX(GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint);
            Uri parse = (arcbVar.b & 1) != 0 ? Uri.parse(arcbVar.c) : null;
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setPackage("com.google.android.apps.maps");
            PackageManager packageManager = this.a.getPackageManager();
            if (parse == null || packageManager.resolveActivity(intent, 65536) == null) {
                if ((arcbVar.b & 2) != 0) {
                    aahd aahdVar = this.b;
                    apxf apxfVar2 = arcbVar.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.c(apxfVar2, map);
                    return;
                }
                return;
            }
            this.c.a(intent, 2100, this);
        }
    }
}

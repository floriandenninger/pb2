package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.protos.youtube.api.innertube.AppIsInstalledCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtx implements aaha {
    private final aahd a;
    private final Executor b;
    private final PackageManager c;

    public gtx(aahd aahdVar, Executor executor, Context context) {
        this.a = aahdVar;
        this.b = executor;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.c = packageManager;
    }

    public final void b(apfj apfjVar, Map map) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.c.getApplicationInfo(apfjVar.c, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || (apfjVar.e && !applicationInfo.enabled)) {
            if ((apfjVar.b & 16) != 0) {
                aahd aahdVar = this.a;
                apxf apxfVar = apfjVar.g;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, map);
            }
        } else if ((apfjVar.b & 8) != 0) {
            aahd aahdVar2 = this.a;
            apxf apxfVar2 = apfjVar.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, map);
        }
        if ((apfjVar.b & 32) != 0) {
            aahd aahdVar3 = this.a;
            apxf apxfVar3 = apfjVar.h;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar3.c(apxfVar3, map);
        }
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        if (apxfVar.pY(AppIsInstalledCommandOuterClass.appIsInstalledCommand)) {
            final apfj apfjVar = (apfj) apxfVar.pX(AppIsInstalledCommandOuterClass.appIsInstalledCommand);
            if (apfjVar.c.isEmpty()) {
                return;
            }
            if (apfjVar.d) {
                b(apfjVar, map);
            } else {
                this.b.execute(new Runnable() { // from class: gtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        gtx.this.b(apfjVar, map);
                    }
                });
            }
        }
    }
}

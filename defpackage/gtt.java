package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdsWebsiteDeepLinkCommandOuterClass;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtt implements aaha {
    private final wzq a;
    private final eul b;
    private final Activity c;
    private final ajcx d;
    private final LoggingUrlsPingController e;
    private final acqz f;

    public gtt(Activity activity, wzq wzqVar, eul eulVar, LoggingUrlsPingController loggingUrlsPingController, ajcx ajcxVar, acqz acqzVar) {
        this.c = activity;
        this.a = wzqVar;
        this.b = eulVar;
        this.d = ajcxVar;
        this.e = loggingUrlsPingController;
        this.f = acqzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        if (r6.enabled != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.apxf r5, android.app.Activity r6, defpackage.apbv r7, boolean r8) {
        /*
            r4 = this;
            int r0 = r5.b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lc9
            apbw r0 = r7.d
            if (r0 != 0) goto Lc
            apbw r0 = defpackage.apbw.a
        Lc:
            boolean r0 = r0.e
            if (r0 != 0) goto L1e
            apbw r0 = r7.d
            if (r0 != 0) goto L16
            apbw r0 = defpackage.apbw.a
        L16:
            boolean r0 = r0.d
            if (r0 == 0) goto L1b
            goto L1e
        L1b:
            r6 = 0
            goto Lb8
        L1e:
            ashf r0 = defpackage.ashf.a
            aone r0 = r0.createBuilder()
            apbw r2 = r7.d
            if (r2 != 0) goto L2a
            apbw r2 = defpackage.apbw.a
        L2a:
            boolean r2 = r2.e
            if (r2 == 0) goto L3c
            r0.copyOnWrite()
            aonm r2 = r0.instance
            ashf r2 = (defpackage.ashf) r2
            int r3 = r2.b
            r3 = r3 | r1
            r2.b = r3
            r2.c = r8
        L3c:
            apbw r8 = r7.d
            if (r8 != 0) goto L42
            apbw r8 = defpackage.apbw.a
        L42:
            boolean r8 = r8.d
            if (r8 == 0) goto L79
            apbw r8 = r7.d
            if (r8 != 0) goto L4c
            apbw r8 = defpackage.apbw.a
        L4c:
            int r8 = r8.b
            r8 = r8 & r1
            if (r8 == 0) goto L79
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r8 = 0
            apbw r7 = r7.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r7 != 0) goto L5c
            apbw r7 = defpackage.apbw.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
        L5c:
            java.lang.String r7 = r7.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L69
            if (r6 == 0) goto L69
            boolean r6 = r6.enabled
            if (r6 == 0) goto L69
            goto L6a
        L69:
            r1 = 0
        L6a:
            r0.copyOnWrite()
            aonm r6 = r0.instance
            ashf r6 = (defpackage.ashf) r6
            int r7 = r6.b
            r7 = r7 | 2
            r6.b = r7
            r6.d = r1
        L79:
            asht r6 = defpackage.asht.a
            aone r6 = r6.createBuilder()
            ashd r7 = defpackage.ashd.a
            aone r7 = r7.createBuilder()
            r7.copyOnWrite()
            aonm r8 = r7.instance
            ashd r8 = (defpackage.ashd) r8
            aonm r0 = r0.build()
            ashf r0 = (defpackage.ashf) r0
            r0.getClass()
            r8.d = r0
            r0 = 7
            r8.c = r0
            r6.copyOnWrite()
            aonm r8 = r6.instance
            asht r8 = (defpackage.asht) r8
            aonm r7 = r7.build()
            ashd r7 = (defpackage.ashd) r7
            r7.getClass()
            r8.t = r7
            int r7 = r8.c
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r8.c = r7
            aonm r6 = r6.build()
            asht r6 = (defpackage.asht) r6
        Lb8:
            acqz r7 = r4.f
            acra r7 = r7.mM()
            acqx r8 = new acqx
            aomf r5 = r5.c
            r8.<init>(r5)
            r5 = 3
            r7.I(r5, r8, r6)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtt.b(apxf, android.app.Activity, apbv, boolean):void");
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        wzq wzqVar = this.a;
        if (wzqVar != null) {
            wzqVar.c(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        apbv apbvVar = (apbv) apxfVar.pX(AdsWebsiteDeepLinkCommandOuterClass.adsWebsiteDeepLinkCommand);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
            eul eulVar = this.b;
            euj eujVar = euj.a;
            apxf[] apxfVarArr = new apxf[1];
            apxf apxfVar2 = apbvVar.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            apxfVarArr[0] = apxfVar2;
            eulVar.a(eujVar, Arrays.asList(apxfVarArr), hashMap);
        }
        Uri g = this.e.g(apbvVar.b, map);
        ajcx ajcxVar = this.d;
        if (ajcxVar == null || !ajcxVar.g(this.c, g)) {
            b(apxfVar, this.c, apbvVar, false);
            Intent intent = new Intent("android.intent.action.VIEW", g);
            if (this.c.getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                whu.K(this.c, R.string.error_link_cannot_be_opened, 0);
                return;
            }
            ajcq.q(this.c, intent);
            ykp.c(this.c, intent, g);
            this.c.startActivity(intent.setFlags(268435456));
            return;
        }
        b(apxfVar, this.c, apbvVar, true);
    }
}

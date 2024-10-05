package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffp implements aaha {
    private static final amsx a = amsx.v("com.android.chrome", "com.google.android.apps.chrome", "com.chrome.beta", "com.chrome.dev", "com.sec.android.app.sbrowser");
    private final wzq b;
    private final eul c;
    private final Activity d;
    private final ffo e;
    private final ajcx f;
    private final acqz g;
    private final Executor h;
    private final yzm i;
    private final axzf j;

    public ffp(Activity activity, wzq wzqVar, eul eulVar, ffo ffoVar, ajcx ajcxVar, acqz acqzVar, Executor executor, axzf axzfVar, yzm yzmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = activity;
        this.b = wzqVar;
        this.c = eulVar;
        ffoVar.getClass();
        this.e = ffoVar;
        this.f = ajcxVar;
        this.g = acqzVar;
        this.h = executor;
        this.j = axzfVar;
        this.i = yzmVar;
    }

    private static String c(String str) {
        try {
            int indexOf = str.indexOf("adurl=") + 6;
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            String decode = Uri.decode(str.substring(indexOf, indexOf2));
            String substring = decode.substring(decode.indexOf("S.browser_fallback_url=") + 23);
            String substring2 = substring.substring(0, substring.indexOf(59));
            String substring3 = str.substring(0, indexOf);
            String substring4 = str.substring(indexOf2);
            StringBuilder sb = new StringBuilder(String.valueOf(substring3).length() + String.valueOf(substring2).length() + String.valueOf(substring4).length());
            sb.append(substring3);
            sb.append(substring2);
            sb.append(substring4);
            return sb.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            return str;
        }
    }

    private final void d(apxf apxfVar, boolean z, boolean z2, String str) {
        if ((apxfVar.b & 1) == 0 || !apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
            return;
        }
        avun avunVar = ((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).f;
        if (avunVar == null) {
            avunVar = avun.a;
        }
        if (avunVar.b) {
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashd.a.createBuilder();
            aone createBuilder3 = asgx.a.createBuilder();
            createBuilder3.copyOnWrite();
            asgx asgxVar = (asgx) createBuilder3.instance;
            asgxVar.b |= 1;
            asgxVar.c = z;
            createBuilder3.copyOnWrite();
            asgx asgxVar2 = (asgx) createBuilder3.instance;
            asgxVar2.b |= 2;
            asgxVar2.d = z2;
            if (str == null) {
                str = "EXTERNAL";
            }
            createBuilder3.copyOnWrite();
            asgx asgxVar3 = (asgx) createBuilder3.instance;
            asgxVar3.b |= 4;
            asgxVar3.e = str;
            createBuilder2.copyOnWrite();
            ashd ashdVar = (ashd) createBuilder2.instance;
            asgx asgxVar4 = (asgx) createBuilder3.build();
            asgxVar4.getClass();
            ashdVar.d = asgxVar4;
            ashdVar.c = 9;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashd ashdVar2 = (ashd) createBuilder2.build();
            ashdVar2.getClass();
            ashtVar.t = ashdVar2;
            ashtVar.c |= 1024;
            asht ashtVar2 = (asht) createBuilder.build();
            acqz acqzVar = this.g;
            acqzVar.getClass();
            acqzVar.mM().w(new acqx(apxfVar.c), ashtVar2);
        }
    }

    private final void e(apxf apxfVar, Map map) {
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
            this.c.a(euj.a, ((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).e, hashMap);
        }
    }

    private final void f(Intent intent, Uri uri, apxf apxfVar, Map map) {
        ykp.c(this.d, intent, uri);
        d(apxfVar, false, false, null);
        e(apxfVar, map);
        this.d.startActivity(intent.setFlags(268435456));
    }

    private final boolean g(Uri uri, apxf apxfVar, Map map) {
        ajcx ajcxVar = this.f;
        if (ajcxVar == null || !ajcxVar.e(this.d, uri)) {
            return false;
        }
        d(apxfVar, true, false, this.f.d());
        e(apxfVar, map);
        return true;
    }

    public final void b(Intent intent, Uri uri, apxf apxfVar, Map map, boolean z) {
        if (z) {
            ajcx ajcxVar = this.f;
            ajcxVar.getClass();
            d(apxfVar, true, true, ajcxVar.d());
            e(apxfVar, map);
            return;
        }
        if (g(uri, apxfVar, map)) {
            return;
        }
        f(intent, uri, apxfVar, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        boolean z;
        ajcx ajcxVar;
        Boolean bool;
        wzq wzqVar = this.b;
        if (wzqVar != null) {
            wzqVar.c(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        Uri a2 = this.e.a(((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c, map);
        a2.getClass();
        String uri = a2.toString();
        if (uri.contains("ep://")) {
            uri = uri.replace("ep://", "");
            a2 = Uri.parse(uri);
            z = true;
        } else {
            z = false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a2);
        List<ResolveInfo> queryIntentActivities = this.d.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities.isEmpty()) {
            whu.K(this.d, R.string.error_link_cannot_be_opened, 0);
            e(apxfVar, map);
            return;
        }
        ajcq.q(this.d, intent);
        ajcx ajcxVar2 = this.f;
        String d = ajcxVar2 == null ? null : ajcxVar2.d();
        String str = queryIntentActivities.get(0).activityInfo != null ? queryIntentActivities.get(0).activityInfo.packageName : null;
        String uri2 = a2.toString();
        axzf axzfVar = this.j;
        if (axzfVar != null) {
            aqvj aqvjVar = axzfVar.a.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45354956L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45354956L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45354956L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue() && uri2.matches(".+adurl=intent.+S.browser_fallback_url.+") && ((d != null && !a.contains(d)) || (str != null && !a.contains(str)))) {
                a2 = Uri.parse(c(uri2));
            }
        }
        final Intent data = intent.setData(a2);
        if (data.getPackage() == null) {
            if (!data.toUri(0).isEmpty()) {
                Activity activity = this.d;
                if ((activity instanceof ml) && z) {
                    dd supportFragmentManager = ((ml) activity).getSupportFragmentManager();
                    gpo gpoVar = new gpo();
                    Bundle bundle = new Bundle();
                    bundle.putString("URL_KEY", uri);
                    bundle.putParcelable("navigation_endpoint", new ParcelableMessageLite(apxfVar));
                    gpoVar.af(bundle);
                    gpoVar.qh(supportFragmentManager, "WEB_VIEW_BOTTOM_SHEET_TAG");
                    yzm yzmVar = this.i;
                    if (yzmVar != null) {
                        yzmVar.b(false);
                        return;
                    }
                    return;
                }
            }
            if (this.f == null || !((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).g || (ajcxVar = this.f) == null || !ajcxVar.h()) {
                if (g(a2, apxfVar, map)) {
                    return;
                }
            } else {
                final Uri uri3 = a2;
                ynm.k(this.f.a(this.d, a2), this.h, new ynk() { // from class: ffm
                    @Override // defpackage.zfi
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        ffp.this.b(data, uri3, apxfVar, map, false);
                    }
                }, new ynl() { // from class: ffn
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        ffp.this.b(data, uri3, apxfVar, map, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
        }
        f(data, a2, apxfVar, map);
    }
}

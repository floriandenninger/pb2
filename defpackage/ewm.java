package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ewm implements aaha {
    private final wzq a;
    private final eul b;
    private final Activity c;
    private final wng d;
    private final gfz e;
    private final ykz f;
    private final axzg g;
    private final ajyw h;

    public ewm(ajyw ajywVar, wzq wzqVar, eul eulVar, Activity activity, wng wngVar, axzg axzgVar, ykz ykzVar, gfz gfzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.h = ajywVar;
        wzqVar.getClass();
        this.a = wzqVar;
        eulVar.getClass();
        this.b = eulVar;
        this.c = activity;
        wngVar.getClass();
        this.d = wngVar;
        axzgVar.getClass();
        this.g = axzgVar;
        this.f = ykzVar;
        this.e = gfzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.a.c(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apcm.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL);
        apfr apfrVar = (apfr) apxfVar.pX(AppStoreEndpointOuterClass.appStoreEndpoint);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
        this.b.a(euj.a, apfrVar.h, hashMap);
        this.e.g(5);
        Activity activity = this.c;
        String str = apfrVar.b;
        String str2 = apfrVar.c;
        String str3 = apfrVar.d;
        String str4 = apfrVar.e;
        boolean z = apfrVar.f;
        boolean k = this.d.k();
        this.g.q();
        boolean booleanValue = ((Boolean) this.g.q().aB()).booleanValue();
        List f = this.d.f();
        ykz ykzVar = this.f;
        ajyw ajywVar = this.h;
        apxfVar.getClass();
        aahd aahdVar = (aahd) ajywVar.c.get();
        aahdVar.getClass();
        fxj fxjVar = (fxj) ajywVar.a.get();
        fxjVar.getClass();
        gfz gfzVar = (gfz) ajywVar.b.get();
        gfzVar.getClass();
        ykp.i(activity, str, str2, str3, str4, z, k, booleanValue, f, ykzVar, new ewl(apxfVar, aahdVar, fxjVar, gfzVar));
    }
}

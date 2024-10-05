package defpackage;

import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzp implements zzv {
    public final /* synthetic */ ThirdPartyAccountPreference a;
    private final /* synthetic */ int b;

    public /* synthetic */ zzp(ThirdPartyAccountPreference thirdPartyAccountPreference, int i) {
        this.b = i;
        this.a = thirdPartyAccountPreference;
    }

    @Override // defpackage.zzv
    public final void a(boolean z) {
        apxf apxfVar;
        if (this.b == 0) {
            this.a.l(z);
            return;
        }
        ThirdPartyAccountPreference thirdPartyAccountPreference = this.a;
        aahd aahdVar = thirdPartyAccountPreference.b;
        if (z) {
            apxfVar = thirdPartyAccountPreference.a.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = thirdPartyAccountPreference.a.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        aahdVar.a(apxfVar);
    }
}

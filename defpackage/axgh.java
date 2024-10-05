package defpackage;

import android.content.Context;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgh implements axhe {
    private final Context a;

    public axgh(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.axhe
    public final andb a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }

    @Override // defpackage.axhe
    public final CardboardDevice$DeviceParams b() {
        return axft.a();
    }

    @Override // defpackage.axhe
    public final CardboardDevice$DeviceParamsList c() {
        return CardboardDevice$DeviceParamsList.getDefaultInstance();
    }

    @Override // defpackage.axhe
    public final Display$DisplayParams d() {
        Display$DisplayParams b = axft.b();
        return b == null ? axgk.a(this.a) : b;
    }

    @Override // defpackage.axhe
    public final Preferences$UserPrefs e() {
        return null;
    }

    @Override // defpackage.axhe
    public final void f() {
    }

    @Override // defpackage.axhe
    public final boolean g(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            return axft.c();
        }
        return axft.d(cardboardDevice$DeviceParams);
    }
}

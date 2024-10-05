package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhm {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    InitializationParams g;
    boolean h;
    final Long i;
    String j;

    public rhm(Context context, InitializationParams initializationParams, Long l) {
        this.h = true;
        qip.an(context);
        Context applicationContext = context.getApplicationContext();
        qip.an(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (initializationParams != null) {
            this.g = initializationParams;
            this.b = initializationParams.f;
            this.c = initializationParams.e;
            this.d = initializationParams.d;
            this.h = initializationParams.c;
            this.f = initializationParams.b;
            this.j = initializationParams.h;
            Bundle bundle = initializationParams.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

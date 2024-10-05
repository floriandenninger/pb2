package com.google.android.libraries.youtube.account.inlineauth.settings;

import android.app.Activity;
import android.content.Context;
import androidx.preference.SwitchPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
import defpackage.akgl;
import defpackage.aoae;
import defpackage.aupu;
import defpackage.wej;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuickPurchaseEnabledPreference extends SwitchPreference implements wej {
    public final akgl c;
    public final aupu d;
    public final boolean e;
    public final aoae f;

    public QuickPurchaseEnabledPreference(Context context, boolean z, aoae aoaeVar, akgl akglVar, aupu aupuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context);
        this.e = z;
        this.f = aoaeVar;
        this.d = aupuVar;
        this.c = akglVar;
    }

    @Override // defpackage.wej
    public final void a() {
    }

    @Override // defpackage.wej
    public final void b() {
        ((Activity) this.j).runOnUiThread(new Runnable() { // from class: wgq
            @Override // java.lang.Runnable
            public final void run() {
                QuickPurchaseEnabledPreference quickPurchaseEnabledPreference = QuickPurchaseEnabledPreference.this;
                quickPurchaseEnabledPreference.k(true);
                quickPurchaseEnabledPreference.c.d(quickPurchaseEnabledPreference.d, true);
                quickPurchaseEnabledPreference.f.t(quickPurchaseEnabledPreference.e, true);
            }
        });
    }
}

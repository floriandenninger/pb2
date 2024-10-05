package com.google.android.libraries.youtube.account.inlineauth.settings;

import android.app.Activity;
import android.content.Context;
import androidx.preference.ListPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseAuthMethodPreference;
import defpackage.akgl;
import defpackage.wej;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class QuickPurchaseAuthMethodPreference extends ListPreference implements wej {
    public int G;
    public List H;
    public final akgl I;

    public QuickPurchaseAuthMethodPreference(Context context, akgl akglVar) {
        super(context);
        this.G = -1;
        this.H = null;
        this.I = akglVar;
    }

    @Override // defpackage.wej
    public final void a() {
    }

    @Override // defpackage.wej
    public final void b() {
        ((Activity) this.j).runOnUiThread(new Runnable() { // from class: wgp
            @Override // java.lang.Runnable
            public final void run() {
                QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference = QuickPurchaseAuthMethodPreference.this;
                int i = quickPurchaseAuthMethodPreference.G;
                if (i >= 0) {
                    quickPurchaseAuthMethodPreference.f(i);
                    quickPurchaseAuthMethodPreference.n(((auqc) quickPurchaseAuthMethodPreference.H.get(quickPurchaseAuthMethodPreference.G)).c);
                    int i2 = 0;
                    while (i2 < quickPurchaseAuthMethodPreference.H.size()) {
                        quickPurchaseAuthMethodPreference.I.e((auqc) quickPurchaseAuthMethodPreference.H.get(i2), i2 == quickPurchaseAuthMethodPreference.G);
                        i2++;
                    }
                }
            }
        });
    }
}

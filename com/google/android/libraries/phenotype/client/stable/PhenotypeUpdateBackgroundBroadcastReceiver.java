package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.amru;
import defpackage.anaf;
import defpackage.anfq;
import defpackage.anht;
import defpackage.anhy;
import defpackage.fjz;
import defpackage.gip;
import defpackage.uvi;
import defpackage.uwm;
import defpackage.uwo;
import defpackage.uwv;
import defpackage.uwy;
import defpackage.uxp;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final anhy i;
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            uvi a = uvi.a(context);
            Map f = uxp.f(context);
            if (f.isEmpty()) {
                return;
            }
            uwm uwmVar = (uwm) f.get(stringExtra);
            if (uwmVar == null || uwmVar.f == 7) {
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                if (uwmVar == null) {
                    i = anaf.H(amru.s(uwo.a(a).b(new fjz(stringExtra, 19), a.c()), a.c().submit(new uwy(a, stringExtra, 0)))).a(gip.n, a.c());
                } else {
                    i = anfq.i(anht.q(anfq.h(anht.q(uwo.a(a).a()), new fjz(stringExtra, 16), a.c())), new uwv(uwmVar, stringExtra, a, 0), a.c());
                }
                i.d(new Runnable() { // from class: uwz
                    @Override // java.lang.Runnable
                    public final void run() {
                        anhy anhyVar = anhy.this;
                        String str = stringExtra;
                        BroadcastReceiver.PendingResult pendingResult = goAsync;
                        try {
                            anaf.W(anhyVar);
                            if (str.length() != 0) {
                                "Successfully updated snapshot for ".concat(str);
                            }
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", str.length() != 0 ? "Failed to update local snapshot for ".concat(str) : new String("Failed to update local snapshot for "), e);
                        } finally {
                            pendingResult.finish();
                        }
                    }
                }, a.c());
                return;
            }
            stringExtra.length();
        }
    }
}

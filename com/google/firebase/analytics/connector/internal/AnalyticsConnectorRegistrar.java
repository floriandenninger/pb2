package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import defpackage.ansv;
import defpackage.antc;
import defpackage.anti;
import defpackage.antk;
import defpackage.anui;
import defpackage.anuj;
import defpackage.anuk;
import defpackage.anum;
import defpackage.anuu;
import defpackage.anvh;
import defpackage.anwb;
import defpackage.anwd;
import defpackage.aocz;
import defpackage.qip;
import defpackage.qmq;
import defpackage.rdq;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements anum {
    public static /* synthetic */ anti lambda$getComponents$0(anuk anukVar) {
        antc antcVar = (antc) anukVar.a(antc.class);
        Context context = (Context) anukVar.a(Context.class);
        anwd anwdVar = (anwd) anukVar.a(anwd.class);
        qip.an(antcVar);
        qip.an(context);
        qip.an(anwdVar);
        qip.an(context.getApplicationContext());
        if (antk.a == null) {
            synchronized (antk.class) {
                if (antk.a == null) {
                    Bundle bundle = new Bundle(1);
                    if (antcVar.k()) {
                        anwdVar.c(ansv.class, qmq.f, new anwb() { // from class: antj
                            @Override // defpackage.anwb
                            public final void a(anwa anwaVar) {
                                boolean z = ((ansv) anwaVar.b()).a;
                                synchronized (antk.class) {
                                    anti antiVar = antk.a;
                                    qip.an(antiVar);
                                    rdq rdqVar = ((antk) antiVar).b.a;
                                    rdqVar.c(new rde(rdqVar));
                                }
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", antcVar.j());
                    }
                    antk.a = new antk(rdq.d(context, bundle).c);
                }
            }
        }
        return antk.a;
    }

    @Override // defpackage.anum
    public List getComponents() {
        anui a = anuj.a(anti.class);
        a.b(anuu.c(antc.class));
        a.b(anuu.c(Context.class));
        a.b(anuu.c(anwd.class));
        a.c(anvh.b);
        a.d(2);
        return Arrays.asList(a.a(), aocz.S("fire-analytics", "19.0.2"));
    }
}

package com.google.android.apps.youtube.app.extensions.assistant;

import defpackage.acsx;
import defpackage.acsy;
import defpackage.anaf;
import defpackage.any;
import defpackage.aok;
import defpackage.asmn;
import defpackage.gxc;
import defpackage.gxd;
import defpackage.sfl;
import defpackage.zga;
import java.security.SecureRandom;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssistantSettingsRetriever implements any {
    private final gxd a;
    private final acsy b;
    private final Executor c;
    private final SecureRandom d;

    static {
        zga.a("Assistant");
    }

    public AssistantSettingsRetriever(gxd gxdVar, acsy acsyVar, Executor executor, SecureRandom secureRandom) {
        this.a = gxdVar;
        this.b = acsyVar;
        this.c = executor;
        this.d = secureRandom;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        acsx acsxVar;
        if (this.d.nextFloat() < 0.01f) {
            acsxVar = this.b.d(asmn.LATENCY_ACTION_ASSISTANT_SETTINGS);
            if (acsxVar != null) {
                acsxVar.e();
            }
        } else {
            acsxVar = null;
        }
        gxd gxdVar = this.a;
        anaf.Y(sfl.a(gxdVar.a.a), new gxc(gxdVar, acsxVar), this.c);
    }
}

package com.google.android.libraries.youtube.mdx.castclient;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import defpackage.acun;
import defpackage.acwq;
import defpackage.acxi;
import defpackage.alta;
import defpackage.ammv;
import defpackage.qfu;
import defpackage.qgs;
import defpackage.qhz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CastOptionsProvider implements qgs {
    public String castAppId;
    public acun mdxConfig;
    public acxi mdxModuleConfig;

    @Override // defpackage.qgs
    public List getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // defpackage.qgs
    public CastOptions getCastOptions(Context context) {
        CastMediaOptions a;
        ((acwq) alta.t(context, acwq.class)).ja(this);
        qfu qfuVar = new qfu();
        qfuVar.a = this.castAppId;
        qfuVar.f = true;
        qfuVar.d = true;
        LaunchOptions launchOptions = new LaunchOptions();
        acun acunVar = this.mdxConfig;
        launchOptions.a = (acunVar.aq || this.mdxModuleConfig.g == 1) ? false : true;
        launchOptions.c = acunVar.n;
        qfuVar.c = launchOptions;
        qhz qhzVar = new qhz();
        qhzVar.a = null;
        qfuVar.e = ammv.i(qhzVar.a());
        ammv ammvVar = qfuVar.e;
        if (ammvVar != null) {
            a = (CastMediaOptions) ammvVar.f();
        } else {
            a = new qhz().a();
        }
        return new CastOptions(qfuVar.a, qfuVar.b, false, qfuVar.c, qfuVar.d, a, qfuVar.f, 0.05000000074505806d, false, false, false);
    }
}

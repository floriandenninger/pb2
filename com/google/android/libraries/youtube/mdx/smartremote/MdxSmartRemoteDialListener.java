package com.google.android.libraries.youtube.mdx.smartremote;

import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteDialListener;
import defpackage.acun;
import defpackage.acyp;
import defpackage.acys;
import defpackage.adlt;
import defpackage.any;
import defpackage.aok;
import defpackage.yjk;
import defpackage.ypa;
import defpackage.zga;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxSmartRemoteDialListener implements any {
    public static final /* synthetic */ int a = 0;
    private final acys b;
    private final boolean c;
    private final acyp d;

    static {
        zga.a("MDX.MdxSmartRemoteDialListener");
    }

    public MdxSmartRemoteDialListener(acys acysVar, final adlt adltVar, final ypa ypaVar, acun acunVar) {
        this.b = acysVar;
        this.c = acunVar.o;
        this.d = new acyp() { // from class: adqd
            @Override // defpackage.acyp
            public final void a(adfy adfyVar) {
                adlt adltVar2 = adlt.this;
                ypa ypaVar2 = ypaVar;
                int i = MdxSmartRemoteDialListener.a;
                if (adltVar2.g() != null) {
                    return;
                }
                Map m = adfyVar.m();
                adqe adqeVar = null;
                if (m != null && m.containsKey("smartRemoteRequestedTime")) {
                    String str = (String) m.get("screenId");
                    String str2 = (String) m.get("smartRemoteRequestedTime");
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        try {
                            adqeVar = new adqe(adfyVar, Long.parseLong(str2));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                if (adqeVar != null) {
                    ypaVar2.d(new adqg(adqeVar.a, adqeVar.b));
                }
            }

            @Override // defpackage.acyp
            public final /* synthetic */ void b() {
            }
        };
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
    public final void nv(aok aokVar) {
        yjk.f();
        this.b.f(this.d);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.c) {
            yjk.f();
            this.b.c(this.d, false);
        }
    }
}

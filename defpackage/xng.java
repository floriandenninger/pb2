package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xng {
    public final ci a;
    public final aahd b;
    public final xzz c;
    public final xne d;
    public xxr e;
    public boolean f;
    private final akbz g;

    public xng(ci ciVar, aahd aahdVar, akbz akbzVar, xzz xzzVar) {
        this.a = ciVar;
        this.b = aahdVar;
        this.c = xzzVar;
        this.d = new xne(this, ciVar, aahdVar, akbzVar, xzzVar);
        this.g = akbzVar;
    }

    private final void c(dn dnVar) {
        ce f = this.a.getSupportFragmentManager().f("backstage_post_dialog_fragment");
        if (f != null) {
            dnVar.m(f);
        }
        dnVar.s(null);
        this.e = null;
    }

    public final void a(final apjf apjfVar, xoz xozVar) {
        if (this.f) {
            return;
        }
        apmh apmhVar = apjfVar.k;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            zga.b("Command for post button is missing in BackstagePostDialogRenderer");
            return;
        }
        dn k = this.a.getSupportFragmentManager().k();
        c(k);
        this.e = xxp.aF(apjfVar);
        xne xneVar = this.d;
        xneVar.b = xozVar;
        xxr xxrVar = this.e;
        xneVar.c = xxrVar;
        ((xxp) xxrVar).az = new xxq() { // from class: xnc
            @Override // defpackage.xxq
            public final void a(aawe aaweVar) {
                xng xngVar = xng.this;
                apjf apjfVar2 = apjfVar;
                xngVar.d.d = aaweVar;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xngVar.d);
                aahd aahdVar = xngVar.b;
                apmh apmhVar2 = apjfVar2.k;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apxf apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, hashMap);
            }
        };
        final xxr xxrVar2 = this.e;
        ((xxp) xxrVar2).aO = new DialogInterface.OnDismissListener() { // from class: xna
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ajpd ajpdVar;
                apiv apivVar;
                apiy apiyVar;
                apiw apiwVar;
                int i;
                int i2;
                xng xngVar = xng.this;
                xxr xxrVar3 = xxrVar2;
                apjf apjfVar2 = apjfVar;
                xzz xzzVar = xngVar.c;
                byte[] I = apjfVar2.x.I();
                if (I == null) {
                    return;
                }
                aone createBuilder = apiu.a.createBuilder();
                int i3 = 0;
                boolean z = xzzVar.d == null;
                createBuilder.copyOnWrite();
                apiu apiuVar = (apiu) createBuilder.instance;
                apiuVar.b |= 2;
                apiuVar.d = z;
                aone createBuilder2 = apit.a.createBuilder();
                String str = xzzVar.c;
                createBuilder2.copyOnWrite();
                apit apitVar = (apit) createBuilder2.instance;
                str.getClass();
                apitVar.b |= 1;
                apitVar.c = str;
                aomf x = aomf.x(I);
                createBuilder2.copyOnWrite();
                apit apitVar2 = (apit) createBuilder2.instance;
                apitVar2.b |= 2;
                apitVar2.d = x;
                long j = xzzVar.b;
                createBuilder2.copyOnWrite();
                apit apitVar3 = (apit) createBuilder2.instance;
                apitVar3.b |= 4;
                apitVar3.e = j;
                createBuilder.copyOnWrite();
                apiu apiuVar2 = (apiu) createBuilder.instance;
                apit apitVar4 = (apit) createBuilder2.build();
                apitVar4.getClass();
                apiuVar2.c = apitVar4;
                apiuVar2.b |= 1;
                aone createBuilder3 = apix.a.createBuilder();
                xxp xxpVar = (xxp) xxrVar3;
                String obj = xxpVar.aD.getText().toString();
                int i4 = 0;
                while (xxpVar.aI().matcher(obj).find()) {
                    i4++;
                }
                int trimmedLength = TextUtils.getTrimmedLength(obj);
                createBuilder3.copyOnWrite();
                apix apixVar = (apix) createBuilder3.instance;
                apixVar.b |= 1;
                apixVar.c = trimmedLength;
                int lineCount = xxpVar.aD.getLineCount();
                createBuilder3.copyOnWrite();
                apix apixVar2 = (apix) createBuilder3.instance;
                apixVar2.b |= 8;
                apixVar2.e = lineCount;
                createBuilder3.copyOnWrite();
                apix apixVar3 = (apix) createBuilder3.instance;
                apixVar3.b |= 4;
                apixVar3.d = i4;
                int i5 = xxpVar.aN;
                createBuilder3.copyOnWrite();
                apix apixVar4 = (apix) createBuilder3.instance;
                apixVar4.b |= 16;
                apixVar4.f = i5;
                apix apixVar5 = (apix) createBuilder3.build();
                if (apixVar5 != null) {
                    createBuilder.copyOnWrite();
                    apiu apiuVar3 = (apiu) createBuilder.instance;
                    apiuVar3.e = apixVar5;
                    apiuVar3.b |= 4;
                }
                aone createBuilder4 = apis.a.createBuilder();
                xzp xzpVar = xxpVar.aC;
                if ((xzpVar == null || !xzpVar.c()) && ((ajpdVar = xxpVar.aF) == null || ajpdVar.isEmpty())) {
                    apivVar = null;
                } else {
                    aone createBuilder5 = apiv.a.createBuilder();
                    xzp xzpVar2 = xxpVar.aC;
                    int i6 = 3;
                    if (xzpVar2 == null || !xzpVar2.c()) {
                        i = 2;
                        i6 = 2;
                    } else {
                        xzp xzpVar3 = xxpVar.aC;
                        if (xzpVar3.g == 3) {
                            i2 = 3;
                        } else {
                            i2 = xzpVar3.d() ? 4 : 2;
                        }
                        xzp xzpVar4 = xxpVar.aC;
                        int intrinsicWidth = xzpVar4.a.getDrawable() == null ? 0 : xzpVar4.a.getDrawable().getIntrinsicWidth();
                        createBuilder5.copyOnWrite();
                        apiv apivVar2 = (apiv) createBuilder5.instance;
                        apivVar2.b |= 8;
                        apivVar2.f = intrinsicWidth;
                        xzp xzpVar5 = xxpVar.aC;
                        int intrinsicHeight = xzpVar5.a.getDrawable() == null ? 0 : xzpVar5.a.getDrawable().getIntrinsicHeight();
                        createBuilder5.copyOnWrite();
                        apiv apivVar3 = (apiv) createBuilder5.instance;
                        apivVar3.b |= 16;
                        apivVar3.g = intrinsicHeight;
                        int i7 = xxpVar.aC.h;
                        createBuilder5.copyOnWrite();
                        apiv apivVar4 = (apiv) createBuilder5.instance;
                        apivVar4.b |= 4;
                        int i8 = i2;
                        apivVar4.e = i7;
                        int i9 = xxpVar.aC.j;
                        createBuilder5.copyOnWrite();
                        apiv apivVar5 = (apiv) createBuilder5.instance;
                        apivVar5.b |= 32;
                        apivVar5.h = i9;
                        i = i8;
                    }
                    createBuilder5.copyOnWrite();
                    apiv apivVar6 = (apiv) createBuilder5.instance;
                    apivVar6.c = i - 1;
                    apivVar6.b |= 1;
                    createBuilder5.copyOnWrite();
                    apiv apivVar7 = (apiv) createBuilder5.instance;
                    apivVar7.d = i6 - 1;
                    apivVar7.b |= 2;
                    apivVar = (apiv) createBuilder5.build();
                }
                if (apivVar != null) {
                    createBuilder4.copyOnWrite();
                    apis apisVar = (apis) createBuilder4.instance;
                    apisVar.c = apivVar;
                    apisVar.b |= 1;
                }
                if (xxpVar.aH.getVisibility() != 0) {
                    apiyVar = null;
                } else {
                    aone createBuilder6 = apiy.a.createBuilder();
                    createBuilder6.copyOnWrite();
                    apiy apiyVar2 = (apiy) createBuilder6.instance;
                    apiyVar2.d = 1;
                    apiyVar2.b |= 2;
                    String str2 = xxpVar.aJ;
                    createBuilder6.copyOnWrite();
                    apiy apiyVar3 = (apiy) createBuilder6.instance;
                    str2.getClass();
                    apiyVar3.b |= 1;
                    apiyVar3.c = str2;
                    apiyVar = (apiy) createBuilder6.build();
                }
                if (apiyVar != null) {
                    createBuilder4.copyOnWrite();
                    apis apisVar2 = (apis) createBuilder4.instance;
                    apisVar2.e = apiyVar;
                    apisVar2.b |= 4;
                }
                if (xxpVar.aE.getVisibility() != 0) {
                    apiwVar = null;
                } else {
                    aone createBuilder7 = apiw.a.createBuilder();
                    Iterator it = xxpVar.aE.a().iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        if (TextUtils.isEmpty((String) it.next())) {
                            i3++;
                        } else {
                            i10++;
                        }
                    }
                    createBuilder7.copyOnWrite();
                    apiw apiwVar2 = (apiw) createBuilder7.instance;
                    apiwVar2.b |= 2;
                    apiwVar2.d = i3;
                    createBuilder7.copyOnWrite();
                    apiw apiwVar3 = (apiw) createBuilder7.instance;
                    apiwVar3.b |= 1;
                    apiwVar3.c = i10;
                    apiwVar = (apiw) createBuilder7.build();
                }
                if (apiwVar != null) {
                    createBuilder4.copyOnWrite();
                    apis apisVar3 = (apis) createBuilder4.instance;
                    apisVar3.d = apiwVar;
                    apisVar3.b |= 2;
                }
                createBuilder.copyOnWrite();
                apiu apiuVar4 = (apiu) createBuilder.instance;
                apis apisVar4 = (apis) createBuilder4.build();
                apisVar4.getClass();
                apiuVar4.f = apisVar4;
                apiuVar4.b |= 8;
                String str3 = xzzVar.d;
                if (str3 != null) {
                    createBuilder.copyOnWrite();
                    apiu apiuVar5 = (apiu) createBuilder.instance;
                    apiuVar5.b |= 16;
                    apiuVar5.g = str3;
                }
                arpn a = arpp.a();
                a.copyOnWrite();
                ((arpp) a.instance).ce((apiu) createBuilder.build());
                xzzVar.a.c((arpp) a.build());
            }
        };
        xzz xzzVar = this.c;
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("backstage_post_creation_flow:");
        sb.append(valueOf);
        sb.append(":0");
        xzzVar.c = sb.toString();
        xzzVar.b = System.currentTimeMillis() * 1000;
        xzzVar.d = null;
        this.e.s(k, "backstage_post_dialog_fragment");
    }

    public final void b(final apjf apjfVar, xpa xpaVar) {
        if (this.f) {
            return;
        }
        apmh apmhVar = apjfVar.k;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            zga.b("Command for post button is missing in BackstagePostDialogRenderer");
            return;
        }
        dn k = this.a.getSupportFragmentManager().k();
        c(k);
        this.e = xxp.aF(apjfVar);
        final xnf xnfVar = new xnf(this, this.e, xpaVar, this.g, this.b);
        ((xxp) this.e).az = new xxq() { // from class: xnb
            @Override // defpackage.xxq
            public final void a(aawe aaweVar) {
                xng xngVar = xng.this;
                xnf xnfVar2 = xnfVar;
                apjf apjfVar2 = apjfVar;
                xnfVar2.a = aaweVar.a;
                xnfVar2.b = aaweVar.d;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xnfVar2);
                hashMap.put("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key", true);
                aahd aahdVar = xngVar.b;
                apmh apmhVar2 = apjfVar2.k;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apxf apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, hashMap);
            }
        };
        this.e.s(k, "backstage_post_dialog_fragment");
    }
}

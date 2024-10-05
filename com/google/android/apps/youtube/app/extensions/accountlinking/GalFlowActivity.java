package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.android.libraries.accountlinking.LinkResponse;
import defpackage.aac;
import defpackage.aae;
import defpackage.aap;
import defpackage.aney;
import defpackage.anfq;
import defpackage.anfz;
import defpackage.angq;
import defpackage.anht;
import defpackage.aoca;
import defpackage.aocc;
import defpackage.aocq;
import defpackage.aone;
import defpackage.gwf;
import defpackage.gwg;
import defpackage.gwm;
import defpackage.jom;
import defpackage.mjy;
import defpackage.qnk;
import defpackage.qnl;
import defpackage.rsg;
import defpackage.rtp;
import defpackage.rtq;
import defpackage.rua;
import defpackage.rub;
import defpackage.ynk;
import defpackage.ynl;
import defpackage.ynm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GalFlowActivity extends gwm {
    public gwg a;
    public rsg b;
    private aae d;

    public final void a(Intent intent) {
        this.d.b(intent);
    }

    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = registerForActivityResult(new aap(), getActivityResultRegistry(), new aac() { // from class: gwh
            @Override // defpackage.aac
            public final void a(Object obj) {
                gwf gwfVar;
                int i;
                Intent intent;
                GalFlowActivity galFlowActivity = GalFlowActivity.this;
                ActivityResult activityResult = (ActivityResult) obj;
                gwg gwgVar = galFlowActivity.a;
                try {
                    i = activityResult.a;
                    intent = activityResult.b;
                } catch (rsj e) {
                    if (e.a == 4) {
                        gwfVar = gwf.CANCELLED;
                    } else {
                        zga.d("Unable to get link response.", e);
                    }
                }
                if (i == -1) {
                    if (intent.hasExtra("link_response")) {
                        if (((LinkResponse) intent.getParcelableExtra("link_response")).a) {
                            gwfVar = gwf.SUCCESS;
                            gwgVar.a(galFlowActivity, gwfVar);
                            return;
                        }
                        gwfVar = gwf.ERROR;
                        gwgVar.a(galFlowActivity, gwfVar);
                        return;
                    }
                } else if (i == -2 && intent.hasExtra("error_type") && intent.hasExtra("message")) {
                    throw new rsj(intent.getIntExtra("error_type", 0), intent.getStringExtra("message"));
                }
                throw new rsj(1, "Invalid activity result");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        super.onStart();
        final gwg gwgVar = this.a;
        final rsg rsgVar = this.b;
        if (gwgVar.d) {
            return;
        }
        gwgVar.d = true;
        if (!gwgVar.a.t()) {
            gwgVar.a(this, gwf.ERROR);
            return;
        }
        if (!getIntent().hasExtra("thirdPartyId")) {
            gwgVar.a(this, gwf.ERROR);
            return;
        }
        final String stringExtra = getIntent().getStringExtra("thirdPartyId");
        final ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("galCapabilities");
        try {
            final Account a = gwgVar.e.a(gwgVar.a.c());
            rtq rtqVar = rsgVar.e;
            int a2 = rsg.a();
            rub rubVar = rtqVar.a;
            aone createBuilder = aoca.a.createBuilder();
            aocq d = rubVar.d(a2);
            createBuilder.copyOnWrite();
            aoca aocaVar = (aoca) createBuilder.instance;
            d.getClass();
            aocaVar.b = d;
            aone createBuilder2 = aocc.a.createBuilder();
            createBuilder2.copyOnWrite();
            aocc aoccVar = (aocc) createBuilder2.instance;
            stringExtra.getClass();
            aoccVar.b = stringExtra;
            aocc aoccVar2 = (aocc) createBuilder2.build();
            createBuilder.copyOnWrite();
            aoca aocaVar2 = (aoca) createBuilder.instance;
            aoccVar2.getClass();
            aocaVar2.c = aoccVar2;
            final aoca aocaVar3 = (aoca) createBuilder.build();
            ynm.k(anfq.i(anht.q(anfq.h(anfq.h(aney.i(anfq.h(anht.q(rubVar.c(a, new rua() { // from class: rtx
                @Override // defpackage.rua
                public final anhy a(aobp aobpVar) {
                    aoca aocaVar4 = aoca.this;
                    axzp axzpVar = aobpVar.a;
                    aych aychVar = aobq.e;
                    if (aychVar == null) {
                        synchronized (aobq.class) {
                            aychVar = aobq.e;
                            if (aychVar == null) {
                                ayce a3 = aych.a();
                                a3.c = aycg.UNARY;
                                a3.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "GetLink");
                                a3.b();
                                a3.a = ayom.b(aoca.a);
                                a3.b = ayom.b(aocb.a);
                                aychVar = a3.a();
                                aobq.e = aychVar;
                            }
                        }
                    }
                    return ayox.a(axzpVar.a(aychVar, aobpVar.b), aocaVar4);
                }
            })), rtp.d, angq.a), Throwable.class, jom.d, angq.a), rtp.a, angq.a), mjy.o, angq.a)), new anfz() { // from class: gwe
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    gwg gwgVar2 = gwg.this;
                    ArrayList arrayList = stringArrayListExtra;
                    rsg rsgVar2 = rsgVar;
                    Account account = a;
                    String str = stringExtra;
                    final GalFlowActivity galFlowActivity = this;
                    LinkResponse linkResponse = (LinkResponse) obj;
                    if (gwgVar2.c.isCancelled()) {
                        return anaf.M();
                    }
                    if (linkResponse.a) {
                        return anaf.O(gwf.SUCCESS);
                    }
                    final int i = 0;
                    if (arrayList == null) {
                        amvs amvsVar = amvs.a;
                        int a3 = rsg.a();
                        rub rubVar2 = rsgVar2.d;
                        ArrayList arrayList2 = new ArrayList(amvsVar);
                        List b = rsg.b(rsgVar2.c.a);
                        String str2 = rsgVar2.c.b;
                        aone createBuilder3 = aocr.a.createBuilder();
                        aocq d2 = rubVar2.d(a3);
                        createBuilder3.copyOnWrite();
                        aocr aocrVar = (aocr) createBuilder3.instance;
                        d2.getClass();
                        aocrVar.b = d2;
                        createBuilder3.copyOnWrite();
                        aocr aocrVar2 = (aocr) createBuilder3.instance;
                        str.getClass();
                        aocrVar2.c = str;
                        createBuilder3.copyOnWrite();
                        aocr aocrVar3 = (aocr) createBuilder3.instance;
                        aony aonyVar = aocrVar3.d;
                        if (!aonyVar.c()) {
                            aocrVar3.d = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) arrayList2, (List) aocrVar3.d);
                        createBuilder3.K(b);
                        createBuilder3.copyOnWrite();
                        ((aocr) createBuilder3.instance).j = false;
                        createBuilder3.copyOnWrite();
                        ((aocr) createBuilder3.instance).h = 0;
                        if (str2 != null) {
                            createBuilder3.copyOnWrite();
                            ((aocr) createBuilder3.instance).g = str2;
                        }
                        return anfq.h(rsgVar2.d(rubVar2.b(account, new rtz(createBuilder3, 2)), account, str, a3, amvs.a, amvs.a), new amml() { // from class: gwd
                            @Override // defpackage.amml
                            public final Object apply(Object obj2) {
                                if (i == 0) {
                                    galFlowActivity.a((Intent) obj2);
                                    return gwf.PENDING;
                                }
                                galFlowActivity.a((Intent) obj2);
                                return gwf.PENDING;
                            }
                        }, gwgVar2.b);
                    }
                    amsx p = amsx.p(arrayList);
                    int a4 = rsg.a();
                    rub rubVar3 = rsgVar2.d;
                    ArrayList arrayList3 = new ArrayList(p);
                    List b2 = rsg.b(rsgVar2.c.a);
                    String str3 = rsgVar2.c.b;
                    aone createBuilder4 = aocr.a.createBuilder();
                    aocq d3 = rubVar3.d(a4);
                    createBuilder4.copyOnWrite();
                    aocr aocrVar4 = (aocr) createBuilder4.instance;
                    d3.getClass();
                    aocrVar4.b = d3;
                    createBuilder4.copyOnWrite();
                    aocr aocrVar5 = (aocr) createBuilder4.instance;
                    str.getClass();
                    aocrVar5.c = str;
                    createBuilder4.copyOnWrite();
                    aocr aocrVar6 = (aocr) createBuilder4.instance;
                    aony aonyVar2 = aocrVar6.e;
                    if (!aonyVar2.c()) {
                        aocrVar6.e = aonm.mutableCopy(aonyVar2);
                    }
                    aolo.addAll((Iterable) arrayList3, (List) aocrVar6.e);
                    createBuilder4.K(b2);
                    createBuilder4.copyOnWrite();
                    ((aocr) createBuilder4.instance).j = false;
                    createBuilder4.copyOnWrite();
                    ((aocr) createBuilder4.instance).h = 0;
                    if (str3 != null) {
                        createBuilder4.copyOnWrite();
                        ((aocr) createBuilder4.instance).g = str3;
                    }
                    anhy d4 = rsgVar2.d(rubVar3.b(account, new rtz(createBuilder4, i)), account, str, a4, amsx.p(p), amvs.a);
                    final int i2 = 1;
                    return anfq.h(d4, new amml() { // from class: gwd
                        @Override // defpackage.amml
                        public final Object apply(Object obj2) {
                            if (i2 == 0) {
                                galFlowActivity.a((Intent) obj2);
                                return gwf.PENDING;
                            }
                            galFlowActivity.a((Intent) obj2);
                            return gwf.PENDING;
                        }
                    }, gwgVar2.b);
                }
            }, gwgVar.b), gwgVar.b, new ynk() { // from class: gwb
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    gwg gwgVar2 = gwg.this;
                    GalFlowActivity galFlowActivity = this;
                    zga.d("Unable to link account.", th);
                    gwgVar2.a(galFlowActivity, gwf.ERROR);
                }
            }, new ynl() { // from class: gwc
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    gwg.this.a(this, (gwf) obj);
                }
            });
        } catch (RemoteException | qnk | qnl unused) {
            gwgVar.a(this, gwf.ERROR);
        }
    }
}

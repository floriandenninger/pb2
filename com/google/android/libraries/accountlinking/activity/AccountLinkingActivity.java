package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.amqp;
import defpackage.amru;
import defpackage.amsx;
import defpackage.amyf;
import defpackage.amyi;
import defpackage.aobo;
import defpackage.aocd;
import defpackage.aocm;
import defpackage.aony;
import defpackage.aoru;
import defpackage.aorv;
import defpackage.aox;
import defpackage.ce;
import defpackage.ci;
import defpackage.dn;
import defpackage.eq;
import defpackage.mjy;
import defpackage.rqr;
import defpackage.rsk;
import defpackage.rsl;
import defpackage.rsu;
import defpackage.rsv;
import defpackage.rsw;
import defpackage.rsx;
import defpackage.rsy;
import defpackage.rtb;
import defpackage.rtc;
import defpackage.rtd;
import defpackage.rtn;
import defpackage.ruf;
import defpackage.rug;
import defpackage.ruh;
import defpackage.rui;
import defpackage.rwh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountLinkingActivity extends ci {
    public static final amyi a = rwh.k();
    public rsy b;
    public CircularProgressIndicator c;
    public rtd d;
    public rsv e;

    public final void a(ce ceVar, boolean z) {
        ce f = getSupportFragmentManager().f("flow_fragment");
        dn k = getSupportFragmentManager().k();
        if (f != null) {
            k.m(f);
        }
        if (z) {
            k.q(R.id.base_fragment_container_view, ceVar, "flow_fragment");
            k.a();
        } else {
            k.r(ceVar, "flow_fragment");
            k.a();
        }
    }

    public final void b() {
        if (!isTaskRoot()) {
            finish();
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        ((amyf) a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onBackPressed", 173, "AccountLinkingActivity.java")).q("accountlinkingactivity: onBackPressed");
        ce f = getSupportFragmentManager().f("flow_fragment");
        if (f instanceof rtb) {
            ((rtb) f).a();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amyi amyiVar = a;
        ((amyf) amyiVar.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 52, "AccountLinkingActivity.java")).q("AccountLinkingActivity onCreate()");
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        final int i = 1;
        if (extras == null) {
            ((amyf) ((amyf) amyiVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 56, "AccountLinkingActivity.java")).q("bundle cannot be null.");
            rsw g = rqr.g(1, "bundle cannot be null.");
            setResult(g.a, g.b);
            b();
            return;
        }
        try {
            amkq.E(extras.containsKey("session_id"));
            amkq.E(extras.containsKey("scopes"));
            amkq.E(extras.containsKey("capabilities"));
            rsx rsxVar = new rsx();
            rsxVar.f(amsx.p(extras.getStringArrayList("scopes")));
            rsxVar.b(amsx.p(extras.getStringArrayList("capabilities")));
            rsxVar.c = (Account) extras.getParcelable("account");
            if (extras.getBoolean("using_custom_dependency_supplier")) {
                rsxVar.d = true;
            }
            rsxVar.e = extras.getInt("session_id");
            rsxVar.f = extras.getString("bucket");
            rsxVar.g = extras.getString("service_host");
            rsxVar.h = extras.getInt("service_port");
            rsxVar.i = extras.getString("service_id");
            rsxVar.d(amqp.d(extras.getStringArrayList("flows")).f(mjy.t).g());
            rsxVar.k = (aocm) aocm.a.getParserForType().j(extras.getByteArray("linking_session"));
            rsxVar.e(amsx.p(extras.getStringArrayList("google_scopes")));
            rsxVar.m = extras.getBoolean("two_way_account_linking");
            final int i2 = 0;
            rsxVar.n = extras.getInt("account_linking_entry_point", 0);
            rsxVar.c(amqp.d(extras.getStringArrayList("data_usage_notices")).f(mjy.s).g());
            rsxVar.p = amru.o(extras.getStringArrayList("experiment_server_tokens"));
            this.b = rsxVar.a();
            ruf rufVar = ((ruh) eq.d(this, new rug(getApplication(), this.b)).a(ruh.class)).b;
            if (rufVar == null) {
                ((amyf) ((amyf) amyiVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 81, "AccountLinkingActivity.java")).q("Unable to create ManagedDependencySupplier. Shutting down AccountLinkingActivity.");
                rsw g2 = rqr.g(1, "Unable to create ManagedDependencySupplier.");
                setResult(g2.a, g2.b);
                b();
                return;
            }
            setContentView(R.layout.account_linking_client);
            this.c = (CircularProgressIndicator) findViewById(R.id.Progress);
            rsv rsvVar = (rsv) eq.d(this, new rsu(getApplication(), this.b, rufVar)).a(rsv.class);
            this.e = rsvVar;
            rsvVar.e.f(this, new aox() { // from class: rsm
                @Override // defpackage.aox
                public final void a(Object obj) {
                    ce ceVar;
                    AccountLinkingActivity accountLinkingActivity = AccountLinkingActivity.this;
                    rsl rslVar = (rsl) obj;
                    try {
                        rsy rsyVar = accountLinkingActivity.b;
                        rsl rslVar2 = rsl.APP_FLIP;
                        int ordinal = rslVar.ordinal();
                        if (ordinal == 0) {
                            aocd aocdVar = rsyVar.k.f;
                            if (aocdVar == null) {
                                aocdVar = aocd.a;
                            }
                            aobo aoboVar = aocdVar.b;
                            if (aoboVar == null) {
                                aoboVar = aobo.a;
                            }
                            aony aonyVar = aoboVar.b;
                            amsx amsxVar = rsyVar.a;
                            aocd aocdVar2 = rsyVar.k.f;
                            if (aocdVar2 == null) {
                                aocdVar2 = aocd.a;
                            }
                            String str = aocdVar2.c;
                            aonyVar.getClass();
                            amsxVar.getClass();
                            str.getClass();
                            rte rteVar = new rte();
                            Bundle bundle2 = new Bundle();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Iterator it = aonyVar.iterator();
                            while (it.hasNext()) {
                                ((aooy) it.next()).writeDelimitedTo(byteArrayOutputStream);
                            }
                            bundle2.putByteArray("android_app_flip_list", byteArrayOutputStream.toByteArray());
                            bundle2.putStringArray("SCOPE", (String[]) amsxVar.toArray(new String[0]));
                            bundle2.putString("google_client_id", str);
                            rteVar.af(bundle2);
                            ceVar = rteVar;
                        } else if (ordinal == 1 || ordinal == 2) {
                            Account account = rsyVar.c;
                            aoci aociVar = rsyVar.k.e;
                            if (aociVar == null) {
                                aociVar = aoci.a;
                            }
                            String str2 = aociVar.b;
                            rtk rtkVar = new rtk();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("account", account);
                            bundle3.putString("flow_url", str2);
                            rtkVar.af(bundle3);
                            ceVar = rtkVar;
                        } else if (ordinal == 3) {
                            aocj aocjVar = rsyVar.k.b;
                            if (aocjVar == null) {
                                aocjVar = aocj.a;
                            }
                            String str3 = aocjVar.b;
                            aocj aocjVar2 = rsyVar.k.b;
                            if (aocjVar2 == null) {
                                aocjVar2 = aocj.a;
                            }
                            ceVar = rtn.a(str3, aocjVar2.c);
                        } else {
                            ((amyf) ((amyf) AccountLinkingActivity.a.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createFragment", 204, "AccountLinkingActivity.java")).s("Unrecognized flow: %s", rslVar);
                            String valueOf = String.valueOf(rslVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                            sb.append("Unrecognized flow: ");
                            sb.append(valueOf);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (!rslVar.equals(rsl.STREAMLINED_LINK_ACCOUNT) && !rslVar.equals(rsl.STREAMLINED_CREATE_ACCOUNT)) {
                            accountLinkingActivity.a(ceVar, false);
                            ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 114, "AccountLinkingActivity.java")).s("Starting flow \"%s\"", rslVar);
                        }
                        accountLinkingActivity.a(ceVar, true);
                        ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 114, "AccountLinkingActivity.java")).s("Starting flow \"%s\"", rslVar);
                    } catch (IOException e) {
                        ((amyf) ((amyf) ((amyf) AccountLinkingActivity.a.g()).h(e)).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$0", 116, "AccountLinkingActivity.java")).s("Failed to create a fragment for flow \"%s\"", rslVar);
                        accountLinkingActivity.d.a(rtc.b(301));
                    }
                }
            });
            final int i3 = 2;
            this.e.f.f(this, new aox(this) { // from class: rso
                public final /* synthetic */ AccountLinkingActivity a;

                {
                    this.a = this;
                }

                @Override // defpackage.aox
                public final void a(Object obj) {
                    int i4 = i3;
                    if (i4 == 0) {
                        AccountLinkingActivity accountLinkingActivity = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            CircularProgressIndicator circularProgressIndicator = accountLinkingActivity.c;
                            if (circularProgressIndicator.c > 0) {
                                circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
                                circularProgressIndicator.postDelayed(circularProgressIndicator.h, circularProgressIndicator.c);
                                return;
                            } else {
                                circularProgressIndicator.h.run();
                                return;
                            }
                        }
                        CircularProgressIndicator circularProgressIndicator2 = accountLinkingActivity.c;
                        if (circularProgressIndicator2.getVisibility() != 0) {
                            circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.h);
                            return;
                        }
                        circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.i);
                        long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator2.e;
                        long j = circularProgressIndicator2.d;
                        if (uptimeMillis < j) {
                            circularProgressIndicator2.postDelayed(circularProgressIndicator2.i, j - uptimeMillis);
                            return;
                        } else {
                            circularProgressIndicator2.i.run();
                            return;
                        }
                    }
                    if (i4 == 1) {
                        AccountLinkingActivity accountLinkingActivity2 = this.a;
                        rsw rswVar = (rsw) obj;
                        ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$2", 138, "AccountLinkingActivity.java")).q("Setting activity result and finishing AccountLinkingActivity");
                        accountLinkingActivity2.setResult(rswVar.a, rswVar.b);
                        accountLinkingActivity2.b();
                        return;
                    }
                    AccountLinkingActivity accountLinkingActivity3 = this.a;
                    List list = (List) obj;
                    rsy rsyVar = accountLinkingActivity3.b;
                    ArrayList arrayList = new ArrayList();
                    aoce aoceVar = rsyVar.k.g;
                    if (aoceVar == null) {
                        aoceVar = aoce.a;
                    }
                    aony aonyVar = aoceVar.b;
                    if (list.contains(rsk.LINKING_INFO)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.q).f(mjy.p).a().c());
                    }
                    if (list.contains(rsk.CAPABILITY_CONSENT)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.r).f(mjy.p).a().c());
                    }
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createDataUsageNoticeFragment", 236, "AccountLinkingActivity.java")).s("urls passed to dataUsageNotice %s ", arrayList);
                    Account account = rsyVar.c;
                    rth rthVar = new rth();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("account", account);
                    bundle2.putStringArray("data_usage_notice_urls", (String[]) arrayList.toArray(new String[0]));
                    rthVar.af(bundle2);
                    accountLinkingActivity3.a(rthVar, true);
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$1", 131, "AccountLinkingActivity.java")).s("Starting data usage notice fragment \"%s\"", list);
                }
            });
            this.e.g.f(this, new aox(this) { // from class: rso
                public final /* synthetic */ AccountLinkingActivity a;

                {
                    this.a = this;
                }

                @Override // defpackage.aox
                public final void a(Object obj) {
                    int i4 = i;
                    if (i4 == 0) {
                        AccountLinkingActivity accountLinkingActivity = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            CircularProgressIndicator circularProgressIndicator = accountLinkingActivity.c;
                            if (circularProgressIndicator.c > 0) {
                                circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
                                circularProgressIndicator.postDelayed(circularProgressIndicator.h, circularProgressIndicator.c);
                                return;
                            } else {
                                circularProgressIndicator.h.run();
                                return;
                            }
                        }
                        CircularProgressIndicator circularProgressIndicator2 = accountLinkingActivity.c;
                        if (circularProgressIndicator2.getVisibility() != 0) {
                            circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.h);
                            return;
                        }
                        circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.i);
                        long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator2.e;
                        long j = circularProgressIndicator2.d;
                        if (uptimeMillis < j) {
                            circularProgressIndicator2.postDelayed(circularProgressIndicator2.i, j - uptimeMillis);
                            return;
                        } else {
                            circularProgressIndicator2.i.run();
                            return;
                        }
                    }
                    if (i4 == 1) {
                        AccountLinkingActivity accountLinkingActivity2 = this.a;
                        rsw rswVar = (rsw) obj;
                        ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$2", 138, "AccountLinkingActivity.java")).q("Setting activity result and finishing AccountLinkingActivity");
                        accountLinkingActivity2.setResult(rswVar.a, rswVar.b);
                        accountLinkingActivity2.b();
                        return;
                    }
                    AccountLinkingActivity accountLinkingActivity3 = this.a;
                    List list = (List) obj;
                    rsy rsyVar = accountLinkingActivity3.b;
                    ArrayList arrayList = new ArrayList();
                    aoce aoceVar = rsyVar.k.g;
                    if (aoceVar == null) {
                        aoceVar = aoce.a;
                    }
                    aony aonyVar = aoceVar.b;
                    if (list.contains(rsk.LINKING_INFO)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.q).f(mjy.p).a().c());
                    }
                    if (list.contains(rsk.CAPABILITY_CONSENT)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.r).f(mjy.p).a().c());
                    }
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createDataUsageNoticeFragment", 236, "AccountLinkingActivity.java")).s("urls passed to dataUsageNotice %s ", arrayList);
                    Account account = rsyVar.c;
                    rth rthVar = new rth();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("account", account);
                    bundle2.putStringArray("data_usage_notice_urls", (String[]) arrayList.toArray(new String[0]));
                    rthVar.af(bundle2);
                    accountLinkingActivity3.a(rthVar, true);
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$1", 131, "AccountLinkingActivity.java")).s("Starting data usage notice fragment \"%s\"", list);
                }
            });
            this.e.h.f(this, new aox(this) { // from class: rso
                public final /* synthetic */ AccountLinkingActivity a;

                {
                    this.a = this;
                }

                @Override // defpackage.aox
                public final void a(Object obj) {
                    int i4 = i2;
                    if (i4 == 0) {
                        AccountLinkingActivity accountLinkingActivity = this.a;
                        if (((Boolean) obj).booleanValue()) {
                            CircularProgressIndicator circularProgressIndicator = accountLinkingActivity.c;
                            if (circularProgressIndicator.c > 0) {
                                circularProgressIndicator.removeCallbacks(circularProgressIndicator.h);
                                circularProgressIndicator.postDelayed(circularProgressIndicator.h, circularProgressIndicator.c);
                                return;
                            } else {
                                circularProgressIndicator.h.run();
                                return;
                            }
                        }
                        CircularProgressIndicator circularProgressIndicator2 = accountLinkingActivity.c;
                        if (circularProgressIndicator2.getVisibility() != 0) {
                            circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.h);
                            return;
                        }
                        circularProgressIndicator2.removeCallbacks(circularProgressIndicator2.i);
                        long uptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator2.e;
                        long j = circularProgressIndicator2.d;
                        if (uptimeMillis < j) {
                            circularProgressIndicator2.postDelayed(circularProgressIndicator2.i, j - uptimeMillis);
                            return;
                        } else {
                            circularProgressIndicator2.i.run();
                            return;
                        }
                    }
                    if (i4 == 1) {
                        AccountLinkingActivity accountLinkingActivity2 = this.a;
                        rsw rswVar = (rsw) obj;
                        ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$2", 138, "AccountLinkingActivity.java")).q("Setting activity result and finishing AccountLinkingActivity");
                        accountLinkingActivity2.setResult(rswVar.a, rswVar.b);
                        accountLinkingActivity2.b();
                        return;
                    }
                    AccountLinkingActivity accountLinkingActivity3 = this.a;
                    List list = (List) obj;
                    rsy rsyVar = accountLinkingActivity3.b;
                    ArrayList arrayList = new ArrayList();
                    aoce aoceVar = rsyVar.k.g;
                    if (aoceVar == null) {
                        aoceVar = aoce.a;
                    }
                    aony aonyVar = aoceVar.b;
                    if (list.contains(rsk.LINKING_INFO)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.q).f(mjy.p).a().c());
                    }
                    if (list.contains(rsk.CAPABILITY_CONSENT)) {
                        arrayList.add((String) amqp.d(aonyVar).c(mjw.r).f(mjy.p).a().c());
                    }
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "createDataUsageNoticeFragment", 236, "AccountLinkingActivity.java")).s("urls passed to dataUsageNotice %s ", arrayList);
                    Account account = rsyVar.c;
                    rth rthVar = new rth();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("account", account);
                    bundle2.putStringArray("data_usage_notice_urls", (String[]) arrayList.toArray(new String[0]));
                    rthVar.af(bundle2);
                    accountLinkingActivity3.a(rthVar, true);
                    ((amyf) AccountLinkingActivity.a.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "lambda$onCreate$1", 131, "AccountLinkingActivity.java")).s("Starting data usage notice fragment \"%s\"", list);
                }
            });
            rtd rtdVar = (rtd) eq.c(this).a(rtd.class);
            this.d = rtdVar;
            rtdVar.a.f(this, new aox() { // from class: rsn
                @Override // defpackage.aox
                public final void a(Object obj) {
                    rtc rtcVar = (rtc) obj;
                    rsv rsvVar2 = AccountLinkingActivity.this.e;
                    int i4 = rtcVar.f;
                    if (i4 == 1 && rtcVar.e == 1) {
                        ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", PrivateKeyType.INVALID, "AccountLinkingViewModel.java")).s("Data Usage Notice finished successfully: \"%s\"", rsvVar2.f.b());
                        if (!rtcVar.c.equals("continue_linking")) {
                            rsvVar2.m = rtcVar.c;
                        }
                        if (rsvVar2.l) {
                            rsvVar2.g(aorv.STATE_APP_FLIP);
                            rsvVar2.f(aoru.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                            rsvVar2.l = false;
                        }
                        rsvVar2.e.j((rsl) rsvVar2.c.j.get(rsvVar2.d));
                        return;
                    }
                    if (i4 == 1 && rtcVar.e == 3) {
                        ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 274, "AccountLinkingViewModel.java")).t("Data Usage Notice received unrecoverable error (%s) during flow: \"%s\"", rtcVar.d, rsvVar2.f.b());
                        rsvVar2.h(rtcVar, "Linking failed: Received unrecoverable error during linking.");
                        return;
                    }
                    if (i4 != 2 || rtcVar.e != 1) {
                        if (i4 == 2 && rtcVar.e == 3) {
                            ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 291, "AccountLinkingViewModel.java")).t("Received unrecoverable error (%s) during flow \"%s\"", rtcVar.d, rsvVar2.e.b());
                            rsvVar2.h(rtcVar, "Linking failed: Received unrecoverable error during linking.");
                            return;
                        }
                        if (i4 == 2 && rtcVar.e == 2) {
                            ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 300, "AccountLinkingViewModel.java")).t("Received recoverable error (%s) during flow \"%s\"", rtcVar.d, rsvVar2.e.b());
                            int i5 = rsvVar2.d + 1;
                            rsvVar2.d = i5;
                            if (i5 >= rsvVar2.c.j.size()) {
                                ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 305, "AccountLinkingViewModel.java")).q("Attempted all flows but failed");
                                rsvVar2.h(rtcVar, "Linking failed: All account linking flows were attempted");
                                return;
                            } else if (rsvVar2.e.b() == rsl.STREAMLINED_LINK_ACCOUNT && rsvVar2.k && rsvVar2.j == aorv.STATE_ACCOUNT_SELECTION && rsvVar2.c.o.contains(rsk.CAPABILITY_CONSENT)) {
                                ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 314, "AccountLinkingViewModel.java")).q("Streamlined screen failed to load and trying to load Data Usage Notice consent screen.");
                                rsvVar2.f.l(amru.r(rsk.CAPABILITY_CONSENT));
                                return;
                            } else {
                                rsl rslVar = (rsl) rsvVar2.c.j.get(rsvVar2.d);
                                ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 325, "AccountLinkingViewModel.java")).s("Attempting next flow: \"%s\"", rslVar);
                                rsvVar2.e.j(rslVar);
                                return;
                            }
                        }
                        return;
                    }
                    ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "onFlowResponse", 282, "AccountLinkingViewModel.java")).s("Flow \"%s\" received successful response; finishing flow...", rsvVar2.e.b());
                    rub rubVar = rsvVar2.i;
                    rsl rslVar2 = (rsl) rsvVar2.e.b();
                    String str = rtcVar.c;
                    rsl rslVar3 = rsl.APP_FLIP;
                    int ordinal = rslVar2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1 || ordinal == 2) {
                            if (rsvVar2.c.m) {
                                rsvVar2.a(str);
                                return;
                            } else {
                                rsvVar2.g(aorv.STATE_COMPLETE);
                                rsvVar2.i(rqr.h(str));
                                return;
                            }
                        }
                        if (ordinal != 3) {
                            return;
                        }
                        rsvVar2.h.j(true);
                        rsy rsyVar = rsvVar2.c;
                        int i6 = rsyVar.e;
                        Account account = rsyVar.c;
                        String str2 = rsyVar.i;
                        String str3 = rsvVar2.m;
                        aone createBuilder = aoby.a.createBuilder();
                        if (str3 != null) {
                            createBuilder.copyOnWrite();
                            ((aoby) createBuilder.instance).e = str3;
                        }
                        aocq d = rubVar.d(i6);
                        createBuilder.copyOnWrite();
                        aoby aobyVar = (aoby) createBuilder.instance;
                        d.getClass();
                        aobyVar.b = d;
                        createBuilder.copyOnWrite();
                        aoby aobyVar2 = (aoby) createBuilder.instance;
                        str2.getClass();
                        aobyVar2.c = str2;
                        createBuilder.copyOnWrite();
                        aoby aobyVar3 = (aoby) createBuilder.instance;
                        str.getClass();
                        aobyVar3.d = str;
                        final aoby aobyVar4 = (aoby) createBuilder.build();
                        anaf.Y(rubVar.b(account, new rua() { // from class: rtw
                            @Override // defpackage.rua
                            public final anhy a(aobp aobpVar) {
                                aoby aobyVar5 = aoby.this;
                                axzp axzpVar = aobpVar.a;
                                aych aychVar = aobq.d;
                                if (aychVar == null) {
                                    synchronized (aobq.class) {
                                        aychVar = aobq.d;
                                        if (aychVar == null) {
                                            ayce a2 = aych.a();
                                            a2.c = aycg.UNARY;
                                            a2.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "FinishOAuth");
                                            a2.b();
                                            a2.a = ayom.b(aoby.a);
                                            a2.b = ayom.b(aobz.a);
                                            aychVar = a2.a();
                                            aobq.d = aychVar;
                                        }
                                    }
                                }
                                return ayox.a(axzpVar.a(aychVar, aobpVar.b), aobyVar5);
                            }
                        }), new rsr(rsvVar2), angq.a);
                        return;
                    }
                    rsvVar2.h.j(true);
                    rsy rsyVar2 = rsvVar2.c;
                    int i7 = rsyVar2.e;
                    Account account2 = rsyVar2.c;
                    String str4 = rsyVar2.i;
                    amru g3 = rsyVar2.a.g();
                    String str5 = rsvVar2.m;
                    aone createBuilder2 = aobt.a.createBuilder();
                    aocq d2 = rubVar.d(i7);
                    createBuilder2.copyOnWrite();
                    aobt aobtVar = (aobt) createBuilder2.instance;
                    d2.getClass();
                    aobtVar.b = d2;
                    aone createBuilder3 = aocb.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aocb aocbVar = (aocb) createBuilder3.instance;
                    str4.getClass();
                    aocbVar.b = str4;
                    createBuilder2.copyOnWrite();
                    aobt aobtVar2 = (aobt) createBuilder2.instance;
                    aocb aocbVar2 = (aocb) createBuilder3.build();
                    aocbVar2.getClass();
                    aobtVar2.c = aocbVar2;
                    aone createBuilder4 = aobs.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    aobs aobsVar = (aobs) createBuilder4.instance;
                    str.getClass();
                    aobsVar.b = str;
                    createBuilder2.copyOnWrite();
                    aobt aobtVar3 = (aobt) createBuilder2.instance;
                    aobs aobsVar2 = (aobs) createBuilder4.build();
                    aobsVar2.getClass();
                    aobtVar3.d = aobsVar2;
                    if (str5 != null) {
                        createBuilder2.copyOnWrite();
                        ((aobt) createBuilder2.instance).e = str5;
                    } else {
                        aone createBuilder5 = aobs.a.createBuilder();
                        createBuilder5.copyOnWrite();
                        aobs aobsVar3 = (aobs) createBuilder5.instance;
                        str.getClass();
                        aobsVar3.b = str;
                        createBuilder5.copyOnWrite();
                        aobs aobsVar4 = (aobs) createBuilder5.instance;
                        aony aonyVar = aobsVar4.c;
                        if (!aonyVar.c()) {
                            aobsVar4.c = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) g3, (List) aobsVar4.c);
                        createBuilder2.copyOnWrite();
                        aobt aobtVar4 = (aobt) createBuilder2.instance;
                        aobs aobsVar5 = (aobs) createBuilder5.build();
                        aobsVar5.getClass();
                        aobtVar4.d = aobsVar5;
                    }
                    anaf.Y(rubVar.b(account2, new rtz(createBuilder2, 1)), new rsq(rsvVar2), angq.a);
                }
            });
            rsv rsvVar2 = this.e;
            if (rsvVar2.e.b() != null) {
                ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 173, "AccountLinkingViewModel.java")).q("Account linking flows are already started");
                return;
            }
            if (!rsvVar2.c.o.isEmpty() && rsvVar2.f.b() != null) {
                ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 179, "AccountLinkingViewModel.java")).q("Account linking data usage notice is already started");
                return;
            }
            if (rsvVar2.c.j.isEmpty()) {
                ((amyf) ((amyf) rsv.b.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 184, "AccountLinkingViewModel.java")).q("No account linking flow is enabled by server");
                rsvVar2.i(rqr.g(1, "Linking failed; No account linking flow is enabled by server"));
                return;
            }
            rsl rslVar = (rsl) rsvVar2.c.j.get(0);
            if (rslVar == rsl.APP_FLIP) {
                PackageManager packageManager = rsvVar2.a.getPackageManager();
                aocd aocdVar = rsvVar2.c.k.f;
                if (aocdVar == null) {
                    aocdVar = aocd.a;
                }
                aobo aoboVar = aocdVar.b;
                if (aoboVar == null) {
                    aoboVar = aobo.a;
                }
                aony aonyVar = aoboVar.b;
                amru g3 = rsvVar2.c.a.g();
                aocd aocdVar2 = rsvVar2.c.k.f;
                if (aocdVar2 == null) {
                    aocdVar2 = aocd.a;
                }
                if (!rui.a(packageManager, aonyVar, g3, aocdVar2.c).h()) {
                    ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 204, "AccountLinkingViewModel.java")).q("3p app not installed");
                    rsvVar2.l = true;
                    if (rsvVar2.c.o.isEmpty()) {
                        rsvVar2.g(aorv.STATE_APP_FLIP);
                        rsvVar2.f(aoru.EVENT_APP_FLIP_3P_APP_NOT_SUPPORTED);
                    }
                    int i4 = rsvVar2.d + 1;
                    rsvVar2.d = i4;
                    if (i4 >= rsvVar2.c.j.size()) {
                        ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 214, "AccountLinkingViewModel.java")).q("Attempted all flows but failed");
                        rsvVar2.i(rqr.g(1, "Linking failed; All account linking flows were attempted"));
                        return;
                    } else {
                        rslVar = (rsl) rsvVar2.c.j.get(rsvVar2.d);
                        ((amyf) rsv.b.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "startIfNotStarted", 223, "AccountLinkingViewModel.java")).s("3p app not installed, move to next flow, %s ", rslVar);
                    }
                }
            }
            if (rslVar == rsl.STREAMLINED_LINK_ACCOUNT) {
                rsvVar2.k = true;
            }
            if ((rslVar == rsl.APP_FLIP || rslVar == rsl.WEB_OAUTH) && !rsvVar2.c.o.isEmpty()) {
                rsvVar2.f.j(rsvVar2.c.o);
            } else if (rslVar == rsl.STREAMLINED_LINK_ACCOUNT && rsvVar2.c.o.contains(rsk.LINKING_INFO)) {
                rsvVar2.f.j(amru.r(rsk.LINKING_INFO));
            } else {
                rsvVar2.e.j(rslVar);
            }
        } catch (Exception unused) {
            ((amyf) ((amyf) a.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onCreate", 66, "AccountLinkingActivity.java")).q("Unable to parse arguments from bundle.");
            rsw g4 = rqr.g(1, "Unable to parse arguments from bundle.");
            setResult(g4.a, g4.b);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        rtc a2;
        rtc rtcVar;
        super.onNewIntent(intent);
        this.e.f(aoru.EVENT_APP_AUTH_RECEIVE_NEW_INTENT);
        amyi amyiVar = a;
        ((amyf) amyiVar.k().i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 160, "AccountLinkingActivity.java")).q("AccountLinkingActivity received onNewIntent()");
        ce f = getSupportFragmentManager().f("flow_fragment");
        if (f instanceof rtn) {
            rtn rtnVar = (rtn) f;
            rtnVar.af.f(aoru.EVENT_APP_AUTH_FRAGMENT_HANDLE_INTENT);
            ((amyf) rtn.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 195, "WebOAuthFragment.java")).q("WebOAuthFragment received handleNewIntent()");
            intent.getClass();
            rtnVar.ag = true;
            Uri data = intent.getData();
            if (data == null) {
                ((amyf) rtn.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 201, "WebOAuthFragment.java")).q("Uri in new intent is null");
                a2 = rtn.c;
                rtnVar.af.f(aoru.EVENT_APP_AUTH_NULL_RESPONSE_URI);
            } else if (data.getQueryParameterNames().contains("error")) {
                String queryParameter = data.getQueryParameter("error");
                ((amyf) rtn.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 206, "WebOAuthFragment.java")).s("WebOAuth received parameter error: %s", queryParameter);
                if (rtn.d.containsKey(queryParameter)) {
                    rtcVar = (rtc) rtn.d.get(queryParameter);
                } else {
                    rtcVar = rtn.b;
                }
                rtnVar.af.f((aoru) rtn.e.getOrDefault(queryParameter, aoru.EVENT_APP_AUTH_OTHER));
                a2 = rtcVar;
            } else {
                String queryParameter2 = data.getQueryParameter("redirect_state");
                ((amyf) rtn.a.k().i("com/google/android/libraries/accountlinking/flows/weboauth/WebOAuthFragment", "handleNewIntent", 217, "WebOAuthFragment.java")).s("WebOAuth received parameter state [hidden (isEmpty=%s)]", Boolean.valueOf(TextUtils.isEmpty(queryParameter2)));
                if (TextUtils.isEmpty(queryParameter2)) {
                    a2 = rtn.b;
                    rtnVar.af.f(aoru.EVENT_APP_AUTH_NO_REDIRECT_STATE);
                } else {
                    a2 = rtc.a(2, queryParameter2);
                    rtnVar.af.f(aoru.EVENT_APP_AUTH_SUCCESS);
                }
            }
            rtnVar.ae.a(a2);
            return;
        }
        ((amyf) ((amyf) amyiVar.g()).i("com/google/android/libraries/accountlinking/activity/AccountLinkingActivity", "onNewIntent", 166, "AccountLinkingActivity.java")).q("Illegal state: there is no WebOAuthFragment when onNewIntent() is called");
    }
}

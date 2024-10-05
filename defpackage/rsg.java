package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rsg {
    public static final amrz a;
    public final Context b;
    public final rsi c;
    public final rub d;
    public final rtq e;
    private final ruf f;

    static {
        amrw h = amrz.h();
        h.g(rsl.APP_FLIP, aobl.MOBILE_APP_REDIRECT_FLOW);
        h.g(rsl.STREAMLINED_LINK_ACCOUNT, aobl.GSI_OAUTH_LINKING_FLOW);
        h.g(rsl.STREAMLINED_CREATE_ACCOUNT, aobl.GSI_OAUTH_CREATION_FLOW);
        h.g(rsl.WEB_OAUTH, aobl.OAUTH2_FLOW);
        a = h.c();
        amrw h2 = amrz.h();
        h2.g(aobm.DATA_USAGE_NOTICE_TYPE_LINKING_INFO, rsk.LINKING_INFO);
        h2.g(aobm.DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT, rsk.CAPABILITY_CONSENT);
        h2.c();
    }

    public rsg(Context context, rsi rsiVar) {
        this.b = context;
        this.c = rsiVar;
        try {
            ruf f = rqr.f(context, rsiVar.c, 443);
            this.f = f;
            rue rueVar = (rue) f;
            rub rubVar = new rub(context, rueVar.a, rueVar.b, ammv.i(null), ammv.i(null));
            this.d = rubVar;
            this.e = new rtq(rubVar);
        } catch (IllegalStateException e) {
            throw new rsj(1, "Initialization failed", e);
        }
    }

    public static int a() {
        return new Random().nextInt(2147483646) + 1;
    }

    public static List b(Set set) {
        return amqp.d(set).f(mjy.n).g();
    }

    public final void c() {
        this.f.a();
    }

    public final anhy d(anhy anhyVar, final Account account, final String str, final int i, final Set set, final Set set2) {
        return anfq.h(anhyVar, new amml() { // from class: rsf
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                rsg rsgVar = rsg.this;
                Account account2 = account;
                String str2 = str;
                int i2 = i;
                Set set3 = set;
                Set set4 = set2;
                aocm aocmVar = (aocm) obj;
                rsx rsxVar = new rsx();
                rsxVar.c = account2;
                rsxVar.i = str2;
                rsxVar.e = i2;
                ArrayList arrayList = new ArrayList();
                if (aocmVar.f != null) {
                    arrayList.add(rsl.APP_FLIP);
                }
                if (aocmVar.c != null || aocmVar.d != null) {
                    arrayList.add(rsl.STREAMLINED_LINK_ACCOUNT);
                }
                if (aocmVar.b != null) {
                    arrayList.add(rsl.WEB_OAUTH);
                }
                rsxVar.d(arrayList);
                rsxVar.g = rsgVar.c.c;
                rsxVar.h = 443;
                rsxVar.f = null;
                rsxVar.b(set3);
                rsxVar.e(set4);
                rsxVar.k = aocmVar;
                aocd aocdVar = aocmVar.f;
                if (aocdVar != null) {
                    rsxVar.f(new HashSet(aocdVar.d));
                }
                if (aocmVar.g != null) {
                    rsxVar.c(new ArrayList());
                }
                Intent intent = new Intent(rsgVar.b, (Class<?>) AccountLinkingActivity.class);
                rsy a2 = rsxVar.a();
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("scopes", new ArrayList<>(a2.a));
                bundle.putStringArrayList("capabilities", new ArrayList<>(a2.b));
                bundle.putParcelable("account", a2.c);
                bundle.putBoolean("using_custom_dependency_supplier", a2.d);
                bundle.putInt("session_id", a2.e);
                String str3 = a2.f;
                if (str3 != null) {
                    bundle.putString("bucket", str3);
                }
                bundle.putString("service_host", a2.g);
                bundle.putInt("service_port", a2.h);
                bundle.putString("service_id", a2.i);
                bundle.putStringArrayList("flows", new ArrayList<>(amqp.d(a2.j).f(mjy.r).g()));
                bundle.putByteArray("linking_session", a2.k.toByteArray());
                bundle.putStringArrayList("google_scopes", new ArrayList<>(a2.l));
                bundle.putBoolean("two_way_account_linking", a2.m);
                bundle.putInt("account_linking_entry_point", a2.n);
                bundle.putStringArrayList("data_usage_notices", new ArrayList<>(amqp.d(a2.o).f(mjy.q).g()));
                bundle.putStringArrayList("experiment_server_tokens", new ArrayList<>(a2.p));
                intent.putExtras(bundle);
                return intent;
            }
        }, angq.a);
    }
}

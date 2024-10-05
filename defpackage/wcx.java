package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcx implements wdd, wdm {
    public final SharedPreferences a;
    public final wgv b;
    public final wcq c;
    public final boolean d;
    private final Map e;
    private AccountIdentity f;
    private wdk g;
    private boolean h;
    private volatile boolean i;
    private final azrw j;
    private final azrw k;

    public wcx(SharedPreferences sharedPreferences, wgv wgvVar, yxx yxxVar, azrw azrwVar, wcq wcqVar, azrw azrwVar2) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        wgvVar.getClass();
        this.b = wgvVar;
        this.c = wcqVar;
        azrwVar.getClass();
        this.k = azrwVar;
        this.j = azrwVar2;
        this.e = new HashMap();
        this.i = false;
        yxxVar.getClass();
        this.d = yxxVar.o(yxx.N);
    }

    private final AccountIdentity x() {
        int i = this.a.getInt(wcy.NEXT_INCOGNITO_SESSION_INDEX, 0);
        String a = wcy.a(i);
        while (this.c.b(a) != null) {
            i++;
            a = wcy.a(i);
        }
        this.a.edit().putInt(wcy.NEXT_INCOGNITO_SESSION_INDEX, i + 1).apply();
        return AccountIdentity.r(a, a);
    }

    private static final boolean y(amru amruVar, String str) {
        return Collection.EL.stream(amruVar).anyMatch(new opz(str, 3));
    }

    private final void z(int i) {
        acpk acpkVar = (acpk) this.j.get();
        arpn a = arpp.a();
        aone createBuilder = aoux.a.createBuilder();
        createBuilder.copyOnWrite();
        aoux aouxVar = (aoux) createBuilder.instance;
        aouxVar.e = i - 1;
        aouxVar.b |= 4;
        a.copyOnWrite();
        ((arpp) a.instance).bY((aoux) createBuilder.build());
        acpkVar.a((arpp) a.build());
    }

    @Override // defpackage.wdm
    public final synchronized wdk a() {
        if (!t()) {
            return wdk.a;
        }
        if (!this.h) {
            this.g = this.c.a(this.f);
            this.h = true;
        }
        return this.g;
    }

    @Override // defpackage.wdm
    public final synchronized wdk b(AccountIdentity accountIdentity) {
        return this.c.a(accountIdentity);
    }

    @Override // defpackage.afsy
    public final synchronized afsx c() {
        if (!this.i) {
            l();
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity != null) {
            return accountIdentity;
        }
        return afsw.a;
    }

    @Override // defpackage.afsy
    public final afsx d(String str) {
        yjk.e();
        if (!this.i) {
            l();
        }
        if ("".equals(str)) {
            return afsw.a;
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity == null || !accountIdentity.d().equals(str)) {
            if (str == null || !str.startsWith("incognito_session_")) {
                return this.c.b(str);
            }
            return AccountIdentity.r(str, str);
        }
        return this.f;
    }

    public final int e() {
        return this.a.getInt(wcy.IDENTITY_VERSION, 2);
    }

    @Override // defpackage.aftp
    public final synchronized String f() {
        if (u()) {
            return this.a.getString("incognito_visitor_id", null);
        }
        if (!t() || !this.f.h()) {
            return this.a.getString("visitor_id", null);
        }
        return this.a.getString("persona_visitor_data", null);
    }

    @Override // defpackage.afsy
    public final synchronized String g() {
        if (u()) {
            return this.a.getString("incognito_visitor_id", null);
        }
        return this.a.getString("visitor_id", null);
    }

    @Override // defpackage.wdd
    public final List h(Account[] accountArr) {
        String[] strArr;
        String sb;
        yjk.e();
        accountArr.getClass();
        int length = accountArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = accountArr[i].name;
        }
        wcu wcuVar = (wcu) this.c;
        wcuVar.b.block();
        if (length == 0) {
            sb = null;
            strArr = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("account NOT IN (");
            for (int i2 = 0; i2 < length - 1; i2++) {
                sb2.append("?, ");
            }
            sb2.append("?)");
            strArr = strArr2;
            sb = sb2.toString();
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = wcuVar.a.getReadableDatabase().query("identity", wda.a, sb, strArr, null, null, null, null);
        while (query.moveToNext()) {
            try {
                if (!query.isNull(0)) {
                    arrayList.add(wcu.g(query));
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    @Override // defpackage.wdm
    public final synchronized void i() {
        if (t()) {
            this.g = wdk.a;
            this.h = true;
        }
    }

    @Override // defpackage.wdm
    public final void j(AccountIdentity accountIdentity) {
        if (c().d().equals(accountIdentity.d())) {
            this.g = wdk.a;
        }
        ((wcu) this.c).e("profile", "id = ?", new String[]{accountIdentity.d()});
    }

    @Override // defpackage.wdd
    public final synchronized void k() {
        anhy O;
        wgv wgvVar = this.b;
        if (!wgv.e(wgvVar.c)) {
            O = anaf.O(((SharedPreferences) wgvVar.a.get()).getString("pre_incognito_signed_in_user_id", ""));
        } else {
            O = anfq.h(wgvVar.d.a(), wgr.a, angq.a);
        }
        ynm.k(O, angq.a, new ynk() { // from class: wcv
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                wcx wcxVar = wcx.this;
                if (wcxVar.d) {
                    afsi.b(1, 34, "Fail to fetch incognito previousSignedInIdentity");
                }
                wcxVar.a.edit().remove("incognito_visitor_id").apply();
                ynm.i(wcxVar.b.b(), llr.e);
                wcxVar.r(false);
            }
        }, new ynl() { // from class: wcw
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                wcx wcxVar = wcx.this;
                String str = (String) obj;
                afsx afsxVar = null;
                if (str != null) {
                    afsxVar = wcxVar.c.b(str);
                } else if (wcxVar.d) {
                    afsi.b(1, 34, "Fail to resolve incognito previousSignedInIdentity");
                }
                wcxVar.a.edit().remove("incognito_visitor_id").apply();
                ynm.i(wcxVar.b.b(), llr.f);
                if (afsxVar != null) {
                    wcxVar.o((AccountIdentity) afsxVar);
                } else {
                    wcxVar.r(false);
                }
            }
        });
    }

    protected final synchronized void l() {
        if (this.i) {
            return;
        }
        AccountIdentity accountIdentity = null;
        String string = this.a.getString(wcy.ACCOUNT_NAME, null);
        String string2 = this.a.getString(wcy.EXTERNAL_ID, null);
        String string3 = this.a.getString(wcy.DATASYNC_ID, "");
        boolean z = this.a.getBoolean(wcy.IS_INCOGNITO, false);
        boolean z2 = this.a.getBoolean(wcy.PERSONA_ACCOUNT, false);
        boolean z3 = this.a.getBoolean(wcy.IS_UNICORN, false);
        boolean z4 = this.a.getBoolean(wcy.IS_GRIFFIN, false);
        boolean z5 = this.a.getBoolean(wcy.IS_TEENACORN, false);
        int aL = aobq.aL(this.a.getInt(wcy.DELEGTATION_TYPE, 1));
        String string4 = this.a.getString(wcy.PAGE_ID, null);
        String string5 = this.a.getString(wcy.DELEGATION_CONTEXT, "NO_DELEGATION_CONTEXT");
        if (true == "No +Page Delegate".equals(string4)) {
            string4 = "";
        }
        if ("".equals(string3) && string2 != null) {
            if (this.d) {
                afsi.b(2, 34, "Data sync id is empty");
            }
            afsi.b(2, 34, "[Clockwork][Database]Dropping pref acct w/ empty datasync id");
            string3 = string2;
        }
        if (!z && u()) {
            accountIdentity = x();
            o(accountIdentity);
        } else if (string != null && string2 != null) {
            if (z) {
                accountIdentity = AccountIdentity.r(string2, string3);
            } else if (z2) {
                accountIdentity = AccountIdentity.s(string2, string, string3);
            } else if (z3) {
                if (aL == 0) {
                    throw null;
                }
                if (aL == 3) {
                    accountIdentity = AccountIdentity.p(string2, string, string3);
                } else {
                    accountIdentity = AccountIdentity.u(string2, string, string3, z5);
                }
            } else if (z4) {
                if (aL == 0) {
                    throw null;
                }
                if (aL == 3) {
                    accountIdentity = AccountIdentity.o(string2, string, string3);
                } else {
                    accountIdentity = AccountIdentity.q(string2, string, string3, z5);
                }
            } else if ("NO_DELEGATION_CONTEXT".equals(string5) || TextUtils.isEmpty(string5)) {
                accountIdentity = AccountIdentity.n(string2, string, string4, string3);
            } else {
                accountIdentity = AccountIdentity.B(string2, string, string3, aL, string5);
            }
        }
        this.f = accountIdentity;
        this.h = false;
        this.g = wdk.a;
        this.i = true;
    }

    @Override // defpackage.wdd
    public final void m(List list) {
        yjk.e();
        list.getClass();
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((AccountIdentity) list.get(i)).a();
        }
        wcu wcuVar = (wcu) this.c;
        wcuVar.b.block();
        if (size == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account IN (");
        for (int i2 = 0; i2 < size - 1; i2++) {
            sb.append("?, ");
        }
        sb.append("?)");
        wcuVar.e("identity", sb.toString(), strArr);
    }

    @Override // defpackage.wdd
    public final synchronized void n(String str, String str2) {
        if (t() && str.equals(this.f.a())) {
            this.f = AccountIdentity.n(this.f.d(), str2, this.f.e(), this.f.b());
            this.a.edit().putString(wcy.ACCOUNT_NAME, str2).apply();
        }
        wcq wcqVar = this.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str2);
        ((wcu) wcqVar).b.close();
        ((wcu) wcqVar).c.execute(new wcr((wcu) wcqVar, contentValues, new String[]{str}));
    }

    @Override // defpackage.wdd
    public final synchronized void o(AccountIdentity accountIdentity) {
        zhq.m(accountIdentity.d());
        zhq.m(accountIdentity.a());
        this.a.edit().putString(wcy.ACCOUNT_NAME, accountIdentity.a()).putString(wcy.PAGE_ID, accountIdentity.e()).putBoolean(wcy.PERSONA_ACCOUNT, accountIdentity.h()).putBoolean(wcy.IS_INCOGNITO, accountIdentity.g()).putString(wcy.EXTERNAL_ID, accountIdentity.d()).putInt(wcy.IDENTITY_VERSION, 2).putString(wcy.DATASYNC_ID, accountIdentity.b()).putBoolean(wcy.IS_UNICORN, accountIdentity.j()).putBoolean(wcy.IS_GRIFFIN, accountIdentity.f()).putBoolean(wcy.IS_TEENACORN, accountIdentity.i()).putInt(wcy.DELEGTATION_TYPE, accountIdentity.l() - 1).putString(wcy.DELEGATION_CONTEXT, accountIdentity.c()).apply();
        if (!accountIdentity.g()) {
            this.a.edit().putBoolean(wcy.USER_SIGNED_OUT, false).remove("incognito_visitor_id").apply();
            ynm.i(this.b.b(), llr.h);
        }
        this.c.c(accountIdentity);
        if (!accountIdentity.g()) {
            this.e.put(accountIdentity.b(), accountIdentity);
        }
        this.f = accountIdentity;
        this.g = wdk.a;
        this.h = false;
        this.i = true;
        ((wka) this.k.get()).b(accountIdentity);
    }

    @Override // defpackage.wdd
    public final synchronized void p(String str) {
        anhy anhyVar;
        if (t()) {
            String d = c().d();
            wgv wgvVar = this.b;
            wgvVar.b = d;
            if (!wgv.e(wgvVar.c)) {
                ((SharedPreferences) wgvVar.a.get()).edit().putString("pre_incognito_signed_in_user_id", d).apply();
                anhyVar = anhv.a;
            } else {
                anhyVar = wgv.f(wgvVar.d, d);
            }
            ynm.i(anhyVar, llr.g);
        }
        r(true);
        this.a.edit().putString("incognito_visitor_id", str).apply();
        o(x());
    }

    @Override // defpackage.wdm
    public final synchronized void q(wdk wdkVar) {
        if (t()) {
            this.g = wdkVar;
            this.h = true;
            wcq wcqVar = this.c;
            String d = this.f.d();
            if (wdkVar != null && !wdkVar.equals(wdk.a)) {
                aqyg aqygVar = wdkVar.c;
                if (aqygVar != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", d);
                    contentValues.put("profile_account_name_proto", aqygVar.toByteArray());
                    wcu.h(contentValues, "profile_account_photo_thumbnails_proto", wdkVar.e);
                    wcu.h(contentValues, "profile_mobile_banner_thumbnails_proto", wdkVar.f);
                    ((wcu) wcqVar).f("profile", contentValues);
                    return;
                }
                throw new IllegalArgumentException("accountNameProto cannot be null");
            }
        }
    }

    @Override // defpackage.wdd
    public final synchronized void r(boolean z) {
        this.a.edit().remove(wcy.ACCOUNT_NAME).remove(wcy.PAGE_ID).remove(wcy.PERSONA_ACCOUNT).remove(wcy.EXTERNAL_ID).remove(wcy.USERNAME).remove(wcy.DATASYNC_ID).remove(wcy.IS_UNICORN).remove(wcy.IS_GRIFFIN).remove(wcy.IS_TEENACORN).remove(wcy.DELEGTATION_TYPE).remove(wcy.DELEGATION_CONTEXT).putBoolean(wcy.USER_SIGNED_OUT, z).putInt(wcy.IDENTITY_VERSION, 2).apply();
        this.i = false;
        this.f = null;
        this.g = wdk.a;
        this.h = true;
        ((wka) this.k.get()).b(afsw.a);
    }

    @Override // defpackage.wdd
    public final synchronized boolean s() {
        return this.a.getBoolean(wcy.USER_SIGNED_OUT, false);
    }

    @Override // defpackage.afsy
    public final synchronized boolean t() {
        boolean z;
        if (!this.i) {
            l();
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity != null) {
            z = accountIdentity.g() ? false : true;
        }
        return z;
    }

    final boolean u() {
        return this.a.getString("incognito_visitor_id", null) != null;
    }

    public final synchronized amru v() {
        yjk.e();
        amru d = ((wcu) this.c).d("(is_persona != 0 OR (page_id != \"\" AND page_id IS NOT NULL)) AND datasync_id != \"\"", "youtube-delegated");
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity == null) {
            return d;
        }
        if (!whu.i(accountIdentity).equals("youtube-delegated") || y(d, whu.j(accountIdentity))) {
            return d;
        }
        z(19);
        amrp f = amru.f();
        f.j(d);
        f.h(whu.h(accountIdentity));
        return f.g();
    }

    public final synchronized amru w() {
        yjk.e();
        amru d = ((wcu) this.c).d("is_persona = 0 AND (page_id = \"\" OR page_id IS NULL) AND datasync_id != \"\"", "youtube-direct");
        afsx c = c();
        if (!whu.i(c).equals("youtube-direct")) {
            return d;
        }
        if (y(d, whu.j(c))) {
            return d;
        }
        z(18);
        amrp f = amru.f();
        f.j(d);
        f.h(whu.h(c));
        return f.g();
    }
}

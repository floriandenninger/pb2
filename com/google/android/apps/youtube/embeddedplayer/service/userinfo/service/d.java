package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
import defpackage.afsw;
import defpackage.afsx;
import defpackage.amru;
import defpackage.wcy;
import defpackage.wdd;
import defpackage.wdk;
import defpackage.wdm;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements wdd, wdm {
    private final SharedPreferences a;
    private AccountIdentity b;
    private wdk c;
    private boolean d;

    public d(SharedPreferences sharedPreferences, f fVar) {
        sharedPreferences.getClass();
        this.a = new c(sharedPreferences, fVar.a);
        this.d = false;
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.wdm
    public final synchronized wdk a() {
        return this.c;
    }

    @Override // defpackage.wdm
    public final synchronized wdk b(AccountIdentity accountIdentity) {
        AccountIdentity accountIdentity2 = this.b;
        if (accountIdentity2 == null || !((C$AutoValue_AccountIdentity) accountIdentity2).a.equals(accountIdentity.d())) {
            return wdk.a;
        }
        return this.c;
    }

    @Override // defpackage.afsy
    public final synchronized afsx c() {
        if (!this.d) {
            l();
        }
        AccountIdentity accountIdentity = this.b;
        if (accountIdentity != null) {
            return accountIdentity;
        }
        return afsw.a;
    }

    @Override // defpackage.afsy
    public final synchronized afsx d(String str) {
        if ("".equals(str)) {
            return afsw.a;
        }
        AccountIdentity accountIdentity = this.b;
        if (accountIdentity == null || !((C$AutoValue_AccountIdentity) accountIdentity).a.equals(str)) {
            return null;
        }
        return this.b;
    }

    @Override // defpackage.aftp
    public final synchronized String f() {
        return this.a.getString("visitor_id", null);
    }

    @Override // defpackage.afsy
    public final String g() {
        return this.a.getString("visitor_id", null);
    }

    @Override // defpackage.wdd
    public final List h(Account[] accountArr) {
        accountArr.getClass();
        AccountIdentity accountIdentity = this.b;
        if (accountIdentity != null) {
            String str = ((C$AutoValue_AccountIdentity) accountIdentity).b;
            for (Account account : accountArr) {
                if (!str.equals(account.name)) {
                }
            }
            return amru.r(this.b);
        }
        return amru.q();
    }

    @Override // defpackage.wdm
    public final synchronized void i() {
        this.c = wdk.a;
    }

    @Override // defpackage.wdm
    public final void j(AccountIdentity accountIdentity) {
        AccountIdentity accountIdentity2 = this.b;
        if (accountIdentity2 == null || !((C$AutoValue_AccountIdentity) accountIdentity2).a.equals(accountIdentity.d())) {
            return;
        }
        this.c = wdk.a;
    }

    @Override // defpackage.wdd
    public final void k() {
    }

    protected final synchronized void l() {
        if (this.d) {
            return;
        }
        String str = null;
        String string = this.a.getString(wcy.ACCOUNT_NAME, null);
        String string2 = this.a.getString(wcy.EXTERNAL_ID, null);
        String string3 = this.a.getString(wcy.DATASYNC_ID, null);
        if (string == null || string2 == null) {
            this.b = null;
        } else {
            String string4 = this.a.getString(wcy.PAGE_ID, null);
            if (true != "No +Page Delegate".equals(string4)) {
                str = string4;
            }
            this.b = AccountIdentity.n(string2, string, str, string3);
        }
        this.d = true;
    }

    @Override // defpackage.wdd
    public final void m(List list) {
        list.getClass();
        AccountIdentity accountIdentity = this.b;
        if (accountIdentity == null) {
            return;
        }
        String str = ((C$AutoValue_AccountIdentity) accountIdentity).b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(((AccountIdentity) it.next()).a())) {
                r(false);
                return;
            }
        }
    }

    @Override // defpackage.wdd
    public final void n(String str, String str2) {
        if (!this.d) {
            l();
        }
        AccountIdentity accountIdentity = this.b;
        if (accountIdentity != null) {
            C$AutoValue_AccountIdentity c$AutoValue_AccountIdentity = (C$AutoValue_AccountIdentity) accountIdentity;
            if (str.equals(c$AutoValue_AccountIdentity.b)) {
                o(AccountIdentity.n(c$AutoValue_AccountIdentity.a, str2, c$AutoValue_AccountIdentity.c, c$AutoValue_AccountIdentity.g));
            }
        }
    }

    @Override // defpackage.wdd
    public final synchronized void o(AccountIdentity accountIdentity) {
        this.a.edit().putString(wcy.ACCOUNT_NAME, accountIdentity.a()).putString(wcy.PAGE_ID, accountIdentity.e()).putString(wcy.EXTERNAL_ID, accountIdentity.d()).putString(wcy.DATASYNC_ID, accountIdentity.b()).putBoolean(wcy.USER_SIGNED_OUT, false).apply();
        this.d = false;
    }

    @Override // defpackage.wdd
    public final void p(String str) {
    }

    @Override // defpackage.wdm
    public final synchronized void q(wdk wdkVar) {
        this.c = wdkVar;
    }

    @Override // defpackage.wdd
    public final synchronized void r(boolean z) {
        this.a.edit().remove(wcy.ACCOUNT_NAME).remove(wcy.PAGE_ID).remove(wcy.EXTERNAL_ID).remove(wcy.USERNAME).remove(wcy.DATASYNC_ID).putBoolean(wcy.USER_SIGNED_OUT, z).apply();
        this.d = false;
    }

    @Override // defpackage.wdd
    public final synchronized boolean s() {
        return this.a.getBoolean(wcy.USER_SIGNED_OUT, false);
    }

    @Override // defpackage.afsy
    public final synchronized boolean t() {
        if (!this.d) {
            l();
        }
        return this.b != null;
    }
}

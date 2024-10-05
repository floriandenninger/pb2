package com.google.android.libraries.youtube.account.identity;

/* compiled from: PG */
/* renamed from: com.google.android.libraries.youtube.account.identity.$AutoValue_AccountIdentity, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C$AutoValue_AccountIdentity extends AccountIdentity {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final int l;

    public C$AutoValue_AccountIdentity(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, boolean z6, int i, String str5) {
        if (str == null) {
            throw new NullPointerException("Null getId");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            if (str3 != null) {
                this.c = str3;
                this.d = z;
                this.e = z2;
                this.f = z3;
                if (str4 != null) {
                    this.g = str4;
                    this.h = z4;
                    this.i = z5;
                    this.j = z6;
                    if (i != 0) {
                        this.l = i;
                        if (str5 != null) {
                            this.k = str5;
                            return;
                        }
                        throw new NullPointerException("Null getDelegationContext");
                    }
                    throw new NullPointerException("Null getGaiaDelegationType");
                }
                throw new NullPointerException("Null getDataSyncId");
            }
            throw new NullPointerException("Null getPageId");
        }
        throw new NullPointerException("Null getAccountName");
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity, defpackage.afsx
    public final String b() {
        return this.g;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity, defpackage.afsx
    public final String c() {
        return this.k;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity, defpackage.afsx
    public final String d() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity, defpackage.afsx
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) obj;
            if (this.a.equals(accountIdentity.d()) && this.b.equals(accountIdentity.a()) && this.c.equals(accountIdentity.e()) && this.d == accountIdentity.g() && this.e == accountIdentity.k() && this.f == accountIdentity.h() && this.g.equals(accountIdentity.b()) && this.h == accountIdentity.j() && this.i == accountIdentity.f() && this.j == accountIdentity.i() && this.l == accountIdentity.l() && this.k.equals(accountIdentity.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final boolean f() {
        return this.i;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity, defpackage.afsx
    public final boolean g() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final boolean h() {
        return this.f;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final boolean i() {
        return this.j;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final boolean j() {
        return this.h;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final boolean k() {
        return this.e;
    }

    @Override // com.google.android.libraries.youtube.account.identity.AccountIdentity
    public final int l() {
        return this.l;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        String str4 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        boolean z6 = this.j;
        String num = Integer.toString(this.l - 1);
        String str5 = this.k;
        int length = str.length();
        int length2 = str2.length();
        int length3 = str3.length();
        StringBuilder sb = new StringBuilder(length + 222 + length2 + length3 + str4.length() + num.length() + str5.length());
        sb.append("AccountIdentity{getId=");
        sb.append(str);
        sb.append(", getAccountName=");
        sb.append(str2);
        sb.append(", getPageId=");
        sb.append(str3);
        sb.append(", isIncognito=");
        sb.append(z);
        sb.append(", wasUnicorn=");
        sb.append(z2);
        sb.append(", isPersona=");
        sb.append(z3);
        sb.append(", getDataSyncId=");
        sb.append(str4);
        sb.append(", isUnicorn=");
        sb.append(z4);
        sb.append(", isGriffin=");
        sb.append(z5);
        sb.append(", isTeenacorn=");
        sb.append(z6);
        sb.append(", getGaiaDelegationType=");
        sb.append(num);
        sb.append(", getDelegationContext=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}

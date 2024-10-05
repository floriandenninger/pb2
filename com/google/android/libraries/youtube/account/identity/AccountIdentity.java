package com.google.android.libraries.youtube.account.identity;

import android.os.Parcelable;
import defpackage.afsx;
import defpackage.aobq;
import defpackage.aonw;
import defpackage.aovo;
import defpackage.apud;
import defpackage.aqih;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class AccountIdentity implements Parcelable, Serializable, afsx {
    public static AccountIdentity A(String str, String str2, String str3, boolean z, String str4) {
        return C(str, str2, str3, false, z, false, false, false, false, 2, str4);
    }

    public static AccountIdentity B(String str, String str2, String str3, int i, String str4) {
        return new AutoValue_AccountIdentity(str, str2, "", false, false, false, str3 == null ? "" : str3, false, false, false, i, str4);
    }

    private static AccountIdentity C(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, String str4) {
        return new AutoValue_AccountIdentity(str, str2, str3 == null ? "" : str3, z, z2, z3, str4 == null ? "" : str4, z4, z5, z6, i, "NO_DELEGATION_CONTEXT");
    }

    private static AccountIdentity D(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, String str3) {
        return C(str, str2, null, false, false, z, z2, z3, z4, i, str3);
    }

    public static AccountIdentity m(apud apudVar) {
        if ((apudVar.c & 128) != 0) {
            String str = apudVar.h;
            String str2 = apudVar.i;
            aqih aqihVar = apudVar.j;
            if (aqihVar == null) {
                aqihVar = aqih.a;
            }
            String str3 = aqihVar.b;
            int aL = aobq.aL(apudVar.f);
            if (aL == 0) {
                aL = 1;
            }
            return B(str, str2, str3, aL, apudVar.k);
        }
        if (!new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
            if (!new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
                if (new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                    int aL2 = aobq.aL(apudVar.f);
                    if (aL2 == 0 || aL2 != 3) {
                        String str4 = apudVar.h;
                        String str5 = apudVar.i;
                        aqih aqihVar2 = apudVar.j;
                        if (aqihVar2 == null) {
                            aqihVar2 = aqih.a;
                        }
                        return u(str4, str5, aqihVar2.b, new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU));
                    }
                    String str6 = apudVar.d;
                    String str7 = apudVar.i;
                    aqih aqihVar3 = apudVar.j;
                    if (aqihVar3 == null) {
                        aqihVar3 = aqih.a;
                    }
                    return p(str6, str7, aqihVar3.b);
                }
                if (!new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                    String str8 = apudVar.h;
                    String str9 = apudVar.i;
                    aqih aqihVar4 = apudVar.j;
                    if (aqihVar4 == null) {
                        aqihVar4 = aqih.a;
                    }
                    return n(str8, str9, null, aqihVar4.b);
                }
                int aL3 = aobq.aL(apudVar.f);
                if (aL3 == 0 || aL3 != 3) {
                    String str10 = apudVar.h;
                    String str11 = apudVar.i;
                    aqih aqihVar5 = apudVar.j;
                    if (aqihVar5 == null) {
                        aqihVar5 = aqih.a;
                    }
                    return q(str10, str11, aqihVar5.b, new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_UNICORN_OVER_13_IN_EU));
                }
                String str12 = apudVar.d;
                String str13 = apudVar.i;
                aqih aqihVar6 = apudVar.j;
                if (aqihVar6 == null) {
                    aqihVar6 = aqih.a;
                }
                return o(str12, str13, aqihVar6.b);
            }
            String str14 = apudVar.d;
            String str15 = apudVar.i;
            aqih aqihVar7 = apudVar.j;
            if (aqihVar7 == null) {
                aqihVar7 = aqih.a;
            }
            return s(str14, str15, aqihVar7.b);
        }
        String str16 = apudVar.h;
        String str17 = apudVar.i;
        String str18 = apudVar.d;
        aqih aqihVar8 = apudVar.j;
        if (aqihVar8 == null) {
            aqihVar8 = aqih.a;
        }
        return n(str16, str17, str18, aqihVar8.b);
    }

    public static AccountIdentity n(String str, String str2, String str3, String str4) {
        return A(str, str2, str3, false, str4);
    }

    public static AccountIdentity o(String str, String str2, String str3) {
        return D(str, str2, false, false, true, false, 3, str3);
    }

    public static AccountIdentity p(String str, String str2, String str3) {
        return D(str, str2, false, true, false, false, 3, str3);
    }

    public static AccountIdentity q(String str, String str2, String str3, boolean z) {
        return D(str, str2, false, false, true, z, 2, str3);
    }

    public static AccountIdentity r(String str, String str2) {
        return C(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str2);
    }

    public static AccountIdentity s(String str, String str2, String str3) {
        return D(str, str2, true, false, false, false, 3, str3);
    }

    public static AccountIdentity t(String str) {
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "PRIMORDIAL-".concat(valueOf) : new String("PRIMORDIAL-");
        String valueOf2 = String.valueOf(str);
        return A(concat, str, "", false, valueOf2.length() != 0 ? "PRIMORDIAL-".concat(valueOf2) : new String("PRIMORDIAL-"));
    }

    public static AccountIdentity u(String str, String str2, String str3, boolean z) {
        return D(str, str2, false, true, false, z, 2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public final int hashCode() {
        return d().hashCode();
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();

    @Override // defpackage.afsx
    public final boolean v() {
        return !"NO_DELEGATION_CONTEXT".equals(c());
    }

    @Override // defpackage.afsx
    public final boolean w() {
        return !e().equals("");
    }

    @Override // defpackage.afsx
    public final boolean x() {
        return w() || v() || h() || l() != 2;
    }

    @Override // defpackage.afsx
    public final boolean y() {
        return false;
    }

    @Override // defpackage.afsx
    public final boolean z() {
        return g();
    }
}

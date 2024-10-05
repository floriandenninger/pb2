package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class roo {
    public static final qnw a;
    public static final pse b;
    public static final pse c;
    public static final qar d;
    static final qar e;

    static {
        pse pseVar = new pse();
        b = pseVar;
        pse pseVar2 = new pse();
        c = pseVar2;
        rol rolVar = new rol();
        d = rolVar;
        rom romVar = new rom();
        e = romVar;
        new Scope("profile");
        new Scope("email");
        a = new qnw("SignIn.API", rolVar, pseVar, null, null, null, null);
        new qnw("SignIn.INTERNAL_API", romVar, pseVar2, null, null, null, null);
    }
}

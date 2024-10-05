package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwm implements agwv {
    private final shf a;
    private final zgj b;
    private final agww c;
    private final Key d;
    private final afhf e;
    private final agsm f;

    public agwm(shf shfVar, zgj zgjVar, agww agwwVar, ajkn ajknVar, SharedPreferences sharedPreferences, afhf afhfVar, agsm agsmVar, byte[] bArr) {
        this.a = shfVar;
        this.b = zgjVar;
        this.c = agwwVar;
        this.d = ajknVar.e(sharedPreferences);
        this.e = afhfVar;
        this.f = agsmVar;
    }

    @Override // defpackage.agwv
    public final aguf a(agnz agnzVar, ague agueVar, agwk agwkVar, agsn agsnVar) {
        agwkVar.b(this.d);
        agwkVar.b = this.e;
        return new agwi(agueVar, this.a, this.b, agnzVar, agwkVar, this.c, agsnVar, this.f);
    }
}

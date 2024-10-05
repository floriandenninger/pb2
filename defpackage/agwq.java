package defpackage;

import android.content.SharedPreferences;
import java.security.Key;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwq implements agwv {
    private final shf a;
    private final zgj b;
    private final aapf c;
    private final agww d;
    private final Key e;
    private final afhf f;
    private final agmu g;
    private final agsm h;
    private final afgt i;
    private final agzr j;
    private final aeha k;
    private final agzp l;

    public agwq(shf shfVar, zgj zgjVar, aapf aapfVar, agww agwwVar, ajkn ajknVar, SharedPreferences sharedPreferences, agmu agmuVar, afhf afhfVar, agsm agsmVar, afgt afgtVar, agzr agzrVar, aeha aehaVar, agzp agzpVar, byte[] bArr) {
        this.a = shfVar;
        this.b = zgjVar;
        this.c = aapfVar;
        this.d = agwwVar;
        this.e = ajknVar.e(sharedPreferences);
        this.f = afhfVar;
        this.h = agsmVar;
        this.g = agmuVar;
        this.i = afgtVar;
        this.j = agzrVar;
        this.k = aehaVar;
        this.l = agzpVar;
    }

    @Override // defpackage.agwv
    public final aguf a(agnz agnzVar, ague agueVar, agwk agwkVar, agsn agsnVar) {
        agwkVar.b(this.e);
        agwkVar.b = this.f;
        return new agwr(agueVar, agsnVar, this.c, this.a, this.b, agnzVar, new agwj(agwkVar), new agwj(new agwk(agwkVar)), this.d, this.h, this.g, this.i, this.j, this.k, this.l, null);
    }
}

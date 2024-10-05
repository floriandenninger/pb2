package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jjl implements jhx {
    public final /* synthetic */ aalc a;
    public final /* synthetic */ agni b;
    private final /* synthetic */ int c;

    public /* synthetic */ jjl(aalc aalcVar, agni agniVar, int i) {
        this.c = i;
        this.a = aalcVar;
        this.b = agniVar;
    }

    @Override // defpackage.jhx
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            aalc aalcVar = this.a;
            agni agniVar = this.b;
            amsx amsxVar = jjo.a;
            ((jjs) obj).k(aalcVar, agniVar);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                jke.l(this.a, this.b, (Set) obj);
                return;
            } else {
                jke.l(this.a, this.b, (Set) obj);
                return;
            }
        }
        aalc aalcVar2 = this.a;
        agni agniVar2 = this.b;
        amsx amsxVar2 = jjo.a;
        ((jjs) obj).h(aalcVar2, agniVar2);
    }
}

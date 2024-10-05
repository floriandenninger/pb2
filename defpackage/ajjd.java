package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjd implements syz {
    @Override // defpackage.syz
    public final aomu a() {
        return aviq.b;
    }

    @Override // defpackage.syz
    public final /* bridge */ /* synthetic */ void b(dhe dheVar, Object obj, syy syyVar) {
        aviq aviqVar = (aviq) obj;
        if (aviqVar.d) {
            akba a = akba.a(dheVar.b);
            a.b = syyVar.d;
            int i = aviqVar.c;
            if ((i & 2) != 0) {
                a.a = aviqVar.e;
            }
            if ((i & 4) != 0) {
                a.c(aviqVar.f);
            }
            syyVar.d = a.b();
        }
    }
}

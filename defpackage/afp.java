package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afp {
    static final boolean[] a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(afl aflVar, afb afbVar, afk afkVar) {
        afkVar.p = -1;
        afkVar.q = -1;
        if (aflVar.ap[0] != 2 && afkVar.ap[0] == 4) {
            int i = afkVar.f45J.f;
            int j = aflVar.j() - afkVar.L.f;
            afj afjVar = afkVar.f45J;
            afjVar.h = afbVar.b(afjVar);
            afj afjVar2 = afkVar.L;
            afjVar2.h = afbVar.b(afjVar2);
            afbVar.f(afkVar.f45J.h, i);
            afbVar.f(afkVar.L.h, j);
            afkVar.p = 2;
            afkVar.Y = i;
            int i2 = j - i;
            afkVar.U = i2;
            int i3 = afkVar.ab;
            if (i2 < i3) {
                afkVar.U = i3;
            }
        }
        if (aflVar.ap[1] == 2 || afkVar.ap[1] != 4) {
            return;
        }
        int i4 = afkVar.K.f;
        int h = aflVar.h() - afkVar.M.f;
        afj afjVar3 = afkVar.K;
        afjVar3.h = afbVar.b(afjVar3);
        afj afjVar4 = afkVar.M;
        afjVar4.h = afbVar.b(afjVar4);
        afbVar.f(afkVar.K.h, i4);
        afbVar.f(afkVar.M.h, h);
        if (afkVar.aa > 0 || afkVar.ag == 8) {
            afj afjVar5 = afkVar.N;
            afjVar5.h = afbVar.b(afjVar5);
            afbVar.f(afkVar.N.h, afkVar.aa + i4);
        }
        afkVar.q = 2;
        afkVar.Z = i4;
        int i5 = h - i4;
        afkVar.V = i5;
        int i6 = afkVar.ac;
        if (i5 < i6) {
            afkVar.V = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}

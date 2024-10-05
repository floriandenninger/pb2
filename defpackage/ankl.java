package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankl {
    static {
        Charset.forName("UTF-8");
    }

    public static anoi a(anog anogVar) {
        aone createBuilder = anoi.a.createBuilder();
        int i = anogVar.b;
        createBuilder.copyOnWrite();
        ((anoi) createBuilder.instance).b = i;
        for (anof anofVar : anogVar.c) {
            aone createBuilder2 = anoh.a.createBuilder();
            anoc anocVar = anofVar.b;
            if (anocVar == null) {
                anocVar = anoc.a;
            }
            String str = anocVar.b;
            createBuilder2.copyOnWrite();
            anoh anohVar = (anoh) createBuilder2.instance;
            str.getClass();
            anohVar.b = str;
            int aI = aocz.aI(anofVar.c);
            if (aI == 0) {
                aI = 1;
            }
            createBuilder2.copyOnWrite();
            anoh anohVar2 = (anoh) createBuilder2.instance;
            if (aI != 1) {
                anohVar2.c = aI - 2;
                int aH = aocz.aH(anofVar.e);
                int i2 = aH != 0 ? aH : 1;
                createBuilder2.copyOnWrite();
                ((anoh) createBuilder2.instance).e = aocz.aG(i2);
                int i3 = anofVar.d;
                createBuilder2.copyOnWrite();
                ((anoh) createBuilder2.instance).d = i3;
                anoh anohVar3 = (anoh) createBuilder2.build();
                createBuilder.copyOnWrite();
                anoi anoiVar = (anoi) createBuilder.instance;
                anohVar3.getClass();
                aony aonyVar = anoiVar.c;
                if (!aonyVar.c()) {
                    anoiVar.c = aonm.mutableCopy(aonyVar);
                }
                anoiVar.c.add(anohVar3);
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        return (anoi) createBuilder.build();
    }

    public static void b(anog anogVar) {
        int i = anogVar.b;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (anof anofVar : anogVar.c) {
            int aI = aocz.aI(anofVar.c);
            if (aI != 0 && aI == 3) {
                if (anofVar.b == null) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(anofVar.d)));
                }
                int aH = aocz.aH(anofVar.e);
                if (aH != 0 && aH == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(anofVar.d)));
                }
                int aI2 = aocz.aI(anofVar.c);
                if (aI2 == 0 || aI2 != 2) {
                    if (anofVar.d == i) {
                        if (z) {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z = true;
                    }
                    anoc anocVar = anofVar.b;
                    if (anocVar == null) {
                        anocVar = anoc.a;
                    }
                    int T = aobq.T(anocVar.d);
                    z2 &= T != 0 && T == 5;
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(anofVar.d)));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}

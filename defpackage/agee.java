package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agee implements ylb {
    private final azrw a;
    private final azrw b;
    private final agpd c;
    private final ammv d;
    private final aaea e;

    public agee(azrw azrwVar, azrw azrwVar2, agpd agpdVar, ammv ammvVar, aaea aaeaVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = agpdVar;
        this.d = ammvVar;
        this.e = aaeaVar;
    }

    private final int b(agsn agsnVar) {
        try {
            HashSet<String> hashSet = new HashSet();
            for (agnv agnvVar : (Collection) agsnVar.m().i().get(1L, TimeUnit.MINUTES)) {
                if (agnvVar.p()) {
                    hashSet.add(agnvVar.m());
                }
            }
            for (String str : hashSet) {
                agpd agpdVar = this.c;
                aone createBuilder = atpq.a.createBuilder();
                createBuilder.copyOnWrite();
                atpq atpqVar = (atpq) createBuilder.instance;
                atpqVar.c = 3;
                atpqVar.b |= 1;
                String f = aalt.f(((Integer) ((amna) this.d).a).intValue(), str);
                createBuilder.copyOnWrite();
                atpq atpqVar2 = (atpq) createBuilder.instance;
                f.getClass();
                atpqVar2.b |= 2;
                atpqVar2.d = f;
                agpdVar.d((atpq) createBuilder.build());
            }
            return 0;
        } catch (agpe | InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zga.c("offline", valueOf.length() != 0 ? "[Offline] Couldn't refresh: ".concat(valueOf) : new String("[Offline] Couldn't refresh: "));
            return 1;
        }
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        agsn c;
        String string = bundle.getString("identityId");
        if (string == null || (c = aghv.c((agof) this.a.get(), string)) == null) {
            return 1;
        }
        aaea aaeaVar = this.e;
        if (aaeaVar != null && aaeaVar.a() != null && (aaeaVar.a().b & 512) != 0) {
            atph atphVar = aaeaVar.a().g;
            if (atphVar == null) {
                atphVar = atph.a;
            }
            if (atphVar.u) {
                return b(c);
            }
        }
        ((agrn) this.b.get()).d(string, c);
        return aghv.b(0);
    }
}

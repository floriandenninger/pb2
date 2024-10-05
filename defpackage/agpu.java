package defpackage;

import android.os.Environment;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpu extends aihs {
    private static final long m = TimeUnit.SECONDS.toMillis(5);
    private final azrw n;
    private final azrw o;
    private final aaea p;
    private final agtd q;
    private agej r;
    private final agzz s;
    private final agzr t;

    public agpu(ypa ypaVar, aiij aiijVar, aijp aijpVar, azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, List list, aaea aaeaVar, agtd agtdVar, zgj zgjVar, agzz agzzVar, agzr agzrVar) {
        super(ypaVar, aiijVar, aijpVar, executor, executor2, list, zgjVar);
        this.n = azrwVar;
        this.o = azrwVar2;
        this.p = aaeaVar;
        this.q = agtdVar;
        this.s = agzzVar;
        this.t = agzrVar;
    }

    private final agnv j(String str) {
        try {
            ammv ammvVar = (ammv) ((agof) this.n.get()).a().m().h(str).get(m, TimeUnit.MILLISECONDS);
            if (ammvVar.h()) {
                return (agnv) ammvVar.c();
            }
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    private final boolean k(agnm agnmVar) {
        agtg a;
        char c;
        File file;
        if (agnmVar == null) {
            return false;
        }
        agtd agtdVar = this.q;
        agej agejVar = this.r;
        String f = agnmVar.f();
        if (agejVar == null) {
            return false;
        }
        for (phg phgVar : ((ageh) agejVar).get()) {
            if (phgVar != null && phgVar.g().contains(f)) {
                if (phgVar.l(f, 0L, agnmVar.b())) {
                    a = agtdVar.a.a(agnmVar);
                    c = (a == null || a.c.length == 0) ? (char) 1 : (char) 3;
                } else {
                    c = 2;
                    a = null;
                }
                try {
                    phl c2 = phgVar.c(f, 0L);
                    if (c2 != null && (file = c2.e) != null && file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                        Environment.isExternalStorageEmulated();
                    }
                } catch (phe unused) {
                }
                if (c != 3) {
                    return c == 1;
                }
                a.getClass();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aihs
    public final PlayerResponseModel a(String str, PlayerResponseModel playerResponseModel) {
        agnv j;
        avgg k;
        agnu agnuVar;
        if (!this.s.c() || !((agof) this.n.get()).h() || (j = j(str)) == null) {
            return playerResponseModel;
        }
        atph atphVar = this.t.a.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        if (atphVar.D && ((agnuVar = j.j) == null || !agnuVar.i())) {
            return playerResponseModel;
        }
        aaea aaeaVar = this.p;
        if (aaeaVar != null && aaeaVar.a() != null) {
            atph atphVar2 = aaeaVar.a().g;
            if (atphVar2 == null) {
                atphVar2 = atph.a;
            }
            if (atphVar2.h && (k = j.k()) != null) {
                playerResponseModel.A(new aami(k));
            }
        }
        agnn agnnVar = j.n;
        agej b = ((agof) this.n.get()).a().b();
        this.r = b;
        if (agnnVar == null || b == null) {
            return playerResponseModel;
        }
        aaea aaeaVar2 = this.p;
        PlayerConfigModel c = playerResponseModel.c();
        if (aaeaVar2 != null && aaeaVar2.a() != null) {
            atph atphVar3 = aaeaVar2.a().g;
            if (atphVar3 == null) {
                atphVar3 = atph.a;
            }
            if (atphVar3.g && ((c.aR() || k(agnnVar.a)) && k(agnnVar.b))) {
                aapf aapfVar = (aapf) this.o.get();
                FormatStreamModel d = agnnVar.d(b.g());
                FormatStreamModel b2 = agnnVar.b(b.g());
                long j2 = playerResponseModel.b;
                aryv aryvVar = playerResponseModel.a.h;
                if (aryvVar == null) {
                    aryvVar = aryv.a;
                }
                return aedn.E(playerResponseModel, aapfVar, d, b2, j2, aryvVar.c, false);
            }
        }
        aaea aaeaVar3 = this.p;
        if (aaeaVar3 != null && aaeaVar3.a() != null) {
            atph atphVar4 = aaeaVar3.a().g;
            if (atphVar4 == null) {
                atphVar4 = atph.a;
            }
            if (atphVar4.o && (k(agnnVar.a) || k(agnnVar.b))) {
                aapf aapfVar2 = (aapf) this.o.get();
                FormatStreamModel d2 = agnnVar.d(b.g());
                FormatStreamModel b3 = agnnVar.b(b.g());
                long j3 = playerResponseModel.b;
                aryv aryvVar2 = playerResponseModel.a.h;
                if (aryvVar2 == null) {
                    aryvVar2 = aryv.a;
                }
                return aedn.E(playerResponseModel, aapfVar2, d2, b3, j3, aryvVar2.c, true);
            }
        }
        return aedn.D(playerResponseModel, (aapf) this.o.get(), agnnVar.d(b.g()), agnnVar.b(b.g()));
    }

    public agpu(ypa ypaVar, aiij aiijVar, aijp aijpVar, azrw azrwVar, azrw azrwVar2, Executor executor, Executor executor2, Set set, aaea aaeaVar, aelm aelmVar, shf shfVar, agtd agtdVar, zgj zgjVar, agzz agzzVar, agzr agzrVar, aifk aifkVar) {
        super(ypaVar, aiijVar, aijpVar, executor, executor2, set, aelmVar, shfVar, aaeaVar, aifkVar, zgjVar);
        this.n = azrwVar;
        this.o = azrwVar2;
        this.p = aaeaVar;
        this.q = agtdVar;
        this.s = agzzVar;
        this.t = agzrVar;
    }
}

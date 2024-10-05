package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahzy implements aapt {
    protected final ypa a;
    protected final azrw b;
    protected final azrw c;
    private final Executor d;
    private final azrw e;
    private final azrw f;
    private final WillAutonavInformer g;
    private final ammv h;
    private final Map i;
    private final aadw j;

    public ahzy(ypa ypaVar, Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, WillAutonavInformer willAutonavInformer, aadw aadwVar, ammv ammvVar, Map map) {
        ypaVar.getClass();
        this.a = ypaVar;
        executor.getClass();
        this.d = executor;
        azrwVar.getClass();
        this.e = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.f = azrwVar4;
        willAutonavInformer.getClass();
        this.g = willAutonavInformer;
        this.j = aadwVar;
        this.h = ammvVar;
        this.i = map;
    }

    @Override // defpackage.aapt
    public final /* bridge */ /* synthetic */ ynv a(Object obj, ynu ynuVar) {
        Object a;
        apxf apxfVar = (apxf) obj;
        aial aialVar = (aial) this.i.get(awdp.class);
        atyg F = aifk.F(this.j);
        if (F != null && F.t && (a = aahe.a(apxfVar)) != null && this.i.containsKey(a.getClass())) {
            aialVar = (aial) this.i.get(a.getClass());
        }
        atxo b = aialVar.b(apxfVar);
        if (b == null) {
            return null;
        }
        atxp c = aialVar.c(apxfVar);
        return new aiak(this.d, b(apxfVar, b).g(), ynuVar, (aiaf) this.e.get(), apxfVar, b, c != null ? new ahzw(c, this.f, this.a, aialVar.a(b)) : null, this.a, this.h, (aioc) this.c.get());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amsv b(apxf apxfVar, atxo atxoVar) {
        amsv i = amsx.i();
        if (atxoVar.d != 0) {
            ahzv ahzvVar = new ahzv((ainy) this.b.get(), (aioc) this.c.get(), atxoVar);
            ahzvVar.f.g(ahzvVar.kI(ahzvVar.e));
            if (ahzvVar.d.R() && ahzvVar.d.n() != null) {
                ahzvVar.d(ahzvVar.d.n());
            }
            i.c(ahzvVar);
        }
        if (aiaq.d(atxoVar)) {
            ahzn ahznVar = new ahzn(apxfVar, this.g, (aioc) this.c.get());
            ahznVar.e.g(ahznVar.kI(ahznVar.d));
            i.c(ahznVar);
        }
        return i;
    }
}

package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efj implements azrw {
    private final efk a;
    private final int b;

    public efj(efk efkVar, int i) {
        this.a = efkVar;
        this.b = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        switch (this.b) {
            case 0:
                efk efkVar = this.a;
                return new hye(efkVar.c.a(), (Executor) efkVar.b.f.get());
            case 1:
                efk efkVar2 = this.a;
                return new hyh(efkVar2.c.a(), efkVar2.a, (hye) efkVar2.d.get(), new wcy(), (iax) efkVar2.e.get(), (acqz) efkVar2.c.P.get(), (axze) efkVar2.b.a.cg.get(), null, null, null, null, null);
            case 2:
                efk efkVar3 = this.a;
                return new iax(efkVar3.c.a(), (Handler) efkVar3.b.an.get());
            case 3:
                efk efkVar4 = this.a;
                return new hzu(efkVar4.c.mF(), efkVar4.c.a(), efkVar4.a, (aaea) efkVar4.b.K.get(), efkVar4.a(), new wcy(), (iax) efkVar4.e.get(), (axze) efkVar4.b.a.cg.get(), (akai) efkVar4.b.xH.get(), null, null, null, null, null);
            case 4:
                efk efkVar5 = this.a;
                eed eedVar = efkVar5.c;
                return new ibe(new jgp(eedVar.f, eedVar.mG, (char[]) null), (ci) efkVar5.c.s.get(), (ajjz) efkVar5.b.kp.get(), efkVar5.a, efkVar5.a(), new wcy(), (iax) efkVar5.e.get(), (acqz) efkVar5.c.P.get(), (axze) efkVar5.b.a.cg.get(), null, null, null, null, null);
            case 5:
                efk efkVar6 = this.a;
                return new ibq((ci) efkVar6.c.s.get(), efkVar6.a, efkVar6.a(), new wcy(), (ajjz) efkVar6.b.kp.get(), (Handler) efkVar6.b.an.get(), efkVar6.c.cr(), (aahd) efkVar6.c.I.get(), null, null, null);
            case 6:
                efk efkVar7 = this.a;
                return new ibw((ica) efkVar7.k.get(), efkVar7.a, (Executor) efkVar7.b.f.get(), (axze) efkVar7.b.a.cg.get(), (iax) efkVar7.e.get(), (acqz) efkVar7.c.P.get(), null, null, null, null, null);
            case 7:
                efk efkVar8 = this.a;
                return new ica(efkVar8.c.a(), (ajjz) efkVar8.b.kp.get(), (Executor) efkVar8.b.f.get(), (icn) efkVar8.j.get());
            case 8:
                efk efkVar9 = this.a;
                return new icn(efkVar9.c.a(), (shf) efkVar9.b.g.get(), (Executor) efkVar9.b.f.get());
            case 9:
                efk efkVar10 = this.a;
                return new ico(efkVar10.c.a(), new wcy(), efkVar10.a, (axze) efkVar10.b.a.cg.get(), 1, null, null, null, null, null);
            case 10:
                efk efkVar11 = this.a;
                return new icg(efkVar11.c.a(), (ica) efkVar11.k.get(), new wcy(), (Executor) efkVar11.b.f.get(), efkVar11.a, (acqz) efkVar11.c.P.get(), (iax) efkVar11.e.get(), null, null);
            case 11:
                efk efkVar12 = this.a;
                return new ick((ci) efkVar12.c.s.get(), efkVar12.a, new wcy(), (ajjz) efkVar12.b.kp.get(), efkVar12.c.cr(), null, null);
            default:
                efk efkVar13 = this.a;
                return new ico(efkVar13.c.a(), new wcy(), efkVar13.a, (axze) efkVar13.b.a.cg.get(), 0, null, null, null, null, null);
        }
    }
}

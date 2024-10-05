package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxo extends ajxi {
    private final aasm a;
    private final ypa f;
    private final ajvb g;
    private final RecyclerView h;
    private final nrp i;
    private final ohg j;
    private final ogx k;

    public lxo(aasm aasmVar, ypa ypaVar, ajvb ajvbVar, zaw zawVar, acra acraVar, nrp nrpVar, ogx ogxVar, ohg ohgVar, RecyclerView recyclerView, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(aasmVar, ypaVar, ajvbVar, zawVar, acraVar, null, null, null, null);
        this.a = aasmVar;
        this.f = ypaVar;
        ajvbVar.getClass();
        this.g = ajvbVar;
        this.i = nrpVar;
        this.k = ogxVar;
        this.h = recyclerView;
        this.j = ohgVar;
    }

    @Override // defpackage.ajxi, defpackage.ajvd
    public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
        if (obj instanceof awcd) {
            ohg ohgVar = this.j;
            awcd awcdVar = (awcd) obj;
            RecyclerView recyclerView = this.h;
            Context context = (Context) ohgVar.a.get();
            context.getClass();
            ajvb ajvbVar = (ajvb) ohgVar.c.get();
            ajvbVar.getClass();
            ypa ypaVar = (ypa) ohgVar.g.get();
            ypaVar.getClass();
            Handler handler = (Handler) ohgVar.e.get();
            handler.getClass();
            ajun ajunVar = (ajun) ohgVar.f.get();
            ajunVar.getClass();
            ajun ajunVar2 = (ajun) ohgVar.b.get();
            ajunVar2.getClass();
            ((ajfh) ohgVar.d.get()).getClass();
            awcdVar.getClass();
            return new leu(context, ajvbVar, ypaVar, handler, ajunVar, ajunVar2, awcdVar, recyclerView, ajwxVar, null, null, null, null);
        }
        if (obj instanceof aqvm) {
            return new ltl(this.g, this.f, (aqvm) obj);
        }
        if (obj instanceof aalz) {
            lul c = this.i.c(this.a, this.d, ajxeVar);
            if (ajxeVar == null) {
                c.i((aalz) obj);
            }
            return c;
        }
        if (obj instanceof auod) {
            return new lem((auod) obj);
        }
        if (obj instanceof aamj) {
            ausu ausuVar = ((aamj) obj).a;
            return this.k.b(ausuVar, akbc.i(ausuVar), ajxeVar, null);
        }
        return super.a(obj, ajxeVar, ajwxVar);
    }
}

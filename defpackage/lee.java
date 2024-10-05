package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lee implements ajoq {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final /* synthetic */ int e;

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr) {
        this.e = i;
        azrwVar.getClass();
        this.a = azrwVar;
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.b = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
    }

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i) {
        this.e = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        int i = this.e;
        if (i == 0) {
            Activity activity = (Activity) this.a.get();
            activity.getClass();
            return new led(activity, (lei) this.b.get(), this.c, (lfb) this.d.get(), viewGroup);
        }
        if (i == 1) {
            Activity activity2 = (Activity) this.a.get();
            activity2.getClass();
            ajjz ajjzVar = (ajjz) this.c.get();
            ajjzVar.getClass();
            aahd aahdVar = (aahd) this.b.get();
            aahdVar.getClass();
            akbd akbdVar = (akbd) this.d.get();
            akbdVar.getClass();
            return new lde(activity2, ajjzVar, aahdVar, akbdVar, viewGroup);
        }
        if (i == 2) {
            Context context = (Context) this.b.get();
            context.getClass();
            gma gmaVar = (gma) this.a.get();
            gmaVar.getClass();
            osm osmVar = (osm) this.d.get();
            osmVar.getClass();
            ayqi ayqiVar = (ayqi) this.c.get();
            ayqiVar.getClass();
            return new lql(context, gmaVar, osmVar, ayqiVar, viewGroup);
        }
        if (i == 3) {
            Context context2 = (Context) ((axqs) this.c).a;
            context2.getClass();
            aahd aahdVar2 = (aahd) this.b.get();
            aahdVar2.getClass();
            shf shfVar = (shf) this.a.get();
            shfVar.getClass();
            Executor executor = (Executor) this.d.get();
            executor.getClass();
            viewGroup.getClass();
            return new nhz(context2, aahdVar2, shfVar, executor, viewGroup);
        }
        if (i == 4) {
            aahd aahdVar3 = (aahd) this.b.get();
            aahdVar3.getClass();
            acra acraVar = (acra) this.d.get();
            acraVar.getClass();
            Context context3 = (Context) ((axqs) this.c).a;
            context3.getClass();
            eoa eoaVar = (eoa) this.a.get();
            eoaVar.getClass();
            return new osg(aahdVar3, acraVar, context3, eoaVar, viewGroup);
        }
        Context context4 = (Context) ((axqs) this.c).a;
        context4.getClass();
        aahd aahdVar4 = (aahd) this.b.get();
        aahdVar4.getClass();
        ajjz ajjzVar2 = (ajjz) this.d.get();
        ajjzVar2.getClass();
        ajyg ajygVar = (ajyg) this.a.get();
        ajygVar.getClass();
        viewGroup.getClass();
        return new yir(context4, aahdVar4, ajjzVar2, ajygVar, viewGroup);
    }

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr) {
        this.e = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        this.d = azrwVar3;
        azrwVar4.getClass();
        this.c = azrwVar4;
    }

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[] sArr) {
        this.e = i;
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
    }

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[] iArr) {
        this.e = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.d = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.a = azrwVar4;
    }

    public lee(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[] zArr) {
        this.e = i;
        azrwVar.getClass();
        this.c = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        this.d = azrwVar3;
        azrwVar4.getClass();
        this.a = azrwVar4;
    }
}

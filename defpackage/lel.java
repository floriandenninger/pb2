package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lel implements ajoq {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final /* synthetic */ int f;

    public lel(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, byte[] bArr) {
        this.f = i;
        azrwVar.getClass();
        this.d = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.a = azrwVar4;
        this.e = azrwVar5;
    }

    public lel(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, int[] iArr) {
        this.f = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.e = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.b = azrwVar4;
        this.d = azrwVar5;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        int i = this.f;
        if (i == 0) {
            Activity activity = (Activity) this.a.get();
            activity.getClass();
            ajjz ajjzVar = (ajjz) this.b.get();
            ajjzVar.getClass();
            aahd aahdVar = (aahd) this.c.get();
            aahdVar.getClass();
            SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
            sharedPreferences.getClass();
            akbd akbdVar = (akbd) this.e.get();
            akbdVar.getClass();
            return new lek(activity, ajjzVar, aahdVar, sharedPreferences, akbdVar, viewGroup);
        }
        if (i == 1) {
            Context context = (Context) ((axqs) this.d).a;
            context.getClass();
            aahd aahdVar2 = (aahd) this.b.get();
            aahdVar2.getClass();
            ajyw ajywVar = (ajyw) this.c.get();
            shf shfVar = (shf) this.a.get();
            shfVar.getClass();
            ajjz ajjzVar2 = (ajjz) this.e.get();
            ajjzVar2.getClass();
            return new kzh(context, aahdVar2, ajywVar, shfVar, ajjzVar2, viewGroup, null, null, null, null);
        }
        if (i == 2) {
            Context context2 = (Context) this.d.get();
            context2.getClass();
            aahd aahdVar3 = (aahd) this.c.get();
            aahdVar3.getClass();
            gma gmaVar = (gma) this.a.get();
            gmaVar.getClass();
            keg kegVar = (keg) this.e.get();
            kegVar.getClass();
            ajrv ajrvVar = (ajrv) this.b.get();
            ajrvVar.getClass();
            return new lpp(context2, aahdVar3, gmaVar, kegVar, ajrvVar, viewGroup);
        }
        if (i == 3) {
            Context context3 = (Context) ((axqs) this.b).a;
            context3.getClass();
            ajpe ajpeVar = (ajpe) this.c.get();
            ajpeVar.getClass();
            ajut ajutVar = (ajut) this.d.get();
            ajutVar.getClass();
            akht akhtVar = (akht) this.a.get();
            akhtVar.getClass();
            return new mqg(context3, ajpeVar, ajutVar, akhtVar, (ammv) this.e.get(), viewGroup, null, null, null, null);
        }
        ci ciVar = (ci) this.a.get();
        ciVar.getClass();
        ajyg ajygVar = (ajyg) this.e.get();
        ajygVar.getClass();
        aahd aahdVar4 = (aahd) this.c.get();
        aahdVar4.getClass();
        ajut ajutVar2 = (ajut) this.b.get();
        ajutVar2.getClass();
        ajjz ajjzVar3 = (ajjz) this.d.get();
        ajjzVar3.getClass();
        viewGroup.getClass();
        return new ygk(ciVar, ajygVar, aahdVar4, ajutVar2, ajjzVar3, viewGroup);
    }

    public lel(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i) {
        this.f = i;
        azrwVar.getClass();
        this.a = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
        azrwVar5.getClass();
        this.e = azrwVar5;
    }

    public lel(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, char[] cArr) {
        this.f = i;
        azrwVar.getClass();
        this.d = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
        azrwVar4.getClass();
        this.e = azrwVar4;
        azrwVar5.getClass();
        this.b = azrwVar5;
    }

    public lel(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, int i, short[] sArr) {
        this.f = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.c = azrwVar2;
        azrwVar3.getClass();
        this.d = azrwVar3;
        azrwVar4.getClass();
        this.a = azrwVar4;
        azrwVar5.getClass();
        this.e = azrwVar5;
    }
}

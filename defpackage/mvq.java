package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvq implements muy {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public mvq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        azrwVar.getClass();
        this.c = azrwVar;
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
    }

    @Override // defpackage.muy
    public final /* synthetic */ muz a(ViewGroup viewGroup) {
        if (this.d == 0) {
            aahd aahdVar = (aahd) this.a.get();
            aahdVar.getClass();
            ajut ajutVar = (ajut) this.b.get();
            ajutVar.getClass();
            Context context = (Context) ((axqs) this.c).a;
            context.getClass();
            return new mvp(aahdVar, ajutVar, context, viewGroup);
        }
        ajdw ajdwVar = (ajdw) this.c.get();
        ajdwVar.getClass();
        axpg axpgVar = ((axqv) this.b).get();
        axpgVar.getClass();
        Context context2 = (Context) this.a.get();
        context2.getClass();
        return new mvd(ajdwVar, axpgVar, context2);
    }

    public mvq(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }
}

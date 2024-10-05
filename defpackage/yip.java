package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yip implements ajoq {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public yip(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
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
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yio b(ViewGroup viewGroup) {
        Context context = (Context) ((axqs) this.a).a;
        context.getClass();
        aahd aahdVar = (aahd) this.b.get();
        aahdVar.getClass();
        yje yjeVar = (yje) this.c.get();
        yjh yjhVar = (yjh) this.d.get();
        viewGroup.getClass();
        return new yio(context, aahdVar, yjeVar, yjhVar, viewGroup);
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjc implements ajoq {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public yjc(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
    }

    @Override // defpackage.ajoq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yjb b(ViewGroup viewGroup) {
        Context context = (Context) ((axqs) this.a).a;
        context.getClass();
        aahd aahdVar = (aahd) this.b.get();
        aahdVar.getClass();
        ajjz ajjzVar = (ajjz) this.c.get();
        ajjzVar.getClass();
        yix yixVar = (yix) this.d.get();
        viewGroup.getClass();
        return new yjb(context, aahdVar, ajjzVar, yixVar, viewGroup);
    }
}

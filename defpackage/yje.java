package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yje implements ajoq {
    private final azrw a;
    private final azrw b;

    public yje(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    @Override // defpackage.ajoq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yjd b(ViewGroup viewGroup) {
        Context context = (Context) ((axqs) this.a).a;
        context.getClass();
        yjc yjcVar = (yjc) this.b.get();
        viewGroup.getClass();
        return new yjd(context, yjcVar, viewGroup);
    }
}

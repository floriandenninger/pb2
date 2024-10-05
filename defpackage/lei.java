package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lei implements ajoq {
    private final azrw a;
    private final azrw b;
    private final azrw c;

    public lei(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    @Override // defpackage.ajoq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final leh b(ViewGroup viewGroup) {
        Activity activity = (Activity) this.a.get();
        activity.getClass();
        aahd aahdVar = (aahd) this.b.get();
        aahdVar.getClass();
        ajut ajutVar = (ajut) this.c.get();
        ajutVar.getClass();
        return new leh(activity, aahdVar, ajutVar, viewGroup);
    }
}

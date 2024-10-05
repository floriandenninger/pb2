package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhe implements zhh {
    private final ahe a;

    public zhe(ahe aheVar) {
        this.a = aheVar;
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        ahh ahhVar = (ahh) layoutParams;
        ahe aheVar = ahhVar.a;
        ahe aheVar2 = this.a;
        if (aheVar == aheVar2) {
            return false;
        }
        ahhVar.b(aheVar2);
        return true;
    }
}

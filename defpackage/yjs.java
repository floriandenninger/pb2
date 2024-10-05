package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yjs implements View.OnClickListener {
    final /* synthetic */ yju a;

    public yjs(yju yjuVar) {
        this.a = yjuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aong aongVar;
        this.a.b();
        yju yjuVar = this.a;
        if (view == yjuVar.c) {
            aong aongVar2 = yjuVar.q;
            if (aongVar2 == null) {
                return;
            }
            awhn awhnVar = (awhn) aongVar2.build();
            yjuVar.d(yjj.a(awhnVar) + yjj.b(awhnVar));
            yjuVar.c();
            return;
        }
        if (view != yjuVar.b || (aongVar = yjuVar.q) == null) {
            return;
        }
        awhn awhnVar2 = (awhn) aongVar.build();
        yjuVar.d(yjj.a(awhnVar2) - yjj.b(awhnVar2));
        yjuVar.c();
    }
}

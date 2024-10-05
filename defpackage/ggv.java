package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggv implements View.OnClickListener {
    final /* synthetic */ ggy a;
    private final asno b;
    private final aong c;

    public ggv(ggy ggyVar, aong aongVar, asno asnoVar) {
        this.a = ggyVar;
        this.c = aongVar;
        this.b = asnoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.isSelected()) {
            ikj ikjVar = this.a.d;
            if (ikjVar != null) {
                ikjVar.a(asno.INDIFFERENT);
            }
            this.a.h(asno.INDIFFERENT, this.c);
            return;
        }
        ikj ikjVar2 = this.a.d;
        if (ikjVar2 != null) {
            ikjVar2.a(this.b);
        }
        this.a.h(this.b, this.c);
    }
}

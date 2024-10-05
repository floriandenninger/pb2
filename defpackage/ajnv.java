package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Space;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnv implements ajom {
    private final Context a;
    private final aahd b;
    private View c;
    private final ajun d;

    public ajnv(Context context, aahd aahdVar, ajun ajunVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        this.b = aahdVar;
        this.d = ajunVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        if (this.c == null) {
            this.c = new Space(this.a);
        }
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, aqgn aqgnVar) {
        ajokVar.a.u(new acqx(aqgnVar.b), null);
        if (this.d.m(aqgnVar)) {
            return;
        }
        this.d.l(aqgnVar);
        whl.I(this.b, aqgnVar.c, aqgnVar);
    }
}

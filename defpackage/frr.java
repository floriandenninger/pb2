package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frr implements ajom {
    private final wmw a;
    private final View b;
    private final aoae c;

    public frr(Context context, ViewGroup viewGroup, wmw wmwVar, aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = wmwVar;
        this.c = aoaeVar;
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_metadata_companion_cards, viewGroup, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        Iterator it = this.c.b.iterator();
        while (it.hasNext()) {
            ((won) it.next()).f();
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        wnc wncVar = this.a.a;
        wncVar.getClass();
        View view = this.b;
        wncVar.l = view;
        wncVar.m = ajokVar;
        wmz wmzVar = wncVar.b;
        if (wmzVar != null) {
            wmzVar.d(view, ajokVar);
        }
        aoae aoaeVar = this.c;
        View view2 = this.b;
        Iterator it = aoaeVar.b.iterator();
        while (it.hasNext()) {
            ((won) it.next()).g(view2, ajokVar);
        }
    }
}

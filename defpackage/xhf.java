package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhf implements wot {
    public final aivq a;
    public boolean e;
    private final Bitmap f;
    private final aivs g;
    public int c = 2;
    public xci d = xci.e;
    public final Set b = new HashSet();

    public xhf(Context context, aivs aivsVar, aivq aivqVar, aypn aypnVar) {
        this.g = aivsVar;
        this.a = aivqVar;
        this.f = BitmapFactory.decodeResource(context.getResources(), R.drawable.quantum_ic_cast_connected_white_24);
        aypnVar.n().X(new xhe(this, 2));
    }

    private final void e(aami aamiVar) {
        if (aamiVar == null) {
            aivq aivqVar = this.a;
            aivqVar.k(aivqVar.o, this.f);
        } else {
            this.a.l(aamiVar);
            this.g.b(aamiVar);
        }
    }

    @Override // defpackage.wot
    public final void a(xjo xjoVar) {
        aivq aivqVar = this.a;
        aivqVar.m(aivqVar.l, xjoVar.c);
        avgg avggVar = xjoVar.d;
        e(avggVar == null ? null : new aami(avggVar));
    }

    @Override // defpackage.wot
    public final void b(xci xciVar, int i) {
        this.d = xciVar;
        if (this.c != i) {
            this.c = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                aika aikaVar = ((xhh) it.next()).a;
                if (aikaVar != null) {
                    ((aiki) aikaVar).a(false);
                }
            }
        }
    }

    @Override // defpackage.wot
    public final void c() {
        this.a.d();
        e(null);
    }

    @Override // defpackage.wot
    public final void d(PlayerResponseModel playerResponseModel) {
        String x = playerResponseModel == null ? null : playerResponseModel.x();
        aivq aivqVar = this.a;
        aivqVar.m(x, aivqVar.m);
        if (this.a.p == null) {
            e(playerResponseModel != null ? playerResponseModel.b() : null);
        }
    }
}

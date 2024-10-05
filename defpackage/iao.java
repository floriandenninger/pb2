package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment.StickerCatalogRecyclerView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iao extends hzi {
    public iai a;
    public boolean b;
    public StickerCatalogRecyclerView c;

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        this.a.e.removeCallbacksAndMessages(iai.d);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.sticker_page_fragment, viewGroup, false);
        StickerCatalogRecyclerView stickerCatalogRecyclerView = (StickerCatalogRecyclerView) inflate.findViewById(R.id.sticker_page);
        this.c = stickerCatalogRecyclerView;
        stickerCatalogRecyclerView.ac(this.a);
        this.a.r = this;
        return inflate;
    }

    public final void o(int i) {
        this.c.W.q(i);
        iai iaiVar = this.a;
        amkq.E(i > 0);
        iaiVar.t = i;
        iaiVar.p.f = i - 1;
    }

    public final void p(List list) {
        ian ianVar;
        iai iaiVar = this.a;
        iaiVar.f.clear();
        List list2 = iaiVar.f;
        list.getClass();
        list2.addAll(list);
        final icn icnVar = iaiVar.q;
        if (icnVar.a.h()) {
            final HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ammv G = etx.G((aulq) it.next());
                ammv F = !G.h() ? amlr.a : etx.F((Uri) G.c());
                if (F.h()) {
                    hashSet.add((String) F.c());
                }
            }
            icnVar.c.execute(new Runnable() { // from class: icm
                @Override // java.lang.Runnable
                public final void run() {
                    icn icnVar2 = icn.this;
                    ((zom) icnVar2.a.c()).a(hashSet);
                }
            });
        }
        if (list.isEmpty() && (ianVar = iaiVar.s) != null) {
            ianVar.aL(false);
        }
        this.a.mw();
        this.b = true;
    }
}

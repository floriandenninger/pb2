package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwx extends bwe {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ bxa d;

    public bwx(bxa bxaVar, ViewGroup viewGroup, View view, View view2) {
        this.d = bxaVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void a(bwd bwdVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        bwdVar.B(this);
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void c() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void d() {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        bxa bxaVar = this.d;
        int size = bxaVar.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) bxaVar.l.get(size)).cancel();
            }
        }
        ArrayList arrayList = bxaVar.m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) bxaVar.m.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((bwc) arrayList2.get(i)).b();
        }
    }
}

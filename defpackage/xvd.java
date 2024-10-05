package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xvd implements ajom {
    private final View a;
    private xom b;

    public xvd(Context context) {
        this.a = LayoutInflater.from(context).inflate(R.layout.comment_ghost_card, (ViewGroup) null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        xom xomVar = this.b;
        if (xomVar != null) {
            xomVar.c(this.a);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        xyu xyuVar = (xyu) obj;
        xom xomVar = (xom) ajokVar.c("commentGhostCardAnimController");
        this.b = xomVar;
        if (xomVar == null) {
            return;
        }
        View view = this.a;
        int i = xyuVar.a;
        xomVar.c(view);
        long d = xomVar.a.d();
        long j = xomVar.c;
        if (j == -1) {
            xomVar.c = d;
            j = d;
        }
        Animator a = xom.a(view, ((((d - j) - (i * 225)) % 2200) + 2200) % 2200);
        if (a != null) {
            a.addListener(new xol(xomVar, view));
            a.start();
            xomVar.b.put(view, a);
        }
    }
}

package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggy {
    public boolean a = false;
    public Optional b = Optional.empty();
    public final List c = new LinkedList();
    public ikj d = null;
    private final ghd e;

    public ggy(ghd ghdVar) {
        this.e = ghdVar;
    }

    public static boolean g(asni asniVar) {
        if (asniVar == null || (asniVar.b & 1) == 0) {
            return false;
        }
        asnp asnpVar = asniVar.c;
        if (asnpVar == null) {
            asnpVar = asnp.a;
        }
        return !asnpVar.d.isEmpty();
    }

    private final void k(asno asnoVar, aong aongVar) {
        for (ggw ggwVar : this.c) {
            ggwVar.e(asnoVar, aongVar);
            ggwVar.a(ggwVar.d.getResources().getString(true != ggwVar.d(asnoVar) ? R.string.accessibility_save_to_playlists : R.string.accessibility_remove_from_playlists));
        }
    }

    public final void a(View view) {
        this.c.add(new ggx(view, true));
    }

    public final void b(View view) {
        this.c.add(new ggw(view, false));
    }

    public final void c(View view) {
        this.c.add(new ggx(view, false));
    }

    public final void d() {
        this.a = false;
    }

    public final void e() {
        this.a = true;
    }

    public final void f(asno asnoVar) {
        k(asnoVar, null);
    }

    public final void h(asno asnoVar, aong aongVar) {
        this.b = Optional.ofNullable(asnoVar);
        ghd ghdVar = this.e;
        asni asniVar = (asni) aongVar.build();
        int i = 1;
        byte[] bArr = null;
        ghdVar.a(asnoVar, asniVar, new ggu(this, i, bArr), new ggu(this, 0), new ggu(this, i, bArr));
    }

    public final void i(aong aongVar) {
        if (aongVar == null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ggw) it.next()).c(8);
            }
            return;
        }
        for (ggw ggwVar : this.c) {
            ggwVar.c(0);
            ggwVar.b(((asni) aongVar.instance).o);
            ggwVar.d.setOnClickListener(new ggv(this, aongVar, ggwVar.c ? asno.DISLIKE : asno.LIKE));
        }
        if (g((asni) aongVar.build())) {
            k(adyu.dt(aongVar), aongVar);
        } else {
            j(adyu.dt(aongVar), aongVar);
        }
    }

    public final void j(asno asnoVar, aong aongVar) {
        for (ggw ggwVar : this.c) {
            ggwVar.e(asnoVar, aongVar);
            int[] iArr = !ggwVar.c ? ggw.a : ggw.b;
            Resources resources = ggwVar.d.getResources();
            int i = aongVar == null ? 0 : !ggwVar.c ? ((asni) aongVar.instance).e : ((asni) aongVar.instance).i;
            ggwVar.a(ggwVar.d(asnoVar) ? i > 0 ? resources.getQuantityString(iArr[3], i, Integer.valueOf(i)) : resources.getString(iArr[1]) : i > 0 ? resources.getQuantityString(iArr[2], i, Integer.valueOf(i)) : resources.getString(iArr[0]));
        }
    }
}

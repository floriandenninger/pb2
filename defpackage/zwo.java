package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwo extends vw {
    public zwl d;
    public boolean e;
    private final Context f;
    private final List g = new ArrayList();
    private final Executor h;
    private final int i;
    private final zwn j;

    public zwo(Context context, Executor executor, int i) {
        context.getClass();
        this.f = context;
        executor.getClass();
        this.h = executor;
        this.i = i;
        this.j = new zwn((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1048576) / 4);
    }

    private static void D(zwp zwpVar) {
        zwm zwmVar;
        if (zwpVar == null || (zwmVar = zwpVar.d) == null) {
            return;
        }
        zwmVar.a();
        zwpVar.d = null;
    }

    public static void y(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof zwp) {
                D((zwp) childAt);
            }
        }
    }

    final boolean A() {
        return this.i != 0;
    }

    public final boolean B() {
        return this.g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C(int i) {
        return i == 0 && A();
    }

    @Override // defpackage.vw
    public final int b() {
        return A() ? this.g.size() + 1 : this.g.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return C(i) ? 0 : 1;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        zwk zwkVar = (zwk) wvVar;
        if (C(i)) {
            return;
        }
        DeviceLocalFile w = w(i);
        zwp E = zwkVar.E();
        D(E);
        E.a.setContentDescription(w.h());
        ammv ammvVar = (ammv) this.j.c(w);
        if (ammvVar == null) {
            E.a();
            E.d(null);
            E.c(0L);
            zwm zwmVar = new zwm(this.f, this, this.j, w, E, i);
            E.d = zwmVar;
            zwmVar.executeOnExecutor(this.h, new Void[0]);
            return;
        }
        if (!ammvVar.h()) {
            E.a.setBackgroundColor(E.c);
            E.b.setVisibility(0);
            E.d(null);
            E.c(w.b());
            return;
        }
        E.a();
        E.d((Bitmap) ammvVar.c());
        E.c(w.b());
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        D(((zwk) wvVar).E());
    }

    final DeviceLocalFile w(int i) {
        List list = this.g;
        if (A()) {
            i--;
        }
        return (DeviceLocalFile) list.get(i);
    }

    public final Object x(int i) {
        if (i == -1 || C(i) || i >= b()) {
            return null;
        }
        return w(i);
    }

    public final void z(List list) {
        this.g.clear();
        this.g.addAll(list);
        mw();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new zwk(this, LayoutInflater.from(viewGroup.getContext()).inflate(this.i, viewGroup, false));
        }
        if (A()) {
            return new zwk(this, new zwq(this.f));
        }
        return new zwk(this, new zwp(this.f, this.e));
    }
}

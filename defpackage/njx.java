package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njx {
    private final amnv a;
    private final amnv b;
    private final amnv c;

    public njx(Context context) {
        amkq.x(new nju(context, 1));
        this.a = amkq.x(new nju(context, 0));
        this.b = amkq.x(new nju(context, 2));
        this.c = amkq.x(new nju(context, 3));
    }

    public final EdgeEffect a(int i) {
        if (i == 1) {
            return (EdgeEffect) this.a.get();
        }
        if (i != 2) {
            return (EdgeEffect) this.c.get();
        }
        return (EdgeEffect) this.b.get();
    }

    public final void b(int i, View view, EdgeEffect edgeEffect) {
        WeakHashMap weakHashMap;
        if (i == 1) {
            njw njwVar = (njw) this.a.get();
            int i2 = njw.b;
            weakHashMap = njwVar.a;
        } else if (i != 2) {
            njw njwVar2 = (njw) this.c.get();
            int i3 = njw.b;
            weakHashMap = njwVar2.a;
        } else {
            njw njwVar3 = (njw) this.b.get();
            int i4 = njw.b;
            weakHashMap = njwVar3.a;
        }
        weakHashMap.put(view, new WeakReference(edgeEffect));
    }
}

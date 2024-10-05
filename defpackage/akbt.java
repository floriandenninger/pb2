package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbt {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final akco d;

    public akbt(akbu akbuVar, arej arejVar, View view, acra acraVar, akbl akblVar) {
        this.d = new akco(arejVar.c, view, akbuVar.e);
        this.a = new WeakReference(arejVar);
        this.b = new WeakReference(acraVar);
        this.c = new WeakReference(akblVar);
    }
}

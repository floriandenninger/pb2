package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmb {
    public final ahmc a;
    public final ahkv b;
    public final ViewGroup c;
    public final Context d;
    public final ahkm e;
    public final ahki f;
    public final Resources g;

    public ahmb(ViewGroup viewGroup, Context context, ahkm ahkmVar, ahki ahkiVar) {
        viewGroup.getClass();
        this.c = viewGroup;
        ahkmVar.getClass();
        this.e = ahkmVar;
        this.d = context;
        Resources resources = context.getResources();
        resources.getClass();
        this.g = resources;
        ahkiVar.getClass();
        this.f = ahkiVar;
        this.b = ahkiVar.a().clone();
        this.a = new ahmc(ahkmVar, ahkiVar);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajmv implements ajom {
    private final ajop a;
    private final ajnc b;
    private final ViewGroup c;

    public ajmv(Context context, ajop ajopVar, ajos ajosVar) {
        ajopVar.getClass();
        this.a = ajopVar;
        ViewGroup d = d(context);
        this.c = d;
        this.b = e(context, ajosVar);
        ajopVar.c(d);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.e(this.c);
    }

    protected abstract ViewGroup d(Context context);

    protected abstract ajnc e(Context context, ajos ajosVar);

    protected void f(int i, ajok ajokVar, ajni ajniVar) {
    }

    protected void g(ajok ajokVar, ajni ajniVar) {
        throw null;
    }

    @Override // defpackage.ajom
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, ajni ajniVar) {
        this.c.removeAllViews();
        int i = ajniVar.a;
        f(i, ajokVar, ajniVar);
        for (int i2 = 0; i2 < i; i2++) {
            Object b = ajniVar.b(i2);
            ajnc ajncVar = this.b;
            ajok d = ajncVar.d(ajokVar);
            d.f("rowData", new ajnr(i2, i));
            i(ajncVar.f(d, b, this.c), ajniVar, i2);
        }
        g(ajokVar, ajniVar);
        this.a.e(ajokVar);
    }

    protected abstract void i(View view, ajni ajniVar, int i);
}

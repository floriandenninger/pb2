package defpackage;

import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class odc extends ocy implements obp, obo {
    final obp d;
    final obp e;
    protected final Rect f;
    protected final Rect g;
    protected final Rect h;
    final Rect i;
    final Rect j;

    public odc(obp obpVar, obp obpVar2) {
        super(obpVar2);
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.d = obpVar;
        this.e = obpVar2;
    }

    public abstract void b();

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        b();
    }

    @Override // defpackage.ocy, defpackage.obp
    public final Rect r() {
        return this.h;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final Rect s() {
        return this.j;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final Rect t() {
        return this.f;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final Rect u() {
        return this.i;
    }

    @Override // defpackage.ocy, defpackage.obp
    public final Rect v() {
        return this.g;
    }
}

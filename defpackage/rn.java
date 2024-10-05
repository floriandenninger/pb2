package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rn implements kb {
    int a;
    final /* synthetic */ ro b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public rn(ro roVar) {
        this.b = roVar;
    }

    @Override // defpackage.kb
    public final void a(View view) {
        if (this.c) {
            return;
        }
        ro roVar = this.b;
        roVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.kb
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.kb
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    public final void d(ka kaVar, int i) {
        this.b.f = kaVar;
        this.a = i;
    }
}

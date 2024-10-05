package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: for, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cfor implements ajwk {
    public final SwipeRefreshLayout a;
    public int b;
    public final azrl c;
    private final fop e;
    private final List f;
    private ajss g;
    private final rxm h;

    public Cfor(rxm rxmVar, SwipeRefreshLayout swipeRefreshLayout, byte[] bArr) {
        fop fopVar = new fop(this);
        this.e = fopVar;
        this.f = new ArrayList(2);
        this.h = rxmVar;
        this.a = swipeRefreshLayout;
        this.b = 2;
        swipeRefreshLayout.setEnabled(true);
        this.c = azrl.e();
        swipeRefreshLayout.a = new bvi() { // from class: foo
            @Override // defpackage.bvi
            public final void a() {
                Cfor.this.a();
            }
        };
        rxmVar.a(fopVar);
    }

    public final void a() {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        swipeRefreshLayout.getClass();
        this.c.getClass();
        ajss ajssVar = this.g;
        if (ajssVar == null) {
            swipeRefreshLayout.l(false);
            this.c.c(foq.b(false));
        } else {
            ajssVar.lo();
            this.c.c(foq.b(true));
        }
    }

    public final void b() {
        this.h.b(this.e);
        this.c.sh();
    }

    @Override // defpackage.ajwk
    public final void c(int i) {
        this.b = i;
        this.a.l(i == 2);
        e();
    }

    public final void d(ajwi ajwiVar) {
        ajwiVar.getClass();
        this.g = ajwiVar;
        this.f.add(ajwiVar.K);
        e();
    }

    public final void e() {
        this.a.setEnabled(this.b != 3);
    }
}

package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntt extends nsp {
    public Timer n;
    public final Handler o;
    public final xqa p;
    public List q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;

    public ntt(Context context, acra acraVar, Handler handler, xqa xqaVar) {
        super(context, acraVar);
        this.o = handler;
        this.s = false;
        this.r = false;
        this.p = xqaVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (this.s && this.b && this.u) {
            if (i2 < 0) {
                if (this.m || this.r) {
                    return;
                }
                n("");
                return;
            }
            if (i2 <= 50 || !this.m) {
                return;
            }
            m(false);
        }
    }

    @Override // defpackage.nsp
    protected final void k() {
        if (this.d != null) {
            return;
        }
        this.d = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.new_comments_button, (ViewGroup) this.e, false).findViewById(R.id.new_comments_button);
        this.f = (TextView) this.d.findViewById(R.id.new_comments_text);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: ntq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ntt nttVar = ntt.this;
                RecyclerView recyclerView = nttVar.c;
                if (recyclerView != null) {
                    wd wdVar = recyclerView.n;
                    wdVar.getClass();
                    if (((LinearLayoutManager) wdVar).J() > 10) {
                        nttVar.c.ak(10);
                    }
                    nttVar.c.ak(0);
                    nttVar.m(false);
                    xqa xqaVar = nttVar.p;
                    List list = nttVar.q;
                    list.getClass();
                    amxd listIterator = xqaVar.a.listIterator();
                    while (listIterator.hasNext()) {
                        ((xpz) listIterator.next()).s(list);
                    }
                    nttVar.s = false;
                    if (nttVar.l.h()) {
                        nttVar.k.I(3, (acsa) nttVar.l.c(), null);
                    }
                }
            }
        });
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        this.s = false;
    }
}

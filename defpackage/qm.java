package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qm implements AdapterView.OnItemClickListener, re {
    Context a;
    public LayoutInflater b;
    qq c;
    public ExpandedMenuView d;
    public rd e;
    public ql f;

    public qm(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new ql(this);
        }
        return this.f;
    }

    @Override // defpackage.re
    public final void b(Context context, qq qqVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = qqVar;
        ql qlVar = this.f;
        if (qlVar != null) {
            qlVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.re
    public final void c(qq qqVar, boolean z) {
        rd rdVar = this.e;
        if (rdVar != null) {
            rdVar.a(qqVar, z);
        }
    }

    @Override // defpackage.re
    public final void d(rd rdVar) {
        throw null;
    }

    @Override // defpackage.re
    public final boolean e() {
        return false;
    }

    @Override // defpackage.re
    public final boolean f(rm rmVar) {
        if (!rmVar.hasVisibleItems()) {
            return false;
        }
        qr qrVar = new qr(rmVar);
        qq qqVar = qrVar.a;
        mh mhVar = new mh(qqVar.a);
        qrVar.c = new qm(mhVar.a());
        qm qmVar = qrVar.c;
        qmVar.e = qrVar;
        qrVar.a.g(qmVar);
        ListAdapter a = qrVar.c.a();
        md mdVar = mhVar.a;
        mdVar.p = a;
        mdVar.q = qrVar;
        View view = qqVar.g;
        if (view == null) {
            mhVar.e(qqVar.f);
            mhVar.o(qqVar.e);
        } else {
            mhVar.d(view);
        }
        mhVar.a.n = qrVar;
        qrVar.b = mhVar.b();
        qrVar.b.setOnDismissListener(qrVar);
        WindowManager.LayoutParams attributes = qrVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        qrVar.b.show();
        rd rdVar = this.e;
        if (rdVar == null) {
            return true;
        }
        rdVar.b(rmVar);
        return true;
    }

    @Override // defpackage.re
    public final boolean g(qt qtVar) {
        return false;
    }

    @Override // defpackage.re
    public final boolean h(qt qtVar) {
        return false;
    }

    @Override // defpackage.re
    public final void i() {
        ql qlVar = this.f;
        if (qlVar != null) {
            qlVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}

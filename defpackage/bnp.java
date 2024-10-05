package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bnp extends ng {
    private final bpw a;
    private final bnn b;
    private TextView c;
    private bph d;
    private ArrayList e;
    private bno f;
    private ListView g;
    private boolean h;
    private long i;
    private final Handler j;

    public bnp(Context context) {
        this(context, null);
    }

    public void a(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!i((bpv) list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public final void b() {
        if (this.h) {
            ArrayList arrayList = new ArrayList(bpw.i());
            a(arrayList);
            Collections.sort(arrayList, uo.a);
            if (SystemClock.uptimeMillis() - this.i >= 300) {
                h(arrayList);
                return;
            }
            this.j.removeMessages(1);
            Handler handler = this.j;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.i + 300);
        }
    }

    public final void f(bph bphVar) {
        if (bphVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.d.equals(bphVar)) {
            return;
        }
        this.d = bphVar;
        if (this.h) {
            this.a.r(this.b);
            this.a.q(bphVar, this.b, 1);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        getWindow().setLayout(jh.i(getContext()), -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(List list) {
        this.i = SystemClock.uptimeMillis();
        this.e.clear();
        this.e.addAll(list);
        this.f.notifyDataSetChanged();
    }

    public final boolean i(bpv bpvVar) {
        return !bpvVar.j() && bpvVar.g && bpvVar.n(this.d);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        this.a.q(this.d, this.b, 1);
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ng, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.e = new ArrayList();
        this.f = new bno(getContext(), this.e);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.f);
        this.g.setOnItemClickListener(this.f);
        this.g.setEmptyView(findViewById(android.R.id.empty));
        this.c = (TextView) findViewById(R.id.mr_chooser_title);
        g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h = false;
        this.a.r(this.b);
        this.j.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setTitle(int i) {
        this.c.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bnp(android.content.Context r1, byte[] r2) {
        /*
            r0 = this;
            r2 = 0
            android.content.Context r1 = defpackage.ji.y(r1, r2, r2)
            int r2 = defpackage.ji.t(r1)
            r0.<init>(r1, r2)
            bph r1 = defpackage.bph.a
            r0.d = r1
            bnm r1 = new bnm
            r1.<init>(r0)
            r0.j = r1
            android.content.Context r1 = r0.getContext()
            bpw r1 = defpackage.bpw.b(r1)
            r0.a = r1
            bnn r1 = new bnn
            r1.<init>(r0)
            r0.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnp.<init>(android.content.Context, byte[]):void");
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}

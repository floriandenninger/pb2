package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcd extends wjs {
    public View a;
    public LinearLayout b;
    private ListView g;
    private View h;
    private ListView i;
    private final ajut j;
    private final ajpd k;
    private final wbs l;
    private final wbz m;
    private final akpq n;

    public wcd(Context context, zaw zawVar, acra acraVar, ajjz ajjzVar, ajoy ajoyVar, wbz wbzVar, azrw azrwVar, ajut ajutVar, akpq akpqVar, byte[] bArr, byte[] bArr2) {
        super(context, zawVar, acraVar, ajjzVar, ajoyVar, null, null);
        this.k = new ajpd();
        this.l = new wbs();
        this.m = wbzVar;
        this.j = ajutVar;
        this.n = akpqVar;
        n(new wbr(context, zawVar, acraVar, ajjzVar, this, this, this, this, ajutVar, akpqVar, null), ajoyVar, this.g);
        n(new wbp(context, this, wbzVar, azrwVar), ajoyVar, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajos, java.lang.Object] */
    private final void n(ajvb ajvbVar, ajoy ajoyVar, ListView listView) {
        ajvbVar.a(aatd.class);
        ajoa e = ajoyVar.e(ajvbVar.get());
        e.h(this.e);
        listView.setAdapter((ListAdapter) e);
    }

    @Override // defpackage.wjs
    public final View b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_selector_layout, (ViewGroup) null);
        this.a = inflate;
        ((ImageView) inflate.findViewById(R.id.add_account)).setOnClickListener(new View.OnClickListener() { // from class: wcc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wcd.this.k();
            }
        });
        this.g = (ListView) this.a.findViewById(R.id.account_list);
        this.h = this.a.findViewById(R.id.footer_separator);
        this.i = (ListView) this.a.findViewById(R.id.account_list_footer);
        this.b = (LinearLayout) this.a.findViewById(R.id.extra_footers);
        return this.a;
    }

    @Override // defpackage.wjs
    protected final ListView c() {
        return this.g;
    }

    @Override // defpackage.wjs
    protected final ajpd d() {
        return this.k;
    }

    @Override // defpackage.wjs
    protected final void e() {
        if (this.e.isEmpty()) {
            this.e.add(this.l);
        }
    }

    @Override // defpackage.wjs
    protected final void f() {
        this.e.add(this.c);
    }

    @Override // defpackage.wjs, defpackage.wje
    public final void g(wck wckVar) {
        super.g(wckVar);
        ArrayList arrayList = new ArrayList();
        this.e.k(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof ajny) {
                h(false);
            } else if (obj instanceof wie) {
                h(true);
            }
        }
    }

    public final void h(boolean z) {
        this.h.setVisibility(true != z ? 8 : 0);
    }
}

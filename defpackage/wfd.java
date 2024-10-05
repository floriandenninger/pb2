package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfd implements View.OnClickListener, ajom {
    private final View a;
    private final RecyclerView b;
    private final wfc c;
    private final wed d;

    public wfd(Context context, wed wedVar, ViewGroup viewGroup) {
        this.d = wedVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_other_methods_layout, viewGroup, false);
        this.a = inflate;
        wfc wfcVar = new wfc(context, wedVar);
        this.c = wfcVar;
        inflate.findViewById(R.id.close_button).setOnClickListener(this);
        inflate.findViewById(R.id.cancel_button).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.methods_list);
        this.b = recyclerView;
        recyclerView.ac(wfcVar);
        recyclerView.af(new LinearLayoutManager());
        recyclerView.aB(new uc(context));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        wfc wfcVar = this.c;
        wfcVar.d = null;
        wfcVar.mw();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        wfc wfcVar = this.c;
        wfcVar.d = ((wfu) obj).a;
        wfcVar.mw();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.b();
    }
}

package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbt implements ajom {
    private final View a;
    private final TextView b;

    public wbt(Context context, wid widVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_add_account_item, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.name);
        inflate.setOnClickListener(new whs(widVar, 1, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.b.setText(R.string.account_switcher_add_account);
    }
}

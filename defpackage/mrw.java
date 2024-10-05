package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrw extends ajpc {
    public aubp a;
    private final View b;
    private final TextView c;

    public mrw(Context context, aahd aahdVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_link_layout, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        inflate.setOnClickListener(new mrv(this, aahdVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aubp aubpVar = (aubp) obj;
        this.a = aubpVar;
        whu.G(this.c, aubpVar.c);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aubp) obj).e.I();
    }
}

package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqm extends ajpc {
    private final Context a;
    private final aahd b;
    private final View c;
    private final TextView d;
    private final TextView e;

    public mqm(Context context, aahd aahdVar) {
        this.a = context;
        this.b = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.content);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        ated atedVar = (ated) obj;
        aqyg aqygVar = atedVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        this.d.setText(b);
        CharSequence k = ajcq.k("  ", aahk.c((aqyg[]) atedVar.c.toArray(new aqyg[0]), this.b, false));
        this.e.setText(k);
        this.c.setContentDescription(this.a.getString(R.string.accessibility_watch_metadata_row, b, k));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ated) obj).e.I();
    }
}

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
public final class mql extends ajpc {
    private final aahd a;
    private final View b;
    private final TextView c;

    public mql(Context context, aahd aahdVar) {
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_metadata_row_header, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.content);
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
        aqyg aqygVar;
        atec atecVar = (atec) obj;
        if ((atecVar.b & 1) != 0) {
            aqygVar = atecVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned a = aahk.a(aqygVar, this.a, false);
        this.c.setText(a);
        this.b.setContentDescription(a);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}

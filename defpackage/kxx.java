package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kxx extends ajpc {
    private final View a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final float f;
    private final float g;
    private final float h;

    public kxx(Context context) {
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_segment_header, (ViewGroup) null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.position);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.title);
        this.d = textView2;
        TextView textView3 = (TextView) inflate.findViewById(R.id.annotation);
        this.e = textView3;
        this.f = textView.getTextSize();
        this.g = textView2.getTextSize();
        this.h = textView3.getTextSize();
    }

    private final void f(ajok ajokVar, TextView textView, aqyg aqygVar) {
        Spanned b = ajcq.b(aqygVar);
        if (!TextUtils.isEmpty(b)) {
            if (ajokVar != null && ajokVar.j("nested_fragment_key", false)) {
                textView.setTextSize(0, this.b.getResources().getDimension(R.dimen.small_font_size));
            }
            textView.setContentDescription(ajcq.i(aqygVar));
            textView.setText(b);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.setTextSize(0, this.f);
        this.d.setTextSize(0, this.g);
        this.e.setTextSize(0, this.h);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aubt aubtVar = ((kxw) obj).a;
        TextView textView = this.c;
        aqyg aqygVar = aubtVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        f(ajokVar, textView, aqygVar);
        TextView textView2 = this.d;
        aqyg aqygVar2 = aubtVar.b;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        f(ajokVar, textView2, aqygVar2);
        TextView textView3 = this.e;
        aqyg aqygVar3 = aubtVar.d;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        f(ajokVar, textView3, aqygVar3);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((kxw) obj).a.e.I();
    }
}

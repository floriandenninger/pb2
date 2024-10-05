package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ein implements ajom {
    private final ajjz a;
    private final LinearLayout b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;

    public ein(Context context, ajjz ajjzVar) {
        this.a = ajjzVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.minor_moment_header, (ViewGroup) null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.title);
        this.d = (ImageView) linearLayout.findViewById(R.id.thumbnail);
        this.e = (TextView) linearLayout.findViewById(R.id.caption);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atem atemVar = (atem) obj;
        TextView textView = this.c;
        aqyg aqygVar = atemVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.e;
        aqyg aqygVar2 = atemVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        this.a.g(this.d, Uri.parse(atemVar.c));
    }
}

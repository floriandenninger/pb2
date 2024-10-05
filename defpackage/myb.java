package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class myb extends ajpc {
    public final ypa a;
    private final ajjz b;
    private final ajop c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public myb(Context context, ajjz ajjzVar, ypa ypaVar, gma gmaVar) {
        ajjzVar.getClass();
        this.b = ajjzVar;
        ypaVar.getClass();
        this.a = ypaVar;
        this.c = gmaVar;
        View inflate = View.inflate(context, R.layout.ypc_post_tip_watch_screen, null);
        this.g = (ImageView) inflate.findViewById(R.id.viewer_thumbnail);
        this.d = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
        this.e = (TextView) inflate.findViewById(R.id.confirmation_msg);
        TextView textView = (TextView) inflate.findViewById(R.id.done);
        this.f = textView;
        textView.setOnClickListener(new mya(this));
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        awha awhaVar = (awha) obj;
        if (fav.h(ajokVar)) {
            this.e.setTextSize(2, 18.0f);
            this.d.setTextSize(2, 18.0f);
            this.d.setLines(2);
        } else {
            this.e.setTextSize(2, 22.0f);
            this.d.setTextSize(2, 22.0f);
        }
        ajjz ajjzVar = this.b;
        ImageView imageView = this.g;
        avgg avggVar = awhaVar.b;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.d;
        aqyg aqygVar = awhaVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.e;
        aqyg aqygVar2 = awhaVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        TextView textView3 = this.f;
        aqyg aqygVar3 = awhaVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar3));
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awha) obj).f.I();
    }
}

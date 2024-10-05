package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwi extends ajpc {
    public final aahd a;
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;

    public mwi(Context context, aahd aahdVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ticket_event, (ViewGroup) null, false);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view2);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.link_view);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.calendar_month);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.calendar_day);
        this.a = aahdVar;
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
        final avgn avgnVar = (avgn) obj;
        whu.G(this.c, avgnVar.c);
        whu.G(this.d, avgnVar.e);
        whu.G(this.e, avgnVar.f);
        this.b.setContentDescription(avgnVar.d);
        this.g.setText(avgnVar.j);
        this.h.setText(avgnVar.k);
        whu.G(this.f, avgnVar.l);
        if ((avgnVar.b & 256) == 0) {
            this.b.setClickable(false);
        } else {
            this.b.setOnClickListener(new View.OnClickListener() { // from class: mwh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mwi mwiVar = mwi.this;
                    avgn avgnVar2 = avgnVar;
                    aahd aahdVar = mwiVar.a;
                    apxf apxfVar = avgnVar2.i;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, acrc.g(avgnVar2));
                }
            });
            this.b.setClickable(true);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avgn) obj).m.I();
    }
}

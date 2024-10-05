package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipj extends ajpc {
    public ipc a;
    private final ajjz b;
    private final View c;
    private final ImageView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;

    public ipj(Context context, ajjz ajjzVar) {
        amkq.E(ajjzVar != null);
        this.b = ajjzVar;
        View inflate = View.inflate(context, R.layout.user_mention_suggestion, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.channel_thumbnail);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.channel_display_name);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.channel_details);
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
        final avuy avuyVar = (avuy) obj;
        ajjz ajjzVar = this.b;
        ImageView imageView = this.d;
        avgg avggVar = avuyVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        this.e.setText(avuyVar.d);
        YouTubeTextView youTubeTextView = this.f;
        aqyg aqygVar = avuyVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        youTubeTextView.setText(ajcq.b(aqygVar));
        final acra acraVar = ajokVar.a;
        this.a = (ipc) ajokVar.c("listener");
        Integer num = (Integer) ajokVar.c("color");
        if (num != null) {
            this.e.setTextColor(num.intValue());
            this.f.setTextColor(num.intValue());
        }
        if (this.a != null) {
            final int b = ajokVar.b("position", -1);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: ipi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ipj ipjVar = ipj.this;
                    acra acraVar2 = acraVar;
                    avuy avuyVar2 = avuyVar;
                    int i = b;
                    acraVar2.I(3, new acqx(avuyVar2.g), null);
                    iph iphVar = ipjVar.a.a;
                    iphVar.c.g(avuyVar2);
                    avuv a = iphVar.a(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED);
                    aone createBuilder = avuw.a.createBuilder();
                    createBuilder.copyOnWrite();
                    avuw avuwVar = (avuw) createBuilder.instance;
                    avuwVar.b |= 1;
                    avuwVar.c = i;
                    a.copyOnWrite();
                    ((avux) a.instance).j((avuw) createBuilder.build());
                    iphVar.b((avux) a.build());
                }
            });
        } else {
            this.c.setOnClickListener(null);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avuy) obj).g.I();
    }
}

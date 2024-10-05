package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moq extends ajpc {
    public final aahd a;
    public final View b;
    public apxf c;
    private final ajjz d;
    private final ftm e;
    private final YouTubeTextView f;
    private final ImageView g;
    private final YouTubeTextView h;
    private final ajjv i;
    private final View.OnClickListener j;
    private final Context k;

    public moq(Context context, ajjz ajjzVar, aahd aahdVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, byte[] bArr) {
        this.k = context;
        ajjzVar.getClass();
        this.d = ajjzVar;
        aahdVar.getClass();
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.feed_channel_filter_header, (ViewGroup) null);
        this.b = inflate;
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.f = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.subscriber_count);
        this.h = youTubeTextView2;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = imageView;
        ajju b = ajjzVar.c().b();
        b.b(R.drawable.missing_avatar);
        this.i = b.a();
        this.e = ftnVar.a((TextView) inflate.findViewById(R.id.subscribe_button), fvfVar.b(inflate.findViewById(R.id.subscription_notification_view)));
        this.j = new moo(this);
        if (akbdVar.d()) {
            mop mopVar = new mop(this);
            imageView.setOnTouchListener(mopVar);
            youTubeTextView.setOnTouchListener(mopVar);
            youTubeTextView2.setOnTouchListener(mopVar);
        }
        inflate.setClickable(true);
        akbdVar.b(inflate, akbdVar.a(inflate, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.d();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqvz aqvzVar = (aqvz) obj;
        ajjz ajjzVar = this.d;
        ImageView imageView = this.g;
        avgg avggVar = aqvzVar.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.i);
        auzj auzjVar = null;
        if ((aqvzVar.b & 1) != 0) {
            aqygVar = aqvzVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        this.f.setText(b);
        YouTubeTextView youTubeTextView = this.h;
        if ((aqvzVar.b & 2) != 0) {
            aqygVar2 = aqvzVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        youTubeTextView.setText(ajcq.b(aqygVar2));
        apxf apxfVar = aqvzVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.c = apxfVar;
        this.g.setOnClickListener(this.j);
        this.f.setOnClickListener(this.j);
        this.h.setOnClickListener(this.j);
        this.g.setContentDescription(b);
        aqvy aqvyVar = aqvzVar.g;
        if (aqvyVar == null) {
            aqvyVar = aqvy.a;
        }
        if (aqvyVar.b == 55419609) {
            aqvy aqvyVar2 = aqvzVar.g;
            if (aqvyVar2 == null) {
                aqvyVar2 = aqvy.a;
            }
            if (aqvyVar2.b == 55419609) {
                auzjVar = (auzj) aqvyVar2.c;
            } else {
                auzjVar = auzj.a;
            }
        }
        if (auzjVar != null) {
            Context context = this.k;
            aone builder = auzjVar.toBuilder();
            fkc.p(context, builder, b);
            auzjVar = (auzj) builder.build();
        }
        this.e.i(auzjVar, ajokVar.a);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqvz) obj).h.I();
    }
}

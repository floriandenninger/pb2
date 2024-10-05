package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yiq implements ajom {
    public final View a;
    private final ajjz b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final ImageView g;

    public yiq(Context context, ajjz ajjzVar, int i, ViewGroup viewGroup) {
        this.b = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.super_title_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.sub_title_view);
        this.f = (ImageView) inflate.findViewById(R.id.background_image);
        this.g = (ImageView) inflate.findViewById(R.id.channel_image);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(auwy auwyVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        avgg avggVar;
        YouTubeTextView youTubeTextView = this.c;
        avgg avggVar2 = null;
        if ((auwyVar.b & 512) != 0) {
            aqygVar = auwyVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.d;
        if ((auwyVar.b & 128) != 0) {
            aqygVar2 = auwyVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        YouTubeTextView youTubeTextView3 = this.e;
        if ((auwyVar.b & 256) != 0) {
            aqygVar3 = auwyVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(youTubeTextView3, ajcq.b(aqygVar3));
        ajjz ajjzVar = this.b;
        ImageView imageView = this.f;
        if ((auwyVar.b & 2) != 0) {
            avggVar = auwyVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        this.f.setColorFilter(auwyVar.c & (-1711276033), PorterDuff.Mode.LIGHTEN);
        ajjz ajjzVar2 = this.b;
        ImageView imageView2 = this.g;
        if ((auwyVar.b & 8) != 0 && (avggVar2 = auwyVar.e) == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar2.h(imageView2, avggVar2);
        this.a.setBackgroundColor(auwyVar.c);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((auwy) obj);
    }
}

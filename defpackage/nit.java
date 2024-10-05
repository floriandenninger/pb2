package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nit extends ajpc {
    private final ftm a;
    private final ajjz b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public nit(Context context, ajjz ajjzVar, ftn ftnVar) {
        this.b = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.topic_channel_details, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.g = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.e = (TextView) inflate.findViewById(R.id.subscriber_count);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.f = textView;
        this.a = ftnVar.a(textView, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g.setBackground(null);
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r4, java.lang.Object r5) {
        /*
            r3 = this;
            avib r5 = (defpackage.avib) r5
            avgg r0 = r5.c
            if (r0 != 0) goto L8
            avgg r0 = defpackage.avgg.a
        L8:
            ajjz r1 = r3.b
            android.widget.ImageView r2 = r3.g
            r1.h(r2, r0)
            if (r0 == 0) goto L37
            int r1 = r0.b
            r1 = r1 & 4
            if (r1 == 0) goto L37
            aott r1 = r0.d
            if (r1 != 0) goto L1d
            aott r1 = defpackage.aott.a
        L1d:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L37
            android.widget.ImageView r1 = r3.g
            aott r0 = r0.d
            if (r0 != 0) goto L2b
            aott r0 = defpackage.aott.a
        L2b:
            aots r0 = r0.c
            if (r0 != 0) goto L31
            aots r0 = defpackage.aots.a
        L31:
            java.lang.String r0 = r0.c
            r1.setContentDescription(r0)
            goto L3d
        L37:
            android.widget.ImageView r0 = r3.g
            r1 = 0
            r0.setContentDescription(r1)
        L3d:
            android.widget.TextView r0 = r3.d
            aqyg r1 = r5.b
            if (r1 != 0) goto L45
            aqyg r1 = defpackage.aqyg.a
        L45:
            android.text.Spanned r1 = defpackage.ajcq.b(r1)
            defpackage.whu.G(r0, r1)
            android.widget.TextView r0 = r3.e
            aqyg r1 = r5.d
            if (r1 != 0) goto L54
            aqyg r1 = defpackage.aqyg.a
        L54:
            android.text.Spanned r1 = defpackage.ajcq.b(r1)
            defpackage.whu.G(r0, r1)
            aulq r5 = r5.e
            if (r5 != 0) goto L61
            aulq r5 = defpackage.aulq.a
        L61:
            aonk r0 = com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass.subscribeButtonRenderer
            java.lang.Object r5 = defpackage.ahbj.n(r5, r0)
            auzj r5 = (defpackage.auzj) r5
            if (r5 == 0) goto L72
            ftm r0 = r3.a
            acra r4 = r4.a
            r0.i(r5, r4)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nit.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avib) obj).f.I();
    }
}

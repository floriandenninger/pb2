package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nae extends mlc {
    private final ajuw C;
    private final ajop D;
    private final ajoi E;
    private final nbp F;
    public arcw a;
    private final LinearLayout b;
    private final FixedAspectRatioRelativeLayout c;
    private final RelativeLayout d;
    private final TextView e;
    private final Resources f;

    public nae(Context context, ajjz ajjzVar, aahd aahdVar, gma gmaVar, ajuw ajuwVar, tdv tdvVar, euv euvVar) {
        super(context, ajjzVar, aahdVar, gmaVar, R.layout.compact_promoted_video_item, null, null, null, null, null, null, null);
        this.D = gmaVar;
        this.f = context.getResources();
        ajuwVar.getClass();
        this.C = ajuwVar;
        this.E = new ajoi(aahdVar, gmaVar);
        LinearLayout linearLayout = (LinearLayout) this.i.findViewById(R.id.video_info_view);
        this.b = linearLayout;
        this.c = (FixedAspectRatioRelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.d = (RelativeLayout) linearLayout.findViewById(R.id.text_layout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.ad_call_to_action);
        this.e = textView;
        textView.setOnClickListener(new nad(this, aahdVar));
        this.F = new nbp(aahdVar, tdvVar, euvVar, a());
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.D).b;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.E.c();
        this.F.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.oB(ajok, java.lang.Object):void");
    }
}

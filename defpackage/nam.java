package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nam extends nbz {
    private final TextView A;
    private final ImageView B;
    private final TextView C;

    public nam(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, true, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.description);
        this.C = (TextView) view2.findViewById(R.id.advertiser_name_or_website);
        this.B = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    @Override // defpackage.nbz
    public final void a(acra acraVar, Object obj, augy augyVar, auge augeVar, boolean z, boolean z2) {
        aqyg aqygVar;
        super.a(acraVar, obj, augyVar, augeVar, z, z2);
        if ((augyVar.b & 1024) != 0) {
            String valueOf = String.valueOf(this.B.getContentDescription());
            aqyg aqygVar2 = augyVar.m;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            String str = ((aqyi) aqygVar2.c.get(0)).c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str);
            this.B.setContentDescription(sb.toString());
        }
        aqyg aqygVar3 = augeVar.j;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar3);
        if ((augyVar.b & 1024) != 0) {
            aqygVar = augyVar.m;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b2 = ajcq.b(aqygVar);
        avgg avggVar = augeVar.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        muf.q(this.A, b);
        muf.q(this.C, b2);
        muf.r(this.B, avggVar, this.m);
    }
}

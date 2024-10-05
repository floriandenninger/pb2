package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbd extends nbz {
    private final TextView A;
    private final RatingBar B;
    private final TextView C;
    private final TextView D;
    private final ImageView E;

    public nbd(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, true, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.rating_text);
        this.B = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.C = (TextView) view2.findViewById(R.id.price_text);
        this.D = (TextView) view2.findViewById(R.id.description);
        this.E = (ImageView) view2.findViewById(R.id.channel_thumbnail);
    }

    @Override // defpackage.nbz, defpackage.nby
    public final void b(acra acraVar, Object obj, augh aughVar, augi augiVar, boolean z) {
        aqyg aqygVar;
        super.b(acraVar, obj, aughVar, augiVar, z);
        float f = aughVar.f;
        int i = aughVar.g;
        int i2 = aughVar.h;
        if ((aughVar.b & 8192) != 0) {
            aqygVar = aughVar.p;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        aqyg aqygVar2 = augiVar.j;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        avgg avggVar = augiVar.h;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        muf.p(this.A, this.B, f, i, i2);
        muf.q(this.C, b);
        muf.q(this.D, b2);
        muf.r(this.E, avggVar, this.m);
    }
}

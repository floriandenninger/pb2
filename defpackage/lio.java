package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lio {
    public final aok a;
    public final acra b;
    public final dd c;
    public final TextView d;
    final LinearLayout e;
    public final ImageView f;
    public final ljn g;
    public final akcy h;
    public auqe i;
    private lil j;
    private final aadw k;
    private final akbc l;

    public lio(aadw aadwVar, ajyw ajywVar, akbc akbcVar, akcy akcyVar, aok aokVar, LinearLayout linearLayout, acra acraVar, dd ddVar, ljn ljnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        String str;
        this.k = aadwVar;
        this.g = ljnVar;
        this.l = akbcVar;
        this.h = akcyVar;
        this.a = aokVar;
        this.b = acraVar;
        this.c = ddVar;
        this.e = linearLayout;
        this.d = (TextView) linearLayout.findViewById(R.id.voice_language);
        this.f = (ImageView) linearLayout.findViewById(R.id.voice_language_icon);
        if (evr.ay(aadwVar)) {
            String c = akbc.c();
            String a = akbcVar.a();
            if (c.isEmpty() || a.isEmpty()) {
                str = "en-US";
            } else {
                StringBuilder sb = new StringBuilder(c.length() + 1 + String.valueOf(a).length());
                sb.append(c);
                sb.append("-");
                sb.append(a);
                str = sb.toString();
            }
            lil n = ajywVar.n(str);
            this.j = n;
            ynm.n(aokVar, n.a(), new lin(this, 2), new lin(this, 1));
        }
    }
}

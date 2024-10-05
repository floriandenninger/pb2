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
public final class krt {
    public final ajut a;
    public final Context b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final ajyd f;
    public final acra g;
    public final aahd h;
    public final akbu i;
    public final int j;

    public krt(Context context, acra acraVar, aahd aahdVar, ajut ajutVar, akbu akbuVar, akpq akpqVar, ViewGroup viewGroup, byte[] bArr) {
        this.b = context;
        this.g = acraVar;
        this.a = ajutVar;
        this.h = aahdVar;
        this.i = akbuVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_action_bar_button, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.button_icon);
        this.e = (TextView) inflate.findViewById(R.id.button_text);
        this.f = akpqVar.c(inflate);
        this.j = wbs.W(context, R.attr.ytOverlayIconActiveOther).orElse(0);
    }
}

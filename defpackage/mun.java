package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mun {
    public final View a;
    public final aahd b;
    public final ImageView c;
    public final ImageView d;
    public final ajjz e;
    public final ajuw f;
    public final View g;
    public final View h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final lab m;
    public auuf n;
    public CharSequence o;
    public gnz p;
    public lad q;

    public mun(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aahdVar.getClass();
        this.b = aahdVar;
        this.e = ajjzVar;
        this.f = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.show_item, (ViewGroup) null);
        this.a = inflate;
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new mum(this));
        }
        this.g = inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.short_byline);
        this.l = (TextView) inflate.findViewById(R.id.long_byline);
        this.m = cVar.g((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        this.i = inflate.findViewById(R.id.bottom_panel_overlay);
        this.h = inflate.findViewById(R.id.resume_playback_overlay);
    }
}

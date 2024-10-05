package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jeq implements ajom, jel {
    public final ajjz a;
    public final Context b;
    public final View c;
    public final TextView d;
    public final Switch e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final ImageView j;
    Optional k = Optional.empty();
    private jem l;

    public jeq(Context context, ajjz ajjzVar) {
        this.b = context;
        this.a = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.set_content_mdx_autonav_footer, (ViewGroup) null);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.autonav_label);
        this.d = textView;
        Switch r1 = (Switch) inflate.findViewById(R.id.autonav_switch);
        this.e = r1;
        if (Build.VERSION.SDK_INT >= 23) {
            Resources.Theme theme = context.getTheme();
            r1.setThumbTintList(context.getResources().getColorStateList(R.color.mdx_autonav_switch_thumb, theme));
            r1.setTrackTintList(context.getResources().getColorStateList(R.color.mdx_autonav_switch_track, theme));
        }
        View findViewById = inflate.findViewById(R.id.autonav_video);
        this.f = findViewById;
        findViewById.setBackgroundResource(R.drawable.bg_mdx_autonav_row);
        TextView textView2 = (TextView) inflate.findViewById(context.getResources().getIdentifier("title", "id", context.getPackageName()));
        this.g = textView2;
        this.h = (TextView) inflate.findViewById(R.id.duration);
        this.i = inflate.findViewById(R.id.thumbnail_layout);
        this.j = (ImageView) inflate.findViewById(context.getResources().getIdentifier("thumbnail", "id", context.getPackageName()));
        textView.setTextColor(wbs.Q(context, R.attr.ytTextPrimary));
        textView2.setTextColor(wbs.Q(context, R.attr.ytTextPrimary));
        inflate.findViewById(R.id.selected_position_indicator).setVisibility(4);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        jem jemVar = this.l;
        if (jemVar != null) {
            jemVar.b = null;
            this.l = null;
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        jem jemVar = (jem) obj;
        this.l = jemVar;
        jemVar.b = this;
        jemVar.a(jemVar.f);
        jemVar.b(jemVar.e);
        jemVar.c(jemVar.d);
        jemVar.d(jemVar.c, jemVar.g);
        Optional of = Optional.of(jemVar.a);
        this.k = of;
        this.e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) of.get());
    }
}

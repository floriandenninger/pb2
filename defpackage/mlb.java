package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mlb implements ajom {
    public final Context a;
    public final ajjz b;
    public final ajuw c;
    public final View d;
    public final FixedAspectRatioFrameLayout e;
    public final ImageView f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final ViewGroup m;

    public mlb(Context context, ajjz ajjzVar, ajuw ajuwVar) {
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        this.c = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_movie_item, (ViewGroup) null);
        this.d = inflate;
        this.e = (FixedAspectRatioFrameLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.h = (TextView) inflate.findViewById(R.id.duration);
        this.g = inflate.findViewById(R.id.contextual_menu_anchor);
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.subtitle);
        this.k = (TextView) inflate.findViewById(R.id.top_metadata);
        this.l = (TextView) inflate.findViewById(R.id.description);
        this.m = (ViewGroup) inflate.findViewById(R.id.bottom_standalone_badges_container);
    }
}

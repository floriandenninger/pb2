package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgf implements ajom {
    private final ghi a;
    private final View b;

    public kgf(Context context, ajpe ajpeVar, ypa ypaVar, ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.app_related_endscreen_loading_view_wrapper, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.findViewById(R.id.container);
        Resources resources = context.getResources();
        tjr tjrVar = new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.app_related_end_screen_loading_progress_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tjrVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        this.a = new ghi(context, ajpeVar, ypaVar, viewGroup2, tjrVar);
        this.b = frameLayout;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.oB(ajokVar, (ajvo) obj);
    }
}

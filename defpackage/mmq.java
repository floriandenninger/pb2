package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmq {
    public final ajjz a;
    public final ajut b;
    public final Context c;
    public final ViewStub d;
    public final ViewStub e;
    public final ViewStub f;
    public final ViewStub g;
    public final ColorStateList h;
    public CircularImageView i;
    public FrameLayout j;
    public ImageView k;
    public ImageView l;
    public TintableImageView m;

    public mmq(ajjz ajjzVar, ajut ajutVar, View view) {
        this.a = ajjzVar;
        this.b = ajutVar;
        Context context = view.getContext();
        this.c = context;
        this.d = (ViewStub) view.findViewById(R.id.circular_avatar_view_stub);
        this.e = (ViewStub) view.findViewById(R.id.cropped_square_avatar_view_stub);
        this.f = (ViewStub) view.findViewById(R.id.square_avatar_view_stub);
        this.g = (ViewStub) view.findViewById(R.id.icon_avatar_view_stub);
        this.h = wbs.S(context, R.attr.ytTextPrimary);
        this.i = (CircularImageView) view.findViewById(R.id.circular_avatar);
        this.j = (FrameLayout) view.findViewById(R.id.cropped_square_avatar);
        this.l = (ImageView) view.findViewById(R.id.square_avatar);
        this.m = (TintableImageView) view.findViewById(R.id.icon_avatar);
    }

    public static arfs a(aqby aqbyVar) {
        if (aqbyVar == null || (aqbyVar.b & 128) == 0) {
            return null;
        }
        arfu arfuVar = aqbyVar.f;
        if (arfuVar == null) {
            arfuVar = arfu.a;
        }
        arfs arfsVar = arfuVar.c;
        return arfsVar == null ? arfs.a : arfsVar;
    }

    public static avgg b(aqby aqbyVar) {
        if (aqbyVar == null || (aqbyVar.b & 1) == 0) {
            return null;
        }
        apsp apspVar = aqbyVar.c;
        if (apspVar == null) {
            apspVar = apsp.a;
        }
        avgg avggVar = apspVar.b;
        return avggVar == null ? avgg.a : avggVar;
    }

    public static avgg c(aqby aqbyVar) {
        if (aqbyVar == null || (aqbyVar.b & 2) == 0) {
            return null;
        }
        aucy aucyVar = aqbyVar.d;
        if (aucyVar == null) {
            aucyVar = aucy.a;
        }
        avgg avggVar = aucyVar.c;
        return avggVar == null ? avgg.a : avggVar;
    }

    public static avgg d(aqby aqbyVar) {
        if (aqbyVar == null || (aqbyVar.b & 4) == 0) {
            return null;
        }
        aucz auczVar = aqbyVar.e;
        if (auczVar == null) {
            auczVar = aucz.a;
        }
        avgg avggVar = auczVar.b;
        return avggVar == null ? avgg.a : avggVar;
    }
}

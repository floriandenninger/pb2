package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msj implements View.OnClickListener, ajom {
    final View a;
    final ImageView b;
    private final Context c;
    private final ajjz d;
    private final aahd e;
    private final acra f;
    private aueq g;

    public msj(Context context, ajjz ajjzVar, aahd aahdVar, acqz acqzVar) {
        this.c = context;
        this.d = ajjzVar;
        this.e = aahdVar;
        this.f = acqzVar.mM();
        View inflate = LayoutInflater.from(context).inflate(R.layout.poster, (ViewGroup) null);
        this.a = inflate;
        inflate.setLayoutParams(new FrameLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.poster_art_width_default), -2));
        inflate.setOnClickListener(this);
        this.b = (ImageView) inflate.findViewById(R.id.poster_image);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aueq aueqVar = (aueq) obj;
        this.g = aueqVar;
        this.f.u(new acqx(aueqVar.f), null);
        ajjz ajjzVar = this.d;
        ImageView imageView = this.b;
        avgg avggVar = aueqVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        ImageView imageView2 = this.b;
        avgg avggVar2 = aueqVar.c;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        imageView2.setContentDescription(gfw.m(avggVar2));
        Resources resources = this.c.getResources();
        int i = -1;
        if ((aueqVar.b & 4) != 0) {
            auer auerVar = aueqVar.e;
            if (auerVar == null) {
                auerVar = auer.a;
            }
            int bA = anaf.bA(auerVar.b);
            if (bA == 0) {
                bA = 1;
            }
            int i2 = bA - 1;
            if (i2 == 0) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
            } else if (i2 == 1) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_large);
            }
        } else {
            i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
        }
        if (i > 0) {
            this.a.getLayoutParams().width = i;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aueq aueqVar = this.g;
        if (aueqVar == null) {
            return;
        }
        if ((aueqVar.b & 32) != 0) {
            this.f.I(3, new acqx(aueqVar.f.I()), null);
        }
        aueq aueqVar2 = this.g;
        if ((aueqVar2.b & 2) != 0) {
            aahd aahdVar = this.e;
            apxf apxfVar = aueqVar2.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}

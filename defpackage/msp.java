package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msp extends ajpc {
    public final Context a;
    public final aahd b;
    public final ajjz c;
    public final aaea d;
    mso e;
    private final gma f;
    private final ajuw g;
    private final FrameLayout h;
    private final ajut i;
    private mso j;
    private mso k;

    public msp(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar, aaea aaeaVar) {
        this.a = context;
        this.f = gmaVar;
        this.c = ajjzVar;
        this.b = aahdVar;
        this.g = ajuwVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        this.i = ajutVar;
        this.d = aaeaVar;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mso msoVar = this.e;
        if (msoVar != null) {
            msoVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        int i;
        avgg avggVar;
        ImageView imageView;
        auip auipVar = (auip) obj;
        this.h.removeAllViews();
        if (yjk.aa(this.a)) {
            int bn = anaf.bn(auipVar.m);
            if (bn == 0) {
                bn = 1;
            }
            i = bn + (-1) != 5 ? R.layout.grid_radio_item : R.layout.grid_radio_item_v2;
            this.e = g(i);
        } else if (f() == 2) {
            int bn2 = anaf.bn(auipVar.m);
            if (bn2 == 0) {
                bn2 = 1;
            }
            int i2 = bn2 - 1;
            i = i2 != 3 ? i2 != 4 ? R.layout.landscape_playlist_item : R.layout.landscape_programmed_playlist_item : R.layout.landscape_playlist_item_three_up;
            mso g = g(i);
            this.j = g;
            this.e = g;
        } else {
            int bn3 = anaf.bn(auipVar.m);
            if (bn3 == 0) {
                bn3 = 1;
            }
            int i3 = bn3 - 1;
            i = (i3 == 1 || i3 == 2) ? R.layout.full_bleed_playlist_item : i3 != 3 ? i3 != 4 ? R.layout.playlist_item : R.layout.programmed_playlist_item : R.layout.full_bleed_playlist_item_three_up;
            mso g2 = g(i);
            this.k = g2;
            this.e = g2;
        }
        if (i == R.layout.landscape_programmed_playlist_item || i == R.layout.programmed_playlist_item) {
            final mso msoVar = this.e;
            final apsq apsqVar = auipVar.o;
            if (apsqVar == null) {
                apsqVar = apsq.a;
            }
            apsr apsrVar = apsqVar.c;
            if (apsrVar == null) {
                apsrVar = apsr.a;
            }
            if ((apsrVar.b & 1) != 0) {
                apsr apsrVar2 = apsqVar.c;
                if (apsrVar2 == null) {
                    apsrVar2 = apsr.a;
                }
                avggVar = apsrVar2.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
            if (avggVar != null && (imageView = msoVar.o) != null) {
                whu.I(imageView, true);
                msoVar.p.c.h(msoVar.o, avggVar);
                msoVar.o.setOnClickListener(new View.OnClickListener() { // from class: msn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mso msoVar2 = mso.this;
                        apsq apsqVar2 = apsqVar;
                        if (mso.o(apsqVar2) != null) {
                            msoVar2.p.b.a(mso.o(apsqVar2));
                        }
                    }
                });
            }
        }
        if (i == R.layout.landscape_programmed_playlist_item) {
            this.e.h.setPaddingRelative(this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_start), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_top), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_end), this.a.getResources().getDimensionPixelSize(R.dimen.programmed_playlist_landscape_contextual_menu_anchor_padding_bottom));
        }
        this.h.addView(this.e.c);
        this.e.oB(ajokVar, auipVar);
        mso msoVar2 = this.e;
        View view = this.f.b;
        atdf atdfVar = auipVar.k;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        msoVar2.f(view, atdfVar, auipVar, ajokVar.a);
        this.f.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auip) obj).n.I();
    }

    public final int f() {
        return this.a.getResources().getConfiguration().orientation;
    }

    final mso g(int i) {
        return new mso(this, this.a, this.c, i, this.f, this.b, this.g, this.i);
    }
}

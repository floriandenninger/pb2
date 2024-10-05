package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mul extends ajpc {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    public final TextView a;
    public muk b;
    private final Context c;
    private final ajjz d;
    private final aahd e;
    private final ajop f;
    private final keg g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final ajuw n;
    private final ChipCloudView o;
    private final CompoundButton p;
    private final Resources q;
    private final aaea r;
    private final ahfc s;
    private ausu t;
    private final ajoi u;
    private final int v;
    private final int x;
    private final int y;
    private final int z;

    public mul(Context context, gma gmaVar, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, keg kegVar, aaea aaeaVar) {
        this.u = new ajoi(aahdVar, gmaVar);
        context.getClass();
        this.c = context;
        ajjzVar.getClass();
        this.d = ajjzVar;
        aahdVar.getClass();
        this.e = aahdVar;
        this.f = gmaVar;
        ajuwVar.getClass();
        this.n = ajuwVar;
        kegVar.getClass();
        this.g = kegVar;
        this.r = aaeaVar;
        Resources resources = context.getResources();
        this.q = resources;
        this.v = resources.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_top);
        this.x = resources.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_top);
        this.y = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top);
        this.z = resources.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_bottom);
        this.A = resources.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_bottom);
        this.B = resources.getDimensionPixelSize(R.dimen.shelf_header_badge_padding_bottom);
        this.C = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom);
        this.D = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top_linear_grid_tablet);
        this.E = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom_linear_grid_tablet);
        this.F = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset);
        this.G = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset_default);
        View inflate = View.inflate(context, R.layout.shelf_header, null);
        this.h = inflate;
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.a = (TextView) inflate.findViewById(R.id.autonav_title);
        this.j = (TextView) inflate.findViewById(R.id.autonav_toggle_title);
        this.k = (TextView) inflate.findViewById(R.id.subtitle);
        ChipCloudView chipCloudView = (ChipCloudView) inflate.findViewById(R.id.badges_container);
        this.o = chipCloudView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        chipCloudView.a(dimensionPixelSize, dimensionPixelSize);
        this.l = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.m = inflate.findViewById(R.id.contextual_menu_anchor);
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.autonav_toggle);
        this.p = compoundButton;
        this.s = new muh(this);
        compoundButton.setOnCheckedChangeListener(new mui(this, kegVar));
        inflate.addOnLayoutChangeListener(new muj(this));
        gmaVar.c(inflate);
    }

    private static apmp g(ausu ausuVar) {
        ausl auslVar = ausuVar.n;
        if (auslVar == null) {
            auslVar = ausl.a;
        }
        if ((auslVar.b & 1) == 0) {
            return null;
        }
        ausl auslVar2 = ausuVar.n;
        if (auslVar2 == null) {
            auslVar2 = ausl.a;
        }
        apmp apmpVar = auslVar2.c;
        return apmpVar == null ? apmp.a : apmpVar;
    }

    private static CharSequence h(aott aottVar, CharSequence charSequence) {
        if (aottVar != null && (aottVar.b & 1) != 0) {
            aots aotsVar = aottVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            if ((aotsVar.b & 2) != 0) {
                return aotsVar.c;
            }
        }
        return charSequence;
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.u.c();
        this.g.f(this.s);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bc  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void d(defpackage.ajok r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mul.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ausu) obj).u.I();
    }

    public final void f() {
        boolean g = this.g.g();
        this.p.setChecked(g);
        muk mukVar = this.b;
        if (mukVar != null) {
            mukVar.a(g);
        }
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}

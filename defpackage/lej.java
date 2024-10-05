package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lej extends ajpc implements ajof {
    public final View a;
    private final String b;
    private final Context c;
    private final Resources d;
    private final aahd e;
    private final ajjz f;
    private final ImageView g;
    private final ImageView h;
    private final FrameLayout i;
    private final TextView j;
    private final TextView k;
    private final ViewGroup l;
    private final ImageView m;
    private final ChipCloudView n;
    private final ajoi o;
    private final ajoi p;
    private final RelativeLayout.LayoutParams q;
    private final RelativeLayout.LayoutParams r;
    private aumq s;
    private final List t = new ArrayList();
    private final List u = new ArrayList();
    private final ajut v;

    public lej(Context context, aahd aahdVar, ajut ajutVar, ajjz ajjzVar) {
        context.getClass();
        this.c = context;
        Resources resources = context.getResources();
        this.d = resources;
        aahdVar.getClass();
        this.e = aahdVar;
        ajjzVar.getClass();
        this.f = ajjzVar;
        ajutVar.getClass();
        this.v = ajutVar;
        View inflate = View.inflate(context, R.layout.rich_list_header, null);
        this.a = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = imageView;
        View findViewById = inflate.findViewById(R.id.wrapper);
        this.i = (FrameLayout) inflate.findViewById(R.id.box_art_layout);
        this.h = (ImageView) inflate.findViewById(R.id.box_art);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.j = textView;
        this.k = (TextView) inflate.findViewById(R.id.subtitle);
        this.l = (ViewGroup) inflate.findViewById(R.id.standalone_badges_container);
        this.m = (ImageView) inflate.findViewById(R.id.icon);
        ChipCloudView chipCloudView = (ChipCloudView) inflate.findViewById(R.id.badges_container);
        this.n = chipCloudView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        chipCloudView.a(dimensionPixelSize, dimensionPixelSize);
        this.o = new ajoi(aahdVar, imageView);
        this.p = new ajoi(aahdVar, inflate);
        this.q = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        this.r = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        this.b = resources.getString(R.string.accessibility_header_postfix);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.o.c();
        this.p.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ee  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajok r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lej.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aumq) obj).k.I();
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apmg apmgVar;
        apmg apmgVar2;
        aumq aumqVar = this.s;
        if (aumqVar == null) {
            return false;
        }
        aump aumpVar = aumqVar.h;
        if (aumpVar == null) {
            aumpVar = aump.a;
        }
        if (aumpVar.b == 65153809) {
            apmgVar = (apmg) aumpVar.c;
        } else {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            return false;
        }
        aahd aahdVar = this.e;
        aump aumpVar2 = this.s.h;
        if (aumpVar2 == null) {
            aumpVar2 = aump.a;
        }
        if (aumpVar2.b == 65153809) {
            apmgVar2 = (apmg) aumpVar2.c;
        } else {
            apmgVar2 = apmg.a;
        }
        apxf apxfVar = apmgVar2.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        return false;
    }
}

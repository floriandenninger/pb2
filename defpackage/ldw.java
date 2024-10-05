package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldw extends ajpc implements ajof, ypd {
    private final fyd A;
    private arev B;
    private final lej C;
    private ftd D;
    private final ajnw E;
    private final ajun F;
    private boolean G;
    private final ajun H;
    private final ViewGroup a;
    private final RecyclerView b;
    private final int c;
    private final RelativeLayout d;
    private final ajpd e;
    private final akbu f;
    private final ypa g;
    private final TextView h;
    private final ajuw i;
    private final ImageView j;
    private final View k;
    private final View l;
    private final int m;
    private final Context n;
    private final Resources o;
    private final ViewGroup p;
    private final TextView q;
    private final ftm r;
    private final gno s;
    private final aahd t;
    private final ajox u;
    private final LinearLayoutManager v;
    private final ldv x;
    private final fte y;
    private final fyd z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [ajos, java.lang.Object] */
    public ldw(Context context, ajvb ajvbVar, akbu akbuVar, ypa ypaVar, azrw azrwVar, ftn ftnVar, akht akhtVar, fte fteVar, ajuw ajuwVar, aahd aahdVar, ajun ajunVar, ajoy ajoyVar, ajun ajunVar2, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.n = context;
        this.f = akbuVar;
        this.g = ypaVar;
        this.i = ajuwVar;
        this.t = aahdVar;
        this.y = fteVar;
        this.F = ajunVar;
        this.H = ajunVar2;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(R.layout.horizontal_card_list, (ViewGroup) null);
        this.a = viewGroup2;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup2.findViewById(R.id.header_layout);
        this.d = relativeLayout;
        this.l = viewGroup2.findViewById(R.id.separator);
        lej lejVar = (lej) azrwVar.get();
        this.C = lejVar;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(16, R.id.card_list_button);
        relativeLayout.addView(lejVar.a, 0, layoutParams);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_header_top_bottom_padding_adjustment);
        View view = lejVar.a;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom() + dimensionPixelSize);
        this.m = context.getResources().getDimensionPixelOffset(R.dimen.horizontal_card_list_channel_peekaboo_adjustment);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.card_list_container);
        this.b = recyclerView;
        if (viewGroup instanceof RecyclerView) {
            recyclerView.ag(((RecyclerView) viewGroup).g());
        }
        this.c = recyclerView.getPaddingTop();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.v = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        recyclerView.v(new zbn(recyclerView));
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        ajox a = ajoyVar.a(ajvbVar.get());
        this.u = a;
        a.h(ajpdVar);
        ajnw ajnwVar = new ajnw();
        this.E = ajnwVar;
        a.rU(ajnwVar);
        ldv ldvVar = new ldv();
        this.x = ldvVar;
        a.rU(ldvVar);
        this.z = new fyd(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing));
        this.A = new fyd(context.getResources().getDimensionPixelSize(R.dimen.horizontal_card_list_narrow_item_spacing));
        this.o = context.getResources();
        TextView textView = (TextView) viewGroup2.findViewById(R.id.card_list_button);
        this.h = textView;
        this.s = akhtVar.h(textView);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.card_list_subscribe_button);
        this.q = textView2;
        this.r = ftnVar.a(textView2, null);
        this.j = (ImageView) viewGroup2.findViewById(R.id.card_list_contextual_menu_anchor);
        this.k = viewGroup2.findViewById(R.id.card_list_contextual_menu_anchor_wrapper);
        this.p = (ViewGroup) viewGroup2.findViewById(R.id.sort_filter_sub_menu_container);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.clear();
        this.g.m(this);
        this.C.b(ajosVar);
        this.r.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajok r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldw.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arev) obj).j.I();
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apmg apmgVar;
        arev arevVar = this.B;
        if (arevVar == null) {
            return false;
        }
        aahd aahdVar = this.t;
        ares aresVar = arevVar.g;
        if (aresVar == null) {
            aresVar = ares.a;
        }
        if (aresVar.b == 65153809) {
            apmgVar = (apmg) aresVar.c;
        } else {
            apmgVar = apmg.a;
        }
        apxf apxfVar = apmgVar.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        return false;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aacj.class};
        }
        if (i == 0) {
            int indexOf = this.e.indexOf(((aacj) obj).b());
            if (indexOf < 0) {
                return null;
            }
            this.e.remove(indexOf);
            ajun ajunVar = this.F;
            arev arevVar = this.B;
            arev a = ajunVar.a(arevVar);
            if (indexOf >= a.d.size()) {
                zga.b("Index greater than total number of cards");
                return null;
            }
            aong aongVar = (aong) a.toBuilder();
            aongVar.copyOnWrite();
            arev arevVar2 = (arev) aongVar.instance;
            aony aonyVar = arevVar2.d;
            if (!aonyVar.c()) {
                arevVar2.d = aonm.mutableCopy(aonyVar);
            }
            arevVar2.d.remove(indexOf);
            arev arevVar3 = (arev) aongVar.build();
            if (amkq.b(arevVar3, ajunVar.a.get(arevVar))) {
                return null;
            }
            ajunVar.a.put(arevVar, arevVar3);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}

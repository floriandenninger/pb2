package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msa implements ajom {
    private Drawable A;
    private Drawable B;
    private final aadw C;
    private final ohg D;
    public final View a;
    public boolean b;
    private final Context c;
    private final View d;
    private final ajjz e;
    private final TextView f;
    private final ImageView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final ImageView k;
    private final ajuw l;
    private final ajoi m;
    private final ajjv n;
    private final gag o;
    private final glg p = new glg() { // from class: mrx
        @Override // defpackage.glg
        public final void a() {
            msa msaVar = msa.this;
            boolean z = msaVar.b;
            boolean e = msaVar.e();
            msaVar.b = e;
            if (z != e) {
                msaVar.d();
            }
        }
    };
    private final akbd q;
    private TextView r;
    private ImageView s;
    private jru t;
    private glh u;
    private String v;
    private boolean w;
    private boolean x;
    private Drawable y;
    private Drawable z;

    public msa(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, ohg ohgVar, aadw aadwVar, akbd akbdVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = context;
        this.e = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.set_bar_video_item, viewGroup, false);
        this.d = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = inflate.findViewById(R.id.thumbnail_border);
        this.g = (ImageView) inflate.findViewById(R.id.selected_position_indicator);
        this.h = (TextView) inflate.findViewById(R.id.duration);
        this.r = (TextView) inflate.findViewById(R.id.unplayable_reason);
        this.s = (ImageView) inflate.findViewById(R.id.unplayable_overlay);
        View findViewById = inflate.findViewById(R.id.thumbnail_layout);
        this.a = findViewById;
        this.k = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.l = ajuwVar;
        this.D = ohgVar;
        this.C = aadwVar;
        this.q = akbdVar;
        ajju b = ajjzVar.c().b();
        b.c = new mrz(this);
        b.c(false);
        this.n = b.a();
        this.m = new ajoi(aahdVar, inflate);
        this.o = new gag((ViewStub) inflate.findViewById(R.id.standalone_ypc_badge), 0);
        if (ohgVar != null) {
            ViewStub viewStub = (ViewStub) findViewById.findViewById(R.id.offline_thumbnail_badge);
            this.t = viewStub != null ? ohgVar.b(viewStub, null) : null;
        }
    }

    private final void f() {
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private final void g() {
        this.g.setVisibility(0);
        Drawable drawable = this.g.getDrawable();
        drawable.setColorFilter(wbs.Q(this.c, R.attr.ytIconActiveOther), PorterDuff.Mode.SRC_ATOP);
        this.g.setImageDrawable(drawable);
        whu.P(this.i, (int) (this.c.getResources().getFraction(R.dimen.set_bar_video_item_thumb_selected_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(wbs.W(this.c, R.attr.ytOverlayTextPrimary).orElse(0));
        whu.I(this.j, true);
    }

    private final void h() {
        this.g.setVisibility(4);
        whu.P(this.i, (int) (this.c.getResources().getFraction(R.dimen.set_bar_video_item_thumb_alpha, 1, 1) * 255.0f));
        this.h.setTextColor(wbs.W(this.c, R.attr.ytOverlayTextSecondary).orElse(0));
        whu.I(this.j, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        glh glhVar = this.u;
        if (glhVar != null) {
            glhVar.oU(this.p);
        }
    }

    public final boolean e() {
        glh glhVar = this.u;
        return (glhVar == null || glhVar.b() == null || this.v == null) ? this.w : amkq.b(this.u.b(), this.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msa.oB(ajok, java.lang.Object):void");
    }

    public final void d() {
        if (this.x) {
            if (!this.b) {
                this.d.setBackgroundColor(wbs.Q(this.c, R.attr.ytGeneralBackgroundA));
                if (this.q.d()) {
                    if (this.B == null) {
                        akba a = akba.a(this.c);
                        a.b = this.d.getBackground();
                        this.B = a.b();
                    }
                    this.d.setBackground(this.B);
                }
                this.f.setTextColor(wbs.Q(this.c, R.attr.ytTextSecondary));
                h();
                return;
            }
            this.d.setBackgroundColor(wbs.Q(this.c, R.attr.ytGeneralBackgroundB));
            if (this.q.d()) {
                if (this.A == null) {
                    akba a2 = akba.a(this.c);
                    a2.b = this.d.getBackground();
                    this.A = a2.b();
                }
                this.d.setBackground(this.A);
            }
            this.f.setTextColor(wbs.Q(this.c, R.attr.ytTextPrimary));
            g();
            return;
        }
        if (!this.b) {
            if (this.q.d()) {
                if (this.z == null) {
                    akba a3 = akba.a(this.c);
                    a3.a = -1;
                    this.z = a3.b();
                }
                this.d.setBackground(this.z);
            } else {
                this.d.setBackgroundResource(R.drawable.bg_set_row);
            }
            this.f.setTextColor(aih.d(this.c, R.color.yt_grey2));
            h();
            return;
        }
        this.d.setBackgroundResource(R.drawable.bg_set_row_selected);
        if (this.q.d()) {
            if (this.y == null) {
                akba a4 = akba.a(this.c);
                a4.a = -1;
                a4.b = this.d.getBackground();
                this.y = a4.b();
            }
            this.d.setBackground(this.y);
        }
        this.f.setTextColor(aih.d(this.c, R.color.yt_white1));
        g();
    }
}

package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzx implements View.OnClickListener, View.OnLongClickListener, fzk {
    public final aths a;
    protected View b;
    protected ImageView c;
    protected Bitmap d;
    private final axpg e;
    private final ci f;
    private final LayoutInflater g;
    private final Resources h;
    private final ajjz i;
    private final aftn j;
    private final azrw k;
    private final ajut l;
    private final acra m;
    private final yki n;
    private MenuItem o;
    private final MultiPageMenuDialogFragmentController p;
    private final mdb q;

    public lzx(ci ciVar, ajjz ajjzVar, MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController, aftn aftnVar, azrw azrwVar, ajut ajutVar, axpg axpgVar, mda mdaVar, LayoutInflater layoutInflater, Resources resources, acra acraVar, aths athsVar) {
        this.f = ciVar;
        this.h = resources;
        this.g = layoutInflater;
        this.i = ajjzVar;
        this.e = axpgVar;
        this.p = multiPageMenuDialogFragmentController;
        this.j = aftnVar;
        this.k = azrwVar;
        this.l = ajutVar;
        this.m = acraVar;
        this.a = athsVar;
        this.q = mdaVar.b();
        this.n = yki.c(ciVar, new lzw(this));
        this.d = BitmapFactory.decodeResource(resources, R.drawable.quantum_ic_account_circle_grey600_24);
        b();
    }

    private final void b() {
        avgg avggVar;
        aths athsVar = this.a;
        if ((athsVar.c == 2 ? (avgg) athsVar.d : avgg.a).c.size() != 0) {
            aths athsVar2 = this.a;
            if (athsVar2.c == 2) {
                avggVar = (avgg) athsVar2.d;
            } else {
                avggVar = avgg.a;
            }
            this.i.l(Uri.parse(((avgf) avggVar.c.get(0)).c), this.n);
        }
        aths athsVar3 = this.a;
        if (athsVar3.c == 1) {
            ajut ajutVar = this.l;
            arfr b = arfr.b(((arfs) athsVar3.d).c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b);
            if (this.o == null || this.b == null || a == 0) {
                return;
            }
            this.c.setImageResource(a);
            this.c.setColorFilter(wbs.W(this.f, R.attr.ytTextPrimary).orElse(0));
            this.o.setActionView(this.b);
        }
    }

    public final void a() {
        if (this.o == null || this.b == null) {
            return;
        }
        this.c.setImageDrawable(new BitmapDrawable(this.h, this.d));
        this.c.clearColorFilter();
        this.o.setActionView(this.b);
    }

    @Override // defpackage.fze
    public final int g() {
        return this.q.a();
    }

    @Override // defpackage.fze
    public final int h() {
        return 0;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        if (this.b == null) {
            this.b = this.g.inflate(R.layout.mobile_topbar_avatar_button, (ViewGroup) null, false);
        }
        this.c = (ImageView) this.b.findViewById(R.id.image);
        menuItem.setShowAsAction(2);
        this.c.setContentDescription(o());
        this.b.setOnClickListener(this);
        this.b.setOnLongClickListener(this);
        this.o = menuItem;
        a();
        final mkc mkcVar = (mkc) this.k.get();
        mkcVar.c(new zfi() { // from class: lzv
            @Override // defpackage.zfi
            public final void a(Object obj) {
                lzx lzxVar = lzx.this;
                mkc mkcVar2 = mkcVar;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                mkcVar2.f(lzxVar.c, lzxVar.a);
            }
        });
        b();
        if ((this.a.b & 4096) != 0) {
            ((akcp) this.e.get()).d(this.a.j, this.b);
        }
    }

    @Override // defpackage.fze
    public final boolean m() {
        return false;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.q.a + 1000;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return this.h.getString(R.string.account);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController = this.p;
        aths athsVar = this.a;
        multiPageMenuDialogFragmentController.k();
        if (multiPageMenuDialogFragmentController.i() == null) {
            lux luxVar = new lux();
            Bundle bundle = new Bundle();
            bundle.putByteArray("MenuButtonRendererKey", athsVar.toByteArray());
            luxVar.af(bundle);
            luxVar.al(true);
            amkq.N(true);
            multiPageMenuDialogFragmentController.j(luxVar);
        }
        aths athsVar2 = this.a;
        if ((athsVar2.b & 32) != 0) {
            this.m.I(3, new acqx(athsVar2.g.I()), null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.j.c(this.f, this.a.g.I(), null);
        aths athsVar = this.a;
        if ((athsVar.b & 32) == 0) {
            return false;
        }
        this.m.I(1025, new acqx(athsVar.g.I()), null);
        return false;
    }
}

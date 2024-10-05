package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import com.google.android.apps.youtube.app.ui.SearchEditText;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxm extends ajpc {
    public final Context a;
    public final ViewGroup b;
    public final SearchEditText c;
    public final TextView d;
    public final Animation e;
    public boolean f;
    public CharSequence g;
    public lxf h;
    boolean i;
    private final ajut j;
    private final ypa k;
    private final ImageView l;
    private final ImageView m;
    private final Animation n;
    private boolean o;
    private aunk p;
    private String q;

    public lxm(Context context, ajut ajutVar, ypa ypaVar) {
        this.a = context;
        this.j = ajutVar;
        this.k = ypaVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.search_box, null);
        this.b = viewGroup;
        SearchEditText searchEditText = (SearchEditText) viewGroup.findViewById(R.id.search_edit_text);
        this.c = searchEditText;
        searchEditText.addTextChangedListener(new lxj(this));
        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lxi
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                lxm lxmVar = lxm.this;
                if (i != 3) {
                    return false;
                }
                lxmVar.h(false);
                return true;
            }
        });
        searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lxh
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                lxm lxmVar = lxm.this;
                if (z) {
                    if (lxmVar.h != null && !zev.e(lxmVar.a)) {
                        ((ScrollToTopLinearLayoutManager) lxmVar.h.b.n).c = false;
                    }
                    if (lxmVar.i) {
                        return;
                    }
                    lxmVar.d.setVisibility(4);
                    lxmVar.d.startAnimation(lxmVar.e);
                    lxmVar.i = true;
                }
            }
        });
        this.l = (ImageView) viewGroup.findViewById(R.id.search_icon);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.clear);
        this.m = imageView;
        final int i = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lxg
            public final /* synthetic */ lxm a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    lxm lxmVar = this.a;
                    lxmVar.c.clearFocus();
                    lxf lxfVar = lxmVar.h;
                    if (lxfVar != null) {
                        lxfVar.d();
                    }
                    whu.C(lxmVar.c);
                    if (lxmVar.f) {
                        lxmVar.g();
                        lxmVar.h(true);
                        return;
                    } else {
                        lxmVar.g();
                        lxmVar.f();
                        return;
                    }
                }
                lxm lxmVar2 = this.a;
                lxmVar2.g();
                if (lxmVar2.c.hasFocus()) {
                    return;
                }
                lxmVar2.c.requestFocus();
                whu.J(lxmVar2.c);
            }
        });
        TextView textView = (TextView) viewGroup.findViewById(R.id.cancel);
        this.d = textView;
        final int i2 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lxg
            public final /* synthetic */ lxm a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    lxm lxmVar = this.a;
                    lxmVar.c.clearFocus();
                    lxf lxfVar = lxmVar.h;
                    if (lxfVar != null) {
                        lxfVar.d();
                    }
                    whu.C(lxmVar.c);
                    if (lxmVar.f) {
                        lxmVar.g();
                        lxmVar.h(true);
                        return;
                    } else {
                        lxmVar.g();
                        lxmVar.f();
                        return;
                    }
                }
                lxm lxmVar2 = this.a;
                lxmVar2.g();
                if (lxmVar2.c.hasFocus()) {
                    return;
                }
                lxmVar2.c.requestFocus();
                whu.J(lxmVar2.c);
            }
        });
        whu.E(textView, textView.getBackground());
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.search_cancel_show);
        this.e = loadAnimation;
        loadAnimation.setAnimationListener(new lxk(this, 1));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.search_cancel_hide);
        this.n = loadAnimation2;
        loadAnimation2.setAnimationListener(new lxk(this, 0));
        this.i = false;
    }

    private final void k() {
        this.c.setText(this.g);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aunk aunkVar = (aunk) obj;
        aunk aunkVar2 = this.p;
        if (aunkVar2 == null || aunkVar2 != aunkVar) {
            if ((aunkVar.b & 8) != 0) {
                aqyg aqygVar = aunkVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                this.g = ajcq.b(aqygVar);
                this.f = true;
            } else {
                this.g = "";
                this.f = false;
            }
            k();
        }
        if ((aunkVar.b & 16) != 0) {
            SearchEditText searchEditText = this.c;
            aqyg aqygVar2 = aunkVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            searchEditText.setHint(ajcq.b(aqygVar2));
            SearchEditText searchEditText2 = this.c;
            aqyg aqygVar3 = aunkVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            searchEditText2.setContentDescription(ajcq.b(aqygVar3));
        }
        this.l.setVisibility(8);
        aunl aunlVar = aunkVar.c;
        if (aunlVar == null) {
            aunlVar = aunl.a;
        }
        if ((aunlVar.b & 1) != 0) {
            aunl aunlVar2 = aunkVar.c;
            if (aunlVar2 == null) {
                aunlVar2 = aunl.a;
            }
            apmg apmgVar = aunlVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 32) != 0) {
                ImageView imageView = this.l;
                ajut ajutVar = this.j;
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ajutVar.a(b));
                this.l.setVisibility(0);
            }
        }
        this.o = false;
        aunj aunjVar = aunkVar.d;
        if (aunjVar == null) {
            aunjVar = aunj.a;
        }
        if ((aunjVar.b & 1) != 0) {
            aunj aunjVar2 = aunkVar.d;
            if (aunjVar2 == null) {
                aunjVar2 = aunj.a;
            }
            apmg apmgVar2 = aunjVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            if ((apmgVar2.b & 32) != 0) {
                ImageView imageView2 = this.m;
                ajut ajutVar2 = this.j;
                arfs arfsVar2 = apmgVar2.g;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                imageView2.setImageResource(ajutVar2.a(b2));
                this.o = true;
                aott aottVar = apmgVar2.s;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                aots aotsVar = aottVar.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                if ((aotsVar.b & 2) != 0) {
                    ImageView imageView3 = this.m;
                    aott aottVar2 = apmgVar2.s;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar2 = aottVar2.c;
                    if (aotsVar2 == null) {
                        aotsVar2 = aots.a;
                    }
                    imageView3.setContentDescription(aotsVar2.c);
                }
            }
        }
        j();
        i();
        lxf c = lxf.c(ajokVar);
        this.h = c;
        if (c != null) {
            c.e = this;
            this.q = c.d;
        }
        this.p = aunkVar;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aunk) obj).g.I();
    }

    public final void f() {
        if (this.i) {
            this.d.startAnimation(this.n);
            this.i = false;
        }
    }

    public final void g() {
        this.g = "";
        k();
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(boolean z) {
        if (this.c.getEditableText().length() != 0 || z) {
            whu.C(this.c);
            lxf lxfVar = this.h;
            if (lxfVar != null) {
                lxfVar.d();
            }
            this.k.f(new lxl(this.c.getEditableText().toString(), this.q));
        }
    }

    public final void i() {
        this.d.clearAnimation();
        if (this.g.length() > 0 || this.f) {
            this.d.setVisibility(0);
            this.i = true;
        } else {
            this.d.setVisibility(8);
            this.i = false;
        }
    }

    public final void j() {
        zhh j;
        if (!this.o) {
            this.m.setImageAlpha(0);
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        if (this.c.getEditableText().length() == 0) {
            j = yny.j(16, R.id.cancel);
            this.m.setImageAlpha(0);
            this.m.setClickable(false);
        } else {
            j = yny.j(16, R.id.clear);
            this.m.setImageAlpha(PrivateKeyType.INVALID);
            this.m.setClickable(true);
        }
        yny.z(this.c, j, RelativeLayout.LayoutParams.class);
    }
}

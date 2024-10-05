package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpi extends ajpc implements ygx {
    public final ci a;
    public final hpy b;
    public View c;
    private final Context d;
    private View e;
    private yha f;
    private arfm g;
    private ajok h;
    private final akht i;

    public hpi(Context context, ci ciVar, akht akhtVar, hpy hpyVar, byte[] bArr) {
        this.d = context;
        this.a = ciVar;
        this.i = akhtVar;
        this.b = hpyVar;
    }

    private final void h(boolean z) {
        if (z) {
            this.f.oB(this.h, this.g);
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        yha yhaVar = this.f;
        if (yhaVar != null) {
            yhaVar.b(ajosVar);
            this.f.m(this);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqwi aqwiVar;
        Drawable drawable;
        final BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
        this.h = ajokVar;
        this.c = LayoutInflater.from(this.d).inflate(R.layout.feed_tabbed_header, (ViewGroup) null);
        arjq arjqVar = browseResponseModel.a.d;
        if (arjqVar == null) {
            arjqVar = arjq.a;
        }
        if (arjqVar.b == 50236216) {
            aqwiVar = (aqwi) arjqVar.c;
        } else {
            aqwiVar = aqwi.a;
        }
        TextView textView = (TextView) this.c.findViewById(R.id.feed_tabbed_header_title_text);
        aqyg aqygVar = aqwiVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        ImageView imageView = (ImageView) this.c.findViewById(R.id.feed_tabbed_back);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setAutoMirrored(true);
        }
        if (browseResponseModel.a.m.size() != 0) {
            for (aulq aulqVar : browseResponseModel.a.m) {
                if (aulqVar.pY(IconBadgeRendererOuterClass.iconBadgeRenderer)) {
                    arfm arfmVar = (arfm) aulqVar.pX(IconBadgeRendererOuterClass.iconBadgeRenderer);
                    arfs arfsVar = arfmVar.d;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    if (b == arfr.SHOPPING_CART) {
                        this.g = arfmVar;
                        if (this.f == null) {
                            View findViewById = this.c.findViewById(R.id.cart_button);
                            this.e = findViewById;
                            findViewById.setVisibility(0);
                            this.f = this.i.b((ViewStub) this.e.findViewById(R.id.icon_badge));
                        }
                        this.f.h(this.g);
                        if (!this.g.c.isEmpty()) {
                            this.f.j(this);
                        }
                        h(this.g.f);
                    }
                }
            }
        }
        if ((browseResponseModel.a.b & 131072) == 0) {
            f().setVisibility(8);
            return;
        }
        View f = f();
        f.setVisibility(0);
        f.setOnClickListener(new View.OnClickListener() { // from class: hph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atdc atdcVar;
                hpi hpiVar = hpi.this;
                BrowseResponseModel browseResponseModel2 = browseResponseModel;
                hpy hpyVar = hpiVar.b;
                ci ciVar = hpiVar.a;
                arjz arjzVar = browseResponseModel2.a.k;
                if (arjzVar == null) {
                    arjzVar = arjz.a;
                }
                if (arjzVar.b == 66439850) {
                    atdcVar = (atdc) arjzVar.c;
                } else {
                    atdcVar = atdc.a;
                }
                hpyVar.a(ciVar, atdcVar);
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ byte[] e(Object obj) {
        return ((BrowseResponseModel) obj).d();
    }

    public final View f() {
        return this.c.findViewById(R.id.feed_tabbed_more);
    }

    @Override // defpackage.ygx
    public final void ou(arfk arfkVar) {
        yha yhaVar = this.f;
        if (yhaVar == null || !yhaVar.n(arfkVar)) {
            return;
        }
        h(arfkVar.getIsVisible().booleanValue());
    }
}

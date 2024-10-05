package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldt extends ajpc implements View.OnClickListener, View.OnLayoutChangeListener {
    private final Activity a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final ajjz e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private String j;
    private arbc k;
    private float l = 0.0f;

    public ldt(Activity activity, ajjz ajjzVar, ViewGroup viewGroup) {
        this.a = activity;
        this.e = ajjzVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.geo_details_card, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.place_name);
        this.d = (TextView) inflate.findViewById(R.id.place_address);
        this.f = (ImageView) inflate.findViewById(R.id.place_image);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.place_map);
        this.g = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.wide_place_map);
        this.h = imageView2;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.place_link_icon);
        this.i = imageView3;
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        inflate.addOnLayoutChangeListener(this);
    }

    private final void f() {
        ImageView imageView;
        int i;
        if (this.k == null) {
            return;
        }
        if (this.h.getVisibility() == 0) {
            float f = this.l;
            if (f == 0.0f) {
                return;
            }
            imageView = this.h;
            i = Math.round(f * 300.0f);
        } else {
            imageView = this.g;
            i = 300;
        }
        Uri.Builder path = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap");
        arba arbaVar = this.k.f;
        if (arbaVar == null) {
            arbaVar = arba.a;
        }
        Uri.Builder appendQueryParameter = path.appendQueryParameter("key", arbaVar.e);
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x300");
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("size", sb.toString());
        arba arbaVar2 = this.k.f;
        if (arbaVar2 == null) {
            arbaVar2 = arba.a;
        }
        double d = arbaVar2.b;
        arba arbaVar3 = this.k.f;
        if (arbaVar3 == null) {
            arbaVar3 = arba.a;
        }
        double d2 = arbaVar3.c;
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append(d);
        sb2.append(",");
        sb2.append(d2);
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("markers", sb2.toString());
        if (this.k.g.size() > 0) {
            StringBuilder sb3 = new StringBuilder();
            for (int i2 = 0; i2 < this.k.g.size(); i2++) {
                if (i2 > 0) {
                    sb3.append('|');
                }
                sb3.append(((arbb) this.k.g.get(i2)).b);
                sb3.append(',');
                sb3.append(((arbb) this.k.g.get(i2)).c);
            }
            appendQueryParameter3.appendQueryParameter("visible", sb3.toString());
        }
        String.valueOf(String.valueOf(appendQueryParameter3.build())).length();
        this.e.g(imageView, appendQueryParameter3.build());
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
        arbc arbcVar = (arbc) obj;
        int i = arbcVar.b;
        if ((i & 1) == 0 || (i & 16) == 0) {
            return;
        }
        this.k = arbcVar;
        arba arbaVar = arbcVar.f;
        if (arbaVar == null) {
            arbaVar = arba.a;
        }
        this.j = arbaVar.d;
        TextView textView = this.c;
        aqyg aqygVar = arbcVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.d;
        aqyg aqygVar2 = arbcVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        avgg avggVar = arbcVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (ahbw.L(avggVar)) {
            ajjz ajjzVar = this.e;
            ImageView imageView = this.f;
            avgg avggVar2 = arbcVar.e;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar.h(imageView, avggVar2);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.h.setVisibility(4);
            f();
            return;
        }
        this.f.setVisibility(4);
        this.g.setVisibility(4);
        this.h.setVisibility(0);
        if (this.l > 0.0f) {
            f();
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.j;
        if (str != null) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5) {
            return;
        }
        this.l = this.h.getWidth() / this.h.getHeight();
        f();
    }
}

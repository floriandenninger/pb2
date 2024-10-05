package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acka extends BaseAdapter {
    public final Context a;
    public final asgi b;
    public final aahd c;
    public final acra d;
    public int e;
    ImageView f;
    private final LayoutInflater g;
    private final ajut h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final List o;

    public acka(Context context, ajut ajutVar, acra acraVar, aahd aahdVar, asgi asgiVar, int i) {
        this.e = -1;
        context.getClass();
        this.a = context;
        this.g = LayoutInflater.from(context);
        this.h = ajutVar;
        this.i = R.layout.lc_input_select_spinner_item;
        this.j = R.layout.lc_input_select_spinner_dropdown_item;
        this.k = R.id.icon;
        this.l = R.id.title;
        this.m = R.id.subtitle;
        this.n = i;
        this.c = aahdVar;
        this.d = acraVar;
        asgiVar.getClass();
        this.b = asgiVar;
        this.o = asgiVar.c;
    }

    private final View b(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        aqyg aqygVar;
        int i3;
        ajut ajutVar;
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        asgh item = getItem(i);
        if (item == null) {
            return view;
        }
        ImageView imageView = (ImageView) view.findViewById(this.k);
        if (imageView != null) {
            if (this.k != 0 && (item.b & 16) != 0 && (ajutVar = this.h) != null) {
                arfs arfsVar = item.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int a = ajutVar.a(b);
                if (a != 0) {
                    imageView.setImageResource(a);
                    i3 = 0;
                    imageView.setVisibility(i3);
                }
            }
            i3 = 8;
            imageView.setVisibility(i3);
        }
        int i4 = this.l;
        aqyg aqygVar2 = null;
        if (i4 != 0 && (item.b & 1) != 0 && (textView2 = (TextView) view.findViewById(i4)) != null) {
            if ((item.b & 1) != 0) {
                aqygVar = item.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView2.setText(ajcq.b(aqygVar));
        }
        if (z) {
            if (this.e == i) {
                view.setBackgroundColor(aih.d(this.a, R.color.quantum_grey700));
            }
            int i5 = this.m;
            if (i5 != 0 && (item.b & 2) != 0 && (textView = (TextView) view.findViewById(i5)) != null) {
                if ((item.b & 2) != 0 && (aqygVar2 = item.f) == null) {
                    aqygVar2 = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar2));
                textView.setVisibility(0);
            }
        }
        int i6 = this.n;
        if (i6 != 0) {
            ImageView imageView2 = (ImageView) view.findViewById(i6);
            this.f = imageView2;
            if (imageView2 != null && i < this.b.c.size() && this.c != null && this.d != null) {
                aulq aulqVar = ((asgh) this.b.c.get(i)).j;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    aulq aulqVar2 = ((asgh) this.b.c.get(i)).j;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    ajut ajutVar2 = this.h;
                    arfs arfsVar2 = apmgVar.g;
                    if (arfsVar2 == null) {
                        arfsVar2 = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar2.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    int a2 = ajutVar2.a(b2);
                    if (a2 != 0) {
                        if ((apmgVar.b & 65536) != 0) {
                            ImageView imageView3 = this.f;
                            aots aotsVar = apmgVar.r;
                            if (aotsVar == null) {
                                aotsVar = aots.a;
                            }
                            imageView3.setContentDescription(aotsVar.c);
                        }
                        this.f.setImageDrawable(aii.a(this.a, a2));
                        this.f.setVisibility(0);
                        this.f.setOnClickListener(new acjz(this, i));
                    }
                }
            }
        } else {
            ImageView imageView4 = this.f;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final asgh getItem(int i) {
        return (asgh) this.o.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.o.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return b(this.g, i, view, viewGroup, this.j, true);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return b(this.g, i, view, viewGroup, this.i, false);
    }

    public acka(Context context, ajut ajutVar, asgi asgiVar) {
        this(context, ajutVar, null, null, asgiVar, 0);
    }
}

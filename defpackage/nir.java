package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nir extends ajpc {
    public final View a;
    private final ajjz b;
    private final ajut c;
    private final ajoi d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final TextView j;
    private final ViewStub k;
    private gaf l;

    public nir(Context context, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, ajoy ajoyVar, int i, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = ajjzVar;
        this.c = ajutVar;
        int i2 = i - 1;
        int i3 = R.layout.rich_metadata_box_art;
        if (i2 == 1) {
            i3 = R.layout.rich_metadata_topic;
        } else if (i2 != 2 && i2 == 3) {
            i3 = R.layout.rich_metadata_thumbnail;
        }
        View inflate = LayoutInflater.from(context).inflate(i3, viewGroup, false);
        this.a = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        this.h = (TextView) inflate.findViewById(R.id.call_to_action);
        this.i = (ImageView) inflate.findViewById(R.id.call_to_action_icon);
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.thumbnail_bottom_label);
        this.d = new ajoi(aahdVar, inflate);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.metadata_badge);
        this.k = viewStub;
        if (viewStub != null) {
            this.l = ajoyVar.J(context, viewStub);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.c();
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(0);
            this.i.setVisibility(8);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        ateg ategVar = (ateg) obj;
        apxf apxfVar = null;
        if ((ategVar.b & 2) != 0) {
            avgg avggVar = ategVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            for (avfv avfvVar : ategVar.e) {
                if (this.j != null && (avfvVar.b & 2) != 0) {
                    avfl avflVar = avfvVar.d;
                    if (avflVar == null) {
                        avflVar = avfl.a;
                    }
                    TextView textView = this.j;
                    if ((avflVar.b & 1) != 0) {
                        aqygVar4 = avflVar.c;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                    } else {
                        aqygVar4 = null;
                    }
                    whu.G(textView, ajcq.b(aqygVar4));
                }
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                this.b.h(imageView, avggVar);
                aott aottVar = avggVar.d;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                aots aotsVar = aottVar.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                if ((aotsVar.b & 2) == 0) {
                    this.e.setContentDescription(null);
                } else {
                    ImageView imageView2 = this.e;
                    aott aottVar2 = avggVar.d;
                    if (aottVar2 == null) {
                        aottVar2 = aott.a;
                    }
                    aots aotsVar2 = aottVar2.c;
                    if (aotsVar2 == null) {
                        aotsVar2 = aots.a;
                    }
                    imageView2.setContentDescription(aotsVar2.c);
                }
            }
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            if ((ategVar.b & 4) != 0) {
                aqygVar3 = ategVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            whu.G(textView2, ajcq.b(aqygVar3));
        }
        TextView textView3 = this.g;
        if (textView3 != null) {
            if ((ategVar.b & 8) != 0) {
                aqygVar2 = ategVar.h;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            whu.G(textView3, ajcq.b(aqygVar2));
        }
        TextView textView4 = this.h;
        if (textView4 != null) {
            if ((ategVar.b & 16) != 0) {
                aqygVar = ategVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView4, ajcq.b(aqygVar));
        }
        ImageView imageView3 = this.i;
        if (imageView3 != null) {
            if ((ategVar.b & 32) == 0) {
                imageView3.setVisibility(8);
            } else {
                ajut ajutVar = this.c;
                arfs arfsVar = ategVar.j;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView3.setImageResource(ajutVar.a(b));
                this.i.setVisibility(0);
            }
        }
        int i = ategVar.b & 128;
        if (i != 0) {
            ajoi ajoiVar = this.d;
            acra acraVar = ajokVar.a;
            if (i != 0 && (apxfVar = ategVar.k) == null) {
                apxfVar = apxf.a;
            }
            ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        }
        ViewStub viewStub = this.k;
        if (viewStub != null) {
            viewStub.setVisibility(8);
            for (apjt apjtVar : ategVar.f) {
                if ((apjtVar.b & 131072) != 0) {
                    gaf gafVar = this.l;
                    atdu atduVar = apjtVar.f;
                    if (atduVar == null) {
                        atduVar = atdu.a;
                    }
                    gafVar.f(atduVar);
                    this.k.setVisibility(0);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ateg) obj).l.I();
    }
}

package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class kwy implements ajom {
    static final arfr a = arfr.UNKNOWN;
    public final Context b;
    public final View c;
    public final TextView d;
    protected final TextView e;
    protected final TextView f;
    public final PlaylistThumbnailView g;
    public final ImageView h;
    public final ViewStub i;
    public final ViewStub j;
    public gaf k;
    public jru l;
    public final ohg m;
    public final ajoy n;
    private final ajjz o;
    private final ajuw p;
    private final TextView q;
    private final ajut r;
    private final ImageView s;

    public kwy(Context context, ajjz ajjzVar, ajuw ajuwVar, int i, ajut ajutVar) {
        this(context, ajjzVar, ajuwVar, i, ajutVar, null, null, null, null, null, null, null, null);
    }

    public static final boolean m(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        jru jruVar = this.l;
        if (jruVar != null) {
            jruVar.a();
        }
    }

    public final void d(CharSequence charSequence) {
        whu.G(this.e, charSequence);
    }

    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.e.setSingleLine(false);
            this.e.setMaxLines(2);
            whu.G(this.e, charSequence);
        } else if (!TextUtils.isEmpty(charSequence2)) {
            this.e.setSingleLine(true);
            whu.G(this.e, charSequence2);
        } else {
            this.e.setVisibility(8);
        }
    }

    public final void f(View view, atdf atdfVar, Object obj, acra acraVar) {
        atdc atdcVar;
        ajuw ajuwVar = this.p;
        ImageView imageView = this.h;
        if (atdfVar == null || (atdfVar.b & 1) == 0) {
            atdcVar = null;
        } else {
            atdc atdcVar2 = atdfVar.c;
            if (atdcVar2 == null) {
                atdcVar2 = atdc.a;
            }
            atdcVar = atdcVar2;
        }
        ajuwVar.e(view, imageView, atdcVar, obj, acraVar);
    }

    public final void g(avgg avggVar) {
        this.g.d(ahbw.M(avggVar));
        this.o.h(this.g.b, avggVar);
    }

    public final void i(List list) {
        arfr arfrVar;
        int i;
        arfr arfrVar2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avfv avfvVar = (avfv) it.next();
            int i2 = avfvVar.b;
            if ((i2 & 256) != 0) {
                avfu avfuVar = avfvVar.g;
                if (avfuVar == null) {
                    avfuVar = avfu.a;
                }
                YouTubeTextView youTubeTextView = this.g.c;
                aqyg aqygVar = avfuVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                Spanned b = ajcq.b(aqygVar);
                whu.G(youTubeTextView, b);
                int b2 = (avfuVar.b & 1) != 0 ? zhq.b(b.toString(), 0) : 0;
                youTubeTextView.setContentDescription(this.b.getResources().getQuantityString(R.plurals.video_count, b2, Integer.valueOf(b2)));
                if ((avfuVar.b & 2) != 0) {
                    arfs arfsVar = avfuVar.d;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfrVar = arfr.b(arfsVar.c);
                    if (arfrVar == null) {
                        arfrVar = arfr.UNKNOWN;
                    }
                } else {
                    arfrVar = a;
                }
                this.g.b(this.r.a(arfrVar));
                this.g.e(true);
                TextView textView = this.q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if ((i2 & 2) != 0) {
                avfl avflVar = avfvVar.d;
                if (avflVar == null) {
                    avflVar = avfl.a;
                }
                this.g.e(false);
                aqyg aqygVar2 = avflVar.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                Spanned b3 = ajcq.b(aqygVar2);
                if (this.q != null && !TextUtils.isEmpty(b3)) {
                    this.q.setVisibility(0);
                    this.q.setText(b3);
                    this.q.setContentDescription(b3);
                }
                int i3 = avflVar.b;
                if ((i3 & 1) != 0 && (i = i3 & 2) != 0) {
                    if (i != 0) {
                        arfs arfsVar2 = avflVar.d;
                        if (arfsVar2 == null) {
                            arfsVar2 = arfs.a;
                        }
                        arfrVar2 = arfr.b(arfsVar2.c);
                        if (arfrVar2 == null) {
                            arfrVar2 = arfr.UNKNOWN;
                        }
                    } else {
                        arfrVar2 = a;
                    }
                    int a2 = this.r.a(arfrVar2);
                    if (a2 != 0) {
                        this.s.setImageDrawable(this.b.getResources().getDrawable(a2));
                    }
                }
            }
        }
    }

    public final void j(CharSequence charSequence, CharSequence charSequence2) {
        YouTubeTextView youTubeTextView = this.g.c;
        whu.G(youTubeTextView, charSequence);
        youTubeTextView.setContentDescription(charSequence2);
    }

    public final void k(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void l(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    public kwy(Context context, ajjz ajjzVar, ajuw ajuwVar, int i, ajut ajutVar, ViewGroup viewGroup, ohg ohgVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = context;
        ajjzVar.getClass();
        this.o = ajjzVar;
        this.p = ajuwVar;
        this.r = ajutVar;
        this.m = ohgVar;
        this.n = ajoyVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.owner);
        this.f = (TextView) inflate.findViewById(R.id.video_count);
        this.q = (TextView) inflate.findViewById(R.id.bottom_panel_overlay_text);
        this.g = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        this.h = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.i = (ViewStub) inflate.findViewById(R.id.offline_badge);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.metadata_badge);
        this.j = viewStub;
        this.s = (ImageView) inflate.findViewById(R.id.bottom_panel_overlay_icon);
        if (viewStub == null || ajoyVar == null) {
            return;
        }
        this.k = ajoyVar.J(context, viewStub);
    }

    public final void h(auda audaVar, avgg avggVar) {
        avgg avggVar2;
        if (audaVar != null) {
            if ((audaVar.b & 2) == 0) {
                this.g.d(false);
                ajjz ajjzVar = this.o;
                ImageView imageView = this.g.b;
                if ((1 & audaVar.b) != 0) {
                    audb audbVar = audaVar.c;
                    if (audbVar == null) {
                        audbVar = audb.a;
                    }
                    avggVar2 = audbVar.c;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                } else {
                    avggVar2 = null;
                }
                ajjzVar.h(imageView, avggVar2);
                return;
            }
            this.g.d(true);
            ajjz ajjzVar2 = this.o;
            ImageView imageView2 = this.g.b;
            aucz auczVar = audaVar.d;
            if (auczVar == null) {
                auczVar = aucz.a;
            }
            avgg avggVar3 = auczVar.b;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            ajjzVar2.h(imageView2, avggVar3);
            return;
        }
        this.g.d(false);
        this.o.h(this.g.b, avggVar);
    }
}

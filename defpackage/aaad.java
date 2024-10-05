package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaad implements aabn {
    private final ajjz a;
    private final /* synthetic */ int b;

    public aaad(ajjz ajjzVar, int i, byte[] bArr) {
        this.b = i;
        ajjzVar.getClass();
        this.a = ajjzVar;
    }

    private static CharSequence c(arhk arhkVar) {
        arhd arhdVar = arhkVar.d;
        if (arhdVar == null) {
            arhdVar = arhd.a;
        }
        aqyg aqygVar = null;
        if ((arhdVar.b & 1) == 0) {
            return null;
        }
        arhd arhdVar2 = arhkVar.d;
        if (arhdVar2 == null) {
            arhdVar2 = arhd.a;
        }
        apjw apjwVar = arhdVar2.c;
        if (apjwVar == null) {
            apjwVar = apjw.a;
        }
        if ((apjwVar.b & 1) != 0) {
            arhd arhdVar3 = arhkVar.d;
            if (arhdVar3 == null) {
                arhdVar3 = arhd.a;
            }
            apjw apjwVar2 = arhdVar3.c;
            if (apjwVar2 == null) {
                apjwVar2 = apjw.a;
            }
            aqygVar = apjwVar2.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        return ajcq.b(aqygVar);
    }

    public aaad(ajjz ajjzVar, int i) {
        this.b = i;
        ajjzVar.getClass();
        this.a = ajjzVar;
    }

    public aaad(ajjz ajjzVar, int i, char[] cArr) {
        this.b = i;
        ajjzVar.getClass();
        this.a = ajjzVar;
    }

    @Override // defpackage.aabn
    public final wv a(Context context, ViewGroup viewGroup, zzz zzzVar, boolean z) {
        int i = this.b;
        if (i == 0) {
            return new aaac(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_playlist_watch_next : R.layout.info_card_playlist, viewGroup, false));
        }
        if (i == 1) {
            return new aaaj(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_collaborator_watch_next : R.layout.info_card_collaborator, viewGroup, false), null);
        }
        return new aaam(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_video_watch_next : R.layout.info_card_video, viewGroup, false));
    }

    @Override // defpackage.aabn
    public final void b(Context context, aaaa aaaaVar, wv wvVar, aabq aabqVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        aqyg aqygVar7;
        int i = this.b;
        if (i == 0) {
            aaac aaacVar = (aaac) wvVar;
            arhe b = aaaaVar.b();
            ajjz ajjzVar = this.a;
            ImageView imageView = aaacVar.t.a;
            avgg avggVar = b.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            TextView textView = aaacVar.u;
            aqyg aqygVar8 = b.d;
            if (aqygVar8 == null) {
                aqygVar8 = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar8));
            aaacVar.v.setVisibility(aaacVar.u.getVisibility());
            TextView textView2 = aaacVar.w;
            aqyg aqygVar9 = b.e;
            if (aqygVar9 == null) {
                aqygVar9 = aqyg.a;
            }
            whu.G(textView2, ajcq.b(aqygVar9));
            TextView textView3 = aaacVar.x;
            aqyg aqygVar10 = b.f;
            if (aqygVar10 == null) {
                aqygVar10 = aqyg.a;
            }
            whu.G(textView3, ajcq.b(aqygVar10));
            aqyg aqygVar11 = b.g;
            if (aqygVar11 == null) {
                aqygVar11 = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar11);
            whu.G(aaacVar.y, b2);
            YouTubeTextView youTubeTextView = aaacVar.t.b;
            aqyg aqygVar12 = b.c;
            if (aqygVar12 == null) {
                aqygVar12 = aqyg.a;
            }
            whu.G(youTubeTextView, ajcq.b(aqygVar12));
            aaacVar.t.setContentDescription(" ");
            TextView textView4 = aaacVar.y;
            String valueOf = String.valueOf(b2);
            String string = context.getString(R.string.accessibility_playlist_card);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            textView4.setContentDescription(sb.toString());
            aaacVar.a.setOnClickListener(new aaab(aabqVar, b));
            return;
        }
        aqyg aqygVar13 = null;
        if (i == 1) {
            aaaj aaajVar = (aaaj) wvVar;
            argq a = aaaaVar.a();
            ajjz ajjzVar2 = this.a;
            ImageView imageView2 = aaajVar.t;
            avgg avggVar2 = a.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar2.h(imageView2, avggVar2);
            TextView textView5 = aaajVar.v;
            if ((a.b & 8) != 0) {
                aqygVar = a.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView5, ajcq.b(aqygVar));
            TextView textView6 = aaajVar.w;
            if ((a.b & 4) != 0) {
                aqygVar2 = a.e;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            whu.G(textView6, ajcq.b(aqygVar2));
            TextView textView7 = aaajVar.u;
            if ((a.b & 2) != 0 && (aqygVar13 = a.d) == null) {
                aqygVar13 = aqyg.a;
            }
            whu.G(textView7, ajcq.b(aqygVar13));
            aaajVar.a.setOnClickListener(new zzy(aabqVar, a));
            return;
        }
        aaam aaamVar = (aaam) wvVar;
        arhk f = aaaaVar.f();
        ajjz ajjzVar3 = this.a;
        ImageView imageView3 = aaamVar.t;
        avgg avggVar3 = f.c;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        ajjzVar3.h(imageView3, avggVar3);
        TextView textView8 = aaamVar.u;
        if ((f.b & 8) != 0) {
            aqygVar3 = f.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView8, ajcq.b(aqygVar3));
        aaamVar.v.setVisibility(aaamVar.u.getVisibility());
        TextView textView9 = aaamVar.w;
        if ((f.b & 4) != 0) {
            aqygVar4 = f.e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        whu.G(textView9, ajcq.b(aqygVar4));
        whu.G(aaamVar.x, c(f));
        TextView textView10 = aaamVar.y;
        if ((f.b & 16) != 0) {
            aqygVar5 = f.g;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        whu.G(textView10, ajcq.b(aqygVar5));
        TextView textView11 = aaamVar.z;
        if ((f.b & 32) != 0) {
            aqygVar6 = f.h;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
        } else {
            aqygVar6 = null;
        }
        whu.G(textView11, ajcq.b(aqygVar6));
        if ((f.b & 64) != 0) {
            aqygVar7 = f.i;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
        } else {
            aqygVar7 = null;
        }
        Spanned b3 = ajcq.b(aqygVar7);
        whu.G(aaamVar.A, b3);
        aaamVar.w.setContentDescription(" ");
        aaamVar.x.setContentDescription(" ");
        TextView textView12 = aaamVar.A;
        String valueOf2 = String.valueOf(zhq.d(b3));
        if ((f.b & 4) != 0 && (aqygVar13 = f.e) == null) {
            aqygVar13 = aqyg.a;
        }
        String valueOf3 = String.valueOf(zhq.d(ajcq.i(aqygVar13)));
        String valueOf4 = String.valueOf(zhq.d(c(f)));
        String string2 = context.getString(R.string.accessibility_video_card);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(string2).length());
        sb2.append(valueOf2);
        sb2.append("; ");
        sb2.append(valueOf3);
        sb2.append(" ");
        sb2.append(valueOf4);
        sb2.append(" ");
        sb2.append(string2);
        textView12.setContentDescription(sb2.toString());
        aaamVar.a.setOnClickListener(new aaal(aabqVar, f));
    }
}

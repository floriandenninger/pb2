package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxg extends mlc {
    private final View C;
    private final LinearLayout D;
    private View E;
    private final ajoi a;
    private final shf b;
    private final int c;
    private final int d;
    private final int e;
    private final View f;

    public mxg(Context context, ajjz ajjzVar, aahd aahdVar, shf shfVar, gma gmaVar, ohg ohgVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, gmaVar, LayoutInflater.from(context).inflate(R.layout.video_item_layout, (ViewGroup) null, false), aahdVar, ohgVar, null, cVar, null, null, null, null, null, null);
        Resources resources = context.getResources();
        View view = this.i;
        this.f = view;
        this.C = view.findViewById(R.id.text_layout);
        this.b = shfVar;
        this.a = new ajoi(aahdVar, gmaVar);
        this.c = resources.getDimensionPixelSize(R.dimen.compact_video_padding_start_postv2);
        this.d = resources.getDimensionPixelSize(R.dimen.compact_video_padding_end_postv2);
        this.e = resources.getDimensionPixelSize(R.dimen.compact_video_padding_bottom_postv2);
        this.D = (LinearLayout) view.findViewById(R.id.video_info_view);
    }

    private static apkf d(avzv avzvVar) {
        apkd apkdVar = avzvVar.s;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) == 0) {
            return null;
        }
        apkd apkdVar2 = avzvVar.s;
        if (apkdVar2 == null) {
            apkdVar2 = apkd.a;
        }
        apkf apkfVar = apkdVar2.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    private static final CharSequence e(avzv avzvVar) {
        aqyg aqygVar;
        if ((avzvVar.b & 1024) != 0) {
            aqygVar = avzvVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if (b != null) {
            return fav.y(b);
        }
        return null;
    }

    private static final CharSequence f(avzv avzvVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        if ((avzvVar.b & 16384) != 0) {
            aqygVar = avzvVar.n;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        CharSequence b = ajcq.b(aqygVar);
        if (TextUtils.isEmpty(b)) {
            b = null;
        } else {
            if ((avzvVar.b & 2048) != 0) {
                aqygVar2 = avzvVar.j;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            Spanned b2 = ajcq.b(aqygVar2);
            if (!TextUtils.isEmpty(b2)) {
                b = TextUtils.concat(b, " • ", b2);
            }
        }
        if (b != null) {
            return fav.y(b);
        }
        return null;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.a.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        avrx avrxVar;
        avgg avggVar;
        aqyg aqygVar3;
        avrx avrxVar2;
        apkh apkhVar;
        avzv avzvVar = (avzv) obj;
        apke apkeVar = null;
        ajokVar.a.u(new acqx(avzvVar.E), null);
        boolean z = d(avzvVar) != null;
        ajoi ajoiVar = this.a;
        acra acraVar = ajokVar.a;
        if ((avzvVar.b & 32768) != 0) {
            apxfVar = avzvVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        if ((avzvVar.b & 4096) != 0) {
            aqygVar = avzvVar.k;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((avzvVar.b & 4096) != 0) {
            aqygVar2 = avzvVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        CharSequence i = ajcq.i(aqygVar2);
        aony aonyVar = avzvVar.x;
        if ((avzvVar.b & 2097152) != 0) {
            avrxVar = avzvVar.t;
            if (avrxVar == null) {
                avrxVar = avrx.a;
            }
        } else {
            avrxVar = null;
        }
        p(b, i, aonyVar, avrxVar);
        if ((avzvVar.b & 2) != 0) {
            avggVar = avzvVar.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        y(avggVar);
        if (avzvVar.w) {
            if (this.E == null) {
                this.E = ((ViewStub) this.i.findViewById(R.id.watched_overlay_stub)).inflate();
            }
            this.E.setVisibility(0);
        } else {
            View view = this.E;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        t(mcy.O(avzvVar.x));
        avzw avzwVar = avzvVar.y;
        if (avzwVar == null) {
            avzwVar = avzw.a;
        }
        int W = awxr.W(avzwVar.b);
        if ((W != 0 && W == 3) || ajokVar.j("postsV2FullThumbnailStyle", false)) {
            LinearLayout linearLayout = this.D;
            int i2 = this.c;
            linearLayout.setPadding(i2, i2, this.d, this.e);
            this.C.setVisibility(0);
            if ((avzvVar.b & 8) != 0) {
                aqygVar3 = avzvVar.h;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            A(ajcq.b(aqygVar3));
            Context context = this.g;
            shf shfVar = this.b;
            if ((2097152 & avzvVar.b) != 0) {
                avrxVar2 = avzvVar.t;
                if (avrxVar2 == null) {
                    avrxVar2 = avrx.a;
                }
            } else {
                avrxVar2 = null;
            }
            CharSequence g = mcy.g(context, shfVar, avrxVar2);
            if (ajokVar.j("postsV2NewMetadataStyle", false)) {
                CharSequence e = e(avzvVar);
                if (TextUtils.isEmpty(g)) {
                    g = f(avzvVar);
                }
                m(e, g, z);
            } else {
                if (TextUtils.isEmpty(g)) {
                    g = e(avzvVar);
                    CharSequence f = f(avzvVar);
                    if (TextUtils.isEmpty(f) || TextUtils.isEmpty(g)) {
                        if (!TextUtils.isEmpty(f)) {
                            g = f;
                        }
                    } else {
                        g = TextUtils.concat(g, " • ", f);
                    }
                }
                m(null, g, z);
            }
            apkd apkdVar = avzvVar.r;
            if (apkdVar == null) {
                apkdVar = apkd.a;
            }
            if ((apkdVar.b & 1) != 0) {
                apkd apkdVar2 = avzvVar.r;
                if (apkdVar2 == null) {
                    apkdVar2 = apkd.a;
                }
                apkhVar = apkdVar2.c;
                if (apkhVar == null) {
                    apkhVar = apkh.a;
                }
            } else {
                apkhVar = null;
            }
            w(apkhVar);
            apkd apkdVar3 = avzvVar.q;
            if (apkdVar3 == null) {
                apkdVar3 = apkd.a;
            }
            if ((apkdVar3.b & 4) != 0) {
                apkd apkdVar4 = avzvVar.q;
                if (apkdVar4 == null) {
                    apkdVar4 = apkd.a;
                }
                apkeVar = apkdVar4.e;
                if (apkeVar == null) {
                    apkeVar = apke.a;
                }
            }
            u(apkeVar);
            v(d(avzvVar));
            return;
        }
        this.D.setPadding(0, 0, 0, 0);
        this.C.setVisibility(8);
    }
}

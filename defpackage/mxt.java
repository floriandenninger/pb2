package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxt extends mlc {
    public View C;
    public int D;
    private final ajoi E;
    public final shf a;
    public final aahd b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final TextView f;

    public mxt(Context context, ajjz ajjzVar, View view, aahd aahdVar, ajut ajutVar, shf shfVar, ohg ohgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, ajjzVar, new ajpe(), view, aahdVar, ajutVar, ohgVar, (ajoy) null, (c) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = shfVar;
        this.b = aahdVar;
        this.E = new ajoi(aahdVar, view);
        this.d = view.findViewById(R.id.thumbnail_layout);
        this.e = (ImageView) view.findViewById(R.id.channel_avatar);
        this.f = (TextView) view.findViewById(R.id.context);
        this.c = view;
        whu.I(view.findViewById(R.id.post_author), false);
        whu.I(view.findViewById(R.id.post_text), false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.E.c();
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, awal awalVar) {
        apxf apxfVar;
        ajoi ajoiVar = this.E;
        acra acraVar = ajokVar.a;
        if ((awalVar.b & 512) != 0) {
            apxfVar = awalVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(avgg avggVar, ajkb ajkbVar) {
        ajju b = this.h.c().b();
        b.d = ajkbVar;
        super.z(avggVar, b.a());
    }
}

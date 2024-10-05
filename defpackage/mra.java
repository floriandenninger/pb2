package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mra extends ajpc {
    mqz a;
    private final Context b;
    private final gma c;
    private final FrameLayout d;
    private final aadw e;
    private final jgp f;

    public mra(Context context, gma gmaVar, jgp jgpVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = context;
        this.c = gmaVar;
        this.f = jgpVar;
        this.e = aadwVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.a != null) {
            this.a = null;
        }
        this.d.removeAllViews();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        atni atniVar = (atni) obj;
        this.d.removeAllViews();
        int al = aobq.al(atniVar.f);
        int i = R.layout.notification_multi_action_item;
        if (al != 0 && al == 2) {
            if (fav.h(ajokVar)) {
                i = evr.av(this.e) ? R.layout.notification_multi_action_item_tablet_v2 : R.layout.notification_multi_action_item_tablet;
            } else {
                i = R.layout.notification_multi_action_item_compact_tall;
            }
        }
        mqz mqzVar = new mqz(LayoutInflater.from(this.b).inflate(i, (ViewGroup) null), this.f, null, null, null);
        this.a = mqzVar;
        if (i == R.layout.notification_multi_action_item_compact_tall) {
            mqzVar.a.setBackgroundColor(wbs.Q(this.b, R.attr.ytBorderedButtonChipBackground));
        }
        this.a.oB(ajokVar, atniVar);
        this.d.addView(this.a.a);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atni) obj).g.I();
    }
}

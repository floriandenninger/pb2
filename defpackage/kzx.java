package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzx extends kyx {
    private final ajuw b;
    private final View c;
    private final jru d;
    private jxn e;
    private final akht f;

    public kzx(Context context, aahd aahdVar, gma gmaVar, ajuw ajuwVar, ohg ohgVar, ajyw ajywVar, akht akhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, aahdVar, gmaVar, ajywVar, R.layout.offline_bundle_item_layout, new we(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_height)), new we(context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.offline_bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height), null, null, null, null);
        this.b = ajuwVar;
        this.c = a().findViewById(R.id.contextual_menu_anchor);
        this.d = ohgVar.b((ViewStub) a().findViewById(R.id.offline_badge), null);
        this.f = akhtVar;
    }

    @Override // defpackage.kyx, defpackage.ajom
    public final void b(ajos ajosVar) {
        jxn jxnVar = this.e;
        if (jxnVar != null) {
            jxnVar.b.m(jxnVar);
            whu.I(jxnVar.c, false);
            whu.I(jxnVar.d, true);
            jxnVar.e = null;
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kyx, defpackage.ajpc
    public final /* synthetic */ void d(ajok ajokVar, Object obj) {
        atdc atdcVar;
        atop atopVar = (atop) obj;
        super.d(ajokVar, atopVar);
        ajokVar.f("PlaylistPresenterConstants.PLAYLIST_ID", atopVar.g);
        this.d.b(ajokVar);
        acra acraVar = ajokVar.a;
        ajuw ajuwVar = this.b;
        View a = a();
        View view = this.c;
        atdf atdfVar = atopVar.j;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = atopVar.j;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        ajuwVar.e(a, view, atdcVar, atopVar, acraVar);
        if (this.e == null) {
            if (atopVar.g.isEmpty()) {
                return;
            }
            akht akhtVar = this.f;
            View a2 = a();
            Context context = (Context) ((axqs) akhtVar.b).a;
            context.getClass();
            fjs fjsVar = (fjs) akhtVar.d.get();
            fjsVar.getClass();
            azrw azrwVar = akhtVar.e;
            jry jryVar = (jry) akhtVar.c.get();
            jryVar.getClass();
            ypa ypaVar = (ypa) akhtVar.a.get();
            ypaVar.getClass();
            a2.getClass();
            this.e = new jxn(context, fjsVar, azrwVar, jryVar, ypaVar, a2);
        }
        jxn jxnVar = this.e;
        if (!atopVar.g.isEmpty() && jxnVar.a.i(atopVar.g) && (ajokVar.c("sectionListController") instanceof jzo)) {
            jxnVar.e = atopVar.g;
            jxnVar.a();
            jxnVar.b.g(jxnVar);
            fav.M(ajokVar, atopVar);
        }
    }
}

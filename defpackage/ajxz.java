package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajxz extends ajxk implements AdapterView.OnItemClickListener {
    private atdc ae;
    private ajpd af;
    public ajxy ag;
    private ajut ah;
    private acra ai;
    private Integer aj;

    private final void aF(arfs arfsVar, zfi zfiVar) {
        ajut ajutVar;
        if (arfsVar != null && (arfsVar.b & 1) != 0 && (ajutVar = this.ah) != null) {
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b);
            if (a != 0) {
                if (this.aj != null) {
                    zfiVar.a(whu.y(qR(), a, this.aj.intValue()));
                    return;
                } else {
                    zfiVar.a(aii.a(qR(), a));
                    return;
                }
            }
        }
        zfiVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void aM(ajxz ajxzVar, atdc atdcVar, ajut ajutVar, acqz acqzVar, Integer num, boolean z) {
        if (atdcVar != null) {
            Bundle bundle = new Bundle();
            amkq.cn(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atdcVar);
            ajxzVar.af(bundle);
        }
        ajutVar.getClass();
        ajxzVar.ah = ajutVar;
        ajxzVar.aj = num;
        ajxzVar.al(z);
        if (acqzVar != null) {
            ajxzVar.ai = acqzVar.mM();
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        if (Build.VERSION.SDK_INT <= 23 || !C().isInPictureInPictureMode()) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ammv aL(atda atdaVar) {
        arfs dm = adyu.dm(atdaVar);
        CharSequence m0do = adyu.m0do(atdaVar);
        final int i = 1;
        if (m0do == null) {
            if (dm == null || (dm.b & 1) == 0) {
                afsi.b(2, 25, "Text missing for BottomSheetMenuItem.");
            } else {
                arfr b = arfr.b(dm.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                int i2 = b.pV;
                StringBuilder sb = new StringBuilder(63);
                sb.append("Text missing for BottomSheetMenuItem with iconType: ");
                sb.append(i2);
                afsi.b(2, 25, sb.toString());
            }
            return amlr.a;
        }
        aomf dj = adyu.dj(atdaVar);
        if (this.ai != null && !dj.H()) {
            this.ai.u(new acqx(dj), null);
        }
        final ajxu ajxuVar = new ajxu(m0do.toString(), atdaVar);
        final int i3 = 0;
        boolean z = adyu.dp(atdaVar) != 2;
        if (ajxuVar.b != z) {
            ajxuVar.b = z;
            ajxuVar.c();
        }
        aF(dm, new zfi() { // from class: ajxx
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i != 0) {
                    ajxuVar.e = (Drawable) obj;
                } else {
                    ajxuVar.f = (Drawable) obj;
                }
            }
        });
        aF(adyu.dn(atdaVar), new zfi() { // from class: ajxx
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i3 != 0) {
                    ajxuVar.e = (Drawable) obj;
                } else {
                    ajxuVar.f = (Drawable) obj;
                }
            }
        });
        return ammv.j(ajxuVar);
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.bv, defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            return;
        }
        try {
            this.ae = (atdc) amkq.cj(bundle2, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atdc.a, aomw.b());
        } catch (aoob e) {
            zga.d("Error decoding menu", e);
            this.ae = atdc.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uyt
    /* renamed from: mz, reason: merged with bridge method [inline-methods] */
    public ajxr aH() {
        this.af = new ajpd();
        atdc atdcVar = this.ae;
        if (atdcVar != null) {
            Iterator it = atdcVar.c.iterator();
            while (it.hasNext()) {
                ammv aL = aL((atda) it.next());
                if (aL.h()) {
                    this.af.add(aL.c());
                }
            }
        }
        if (this.af.isEmpty()) {
            afsi.b(2, 25, "Bottom Sheet Menu is empty. No menu items were supported.");
        }
        return new ajxr(C(), this.af);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        uyw uywVar = (uyw) ((ajxr) this.aD).getItem(i);
        if (uywVar instanceof ajxu) {
            atda atdaVar = ((ajxu) uywVar).j;
            ajxy ajxyVar = this.ag;
            if (ajxyVar != null) {
                ajxyVar.a(atdaVar);
            }
        }
        dismiss();
    }
}

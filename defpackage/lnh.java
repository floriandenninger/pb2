package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lnh extends lnl {
    public azrw af;
    public int ag;

    public static lnh aM(String str) {
        lnh lnhVar = new lnh();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        lnhVar.af(bundle);
        return lnhVar;
    }

    private final ListPreference aP() {
        return (ListPreference) aK();
    }

    @Override // defpackage.brt, defpackage.bsd
    public final void aG(boolean z) {
        int i;
        ListPreference aP = aP();
        CharSequence[] charSequenceArr = aP.h;
        if (!z || (i = this.ag) < 0 || i >= charSequenceArr.length) {
            return;
        }
        String charSequence = charSequenceArr[i].toString();
        if (aP.Q(charSequence)) {
            aP.o(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.brt, defpackage.bsd
    public final void jU(mh mhVar) {
        super.jU(mhVar);
        mhVar.d(LayoutInflater.from(mhVar.a()).inflate(R.layout.hide_controls_custom_title, (ViewGroup) null));
        int k = aP().k(O(R.string.pref_hide_controls_value_system_setting));
        mhVar.m(new lnf(C(), aP().g, this.ag, k, this.af), this.ag, new DialogInterface.OnClickListener() { // from class: lng
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                lnh lnhVar = lnh.this;
                lnhVar.ag = i;
                ((bsd) lnhVar).ai = -1;
                dialogInterface.dismiss();
            }
        });
    }

    @Override // defpackage.brt, defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putInt("SAVE_STATE_INDEX_KEY", this.ag);
    }

    @Override // defpackage.brt, defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            ListPreference aP = aP();
            this.ag = aP.k(aP.i);
        } else {
            this.ag = bundle.getInt("SAVE_STATE_INDEX_KEY", 0);
        }
    }
}

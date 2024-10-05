package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class brt extends bsd {
    int ae;
    private CharSequence[] af;
    private CharSequence[] ag;

    private ListPreference aM() {
        return (ListPreference) aK();
    }

    @Override // defpackage.bsd
    public void aG(boolean z) {
        int i;
        if (!z || (i = this.ae) < 0) {
            return;
        }
        String charSequence = this.ag[i].toString();
        ListPreference aM = aM();
        if (aM.Q(charSequence)) {
            aM.o(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bsd
    public void jU(mh mhVar) {
        CharSequence[] charSequenceArr = this.af;
        int i = this.ae;
        brs brsVar = new brs(this);
        md mdVar = mhVar.a;
        mdVar.o = charSequenceArr;
        mdVar.q = brsVar;
        mdVar.v = i;
        mdVar.u = true;
        mhVar.l(null, null);
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ae);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.af);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ag);
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            ListPreference aM = aM();
            if (aM.g == null || aM.h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.ae = aM.k(aM.i);
            this.af = aM.g;
            this.ag = aM.h;
            return;
        }
        this.ae = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.af = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.ag = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }
}

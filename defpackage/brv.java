package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brv extends bsd {
    final Set ae = new HashSet();
    boolean af;
    CharSequence[] ag;
    CharSequence[] ah;

    private final MultiSelectListPreference aM() {
        return (MultiSelectListPreference) aK();
    }

    @Override // defpackage.bsd
    public final void aG(boolean z) {
        if (z && this.af) {
            MultiSelectListPreference aM = aM();
            if (aM.Q(this.ae)) {
                aM.k(this.ae);
            }
        }
        this.af = false;
    }

    @Override // defpackage.bsd
    protected final void jU(mh mhVar) {
        int length = this.ah.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ae.contains(this.ah[i].toString());
        }
        CharSequence[] charSequenceArr = this.ag;
        bru bruVar = new bru(this);
        md mdVar = mhVar.a;
        mdVar.o = charSequenceArr;
        mdVar.w = bruVar;
        mdVar.s = zArr;
        mdVar.t = true;
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ae));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.af);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ag);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ah);
    }

    @Override // defpackage.bsd, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            MultiSelectListPreference aM = aM();
            if (aM.g == null || aM.h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.ae.clear();
            this.ae.addAll(aM.i);
            this.af = false;
            this.ag = aM.g;
            this.ah = aM.h;
            return;
        }
        this.ae.clear();
        this.ae.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.af = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.ag = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.ah = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }
}

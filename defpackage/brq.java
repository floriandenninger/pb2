package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class brq extends Preference {
    private long a;

    public brq(Context context, List list, long j) {
        super(context);
        this.B = R.layout.expand_button;
        H(nz.b(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        L(R.string.expand_button_title);
        J(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.E)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = charSequence == null ? charSequence2 : this.j.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
            }
        }
        n(charSequence);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long jT() {
        return this.a;
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        bsxVar.v = false;
    }
}

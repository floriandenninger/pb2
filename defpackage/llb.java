package defpackage;

import android.content.SharedPreferences;
import android.text.Spanned;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import com.google.android.apps.youtube.app.settings.IntListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class llb {
    public static final /* synthetic */ int a = 0;
    private static final amrz b = amrz.m("1", "2", "2", "1", "3", "0");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(aaea aaeaVar, IntListPreference intListPreference, Object obj) {
        if (obj instanceof auqh) {
            lla e = e((auqh) obj);
            f(intListPreference, aaeaVar, e);
            intListPreference.G = e.c;
        }
    }

    public static void b(aaea aaeaVar, final ProtoDataStoreListPreference protoDataStoreListPreference, Object obj, final acqz acqzVar) {
        if (obj instanceof auqh) {
            final lla e = e((auqh) obj);
            f(protoDataStoreListPreference, aaeaVar, e);
            protoDataStoreListPreference.n((CharSequence) e.c.get(String.valueOf(gfy.a(aaeaVar))));
            protoDataStoreListPreference.G = new zed() { // from class: lkz
                @Override // defpackage.zed
                public final void a(Object obj2) {
                    acqz acqzVar2 = acqz.this;
                    ProtoDataStoreListPreference protoDataStoreListPreference2 = protoDataStoreListPreference;
                    lla llaVar = e;
                    String str = (String) obj2;
                    int i = llb.a;
                    llb.c(zhq.b(str, -1), acqzVar2);
                    protoDataStoreListPreference2.n((CharSequence) llaVar.c.get(str));
                }
            };
        }
    }

    public static void c(int i, acqz acqzVar) {
        acra mM = acqzVar.mM();
        mM.D(new acqx(acsb.c(35087)));
        mM.D(new acqx(acsb.c(35088)));
        mM.D(new acqx(acsb.c(35086)));
        if (i == 0) {
            mM.I(3, new acqx(acsb.c(35086)), null);
        } else if (i == 2) {
            mM.I(3, new acqx(acsb.c(35087)), null);
        } else if (i == 1) {
            mM.I(3, new acqx(acsb.c(35088)), null);
        }
    }

    public static void d(SharedPreferences sharedPreferences, acqz acqzVar) {
        c(sharedPreferences.getInt("inline_global_play_pause", -1), acqzVar);
    }

    private static lla e(auqh auqhVar) {
        aqyg aqygVar;
        auqc auqcVar;
        int size = auqhVar.f.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < size; i++) {
            auqd auqdVar = (auqd) auqhVar.f.get(i);
            if (auqdVar.b == 64166933) {
                auqcVar = (auqc) auqdVar.c;
            } else {
                auqcVar = auqc.a;
            }
            arrayList.add(auqcVar.c);
            arrayList2.add((CharSequence) b.get(auqcVar.e));
            if ((auqcVar.b & 2) != 0) {
                hashMap.put((CharSequence) arrayList2.get(i), auqcVar.d);
            }
        }
        aqyg aqygVar2 = null;
        if ((auqhVar.b & 2) != 0) {
            aqygVar = auqhVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b2 = ajcq.b(aqygVar);
        if ((auqhVar.b & 4) != 0 && (aqygVar2 = auqhVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        return new lla(b2, ajcq.b(aqygVar2), amrz.j(hashMap), amru.o(arrayList), amru.o(arrayList2));
    }

    private static void f(ListPreference listPreference, aaea aaeaVar, lla llaVar) {
        listPreference.I("inline_global_play_pause");
        listPreference.M(llaVar.a);
        ((DialogPreference) listPreference).a = llaVar.a;
        listPreference.n(llaVar.b);
        listPreference.e((CharSequence[]) llaVar.d.toArray(new CharSequence[0]));
        listPreference.h = (CharSequence[]) llaVar.e.toArray(new CharSequence[0]);
        listPreference.F(String.valueOf(gfy.a(aaeaVar)));
    }
}

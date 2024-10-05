package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lms extends bsk {
    public SettingsDataAccess ae;
    public ysy af;
    public aahd ag;
    public llu ah;
    public gni ai;
    public acue aj;
    public lmt ak;
    public ayqi al;
    public CharSequence am;
    public boolean an;
    public Preference ao;
    public aadw ap;
    public wcf aq;
    private ayqx ar;
    private lmr as;
    private ayqx at;
    public afsy c;
    public aaea d;
    public acra e;

    public static final void aQ(String str, List list, Preference preference) {
        if (preference == null) {
            return;
        }
        if (str == null) {
            list.add(preference);
        } else {
            preference.M(str);
        }
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        ayrz.c((AtomicReference) this.at);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        C().setTitle(R.string.settings);
    }

    @Override // defpackage.bsk, defpackage.bst
    public final boolean aG(Preference preference) {
        boolean aG = super.aG(preference);
        if (((SettingsActivity) C()).g().i()) {
            this.am = preference.q;
            lmr lmrVar = this.as;
            if (lmrVar != null) {
                lmrVar.d.mw();
                lmrVar.mw();
            }
        }
        return aG;
    }

    @Override // defpackage.bsk
    public final void aH() {
    }

    public final String aL() {
        aqyg aqygVar;
        Object next;
        Iterator it = aM().iterator();
        do {
            aqygVar = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
        } while (!(next instanceof apuq));
        apuq apuqVar = (apuq) next;
        if ((apuqVar.b & 2) != 0 && (aqygVar = apuqVar.d) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List aM() {
        return this.ae.i();
    }

    public final void aN() {
        for (Object obj : aM()) {
            if (obj instanceof apuq) {
                this.e.u(new acqx(((apuq) obj).f), null);
                return;
            }
        }
    }

    public final void aO(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            if (preference != null) {
                o().af(preference);
            }
        }
        list.clear();
    }

    public final boolean aP() {
        return evr.O(this.d) && fhe.G(aM(), apuj.class);
    }

    public final String aR(int i) {
        aqyg aqygVar;
        aupv aupvVar;
        Iterator it = aM().iterator();
        while (true) {
            aqygVar = null;
            if (!it.hasNext()) {
                aupvVar = null;
                break;
            }
            Object next = it.next();
            if (next instanceof aupv) {
                aupvVar = (aupv) next;
                int bz = aobq.bz(aupvVar.e);
                if (bz == 0) {
                    bz = 1;
                }
                if (bz == i) {
                    break;
                }
            }
        }
        if (aupvVar == null) {
            return null;
        }
        if ((aupvVar.b & 1) != 0 && (aqygVar = aupvVar.c) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar).toString();
    }

    @Override // defpackage.bsk
    protected final vw d(PreferenceScreen preferenceScreen) {
        if (!((SettingsActivity) C()).g().i()) {
            return super.d(preferenceScreen);
        }
        lmr lmrVar = new lmr(this, super.d(preferenceScreen));
        this.as = lmrVar;
        return lmrVar;
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mD() {
        super.mD();
        azqb.f((AtomicReference) this.ar);
        this.ar = null;
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.at = this.aj.j().ab(this.al).ax(new ayrs() { // from class: lmp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Preference preference;
                lms lmsVar = lms.this;
                Boolean bool = (Boolean) obj;
                lmsVar.an = bool.booleanValue();
                if (lmsVar.a == null || lmsVar.o() == null) {
                    return;
                }
                PreferenceScreen o = lmsVar.o();
                Preference l = o.l(lmsVar.O(R.string.pair_with_tv_key));
                if (l != null) {
                    lmsVar.ao = l;
                }
                if (!bool.booleanValue()) {
                    if (l != null) {
                        o.af(l);
                    }
                } else {
                    if (l != null || (preference = lmsVar.ao) == null) {
                        return;
                    }
                    o.ae(preference);
                }
            }
        });
    }

    @Override // defpackage.bsk, defpackage.ce
    public final void mS() {
        super.mS();
        this.ar = this.ae.g(new Runnable() { // from class: lmq
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                aqyg aqygVar;
                String str3;
                aqyg aqygVar2;
                String str4;
                aqyg aqygVar3;
                String str5;
                aqyg aqygVar4;
                aupr auprVar;
                final lms lmsVar = lms.this;
                if (lmsVar.b == null) {
                    return;
                }
                if (lmsVar.o() != null) {
                    lmsVar.o().ab();
                }
                lmsVar.p(R.xml.settings_fragment);
                ArrayList arrayList = new ArrayList();
                Preference ol = lmsVar.ol(lmsVar.O(R.string.yt_unlimited_pre_purchase_key));
                Preference ol2 = lmsVar.ol(lmsVar.O(R.string.yt_unlimited_post_purchase_key));
                if (!lmsVar.af.o() || !fhe.G(lmsVar.aM(), apuq.class)) {
                    arrayList.add(ol2);
                    arrayList.add(ol);
                } else {
                    Iterator it = lmsVar.aM().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (next instanceof apuq) {
                            if (((apuq) next).e) {
                                arrayList.add(ol2);
                                lms.aQ(lmsVar.aL(), arrayList, ol);
                                lmsVar.aN();
                            }
                        }
                    }
                    arrayList.add(ol);
                    lms.aQ(lmsVar.aL(), arrayList, ol2);
                    lmsVar.aN();
                    Preference ol3 = lmsVar.ol(lmsVar.O(R.string.offline_key));
                    int i = ol2.p;
                    int i2 = ol3.p;
                    if (i >= 0 && i2 >= 0) {
                        ol3.J(i + 1);
                    }
                }
                lmsVar.aO(arrayList);
                int i3 = 0;
                while (true) {
                    str = null;
                    r9 = null;
                    String str6 = null;
                    aqyg aqygVar5 = null;
                    String str7 = null;
                    str = null;
                    if (i3 >= lmsVar.o().k()) {
                        break;
                    }
                    Preference o = lmsVar.o().o(i3);
                    o.Z();
                    Object obj = o.s;
                    if (lmsVar.O(R.string.privacy_key).equals(obj)) {
                        if (lmsVar.c.c().g()) {
                            arrayList.add(o);
                        } else if (lmsVar.aP()) {
                            lms.aQ(lmsVar.aR(10003), arrayList, o);
                        } else {
                            lms.aQ(lmsVar.aR(10029), arrayList, o);
                        }
                    } else if (lmsVar.O(R.string.notification_key).equals(obj)) {
                        Iterator it2 = lmsVar.aM().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                auprVar = null;
                                break;
                            }
                            Object next2 = it2.next();
                            if (next2 instanceof aupr) {
                                auprVar = (aupr) next2;
                                break;
                            }
                        }
                        if (auprVar != null && (auprVar.b & 1) != 0) {
                            aqyg aqygVar6 = auprVar.c;
                            if (aqygVar6 == null) {
                                aqygVar6 = aqyg.a;
                            }
                            str6 = ajcq.b(aqygVar6).toString();
                        }
                        lms.aQ(str6, arrayList, o);
                    } else if (lmsVar.O(R.string.auto_play_key).equals(obj)) {
                        lms.aQ(lmsVar.aR(10058), arrayList, o);
                    } else if (lmsVar.O(R.string.offline_key).equals(obj)) {
                        lms.aQ(lmsVar.ah.b(), arrayList, o);
                    } else if (lmsVar.O(R.string.live_chat_key).equals(obj)) {
                        lms.aQ(lmsVar.aR(10034), arrayList, o);
                    } else if (lmsVar.O(R.string.billing_and_payment_key).equals(obj)) {
                        lms.aQ(lmsVar.aR(10048), arrayList, o);
                    } else if (lmsVar.O(R.string.third_party_key).equals(obj)) {
                        lms.aQ(lmsVar.aR(10039), arrayList, o);
                    } else if (lmsVar.O(R.string.developer_settings_key).equals(obj)) {
                        arrayList.add(o);
                    } else if (lmsVar.O(R.string.dogfood_settings_key).equals(obj)) {
                        arrayList.add(o);
                    } else {
                        aswb aswbVar = lmsVar.d.a().e;
                        if (aswbVar == null) {
                            aswbVar = aswb.a;
                        }
                        if (aswbVar.i || !lmsVar.O(R.string.refresh_config_key).equals(obj)) {
                            if (lmsVar.O(R.string.video_quality_settings_key).equals(obj)) {
                                if (!evr.S(lmsVar.d)) {
                                    arrayList.add(o);
                                } else if (evr.ad(lmsVar.d)) {
                                    lms.aQ(lmsVar.O(R.string.pref_settings_video_quality_nonbeta), arrayList, o);
                                }
                            } else if (lmsVar.O(R.string.parent_tools_key).equals(obj)) {
                                Iterator it3 = lmsVar.aM().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof aupx) {
                                        aupx aupxVar = (aupx) next3;
                                        int bz = aobq.bz(aupxVar.d);
                                        if (bz != 0 && bz == 10091) {
                                            if ((aupxVar.b & 2) != 0 && (aqygVar5 = aupxVar.c) == null) {
                                                aqygVar5 = aqyg.a;
                                            }
                                            str7 = ajcq.b(aqygVar5).toString();
                                        }
                                    }
                                }
                                lms.aQ(str7, arrayList, o);
                                if (!arrayList.contains(o)) {
                                    o.o = new brz() { // from class: lmo
                                        @Override // defpackage.brz
                                        public final boolean b(Preference preference) {
                                            lms lmsVar2 = lms.this;
                                            if (lmsVar2.C() == null) {
                                                return true;
                                            }
                                            ci C = lmsVar2.C();
                                            afsy afsyVar = lmsVar2.c;
                                            wcf wcfVar = lmsVar2.aq;
                                            aaea aaeaVar = lmsVar2.d;
                                            try {
                                                Account a = wcfVar.a(afsyVar.c());
                                                if (a == null) {
                                                    return true;
                                                }
                                                aswb aswbVar2 = aaeaVar.a().e;
                                                if (aswbVar2 == null) {
                                                    aswbVar2 = aswb.a;
                                                }
                                                boolean z = aswbVar2.bl;
                                                umj a2 = ParentToolsActivity.a(C);
                                                a2.d = a.name;
                                                a2.b = "HOST_CLIENT_NAME_MAIN_ANDROID";
                                                a2.c = zgx.c(C);
                                                a2.g = C.getString(R.string.parent_tools_tool_bar_title);
                                                a2.j = umm.PARENT_SETTINGS;
                                                a2.k = z;
                                                C.startActivity(a2.a());
                                                return true;
                                            } catch (RemoteException | qnk | qnl e) {
                                                zga.d("Couldn't start parent tools!", e);
                                                return true;
                                            }
                                        }
                                    };
                                }
                            } else if (lmsVar.O(R.string.pair_with_tv_key).equals(obj)) {
                                lmsVar.ao = o;
                                if (!lmsVar.an) {
                                    arrayList.add(o);
                                }
                            } else if (lmsVar.O(R.string.data_saving_settings_key).equals(obj) && !evr.aD(lmsVar.ap)) {
                                arrayList.add(o);
                            }
                        } else {
                            arrayList.add(o);
                        }
                    }
                    i3++;
                }
                String str8 = "";
                boolean z = false;
                for (Object obj2 : lmsVar.aM()) {
                    if (obj2 instanceof apur) {
                        aqyg aqygVar7 = ((apur) obj2).d;
                        if (aqygVar7 == null) {
                            aqygVar7 = aqyg.a;
                        }
                        str8 = ajcq.b(aqygVar7).toString();
                        z = true;
                    }
                }
                Preference l = lmsVar.o().l(lmsVar.O(R.string.yt_unplugged_pref_key));
                Preference l2 = lmsVar.o().l(lmsVar.O(R.string.yt_unlimited_post_purchase_key));
                Preference l3 = lmsVar.o().l(lmsVar.O(R.string.yt_unlimited_pre_purchase_key));
                if (z) {
                    int i4 = l3 != null ? l3.p : -1;
                    if (i4 < 0) {
                        i4 = l2 != null ? l2.p : -1;
                    }
                    if (i4 > 0) {
                        l.J(i4 - 1);
                    }
                    lms.aQ(str8, arrayList, l);
                    Iterator it4 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next4 = it4.next();
                        if (next4 instanceof apur) {
                            lmsVar.e.u(new acqx(((apur) next4).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(l);
                }
                Preference ol4 = lmsVar.ol(lmsVar.O(R.string.history_key));
                if (lmsVar.aP()) {
                    Iterator it5 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            str5 = null;
                            break;
                        }
                        Object next5 = it5.next();
                        if (next5 instanceof apuj) {
                            apuj apujVar = (apuj) next5;
                            if ((apujVar.b & 1) != 0) {
                                aqygVar4 = apujVar.c;
                                if (aqygVar4 == null) {
                                    aqygVar4 = aqyg.a;
                                }
                            } else {
                                aqygVar4 = null;
                            }
                            str5 = ajcq.b(aqygVar4).toString();
                        }
                    }
                    lms.aQ(str5, arrayList, ol4);
                    Iterator it6 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next6 = it6.next();
                        if (next6 instanceof apuj) {
                            lmsVar.e.u(new acqx(((apuj) next6).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(ol4);
                }
                Preference ol5 = lmsVar.ol(lmsVar.O(R.string.subscription_product_setting_key));
                if (!lmsVar.af.o() || fhe.G(lmsVar.aM(), apup.class)) {
                    Iterator it7 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            str2 = null;
                            break;
                        }
                        Object next7 = it7.next();
                        if (apup.class.isInstance(next7)) {
                            apup apupVar = (apup) next7;
                            if ((apupVar.b & 2) != 0) {
                                aqygVar = apupVar.d;
                                if (aqygVar == null) {
                                    aqygVar = aqyg.a;
                                }
                            } else {
                                aqygVar = null;
                            }
                            str2 = ajcq.b(aqygVar).toString();
                        }
                    }
                    lms.aQ(str2, arrayList, ol5);
                    Iterator it8 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next8 = it8.next();
                        if (next8 instanceof apup) {
                            lmsVar.e.u(new acqx(((apup) next8).e), null);
                            break;
                        }
                    }
                } else {
                    arrayList.add(ol5);
                }
                Preference ol6 = lmsVar.ol(lmsVar.O(R.string.connected_accounts_browse_page_key));
                if (!lmsVar.af.o() || !fhe.G(lmsVar.aM(), apui.class)) {
                    arrayList.add(ol6);
                } else {
                    Iterator it9 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str4 = null;
                            break;
                        }
                        Object next9 = it9.next();
                        if (next9 instanceof apui) {
                            apui apuiVar = (apui) next9;
                            if ((apuiVar.b & 2) != 0) {
                                aqygVar3 = apuiVar.d;
                                if (aqygVar3 == null) {
                                    aqygVar3 = aqyg.a;
                                }
                            } else {
                                aqygVar3 = null;
                            }
                            str4 = ajcq.b(aqygVar3).toString();
                        }
                    }
                    lms.aQ(str4, arrayList, ol6);
                }
                Preference ol7 = lmsVar.ol(lmsVar.O(R.string.premium_early_access_browse_page_key));
                if (!lmsVar.af.p() || !fhe.G(lmsVar.aM(), apuo.class)) {
                    arrayList.add(ol7);
                } else {
                    Iterator it10 = lmsVar.aM().iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            str3 = null;
                            break;
                        }
                        Object next10 = it10.next();
                        if (next10 instanceof apuo) {
                            apuo apuoVar = (apuo) next10;
                            if ((apuoVar.b & 2) != 0) {
                                aqygVar2 = apuoVar.d;
                                if (aqygVar2 == null) {
                                    aqygVar2 = aqyg.a;
                                }
                            } else {
                                aqygVar2 = null;
                            }
                            str3 = ajcq.b(aqygVar2).toString();
                        }
                    }
                    lms.aQ(str3, arrayList, ol7);
                }
                lmsVar.aO(arrayList);
                lmi g = ((SettingsActivity) lmsVar.C()).g();
                Intent intent = g.a.getIntent();
                if (g.i()) {
                    if (TextUtils.isEmpty(g.q)) {
                        str = intent.getStringExtra(":android:show_fragment");
                        if (TextUtils.isEmpty(str)) {
                            str = GeneralPrefsFragment.class.getName();
                        }
                    } else {
                        str = g.q;
                    }
                } else if (intent != null) {
                    g.j(intent.getStringExtra(":android:show_fragment"));
                }
                if (str != null) {
                    String charSequence = str.toString();
                    for (int i5 = 0; i5 < lmsVar.o().k(); i5++) {
                        Preference o2 = lmsVar.o().o(i5);
                        if (charSequence.equals(o2.u)) {
                            lmsVar.a.c.aG(o2);
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }
}

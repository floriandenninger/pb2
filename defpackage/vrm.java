package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vrm extends vqs {
    private static final amxj ap = amxj.l("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment");
    public String ae;
    public vlp af;
    public String ag;
    public vqx ah;
    public MaterialToolbar ai;
    public TabLayout aj;
    public tis ak;
    public boolean al = false;
    public vqr am;
    public List an;
    public akhi ao;
    private tis aq;
    private byi ar;
    private ViewPager as;
    public vrp b;
    public tgn c;
    public tgk d;
    public tgd e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.b.g(this);
        this.O.announceForAccessibility(O(R.string.op3_change_profile_picture));
        MaterialToolbar materialToolbar = (MaterialToolbar) this.O.findViewById(R.id.photo_picker_suggestion_tabs_toolbar);
        this.ai = materialToolbar;
        this.aq = tis.d(this.d.b(materialToolbar, this.c.a(92715)));
        final int i = 0;
        this.ai.r(new View.OnClickListener(this) { // from class: vrg
            public final /* synthetic */ vrm a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.al = true;
                } else {
                    this.a.b.h();
                }
            }
        });
        tis tisVar = new tis(this.aq.a(Integer.valueOf(R.id.photo_picker_overflow_menu), this.c.a(89755)));
        this.ak = tisVar;
        tisVar.a(Integer.valueOf(R.id.photo_picker_past_profile_photos_menu_item), this.c.a(89753));
        this.ak.a(Integer.valueOf(R.id.photo_picker_help_menu_item), this.c.a(89747));
        this.ak.a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item), this.c.a(89742));
        this.ai.l(R.menu.photo_picker_common_menu);
        this.ai.q = new yq() { // from class: vrf
            @Override // defpackage.yq
            public final boolean a(MenuItem menuItem) {
                vrm vrmVar = vrm.this;
                vrmVar.ai.B();
                qt qtVar = (qt) menuItem;
                vrmVar.e.b(tgc.a(), vrmVar.ak.b(Integer.valueOf(qtVar.a)));
                int i2 = qtVar.a;
                if (i2 == R.id.photo_picker_past_profile_photos_menu_item) {
                    if (axxp.a.get().r()) {
                        vrmVar.b.d();
                    } else {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://accounts.google.com/AccountChooser?Email=%s&continue=https://get.google.com/albumarchive", vrmVar.ae)));
                        if (vrmVar.af.a(intent)) {
                            vrmVar.ao(intent);
                            return true;
                        }
                    }
                    return true;
                }
                if (i2 != R.id.photo_picker_help_menu_item) {
                    if (i2 != R.id.photo_picker_send_feedback_menu_item) {
                        return false;
                    }
                    akhi akhiVar = vrmVar.ao;
                    qwj.e(akhiVar.a.getApplicationContext()).A(akhiVar.f());
                    return true;
                }
                akhi akhiVar2 = vrmVar.ao;
                GoogleHelp b = GoogleHelp.b(vrmVar.ag);
                ThemeSettings themeSettings = new ThemeSettings();
                themeSettings.a = 3;
                b.s = themeSettings;
                b.c(akhiVar2.f(), akhiVar2.a.getCacheDir());
                new qyy(akhiVar2.a).a(b.a());
                return false;
            }
        };
        vqr a = vqr.a(this.m.getString("SuggestionTabsFragmentMode"));
        this.am = a;
        if (a != vqr.ONLY_SHOW_DEVICE_PHOTOS) {
            ViewPager viewPager = (ViewPager) this.O.findViewById(R.id.photo_picker_suggestion_tabs_pager);
            this.as = viewPager;
            viewPager.k(new vrl(this, mN()));
            TabLayout tabLayout = (TabLayout) this.O.findViewById(R.id.photo_picker_suggestion_tabs_tabs);
            this.aj = tabLayout;
            tabLayout.m(this.as);
            if (axxm.b()) {
                TabLayout tabLayout2 = this.aj;
                if (tabLayout2.u != 2) {
                    tabLayout2.u = 2;
                    tabLayout2.g();
                }
            }
            ColorStateList colorStateList = this.aj.i;
            if (!axxp.g()) {
                TabLayout tabLayout3 = this.aj;
                if (tabLayout3.i != null) {
                    tabLayout3.i = null;
                    int size = tabLayout3.a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((almc) tabLayout3.a.get(i2)).b();
                    }
                }
            }
            final int i3 = 1;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: vrg
                public final /* synthetic */ vrm a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i3 != 0) {
                        this.a.al = true;
                    } else {
                        this.a.b.h();
                    }
                }
            };
            for (vqw vqwVar : this.an) {
                TabLayout tabLayout4 = this.aj;
                final vqv vqvVar = vqwVar.a;
                almc c = tabLayout4.c(amkq.bf(this.an, new ammy() { // from class: vrh
                    @Override // defpackage.ammy
                    public final boolean a(Object obj) {
                        return ((vqw) obj).a == vqv.this;
                    }
                }));
                vqwVar.g.a(qR(), c, colorStateList);
                this.d.b(c.h, this.c.a(vqwVar.f));
                c.h.setOnClickListener(onClickListener);
            }
            this.aj.e(new vrj(this));
            if (bundle == null) {
                int bf = amkq.bf(this.an, new ammy() { // from class: vri
                    @Override // defpackage.ammy
                    public final boolean a(Object obj) {
                        return ((vqw) obj).b == vrm.this.am;
                    }
                });
                if (bf == -1) {
                    ((amxh) ((amxh) ap.g()).i("com/google/android/libraries/user/profile/photopicker/fragment/suggestiontabs/v2/SuggestionTabsV2Fragment", "onActivityCreated", 211, "SuggestionTabsV2Fragment.java")).s("attempted to start in mode %s, but the tab was missing.", this.am);
                } else {
                    i = bf;
                }
                TabLayout tabLayout5 = this.aj;
                tabLayout5.i(tabLayout5.c(i));
            }
            this.ar = new vrk(this);
            return;
        }
        this.O.findViewById(R.id.photo_picker_device_photos_grid).setPadding(0, 0, 0, 0);
        ((DevicePhotosFragment) mN().e(R.id.photo_picker_suggestion_tabs_device_photos_only_fragment)).p();
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        if (this.am != vqr.ONLY_SHOW_DEVICE_PHOTOS) {
            this.as.j(this.ar);
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.am != vqr.ONLY_SHOW_DEVICE_PHOTOS) {
            this.as.e(this.ar);
        }
    }

    @Override // defpackage.vqs, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.a) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        final vra vraVar = (vra) this.ah;
        this.an = amru.o(amqp.d(vraVar.b).f(new vqy(vraVar.a, 0)).c(new ammy() { // from class: vqz
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                vra vraVar2 = vra.this;
                vqw vqwVar = (vqw) obj;
                boolean z = vqwVar != null && vqwVar.c;
                Boolean bool = vqwVar != null ? (Boolean) vraVar2.c.get(vqwVar.a) : Boolean.FALSE;
                return z && (bool == null || bool.booleanValue());
            }
        }).g());
        if (qX().getConfiguration().getLayoutDirection() != 0) {
            this.an = amkq.aT(this.an);
        }
        if (vqr.a(this.m.getString("SuggestionTabsFragmentMode")) == vqr.ONLY_SHOW_DEVICE_PHOTOS) {
            i = true != axxp.d() ? R.layout.photo_picker_suggestion_tabs_device_only : R.layout.photo_picker_suggestion_tabs_device_only_art_styles;
            i2 = 110514;
        } else {
            i = true != axxp.d() ? R.layout.photo_picker_suggestion_tabs_fragment : R.layout.photo_picker_suggestion_tabs_fragment_art_styles;
            i2 = 110512;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.d.b(inflate, this.c.a(i2));
        return inflate;
    }
}

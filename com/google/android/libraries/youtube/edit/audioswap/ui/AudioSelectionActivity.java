package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSwapTabsBar;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import defpackage.aahd;
import defpackage.aauc;
import defpackage.aaue;
import defpackage.acqq;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.angq;
import defpackage.aone;
import defpackage.aong;
import defpackage.apgq;
import defpackage.aplt;
import defpackage.apxf;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.lu;
import defpackage.oxk;
import defpackage.vuh;
import defpackage.whu;
import defpackage.ynm;
import defpackage.zfi;
import defpackage.zks;
import defpackage.zkt;
import defpackage.zku;
import defpackage.zkw;
import defpackage.zkx;
import defpackage.zkz;
import defpackage.zle;
import defpackage.zlf;
import defpackage.zli;
import defpackage.zlj;
import defpackage.zll;
import defpackage.zlq;
import defpackage.zlv;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AudioSelectionActivity extends zlq implements zlv, zll, zkt, zle, zli {
    public dd a;
    public zkz b;
    public ViewPager c;
    public AudioSwapTabsBar d;
    public View e;
    public ProgressBar f;
    public View g;
    public acra h;
    public aaue i;
    public aahd j;
    vuh k;
    public boolean l = false;
    private lu n;
    private Button o;
    private zlf p;
    private zku q;

    private final void l(boolean z) {
        if (z) {
            this.n.o(R.string.upload_edit_audio_swap_audio_selection_title_loading);
        } else {
            this.n.o(R.string.upload_edit_audio_swap_audio_selection_title);
        }
    }

    @Override // defpackage.zkt
    public final zku a() {
        if (this.q == null) {
            ce f = this.a.f("audio_library_service_audio_selection");
            if (!(f instanceof zku)) {
                f = new zku();
                dn k = this.a.k();
                k.r(f, "audio_library_service_audio_selection");
                k.i = 4097;
                k.a();
            }
            zku zkuVar = (zku) f;
            this.q = zkuVar;
            zkuVar.a = new zks(this.i);
        }
        return this.q;
    }

    @Override // defpackage.zle
    public final zlf b() {
        return this.p;
    }

    public final void c() {
        zks zksVar = a().a;
        final zkx zkxVar = new zkx(this);
        aauc f = zksVar.a.f();
        f.k();
        f.d("FEaudio_tracks");
        ynm.n(this, zksVar.a.h(f, angq.a), new zfi() { // from class: zkq
            @Override // defpackage.zfi
            public final void a(Object obj) {
                zkx.this.a();
            }
        }, new zfi() { // from class: zkn
            @Override // defpackage.zfi
            public final void a(Object obj) {
                zkr zkrVar;
                FeaturedTrackSelection featuredTrackSelection;
                Context context = this;
                zkx zkxVar2 = zkxVar;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (browseResponseModel == null || browseResponseModel.j()) {
                    zga.b("Browse response is empty!");
                    zkrVar = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    amru g = browseResponseModel.g();
                    int size = g.size();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int i = 0; i < size; i++) {
                        aame aameVar = (aame) g.get(i);
                        aamd a = aameVar.a();
                        if (a != null) {
                            amru a2 = a.a();
                            int size2 = a2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                Object obj2 = a2.get(i2);
                                if (obj2 instanceof aalz) {
                                    Iterator it = ((aalz) obj2).b().iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        Iterator it2 = it;
                                        if (next instanceof apgs) {
                                            aveh avehVar = aameVar.a;
                                            str2 = (avehVar.b & 4) != 0 ? avehVar.e : null;
                                            str2.getClass();
                                        }
                                        if (next instanceof apgq) {
                                            aveh avehVar2 = aameVar.a;
                                            str3 = (avehVar2.b & 4) != 0 ? avehVar2.e : null;
                                            str3.getClass();
                                            arrayList2.add((apgq) next);
                                        }
                                        if (next instanceof apgo) {
                                            aveh avehVar3 = aameVar.a;
                                            str = (avehVar3.b & 4) != 0 ? avehVar3.e : null;
                                            str.getClass();
                                            arrayList.add(zks.a((apgo) next));
                                        }
                                        it = it2;
                                    }
                                }
                            }
                        }
                    }
                    zkrVar = new zkr();
                    if (str != null && !arrayList.isEmpty()) {
                        zkrVar.a = new FeaturedTrackSelection(str, arrayList, 0);
                    }
                    if (str3 != null && !arrayList2.isEmpty()) {
                        zkrVar.b = new CategorySelection(str3, arrayList2);
                    }
                    if (zgy.a(context, "android.permission.READ_EXTERNAL_STORAGE") && str2 != null) {
                        Cursor b = OnDeviceTrackSelection.b(context);
                        int i3 = 0;
                        while (b.moveToNext()) {
                            try {
                                if (OnDeviceTrackSelection.c(b)) {
                                    i3++;
                                }
                            } finally {
                                b.close();
                            }
                        }
                        if (i3 > 0) {
                            zkrVar.c = new OnDeviceTrackSelection(str2);
                        }
                    }
                }
                if (zkrVar == null || ((featuredTrackSelection = zkrVar.a) == null && zkrVar.b == null && zkrVar.c == null)) {
                    zkxVar2.a();
                    return;
                }
                CategorySelection categorySelection = zkrVar.b;
                OnDeviceTrackSelection onDeviceTrackSelection = zkrVar.c;
                AudioSelectionActivity audioSelectionActivity = zkxVar2.a;
                if (audioSelectionActivity.l) {
                    return;
                }
                audioSelectionActivity.b = new zkz(audioSelectionActivity.a, featuredTrackSelection, categorySelection, onDeviceTrackSelection);
                audioSelectionActivity.d.lf();
                for (int i4 = 0; i4 < audioSelectionActivity.b.j(); i4++) {
                    AudioSwapTabsBar audioSwapTabsBar = audioSelectionActivity.d;
                    CharSequence l = audioSelectionActivity.b.l(i4);
                    audioSwapTabsBar.r(l, l);
                }
                audioSelectionActivity.d.setVisibility(0);
                audioSelectionActivity.c.k(audioSelectionActivity.b);
                acra acraVar = audioSelectionActivity.h;
                if (acraVar != null && ((acqq) acraVar).g != null) {
                    for (int i5 = 0; i5 < audioSelectionActivity.b.j(); i5++) {
                        audioSelectionActivity.h.n(new acqx(audioSelectionActivity.b.o(i5)));
                    }
                    audioSelectionActivity.d.k = new zky(audioSelectionActivity);
                }
                whu.I(audioSelectionActivity.e, false);
                ce f2 = audioSelectionActivity.a.f("category_contents_fragment_tag");
                AudioSwapTabsBar audioSwapTabsBar2 = audioSelectionActivity.d;
                boolean z = f2 == null;
                whu.I(audioSwapTabsBar2, z);
                whu.I(audioSelectionActivity.c, z);
            }
        });
    }

    @Override // defpackage.zll
    public final void f(apgq apgqVar) {
        zlj zljVar = new zlj();
        apxf apxfVar = apgqVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        String str = ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).d;
        str.getClass();
        zljVar.af = str;
        zljVar.ah = this;
        dn k = this.a.k();
        k.q(R.id.audio_swap_audio_selection_contents_view, zljVar, "category_contents_fragment_tag");
        k.s(null);
        k.i = 4097;
        k.a();
    }

    @Override // defpackage.zli
    public final void g() {
        whu.I(this.d, true);
        whu.I(this.c, true);
        l(false);
    }

    @Override // defpackage.zli
    public final void h() {
        l(true);
        whu.I(this.d, false);
        whu.I(this.c, false);
    }

    @Override // defpackage.zlv
    public final void i(Track track) {
        acra acraVar = this.h;
        if (acraVar != null && ((acqq) acraVar).g != null) {
            acraVar.I(3, new acqx(acsb.c(10716)), null);
        }
        track.getClass();
        Uri uri = track.d;
        String scheme = uri.getScheme();
        if ((scheme != null && !scheme.equals("content")) || vuh.b(this.k.d(uri))) {
            setResult(-1, new Intent().putExtra("audio_track", track));
            finish();
        } else {
            whu.K(this, R.string.upload_edit_audio_swap_loading_error_text, 0);
        }
    }

    public final void j() {
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.audio_swap_audio_selection);
        this.a = getSupportFragmentManager();
        View findViewById = findViewById(R.id.audio_swap_loading_view);
        this.e = findViewById;
        this.g = findViewById.findViewById(R.id.audio_swap_error_indicator);
        this.f = (ProgressBar) this.e.findViewById(R.id.audio_swap_loading_indicator);
        this.c = (ViewPager) findViewById(R.id.audio_swap_audio_selection_view_pager);
        AudioSwapTabsBar audioSwapTabsBar = (AudioSwapTabsBar) findViewById(R.id.audio_swap_audio_selection_tabs_bar);
        this.d = audioSwapTabsBar;
        ViewPager viewPager = this.c;
        audioSwapTabsBar.c = viewPager;
        viewPager.p(audioSwapTabsBar);
        Button button = (Button) this.e.findViewById(R.id.audio_swap_retry_button);
        this.o = button;
        button.setOnClickListener(new zkw(this));
        lu supportActionBar = getSupportActionBar();
        supportActionBar.getClass();
        this.n = supportActionBar;
        supportActionBar.C();
        this.n.j(true);
        this.n.A();
        l(false);
        aong aongVar = (aong) apxf.a.createBuilder();
        String stringExtra = getIntent().getStringExtra("parent_csn");
        aone createBuilder = atmc.a.createBuilder();
        int intExtra = getIntent().getIntExtra("parent_ve_type", 0);
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = intExtra;
        if (stringExtra != null) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            atmcVar2.b = 1 | atmcVar2.b;
            atmcVar2.c = stringExtra;
        }
        aongVar.e(atmb.b, (atmc) createBuilder.build());
        this.h.d(acsb.b(9729), (apxf) aongVar.build(), null);
        this.h.n(new acqx(acsb.c(10716)));
        this.k = new vuh(this);
        j();
        c();
        Intent intent = getIntent();
        this.p = new zlf(this, this.h, intent.getBooleanExtra("extractor_sample_source", false));
        if (intent.getBooleanExtra("sunset_banner_enabled", false)) {
            findViewById(R.id.audio_sunset_container).setVisibility(0);
            final acqx acqxVar = new acqx(acsb.c(88806));
            this.h.n(acqxVar);
            findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: zkv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioSelectionActivity audioSelectionActivity = AudioSelectionActivity.this;
                    audioSelectionActivity.h.I(3, acqxVar, null);
                    aong aongVar2 = (aong) apxf.a.createBuilder();
                    aonk aonkVar = ApplicationHelpEndpointOuterClass.applicationHelpEndpoint;
                    aone createBuilder2 = apft.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    apft apftVar = (apft) createBuilder2.instance;
                    apftVar.b |= 2;
                    apftVar.c = "yt_android_upload_audio_swap_LML";
                    aongVar2.e(aonkVar, (apft) createBuilder2.build());
                    audioSelectionActivity.j.c((apxf) aongVar2.build(), null);
                }
            });
        }
        ce f = this.a.f("category_contents_fragment_tag");
        if (f instanceof zlj) {
            ((zlj) f).ah = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        zlf zlfVar = this.p;
        oxk oxkVar = zlfVar.b;
        if (oxkVar != null) {
            oxkVar.h();
        }
        zlfVar.b = null;
        this.p = null;
        super.onDestroy();
        this.l = true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.a.a() > 0) {
                this.a.K();
                return true;
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        this.p.a(false);
        super.onPause();
    }
}

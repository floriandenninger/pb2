package com.google.android.apps.youtube.app.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;
import defpackage.aben;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsa;
import defpackage.acsb;
import defpackage.agaf;
import defpackage.agel;
import defpackage.aghv;
import defpackage.agof;
import defpackage.agpd;
import defpackage.agsg;
import defpackage.agzr;
import defpackage.ajyw;
import defpackage.awwg;
import defpackage.axpg;
import defpackage.axzf;
import defpackage.axzg;
import defpackage.ayqi;
import defpackage.ayqx;
import defpackage.ayrz;
import defpackage.azqb;
import defpackage.bst;
import defpackage.ci;
import defpackage.ffs;
import defpackage.fjq;
import defpackage.fka;
import defpackage.gcl;
import defpackage.jyu;
import defpackage.lks;
import defpackage.llq;
import defpackage.llt;
import defpackage.llu;
import defpackage.ynm;
import defpackage.yxn;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflinePrefsFragment extends lks implements SharedPreferences.OnSharedPreferenceChangeListener, bst {
    public static final acsa c = new acqx(acsb.c(128287));
    public static final acsa d = new acqx(acsb.c(128286));
    public axzg aA;
    public ajyw aB;
    public axzf aC;
    private AlertDialog aF;
    private AlertDialog aG;
    private ayqx aH;
    public yxn ae;
    public llu af;
    public Handler ag;
    public aben ah;
    public fka ai;
    public agaf aj;
    public fjq ak;
    public agel al;
    public agzr am;
    public axpg an;
    public SettingsDataAccess ao;
    public acra ap;
    public gcl aq;
    public jyu ar;
    public agpd as;
    public ayqi at;
    public PreferenceScreen au;
    public boolean av;
    public ayqx aw;
    public Optional ax;
    public agof ay;
    public ffs az;
    public agsg e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.aH = this.ao.g(new Runnable() { // from class: llh
            /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
            
                if (r2.bz != false) goto L90;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x02c9, code lost:
            
                if (r2.c == false) goto L110;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:69:0x02ad  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x02dc  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x02f3 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 797
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.llh.run():void");
            }
        });
    }

    @Override // defpackage.ce
    public final void V() {
        this.a.c().unregisterOnSharedPreferenceChangeListener(this);
        azqb.f((AtomicReference) this.aH);
        Object obj = this.aw;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.aw = null;
        }
        super.V();
    }

    @Override // defpackage.bsk, defpackage.bst
    public final boolean aG(Preference preference) {
        ci C = C();
        String str = preference.s;
        if ("offline_help".equals(str)) {
            this.az.a(C, "yt_android_offline");
        } else if ("clear_offline".equals(str)) {
            this.aF.show();
        } else if ("cross_device_offline".equals(str)) {
            this.aG.show();
        }
        return super.aG(preference);
    }

    @Override // defpackage.bsk
    public final void aH() {
        this.a.g("youtube");
        this.aF = new AlertDialog.Builder(C()).setMessage(R.string.clear_offline_confirmation).setPositiveButton(R.string.remove_all_downloads_confirm_button, new DialogInterface.OnClickListener() { // from class: llf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                gcl gclVar = offlinePrefsFragment.aq;
                gcm d2 = gcq.d();
                d2.d(0);
                d2.k(offlinePrefsFragment.qX().getString(R.string.offline_actions_remove_all_snackbar_text));
                gclVar.j(d2.b());
                offlinePrefsFragment.ay.a().r();
                offlinePrefsFragment.aw = offlinePrefsFragment.ar.a().M(offlinePrefsFragment.at).V(new ayrs() { // from class: llg
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        OfflinePrefsFragment offlinePrefsFragment2 = OfflinePrefsFragment.this;
                        if (((Boolean) obj).booleanValue()) {
                            agpd agpdVar = offlinePrefsFragment2.as;
                            aone createBuilder = atpq.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atpq atpqVar = (atpq) createBuilder.instance;
                            atpqVar.c = 2;
                            atpqVar.b |= 1;
                            String w = fhe.w();
                            createBuilder.copyOnWrite();
                            atpq atpqVar2 = (atpq) createBuilder.instance;
                            w.getClass();
                            atpqVar2.b = 2 | atpqVar2.b;
                            atpqVar2.d = w;
                            agpdVar.d((atpq) createBuilder.build());
                        }
                    }
                });
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        AlertDialog.Builder builder = new AlertDialog.Builder(C());
        final View inflate = C().getLayoutInflater().inflate(R.layout.cross_device_offline_dialog, (ViewGroup) null);
        final AlertDialog create = builder.setView(inflate).setTitle(R.string.menu_cross_device_offline).setPositiveButton(R.string.save_cross_device_offline_menu, new DialogInterface.OnClickListener() { // from class: llk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                String obj = ((EditText) inflate.findViewById(R.id.cross_device_offline_device_name)).getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    offlinePrefsFragment.aM(R.string.pref_cross_device_offline_no_device_name);
                    return;
                }
                String s = offlinePrefsFragment.aj.s();
                if (s.isEmpty()) {
                    offlinePrefsFragment.aM(R.string.pref_cross_device_offline_no_gcm_registration_id);
                    return;
                }
                boolean z = offlinePrefsFragment.av;
                aben abenVar = offlinePrefsFragment.ah;
                abem abemVar = new abem(abenVar.f, abenVar.c.c(), null, null, null);
                abemVar.a = abem.i(yjj.k(offlinePrefsFragment.C()));
                abemVar.d = z ? 2 : 3;
                abemVar.b = abem.i(obj);
                abemVar.c = abem.i(s);
                abemVar.k();
                Boolean valueOf = Boolean.valueOf(z);
                offlinePrefsFragment.ol("cross_device_offline").G(false);
                offlinePrefsFragment.ah.l.e(abemVar, new lls(offlinePrefsFragment, obj, valueOf));
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        this.aG = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: lll
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                View view = inflate;
                AlertDialog alertDialog = create;
                ((Switch) view.findViewById(R.id.cross_device_offline_enabled)).setChecked(((fkg) offlinePrefsFragment.ai.a.c()).d);
                EditText editText = (EditText) view.findViewById(R.id.cross_device_offline_device_name);
                editText.setText(((fkg) offlinePrefsFragment.ai.a.c()).c, TextView.BufferType.EDITABLE);
                if (editText.getText().toString().isEmpty()) {
                    alertDialog.getButton(-1).setEnabled(false);
                }
            }
        });
        ((EditText) inflate.findViewById(R.id.cross_device_offline_device_name)).addTextChangedListener(new llt(create));
        ((Switch) inflate.findViewById(R.id.cross_device_offline_enabled)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: llm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OfflinePrefsFragment.this.av = z;
            }
        });
    }

    public final void aL(boolean z) {
        this.ax = Optional.of(Boolean.valueOf(z));
        this.ap.n(z ? c : d);
    }

    public final void aM(final int i) {
        this.ag.post(new Runnable() { // from class: lli
            @Override // java.lang.Runnable
            public final void run() {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                whu.K(offlinePrefsFragment.C(), i, 0);
            }
        });
    }

    @Override // defpackage.bsk
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae(null);
        return n;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        awwg awwgVar;
        if (aghv.QUALITY.equals(str)) {
            ListPreference listPreference = (ListPreference) ol(str);
            if (listPreference != null) {
                listPreference.n(listPreference.l());
                return;
            }
            return;
        }
        if (aghv.WIFI_POLICY.equals(str)) {
            boolean l = this.e.l();
            sharedPreferences.edit().putString(aghv.WIFI_POLICY_STRING, O(l ? R.string.wifi : R.string.any)).apply();
            if (this.e.L()) {
                agsg agsgVar = this.e;
                if (l) {
                    awwgVar = awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE;
                } else {
                    awwgVar = awwg.ANY;
                }
                ynm.n(this, agsgVar.t(awwgVar), llq.a, ynm.b);
            }
        }
    }
}

package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class noo extends nnw implements AdapterView.OnItemClickListener, kfv {
    public aaea ae;
    public acqz af;
    public kfu ag;
    public kfw ah;
    public wjt ai;
    public afsy aj;
    public wju ak;
    public acra al;
    private ahyt am;

    private final boolean aM() {
        atcl atclVar = this.ae.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        return atcmVar.h;
    }

    private final boolean aN() {
        atcl atclVar = this.ae.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        return atcmVar.e;
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        dismiss();
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        nno[] d;
        ci C = C();
        C.getClass();
        ajxn ajxnVar = new ajxn(C);
        acra mM = this.af.mM();
        this.al = mM;
        atcl atclVar = this.ae.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        InteractionLoggingScreen interactionLoggingScreen = null;
        if (atcmVar.f && mM != null) {
            interactionLoggingScreen = mM.c();
        }
        if (interactionLoggingScreen != null) {
            acsa acsaVar = new acsa(interactionLoggingScreen, acsb.c(93933));
            mM.n(acsaVar);
            if (aN()) {
                mM.o(new acqx(acsb.c(96877)), acsaVar);
            }
            d = nno.d(C, this.ah.f, aM());
            for (nno nnoVar : d) {
                avzr avzrVar = nnoVar.a;
                if (avzrVar != avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU) {
                    nnoVar.b = true;
                    acqx acqxVar = new acqx(nno.c(avzrVar));
                    if (nnoVar.g) {
                        mM.F(acqxVar, acsaVar);
                        aone createBuilder = asht.a.createBuilder();
                        aone createBuilder2 = asis.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asis.a((asis) createBuilder2.instance);
                        createBuilder.copyOnWrite();
                        asht ashtVar = (asht) createBuilder.instance;
                        asis asisVar = (asis) createBuilder2.build();
                        asisVar.getClass();
                        ashtVar.y = asisVar;
                        ashtVar.c |= 32768;
                        mM.u(acqxVar, (asht) createBuilder.build());
                    } else {
                        mM.o(acqxVar, acsaVar);
                    }
                }
            }
        } else {
            d = nno.d(C, this.ah.f, aM());
        }
        for (nno nnoVar2 : d) {
            ajxnVar.add(nnoVar2);
        }
        return ajxnVar;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    protected final ajxn aL() {
        return (ajxn) this.aD;
    }

    @Override // defpackage.kfv
    public final void b(ahyt ahytVar) {
        this.am = ahytVar;
    }

    @Override // defpackage.kfv
    public final void c(ci ciVar) {
        if (ar() || av()) {
            return;
        }
        qh(ciVar.getSupportFragmentManager(), "VIDEO_QUALITIES_QUICK_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
        inflate.findViewById(R.id.bottom_sheet_title).setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        View inflate2 = layoutInflater.inflate(R.layout.video_quality_bottom_sheet_list_fragment_title, (ViewGroup) listView, false);
        CharSequence charSequence = (CharSequence) this.ah.e.e("");
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate2.findViewById(R.id.bottom_sheet_title_resolution)).setText(charSequence);
        }
        listView.addHeaderView(inflate2, null, false);
        View inflate3 = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate3.findViewById(R.id.bottom_sheet_footer_text);
        final ci C = C();
        C.getClass();
        if (aN()) {
            youTubeTextView.setText(muf.j(C, R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: nom
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final noo nooVar = noo.this;
                    final ci ciVar = C;
                    acra acraVar = nooVar.al;
                    if (acraVar != null) {
                        acraVar.I(3, new acqx(acsb.c(96877)), null);
                    }
                    if (nooVar.ak.a()) {
                        ynm.n(nooVar, nooVar.ai.a(nooVar.aj.c()), llq.r, new zfi() { // from class: non
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                noo nooVar2 = noo.this;
                                ci ciVar2 = ciVar;
                                AccountId accountId = (AccountId) obj;
                                if (accountId != null) {
                                    Intent d = fav.d(ciVar2);
                                    alxb.a(d, accountId);
                                    nooVar2.ao(d);
                                }
                            }
                        });
                    } else {
                        nooVar.ao(fav.d(ciVar));
                    }
                }
            });
        } else {
            youTubeTextView.setText(C.getString(R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setBackground(null);
            youTubeTextView.d(false);
        }
        listView.addFooterView(inflate3, null, false);
        listView.setAdapter((ListAdapter) aL());
        listView.setOnItemClickListener(this);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        nno nnoVar = (nno) aL().getItem(i - 1);
        if (nnoVar != null) {
            acra acraVar = this.al;
            if (acraVar != null && nnoVar.b) {
                acraVar.I(3, new acqx(nno.c(nnoVar.a)), null);
            }
            avzr avzrVar = nnoVar.a;
            if (avzrVar == avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU) {
                kfu kfuVar = this.ag;
                ci C = C();
                C.getClass();
                kfuVar.c(C);
            } else {
                if (nnoVar.a == avzr.VIDEO_QUALITY_SETTING_UNKNOWN) {
                    str = nnoVar.i.getString(R.string.video_quality_quick_menu_auto_toast);
                } else {
                    str = nnoVar.c;
                }
                ci C2 = C();
                if (C2 != null) {
                    this.ah.b(C2.getString(R.string.video_quality_menu_per_playback_duration_confirmation, new Object[]{str}));
                }
                ahyt ahytVar = this.am;
                if (ahytVar != null) {
                    ahytVar.y(avzrVar);
                }
            }
        }
        dismiss();
    }
}

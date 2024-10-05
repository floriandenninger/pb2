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
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class noj implements nok {
    final /* synthetic */ nol a;
    private final /* synthetic */ int b;

    public noj(nol nolVar, int i) {
        this.b = i;
        this.a = nolVar;
    }

    @Override // defpackage.nok
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mg;
        if (this.b != 0) {
            mg = super/*nnv*/.mg(layoutInflater, viewGroup, bundle);
            return mg;
        }
        super/*nnv*/.mg(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment, viewGroup, false);
        inflate.findViewById(R.id.bottom_sheet_title).setVisibility(8);
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        View inflate2 = layoutInflater.inflate(R.layout.video_quality_bottom_sheet_list_fragment_title, (ViewGroup) listView, false);
        CharSequence charSequence = (CharSequence) this.a.ag.e.e("");
        if (!TextUtils.isEmpty(charSequence)) {
            ((TextView) inflate2.findViewById(R.id.bottom_sheet_title_resolution)).setText(charSequence);
        }
        listView.addHeaderView(inflate2, null, false);
        atcl atclVar = this.a.af.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        if (atcmVar.j) {
            View inflate3 = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
            YouTubeTextView youTubeTextView = (YouTubeTextView) inflate3.findViewById(R.id.bottom_sheet_footer_text);
            final ci C = this.a.C();
            C.getClass();
            youTubeTextView.setText(muf.j(C, R.string.video_quality_quick_menu_settings_footer_info_2));
            youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: noh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final noj nojVar = noj.this;
                    final ci ciVar = C;
                    acra acraVar = nojVar.a.ap;
                    if (acraVar != null) {
                        acraVar.I(3, new acqx(acsb.c(96877)), null);
                    }
                    if (nojVar.a.aj.a()) {
                        nol nolVar = nojVar.a;
                        ynm.n(nolVar, nolVar.ah.a(nolVar.ai.c()), llq.q, new zfi() { // from class: noi
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                noj nojVar2 = noj.this;
                                ci ciVar2 = ciVar;
                                AccountId accountId = (AccountId) obj;
                                if (accountId != null) {
                                    Intent d = fav.d(ciVar2);
                                    alxb.a(d, accountId);
                                    nojVar2.a.ao(d);
                                }
                            }
                        });
                    } else {
                        nojVar.a.ao(fav.d(ciVar));
                    }
                }
            });
            listView.addFooterView(inflate3, null, false);
        }
        listView.setAdapter((ListAdapter) this.a.aM());
        listView.setOnItemClickListener(this.a);
        return inflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.b == 0) {
            int i2 = i - 1;
            nnp nnpVar = (nnp) this.a.aM().getItem(i2);
            if (nnpVar != null) {
                this.a.aN(nnpVar.d(), i2);
                String str = nnpVar.c;
                ci C = this.a.C();
                if (C != null) {
                    this.a.ag.b(C.getString(R.string.video_quality_menu_per_playback_duration_confirmation, new Object[]{str}));
                }
                ahyt ahytVar = this.a.ao;
                if (ahytVar != null) {
                    ahytVar.x(nnpVar.c());
                }
            }
            this.a.dismiss();
            return;
        }
        nnp nnpVar2 = (nnp) this.a.aM().getItem(i);
        if (nnpVar2 != null) {
            this.a.aN(nnpVar2.d(), i);
            ahyt ahytVar2 = this.a.ao;
            if (ahytVar2 != null) {
                ahytVar2.x(nnpVar2.c());
            }
        }
        this.a.dismiss();
    }

    @Override // defpackage.nok
    public final ajxn b() {
        nol nolVar;
        int i;
        if (this.b != 0) {
            ci C = this.a.C();
            C.getClass();
            ajxn ajxnVar = new ajxn(C);
            VideoQuality[] videoQualityArr = this.a.ak;
            if (videoQualityArr != null && videoQualityArr.length > 0) {
                for (int i2 = 0; i2 < videoQualityArr.length; i2++) {
                    nnp nnpVar = new nnp(C, videoQualityArr[i2]);
                    String str = null;
                    nnpVar.h = null;
                    nol nolVar2 = this.a;
                    int i3 = nolVar2.al;
                    if (i2 == i3 && nolVar2.aq == 1) {
                        nnpVar.a(true);
                    } else if (i2 != i3 || nolVar2.an || nolVar2.aq != 2) {
                        if (nolVar2.aq == 2 && nolVar2.an && nnpVar.c() == -2) {
                            nol nolVar3 = this.a;
                            VideoQuality[] videoQualityArr2 = nolVar3.ak;
                            if (videoQualityArr2 != null) {
                                int i4 = nolVar3.al;
                                if (i4 <= 0 || i4 >= videoQualityArr2.length) {
                                    int i5 = nolVar3.am;
                                    if (i5 <= 0 || i5 >= videoQualityArr2.length) {
                                        str = "";
                                    } else {
                                        String valueOf = String.valueOf(nolVar3.qX().getString(R.string.quality_label, videoQualityArr2[this.a.am].b));
                                        str = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
                                    }
                                } else {
                                    String valueOf2 = String.valueOf(nolVar3.qX().getString(R.string.quality_label, videoQualityArr2[this.a.al].b));
                                    str = valueOf2.length() != 0 ? " ".concat(valueOf2) : new String(" ");
                                }
                            }
                            if (str != null) {
                                nnpVar.h = str;
                                nnpVar.a(true);
                            }
                        }
                    } else {
                        nnpVar.a(true);
                    }
                    ajxnVar.add(nnpVar);
                }
            }
            return ajxnVar;
        }
        ci C2 = this.a.C();
        C2.getClass();
        ajxn ajxnVar2 = new ajxn(C2);
        nol nolVar4 = this.a;
        VideoQuality[] videoQualityArr3 = nolVar4.ak;
        if (videoQualityArr3 != null && videoQualityArr3.length > 0) {
            avzr avzrVar = nolVar4.ag.f;
            for (int i6 = 0; i6 < videoQualityArr3.length; i6++) {
                nnp nnpVar2 = new nnp(C2, videoQualityArr3[i6]);
                if (nnpVar2.c() != -2) {
                    if (avzrVar == avzr.VIDEO_QUALITY_SETTING_ADVANCED_MENU && (i6 == (i = (nolVar = this.a).al) || (i == 0 && i6 == nolVar.am))) {
                        nnpVar2.a(true);
                    }
                    ajxnVar2.add(nnpVar2);
                }
            }
        }
        return ajxnVar2;
    }
}

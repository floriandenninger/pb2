package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class noe extends nnu implements AdapterView.OnItemClickListener, kfm {
    public kfo ae;
    public aifk af;
    public acqz ag;
    public Context ah;
    public acra ai;
    public aadw aj;
    private ArrayList ak;
    private SubtitleTrack al;
    private ahxs am;

    @Override // defpackage.ce
    public final void X() {
        super.X();
        dismiss();
    }

    @Override // defpackage.kfm
    public final void a(SubtitleTrack subtitleTrack) {
        this.al = subtitleTrack;
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        ajxn ajxnVar = new ajxn(this.ah);
        InteractionLoggingScreen c = this.ag.mM().c();
        if (c != null) {
            acra mM = this.ag.mM();
            this.ai = mM;
            if (mM != null) {
                acsa acsaVar = new acsa(c, acsb.c(107242));
                mM.n(acsaVar);
                if (this.af.x()) {
                    mM.o(new acqx(acsb.c(107243)), acsaVar);
                }
            }
        }
        ArrayList arrayList = this.ak;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                SubtitleTrack subtitleTrack = (SubtitleTrack) arrayList.get(i);
                nnq nnqVar = new nnq(this.ah, subtitleTrack);
                nnqVar.a(subtitleTrack.equals(this.al));
                ajxnVar.add(nnqVar);
            }
        }
        return ajxnVar;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return qX().getString(R.string.overflow_captions);
    }

    @Override // defpackage.kfm
    public final void b(ahxs ahxsVar) {
        this.am = ahxsVar;
    }

    @Override // defpackage.kfm
    public final void c(List list) {
        this.ak = new ArrayList(list);
        ListAdapter listAdapter = this.aD;
        if (listAdapter != null) {
            ((ajxn) listAdapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.kfm
    public final void d(ci ciVar) {
        if (ar() || av()) {
            return;
        }
        qi(ciVar.getSupportFragmentManager(), "SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mg = super.mg(layoutInflater, viewGroup, bundle);
        if (mg != null) {
            View findViewById = mg.findViewById(R.id.bottom_sheet_title);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setTextColor(wbs.Q(layoutInflater.getContext(), R.attr.ytTextPrimary));
            }
            if (this.af.x()) {
                ListView listView = (ListView) mg.findViewById(R.id.bottom_sheet_list_view);
                View inflate = layoutInflater.inflate(R.layout.bottom_sheet_list_fragment_footer, (ViewGroup) listView, false);
                YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.bottom_sheet_footer_text);
                ci C = C();
                if (C != null) {
                    youTubeTextView.setText(muf.j(C, R.string.subtitle_menu_settings_footer_info));
                }
                youTubeTextView.setOnClickListener(new View.OnClickListener() { // from class: nod
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        noe noeVar = noe.this;
                        acra acraVar = noeVar.ai;
                        if (acraVar != null) {
                            acraVar.I(3, new acqx(acsb.c(107243)), null);
                        }
                        noeVar.ao(new Intent("android.settings.CAPTIONING_SETTINGS"));
                    }
                });
                listView.addFooterView(inflate, null, false);
                listView.setAdapter(this.aD);
                listView.setOnItemClickListener(this);
            }
        }
        return mg;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        nnq nnqVar = (nnq) ((ajxn) this.aD).getItem(i);
        if (nnqVar != null) {
            ahxs ahxsVar = this.am;
            if (ahxsVar != null) {
                ahxsVar.ps(nnqVar.a);
            }
            if (evr.aQ(this.aj)) {
                this.ae.b(nnqVar.a);
            }
        }
        dismiss();
    }

    @Override // defpackage.ce
    public final Context qR() {
        return this.ah;
    }
}

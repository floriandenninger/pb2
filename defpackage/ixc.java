package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixc extends ivs implements ypd {
    public afsy a;
    private View aA;
    private TextView aB;
    private TextView aC;
    private gaf aD;
    private kvw aE;
    private float aF;
    private float aG;
    private int aH;
    public ajjz ae;
    public aahd af;
    public String ag;
    public aucn ah;
    public LoadingFrameLayout ai;
    public YouTubeTextView aj;
    public ixb ak;
    public AlertDialog al;
    public c am;
    public ajoy an;
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint ao;
    private apxf aw;
    private ImageView ax;
    private EditText ay;
    private EditText az;
    public abav b;
    public abaz c;
    public zaw d;
    public ypa e;

    public static int aG(auci auciVar) {
        aucc auccVar = (auciVar.b == 4 ? (aucq) auciVar.c : aucq.a).b;
        if (auccVar == null) {
            auccVar = aucc.a;
        }
        aqpi aqpiVar = auccVar.b;
        if (aqpiVar == null) {
            aqpiVar = aqpi.a;
        }
        aqph aqphVar = aqpiVar.c;
        if (aqphVar == null) {
            aqphVar = aqph.a;
        }
        for (aqpe aqpeVar : aqphVar.c) {
            aqpg aqpgVar = aqpeVar.c;
            if (aqpgVar == null) {
                aqpgVar = aqpg.a;
            }
            if (aqpgVar.h) {
                aqpg aqpgVar2 = aqpeVar.c;
                if (aqpgVar2 == null) {
                    aqpgVar2 = aqpg.a;
                }
                int bu = anaf.bu(aqpgVar2.c == 6 ? ((Integer) aqpgVar2.d).intValue() : 0);
                if (bu != 0) {
                    return bu;
                }
                throw new IllegalStateException("Unknown privacy status");
            }
        }
        throw new IllegalStateException();
    }

    private final PlaylistEditorFragment$EditorState aH() {
        return new PlaylistEditorFragment$EditorState(this.ay.getText(), this.az.getText(), this.aE.b());
    }

    private static boolean aI(auci auciVar) {
        return (auciVar.b == 6 ? (aulq) auciVar.c : aulq.a).pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }

    private static boolean aJ(auci auciVar) {
        aucc auccVar = (auciVar.b == 4 ? (aucq) auciVar.c : aucq.a).b;
        if (auccVar == null) {
            auccVar = aucc.a;
        }
        aqpi aqpiVar = auccVar.b;
        if (aqpiVar == null) {
            aqpiVar = aqpi.a;
        }
        return (aqpiVar.b & 1) != 0;
    }

    private final boolean bg() {
        auci bY = evr.bY(this.ah);
        if (bY != null) {
            aucp aucpVar = bY.e;
            if (aucpVar == null) {
                aucpVar = aucp.a;
            }
            if ((aucpVar.b & 1) != 0) {
                aucp aucpVar2 = bY.f;
                if (aucpVar2 == null) {
                    aucpVar2 = aucp.a;
                }
                if ((aucpVar2.b & 1) != 0) {
                    if (aI(bY)) {
                        return true;
                    }
                    if (aJ(bY)) {
                        try {
                            aG(bY);
                            return true;
                        } catch (IllegalStateException unused) {
                            zga.b("Privacy status is not set in the PrivacyDropdown.");
                            return false;
                        }
                    }
                    zga.b("Missing privacy option in the PlaylistSettingsEditorRenderer");
                    return false;
                }
            }
        }
        zga.b("Missing name or description in the PlaylistSettingsEditorRenderer.");
        return false;
    }

    private static final void bh(EditText editText, int i) {
        if (i <= 0) {
            return;
        }
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        Optional.ofNullable(this.O).ifPresent(iwu.a);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        super.Z();
        if (this.a.t()) {
            return;
        }
        this.at.c(false);
    }

    public final void aF(afwx afwxVar) {
        int i;
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = this.ao;
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint != null && bg()) {
            abaw a = this.c.a();
            a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
            a.k();
            PlaylistEditorFragment$EditorState aH = aH();
            String trim = zhq.d(aH.a).toString().trim();
            if (TextUtils.isEmpty(trim)) {
                whu.K(this.ap, R.string.edit_video_error_empty_title, 0);
                return;
            }
            auci bY = evr.bY(this.ah);
            if (bY != null) {
                aucp aucpVar = bY.e;
                if (aucpVar == null) {
                    aucpVar = aucp.a;
                }
                aqxu aqxuVar = aucpVar.c;
                if (aqxuVar == null) {
                    aqxuVar = aqxu.a;
                }
                if (!TextUtils.equals(trim, aqxuVar.d)) {
                    aone createBuilder = auau.a.createBuilder();
                    createBuilder.copyOnWrite();
                    auau auauVar = (auau) createBuilder.instance;
                    auauVar.c = 6;
                    auauVar.b |= 1;
                    createBuilder.copyOnWrite();
                    auau auauVar2 = (auau) createBuilder.instance;
                    trim.getClass();
                    auauVar2.b |= 256;
                    auauVar2.h = trim;
                    a.b.add((auau) createBuilder.build());
                }
                String trim2 = zhq.d(aH.b).toString().trim();
                aucp aucpVar2 = bY.f;
                if (aucpVar2 == null) {
                    aucpVar2 = aucp.a;
                }
                aqxu aqxuVar2 = aucpVar2.c;
                if (aqxuVar2 == null) {
                    aqxuVar2 = aqxu.a;
                }
                if (!TextUtils.equals(trim2, aqxuVar2.d)) {
                    aone createBuilder2 = auau.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    auau auauVar3 = (auau) createBuilder2.instance;
                    auauVar3.c = 7;
                    auauVar3.b |= 1;
                    createBuilder2.copyOnWrite();
                    auau auauVar4 = (auau) createBuilder2.instance;
                    trim2.getClass();
                    auauVar4.b |= 512;
                    auauVar4.i = trim2;
                    a.b.add((auau) createBuilder2.build());
                }
                if (aJ(bY) && (i = aH.c) != aG(bY)) {
                    aone createBuilder3 = auau.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    auau auauVar5 = (auau) createBuilder3.instance;
                    auauVar5.c = 9;
                    auauVar5.b |= 1;
                    createBuilder3.copyOnWrite();
                    auau auauVar6 = (auau) createBuilder3.instance;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    auauVar6.j = i2;
                    auauVar6.b |= 2048;
                    a.b.add((auau) createBuilder3.build());
                }
            }
            if (a.b.size() <= 0) {
                afwxVar.kZ(arzb.a);
            } else {
                this.c.b(a, afwxVar);
            }
        }
    }

    @Override // defpackage.gir
    public final void aX() {
        PlaylistEditorFragment$EditorState aH = aH();
        iwz iwzVar = new iwz(this);
        iwzVar.a = aH;
        q(iwzVar);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            this.at.c(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.gir
    public final gad lv() {
        if (this.aq == null) {
            gac a = this.as.a();
            a.m(new amml() { // from class: iwt
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    ixc ixcVar = ixc.this;
                    fzf fzfVar = (fzf) obj;
                    fzfVar.a = ixcVar.qX().getString(R.string.edit_playlist_form_title);
                    fzfVar.d(amsx.r(ixcVar.ak));
                    return fzfVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.e.m(this);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("playlist_id", this.ag);
        bundle.putByteArray("navigation_endpoint", this.aw.toByteArray());
        aucn aucnVar = this.ah;
        if (aucnVar != null) {
            bundle.putByteArray("playlist_settings_editor", aucnVar.toByteArray());
            bundle.putParcelable("editor_state", aH());
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        if (!this.a.t()) {
            this.at.c(false);
        } else {
            this.e.g(this);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aucn aucnVar;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.playlist_editor_fragment, viewGroup, false);
        this.ai = loadingFrameLayout;
        this.ax = (ImageView) loadingFrameLayout.findViewById(R.id.thumbnail);
        this.ay = (EditText) this.ai.findViewById(R.id.title_edit);
        this.az = (EditText) this.ai.findViewById(R.id.description_edit);
        this.aj = (YouTubeTextView) this.ai.findViewById(R.id.privacy_item_message);
        this.aE = this.am.h((PrivacySpinner) this.ai.findViewById(R.id.privacy_edit));
        this.aD = this.an.J(qR(), (ViewStub) this.ai.findViewById(R.id.privacy_badge));
        this.ak = new ixb(this);
        this.aA = this.ai.findViewById(R.id.collaboration_section_entry);
        this.aB = (TextView) this.ai.findViewById(R.id.collaboration_section_entry_title);
        this.aC = (TextView) this.ai.findViewById(R.id.collaboration_section_entry_byline);
        this.aF = this.ai.getAlpha();
        TypedValue typedValue = new TypedValue();
        this.ai.getContext().getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        this.aG = typedValue.getFloat();
        this.aH = wbs.Q(this.ai.getContext(), R.attr.ytTextDisabled);
        if (bundle != null) {
            this.ag = bundle.getString("playlist_id", "");
            this.aw = aahg.b(bundle.getByteArray("navigation_endpoint"));
            try {
                byte[] byteArray = bundle.getByteArray("playlist_settings_editor");
                if (byteArray != null) {
                    aucnVar = (aucn) aonm.parseFrom(aucn.a, byteArray, aomw.b());
                } else {
                    aucnVar = null;
                }
                this.ah = aucnVar;
            } catch (aoob unused) {
                this.ah = null;
            }
            PlaylistEditorFragment$EditorState playlistEditorFragment$EditorState = (PlaylistEditorFragment$EditorState) bundle.getParcelable("editor_state");
            aucn aucnVar2 = this.ah;
            if (aucnVar2 != null) {
                r(aucnVar2, playlistEditorFragment$EditorState);
                this.ai.a();
                mM().d(acsb.b(20445), this.aw, null);
                return this.ai;
            }
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.ag = bundle2.getString("playlist_id", "");
            this.aw = aahg.b(bundle2.getByteArray("navigation_endpoint"));
            iwz iwzVar = new iwz(this);
            this.ai.f(new iwv(this, iwzVar));
            q(iwzVar);
        }
        mM().d(acsb.b(20445), this.aw, null);
        return this.ai;
    }

    public final void q(afwx afwxVar) {
        this.ai.c();
        abas e = this.b.e();
        e.d(this.ag);
        e.m(aaef.b);
        this.b.h(e, afwxVar);
    }

    public final void r(aucn aucnVar, PlaylistEditorFragment$EditorState playlistEditorFragment$EditorState) {
        avgg avggVar;
        aulq aulqVar;
        aqyg aqygVar;
        aucq aucqVar;
        if (aucnVar == null) {
            return;
        }
        auci bY = evr.bY(aucnVar);
        if (!bg() || bY == null) {
            return;
        }
        if (playlistEditorFragment$EditorState != null) {
            this.ay.setText(playlistEditorFragment$EditorState.a);
            this.az.setText(playlistEditorFragment$EditorState.b);
        } else {
            EditText editText = this.ay;
            aucp aucpVar = bY.e;
            if (aucpVar == null) {
                aucpVar = aucp.a;
            }
            aqxu aqxuVar = aucpVar.c;
            if (aqxuVar == null) {
                aqxuVar = aqxu.a;
            }
            editText.setText(aqxuVar.d);
            EditText editText2 = this.az;
            aucp aucpVar2 = bY.f;
            if (aucpVar2 == null) {
                aucpVar2 = aucp.a;
            }
            aqxu aqxuVar2 = aucpVar2.c;
            if (aqxuVar2 == null) {
                aqxuVar2 = aqxu.a;
            }
            editText2.setText(aqxuVar2.d);
        }
        EditText editText3 = this.ay;
        aucp aucpVar3 = bY.e;
        if (aucpVar3 == null) {
            aucpVar3 = aucp.a;
        }
        aqxu aqxuVar3 = aucpVar3.c;
        if (aqxuVar3 == null) {
            aqxuVar3 = aqxu.a;
        }
        bh(editText3, aqxuVar3.e);
        EditText editText4 = this.az;
        aucp aucpVar4 = bY.f;
        if (aucpVar4 == null) {
            aucpVar4 = aucp.a;
        }
        aqxu aqxuVar4 = aucpVar4.c;
        if (aqxuVar4 == null) {
            aqxuVar4 = aqxu.a;
        }
        bh(editText4, aqxuVar4.e);
        ajjz ajjzVar = this.ae;
        ImageView imageView = this.ax;
        auda audaVar = bY.d;
        if (audaVar == null) {
            audaVar = auda.a;
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = null;
        if ((audaVar.b & 2) != 0) {
            auda audaVar2 = bY.d;
            if (audaVar2 == null) {
                audaVar2 = auda.a;
            }
            aucz auczVar = audaVar2.d;
            if (auczVar == null) {
                auczVar = aucz.a;
            }
            avggVar = auczVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            auda audaVar3 = bY.d;
            if (audaVar3 == null) {
                audaVar3 = auda.a;
            }
            if ((audaVar3.b & 1) != 0) {
                auda audaVar4 = bY.d;
                if (audaVar4 == null) {
                    audaVar4 = auda.a;
                }
                audb audbVar = audaVar4.c;
                if (audbVar == null) {
                    audbVar = audb.a;
                }
                avggVar = audbVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
        }
        ajjzVar.h(imageView, avggVar);
        if (aJ(bY)) {
            kvw kvwVar = this.aE;
            if (bY.b == 4) {
                aucqVar = (aucq) bY.c;
            } else {
                aucqVar = aucq.a;
            }
            aucc auccVar = aucqVar.b;
            if (auccVar == null) {
                auccVar = aucc.a;
            }
            aqpi aqpiVar = auccVar.b;
            if (aqpiVar == null) {
                aqpiVar = aqpi.a;
            }
            aqph aqphVar = aqpiVar.c;
            if (aqphVar == null) {
                aqphVar = aqph.a;
            }
            kvwVar.a(aqphVar);
            if (playlistEditorFragment$EditorState != null) {
                this.aE.c(playlistEditorFragment$EditorState.c);
            } else {
                this.aE.c(aG(bY));
            }
            this.aD.a();
            this.ai.findViewById(R.id.line_separator).setVisibility(0);
        } else if (aI(bY)) {
            gaf gafVar = this.aD;
            if (bY.b == 6) {
                aulqVar = (aulq) bY.c;
            } else {
                aulqVar = aulq.a;
            }
            gafVar.f((atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.aj.setVisibility(8);
            this.ai.findViewById(R.id.privacy_edit).setVisibility(8);
            this.ai.findViewById(R.id.line_separator).setVisibility(8);
        }
        final aucj bZ = evr.bZ(aucnVar);
        if (bZ != null) {
            TextView textView = this.aB;
            if ((bZ.b & 1) != 0) {
                aqygVar = bZ.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            this.aA.setVisibility(0);
            if (bZ.m) {
                this.aB.setTextColor(this.aH);
                this.aC.setTextColor(this.aH);
            }
            this.aA.setOnClickListener(new View.OnClickListener() { // from class: iws
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ixc ixcVar = ixc.this;
                    aucj aucjVar = bZ;
                    if ((aucjVar.b & 32768) != 0) {
                        aahd aahdVar = ixcVar.af;
                        apxf apxfVar = aucjVar.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, null);
                    }
                    if (aucjVar.m) {
                        return;
                    }
                    auci bY2 = evr.bY(ixcVar.ah);
                    if (bY2 == null || ixc.aG(bY2) != 1) {
                        ixcVar.at.d(evr.ca(ixcVar.ag));
                        return;
                    }
                    if (ixcVar.al == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ixcVar.qW());
                        builder.setTitle(R.string.save_playlist_changes_dialog_title);
                        builder.setMessage(R.string.save_playlist_changes_dialog_content);
                        builder.setPositiveButton(R.string.save_playlist_menu_item_title, new iwy(ixcVar));
                        builder.setNegativeButton(R.string.cancel, new hgs(3));
                        ixcVar.al = builder.create();
                    }
                    ixcVar.al.show();
                }
            });
            this.aE.c = new iww(this);
            s();
        } else {
            this.aA.setVisibility(8);
        }
        if ((aucnVar.b & 2) != 0) {
            apxf apxfVar = aucnVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)) {
                apxf apxfVar2 = aucnVar.c;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar2.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
            }
            this.ao = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
        }
    }

    public final void s() {
        boolean z = this.aE.b() != 1;
        this.aA.setEnabled(z);
        this.aA.setAlpha(z ? this.aF : this.aG);
    }
}

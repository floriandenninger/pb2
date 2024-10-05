package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eru extends erv implements wds, ypd {
    private ImageView aA;
    private TextView aB;
    private ImageView aC;
    private TextView aD;
    private TextView aE;
    private ImageView aF;
    private ImageView aG;
    private ImageView aH;
    private View aI;
    private View aJ;
    private View aK;
    private View aL;
    private View aM;
    private boolean aN;
    private boolean aO;
    public ajjz ae;
    public wdt af;
    public eqg ag;
    public aahd ah;
    public akgl ai;
    public Executor aj;
    public azrw ak;
    public LoadingFrameLayout al;
    public TextView am;
    public ic an;
    public int ao;
    private View aw;
    private ImageView ax;
    private TextView ay;
    private TextView az;
    public afsy b;
    public ypa c;
    public zaw d;
    public aaux e;
    public ammv a = amlr.a;
    private final ero aP = new ero(this);

    private static ammv bg(ammv ammvVar, final ammy ammyVar) {
        ammyVar.getClass();
        return ((Boolean) ammvVar.b(new amml() { // from class: erg
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return Boolean.valueOf(ammy.this.a(obj));
            }
        }).e(false)).booleanValue() ? ammvVar : amlr.a;
    }

    private static ammv bh(ammv ammvVar) {
        return bg(ammvVar, eri.d).b(ens.e);
    }

    private static ammv bi(ammv ammvVar) {
        return bg(ammvVar, eri.e).b(ens.f);
    }

    private static ammv bj(ammv ammvVar) {
        return bg(ammvVar, eri.f).b(ens.g);
    }

    private final void bk(ammv ammvVar, ImageView imageView, View view, final int i) {
        final ammv b = bg(ammvVar, eri.i).b(ens.j);
        if (b.h()) {
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: erj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    eru eruVar = eru.this;
                    int i2 = i;
                    ammv ammvVar2 = b;
                    eruVar.ao = i2;
                    eruVar.ah.a((apxf) ammvVar2.c());
                }
            });
        } else {
            view.setVisibility(4);
        }
        ammv b2 = bg(ammvVar, eri.j).b(ens.k);
        if (b2.h()) {
            bl(i);
            ajjz ajjzVar = this.ae;
            avgg avggVar = (avgg) b2.c();
            ajju a = ajjv.a();
            a.c = new err(this, i);
            ajjzVar.k(imageView, avggVar, a.a());
            return;
        }
        p(i);
        aH(imageView, i);
    }

    private final void bl(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i == 1) {
            view = this.aI;
            view2 = this.aK;
            imageView = this.aG;
            z = this.aN;
        } else {
            view = this.aJ;
            view2 = this.aL;
            imageView = this.aH;
            z = this.aO;
        }
        view.setVisibility(4);
        view2.setVisibility(0);
        if (z) {
            imageView.setColorFilter(-1291845632, PorterDuff.Mode.DARKEN);
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        whu.C(this.O.findFocus());
    }

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        super.Z();
        if (this.b.t()) {
            return;
        }
        this.at.c(false);
    }

    public final void aF(final aprn aprnVar) {
        aqyg aqygVar;
        this.aD.setText(aprnVar.c);
        TextView textView = this.aE;
        if ((aprnVar.b & 4) != 0) {
            aqygVar = aprnVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        this.aF.setOnClickListener(new View.OnClickListener() { // from class: ern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eru eruVar = eru.this;
                aprn aprnVar2 = aprnVar;
                aahd aahdVar = eruVar.ah;
                apxf apxfVar = aprnVar2.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
    }

    public final void aG(AlertDialog alertDialog) {
        alertDialog.show();
        alertDialog.getWindow().setLayout((int) this.ap.getResources().getDimension(R.dimen.channel_edit_dialog_width), -2);
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
            final amsv i = amsx.i();
            amxd listIterator = this.as.a.c.listIterator();
            while (listIterator.hasNext()) {
                fze fzeVar = (fze) listIterator.next();
                if (fzeVar.g() != R.id.menu_watch_on_tv) {
                    i.c(fzeVar);
                }
            }
            gac a = this.as.a();
            a.m(new amml() { // from class: erf
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    eru eruVar = eru.this;
                    amsv amsvVar = i;
                    fzf fzfVar = (fzf) obj;
                    fzfVar.a = eruVar.qX().getString(R.string.channel_settings);
                    fzfVar.d(amsvVar.g());
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
        this.c.m(this);
        this.af.k(this);
        this.ag.c(this.aP);
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        if (this.a.h()) {
            bundle.putByteArray("arg_channel_profile_editor_renderer", ((aprk) this.a.c()).toByteArray());
        }
        bundle.putInt("arg_image_type_update", this.ao);
        bundle.putBoolean("arg_has_profile_picture_endpoint", this.aN);
        bundle.putBoolean("arg_has_channel_banner_endpoint", this.aO);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.an = new erp();
        this.ao = 0;
        if (bundle != null) {
            this.ao = bundle.getInt("arg_image_type_update", 0);
            this.aN = bundle.getBoolean("arg_has_profile_picture_endpoint");
            this.aO = bundle.getBoolean("arg_has_channel_banner_endpoint");
            if (bundle.containsKey("arg_channel_profile_editor_renderer")) {
                try {
                    this.a = ammv.j((aprk) aonm.parseFrom(aprk.a, bundle.getByteArray("arg_channel_profile_editor_renderer"), aomw.b()));
                } catch (aoob unused) {
                }
            }
        }
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        if (!this.b.t()) {
            this.at.c(false);
            return;
        }
        this.c.g(this);
        this.af.j(this);
        this.ag.b(this.aP);
        wcy.c(this, this.af.a());
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.channel_profile_editor_fragment, viewGroup, false);
        this.al = loadingFrameLayout;
        this.aw = loadingFrameLayout.findViewById(R.id.add_description);
        this.ax = (ImageView) this.al.findViewById(R.id.add_description_button);
        this.ay = (TextView) this.al.findViewById(R.id.description_preview_title);
        this.az = (TextView) this.al.findViewById(R.id.description_preview_text);
        this.aA = (ImageView) this.al.findViewById(R.id.description_edit_button);
        this.aB = (TextView) this.al.findViewById(R.id.name_preview_title);
        this.am = (TextView) this.al.findViewById(R.id.name_preview_text);
        this.aC = (ImageView) this.al.findViewById(R.id.name_edit_button);
        this.aD = (TextView) this.al.findViewById(R.id.handle_preview_title);
        this.aE = (TextView) this.al.findViewById(R.id.handle_preview_text);
        this.aF = (ImageView) this.al.findViewById(R.id.handle_edit_button);
        this.aG = (ImageView) this.al.findViewById(R.id.profile_picture);
        this.aI = this.al.findViewById(R.id.profile_picture_camera_icon);
        this.aK = this.al.findViewById(R.id.profile_picture_progress_bar);
        this.aH = (ImageView) this.al.findViewById(R.id.channel_banner_image);
        this.aJ = this.al.findViewById(R.id.channel_banner_camera_icon);
        this.aL = this.al.findViewById(R.id.channel_banner_progress_bar);
        this.aM = this.al.findViewById(R.id.separator);
        this.al.f(new akdd() { // from class: ere
            @Override // defpackage.akdd
            public final void qJ() {
                eru eruVar = eru.this;
                eruVar.al.c();
                eruVar.n();
            }
        });
        if (this.a.h()) {
            s();
            this.al.a();
        } else {
            this.al.c();
            n();
        }
        return this.al;
    }

    public final void n() {
        aaux aauxVar = this.e;
        aauv aauvVar = new aauv(aauxVar.f, aauxVar.a, null, null, null);
        aaux aauxVar2 = this.e;
        Executor executor = this.aj;
        if (aauxVar2.g == null) {
            aauxVar2.g = new aauw(aauxVar2.b, aauxVar2.e);
        }
        ynm.n(this, aauxVar2.g.g(aauvVar, executor), new erc(this, 0), new erc(this, 1));
    }

    public final void p(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i == 1) {
            view = this.aI;
            view2 = this.aK;
            imageView = this.aG;
            z = this.aN;
        } else {
            view = this.aJ;
            view2 = this.aL;
            imageView = this.aH;
            z = this.aO;
        }
        view2.setVisibility(4);
        if (this.af.a() == 1) {
            view.setVisibility(4);
        } else if (z) {
            imageView.setColorFilter(1291845632, PorterDuff.Mode.DARKEN);
            view.setVisibility(0);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            view.setVisibility(4);
        }
    }

    @Override // defpackage.wds
    public final /* synthetic */ void q(int i) {
        wcy.c(this, i);
    }

    @Override // defpackage.wds
    public final void r(int i, String str, Uri uri) {
        if (i == 1) {
            this.aI.setVisibility(4);
            this.aK.setVisibility(4);
            this.aJ.setVisibility(4);
            this.aL.setVisibility(4);
            bl(this.ao);
            return;
        }
        if (i == 2) {
            n();
        } else {
            p(1);
            p(2);
        }
    }

    public final void s() {
        aqyg aqygVar;
        aprw aprwVar;
        ammv b = bg(this.a, eri.g).b(ens.h);
        ammv b2 = bg(this.a, eri.h).b(ens.i);
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (b.h() || b2.h()) {
            this.aN = ((Boolean) b.b(ens.l).e(false)).booleanValue();
            bk(b, this.aG, this.aI, 1);
            this.aO = (((aprl) b2.e(aprl.a)).b & 2) != 0;
            bk(b2, this.aH, this.aJ, 2);
        } else {
            this.al.findViewById(R.id.channel_image_view).setVisibility(8);
        }
        if (bj(this.a).h()) {
            this.aB.setVisibility(0);
            this.am.setVisibility(0);
            this.aC.setVisibility(0);
            aprn aprnVar = (aprn) bj(this.a).c();
            this.aB.setText(aprnVar.c);
            TextView textView = this.am;
            if ((aprnVar.b & 4) != 0) {
                aqygVar = aprnVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            apxf apxfVar = aprnVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            apru apruVar = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apxfVar.pX(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
            if (apruVar == null) {
                apruVar = apru.a;
            }
            if (apruVar.b != 105915641) {
                this.aC.setVisibility(8);
            } else {
                this.aC.setVisibility(0);
                final View inflate = LayoutInflater.from(this.ap).inflate(R.layout.channel_profile_name_editor, (ViewGroup) null);
                final AlertDialog create = new AlertDialog.Builder(this.ap).setView(inflate).setPositiveButton(this.ap.getString(android.R.string.ok), (DialogInterface.OnClickListener) null).setNegativeButton(this.ap.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).create();
                this.aC.setOnClickListener(new View.OnClickListener(this) { // from class: erk
                    public final /* synthetic */ eru a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i;
                        if (i4 == 0) {
                            this.a.aG(create);
                        } else if (i4 != 1) {
                            this.a.aG(create);
                        } else {
                            this.a.aG(create);
                        }
                    }
                });
                apxf apxfVar2 = aprnVar.e;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                apru apruVar2 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apxfVar2.pX(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
                if (apruVar2 == null) {
                    apruVar2 = apru.a;
                }
                if (apruVar2.b == 105915641) {
                    aprwVar = (aprw) apruVar2.c;
                } else {
                    aprwVar = aprw.a;
                }
                final aone builder = aprwVar.toBuilder();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: eqz
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        aqxu aqxuVar;
                        final aone aoneVar;
                        TextView textView2;
                        aqyg aqygVar2;
                        aqyg aqygVar3;
                        aqxu aqxuVar2;
                        final eru eruVar = eru.this;
                        View view = inflate;
                        final aone aoneVar2 = builder;
                        final AlertDialog alertDialog = (AlertDialog) dialogInterface;
                        final TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.given_name_edit_layout);
                        aprt aprtVar = ((aprw) aoneVar2.instance).c;
                        if (aprtVar == null) {
                            aprtVar = aprt.a;
                        }
                        if (aprtVar.b == 91739437) {
                            aqxuVar = (aqxu) aprtVar.c;
                        } else {
                            aqxuVar = aqxu.a;
                        }
                        final aone builder2 = aqxuVar.toBuilder();
                        aqyg aqygVar4 = ((aqxu) builder2.instance).c;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                        textInputLayout.B(ajcq.b(aqygVar4));
                        textInputLayout.w(false);
                        jw.M(textInputLayout, eruVar.an);
                        final EditText editText = (EditText) view.findViewById(R.id.given_name_edit);
                        editText.setText(((aqxu) builder2.instance).d);
                        editText.setSelection(0, ((aqxu) builder2.instance).d.length());
                        if ((((aprw) aoneVar2.instance).b & 2) == 0 && (((aqxu) builder2.instance).b & 8) != 0) {
                            textInputLayout.k(true);
                            textInputLayout.l(((aqxu) builder2.instance).e);
                        }
                        whu.J(editText);
                        final TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.family_name_edit_layout);
                        final EditText editText2 = (EditText) view.findViewById(R.id.family_name_edit);
                        aprw aprwVar2 = (aprw) aoneVar2.instance;
                        if ((aprwVar2.b & 2) != 0) {
                            aprt aprtVar2 = aprwVar2.d;
                            if (aprtVar2 == null) {
                                aprtVar2 = aprt.a;
                            }
                            if (aprtVar2.b == 91739437) {
                                aqxuVar2 = (aqxu) aprtVar2.c;
                            } else {
                                aqxuVar2 = aqxu.a;
                            }
                            aoneVar = aqxuVar2.toBuilder();
                        } else {
                            aoneVar = null;
                        }
                        if (aoneVar != null) {
                            aqyg aqygVar5 = ((aqxu) aoneVar.instance).c;
                            if (aqygVar5 == null) {
                                aqygVar5 = aqyg.a;
                            }
                            textInputLayout2.B(ajcq.b(aqygVar5));
                            textInputLayout2.w(false);
                            jw.M(textInputLayout2, eruVar.an);
                            editText2.setText(((aqxu) aoneVar.instance).d);
                            textInputLayout2.setVisibility(0);
                        } else {
                            textInputLayout2.setVisibility(8);
                        }
                        if ((8 & ((aprw) aoneVar2.instance).b) != 0 && (textView2 = (TextView) view.findViewById(R.id.name_edit_limit_hint)) != null) {
                            aprr aprrVar = ((aprw) aoneVar2.instance).e;
                            if (aprrVar == null) {
                                aprrVar = aprr.a;
                            }
                            int i4 = aprrVar.b;
                            if (i4 == 141083272) {
                                aprq aprqVar = (aprq) aprrVar.c;
                                if ((aprqVar.b & 1) != 0) {
                                    aqygVar3 = aprqVar.c;
                                    aqygVar2 = aqygVar3 == null ? aqyg.a : null;
                                    textView2.setText(aahk.a(aqygVar3, eruVar.ah, false));
                                    textView2.setVisibility(0);
                                }
                                aqygVar3 = aqygVar2;
                                textView2.setText(aahk.a(aqygVar3, eruVar.ah, false));
                                textView2.setVisibility(0);
                            } else if (i4 == 356957023) {
                                aprp aprpVar = (aprp) aprrVar.c;
                                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.name_edit_info_box);
                                linearLayout.removeAllViews();
                                for (aprx aprxVar : aprpVar.b) {
                                    if ((aprxVar.b & 2) != 0) {
                                        etp etpVar = (etp) eruVar.ak.get();
                                        new ajok();
                                        etpVar.d(aprxVar);
                                        linearLayout.addView(etpVar.a);
                                    }
                                }
                                linearLayout.setVisibility(0);
                            }
                        }
                        alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: erm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                eru eruVar2 = eru.this;
                                TextInputLayout textInputLayout3 = textInputLayout;
                                EditText editText3 = editText;
                                TextInputLayout textInputLayout4 = textInputLayout2;
                                aone aoneVar3 = aoneVar;
                                EditText editText4 = editText2;
                                aone aoneVar4 = builder2;
                                aone aoneVar5 = aoneVar2;
                                AlertDialog alertDialog2 = alertDialog;
                                textInputLayout3.v(null);
                                textInputLayout3.w(false);
                                String obj = editText3.getText().toString();
                                textInputLayout4.v(null);
                                textInputLayout4.w(false);
                                String obj2 = aoneVar3 != null ? editText4.getText().toString() : null;
                                final erq erqVar = new erq(eruVar2, aoneVar4, obj, aoneVar5, aoneVar3, obj2, alertDialog2, textInputLayout3, textInputLayout4);
                                aaux aauxVar = eruVar2.e;
                                aaut aautVar = new aaut(aauxVar.f, aauxVar.a, null, null, null);
                                aautVar.a = obj;
                                if (obj2 != null) {
                                    aautVar.b = obj2;
                                }
                                aaux aauxVar2 = eruVar2.e;
                                Executor executor = eruVar2.aj;
                                if (aauxVar2.h == null) {
                                    aauxVar2.h = new aauu(aauxVar2.b, aauxVar2.e);
                                }
                                ynm.n(eruVar2, aauxVar2.h.b(aautVar, executor), new zfi() { // from class: erb
                                    @Override // defpackage.zfi
                                    public final void a(Object obj3) {
                                        erq.this.a(1, ((Throwable) obj3).toString());
                                    }
                                }, new zfi() { // from class: era
                                    @Override // defpackage.zfi
                                    public final void a(Object obj3) {
                                        avhn avhnVar;
                                        aqxs aqxsVar;
                                        erq erqVar2 = erq.this;
                                        arko arkoVar = (arko) obj3;
                                        String str = null;
                                        if ((arkoVar.b & 2) != 0) {
                                            arkk arkkVar = arkoVar.d;
                                            if (arkkVar == null) {
                                                arkkVar = arkk.a;
                                            }
                                            if (arkkVar.b == 85492347) {
                                                arkk arkkVar2 = arkoVar.d;
                                                if (arkkVar2 == null) {
                                                    arkkVar2 = arkk.a;
                                                }
                                                if (arkkVar2.b == 85492347) {
                                                    aqxsVar = (aqxs) arkkVar2.c;
                                                } else {
                                                    aqxsVar = aqxs.a;
                                                }
                                                aqyg aqygVar6 = aqxsVar.b;
                                                if (aqygVar6 == null) {
                                                    aqygVar6 = aqyg.a;
                                                }
                                                str = ajcq.b(aqygVar6).toString();
                                            } else {
                                                arkk arkkVar3 = arkoVar.d;
                                                if (arkkVar3 == null) {
                                                    arkkVar3 = arkk.a;
                                                }
                                                if (arkkVar3.b == 91854672) {
                                                    arkk arkkVar4 = arkoVar.d;
                                                    if (arkkVar4 == null) {
                                                        arkkVar4 = arkk.a;
                                                    }
                                                    if (arkkVar4.b == 91854672) {
                                                        avhnVar = (avhn) arkkVar4.c;
                                                    } else {
                                                        avhnVar = avhn.a;
                                                    }
                                                    str = avhnVar.b;
                                                }
                                            }
                                        }
                                        if (str == null) {
                                            erqVar2.f.am.setText(arkoVar.f);
                                            aone aoneVar6 = erqVar2.g;
                                            String str2 = erqVar2.a;
                                            aoneVar6.copyOnWrite();
                                            aqxu aqxuVar3 = (aqxu) aoneVar6.instance;
                                            aqxu aqxuVar4 = aqxu.a;
                                            str2.getClass();
                                            aqxuVar3.b |= 2;
                                            aqxuVar3.d = str2;
                                            aone aoneVar7 = erqVar2.h;
                                            aone createBuilder = aprt.a.createBuilder();
                                            aqxu aqxuVar5 = (aqxu) erqVar2.g.build();
                                            createBuilder.copyOnWrite();
                                            aprt aprtVar3 = (aprt) createBuilder.instance;
                                            aqxuVar5.getClass();
                                            aprtVar3.c = aqxuVar5;
                                            aprtVar3.b = 91739437;
                                            aoneVar7.copyOnWrite();
                                            aprw aprwVar3 = (aprw) aoneVar7.instance;
                                            aprt aprtVar4 = (aprt) createBuilder.build();
                                            aprw aprwVar4 = aprw.a;
                                            aprtVar4.getClass();
                                            aprwVar3.c = aprtVar4;
                                            aprwVar3.b = 1 | aprwVar3.b;
                                            aone aoneVar8 = erqVar2.i;
                                            if (aoneVar8 != null) {
                                                String str3 = erqVar2.b;
                                                aoneVar8.copyOnWrite();
                                                aqxu aqxuVar6 = (aqxu) aoneVar8.instance;
                                                str3.getClass();
                                                aqxuVar6.b |= 2;
                                                aqxuVar6.d = str3;
                                                aone aoneVar9 = erqVar2.h;
                                                aone createBuilder2 = aprt.a.createBuilder();
                                                aqxu aqxuVar7 = (aqxu) erqVar2.i.build();
                                                createBuilder2.copyOnWrite();
                                                aprt aprtVar5 = (aprt) createBuilder2.instance;
                                                aqxuVar7.getClass();
                                                aprtVar5.c = aqxuVar7;
                                                aprtVar5.b = 91739437;
                                                aoneVar9.copyOnWrite();
                                                aprw aprwVar5 = (aprw) aoneVar9.instance;
                                                aprt aprtVar6 = (aprt) createBuilder2.build();
                                                aprtVar6.getClass();
                                                aprwVar5.d = aprtVar6;
                                                aprwVar5.b |= 2;
                                            }
                                            aone aoneVar10 = erqVar2.h;
                                            aprr aprrVar2 = arkoVar.g;
                                            if (aprrVar2 == null) {
                                                aprrVar2 = aprr.a;
                                            }
                                            aoneVar10.copyOnWrite();
                                            aprw aprwVar6 = (aprw) aoneVar10.instance;
                                            aprrVar2.getClass();
                                            aprwVar6.e = aprrVar2;
                                            aprwVar6.b |= 8;
                                            erqVar2.c.dismiss();
                                            return;
                                        }
                                        int dH = amkq.dH(arkoVar.e);
                                        erqVar2.a(dH != 0 ? dH : 1, str);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        } else {
            this.aB.setVisibility(8);
            this.am.setVisibility(8);
            this.aC.setVisibility(8);
        }
        if (bi(this.a).h()) {
            this.aD.setVisibility(0);
            this.aE.setVisibility(0);
            this.aF.setVisibility(0);
            aF((aprn) bi(this.a).c());
        } else {
            this.aD.setVisibility(8);
            this.aE.setVisibility(8);
            this.aF.setVisibility(8);
        }
        if (bh(this.a).h()) {
            final aprn aprnVar2 = (aprn) bh(this.a).c();
            apxf apxfVar3 = aprnVar2.e;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            apru apruVar3 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apxfVar3.pX(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
            if (apruVar3 == null) {
                apruVar3 = apru.a;
            }
            int i4 = apruVar3.b;
            if ((aprnVar2.b & 4) == 0) {
                this.ay.setVisibility(8);
                this.az.setVisibility(8);
                this.aA.setVisibility(8);
                this.aw.setVisibility(i4 != 105915776 ? 8 : 0);
            } else {
                this.aw.setVisibility(8);
                this.ay.setText(aprnVar2.c);
                this.ay.setVisibility(0);
                TextView textView2 = this.az;
                aqyg aqygVar2 = aprnVar2.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                textView2.setText(ajcq.b(aqygVar2));
                this.az.setVisibility(0);
                this.aA.setVisibility(i4 != 105915776 ? 8 : 0);
            }
            final View inflate2 = LayoutInflater.from(this.ap).inflate(R.layout.channel_profile_description_editor, (ViewGroup) null);
            final AlertDialog create2 = new AlertDialog.Builder(this.ap).setView(inflate2).setPositiveButton(this.ap.getString(android.R.string.ok), (DialogInterface.OnClickListener) null).setNegativeButton(this.ap.getString(android.R.string.cancel), (DialogInterface.OnClickListener) null).create();
            this.ax.setOnClickListener(new View.OnClickListener(this) { // from class: erk
                public final /* synthetic */ eru a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i2;
                    if (i42 == 0) {
                        this.a.aG(create2);
                    } else if (i42 != 1) {
                        this.a.aG(create2);
                    } else {
                        this.a.aG(create2);
                    }
                }
            });
            this.aA.setOnClickListener(new View.OnClickListener(this) { // from class: erk
                public final /* synthetic */ eru a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i3;
                    if (i42 == 0) {
                        this.a.aG(create2);
                    } else if (i42 != 1) {
                        this.a.aG(create2);
                    } else {
                        this.a.aG(create2);
                    }
                }
            });
            create2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: erh
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    aprs aprsVar;
                    aqxu aqxuVar;
                    final eru eruVar = eru.this;
                    aprn aprnVar3 = aprnVar2;
                    View view = inflate2;
                    apxf apxfVar4 = aprnVar3.e;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    apru apruVar4 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apxfVar4.pX(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
                    if (apruVar4 == null) {
                        apruVar4 = apru.a;
                    }
                    if (apruVar4.b == 105915776) {
                        aprsVar = (aprs) apruVar4.c;
                    } else {
                        aprsVar = aprs.a;
                    }
                    aprt aprtVar = aprsVar.b;
                    if (aprtVar == null) {
                        aprtVar = aprt.a;
                    }
                    if (aprtVar.b == 91739437) {
                        aqxuVar = (aqxu) aprtVar.c;
                    } else {
                        aqxuVar = aqxu.a;
                    }
                    TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.description_edit_layout);
                    aqyg aqygVar3 = aqxuVar.c;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    textInputLayout.B(ajcq.b(aqygVar3));
                    textInputLayout.k(true);
                    textInputLayout.l(aqxuVar.e);
                    jw.M(textInputLayout, eruVar.an);
                    final EditText editText = (EditText) view.findViewById(R.id.description_edit);
                    editText.setText(aqxuVar.d);
                    editText.setSelection(0, aqxuVar.d.length());
                    whu.J(editText);
                    final AlertDialog alertDialog = (AlertDialog) dialogInterface;
                    alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: erl
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final eru eruVar2 = eru.this;
                            EditText editText2 = editText;
                            final AlertDialog alertDialog2 = alertDialog;
                            aaux aauxVar = eruVar2.e;
                            aaur aaurVar = new aaur(aauxVar.f, aauxVar.a, null, null, null);
                            aaurVar.a = editText2.getText().toString();
                            aaux aauxVar2 = eruVar2.e;
                            Executor executor = eruVar2.aj;
                            if (aauxVar2.i == null) {
                                aauxVar2.i = new aaus(aauxVar2.b, aauxVar2.e);
                            }
                            ynm.n(eruVar2, aauxVar2.i.b(aaurVar, executor), new erc(eruVar2, 2), new zfi() { // from class: erd
                                @Override // defpackage.zfi
                                public final void a(Object obj) {
                                    aqxs aqxsVar;
                                    eru eruVar3 = eru.this;
                                    AlertDialog alertDialog3 = alertDialog2;
                                    arki arkiVar = (arki) obj;
                                    arkj arkjVar = arkiVar.c;
                                    if (arkjVar == null) {
                                        arkjVar = arkj.a;
                                    }
                                    if (arkjVar.b != 85492347) {
                                        eruVar3.n();
                                        alertDialog3.dismiss();
                                        return;
                                    }
                                    zaw zawVar = eruVar3.d;
                                    arkj arkjVar2 = arkiVar.c;
                                    if (arkjVar2 == null) {
                                        arkjVar2 = arkj.a;
                                    }
                                    if (arkjVar2.b == 85492347) {
                                        aqxsVar = (aqxs) arkjVar2.c;
                                    } else {
                                        aqxsVar = aqxs.a;
                                    }
                                    aqyg aqygVar4 = aqxsVar.b;
                                    if (aqygVar4 == null) {
                                        aqygVar4 = aqyg.a;
                                    }
                                    zawVar.d(ajcq.b(aqygVar4).toString());
                                }
                            });
                        }
                    });
                }
            });
        } else {
            this.ay.setVisibility(8);
            this.az.setVisibility(8);
            this.aA.setVisibility(8);
            this.aw.setVisibility(8);
        }
        if (bj(this.a).h() || bi(this.a).h() || bh(this.a).h()) {
            this.aM.setVisibility(0);
        } else {
            this.aM.setVisibility(8);
        }
        ((TextView) this.al.findViewById(R.id.privacy_settings_title)).setText(ajcq.b((aqyg) bg(this.a, eri.c).b(ens.d).f()));
        LinearLayout linearLayout = (LinearLayout) this.al.findViewById(R.id.privacy_settings);
        linearLayout.removeAllViews();
        ert ertVar = new ert(this.ap, this.ah, ((aprk) this.a.e(aprk.a)).i, this.ai);
        int count = ertVar.getCount();
        for (int i5 = 0; i5 < count; i5++) {
            linearLayout.addView(ertVar.getView(i5, null, linearLayout));
        }
        whu.G((TextView) this.al.findViewById(R.id.disclaimer_text), aahk.a((aqyg) bg(this.a, eri.a).b(ens.c).f(), this.ah, false));
    }

    public static final void aH(ImageView imageView, int i) {
        if (i == 1) {
            imageView.setBackground(null);
            imageView.setImageResource(R.drawable.missing_avatar);
        } else {
            imageView.setImageDrawable(null);
            imageView.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
        }
    }
}

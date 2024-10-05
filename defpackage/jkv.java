package defpackage;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.youtube.offline.ui.OfflineDialogOptionView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkv implements agzk, agys {
    private AlertDialog A;
    private AlertDialog B;
    private AlertDialog C;
    private AlertDialog D;
    private AlertDialog E;
    private AlertDialog F;
    private AlertDialog G;
    public final ci a;
    public final agsg b;
    public final fka c;
    public final akcy d;
    public AlertDialog e;
    AlertDialog f;
    CheckBox g;
    View h;
    ListView i;
    public agzh j;
    public agzo k;
    public agzm l;
    public agzm m;
    public agzm n;
    public agzn o;
    public agzn p;
    public agzm q;
    public agxm r;
    public agxm s;
    private final agzf t;
    private final aahd u;
    private final azrw v;
    private final azrw w;
    private final agyq x;
    private final fjs y;
    private AlertDialog z;

    public jkv(ci ciVar, agzf agzfVar, agsg agsgVar, aahd aahdVar, fka fkaVar, azrw azrwVar, azrw azrwVar2, agyq agyqVar, akcy akcyVar, fjs fjsVar) {
        this.a = ciVar;
        this.t = agzfVar;
        this.b = agsgVar;
        this.u = aahdVar;
        this.c = fkaVar;
        this.v = azrwVar;
        this.w = azrwVar2;
        this.x = agyqVar;
        this.d = akcyVar;
        this.y = fjsVar;
    }

    public static final void t(atsb atsbVar, acra acraVar) {
        if (acraVar == null) {
            return;
        }
        acraVar.n(new acqx(acrb.DOWNLOAD_QUALITY_SELECTION_DIALOG));
        ahbj.l(atsbVar, acraVar);
    }

    private final AlertDialog v(int i, int i2, agzm agzmVar, Integer num, int i3) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(this.a).setTitle(i).setMessage(i2).setCancelable(true).setPositiveButton(i3, new jkp(agzmVar, 0));
        positiveButton.setNegativeButton(num.intValue(), (DialogInterface.OnClickListener) null);
        return positiveButton.create();
    }

    private final void w(String str, atsb atsbVar, acra acraVar, agzo agzoVar, int i) {
        agzoVar.getClass();
        this.k = agzoVar;
        agzf agzfVar = this.t;
        Map d = agnc.d(atsbVar);
        amru s = agzfVar.a.s();
        ArrayList arrayList = new ArrayList();
        for (atrx atrxVar : d.keySet()) {
            if (s.contains(atrxVar)) {
                arrayList.add((agnc) d.get(atrxVar));
            }
        }
        Collections.sort(arrayList, agzfVar.a.f());
        boolean n = this.b.n();
        if (arrayList.isEmpty()) {
            return;
        }
        if (ammx.e(str) || !n) {
            c(i, arrayList);
            f(atsbVar);
            t(atsbVar, acraVar);
            return;
        }
        agnv e = ((agof) this.v.get()).a().m().e(str);
        boolean z = e != null && e.s();
        boolean g = this.y.g(fhe.v(str));
        if ((!z && !g) || ((ysy) this.w.get()).o()) {
            final agzf agzfVar2 = this.t;
            final ci ciVar = this.a;
            final jks jksVar = new jks(this, i, atsbVar, acraVar, arrayList);
            atph atphVar = agzfVar2.e.a().g;
            if (atphVar == null) {
                atphVar = atph.a;
            }
            if (atphVar.G) {
                agzfVar2.b(ciVar, atsbVar, str, agnc.a(arrayList), new agzb(jksVar));
                return;
            }
            yjk.f();
            final ProgressDialog progressDialog = new ProgressDialog(ciVar);
            progressDialog.setMessage(ciVar.getString(R.string.offline_stream_selection_waiting));
            progressDialog.setCancelable(false);
            progressDialog.setIndeterminate(true);
            progressDialog.show();
            Collections.sort(arrayList, ahab.c);
            final agzd agzdVar = new agzd(atsbVar.i.I(), str, arrayList);
            final byte[] bArr = null;
            ynm.l(agzfVar2.d.submit(new Callable(ciVar, agzdVar, bArr) { // from class: agyz
                public final /* synthetic */ Context b;
                public final /* synthetic */ agzd c;

                /* JADX WARN: Removed duplicated region for block: B:31:0x0104 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0035 A[SYNTHETIC] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 353
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.agyz.call():java.lang.Object");
                }
            }), agzfVar2.c, new ynk(progressDialog, jksVar, agzdVar, bArr) { // from class: agyt
                public final /* synthetic */ ProgressDialog a;
                public final /* synthetic */ ykl b;
                public final /* synthetic */ agzd c;

                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    ProgressDialog progressDialog2 = this.a;
                    ykl yklVar = this.b;
                    agzd agzdVar2 = this.c;
                    if (progressDialog2.isShowing()) {
                        progressDialog2.dismiss();
                    }
                    if (th instanceof Exception) {
                        yklVar.a(agzdVar2, (Exception) th);
                    } else {
                        yklVar.a(agzdVar2, new RuntimeException(th));
                    }
                }
            }, new ynl(progressDialog, jksVar, agzdVar, bArr) { // from class: agyv
                public final /* synthetic */ ProgressDialog a;
                public final /* synthetic */ ykl b;
                public final /* synthetic */ agzd c;

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    ProgressDialog progressDialog2 = this.a;
                    ykl yklVar = this.b;
                    agzd agzdVar2 = this.c;
                    agze agzeVar = (agze) obj;
                    if (progressDialog2.isShowing()) {
                        progressDialog2.dismiss();
                    }
                    agzc agzcVar = agzeVar.c;
                    if (agzcVar == null) {
                        if (agzeVar.a.isEmpty()) {
                            yklVar.a(agzdVar2, new agzc(null, false, null));
                            return;
                        } else {
                            yklVar.b(agzdVar2, agzeVar);
                            return;
                        }
                    }
                    yklVar.a(agzdVar2, agzcVar);
                }
            }, new Runnable(progressDialog, jksVar, agzdVar, bArr) { // from class: agyx
                public final /* synthetic */ ProgressDialog a;
                public final /* synthetic */ ykl b;
                public final /* synthetic */ agzd c;

                @Override // java.lang.Runnable
                public final void run() {
                    ProgressDialog progressDialog2 = this.a;
                    ykl yklVar = this.b;
                    agzd agzdVar2 = this.c;
                    if (progressDialog2.isShowing()) {
                        progressDialog2.dismiss();
                    }
                    yklVar.a(agzdVar2, new CancellationException());
                }
            });
            return;
        }
        c(i, arrayList);
        f(atsbVar);
        t(atsbVar, acraVar);
    }

    private final AlertDialog x(psy[] psyVarArr, DialogInterface.OnClickListener onClickListener) {
        return new AlertDialog.Builder(this.a).setTitle(R.string.offline_fragment_title).setCancelable(true).setAdapter(new jkq(this, this.a, psyVarArr, psyVarArr, null, null), onClickListener).create();
    }

    public final void c(int i, List list) {
        final int i2 = 0;
        if (this.f == null) {
            LayoutInflater from = LayoutInflater.from(this.a);
            View inflate = from.inflate(R.layout.offline_stream_selection_dialog, (ViewGroup) null, false);
            ListView listView = (ListView) inflate.findViewById(R.id.offline_stream_selection_list);
            this.i = listView;
            View inflate2 = from.inflate(R.layout.offline_stream_selection_footer, (ViewGroup) listView, false);
            this.i.addFooterView(inflate2);
            agzh agzhVar = new agzh(this.a, this.i);
            this.j = agzhVar;
            this.i.setAdapter((ListAdapter) agzhVar);
            this.h = inflate2.findViewById(R.id.offline_stream_selection_group_bottom_separator);
            this.g = (CheckBox) inflate2.findViewById(R.id.remember_stream_setting);
            this.f = new AlertDialog.Builder(this.a).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate).create();
        }
        this.f.getClass();
        this.g.getClass();
        this.h.getClass();
        this.i.getClass();
        this.j.getClass();
        if (!list.isEmpty()) {
            agzh agzhVar2 = this.j;
            agzhVar2.setNotifyOnChange(false);
            agzhVar2.clear();
            agzhVar2.addAll(list);
            agzhVar2.notifyDataSetChanged();
            ListView listView2 = agzhVar2.b;
            if (listView2 != null) {
                listView2.clearChoices();
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((agnc) it.next()).a == atrx.HD_1080) {
                if (!((fkg) this.c.a.c()).e) {
                    this.f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jkl
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            jkv jkvVar = jkv.this;
                            ynm.m(jkvVar.c.a.b(new ens(20)), gwr.o);
                            if (jkvVar.c.f()) {
                                return;
                            }
                            jkvVar.j.getClass();
                            jkvVar.i.getClass();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= jkvVar.j.getCount()) {
                                    i3 = -1;
                                    break;
                                }
                                agnc agncVar = (agnc) jkvVar.j.getItem(i3);
                                if (agncVar != null && agncVar.a == atrx.HD_1080) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            View view = null;
                            if (i3 >= 0) {
                                ListView listView3 = jkvVar.i;
                                View childAt = listView3.getChildAt(i3 - listView3.getFirstVisiblePosition());
                                if (childAt instanceof OfflineDialogOptionView) {
                                    view = childAt.findViewById(R.id.radio_button);
                                }
                            }
                            if (view != null) {
                                akcy akcyVar = jkvVar.d;
                                ListView listView4 = jkvVar.i;
                                listView4.getClass();
                                akcyVar.g(listView4);
                                akci a = akcj.a();
                                a.a = view;
                                a.c = jkvVar.a.getString(R.string.offline_new_quality_setting_tooltip_text);
                                a.i(1);
                                a.c(1);
                                a.f = new jkr(jkvVar);
                                a.l();
                                a.g(0);
                                jkvVar.d.c(a.a());
                            }
                        }
                    });
                }
            }
        }
        this.f.setOnShowListener(null);
        this.g.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setTitle(i);
        agzh agzhVar3 = this.j;
        atrx atrxVar = ((agnc) list.get(0)).a;
        final int i3 = 1;
        if (agzhVar3.b != null) {
            int count = agzhVar3.getCount();
            int i4 = 0;
            while (true) {
                if (i4 < count) {
                    agnc agncVar = (agnc) agzhVar3.getItem(i4);
                    if (agncVar != null && agncVar.a == atrxVar) {
                        agzhVar3.b.setItemChecked(i4, true);
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        ynm.n(this.a, this.c.a(), new zfi(this) { // from class: jko
            public final /* synthetic */ jkv a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                boolean z = false;
                if (i3 == 0) {
                    Boolean bool = (Boolean) obj;
                    CheckBox checkBox = this.a.g;
                    checkBox.getClass();
                    if (bool != null && bool.booleanValue()) {
                        z = true;
                    }
                    checkBox.setChecked(z);
                    return;
                }
                jkv jkvVar = this.a;
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Failed to read the offlineStreamSelection value.");
                sb.append(valueOf);
                zga.b(sb.toString());
                CheckBox checkBox2 = jkvVar.g;
                checkBox2.getClass();
                checkBox2.setChecked(false);
            }
        }, new zfi(this) { // from class: jko
            public final /* synthetic */ jkv a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                boolean z = false;
                if (i2 == 0) {
                    Boolean bool = (Boolean) obj;
                    CheckBox checkBox = this.a.g;
                    checkBox.getClass();
                    if (bool != null && bool.booleanValue()) {
                        z = true;
                    }
                    checkBox.setChecked(z);
                    return;
                }
                jkv jkvVar = this.a;
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Failed to read the offlineStreamSelection value.");
                sb.append(valueOf);
                zga.b(sb.toString());
                CheckBox checkBox2 = jkvVar.g;
                checkBox2.getClass();
                checkBox2.setChecked(false);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(atqo atqoVar, acra acraVar) {
        aqdt aqdtVar;
        aomf aomfVar;
        int i = atqoVar.b;
        if (i == 88122887) {
            avul avulVar = (avul) atqoVar.c;
            aomfVar = avulVar.i;
            aqdtVar = avulVar;
        } else if (i == 53345347) {
            aqkv aqkvVar = (aqkv) atqoVar.c;
            aomfVar = aqkvVar.h;
            aqdtVar = aqkvVar;
        } else if (i == 64099105) {
            aqdt aqdtVar2 = (aqdt) atqoVar.c;
            aomfVar = aqdtVar2.n;
            aqdtVar = aqdtVar2;
        } else {
            aqdtVar = null;
            aomfVar = null;
        }
        aomfVar.getClass();
        acraVar.D(new acqx(aomfVar));
        this.x.a(aqdtVar, acraVar, null, null);
    }

    @Override // defpackage.agys
    public final void e(atsb atsbVar, acra acraVar, agzo agzoVar, String str) {
        w(null, atsbVar, acraVar, agzoVar, R.string.add_playlist_to_offline);
    }

    public final void f(atsb atsbVar) {
        AlertDialog alertDialog = this.f;
        alertDialog.getClass();
        this.k.getClass();
        alertDialog.show();
        this.f.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: jkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atrx atrxVar;
                agnc agncVar;
                jkv jkvVar = jkv.this;
                jkvVar.f.getClass();
                jkvVar.k.getClass();
                agzh agzhVar = jkvVar.j;
                agzhVar.getClass();
                jkvVar.g.getClass();
                ListView listView = agzhVar.b;
                if (listView == null) {
                    atrxVar = atrx.UNKNOWN_FORMAT_TYPE;
                } else {
                    int checkedItemPosition = listView.getCheckedItemPosition();
                    atrxVar = (checkedItemPosition == -1 || (agncVar = (agnc) agzhVar.getItem(checkedItemPosition)) == null) ? atrx.UNKNOWN_FORMAT_TYPE : agncVar.a;
                }
                atol atolVar = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE;
                if (jkvVar.g.isChecked()) {
                    jkvVar.b.E(atrxVar);
                    atolVar = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE;
                }
                ynm.m(jkvVar.c.d(jkvVar.g.isChecked()), gwr.p);
                jkvVar.f.dismiss();
                jkvVar.k.a(atrxVar, atolVar);
            }
        });
        whl.I(this.u, atsbVar.h, atsbVar);
    }

    @Override // defpackage.agzk
    public final void g(agzm agzmVar) {
        this.q = agzmVar;
        if (this.G == null) {
            this.G = v(R.string.offline_dialog_title_expired, R.string.offline_dialog_message_expired, new jkt(this, 1), Integer.valueOf(R.string.cancel), R.string.offline_expiration_dialog_renew_button);
        }
        this.G.show();
    }

    @Override // defpackage.agzk
    public final void h(String str, atsb atsbVar, acra acraVar, agzo agzoVar) {
        w(str, atsbVar, acraVar, agzoVar, R.string.add_video_to_offline);
    }

    @Override // defpackage.agys
    public final void i(final agzm agzmVar) {
        if (this.b.O()) {
            if (this.e == null) {
                this.e = new AlertDialog.Builder(this.a).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setTitle(R.string.unknown_playlist_size_warning_title).setMessage(R.string.unknown_playlist_size_warning_message).setView(LayoutInflater.from(this.a).inflate(R.layout.offline_playlist_warning_dialog, (ViewGroup) null, false)).create();
            }
            AlertDialog alertDialog = this.e;
            alertDialog.getClass();
            alertDialog.show();
            final CheckBox checkBox = (CheckBox) this.e.findViewById(R.id.do_not_show_offline_playlist_warning_checkbox);
            checkBox.setChecked(false);
            this.e.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: jkn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jkv jkvVar = jkv.this;
                    CheckBox checkBox2 = checkBox;
                    agzm agzmVar2 = agzmVar;
                    if (checkBox2.isChecked()) {
                        jkvVar.b.S();
                    }
                    AlertDialog alertDialog2 = jkvVar.e;
                    alertDialog2.getClass();
                    alertDialog2.dismiss();
                    agzmVar2.b();
                }
            });
            return;
        }
        agzmVar.b();
    }

    @Override // defpackage.agys
    public final void j(agzm agzmVar, agyg agygVar) {
        this.n = agzmVar;
        if (this.A == null) {
            this.A = v(R.string.remove_offline_playlists_title, R.string.remove_offline_playlists_message, new jkt(this, 3), Integer.valueOf(R.string.cancel), R.string.remove_offline_confirmed_button);
        }
        this.A.show();
    }

    @Override // defpackage.agzk
    public final void k(agzm agzmVar) {
        this.m = agzmVar;
        if (this.z == null) {
            this.z = v(R.string.remove_offline_video_title, R.string.remove_offline_video_message, new jkt(this, 0), Integer.valueOf(R.string.cancel), R.string.remove_offline_confirmed_button);
        }
        this.z.show();
    }

    @Override // defpackage.agzk
    public final void l(agzm agzmVar, String str, String str2) {
        new AlertDialog.Builder(this.a).setTitle(ammx.d(str)).setMessage(str2).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.remove_offline_confirmed_button, new jkp(agzmVar, 1, null)).create().show();
    }

    @Override // defpackage.agzk
    public final void m(agzn agznVar) {
        new AlertDialog.Builder(this.a).setMessage(R.string.offline_retry_failed_videos_dialog_message).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new jku(agznVar, 0)).show();
    }

    @Override // defpackage.agzk
    public final void n(agzn agznVar) {
        if (this.D == null) {
            this.D = new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.readd_offline, new jkk(this, 3, (char[]) null)).create();
        }
        this.o = agznVar;
        this.D.show();
    }

    @Override // defpackage.agzk
    public final void o(agzn agznVar, String str) {
        new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setMessage(str).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.readd_offline, new jku(agznVar, 1, null)).create().show();
    }

    @Override // defpackage.agzk
    public final void p(agzn agznVar) {
        if (this.F == null) {
            this.F = new AlertDialog.Builder(this.a).setTitle(R.string.readd_to_offline_video).setMessage(R.string.offline_file_not_found_dialog_message).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.save_offline, new jkk(this, 0)).create();
        }
        this.p = agznVar;
        this.F.show();
    }

    @Override // defpackage.agys
    public final void q(agzm agzmVar, agyg agygVar) {
        j(agzmVar, agygVar);
    }

    @Override // defpackage.agzk
    public final void r(agzm agzmVar) {
        this.l = agzmVar;
        if (this.B == null) {
            this.B = v(R.string.stop_offline_video_title, R.string.stop_offline_video_message, new jkt(this, 2), Integer.valueOf(R.string.stop_offline_dismiss_button), R.string.stop_offline_confirmed_button);
        }
        this.B.show();
    }

    @Override // defpackage.agys
    public final void s(agxm agxmVar) {
        if (this.C == null) {
            this.C = x(new psy[]{new psy(R.string.approve_playlist_sync, R.drawable.ic_offline_dialog_sync, null, null)}, new jkk(this, 2, (byte[]) null));
        }
        this.r = agxmVar;
        this.C.show();
    }

    @Override // defpackage.agys
    public final void u(agxm agxmVar) {
        if (this.E == null) {
            this.E = x(new psy[]{new psy(R.string.sync_offline_playlist_action, R.drawable.ic_offline_dialog_sync, null, null), new psy(R.string.remove_offline_playlist_action, R.drawable.ic_offline_dialog_remove, null, null)}, new jkk(this, 1));
        }
        this.s = agxmVar;
        this.E.show();
    }
}

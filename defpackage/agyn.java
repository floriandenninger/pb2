package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agyn {
    public final Activity a;
    public final aahd b;
    public final agsg c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final AlertDialog i;
    public final TextView j;
    public final ajyf k;
    public final ajyf l;
    public final ajdg m;
    public apmg n;
    public apmg o;
    public acra p;
    public final NonScrollableListView q;
    public final agyh r;
    public DialogInterface.OnDismissListener s;
    private final ajjz t;

    public agyn(Activity activity, aahd aahdVar, agsg agsgVar, ajjz ajjzVar, ajyg ajygVar, final ajdh ajdhVar, final eun eunVar, byte[] bArr) {
        agyf agyfVar;
        this.a = activity;
        this.b = aahdVar;
        this.c = agsgVar;
        this.t = ajjzVar;
        final byte[] bArr2 = null;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.upsell_dialog_with_header_images, (ViewGroup) null);
        NonScrollableListView nonScrollableListView = (NonScrollableListView) inflate.findViewById(R.id.offline_stream_selection_list);
        this.q = nonScrollableListView;
        agyh agyhVar = new agyh(activity, nonScrollableListView);
        this.r = agyhVar;
        nonScrollableListView.c = agyhVar;
        ListAdapter listAdapter = nonScrollableListView.b;
        if (listAdapter != null && (agyfVar = nonScrollableListView.d) != null) {
            listAdapter.unregisterDataSetObserver(agyfVar);
        }
        nonScrollableListView.b = agyhVar;
        nonScrollableListView.a();
        if (nonScrollableListView.d == null) {
            nonScrollableListView.d = new agyf(nonScrollableListView);
        }
        agyhVar.registerDataSetObserver(nonScrollableListView.d);
        this.d = (ImageView) inflate.findViewById(R.id.background_image);
        this.e = (ImageView) inflate.findViewById(R.id.logo);
        this.f = (TextView) inflate.findViewById(R.id.dialog_title);
        this.g = (TextView) inflate.findViewById(R.id.dialog_subtitle);
        this.h = (TextView) inflate.findViewById(R.id.dialog_message);
        TextView textView = (TextView) inflate.findViewById(R.id.dismiss_button);
        this.j = textView;
        ajyf a = ajygVar.a(textView);
        this.l = a;
        ajyf a2 = ajygVar.a((TextView) inflate.findViewById(R.id.action_button));
        this.k = a2;
        final AlertDialog create = new AlertDialog.Builder(activity).setView(inflate).create();
        this.i = create;
        create.getClass();
        this.m = new ajdg() { // from class: agyl
            @Override // defpackage.ajdg
            public final void lP() {
                create.dismiss();
            }
        };
        create.setOnCancelListener(new DialogInterface.OnCancelListener(eunVar, bArr2) { // from class: agyi
            public final /* synthetic */ eun b;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                agyn agynVar = agyn.this;
                eun eunVar2 = this.b;
                agynVar.l.onClick(agynVar.j);
                eunVar2.a = false;
            }
        });
        create.setOnShowListener(new DialogInterface.OnShowListener(ajdhVar, eunVar, bArr2) { // from class: agyk
            public final /* synthetic */ ajdh b;
            public final /* synthetic */ eun c;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                agyn agynVar = agyn.this;
                ajdh ajdhVar2 = this.b;
                eun eunVar2 = this.c;
                ajdhVar2.a(agynVar.m);
                eunVar2.a = true;
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener(ajdhVar, eunVar, bArr2) { // from class: agyj
            public final /* synthetic */ ajdh b;
            public final /* synthetic */ eun c;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                agyn agynVar = agyn.this;
                ajdh ajdhVar2 = this.b;
                eun eunVar2 = this.c;
                ajdhVar2.d(agynVar.m);
                DialogInterface.OnDismissListener onDismissListener = agynVar.s;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                eunVar2.a = false;
            }
        });
        ajyc ajycVar = new ajyc() { // from class: agym
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                agyn agynVar = agyn.this;
                acra acraVar = agynVar.p;
                if (acraVar != null) {
                    apmg apmgVar = (apmg) aongVar.instance;
                    if ((apmgVar.b & 16384) != 0) {
                        apxf apxfVar = apmgVar.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        if (!apxfVar.pY(atmb.b)) {
                            apxf apxfVar2 = ((apmg) aongVar.instance).o;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            apxf h = acraVar.h(apxfVar2);
                            if (h == null) {
                                aongVar.copyOnWrite();
                                apmg apmgVar2 = (apmg) aongVar.instance;
                                apmgVar2.o = null;
                                apmgVar2.b &= -16385;
                            } else {
                                aongVar.copyOnWrite();
                                apmg apmgVar3 = (apmg) aongVar.instance;
                                apmgVar3.o = h;
                                apmgVar3.b |= 16384;
                            }
                        }
                    }
                }
                agynVar.i.dismiss();
            }
        };
        a.c = ajycVar;
        a2.c = ajycVar;
    }

    public final void a(ImageView imageView, avgg avggVar) {
        if (avggVar == null) {
            imageView.setVisibility(8);
        } else {
            this.t.k(imageView, avggVar, ajjv.b);
            imageView.setVisibility(0);
        }
    }
}

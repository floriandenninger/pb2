package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqo implements aaha {
    private final ysy a;
    private final lrw b;
    private final akht c;

    public gqo(ysy ysyVar, lrw lrwVar, akht akhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = ysyVar;
        this.b = lrwVar;
        this.c = akhtVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        aqyg aqygVar2;
        if (this.a.o()) {
            akht akhtVar = this.c;
            Activity activity = (Activity) akhtVar.b.get();
            activity.getClass();
            ajut ajutVar = (ajut) akhtVar.c.get();
            ajutVar.getClass();
            aahd aahdVar = (aahd) akhtVar.a.get();
            aahdVar.getClass();
            acsg acsgVar = (acsg) akhtVar.e.get();
            acsgVar.getClass();
            ypa ypaVar = (ypa) akhtVar.d.get();
            ypaVar.getClass();
            final lsi lsiVar = new lsi(activity, ajutVar, aahdVar, acsgVar, ypaVar);
            CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint = (CreationEntryEndpointOuterClass$CreationEntryEndpoint) apxfVar.pX(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
            creationEntryEndpointOuterClass$CreationEntryEndpoint.getClass();
            mi miVar = lsiVar.f;
            if (miVar == null || !miVar.isShowing()) {
                lsiVar.d.d(acsb.b(36216), apxfVar, null);
                View inflate = lsiVar.a.getLayoutInflater().inflate(R.layout.creation_entry_sheet, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.creation_entry_point_items);
                apmt apmtVar = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
                if (apmtVar == null) {
                    apmtVar = apmt.a;
                }
                amkq.N(1 == (apmtVar.b & 1));
                apmt apmtVar2 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
                if (apmtVar2 == null) {
                    apmtVar2 = apmt.a;
                }
                apms apmsVar = apmtVar2.c;
                if (apmsVar == null) {
                    apmsVar = apms.a;
                }
                if ((apmsVar.b & 1) != 0) {
                    TextView textView = (TextView) inflate.findViewById(R.id.creation_sheet_title);
                    apmt apmtVar3 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
                    if (apmtVar3 == null) {
                        apmtVar3 = apmt.a;
                    }
                    apms apmsVar2 = apmtVar3.c;
                    if (apmsVar2 == null) {
                        apmsVar2 = apms.a;
                    }
                    aqyg aqygVar3 = apmsVar2.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    textView.setText(ajcq.b(aqygVar3));
                }
                apmt apmtVar4 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b;
                if (apmtVar4 == null) {
                    apmtVar4 = apmt.a;
                }
                apms apmsVar3 = apmtVar4.c;
                if (apmsVar3 == null) {
                    apmsVar3 = apms.a;
                }
                Iterator it = apmsVar3.c.iterator();
                while (it.hasNext()) {
                    final apmg apmgVar = ((apmr) it.next()).b;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    View inflate2 = lsiVar.a.getLayoutInflater().inflate(R.layout.creation_entry_item, (ViewGroup) linearLayout, false);
                    TextView textView2 = (TextView) inflate2.findViewById(R.id.text);
                    if ((apmgVar.b & 256) != 0) {
                        aqygVar = apmgVar.i;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView2.setText(ajcq.b(aqygVar));
                    if ((apmgVar.b & 256) != 0) {
                        aqygVar2 = apmgVar.i;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    inflate2.setContentDescription(ajcq.b(aqygVar2));
                    jw.M(inflate2, new zah());
                    if ((apmgVar.b & 32) != 0) {
                        ajut ajutVar2 = lsiVar.b;
                        arfs arfsVar = apmgVar.g;
                        if (arfsVar == null) {
                            arfsVar = arfs.a;
                        }
                        arfr b = arfr.b(arfsVar.c);
                        if (b == null) {
                            b = arfr.UNKNOWN;
                        }
                        ((ImageView) inflate2.findViewById(R.id.image)).setImageResource(ajutVar2.a(b));
                    }
                    inflate2.setOnClickListener(new View.OnClickListener() { // from class: lsh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            apxf apxfVar2;
                            lsi lsiVar2 = lsi.this;
                            apmg apmgVar2 = apmgVar;
                            lsiVar2.f.dismiss();
                            if ((apmgVar2.b & 16384) != 0 && ((acqq) lsiVar2.d).g != null) {
                                apxf apxfVar3 = apmgVar2.o;
                                if (apxfVar3 == null) {
                                    apxfVar3 = apxf.a;
                                }
                                aone builder = ((atmc) apxfVar3.pX(atmb.b)).toBuilder();
                                String str = ((acqq) lsiVar2.d).g.a;
                                builder.copyOnWrite();
                                atmc atmcVar = (atmc) builder.instance;
                                str.getClass();
                                atmcVar.b |= 1;
                                atmcVar.c = str;
                                aong aongVar = (aong) apmgVar2.toBuilder();
                                apxf apxfVar4 = apmgVar2.o;
                                if (apxfVar4 == null) {
                                    apxfVar4 = apxf.a;
                                }
                                aong aongVar2 = (aong) apxfVar4.toBuilder();
                                aongVar2.e(atmb.b, (atmc) builder.build());
                                aongVar.copyOnWrite();
                                apmg apmgVar3 = (apmg) aongVar.instance;
                                apxf apxfVar5 = (apxf) aongVar2.build();
                                apxfVar5.getClass();
                                apmgVar3.o = apxfVar5;
                                apmgVar3.b |= 16384;
                                apmgVar2 = (apmg) aongVar.build();
                            }
                            aahd aahdVar2 = lsiVar2.c;
                            if ((apmgVar2.b & 16384) != 0) {
                                apxfVar2 = apmgVar2.o;
                                if (apxfVar2 == null) {
                                    apxfVar2 = apxf.a;
                                }
                            } else {
                                apxfVar2 = null;
                            }
                            aahdVar2.c(apxfVar2, null);
                        }
                    });
                    lsiVar.d.n(new acqx(apmgVar.t));
                    linearLayout.addView(inflate2);
                }
                mi miVar2 = lsiVar.f;
                if (miVar2 == null) {
                    mh mhVar = new mh(lsiVar.a, R.style.CreationEntryDialog);
                    mhVar.p(inflate);
                    lsiVar.f = mhVar.b();
                    lsiVar.f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: lsg
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            lsi lsiVar2 = lsi.this;
                            lsiVar2.e.g(lsiVar2);
                        }
                    });
                    lsiVar.f.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: lsf
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            lsi lsiVar2 = lsi.this;
                            lsiVar2.e.m(lsiVar2);
                        }
                    });
                    lsiVar.f.show();
                    Window window = lsiVar.f.getWindow();
                    int dimensionPixelSize = lsiVar.a.getResources().getDimensionPixelSize(R.dimen.creation_sheet_dialog_width);
                    if (dimensionPixelSize <= 0) {
                        dimensionPixelSize = -1;
                    }
                    window.setLayout(dimensionPixelSize, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    window.setAttributes(attributes);
                    return;
                }
                miVar2.a.c(inflate);
                lsiVar.f.show();
                return;
            }
            return;
        }
        this.b.b();
    }
}

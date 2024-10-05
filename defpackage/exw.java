package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ModalEndpointOuterClass$ModalEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exw implements aaha {
    private final ModalDialogController a;

    public exw(ModalDialogController modalDialogController) {
        this.a = modalDialogController;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        atgs atgsVar;
        ModalEndpointOuterClass$ModalEndpoint modalEndpointOuterClass$ModalEndpoint = (ModalEndpointOuterClass$ModalEndpoint) apxfVar.pX(ModalEndpointOuterClass$ModalEndpoint.modalEndpoint);
        atgr atgrVar = modalEndpointOuterClass$ModalEndpoint.b;
        if (atgrVar == null) {
            atgrVar = atgr.a;
        }
        if (atgrVar.b == 106613512) {
            atgr atgrVar2 = modalEndpointOuterClass$ModalEndpoint.b;
            if (atgrVar2 == null) {
                atgrVar2 = atgr.a;
            }
            if (atgrVar2.b == 106613512) {
                atgsVar = (atgs) atgrVar2.c;
            } else {
                atgsVar = atgs.a;
            }
            final ModalDialogController modalDialogController = this.a;
            final boolean z = modalEndpointOuterClass$ModalEndpoint.c;
            if (atgsVar != null) {
                apmh apmhVar = atgsVar.d;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) != 0) {
                    if (z) {
                        modalDialogController.e.a();
                    }
                    modalDialogController.g();
                    if (!modalDialogController.k) {
                        modalDialogController.g = LayoutInflater.from(modalDialogController.a).inflate(R.layout.modal_dialog_button_panel, (ViewGroup) null);
                        modalDialogController.h = (TextView) modalDialogController.g.findViewById(R.id.dialog_message);
                        modalDialogController.j = modalDialogController.d.a((TextView) modalDialogController.g.findViewById(R.id.negative_button));
                        ajyd ajydVar = modalDialogController.j;
                        aong aongVar = (aong) apmg.a.createBuilder();
                        aqyg h = ajcq.h(modalDialogController.a.getString(R.string.cancel));
                        aongVar.copyOnWrite();
                        apmg apmgVar = (apmg) aongVar.instance;
                        h.getClass();
                        apmgVar.i = h;
                        apmgVar.b |= 256;
                        aongVar.copyOnWrite();
                        apmg apmgVar2 = (apmg) aongVar.instance;
                        apmgVar2.d = 13;
                        apmgVar2.c = 1;
                        ajydVar.b((apmg) aongVar.build(), modalDialogController.c.mM());
                        modalDialogController.i = modalDialogController.d.a((TextView) modalDialogController.g.findViewById(R.id.positive_button));
                        modalDialogController.i.c = new ajyc() { // from class: exy
                            @Override // defpackage.ajyc
                            public final void oC(aong aongVar2) {
                                ModalDialogController.this.g();
                            }
                        };
                        modalDialogController.k = true;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(modalDialogController.a);
                    aqyg aqygVar = atgsVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    modalDialogController.f = builder.setTitle(ajcq.b(aqygVar)).setView(modalDialogController.g).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: exx
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ModalDialogController modalDialogController2 = ModalDialogController.this;
                            if (modalDialogController2.g.getParent() instanceof ViewGroup) {
                                ((ViewGroup) modalDialogController2.g.getParent()).removeView(modalDialogController2.g);
                            }
                            modalDialogController2.f = null;
                        }
                    }).create();
                    modalDialogController.f.show();
                    TextView textView = modalDialogController.h;
                    aqyg aqygVar2 = atgsVar.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    textView.setText(ajcq.c(aqygVar2, modalDialogController.b));
                    ajyd ajydVar2 = modalDialogController.i;
                    apmh apmhVar2 = atgsVar.d;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar3 = apmhVar2.c;
                    if (apmgVar3 == null) {
                        apmgVar3 = apmg.a;
                    }
                    ajydVar2.b(apmgVar3, modalDialogController.c.mM());
                    modalDialogController.j.c = new ajyc() { // from class: exz
                        @Override // defpackage.ajyc
                        public final void oC(aong aongVar2) {
                            ModalDialogController modalDialogController2 = ModalDialogController.this;
                            boolean z2 = z;
                            modalDialogController2.g();
                            if (z2) {
                                modalDialogController2.e.b();
                            }
                        }
                    };
                }
            }
        }
    }
}

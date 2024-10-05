package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gsn implements aaha {
    public final Context a;
    public final ypa b;
    public final Executor c;
    public final akvq d;
    public final aaxn e;
    private AlertDialog f;

    public gsn(Context context, aaxn aaxnVar, ypa ypaVar, Executor executor, akvq akvqVar, byte[] bArr) {
        this.a = context;
        this.e = aaxnVar;
        this.b = ypaVar;
        this.c = executor;
        this.d = akvqVar;
    }

    public final void b() {
        whu.K(this.a, R.string.delete_inprogress_upload_failed, 1);
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setMessage(R.string.delete_upload_dialog_confirmation).setNegativeButton(R.string.delete_upload_dialog_negative, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.delete_upload_dialog_positive), new DialogInterface.OnClickListener() { // from class: gsj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gsn gsnVar = gsn.this;
                final apxf apxfVar2 = apxfVar;
                final Map map2 = map;
                amkq.N(apxfVar2.pY(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint));
                if (!((DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apxfVar2.pX(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint)).d.isEmpty()) {
                    final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apxfVar2.pX(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
                    amkq.N(!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d.isEmpty());
                    final akvq akvqVar = gsnVar.d;
                    final String str = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d;
                    anhy T = anaf.T(new anfy() { // from class: akvj
                        @Override // defpackage.anfy
                        public final anhy a() {
                            akvq akvqVar2 = akvq.this;
                            String str2 = str;
                            if (akvqVar2.g.b(str2) == null) {
                                return anaf.O(false);
                            }
                            ((akze) akvqVar2.l.get()).v(str2);
                            return anaf.O(true);
                        }
                    }, akvqVar.c);
                    anaf.Y(T, new akvp(akvqVar, 0), angq.a);
                    ynm.k(T, angq.a, new gsk(gsnVar, 1), new ynl() { // from class: gsm
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            final gsn gsnVar2 = gsn.this;
                            DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
                            final apxf apxfVar3 = apxfVar2;
                            final Map map3 = map2;
                            Boolean bool = (Boolean) obj;
                            if (bool == null || !bool.booleanValue()) {
                                if (!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2.c.isEmpty()) {
                                    DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint) apxfVar3.pX(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint);
                                    amkq.N(!deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.c.isEmpty());
                                    abdm j = gsnVar2.e.j();
                                    j.a = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint3.c;
                                    if (!apxfVar3.c.H()) {
                                        j.l(apxfVar3.c);
                                    } else {
                                        j.k();
                                    }
                                    ynm.k(gsnVar2.e.l(j), gsnVar2.c, new gsk(gsnVar2, 0), new ynl() { // from class: gsl
                                        @Override // defpackage.ynl, defpackage.zfi
                                        public final void a(Object obj2) {
                                            gsn gsnVar3 = gsn.this;
                                            apxf apxfVar4 = apxfVar3;
                                            Map map4 = map3;
                                            if (((asek) obj2).c) {
                                                gsnVar3.b.d(new aaxa(apxfVar4, yjj.s(map4, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
                                                whu.K(gsnVar3.a, R.string.delete_inprogress_upload_done, 1);
                                            }
                                        }
                                    });
                                    return;
                                }
                                gsnVar2.b();
                            }
                        }
                    });
                    return;
                }
                gsnVar.b();
            }
        });
        this.f.show();
    }
}

package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqr implements aaha {
    public final Activity a;
    public final ypa b;
    public final zaw c;
    public final Executor d;
    public final aaxn e;
    private AlertDialog f;

    public gqr(Activity activity, ypa ypaVar, aaxn aaxnVar, zaw zawVar, Executor executor, byte[] bArr) {
        this.a = activity;
        ypaVar.getClass();
        this.b = ypaVar;
        aaxnVar.getClass();
        this.e = aaxnVar;
        zawVar.getClass();
        this.c = zawVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        if (this.f == null) {
            this.f = new AlertDialog.Builder(this.a).setMessage(R.string.delete_upload_confirmation).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        }
        this.f.setButton(-1, this.a.getString(R.string.delete_video_positive_button_text), new DialogInterface.OnClickListener() { // from class: gqp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final gqr gqrVar = gqr.this;
                final apxf apxfVar2 = apxfVar;
                final Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                abdm j = gqrVar.e.j();
                j.l(whl.G(apxfVar2));
                j.a = ((DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apxfVar2.pX(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)).c;
                ynm.l(gqrVar.e.l(j), gqrVar.d, new gto(gqrVar.c, 1), new ynl() { // from class: gqq
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj) {
                        gqr gqrVar2 = gqr.this;
                        apxf apxfVar3 = apxfVar2;
                        Object obj2 = s;
                        whu.K(gqrVar2.a, R.string.delete_upload_done, 1);
                        gqrVar2.b.d(new aaxa(apxfVar3, obj2));
                    }
                }, anij.a);
            }
        });
        this.f.show();
    }
}

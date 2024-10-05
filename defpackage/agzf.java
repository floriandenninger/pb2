package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agzf {
    public final agsg a;
    public final agzx b;
    public final Executor c;
    public final anib d;
    public final aaea e;

    public agzf(agsg agsgVar, agzx agzxVar, Executor executor, anib anibVar, aaea aaeaVar) {
        this.a = agsgVar;
        this.b = agzxVar;
        this.c = executor;
        this.d = anibVar;
        aaeaVar.getClass();
        this.e = aaeaVar;
    }

    public static atqo a(PlayerResponseModel playerResponseModel) {
        atqq r = playerResponseModel.r();
        if (r == null || r.c != 7) {
            return null;
        }
        return (atqo) r.d;
    }

    public static agzd c(agzd agzdVar) {
        return new agzd(agzdVar.a, agzdVar.b, agnc.b(agzdVar.c));
    }

    public final void b(final Context context, atsb atsbVar, String str, List list, final ykl yklVar) {
        yjk.f();
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.offline_stream_selection_waiting));
        progressDialog.setCancelable(false);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, ahab.e);
        final agzd agzdVar = new agzd(atsbVar.i.I(), str, arrayList);
        ynm.l(this.d.submit(new Callable() { // from class: agza
            /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x012b A[SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 391
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.agza.call():java.lang.Object");
            }
        }), this.c, new ynk() { // from class: agyu
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                ProgressDialog progressDialog2 = progressDialog;
                ykl yklVar2 = yklVar;
                agzd agzdVar2 = agzdVar;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                if (th instanceof Exception) {
                    yklVar2.a(agzdVar2, (Exception) th);
                } else {
                    yklVar2.a(agzdVar2, new RuntimeException(th));
                }
            }
        }, new ynl() { // from class: agyw
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ProgressDialog progressDialog2 = progressDialog;
                ykl yklVar2 = yklVar;
                agzd agzdVar2 = agzdVar;
                agze agzeVar = (agze) obj;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                agzc agzcVar = agzeVar.c;
                if (agzcVar == null) {
                    if (agzeVar.a.isEmpty()) {
                        yklVar2.a(agzdVar2, new agzc(null, false, null));
                        return;
                    } else {
                        yklVar2.b(agzdVar2, agzeVar);
                        return;
                    }
                }
                yklVar2.a(agzdVar2, agzcVar);
            }
        }, new Runnable() { // from class: agyy
            @Override // java.lang.Runnable
            public final void run() {
                ProgressDialog progressDialog2 = progressDialog;
                ykl yklVar2 = yklVar;
                agzd agzdVar2 = agzdVar;
                if (progressDialog2.isShowing()) {
                    progressDialog2.dismiss();
                }
                yklVar2.a(agzdVar2, new CancellationException());
            }
        });
    }
}

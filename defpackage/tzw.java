package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzw implements tzt {
    public final tzu a;
    private final tyu b;
    private final tzx c;
    private final tzy d;

    public tzw(tyu tyuVar, tzu tzuVar, tzx tzxVar, tzy tzyVar) {
        this.b = tyuVar;
        this.a = tzuVar;
        this.c = tzxVar;
        this.d = tzyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110 A[Catch: ExecutionException -> 0x0149, TimeoutException -> 0x014b, InterruptedException -> 0x0153, TryCatch #5 {InterruptedException -> 0x0153, ExecutionException -> 0x0149, TimeoutException -> 0x014b, blocks: (B:30:0x00d4, B:32:0x0110, B:37:0x011b, B:38:0x011f, B:41:0x0131, B:46:0x0139), top: B:29:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final defpackage.twu r20, final java.util.List r21, final defpackage.twd r22, final defpackage.tzg r23, final boolean r24) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzw.a(twu, java.util.List, twd, tzg, boolean):void");
    }

    @Override // defpackage.tzt
    public final void b(tyr tyrVar) {
        tzy tzyVar = this.d;
        if (tyrVar.j().isEmpty()) {
            return;
        }
        if (tyrVar.d() == tys.SYSTEM_TRAY) {
            if (((Map) tzyVar.c.get()).containsKey(Integer.valueOf(tyrVar.a()))) {
                ((ubq) ((Map) tzyVar.c.get()).get(Integer.valueOf(tyrVar.a()))).a(tyrVar);
            } else {
                tzk.a("SystemTrayUserEventHelper", "No handler installed for system tray events of type %s", Integer.valueOf(tyrVar.a()));
            }
        }
        ArrayList arrayList = new ArrayList(tyrVar.j().size());
        for (int i = 0; i < tyrVar.j().size(); i++) {
            arrayList.add(((txb) tyrVar.j().get(i)).a);
        }
        tzyVar.b.b(tyrVar.c(), arrayList, tyrVar.h(), tyrVar.d(), tyrVar.f());
        if (tyrVar.d() == tys.SERVER || aokw.a.equals(tyrVar.h())) {
            return;
        }
        if (tyrVar.c() != null) {
            tzyVar.d.a.b(tyrVar.c(), tyrVar.h(), tyrVar.i(), tyrVar.d(), txb.a(tyrVar.j()));
            return;
        }
        for (txb txbVar : tyrVar.j()) {
            if (!TextUtils.isEmpty(txbVar.i)) {
                tzyVar.a.i(txbVar.i, tyrVar.h());
            }
        }
    }
}

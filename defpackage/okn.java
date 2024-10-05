package defpackage;

import com.google.android.apps.youtube.app.watchwhile.StartupSignalStream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class okn implements yxe {
    public final Map a;
    final ayqw b = new ayqw();
    final ArrayList c = new ArrayList();
    private final StartupSignalStream d;
    private final ayqi e;

    public okn(Map map, StartupSignalStream startupSignalStream, ayqi ayqiVar) {
        this.a = map;
        this.d = startupSignalStream;
        this.e = ayqiVar;
    }

    @Override // defpackage.yxe
    public final void a() {
        this.b.d(this.d.g().ab(this.e).ax(new ayrs() { // from class: okm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                okn oknVar = okn.this;
                yxe yxeVar = (yxe) oknVar.a.get((auxs) obj);
                if (yxeVar != null) {
                    yxeVar.a();
                    oknVar.c.add(yxeVar);
                }
            }
        }));
    }

    @Override // defpackage.yxe
    public final void b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yxe) arrayList.get(i)).b();
        }
        this.c.clear();
        this.b.c();
    }
}

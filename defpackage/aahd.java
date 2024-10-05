package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface aahd {
    public static final aahd j = new aahd() { // from class: aahb
        @Override // defpackage.aahd
        public final /* synthetic */ void a(apxf apxfVar) {
            aahc.a(this, apxfVar);
        }

        @Override // defpackage.aahd
        public final /* synthetic */ void b(List list) {
            aahc.b(this, list);
        }

        @Override // defpackage.aahd
        public final void c(apxf apxfVar, Map map) {
            int i = aahc.a;
        }

        @Override // defpackage.aahd
        public final /* synthetic */ void d(List list, Map map) {
            aahc.c(this, list, map);
        }

        @Override // defpackage.aahd
        public final /* synthetic */ void e(List list, Object obj) {
            aahc.d(this, list, obj);
        }
    };

    void a(apxf apxfVar);

    void b(List list);

    @Deprecated
    void c(apxf apxfVar, Map map);

    @Deprecated
    void d(List list, Map map);

    @Deprecated
    void e(List list, Object obj);
}

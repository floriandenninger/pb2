package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class juu implements Runnable {
    public final /* synthetic */ juy a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ykl c;
    private final /* synthetic */ int d;

    public /* synthetic */ juu(juy juyVar, String str, ykl yklVar, int i) {
        this.d = i;
        this.a = juyVar;
        this.b = str;
        this.c = yklVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final List emptyList;
        if (this.d == 0) {
            juy juyVar = this.a;
            final String str = this.b;
            final ykl yklVar = this.c;
            final agni e = juyVar.a.j() ? juyVar.a().e(str) : null;
            if (e != null) {
                juyVar.c.execute(new Runnable() { // from class: juw
                    @Override // java.lang.Runnable
                    public final void run() {
                        ykl.this.b(str, e);
                    }
                });
                return;
            } else {
                juyVar.c.execute(new Runnable() { // from class: juv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ykl.this.a(str, new IllegalArgumentException("No playlist by that id"));
                    }
                });
                return;
            }
        }
        juy juyVar2 = this.a;
        final String str2 = this.b;
        final ykl yklVar2 = this.c;
        if (juyVar2.a.j()) {
            emptyList = juyVar2.a().l(str2);
        } else {
            emptyList = Collections.emptyList();
        }
        juyVar2.c.execute(new Runnable() { // from class: jux
            @Override // java.lang.Runnable
            public final void run() {
                ykl.this.b(str2, emptyList);
            }
        });
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrn implements adro {
    public volatile int a = 0;
    public final ArrayList b = new ArrayList();
    public volatile boolean c = false;

    @Override // defpackage.adro
    public final void a() {
        this.a = 2;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((adro) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.adro
    public final void b() {
        this.a = 0;
        this.c = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((adro) arrayList.get(i)).b();
        }
    }
}

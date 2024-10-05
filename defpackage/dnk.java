package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dnk implements dni {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.dni
    public final void a(dnj dnjVar) {
        this.a.add(dnjVar);
    }

    @Override // defpackage.dni
    public final void c(dnj dnjVar) {
        this.a.remove(dnjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((dnj) this.a.get(size)).a(this);
            }
        }
    }

    public final void h() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((dnj) this.a.get(size)).b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((dnj) this.a.get(size)).c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return true;
            }
        } while (((dnj) this.a.get(size)).d(this));
        return false;
    }
}

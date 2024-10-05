package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jeu implements akbl {
    private final /* synthetic */ int a;

    public jeu(int i) {
        this.a = i;
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void li(Object obj, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            Optional.empty();
        } else if (i2 != 1) {
        } else {
            Optional.empty();
        }
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void lj(Object obj) {
        int i = this.a;
        if (i == 0) {
            Optional.of((akby) obj);
        } else if (i != 1) {
        } else {
            Optional.of((akby) obj);
        }
    }
}

package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hiy extends ajmx {
    hjb a;

    public hiy(aypy aypyVar, ayqi ayqiVar) {
        aypyVar.ab(ayqiVar).ax(new ayrs() { // from class: hix
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hiy hiyVar = hiy.this;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h()) {
                    hiyVar.a = new hjb((ShortsCreationSelectedTrack) ammvVar.c());
                } else {
                    hiyVar.a = null;
                }
                hiyVar.v();
            }
        });
    }

    @Override // defpackage.ajng
    public final int a() {
        return this.a == null ? 0 : 1;
    }

    @Override // defpackage.ajng
    public final long b(int i) {
        return -1L;
    }

    @Override // defpackage.ajng
    public final Object c(int i) {
        hjb hjbVar = this.a;
        hjbVar.getClass();
        return hjbVar;
    }

    @Override // defpackage.ajng
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // defpackage.ajng
    public final boolean isEmpty() {
        return this.a == null;
    }
}

package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ange implements anfz {
    final /* synthetic */ angg a;
    final /* synthetic */ angk b;

    public ange(angk angkVar, angg anggVar) {
        this.b = angkVar;
        this.a = anggVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        angh anghVar = this.b.b;
        angg anggVar = this.a;
        angh anghVar2 = new angh();
        try {
            angk a = anggVar.a(anghVar2.a, obj);
            a.d(anghVar2);
            return a.c;
        } finally {
            anghVar.a(anghVar2, angq.a);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

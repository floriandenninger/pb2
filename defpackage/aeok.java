package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeok implements aknz {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aeok b = new aeok(1);
    public static final /* synthetic */ aeok a = new aeok(0);

    private /* synthetic */ aeok(int i) {
        this.c = i;
    }

    @Override // defpackage.aknz
    public final byte[] a(Object obj) {
        return this.c != 0 ? ((auqe) obj).toByteArray() : ((cnh) obj).b;
    }
}

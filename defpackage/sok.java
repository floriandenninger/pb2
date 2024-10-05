package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class sok implements abb {
    private final /* synthetic */ int c;
    public static final /* synthetic */ sok b = new sok(1);
    public static final /* synthetic */ sok a = new sok(0);

    private /* synthetic */ sok(int i) {
        this.c = i;
    }

    @Override // defpackage.abb
    public final Object a(Object obj) {
        if (this.c == 0) {
            return new syf("Error creating Component", (Throwable) obj);
        }
        return new syf("Error creating EntitiesProcessorResolver", (Throwable) obj);
    }
}

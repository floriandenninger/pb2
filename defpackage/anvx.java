package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class anvx implements anvn {
    private final /* synthetic */ int c;
    public static final /* synthetic */ anvx b = new anvx(1);
    public static final /* synthetic */ anvx a = new anvx(0);

    private /* synthetic */ anvx(int i) {
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anvj
    public final void a(Object obj, Object obj2) {
        if (this.c == 0) {
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new anvk(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
        Map.Entry entry = (Map.Entry) obj;
        obj2.b(anvw.a, entry.getKey());
        obj2.b(anvw.b, entry.getValue());
    }
}

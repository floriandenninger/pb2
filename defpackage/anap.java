package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anap {
    public final int a;
    public final amyl b;

    /* JADX INFO: Access modifiers changed from: protected */
    public anap(amyl amylVar, int i) {
        if (amylVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i >= 0) {
            this.a = i;
            this.b = amylVar;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public abstract void a(anaq anaqVar, Object obj);
}

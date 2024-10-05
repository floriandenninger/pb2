package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgr extends whu {
    private String a;
    private Boolean b;

    public jgr() {
        super(null);
    }

    @Override // defpackage.whu
    public final /* synthetic */ aakt a(aakv aakvVar) {
        return b();
    }

    public final jgs b() {
        Boolean bool;
        String str = this.a;
        if (str == null || (bool = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" key");
            }
            if (this.b == null) {
                sb.append(" shouldIndicate");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jgs(str, bool.booleanValue());
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }
}

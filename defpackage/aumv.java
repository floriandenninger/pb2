package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumv implements aala {
    public static final aalb a = new aumu();
    private final aumw b;

    public aumv(aumw aumwVar) {
        this.b = aumwVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aumt e() {
        return new aumt(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aumv) && this.b.equals(((aumv) obj).b);
    }

    public List getPlaylistIds() {
        return this.b.d;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("SaveToPlaylistListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

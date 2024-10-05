package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzv extends zbo {
    private final String a;
    private final aulm b;
    private final apxf c;
    private final int d;

    public yzv(String str, aulm aulmVar, apxf apxfVar, int i) {
        if (str == null) {
            throw new NullPointerException("Null targetId");
        }
        this.a = str;
        if (aulmVar != null) {
            this.b = aulmVar;
            this.c = apxfVar;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null reloadContinuationData");
    }

    @Override // defpackage.zbo
    public int a() {
        return this.d;
    }

    @Override // defpackage.zbo
    public apxf b() {
        return this.c;
    }

    @Override // defpackage.zbo
    public aulm c() {
        return this.b;
    }

    @Override // defpackage.zbo
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        apxf apxfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbo) {
            zbo zboVar = (zbo) obj;
            if (this.a.equals(zboVar.d()) && this.b.equals(zboVar.c()) && ((apxfVar = this.c) != null ? apxfVar.equals(zboVar.b()) : zboVar.b() == null) && this.d == zboVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        apxf apxfVar = this.c;
        return ((hashCode ^ (apxfVar == null ? 0 : apxfVar.hashCode())) * 1000003) ^ this.d;
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ReloadSectionListEvent{targetId=");
        sb.append(str);
        sb.append(", reloadContinuationData=");
        sb.append(valueOf);
        sb.append(", command=");
        sb.append(valueOf2);
        sb.append(", pageType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

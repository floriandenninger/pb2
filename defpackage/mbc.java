package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mbc extends mbm {
    private final ammv a;
    private final ammv b;
    private final ammv c;
    private final ammv d;

    public mbc(ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4) {
        if (ammvVar == null) {
            throw new NullPointerException("Null previouslySelectedFilterIndex");
        }
        this.a = ammvVar;
        if (ammvVar2 != null) {
            this.b = ammvVar2;
            if (ammvVar3 != null) {
                this.c = ammvVar3;
                if (ammvVar4 != null) {
                    this.d = ammvVar4;
                    return;
                }
                throw new NullPointerException("Null currentSelectedLayerableFilterFormData");
            }
            throw new NullPointerException("Null previousSelectedLayerableFilterFormData");
        }
        throw new NullPointerException("Null currentSelectedFilterIndex");
    }

    @Override // defpackage.mbm
    public ammv a() {
        return this.b;
    }

    @Override // defpackage.mbm
    public ammv b() {
        return this.d;
    }

    @Override // defpackage.mbm
    public ammv c() {
        return this.c;
    }

    @Override // defpackage.mbm
    public ammv d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbm) {
            mbm mbmVar = (mbm) obj;
            if (this.a.equals(mbmVar.d()) && this.b.equals(mbmVar.a()) && this.c.equals(mbmVar.c()) && this.d.equals(mbmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}

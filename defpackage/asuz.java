package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asuz implements aala {
    public static final aalb a = new asuy();
    public final asuw b;
    private final aakv c;

    public asuz(asuw asuwVar, aakv aakvVar) {
        this.b = asuwVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getLightThemeLogoModel().a());
        amsvVar.j(getDarkThemeLogoModel().a());
        amsvVar.j(getLightThemeAnimatedLogoModel().a());
        amsvVar.j(getDarkThemeAnimatedLogoModel().a());
        amsvVar.j(getOnTapCommandModel().a());
        amsvVar.j(getTooltipTextModel().a());
        amsvVar.j(getAccessibilityDataModel().a());
        amsvVar.j(getLoggingDirectivesModel().a());
        return amsvVar.g();
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
    public final /* bridge */ /* synthetic */ whu e() {
        return new asux(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asuz) && this.b.equals(((asuz) obj).b);
    }

    public aott getAccessibilityData() {
        aott aottVar = this.b.j;
        return aottVar == null ? aott.a : aottVar;
    }

    public aotr getAccessibilityDataModel() {
        aott aottVar = this.b.j;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        return aotr.b(aottVar).q(this.c);
    }

    public avgg getDarkThemeAnimatedLogo() {
        avgg avggVar = this.b.g;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getDarkThemeAnimatedLogoModel() {
        avgg avggVar = this.b.g;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.c);
    }

    public asuv getDarkThemeLogo() {
        asuv asuvVar = this.b.e;
        return asuvVar == null ? asuv.a : asuvVar;
    }

    public asvb getDarkThemeLogoModel() {
        asuv asuvVar = this.b.e;
        if (asuvVar == null) {
            asuvVar = asuv.a;
        }
        return asvb.b(asuvVar).i(this.c);
    }

    public avgg getLightThemeAnimatedLogo() {
        avgg avggVar = this.b.f;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getLightThemeAnimatedLogoModel() {
        avgg avggVar = this.b.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.c);
    }

    public asuv getLightThemeLogo() {
        asuv asuvVar = this.b.d;
        return asuvVar == null ? asuv.a : asuvVar;
    }

    public asvb getLightThemeLogoModel() {
        asuv asuvVar = this.b.d;
        if (asuvVar == null) {
            asuvVar = asuv.a;
        }
        return asvb.b(asuvVar).i(this.c);
    }

    public asuh getLoggingDirectives() {
        asuh asuhVar = this.b.l;
        return asuhVar == null ? asuh.b : asuhVar;
    }

    public asug getLoggingDirectivesModel() {
        asuh asuhVar = this.b.l;
        if (asuhVar == null) {
            asuhVar = asuh.b;
        }
        return asug.b(asuhVar).c(this.c);
    }

    public apxf getOnTapCommand() {
        apxf apxfVar = this.b.h;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public apxe getOnTapCommandModel() {
        apxf apxfVar = this.b.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return apxe.b(apxfVar).e(this.c);
    }

    public String getPromoId() {
        return this.b.k;
    }

    public aqyg getTooltipText() {
        aqyg aqygVar = this.b.i;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getTooltipTextModel() {
        aqyg aqygVar = this.b.i;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LogoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

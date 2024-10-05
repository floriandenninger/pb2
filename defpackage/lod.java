package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lod implements amml {
    public final /* synthetic */ Boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ lod(Boolean bool, int i) {
        this.b = i;
        this.a = bool;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = this.a;
                aone builder = ((lox) obj).toBuilder();
                boolean booleanValue = bool.booleanValue();
                builder.copyOnWrite();
                lox loxVar = (lox) builder.instance;
                loxVar.b |= 16;
                loxVar.g = booleanValue;
                return (lox) builder.build();
            case 1:
                Boolean bool2 = this.a;
                aone builder2 = ((fkg) obj).toBuilder();
                boolean booleanValue2 = bool2.booleanValue();
                builder2.copyOnWrite();
                fkg fkgVar = (fkg) builder2.instance;
                fkgVar.b |= 128;
                fkgVar.k = booleanValue2;
                return (fkg) builder2.build();
            case 2:
                Boolean bool3 = this.a;
                aone builder3 = ((lox) obj).toBuilder();
                boolean booleanValue3 = bool3.booleanValue();
                builder3.copyOnWrite();
                lox loxVar2 = (lox) builder3.instance;
                loxVar2.b |= 32;
                loxVar2.h = booleanValue3;
                return (lox) builder3.build();
            case 3:
                Boolean bool4 = this.a;
                aone builder4 = ((lox) obj).toBuilder();
                boolean booleanValue4 = bool4.booleanValue();
                builder4.copyOnWrite();
                lox loxVar3 = (lox) builder4.instance;
                loxVar3.b |= 64;
                loxVar3.i = booleanValue4;
                return (lox) builder4.build();
            case 4:
                Boolean bool5 = this.a;
                aone builder5 = ((lox) obj).toBuilder();
                boolean booleanValue5 = bool5.booleanValue();
                builder5.copyOnWrite();
                lox loxVar4 = (lox) builder5.instance;
                loxVar4.b |= 128;
                loxVar4.j = booleanValue5;
                return (lox) builder5.build();
            case 5:
                Boolean bool6 = this.a;
                aone builder6 = ((lox) obj).toBuilder();
                boolean booleanValue6 = bool6.booleanValue();
                builder6.copyOnWrite();
                lox loxVar5 = (lox) builder6.instance;
                loxVar5.b |= 256;
                loxVar5.k = booleanValue6;
                return (lox) builder6.build();
            case 6:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && this.a.booleanValue());
            case 7:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && this.a.booleanValue());
            default:
                return this.a;
        }
    }
}

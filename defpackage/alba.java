package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alba extends albk {
    private final afsy a;
    private final abbm b;
    private final akyo c;
    private final aseb e;
    private final axze f;

    public alba(aaea aaeaVar, afsy afsyVar, abbm abbmVar, akyo akyoVar, axze axzeVar, aseb asebVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_CREATE_REEL_ITEMS, akybVar, axzeVar, alepVar, null, null, null);
        this.a = afsyVar;
        this.b = abbmVar;
        this.f = axzeVar;
        this.c = akyoVar;
        this.e = asebVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.c;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.O;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        char c;
        akzp c2;
        int bf;
        afsx d = this.a.d(akzsVar.e);
        if (d == null) {
            throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aone createBuilder = arol.a.createBuilder();
        String str2 = akzsVar.Y;
        createBuilder.copyOnWrite();
        arol arolVar = (arol) createBuilder.instance;
        str2.getClass();
        arolVar.b |= 2;
        arolVar.d = str2;
        aony aonyVar = akzsVar.P;
        createBuilder.copyOnWrite();
        arol arolVar2 = (arol) createBuilder.instance;
        aony aonyVar2 = arolVar2.e;
        if (!aonyVar2.c()) {
            arolVar2.e = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) aonyVar, (List) arolVar2.e);
        if (!akzsVar.S.isEmpty()) {
            aone createBuilder2 = arok.a.createBuilder();
            String str3 = akzsVar.S;
            createBuilder2.copyOnWrite();
            arok arokVar = (arok) createBuilder2.instance;
            str3.getClass();
            arokVar.b |= 1;
            arokVar.c = str3;
            createBuilder.copyOnWrite();
            arol arolVar3 = (arol) createBuilder.instance;
            arok arokVar2 = (arok) createBuilder2.build();
            arokVar2.getClass();
            arolVar3.g = arokVar2;
            arolVar3.b |= 8;
        }
        if ((akzsVar.c & 8192) != 0) {
            akzn akznVar = akzsVar.R;
            if (akznVar == null) {
                akznVar = akzn.a;
            }
            if (!akznVar.b.isEmpty()) {
                aone createBuilder3 = aroo.a.createBuilder();
                akzn akznVar2 = akzsVar.R;
                if (akznVar2 == null) {
                    akznVar2 = akzn.a;
                }
                String str4 = akznVar2.b;
                createBuilder3.copyOnWrite();
                aroo arooVar = (aroo) createBuilder3.instance;
                str4.getClass();
                arooVar.b |= 1;
                arooVar.c = str4;
                createBuilder.copyOnWrite();
                arol arolVar4 = (arol) createBuilder.instance;
                aroo arooVar2 = (aroo) createBuilder3.build();
                arooVar2.getClass();
                arolVar4.f = arooVar2;
                arolVar4.b |= 4;
            }
        }
        avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        abbm abbmVar = this.b;
        aasp aaspVar = abbmVar.a;
        abbj abbjVar = new abbj(abbmVar.f, d, createBuilder, null, null, null);
        abbjVar.i = aaec.b(abbmVar.g);
        abbjVar.k();
        arom aromVar = (arom) aaspVar.d(abbjVar);
        int bi = anaf.bi(aromVar.c);
        if (bi == 0) {
            bi = 1;
        }
        switch (bi - 1) {
            case 1:
                c = 2;
                break;
            case 2:
                avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 3;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 4;
                break;
            default:
                this.f.d("CreateReelItemsTask Unknown createReelItems response status.");
                avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
                c = 4;
                break;
        }
        ArrayList arrayList = new ArrayList();
        for (aron aronVar : aromVar.d) {
            int bf2 = anaf.bf(aronVar.c);
            if ((bf2 != 0 && bf2 == 2) || ((bf = anaf.bf(aronVar.c)) != 0 && bf == 4)) {
                arrayList.add(aronVar.b);
            }
        }
        final String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (c == 2) {
            c2 = this.d.d();
        } else if (c != 3) {
            c2 = this.d.c(avtqVar);
        } else {
            alep alepVar = this.d;
            akzp akzpVar = akzsVar.O;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            c2 = alepVar.o(avtqVar, akzpVar, this.e.l, this.f);
        }
        return anaf.O(u(c2, true, new ayrs() { // from class: alaz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String[] strArr2 = strArr;
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                akzs akzsVar2 = (akzs) aoneVar.instance;
                akzs akzsVar3 = akzs.a;
                akzsVar2.Q = aonm.emptyProtobufList();
                List asList = Arrays.asList(strArr2);
                aoneVar.copyOnWrite();
                akzs akzsVar4 = (akzs) aoneVar.instance;
                aony aonyVar3 = akzsVar4.Q;
                if (!aonyVar3.c()) {
                    akzsVar4.Q = aonm.mutableCopy(aonyVar3);
                }
                aolo.addAll((Iterable) asList, (List) akzsVar4.Q);
            }
        }));
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return agbc.r;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "CreateReelItemsTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return (akzsVar.c & 524288) != 0;
    }

    @Override // defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (th instanceof aasx) {
            axze axzeVar = this.f;
            akzq a = akzq.a(akzsVar.l);
            if (a == null) {
                a = akzq.UNKNOWN_UPLOAD;
            }
            axzeVar.f("CreateReelItemsTask InnerTube service failed for", th, a);
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            akzp akzpVar = akzsVar.O;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return t(alepVar.o(avtqVar, akzpVar, this.e.l, this.f), z);
        }
        return super.k(th, akzsVar, z);
    }
}

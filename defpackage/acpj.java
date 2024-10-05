package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acpj implements acpl {
    public final afrw a;
    public final acpm b;
    public final Optional c;
    private final afsy d;
    private final shf e;
    private final zbw f;
    private final ynn g;

    public acpj(acpm acpmVar, afrw afrwVar, afsy afsyVar, shf shfVar, zbw zbwVar, ynn ynnVar, Optional optional) {
        this.a = afrwVar;
        this.b = acpmVar;
        this.d = afsyVar;
        this.e = shfVar;
        this.f = zbwVar;
        this.g = ynnVar;
        this.c = optional;
    }

    private final void i(String str) {
        String canonicalName = getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 33 + str.length());
        sb.append(canonicalName);
        sb.append(" could not generate ClientEvent: ");
        sb.append(str);
        zga.c("GEL_DELAYED_EVENT_DEBUG", sb.toString());
    }

    private final boolean j(arpp arppVar, boolean z, long j, afsx afsxVar, afsg afsgVar) {
        String str;
        boolean z2;
        if (!this.b.a.c) {
            return false;
        }
        if (arppVar == null) {
            i("Unspecified ClientEvent");
            return false;
        }
        arpo b = arppVar.b();
        if (b == arpo.PAYLOAD_NOT_SET) {
            i("ClientEvent does not have one and only one payload set.");
            return false;
        }
        long c = this.e.c();
        acpm acpmVar = this.b;
        Long l = (Long) acpmVar.g.get(b);
        if (acpmVar.c.contains(b) || (l != null && c < l.longValue())) {
            return false;
        }
        if (j < 0) {
            j = c;
        }
        long a = this.f.a();
        if (afsxVar == null) {
            afsxVar = this.d.c();
        }
        String d = afsxVar.d();
        if (afsgVar == null) {
            str = this.d.g();
        } else {
            str = afsgVar.a;
        }
        if (afsgVar == null) {
            z2 = afsxVar.g();
        } else {
            z2 = afsgVar.b;
        }
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
        sb.append("Pass GEL payload to delayed event service. Payload type: ");
        sb.append(valueOf);
        final String sb2 = sb.toString();
        ynm.i(afxc.a(), new ynl() { // from class: acph
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                acpj acpjVar = acpj.this;
                String str2 = sb2;
                if (((Boolean) obj).booleanValue()) {
                    String.valueOf(acpjVar.getClass().getCanonicalName()).length();
                    String.valueOf(str2).length();
                }
            }
        });
        arpn arpnVar = (arpn) arppVar.toBuilder();
        arpnVar.copyOnWrite();
        ((arpp) arpnVar.instance).cw(j);
        aone builder = arppVar.e().toBuilder();
        builder.copyOnWrite();
        arpq arpqVar = (arpq) builder.instance;
        arpqVar.b |= 1;
        arpqVar.c = a;
        arpnVar.copyOnWrite();
        ((arpp) arpnVar.instance).cm((arpq) builder.build());
        aone createBuilder = ovz.a.createBuilder();
        aomf byteString = ((arpp) arpnVar.build()).toByteString();
        createBuilder.copyOnWrite();
        ovz ovzVar = (ovz) createBuilder.instance;
        ovzVar.b |= 4;
        ovzVar.e = byteString;
        createBuilder.copyOnWrite();
        ovz ovzVar2 = (ovz) createBuilder.instance;
        ovzVar2.b |= 2;
        ovzVar2.d = "event_logging";
        createBuilder.copyOnWrite();
        ovz ovzVar3 = (ovz) createBuilder.instance;
        ovzVar3.b |= 16;
        ovzVar3.g = d;
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            ovz ovzVar4 = (ovz) createBuilder.instance;
            str.getClass();
            ovzVar4.b |= 128;
            ovzVar4.j = str;
        }
        createBuilder.copyOnWrite();
        ovz ovzVar5 = (ovz) createBuilder.instance;
        ovzVar5.b |= 256;
        ovzVar5.k = z2;
        if (z) {
            this.a.m(createBuilder);
            if (this.c.isPresent()) {
                ((Consumer) this.c.get()).accept((ovz) createBuilder.build());
            }
        } else {
            this.g.a(2, new acpi(this, b, createBuilder));
        }
        return true;
    }

    @Override // defpackage.acpl
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.acpl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.acpl
    public final boolean c(arpp arppVar) {
        return j(arppVar, false, -1L, null, null);
    }

    @Override // defpackage.acpl
    public final void d(arpp arppVar, afsx afsxVar, long j, afsg afsgVar) {
        j(arppVar, false, j, afsxVar, afsgVar);
    }

    @Override // defpackage.acpl
    public final void e(arpp arppVar) {
        j(arppVar, true, -1L, null, null);
    }

    @Override // defpackage.acpl
    public final void f(arpp arppVar, long j) {
        j(arppVar, false, j, null, null);
    }

    @Override // defpackage.acpl
    public final void g(arpp arppVar, afsx afsxVar) {
        j(arppVar, false, -1L, afsxVar, null);
    }

    @Override // defpackage.acpl
    public final void h(arpp arppVar, afsx afsxVar, long j, afsg afsgVar) {
        j(arppVar, true, j, afsxVar, afsgVar);
    }
}

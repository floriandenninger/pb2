package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqly implements aala {
    public static final aalb a = new aqlx();
    private final aqlz b;

    public aqly(aqlz aqlzVar) {
        this.b = aqlzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amxe it = ((amru) getFormatsModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(aqlk.a());
        }
        getSelectedFormatModel();
        amsvVar.j(aqlk.a());
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
        return new aqlw(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aqly) && this.b.equals(((aqly) obj).b);
    }

    public aqma getDismissState() {
        aqma b = aqma.b(this.b.g);
        return b == null ? aqma.DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN : b;
    }

    public List getFormats() {
        return this.b.d;
    }

    public List getFormatsModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            amrpVar.h(aqlk.b((aqll) it.next()).o());
        }
        return amrpVar.g();
    }

    public Boolean getRememberSetting() {
        return Boolean.valueOf(this.b.f);
    }

    public aqll getSelectedFormat() {
        aqll aqllVar = this.b.e;
        return aqllVar == null ? aqll.a : aqllVar;
    }

    public aqlk getSelectedFormatModel() {
        aqll aqllVar = this.b.e;
        if (aqllVar == null) {
            aqllVar = aqll.a;
        }
        return aqlk.b(aqllVar).o();
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DownloadQualityPickerEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
